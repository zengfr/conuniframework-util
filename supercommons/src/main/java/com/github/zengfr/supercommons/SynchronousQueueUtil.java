package com.zengfr.supercommons;
import com.google.common.collect.Queues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SynchronousQueueUtil{ 
public static <E> java.util.concurrent.SynchronousQueue<E> newSynchronousQueue(){
return Queues.newSynchronousQueue();
}
}
