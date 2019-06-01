package com.hms.service;


import com.hms.model.Room;

import java.util.List;

public interface RoomService {


    /**
     * 添加
     *
     * @param room
     * @return
     * @author Administrator
     */
    void add(Room room) throws Exception;


    /**
     * 修改
     *
     * @param room
     * @throws Exception
     */
    void update(Room room) throws Exception;

    /**
     * 根据ID删除数据
     *
     * @param room
     * @return
     * @author Administrator
     */
    void delete(Room room) throws Exception;

    /**
     * 根据ID查询单个数据
     *
     * @param room
     * @return
     * @author Administrator
     */
    Room get(Room room) throws Exception;

    /**
     * 查询所有数据
     *
     * @param room
     * @return
     * @author Administrator
     */
    List<Room> getRoomList(Room room) throws Exception;

}
