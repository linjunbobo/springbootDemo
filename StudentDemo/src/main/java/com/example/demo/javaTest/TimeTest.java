package com.example.demo.javaTest;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/2/27 16:12
 */
public class TimeTest {
    public static void main(String[] args) {
        //获取当前时间

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(LocalTime.now());
         //格式化时间
        String todat ="20190102";
        LocalDate todayParse = LocalDate.parse(todat, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(todayParse);
        //获取日期和时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime+"   "+ new Date());

        Map<String,String> map = new HashMap<>();


    }
}
