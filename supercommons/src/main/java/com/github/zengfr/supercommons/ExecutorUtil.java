package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ExecutorUtil{ 
/**
*public static <V> void com.google.common.util.concurrent.Futures.addCallback(com.google.common.util.concurrent.ListenableFuture<V>,com.google.common.util.concurrent.FutureCallback<? super V>,java.util.concurrent.Executor)
*/ 
public static <V> void addCallback(com.google.common.util.concurrent.ListenableFuture<V> p0,com.google.common.util.concurrent.FutureCallback<? super V> p1,java.util.concurrent.Executor p2){
	 com.google.common.util.concurrent.Futures.addCallback(p0,p1,p2);
}
/**
*public static <K,V> com.google.common.cache.CacheLoader<K, V> com.google.common.cache.CacheLoader.asyncReloading(com.google.common.cache.CacheLoader<K, V>,java.util.concurrent.Executor)
*/ 
public static <K,V> com.google.common.cache.CacheLoader<K, V> asyncReloading(com.google.common.cache.CacheLoader<K, V> p0,java.util.concurrent.Executor p1){
	return com.google.common.cache.CacheLoader.asyncReloading(p0,p1);
}
/**
*public static <K,V> com.google.common.cache.RemovalListener<K, V> com.google.common.cache.RemovalListeners.asynchronous(com.google.common.cache.RemovalListener<K, V>,java.util.concurrent.Executor)
*/ 
public static <K,V> com.google.common.cache.RemovalListener<K, V> asynchronous(com.google.common.cache.RemovalListener<K, V> p0,java.util.concurrent.Executor p1){
	return com.google.common.cache.RemovalListeners.asynchronous(p0,p1);
}
/**
*public static <V,X> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.catching(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.base.Function<? super X, ? extends V>,java.util.concurrent.Executor)
*/ 
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.base.Function<? super X, ? extends V> p2,java.util.concurrent.Executor p3){
	return com.google.common.util.concurrent.Futures.catching(p0,p1,p2,p3);
}
/**
*public static <V,X> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>,java.util.concurrent.Executor)
*/ 
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> p2,java.util.concurrent.Executor p3){
	return com.google.common.util.concurrent.Futures.catchingAsync(p0,p1,p2,p3);
}
/**
*public static java.util.concurrent.Executor com.google.common.util.concurrent.MoreExecutors.directExecutor()
*/ 
public static java.util.concurrent.Executor directExecutor(){
	return com.google.common.util.concurrent.MoreExecutors.directExecutor();
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.JdkFutureAdapters.listenInPoolThread(java.util.concurrent.Future<V>,java.util.concurrent.Executor)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> p0,java.util.concurrent.Executor p1){
	return com.google.common.util.concurrent.JdkFutureAdapters.listenInPoolThread(p0,p1);
}
/**
*public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>,java.util.concurrent.Executor)
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
	return com.google.common.util.concurrent.Futures.transform(p0,p1,p2);
}
/**
*public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.base.Function<? super I, ? extends O>,java.util.concurrent.Executor)
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.base.Function<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
	return com.google.common.util.concurrent.Futures.transform(p0,p1,p2);
}
/**
*public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transformAsync(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>,java.util.concurrent.Executor)
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
	return com.google.common.util.concurrent.Futures.transformAsync(p0,p1,p2);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.withFallback(com.google.common.util.concurrent.ListenableFuture<? extends V>,com.google.common.util.concurrent.FutureFallback<? extends V>,java.util.concurrent.Executor)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withFallback(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,com.google.common.util.concurrent.FutureFallback<? extends V> p1,java.util.concurrent.Executor p2){
	return com.google.common.util.concurrent.Futures.withFallback(p0,p1,p2);
}
}
