package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListenableFutureUtil{ 
/**
*public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>,java.util.concurrent.Executor)
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
	return com.google.common.util.concurrent.Futures.transform(p0,p1,p2);
}
/**
*public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>)
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1){
	return com.google.common.util.concurrent.Futures.transform(p0,p1);
}
/**
*public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.base.Function<? super I, ? extends O>)
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.base.Function<? super I, ? extends O> p1){
	return com.google.common.util.concurrent.Futures.transform(p0,p1);
}
/**
*public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transform(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.base.Function<? super I, ? extends O>,java.util.concurrent.Executor)
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.base.Function<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
	return com.google.common.util.concurrent.Futures.transform(p0,p1,p2);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.immediateFailedFuture(java.lang.Throwable)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable p0){
	return com.google.common.util.concurrent.Futures.immediateFailedFuture(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.immediateFuture(V)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(V p0){
	return com.google.common.util.concurrent.Futures.immediateFuture(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.withFallback(com.google.common.util.concurrent.ListenableFuture<? extends V>,com.google.common.util.concurrent.FutureFallback<? extends V>)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withFallback(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,com.google.common.util.concurrent.FutureFallback<? extends V> p1){
	return com.google.common.util.concurrent.Futures.withFallback(p0,p1);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.withFallback(com.google.common.util.concurrent.ListenableFuture<? extends V>,com.google.common.util.concurrent.FutureFallback<? extends V>,java.util.concurrent.Executor)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withFallback(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,com.google.common.util.concurrent.FutureFallback<? extends V> p1,java.util.concurrent.Executor p2){
	return com.google.common.util.concurrent.Futures.withFallback(p0,p1,p2);
}
/**
*public static <V,X> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.catching(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.base.Function<? super X, ? extends V>,java.util.concurrent.Executor)
*/ 
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.base.Function<? super X, ? extends V> p2,java.util.concurrent.Executor p3){
	return com.google.common.util.concurrent.Futures.catching(p0,p1,p2,p3);
}
/**
*public static <V,X> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.catching(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.base.Function<? super X, ? extends V>)
*/ 
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.base.Function<? super X, ? extends V> p2){
	return com.google.common.util.concurrent.Futures.catching(p0,p1,p2);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.withTimeout(com.google.common.util.concurrent.ListenableFuture<V>,long,java.util.concurrent.TimeUnit,java.util.concurrent.ScheduledExecutorService)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> p0,long p1,java.util.concurrent.TimeUnit p2,java.util.concurrent.ScheduledExecutorService p3){
	return com.google.common.util.concurrent.Futures.withTimeout(p0,p1,p2,p3);
}
/**
*public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transformAsync(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>)
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1){
	return com.google.common.util.concurrent.Futures.transformAsync(p0,p1);
}
/**
*public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> com.google.common.util.concurrent.Futures.transformAsync(com.google.common.util.concurrent.ListenableFuture<I>,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>,java.util.concurrent.Executor)
*/ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
	return com.google.common.util.concurrent.Futures.transformAsync(p0,p1,p2);
}
/**
*public static <V,X> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>,java.util.concurrent.Executor)
*/ 
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> p2,java.util.concurrent.Executor p3){
	return com.google.common.util.concurrent.Futures.catchingAsync(p0,p1,p2,p3);
}
/**
*public static <V,X> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V>,java.lang.Class<X>,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>)
*/ 
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> p2){
	return com.google.common.util.concurrent.Futures.catchingAsync(p0,p1,p2);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.dereference(com.google.common.util.concurrent.ListenableFuture<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> dereference(com.google.common.util.concurrent.ListenableFuture<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0){
	return com.google.common.util.concurrent.Futures.dereference(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> com.google.common.util.concurrent.Futures.allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0){
	return com.google.common.util.concurrent.Futures.allAsList(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> com.google.common.util.concurrent.Futures.allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>...)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... p0){
	return com.google.common.util.concurrent.Futures.allAsList(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> com.google.common.util.concurrent.Futures.successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>...)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... p0){
	return com.google.common.util.concurrent.Futures.successfulAsList(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> com.google.common.util.concurrent.Futures.successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0){
	return com.google.common.util.concurrent.Futures.successfulAsList(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.immediateCancelledFuture()
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateCancelledFuture(){
	return com.google.common.util.concurrent.Futures.immediateCancelledFuture();
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V>)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V> p0){
	return com.google.common.util.concurrent.Futures.nonCancellationPropagating(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.JdkFutureAdapters.listenInPoolThread(java.util.concurrent.Future<V>,java.util.concurrent.Executor)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> p0,java.util.concurrent.Executor p1){
	return com.google.common.util.concurrent.JdkFutureAdapters.listenInPoolThread(p0,p1);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.JdkFutureAdapters.listenInPoolThread(java.util.concurrent.Future<V>)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> p0){
	return com.google.common.util.concurrent.JdkFutureAdapters.listenInPoolThread(p0);
}
}
