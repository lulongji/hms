package com.hms.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 酒店首页
 */
@Controller
@RequestMapping("/hms")
public class HmsController {

    private static final Logger logger = LoggerFactory.getLogger(HmsController.class);

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "/index";
    }


}
