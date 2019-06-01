package com.hms.dao;

import com.hms.model.OrderRoom;
import com.hms.model.Reserve;

import java.util.List;

public interface ReserveDao {


    void add(Reserve reserve) throws Exception;

    void update(Reserve reserve) throws Exception;

    void delete(Reserve reserve) throws Exception;

    Reserve get(Reserve reserve) throws Exception;

    List<Reserve> getReserveList(Reserve reserve) throws Exception;

    List<OrderRoom> getOrderRoomList(OrderRoom orderRoom) throws Exception;


}
