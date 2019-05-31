package com.hms.common;

/**
 * 常量
 */
public interface Constants {

    /**
     * 登陆过滤 不对匹配该值的访问路径拦截（正则）
     */
    String NO_INTERCEPTOR_PATH = ".*/((login)|(logout)|(res)|(upload)|(redis)|(html)|(getCaseSbDeatilPc)|(getCaseIcuDeatilPc)|(getCaseGbDeatilPc)|(getCaseSsDeatilPc)|(getCaseItpDeatilPc)|(getCaseZqdDeatilPc)|(getCaseZzhDeatilPc)|(getCaseBxbDeatilPc)|(changePasswordPage)|(changePassword)|(imagFd)).*";


    /**
     * 登录地址
     */
    String LOGIN = "/login";
}
