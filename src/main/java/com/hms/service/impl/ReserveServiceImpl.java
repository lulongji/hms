package com.hms.service.impl;

import com.hms.dao.ReserveDao;
import com.hms.model.Reserve;
import com.hms.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReserveServiceImpl implements ReserveService {


    @Autowired
    private ReserveDao reserveDao;

    @Override
    public void add(Reserve reserve) throws Exception {
        reserveDao.add(reserve);
    }

    @Override
    public void update(Reserve reserve) throws Exception {
        reserveDao.update(reserve);
    }

    @Override
    public void delete(Reserve reserve) throws Exception {
        reserveDao.delete(reserve);
    }

    @Override
    public Reserve get(Reserve reserve) throws Exception {
        return reserveDao.get(reserve);
    }


    @Override
    public List<Reserve> getReserveList(Reserve reserve) throws Exception {
        return reserveDao.getReserveList(reserve);
    }
}
