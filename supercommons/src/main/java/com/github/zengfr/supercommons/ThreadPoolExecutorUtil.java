package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ThreadPoolExecutorUtil{ 
/**
*public static java.util.concurrent.ExecutorService com.google.common.util.concurrent.MoreExecutors.getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor,long,java.util.concurrent.TimeUnit)
*/ 
public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.MoreExecutors.getExitingExecutorService(p0,p1,p2);
}
/**
*public static java.util.concurrent.ExecutorService com.google.common.util.concurrent.MoreExecutors.getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor)
*/ 
public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor p0){
	return com.google.common.util.concurrent.MoreExecutors.getExitingExecutorService(p0);
}
}
