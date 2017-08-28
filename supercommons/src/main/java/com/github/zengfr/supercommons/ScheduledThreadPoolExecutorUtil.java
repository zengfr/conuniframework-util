package com.zengfr.supercommons;
import com.google.common.util.concurrent.MoreExecutors;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ScheduledThreadPoolExecutorUtil{ 
public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
return MoreExecutors.getExitingScheduledExecutorService(p0,p1,p2);
}
public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor p0){
return MoreExecutors.getExitingScheduledExecutorService(p0);
}
}
