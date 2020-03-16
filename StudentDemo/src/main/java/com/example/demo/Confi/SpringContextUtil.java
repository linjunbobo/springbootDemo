package com.example.demo.Confi;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Locale;

/**
 * @Author:linjunbo
 * @Description: 解决been注入为null的问题
 * @Date: 2020/1/10 8:47
 */


public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    //@SuppressWarnings("static-access")
    public void setApplicationContext(ApplicationContext contex)
            throws BeansException {
        // TODO Auto-generated method stub
        this.context = contex;
    }

    public static Object getBean(String beanName) {
        return context.getBean(beanName);
    }

    public static String getMessage(String key) {
        return context.getMessage(key, null, Locale.getDefault());

    }
}
