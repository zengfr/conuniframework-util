package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ScheduledThreadPoolExecutorUtil{ 
/**
*public static java.util.concurrent.ScheduledExecutorService com.google.common.util.concurrent.MoreExecutors.getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor)
*/ 
public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor p0){
	return com.google.common.util.concurrent.MoreExecutors.getExitingScheduledExecutorService(p0);
}
/**
*public static java.util.concurrent.ScheduledExecutorService com.google.common.util.concurrent.MoreExecutors.getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor,long,java.util.concurrent.TimeUnit)
*/ 
public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.MoreExecutors.getExitingScheduledExecutorService(p0,p1,p2);
}
}
