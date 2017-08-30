package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ScheduledExecutorServiceUtil{ 
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.withTimeout(com.google.common.util.concurrent.ListenableFuture<V>,long,java.util.concurrent.TimeUnit,java.util.concurrent.ScheduledExecutorService)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> p0,long p1,java.util.concurrent.TimeUnit p2,java.util.concurrent.ScheduledExecutorService p3){
	return com.google.common.util.concurrent.Futures.withTimeout(p0,p1,p2,p3);
}
/**
*public static com.google.common.util.concurrent.ListeningScheduledExecutorService com.google.common.util.concurrent.MoreExecutors.listeningDecorator(java.util.concurrent.ScheduledExecutorService)
*/ 
public static com.google.common.util.concurrent.ListeningScheduledExecutorService listeningDecorator(java.util.concurrent.ScheduledExecutorService p0){
	return com.google.common.util.concurrent.MoreExecutors.listeningDecorator(p0);
}
/**
*public static java.util.concurrent.ScheduledExecutorService com.google.common.util.concurrent.MoreExecutors.getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor,long,java.util.concurrent.TimeUnit)
*/ 
public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.MoreExecutors.getExitingScheduledExecutorService(p0,p1,p2);
}
/**
*public static java.util.concurrent.ScheduledExecutorService com.google.common.util.concurrent.MoreExecutors.getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor)
*/ 
public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor p0){
	return com.google.common.util.concurrent.MoreExecutors.getExitingScheduledExecutorService(p0);
}
}
