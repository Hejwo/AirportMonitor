package org.hejwo.airportMonitor.airTrafficBroadcaster.jobs;

import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author : Hejwo
 * @since : 2015-11-22.
 */
@Slf4j
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class PlaneJob extends QuartzJobBean {

    protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
        log.info("Job executed.");
    }
}