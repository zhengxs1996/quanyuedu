package com.cc.springRead.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * @ClassName: T_collect
 * @Description: TODO
 * @author: zhengxs
 * @date: 2019/9/21  15:40
 */
@Data
public class T_collect extends Model<T_collect> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 书籍ID
     */
    private Integer uid;

    /**
     * 书籍ID
     */
    private Integer bid;
}
