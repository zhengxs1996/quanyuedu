package com.cc.springRead.top.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.cc.springRead.entity.T_list;
import com.quanyd.common.vo.R;

import java.util.List;

/**
 * <p>
 * 榜单表 服务类
 * </p>
 *
 * @author lyj
 * @since 2019-09-21
 */
public interface T_listService extends IService<T_list> {
    R addLooks(int bid);

    R selectTotalTopBooks();

    R selectWeekTopBooks();

    R selectMonthTopBooks();

    R clearMonthLooks();

    R clearWeekLooks();
}
