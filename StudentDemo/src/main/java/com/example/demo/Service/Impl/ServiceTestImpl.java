package com.example.demo.Service.Impl;


import com.example.demo.Service.ServiceTest;
import org.springframework.stereotype.Service;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/1/10 8:41
 */
@Service
public class ServiceTestImpl implements ServiceTest {
    @Override
    public String serviceTest() {
        System.out.println("hello");
        return null ;
    }
}
