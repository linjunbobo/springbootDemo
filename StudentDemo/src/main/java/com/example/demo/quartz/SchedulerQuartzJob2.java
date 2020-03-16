package com.example.demo.quartz;

import com.example.demo.Confi.SpringContextUtil;
import org.quartz.*;
import org.springframework.stereotype.Component;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/1/6 10:42
 */
@Component
public class SchedulerQuartzJob2 implements Job {
//    @Autowired
//    private QuartzSchedulerTest quartzScheduler ;
//    @Autowired
//    private Scheduler scheduler;
//    @Autowired
//    private ServiceTest serviceTest;

   // private  static  SchedulerQuartzJob2 schedulerQuartzJob2;

//    @PostConstruct
//    public  void init(){
//        schedulerQuartzJob2 = this;
//        schedulerQuartzJob2.quartzScheduler = this.quartzScheduler;
//    }
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("任务2");

        try {
        String job = "job1";
        String group = "group1";
        String time = "0/10 * * * * ?";
        String job2 = "job2";
        String group2 = "group2";

        QuartzSchedulerTest quartzScheduler =(QuartzSchedulerTest) SpringContextUtil.getBean("quartzSchedulerTest");

        String timess = quartzScheduler.getTime(job2, group2);
        System.out.println("cron表达式"+timess);
        quartzScheduler.modifyJob(job, group, time);
        quartzScheduler.modifyJob(job2, group2, time);
        String times = quartzScheduler.getTime(job2, group2);
        System.out.println("cron表达式"+times);
        String[] ss = times.split(" ");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }


}
