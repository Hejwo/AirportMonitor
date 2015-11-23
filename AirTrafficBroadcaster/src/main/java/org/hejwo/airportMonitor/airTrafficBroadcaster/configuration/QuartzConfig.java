package org.hejwo.airportMonitor.airTrafficBroadcaster.configuration;

import lombok.extern.slf4j.Slf4j;
import org.hejwo.airportMonitor.airTrafficBroadcaster.jobs.PlaneJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

/**
 * @author : Hejwo
 * @since : 2015-11-22.
 */
@Configuration
@Slf4j
public class QuartzConfig {

    @Bean
    public JobDetailFactoryBean planeJobFactory(){
        log.info("planeJobFactory - start");
        JobDetailFactoryBean planeJobFactory = new JobDetailFactoryBean();
        planeJobFactory.setJobClass(PlaneJob.class);
        planeJobFactory.setGroup("planeJobs");
        planeJobFactory.setName("plane1Job");
        return planeJobFactory;
    }

    @Bean
    public SimpleTriggerFactoryBean planeJobSimpleTriggerFactory(JobDetailFactoryBean planeJobFactory) {
        log.info("planeJobSimpleTriggerFactory - start");
        SimpleTriggerFactoryBean planeJobSimpleTriggerFactory = new SimpleTriggerFactoryBean();
        planeJobSimpleTriggerFactory.setJobDetail(planeJobFactory.getObject());

        planeJobSimpleTriggerFactory.setStartDelay(10000); // 10 sec
        planeJobSimpleTriggerFactory.setRepeatInterval(5000); // 5 sec

        return planeJobSimpleTriggerFactory;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(SimpleTriggerFactoryBean planeJobSimpleTriggerFactory) {
        log.info("schedulerFactoryBean - start");
        SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
        scheduler.setTriggers(planeJobSimpleTriggerFactory.getObject());

        return scheduler;
    }



}