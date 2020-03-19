package com.example.demo.Service.Impl;


import com.example.demo.Service.ServiceTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.TimerTask;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/1/10 8:41
 */
@Service
public class ServiceTestImpl implements ServiceTest {
    private static final Logger log = LogManager.getLogger(ServiceTestImpl.class);
    @Override
    public String serviceTest() {
        log.info("你好");
        System.out.println("hello");
        return null ;
    }
}
