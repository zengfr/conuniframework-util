package com.github.zengfr.supercommons;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.JdkFutureAdapters;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListenableFutureUtil{ 
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1){
return Futures.transform(p0,p1);
}
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
return Futures.transform(p0,p1,p2);
}
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.base.Function<? super I, ? extends O> p1){
return Futures.transform(p0,p1);
}
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.base.Function<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
return Futures.transform(p0,p1,p2);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(V p0){
return Futures.immediateFuture(p0);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable p0){
return Futures.immediateFailedFuture(p0);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V> p0){
return Futures.nonCancellationPropagating(p0);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateCancelledFuture(){
return Futures.immediateCancelledFuture();
}
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0){
return Futures.successfulAsList(p0);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... p0){
return Futures.successfulAsList(p0);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> p0,long p1,java.util.concurrent.TimeUnit p2,java.util.concurrent.ScheduledExecutorService p3){
return Futures.withTimeout(p0,p1,p2,p3);
}
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.base.Function<? super X, ? extends V> p2,java.util.concurrent.Executor p3){
return Futures.catching(p0,p1,p2,p3);
}
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.base.Function<? super X, ? extends V> p2){
return Futures.catching(p0,p1,p2);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withFallback(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,com.google.common.util.concurrent.FutureFallback<? extends V> p1){
return Futures.withFallback(p0,p1);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withFallback(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,com.google.common.util.concurrent.FutureFallback<? extends V> p1,java.util.concurrent.Executor p2){
return Futures.withFallback(p0,p1,p2);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> dereference(com.google.common.util.concurrent.ListenableFuture<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0){
return Futures.dereference(p0);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... p0){
return Futures.allAsList(p0);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> p0){
return Futures.allAsList(p0);
}
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1){
return Futures.transformAsync(p0,p1);
}
public static <I,O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> p0,com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> p1,java.util.concurrent.Executor p2){
return Futures.transformAsync(p0,p1,p2);
}
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> p2,java.util.concurrent.Executor p3){
return Futures.catchingAsync(p0,p1,p2,p3);
}
public static <V,X extends java.lang.Throwable > com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> p0,java.lang.Class<X> p1,com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> p2){
return Futures.catchingAsync(p0,p1,p2);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> p0,java.util.concurrent.Executor p1){
return JdkFutureAdapters.listenInPoolThread(p0,p1);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> p0){
return JdkFutureAdapters.listenInPoolThread(p0);
}
}
