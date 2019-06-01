package com.hms.dao;


import com.hms.model.Room;

import java.util.List;

public interface RoomDao {


    void add(Room room) throws Exception;

    void update(Room room) throws Exception;

    void delete(Room room) throws Exception;

    Room get(Room room) throws Exception;

    List<Room> getRoomList(Room room) throws Exception;

}
