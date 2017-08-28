package com.github.zengfr.supercommons;
import com.google.common.util.concurrent.Uninterruptibles;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SemaphoreUtil{ 
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,int p1,long p2,java.util.concurrent.TimeUnit p3){
return Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2,p3);
}
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,long p1,java.util.concurrent.TimeUnit p2){
return Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2);
}
}
