package com.example.demo.quartz;

import org.quartz.*;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/1/6 10:42
 */
public class SchedulerQuartzJob1 implements Job
{

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        System.out.println("开始任务一："+System.currentTimeMillis());
        // TODO 业务


    }

    public void before(){
        System.out.println("业务代码："+System.currentTimeMillis());
    }



}
