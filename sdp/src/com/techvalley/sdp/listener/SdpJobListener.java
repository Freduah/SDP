package com.techvalley.sdp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.techvalley.sdp.job.Sdp1880Job;
import com.techvalley.sdp.job.Sdp1881Job;
import com.techvalley.sdp.job.Sdp1882Job;
import com.techvalley.sdp.job.Sdp1883Job;
import com.techvalley.sdp.job.Sdp1884Job;
import com.techvalley.sdp.job.Sdp1885Job;
import com.techvalley.sdp.job.SdpHelpJob;

public class SdpJobListener implements ServletContextListener {

	 Scheduler scheduler1880 = null;
	 Scheduler scheduler1881 = null;
	 Scheduler scheduler1882 = null;
	 Scheduler scheduler1883 = null;
	 Scheduler scheduler1884 = null;
	 Scheduler scheduler1885 = null;
	 Scheduler schedulerHelp = null;
	@Override
	public void contextDestroyed(ServletContextEvent servletContext) {
		
		System.out.println("Context Destroyed");
        try 
        {
        	scheduler1880.shutdown();
        	scheduler1881.shutdown();
        	scheduler1882.shutdown();
        	scheduler1883.shutdown();
        	scheduler1884.shutdown();
        	scheduler1885.shutdown();
        	schedulerHelp.shutdown();
        	
        } 
        catch (SchedulerException e) 
        {
                e.printStackTrace();
        }
		
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContext) {
		
		try {
            // Setup the Job class and the Job group
                      
            JobDetail Sdp1880SenderJob = JobBuilder.newJob(Sdp1880Job.class)
            		.withIdentity("Sdp1880CronJob", "Group").build();
            
            JobDetail Sdp1881SenderJob = JobBuilder.newJob(Sdp1881Job.class)
            		.withIdentity("Sdp1881CronJob", "Group").build();

            JobDetail Sdp1882SenderJob = JobBuilder.newJob(Sdp1882Job.class)
            		.withIdentity("Sdp1882CronJob", "Group").build();

            JobDetail Sdp1883SenderJob = JobBuilder.newJob(Sdp1883Job.class)
            		.withIdentity("Sdp1883CronJob", "Group").build();
            
            JobDetail Sdp1884SenderJob = JobBuilder.newJob(Sdp1884Job.class)
            		.withIdentity("Sdp1884CronJob", "Group").build();

            JobDetail Sdp1885SenderJob = JobBuilder.newJob(Sdp1885Job.class)
            		.withIdentity("Sdp1885CronJob", "Group").build();
            
            JobDetail SDPHelpSenderJob = JobBuilder.newJob(SdpHelpJob.class)
            		.withIdentity("SdpHelpCronJob", "Group").build();
            
            
            
            // Create a Trigger that fires every 5 minutes.            
            Trigger Sdp1880JobTrigger = TriggerBuilder.newTrigger()
            		.withIdentity("Sdp1880CronJobTrigger", "Group")
            		.withSchedule(CronScheduleBuilder.cronSchedule("0/40 * * * * ?"))
            		.build();
            
            Trigger Sdp1881JobTrigger = TriggerBuilder.newTrigger()
            		.withIdentity("Sdp1881CronJobTrigger", "Group")
            		.withSchedule(CronScheduleBuilder.cronSchedule("0/40 * * * * ?"))
            		.build();
            
            Trigger Sdp1882JobTrigger = TriggerBuilder.newTrigger()
            		.withIdentity("Sdp1882CronJobTrigger", "Group")
            		.withSchedule(CronScheduleBuilder.cronSchedule("0/40 * * * * ?"))
            		.build();
            
            Trigger Sdp1883JobTrigger = TriggerBuilder.newTrigger()
            		.withIdentity("Sdp1883CronJobTrigger", "Group")
            		.withSchedule(CronScheduleBuilder.cronSchedule("0/40 * * * * ?"))
            		.build();
            
            Trigger Sdp1884JobTrigger = TriggerBuilder.newTrigger()
            		.withIdentity("Sdp1884CronJobTrigger", "Group")
            		.withSchedule(CronScheduleBuilder.cronSchedule("0/40 * * * * ?"))
            		.build();
            
            Trigger Sdp1885JobTrigger = TriggerBuilder.newTrigger()
            		.withIdentity("Sdp1885CronJobTrigger", "Group")
            		.withSchedule(CronScheduleBuilder.cronSchedule("0/40 * * * * ?"))
            		.build();
            
            Trigger SdpHelpJobTrigger = TriggerBuilder.newTrigger()
            		.withIdentity("SdpHelpCronJobTrigger", "Group")
            		.withSchedule(CronScheduleBuilder.cronSchedule("0/40 * * * * ?"))
            		.build();

            // Setup the Job and Trigger with Scheduler & schedule jobs
            scheduler1880 = new StdSchedulerFactory().getScheduler();
            scheduler1880.start();             
            scheduler1880.scheduleJob(Sdp1880SenderJob, Sdp1880JobTrigger);
            
            scheduler1881 = new StdSchedulerFactory().getScheduler();
            scheduler1881.start(); 
            scheduler1881.scheduleJob(Sdp1881SenderJob, Sdp1881JobTrigger);
            
            scheduler1882 = new StdSchedulerFactory().getScheduler();
            scheduler1882.start(); 
            scheduler1882.scheduleJob(Sdp1882SenderJob, Sdp1882JobTrigger);
            
            scheduler1883 = new StdSchedulerFactory().getScheduler();
            scheduler1883.start(); 
            scheduler1883.scheduleJob(Sdp1883SenderJob, Sdp1883JobTrigger);
            
            scheduler1884 = new StdSchedulerFactory().getScheduler();
            scheduler1884.start(); 
            scheduler1884.scheduleJob(Sdp1884SenderJob, Sdp1884JobTrigger);
            
            scheduler1885 = new StdSchedulerFactory().getScheduler();
            scheduler1885.start(); 
            scheduler1885.scheduleJob(Sdp1885SenderJob, Sdp1885JobTrigger);
            
            schedulerHelp = new StdSchedulerFactory().getScheduler();
            schedulerHelp.start(); 
            schedulerHelp.scheduleJob(SDPHelpSenderJob, SdpHelpJobTrigger);          
            
    }
    catch (Exception e) {
            e.printStackTrace();
    }
		
	}

}
