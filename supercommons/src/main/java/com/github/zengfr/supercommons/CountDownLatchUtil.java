package com.zengfr.supercommons;
import com.google.common.util.concurrent.Uninterruptibles;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CountDownLatchUtil{ 
public static void awaitUninterruptibly(java.util.concurrent.CountDownLatch p0){
 Uninterruptibles.awaitUninterruptibly(p0);
}
public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch p0,long p1,java.util.concurrent.TimeUnit p2){
return Uninterruptibles.awaitUninterruptibly(p0,p1,p2);
}
}
