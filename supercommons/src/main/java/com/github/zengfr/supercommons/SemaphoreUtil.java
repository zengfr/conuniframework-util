package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SemaphoreUtil{ 
/**
*public static boolean com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(java.util.concurrent.Semaphore,long,java.util.concurrent.TimeUnit)
*/ 
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2);
}
/**
*public static boolean com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(java.util.concurrent.Semaphore,int,long,java.util.concurrent.TimeUnit)
*/ 
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,int p1,long p2,java.util.concurrent.TimeUnit p3){
	return com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2,p3);
}
}
