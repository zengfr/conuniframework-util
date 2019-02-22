package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class ExecutorUtil{ 
/**
*{@link com.google.common.util.concurrent.Futures#addCallback(com.google.common.util.concurrent.ListenableFuture<V>,com.google.common.util.concurrent.FutureCallback<? super V>,java.util.concurrent.Executor)}
*@see com.google.common.util.concurrent.Futures#addCallback(com.google.common.util.concurrent.ListenableFuture<V>,com.google.common.util.concurrent.FutureCallback<? super V>,java.util.concurrent.Executor)
*<code>public static <V> void com.google.common.util.concurrent.Futures.addCallback(com.google.common.util.concurrent.ListenableFuture<V>,com.google.common.util.concurrent.FutureCallback<? super V>,java.util.concurrent.Executor)
*addCallback(com.google.common.util.concurrent.ListenableFuture<V> p0,com.google.common.util.concurrent.FutureCallback<? super V> p1,java.util.concurrent.Executor p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> void addCallback(com.google.common.util.concurrent.ListenableFuture<V> p0,com.google.common.util.concurrent.FutureCallback<? super V> p1,java.util.concurrent.Executor p2){
	 com.google.common.util.concurrent.Futures.addCallback(p0,p1,p2);
}
/**
*{@link com.google.common.cache.CacheLoader#asyncReloading(com.google.common.cache.CacheLoader<K, V>,java.util.concurrent.Executor)}
*@see com.google.common.cache.CacheLoader#asyncReloading(com.google.common.cache.CacheLoader<K, V>,java.util.concurrent.Executor)
*<code>public static <K,V> com.google.common.cache.CacheLoader<K, V> com.google.common.cache.CacheLoader.asyncReloading(com.google.common.cache.CacheLoader<K, V>,java.util.concurrent.Executor)
*asyncReloading(com.google.common.cache.CacheLoader<K, V> p0,java.util.concurrent.Executor p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.cache.CacheLoader<K, V> asyncReloading(com.google.common.cache.CacheLoader<K, V> p0,java.util.concurrent.Executor p1){
	return com.google.common.cache.CacheLoader.asyncReloading(p0,p1);
}
/**
*{@link com.google.common.cache.RemovalListeners#asynchronous(com.google.common.cache.RemovalListener<K, V>,java.util.concurrent.Executor)}
*@see com.google.common.cache.RemovalListeners#asynchronous(com.google.common.cache.RemovalListener<K, V>,java.util.concurrent.Executor)
*<code>public static <K,V> com.google.common.cache.RemovalListener<K, V> com.google.common.cache.RemovalListeners.asynchronous(com.google.common.cache.RemovalListener<K, V>,java.util.concurrent.Executor)
*asynchronous(com.google.common.cache.RemovalListener<K, V> p0,java.util.concurrent.Executor p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.cache.RemovalListener<K, V> asynchronous(com.google.common.cache.RemovalListener<K, V> p0,java.util.concurrent.Executor p1){
	return com.google.common.cache.RemovalListeners.asynchronous(p0,p1);
}
/**
*{@link com.google.common.util.concurrent.Futures#catching(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.base.Function<? super X, ? extends V>,java.util.concurrent.Executor)}
*@see com.google.common.util.concurrent.Futures#catching(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.base.Function<? super X, ? extends V>,java.util.concurrent.Executor)
*<code>public static <V,X> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.catching(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.base.Function<? super X, ? extends V>,java.util.concurrent.Executor)
*catching(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.base.Function<? super X, ? extends V> p2,java.util.concurrent.Executor p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.base.Function<? super X, ? extends V> p2,java.util.concurrent.Executor p3){
	return com.google.common.util.concurrent.Futures.catching(p0,p1,p2,p3);
}
/**
*{@link com.google.common.util.concurrent.Futures#catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>,java.util.concurrent.Executor)}
*@see com.google.common.util.concurrent.Futures#catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>,java.util.concurrent.Executor)
*<code>public static <V,X> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>,java.util.concurrent.Executor)
*catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> p2,java.util.concurrent.Executor p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> p2,java.util.concurrent.Executor p3){
	return com.google.common.util.concurrent.Futures.catchingAsync(p0,p1,p2,p3);
}
/**
*{@link com.google.common.util.concurrent.MoreExecutors#directExecutor()}
*@see com.google.common.util.concurrent.MoreExecutors#directExecutor()
*<code>public static java.util.concurrent.Executor com.google.common.util.concurrent.MoreExecutors.directExecutor()
*directExecutor()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.concurrent.Executor directExecutor(){
	return com.google.common.util.concurrent.MoreExecutors.directExecutor();
}
/**
*{@link com.google.common.util.concurrent.JdkFutureAdapters#listenInPoolThread(java.util.concurrent.Future<V>,java.util.concurrent.Executor)}
*@see com.google.common.util.concurrent.JdkFutureAdapters#listenInPoolThread(java.util.concurrent.Future<V>,java.util.concurrent.Executor)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.JdkFutureAdapters.listenInPoolThread(java.util.concurrent.Future<V>,java.util.concurrent.Executor)
*listenInPoolThread(java.util.concurrent.Future<V> p0,java.util.concurrent.Executor p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> p0,java.util.concurrent.Executor p1){
	return com.google.common.util.concurrent.JdkFutureAdapters.listenInPoolThread(p0,p1);
}
/**
*{@link com.google.common.util.concurrent.Futures#submitAsync(com.google.common.util.concurrent.AsyncCallable<O>,java.util.concurrent.Executor)}
*@see com.google.common.util.concurrent.Futures#submitAsync(com.google.common.util.concurrent.AsyncCallable<O>,java.util.concurrent.Executor)
*<code>public static <O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.submitAsync(com.google.common.util.concurrent.AsyncCallable<O>,java.util.concurrent.Executor)
*submitAsync(com.google.common.util.concurrent.AsyncCallable<O> p0,java.util.concurrent.Executor p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> com.google.common.util.concurrent.ListenableFuture<O> submitAsync(com.google.common.util.concurrent.AsyncCallable<O> p0,java.util.concurrent.Executor p1){
	return com.google.common.util.concurrent.Futures.submitAsync(p0,p1);
}
/**
*{@link com.google.common.util.concurrent.Futures#transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.base.Function<? super I, ? extends O>,java.util.concurrent.Executor)}
*@see com.google.common.util.concurrent.Futures#transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.base.Function<? super I, ? extends O>,java.util.concurrent.Executor)
*<code>public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.base.Function<? super I, ? extends O>,java.util.concurrent.Executor)
*transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.base.Function<? super I, ? extends O> p1,java.util.concurrent.Executor p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.base.Function<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
	return com.google.common.util.concurrent.Futures.transform(p0,p1,p2);
}
/**
*{@link com.google.common.util.concurrent.Futures#transformAsync(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>,java.util.concurrent.Executor)}
*@see com.google.common.util.concurrent.Futures#transformAsync(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>,java.util.concurrent.Executor)
*<code>public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transformAsync(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>,java.util.concurrent.Executor)
*transformAsync(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1,java.util.concurrent.Executor p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
	return com.google.common.util.concurrent.Futures.transformAsync(p0,p1,p2);
}
}
