package com.hms.service.impl;


import com.hms.dao.RoomDao;
import com.hms.model.Room;
import com.hms.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDao roomDao;

    @Override
    public void add(Room room) throws Exception {
        roomDao.add(room);
    }

    @Override
    public void update(Room room) throws Exception {
        roomDao.update(room);
    }

    @Override
    public void delete(Room room) throws Exception {
        roomDao.delete(room);
    }

    @Override
    public Room get(Room room) throws Exception {
        return roomDao.get(room);
    }

    @Override
    public List<Room> getRoomList(Room room) throws Exception {
        return roomDao.getRoomList(room);
    }
}
