package com.hms.controller;


import com.hms.common.util.AuthUtil;
import com.hms.common.util.Result;
import com.hms.model.OrderRoom;
import com.hms.model.Reserve;
import com.hms.service.ReserveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 订单处理
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);


    @Autowired
    private ReserveService reserveService;

    /**
     * 订单处理
     *
     * @param reserve
     * @return
     */
    @RequestMapping("/bookRoom")
    public Result bookRoom(Reserve reserve) {
        Result result = Result.success();
        try {
            reserveService.add(reserve);
        } catch (Exception e) {
            result = Result.failure();
            logger.error(e.toString(), e);
        }
        return result;
    }

    /**
     * 我的订单
     *
     * @return
     */
    @RequestMapping(value = "/myorder", produces = "application/json; charset=utf-8")
    public ModelAndView myorder(HttpServletRequest request, OrderRoom orderRoom) {
        ModelAndView modelAndView = new ModelAndView("myorder");
        try {
            List<OrderRoom> orderRoomList = reserveService.getOrderRoomList(orderRoom);
            modelAndView.addObject("orderRoomList", orderRoomList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    /**
     * 订单修改
     *
     * @return
     */
    @RequestMapping("/updateMyorder")
    public Result updateMyorder(Reserve reserve) {
        Result result = Result.success();
        try {
            reserveService.update(reserve);
        } catch (Exception e) {
            result = Result.failure();
            logger.error(e.toString(), e);
        }
        return result;
    }

    /**
     * 订单删除
     *
     * @return
     */
    @RequestMapping("/delMyorder")
    public Result delMyorder(Reserve reserve) {
        Result result = Result.success();
        try {
            reserveService.delete(reserve);
        } catch (Exception e) {
            result = Result.failure();
            logger.error(e.toString(), e);
        }
        return result;
    }

}
