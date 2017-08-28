package com.zengfr.supercommons;
import com.google.common.util.concurrent.RateLimiter;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RateLimiterUtil{ 
public static com.google.common.util.concurrent.RateLimiter create(double p0){
return RateLimiter.create(p0);
}
public static com.google.common.util.concurrent.RateLimiter create(double p0,long p1,java.util.concurrent.TimeUnit p2){
return RateLimiter.create(p0,p1,p2);
}
}
