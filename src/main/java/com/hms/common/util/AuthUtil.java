/**
 *
 */
package com.hms.common.util;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 用户公共类
 */
public class AuthUtil {

    /**
     * 获取用户信息
     *
     * @param request
     * @return
     */
    public static String getCurrentAccountId(HttpServletRequest request) throws Exception {
        String token = AuthUtil.getToken(request);
        String accountId = "";
        return accountId;
    }

    /**
     * 获取toke
     *
     * @param request
     * @return
     * @throws Exception
     */
    public static String getToken(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (null == session) {
            return null;
        }
        String token = session.getId();
        return token;
    }


}