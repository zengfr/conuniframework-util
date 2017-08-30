package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ThreadUtil{ 
/**
*public static void com.google.common.util.concurrent.Uninterruptibles.joinUninterruptibly(java.lang.Thread)
*/ 
public static void joinUninterruptibly(java.lang.Thread p0){
	 com.google.common.util.concurrent.Uninterruptibles.joinUninterruptibly(p0);
}
/**
*public static void com.google.common.util.concurrent.Uninterruptibles.joinUninterruptibly(java.lang.Thread,long,java.util.concurrent.TimeUnit)
*/ 
public static void joinUninterruptibly(java.lang.Thread p0,long p1,java.util.concurrent.TimeUnit p2){
	 com.google.common.util.concurrent.Uninterruptibles.joinUninterruptibly(p0,p1,p2);
}
}
