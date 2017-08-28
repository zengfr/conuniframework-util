package com.zengfr.supercommons;
import com.google.common.base.Suppliers;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.AbstractScheduledService.Scheduler;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.RateLimiter;
import com.google.common.util.concurrent.Uninterruptibles;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TimeUnitUtil{ 
public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T> p0,long p1,java.util.concurrent.TimeUnit p2){
return Suppliers.memoizeWithExpiration(p0,p1,p2);
}
public static <E> int drainUninterruptibly(java.util.concurrent.BlockingQueue<E> p0,java.util.Collection<? super E> p1,int p2,long p3,java.util.concurrent.TimeUnit p4){
return Queues.drainUninterruptibly(p0,p1,p2,p3,p4);
}
public static <E> int drain(java.util.concurrent.BlockingQueue<E> p0,java.util.Collection<? super E> p1,int p2,long p3,java.util.concurrent.TimeUnit p4) throws java.lang.InterruptedException{
return Queues.drain(p0,p1,p2,p3,p4);
}
public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedDelaySchedule(long p0,long p1,java.util.concurrent.TimeUnit p2){
return Scheduler.newFixedDelaySchedule(p0,p1,p2);
}
public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedRateSchedule(long p0,long p1,java.util.concurrent.TimeUnit p2){
return Scheduler.newFixedRateSchedule(p0,p1,p2);
}
public static <V,X extends java.lang.Exception > V getChecked(java.util.concurrent.Future<V> p0,java.lang.Class<X> p1,long p2,java.util.concurrent.TimeUnit p3) throws X{
return Futures.getChecked(p0,p1,p2,p3);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> p0,long p1,java.util.concurrent.TimeUnit p2,java.util.concurrent.ScheduledExecutorService p3){
return Futures.withTimeout(p0,p1,p2,p3);
}
public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
return MoreExecutors.getExitingScheduledExecutorService(p0,p1,p2);
}
public static void addDelayedShutdownHook(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2){
 MoreExecutors.addDelayedShutdownHook(p0,p1,p2);
}
public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
return MoreExecutors.getExitingExecutorService(p0,p1,p2);
}
public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2){
return MoreExecutors.shutdownAndAwaitTermination(p0,p1,p2);
}
public static com.google.common.util.concurrent.RateLimiter create(double p0,long p1,java.util.concurrent.TimeUnit p2){
return RateLimiter.create(p0,p1,p2);
}
public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch p0,long p1,java.util.concurrent.TimeUnit p2){
return Uninterruptibles.awaitUninterruptibly(p0,p1,p2);
}
public static <V> V getUninterruptibly(java.util.concurrent.Future<V> p0,long p1,java.util.concurrent.TimeUnit p2) throws java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException{
return Uninterruptibles.getUninterruptibly(p0,p1,p2);
}
public static void sleepUninterruptibly(long p0,java.util.concurrent.TimeUnit p1){
 Uninterruptibles.sleepUninterruptibly(p0,p1);
}
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,int p1,long p2,java.util.concurrent.TimeUnit p3){
return Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2,p3);
}
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,long p1,java.util.concurrent.TimeUnit p2){
return Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2);
}
public static void joinUninterruptibly(java.lang.Thread p0,long p1,java.util.concurrent.TimeUnit p2){
 Uninterruptibles.joinUninterruptibly(p0,p1,p2);
}
}
