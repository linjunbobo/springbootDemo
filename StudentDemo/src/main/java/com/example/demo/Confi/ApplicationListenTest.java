package com.example.demo.Confi;


import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/1/8 19:22
 */
public class ApplicationListenTest implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationStartingEvent){
            System.out.println("ApplicationStarting");
            return;
        }
        //确定springboot应用使用的Environment且context创建之前发送这个事件
        if (event instanceof ApplicationEnvironmentPreparedEvent){
            System.out.println("ApplicationEnvironmentPrepared");
            return;
        }
        //context已经创建且没有refresh发送个事件
        if (event instanceof ApplicationPreparedEvent){
            System.out.println("ApplicationPrepared");
            return;
        }
        //context已经refresh且application and command-line runners（如果有） 调用之前发送这个事件
        if (event instanceof ApplicationStartedEvent){
            System.out.println("ApplicationStarted");
            return;
        }
        //application and command-line runners （如果有）执行完后发送这个事件，此时应用已经启动完毕
        if (event instanceof ApplicationReadyEvent){
            ApplicationContext context = ((ApplicationReadyEvent) event).getApplicationContext();
          //  SchedulerQuartzJob1 initService = context.getBean(SchedulerQuartzJob1.class);
            //initService.before();
            System.out.println("hello");
            return;
        }
        //应用启动失败后产生这个事件
        if (event instanceof ApplicationFailedEvent){
            System.out.println("ApplicationFailed");
            return;
        }
    }
}
