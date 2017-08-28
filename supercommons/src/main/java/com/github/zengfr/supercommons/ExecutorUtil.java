package com.github.zengfr.supercommons;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.RemovalListeners;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.JdkFutureAdapters;
import com.google.common.util.concurrent.MoreExecutors;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ExecutorUtil{ 
public static <K,V> com.google.common.cache.CacheLoader<K, V> asyncReloading(com.google.common.cache.CacheLoader<K, V> p0,java.util.concurrent.Executor p1){
return CacheLoader.asyncReloading(p0,p1);
}
public static <K,V> com.google.common.cache.RemovalListener<K, V> asynchronous(com.google.common.cache.RemovalListener<K, V> p0,java.util.concurrent.Executor p1){
return RemovalListeners.asynchronous(p0,p1);
}
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
return Futures.transform(p0,p1,p2);
}
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.base.Function<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
return Futures.transform(p0,p1,p2);
}
public static <V> void addCallback(com.google.common.util.concurrent.ListenableFuture<V> p0,com.google.common.util.concurrent.FutureCallback<? super V> p1,java.util.concurrent.Executor p2){
 Futures.addCallback(p0,p1,p2);
}
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.base.Function<? super X, ? extends V> p2,java.util.concurrent.Executor p3){
return Futures.catching(p0,p1,p2,p3);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withFallback(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,com.google.common.util.concurrent.FutureFallback<? extends V> p1,java.util.concurrent.Executor p2){
return Futures.withFallback(p0,p1,p2);
}
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
return Futures.transformAsync(p0,p1,p2);
}
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> p2,java.util.concurrent.Executor p3){
return Futures.catchingAsync(p0,p1,p2,p3);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> p0,java.util.concurrent.Executor p1){
return JdkFutureAdapters.listenInPoolThread(p0,p1);
}
public static java.util.concurrent.Executor directExecutor(){
return MoreExecutors.directExecutor();
}
}
