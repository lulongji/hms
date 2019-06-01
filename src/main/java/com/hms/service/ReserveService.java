package com.hms.service;


import com.hms.model.Reserve;

import java.util.List;

public interface ReserveService {


    /**
     * 添加
     *
     * @param reserve
     * @return
     * @author Administrator
     */
    void add(Reserve reserve) throws Exception;


    /**
     * 修改
     *
     * @param reserve
     * @throws Exception
     */
    void update(Reserve reserve) throws Exception;

    /**
     * 根据ID删除数据
     *
     * @param reserve
     * @return
     * @author Administrator
     */
    void delete(Reserve reserve) throws Exception;

    /**
     * 根据ID查询单个数据
     *
     * @param reserve
     * @return
     * @author Administrator
     */
    Reserve get(Reserve reserve) throws Exception;

    /**
     * 查询所有数据
     *
     * @param reserve
     * @return
     * @author Administrator
     */
    List<Reserve> getReserveList(Reserve reserve) throws Exception;

}
