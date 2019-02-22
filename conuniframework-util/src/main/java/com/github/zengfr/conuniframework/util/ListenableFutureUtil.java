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
public final class ListenableFutureUtil{ 
/**
*{@link com.google.common.util.concurrent.Futures#allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>...)}
*@see com.google.common.util.concurrent.Futures#allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>...)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> com.google.common.util.concurrent.Futures.allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>...)
*allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... p0){
	return com.google.common.util.concurrent.Futures.allAsList(p0);
}
/**
*{@link com.google.common.util.concurrent.Futures#allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)}
*@see com.google.common.util.concurrent.Futures#allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> com.google.common.util.concurrent.Futures.allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)
*allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0){
	return com.google.common.util.concurrent.Futures.allAsList(p0);
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
*{@link com.google.common.util.concurrent.Futures#catching(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.base.Function<? super X, ? extends V>)}
*@see com.google.common.util.concurrent.Futures#catching(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.base.Function<? super X, ? extends V>)
*<code>public static <V,X> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.catching(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.base.Function<? super X, ? extends V>)
*catching(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.base.Function<? super X, ? extends V> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.base.Function<? super X, ? extends V> p2){
	return com.google.common.util.concurrent.Futures.catching(p0,p1,p2);
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
*{@link com.google.common.util.concurrent.Futures#catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>)}
*@see com.google.common.util.concurrent.Futures#catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>)
*<code>public static <V,X> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>)
*catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> p2){
	return com.google.common.util.concurrent.Futures.catchingAsync(p0,p1,p2);
}
/**
*{@link com.google.common.util.concurrent.Futures#dereference(com.google.common.util.concurrent.ListenableFuture<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)}
*@see com.google.common.util.concurrent.Futures#dereference(com.google.common.util.concurrent.ListenableFuture<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.dereference(com.google.common.util.concurrent.ListenableFuture<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)
*dereference(com.google.common.util.concurrent.ListenableFuture<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> dereference(com.google.common.util.concurrent.ListenableFuture<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0){
	return com.google.common.util.concurrent.Futures.dereference(p0);
}
/**
*{@link com.google.common.util.concurrent.Futures#immediateCancelledFuture()}
*@see com.google.common.util.concurrent.Futures#immediateCancelledFuture()
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.immediateCancelledFuture()
*immediateCancelledFuture()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateCancelledFuture(){
	return com.google.common.util.concurrent.Futures.immediateCancelledFuture();
}
/**
*{@link com.google.common.util.concurrent.Futures#immediateFailedFuture(java.lang.Throwable)}
*@see com.google.common.util.concurrent.Futures#immediateFailedFuture(java.lang.Throwable)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.immediateFailedFuture(java.lang.Throwable)
*immediateFailedFuture(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable p0){
	return com.google.common.util.concurrent.Futures.immediateFailedFuture(p0);
}
/**
*{@link com.google.common.util.concurrent.Futures#immediateFuture(V)}
*@see com.google.common.util.concurrent.Futures#immediateFuture(V)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.immediateFuture(V)
*immediateFuture(V p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(V p0){
	return com.google.common.util.concurrent.Futures.immediateFuture(p0);
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
*{@link com.google.common.util.concurrent.JdkFutureAdapters#listenInPoolThread(java.util.concurrent.Future<V>)}
*@see com.google.common.util.concurrent.JdkFutureAdapters#listenInPoolThread(java.util.concurrent.Future<V>)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.JdkFutureAdapters.listenInPoolThread(java.util.concurrent.Future<V>)
*listenInPoolThread(java.util.concurrent.Future<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> p0){
	return com.google.common.util.concurrent.JdkFutureAdapters.listenInPoolThread(p0);
}
/**
*{@link com.google.common.util.concurrent.Futures#nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V>)}
*@see com.google.common.util.concurrent.Futures#nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V>)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V>)
*nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V> p0){
	return com.google.common.util.concurrent.Futures.nonCancellationPropagating(p0);
}
/**
*{@link com.google.common.util.concurrent.Futures#scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O>,long,java.util.concurrent.TimeUnit,java.util.concurrent.ScheduledExecutorService)}
*@see com.google.common.util.concurrent.Futures#scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O>,long,java.util.concurrent.TimeUnit,java.util.concurrent.ScheduledExecutorService)
*<code>public static <O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O>,long,java.util.concurrent.TimeUnit,java.util.concurrent.ScheduledExecutorService)
*scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O> p0,long p1,java.util.concurrent.TimeUnit p2,java.util.concurrent.ScheduledExecutorService p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> com.google.common.util.concurrent.ListenableFuture<O> scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O> p0,long p1,java.util.concurrent.TimeUnit p2,java.util.concurrent.ScheduledExecutorService p3){
	return com.google.common.util.concurrent.Futures.scheduleAsync(p0,p1,p2,p3);
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
*{@link com.google.common.util.concurrent.Futures#successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)}
*@see com.google.common.util.concurrent.Futures#successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> com.google.common.util.concurrent.Futures.successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)
*successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0){
	return com.google.common.util.concurrent.Futures.successfulAsList(p0);
}
/**
*{@link com.google.common.util.concurrent.Futures#successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>...)}
*@see com.google.common.util.concurrent.Futures#successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>...)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> com.google.common.util.concurrent.Futures.successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>...)
*successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... p0){
	return com.google.common.util.concurrent.Futures.successfulAsList(p0);
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
*{@link com.google.common.util.concurrent.Futures#transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.base.Function<? super I, ? extends O>)}
*@see com.google.common.util.concurrent.Futures#transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.base.Function<? super I, ? extends O>)
*<code>public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.base.Function<? super I, ? extends O>)
*transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.base.Function<? super I, ? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.base.Function<? super I, ? extends O> p1){
	return com.google.common.util.concurrent.Futures.transform(p0,p1);
}
/**
*{@link com.google.common.util.concurrent.Futures#transformAsync(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>)}
*@see com.google.common.util.concurrent.Futures#transformAsync(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>)
*<code>public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transformAsync(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>)
*transformAsync(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1){
	return com.google.common.util.concurrent.Futures.transformAsync(p0,p1);
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
/**
*{@link com.google.common.util.concurrent.Futures#withTimeout(com.google.common.util.concurrent.ListenableFuture<V>,long,java.util.concurrent.TimeUnit,java.util.concurrent.ScheduledExecutorService)}
*@see com.google.common.util.concurrent.Futures#withTimeout(com.google.common.util.concurrent.ListenableFuture<V>,long,java.util.concurrent.TimeUnit,java.util.concurrent.ScheduledExecutorService)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.withTimeout(com.google.common.util.concurrent.ListenableFuture<V>,long,java.util.concurrent.TimeUnit,java.util.concurrent.ScheduledExecutorService)
*withTimeout(com.google.common.util.concurrent.ListenableFuture<V> p0,long p1,java.util.concurrent.TimeUnit p2,java.util.concurrent.ScheduledExecutorService p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> p0,long p1,java.util.concurrent.TimeUnit p2,java.util.concurrent.ScheduledExecutorService p3){
	return com.google.common.util.concurrent.Futures.withTimeout(p0,p1,p2,p3);
}
}
