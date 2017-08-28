package com.github.zengfr.supercommons;
import com.google.common.util.concurrent.MoreExecutors;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ThreadPoolExecutorUtil{ 
public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor p0){
return MoreExecutors.getExitingExecutorService(p0);
}
public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
return MoreExecutors.getExitingExecutorService(p0,p1,p2);
}
}
