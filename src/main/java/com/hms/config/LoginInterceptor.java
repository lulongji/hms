package com.hms.config;

import com.hms.common.Constants;
import com.hms.common.cache.ICacheManager;
import com.hms.common.util.AuthUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class LoginInterceptor implements HandlerInterceptor {


    @Autowired
    private ICacheManager cacheManager;


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS");
        httpServletResponse.setHeader("Access-Control-Max-Age", "86400");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "*");
        // 如果是OPTIONS则结束请求
        if (HttpMethod.OPTIONS.toString().equals(httpServletRequest.getMethod())) {
            httpServletResponse.setStatus(HttpStatus.NO_CONTENT.value());
            return false;
        }
        String path = httpServletRequest.getServletPath();
        if (!path.matches(Constants.NO_INTERCEPTOR_PATH)) {
            String username = AuthUtil.getToken(httpServletRequest);
            Object token = cacheManager.getCacheDataByKey(Constants.userCache + username);
            if (token != null) {
                return true;
            } else {
                httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + Constants.LOGIN);
                return false;
            }
        } else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}