package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RunnableUtil{ 
/**
*public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> com.google.common.util.concurrent.ListenableFutureTask.create(java.lang.Runnable,V)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.lang.Runnable p0,V p1){
	return com.google.common.util.concurrent.ListenableFutureTask.create(p0,p1);
}
/**
*public static java.lang.Runnable com.google.common.util.concurrent.Runnables.doNothing()
*/ 
public static java.lang.Runnable doNothing(){
	return com.google.common.util.concurrent.Runnables.doNothing();
}
}
