package com.hms.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 预订系统
 */
@RestController
@RequestMapping("/hms")
public class HmsController {

    private static final Logger logger = LoggerFactory.getLogger(HmsController.class);

    public String BookRoom() {
        return "";
    }


}
