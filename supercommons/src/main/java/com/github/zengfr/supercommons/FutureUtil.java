package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FutureUtil{ 
/**
*public static <I,O> java.util.concurrent.Future<O> com.google.common.util.concurrent.Futures.lazyTransform(java.util.concurrent.Future<I>,com.google.common.base.Function<? super I, ? extends O>)
*/ 
public static <I,O> java.util.concurrent.Future<O> lazyTransform(java.util.concurrent.Future<I> p0,com.google.common.base.Function<? super I, ? extends O> p1){
	return com.google.common.util.concurrent.Futures.lazyTransform(p0,p1);
}
/**
*public static <T> java.util.concurrent.Future<T> org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(T)
*/ 
public static <T> java.util.concurrent.Future<T> constantFuture(T p0){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(p0);
}
}
