package com.example.demo.until;

import cn.hutool.http.useragent.UserAgent;
import cn.hutool.http.useragent.UserAgentUtil;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 获取用户浏览器请求头
 *
 * @author wanyifan
 * @date 2019/12/18 16:27
 */
public class BrowserUtil {

    public static String getBrowser() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes != null ? attributes.getRequest() : null;
        if (request != null) {
            UserAgent parse = UserAgentUtil.parse(request.getHeader("User-Agent"));
            return parse.getBrowser().toString();
        }
        return "unknown";
    }
    public static String gerconnection() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes != null ? attributes.getRequest() : null;
        if (request != null) {
            UserAgent parse = UserAgentUtil.parse(request.getHeader("Connection"));
            return request.getHeader("Connection");
        }
        return "unknown";
    }
}
