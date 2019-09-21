package com.cc.springRead.top.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.springRead.entity.T_book;
import com.cc.springRead.entity.T_list;

import java.util.List;

/**
 * <p>
 * 榜单表 Mapper 接口
 * </p>
 *
 * @author lyj
 * @since 2019-09-21
 */
public interface T_listDao extends BaseMapper<T_list> {

    int addLooks(int bid);

    List<T_book> selectTotalTopBooks();

    List<T_book> selectWeekTopBooks();

    List<T_book> selectMonthTopBooks();

    int clearMonthLooks();

    int clearWeekLooks();

}
