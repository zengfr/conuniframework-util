package com.github.zengfr.supercommons;

import com.google.common.util.concurrent.AbstractScheduledService.Scheduler;

/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TimeUnitUtil{
/**
*public static <T> com.google.common.base.Supplier<T> com.google.common.base.Suppliers.memoizeWithExpiration(com.google.common.base.Supplier<T>,long,java.util.concurrent.TimeUnit)
*/
public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T> p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.base.Suppliers.memoizeWithExpiration(p0,p1,p2);
}
/**
*public static <E> int com.google.common.collect.Queues.drainUninterruptibly(java.util.concurrent.BlockingQueue<E>,java.util.Collection<? super E>,int,long,java.util.concurrent.TimeUnit)
*/
public static <E> int drainUninterruptibly(java.util.concurrent.BlockingQueue<E> p0,java.util.Collection<? super E> p1,int p2,long p3,java.util.concurrent.TimeUnit p4){
	return com.google.common.collect.Queues.drainUninterruptibly(p0,p1,p2,p3,p4);
}
/**
*public static <E> int com.google.common.collect.Queues.drain(java.util.concurrent.BlockingQueue<E>,java.util.Collection<? super E>,int,long,java.util.concurrent.TimeUnit) throws java.lang.InterruptedException
*/
public static <E> int drain(java.util.concurrent.BlockingQueue<E> p0,java.util.Collection<? super E> p1,int p2,long p3,java.util.concurrent.TimeUnit p4) throws java.lang.InterruptedException{
	return com.google.common.collect.Queues.drain(p0,p1,p2,p3,p4);
}
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
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.withTimeout(com.google.common.util.concurrent.ListenableFuture<V>,long,java.util.concurrent.TimeUnit,java.util.concurrent.ScheduledExecutorService)
*/
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> p0,long p1,java.util.concurrent.TimeUnit p2,java.util.concurrent.ScheduledExecutorService p3){
	return com.google.common.util.concurrent.Futures.withTimeout(p0,p1,p2,p3);
}
/**
*public static <V,X> V com.google.common.util.concurrent.Futures.getChecked(java.util.concurrent.Future<V>,java.lang.Class<X>,long,java.util.concurrent.TimeUnit) throws X
*/
public static <V,X extends java.lang.Exception > V getChecked(java.util.concurrent.Future<V> p0,java.lang.Class<X> p1,long p2,java.util.concurrent.TimeUnit p3) throws X{
	return com.google.common.util.concurrent.Futures.getChecked(p0,p1,p2,p3);
}
/**
*public static void com.google.common.util.concurrent.MoreExecutors.addDelayedShutdownHook(java.util.concurrent.ExecutorService,long,java.util.concurrent.TimeUnit)
*/
public static void addDelayedShutdownHook(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2){
	 com.google.common.util.concurrent.MoreExecutors.addDelayedShutdownHook(p0,p1,p2);
}
/**
*public static boolean com.google.common.util.concurrent.MoreExecutors.shutdownAndAwaitTermination(java.util.concurrent.ExecutorService,long,java.util.concurrent.TimeUnit)
*/
public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.MoreExecutors.shutdownAndAwaitTermination(p0,p1,p2);
}
/**
*public static java.util.concurrent.ExecutorService com.google.common.util.concurrent.MoreExecutors.getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor,long,java.util.concurrent.TimeUnit)
*/
public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.MoreExecutors.getExitingExecutorService(p0,p1,p2);
}
/**
*public static java.util.concurrent.ScheduledExecutorService com.google.common.util.concurrent.MoreExecutors.getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor,long,java.util.concurrent.TimeUnit)
*/
public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.MoreExecutors.getExitingScheduledExecutorService(p0,p1,p2);
}
/**
*public static com.google.common.util.concurrent.RateLimiter com.google.common.util.concurrent.RateLimiter.create(double,long,java.util.concurrent.TimeUnit)
*/
public static com.google.common.util.concurrent.RateLimiter create(double p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.RateLimiter.create(p0,p1,p2);
}
/**
*public static boolean com.google.common.util.concurrent.Uninterruptibles.awaitUninterruptibly(java.util.concurrent.CountDownLatch,long,java.util.concurrent.TimeUnit)
*/
public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.Uninterruptibles.awaitUninterruptibly(p0,p1,p2);
}
/**
*public static <V> V com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(java.util.concurrent.Future<V>,long,java.util.concurrent.TimeUnit) throws java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException
*/
public static <V> V getUninterruptibly(java.util.concurrent.Future<V> p0,long p1,java.util.concurrent.TimeUnit p2) throws java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException{
	return com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(p0,p1,p2);
}
/**
*public static void com.google.common.util.concurrent.Uninterruptibles.joinUninterruptibly(java.lang.Thread,long,java.util.concurrent.TimeUnit)
*/
public static void joinUninterruptibly(java.lang.Thread p0,long p1,java.util.concurrent.TimeUnit p2){
	 com.google.common.util.concurrent.Uninterruptibles.joinUninterruptibly(p0,p1,p2);
}
/**
*public static boolean com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(java.util.concurrent.Semaphore,long,java.util.concurrent.TimeUnit)
*/
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2);
}
/**
*public static boolean com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(java.util.concurrent.Semaphore,int,long,java.util.concurrent.TimeUnit)
*/
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,int p1,long p2,java.util.concurrent.TimeUnit p3){
	return com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2,p3);
}
/**
*public static void com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly(long,java.util.concurrent.TimeUnit)
*/
public static void sleepUninterruptibly(long p0,java.util.concurrent.TimeUnit p1){
	 com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly(p0,p1);
}
}
