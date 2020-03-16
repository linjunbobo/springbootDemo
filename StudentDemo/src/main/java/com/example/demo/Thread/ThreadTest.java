package com.example.demo.Thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/1/8 19:49
 */
public class  ThreadTest {
    private static Integer i = 0;

    public static synchronized  int  itest(){
         int s = ++ThreadTest.i;
        System.out.println(s);
        return s;

    }
    public static void main(String[] args) {
        ExecutorService fix = Executors.newCachedThreadPool();

        Map<String, String > map = new HashMap<>();
        for (int j = 0 ;  j<10;j++ ){
        fix.execute(new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadTest.itest();
                System.out.println(Thread.currentThread().getName() +" " +ThreadTest.i );


            }
        }));
        }

    }
}
