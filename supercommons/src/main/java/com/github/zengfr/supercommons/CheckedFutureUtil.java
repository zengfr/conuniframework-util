package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CheckedFutureUtil{ 
/**
*public static <V,X> com.google.common.util.concurrent.CheckedFuture<V, X> com.google.common.util.concurrent.Futures.immediateCheckedFuture(V)
*/ 
public static <V,X extends java.lang.Exception > com.google.common.util.concurrent.CheckedFuture<V, X> immediateCheckedFuture(V p0){
	return com.google.common.util.concurrent.Futures.immediateCheckedFuture(p0);
}
/**
*public static <V,X> com.google.common.util.concurrent.CheckedFuture<V, X> com.google.common.util.concurrent.Futures.immediateFailedCheckedFuture(X)
*/ 
public static <V,X extends java.lang.Exception > com.google.common.util.concurrent.CheckedFuture<V, X> immediateFailedCheckedFuture(X p0){
	return com.google.common.util.concurrent.Futures.immediateFailedCheckedFuture(p0);
}
/**
*public static <V,X> com.google.common.util.concurrent.CheckedFuture<V, X> com.google.common.util.concurrent.Futures.makeChecked(com.google.common.util.concurrent.ListenableFuture<V>,com.google.common.base.Function<? super java.lang.Exception, X>)
*/ 
public static <V,X extends java.lang.Exception > com.google.common.util.concurrent.CheckedFuture<V, X> makeChecked(com.google.common.util.concurrent.ListenableFuture<V> p0,com.google.common.base.Function<? super java.lang.Exception, X> p1){
	return com.google.common.util.concurrent.Futures.makeChecked(p0,p1);
}
}
