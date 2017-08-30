package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RateLimiterUtil{ 
/**
*public static com.google.common.util.concurrent.RateLimiter com.google.common.util.concurrent.RateLimiter.create(double)
*/ 
public static com.google.common.util.concurrent.RateLimiter create(double p0){
	return com.google.common.util.concurrent.RateLimiter.create(p0);
}
/**
*public static com.google.common.util.concurrent.RateLimiter com.google.common.util.concurrent.RateLimiter.create(double,long,java.util.concurrent.TimeUnit)
*/ 
public static com.google.common.util.concurrent.RateLimiter create(double p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.RateLimiter.create(p0,p1,p2);
}
}
