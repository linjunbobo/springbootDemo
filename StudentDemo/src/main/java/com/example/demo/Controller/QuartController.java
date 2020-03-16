package com.example.demo.Controller;


import com.example.demo.quartz.QuartzSchedulerTest;
import com.example.demo.until.BrowserUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2019/11/20 20:12
 */

@Controller
public class QuartController {
   private static final Logger log = LogManager.getLogger(QuartController.class);


    @Autowired
    private QuartzSchedulerTest quartzScheduler;



    @RequestMapping("/start")
    @ResponseBody
    public String startQuartzJob() throws SchedulerException {
        quartzScheduler.startJob();
        String ss = BrowserUtil.getBrowser();
        String cc = BrowserUtil.gerconnection();
      return "hello";
    }
    @RequestMapping("/update")
    @ResponseBody
    public String update() throws SchedulerException {
        String job ="job2";
        String group = "group2";
        String time = "0/1 * * * * ?";
        quartzScheduler.modifyJob(job,group,time);
        return "hello";
    }

    @RequestMapping("/getQuart")
    @ResponseBody
    public String getinfo() throws SchedulerException {
        String job ="job1";
        String group = "group1";
        String time = "0/10 1 2 3 * ?";
        quartzScheduler.modifyJob(job,group,time);
        String times = quartzScheduler.getTime(job, group);
        String[] ss = times.split(" ");



        return     quartzScheduler.getTime(job,group);
    }



}
