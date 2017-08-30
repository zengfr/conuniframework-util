package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CountDownLatchUtil{ 
/**
*public static void com.google.common.util.concurrent.Uninterruptibles.awaitUninterruptibly(java.util.concurrent.CountDownLatch)
*/ 
public static void awaitUninterruptibly(java.util.concurrent.CountDownLatch p0){
	 com.google.common.util.concurrent.Uninterruptibles.awaitUninterruptibly(p0);
}
/**
*public static boolean com.google.common.util.concurrent.Uninterruptibles.awaitUninterruptibly(java.util.concurrent.CountDownLatch,long,java.util.concurrent.TimeUnit)
*/ 
public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.Uninterruptibles.awaitUninterruptibly(p0,p1,p2);
}
}
