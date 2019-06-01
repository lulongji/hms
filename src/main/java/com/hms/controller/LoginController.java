package com.hms.controller;


import com.hms.common.Constants;
import com.hms.common.cache.ICacheManager;
import com.hms.common.util.Result;
import com.hms.model.User;
import com.hms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


/**
 * 登陆
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    @Autowired
    private ICacheManager cacheManager;
    @Autowired
    private UserService userService;

    /**
     * 登陆页面
     *
     * @return
     */
    @RequestMapping(value = "/", produces = "application/json; charset=utf-8")
    public ModelAndView login() {
        return new ModelAndView("login");
    }


    /**
     * 登录验证
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/loginVerify")
    @ResponseBody
    public Result loginVerify(User user) {
        Result result = Result.failure();
        try {
            User userVal = userService.get(user);
            if (null != userVal) {
                cacheManager.putCache(Constants.userCache + userVal.getUsername(), userVal.getUsername(), 60 * 60 * 1000);
                result = Result.success();
            }
        } catch (Exception e) {
            result = Result.failure();
            logger.error(e.toString(), e);
        }
        return result;
    }

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/logout")
    public Result logout(HttpServletRequest request) {
        Result result = Result.failure();
        try {
            if (request.getSession(false) != null)
                request.getSession(false).invalidate();
            result = Result.success();
        } catch (Exception e) {
            logger.error(e.toString(), e);
        }
        return result;
    }


}
