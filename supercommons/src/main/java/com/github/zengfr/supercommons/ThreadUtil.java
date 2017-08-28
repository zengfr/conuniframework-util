package com.zengfr.supercommons;
import com.google.common.util.concurrent.Uninterruptibles;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ThreadUtil{ 
public static void joinUninterruptibly(java.lang.Thread p0,long p1,java.util.concurrent.TimeUnit p2){
 Uninterruptibles.joinUninterruptibly(p0,p1,p2);
}
public static void joinUninterruptibly(java.lang.Thread p0){
 Uninterruptibles.joinUninterruptibly(p0);
}
}
