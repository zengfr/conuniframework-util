package com.zengfr.supercommons;
import com.google.common.util.concurrent.AbstractScheduledService.Scheduler;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SchedulerUtil{ 
public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedDelaySchedule(long p0,long p1,java.util.concurrent.TimeUnit p2){
return Scheduler.newFixedDelaySchedule(p0,p1,p2);
}
public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedRateSchedule(long p0,long p1,java.util.concurrent.TimeUnit p2){
return Scheduler.newFixedRateSchedule(p0,p1,p2);
}
}
