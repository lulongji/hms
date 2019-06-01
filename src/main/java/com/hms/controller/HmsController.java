package com.hms.controller;


import com.hms.common.cache.ICacheManager;
import com.hms.common.util.AuthUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 酒店首页
 */
@Controller
@RequestMapping("/hms")
public class HmsController {

    private static final Logger logger = LoggerFactory.getLogger(HmsController.class);


    @Autowired
    private ICacheManager cacheManager;

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
     * /**
     * 房间列表
     *
     * @return
     */
    @RequestMapping("/rooms")
    public String rooms() {
        return "/rooms";
    }

    /**
     * 留言信箱
     *
     * @return
     */
    @RequestMapping("/contact")
    public String contact() {
        return "/contact";
    }


}
