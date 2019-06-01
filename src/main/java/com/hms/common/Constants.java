package com.hms.common;

/**
 * 常量
 */
public interface Constants {

    /**
     * 登陆过滤 不对匹配该值的访问路径拦截（正则）
     */
    String NO_INTERCEPTOR_PATH = ".*/((hms)|(login)|(logout)|(res)|(css)|(static)|(html)|(index)|(admin)).*";


    /**
     * 登录地址
     */
    String LOGIN = "/login/";


    /**
     * 缓存
     **/
    String userCache = "user|";
}
