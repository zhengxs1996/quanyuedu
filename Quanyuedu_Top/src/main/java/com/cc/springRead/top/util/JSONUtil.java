package com.cc.springRead.top.util;

import com.alibaba.fastjson.JSON;
import com.cc.springRead.entity.T_book;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName JSONUtil
 * @Description TODO
 * @Author lyj
 * @Date 2019/9/21 11:15
 * @Version 1.0
 */
public class JSONUtil {

    /**
     * 将T_book的JSON字符串List解析成T_book的List
     * @param jsonlist JSON字符串List
     * @return T_book的List
     */
    public static List<T_book> parseJSONStringList(List<String> jsonlist) {
        List<T_book> list = new ArrayList<>();
        for (int i = 0; i < jsonlist.size(); i++) {
            list.add(JSON.parseObject(jsonlist.get(i), T_book.class));
        }
        return list;
    }
}
