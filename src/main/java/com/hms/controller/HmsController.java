package com.hms.controller;


import com.hms.common.cache.ICacheManager;
import com.hms.common.util.AuthUtil;
import com.hms.model.Room;
import com.hms.service.RoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;

/**
 * 酒店首页
 */
@Controller
@RequestMapping("/hms")
public class HmsController {

    private static final Logger logger = LoggerFactory.getLogger(HmsController.class);


    @Autowired
    private ICacheManager cacheManager;

    @Autowired
    private RoomService roomService;

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(value = "/index", produces = "application/json; charset=utf-8")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("index");
        String username = AuthUtil.getToken(request);
        if (username != null && !"".equals(username)) {
            modelAndView.addObject("username", username);
        }
        return modelAndView;
    }


    /**
     * 房间列表
     *
     * @return
     */
    @RequestMapping(value = "/rooms", produces = "application/json; charset=utf-8")
    public ModelAndView rooms(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("rooms");
        String username = AuthUtil.getToken(request);
        if (username != null && !"".equals(username)) {
            modelAndView.addObject("username", username);
        }
        try {
            Room room = new Room();
            room.setIsflag("1");
            List<Room> roomList = roomService.getRoomList(room);
            modelAndView.addObject("roomList", roomList);
            //modelAndView.addObject("nono", new Random().nextInt(6) + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    /**
     * 预定信息
     *
     * @return
     */
    @RequestMapping("/contact")
    public String contact() {
        return "/contact";
    }


}
