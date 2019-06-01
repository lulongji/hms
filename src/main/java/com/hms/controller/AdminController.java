package com.hms.controller;


import com.hms.common.Constants;
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
 * 后台管理
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private ICacheManager cacheManager;

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(value = "/index", produces = "application/json; charset=utf-8")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView modelAndView;
        String sessionid = AuthUtil.getToken(request);
        Object token = cacheManager.getCacheDataByKey(Constants.userCache + sessionid);
        if (token != null && token.toString().equals("admin")) {
            modelAndView = new ModelAndView("admin");
        } else {
            modelAndView = new ModelAndView("index");
        }
        return modelAndView;
    }


}
