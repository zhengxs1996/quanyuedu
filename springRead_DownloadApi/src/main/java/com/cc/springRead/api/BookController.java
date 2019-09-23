package com.cc.springRead.api;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.OSSObject;
import com.cc.springRead.entity.T_book;
import com.cc.springRead.oss.OssConfig;
import com.cc.springRead.service.BookService;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URL;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName BookController
 * @Description
 * @Author cc
 * @Date 2019/9/21 16:56
 * @Version 1.0
 */
@Api(value = "下载操作", tags = "下载操作")
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    // 下载书籍
    @ApiOperation(value = "下载书籍", notes = "下载书籍")
    @GetMapping("/springRead/download/downloadBook.do")
    public String downloadBook(@RequestParam("id") Integer id){
        return bookService.getDownloadUrl(id).getData();
    }

    // 上传
    @ApiOperation(value = "上传", notes = "上传")
    @PostMapping("/springRead/download/upload.do")
    public R upload(@RequestParam("file") MultipartFile file, T_book book) throws IOException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = OssConfig.endpoint;
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = OssConfig.accessKeyId;
        String accessKeySecret = OssConfig.accessKeySecret;

// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);


        // 设置OSS的objectName
        book.setObjectName(file.getName());
        R<T_book> r = bookService.addBook(book);
        String objectName = r.getMsg();


// 上传文件流。
        InputStream inputStream = file.getInputStream();
        ossClient.putObject(OssConfig.OBJECT_NAME, objectName, inputStream);

// 关闭OSSClient。
        ossClient.shutdown();

        Date date = new Date(new Date().getTime() + 3600L * 1000 * 2);
        URL url = ossClient.generatePresignedUrl(OssConfig.OBJECT_NAME, objectName, date);

        // 将url存到数据库
        T_book book1 = r.getData();
        book1.setTextUrl(url.toString());
        bookService.setBookUrl(book1);

        return RUtil.setOK("上传成功");
    }


}
