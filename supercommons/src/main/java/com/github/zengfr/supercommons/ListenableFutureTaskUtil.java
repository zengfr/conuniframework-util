package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListenableFutureTaskUtil{ 
/**
*public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> com.google.common.util.concurrent.ListenableFutureTask.create(java.util.concurrent.Callable<V>)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.util.concurrent.Callable<V> p0){
	return com.google.common.util.concurrent.ListenableFutureTask.create(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> com.google.common.util.concurrent.ListenableFutureTask.create(java.lang.Runnable,V)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.lang.Runnable p0,V p1){
	return com.google.common.util.concurrent.ListenableFutureTask.create(p0,p1);
}
}
