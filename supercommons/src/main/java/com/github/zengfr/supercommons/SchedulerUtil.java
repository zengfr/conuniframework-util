package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SchedulerUtil{ 
/**
*public static com.google.common.util.concurrent.AbstractScheduledService$Scheduler com.google.common.util.concurrent.AbstractScheduledService$Scheduler.newFixedDelaySchedule(long,long,java.util.concurrent.TimeUnit)
*/ 
public static Scheduler newFixedDelaySchedule(long p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.AbstractScheduledService.Scheduler.newFixedDelaySchedule(p0,p1,p2);
}
/**
*public static com.google.common.util.concurrent.AbstractScheduledService$Scheduler com.google.common.util.concurrent.AbstractScheduledService$Scheduler.newFixedRateSchedule(long,long,java.util.concurrent.TimeUnit)
*/ 
public static Scheduler newFixedRateSchedule(long p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.AbstractScheduledService.Scheduler.newFixedRateSchedule(p0,p1,p2);
}
}
