package com.zengfr.supercommons;
import com.google.common.collect.Queues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PriorityBlockingQueueUtil{ 
public static <E extends java.lang.Comparable > java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue(java.lang.Iterable<? extends E> p0){
return Queues.newPriorityBlockingQueue(p0);
}
public static <E extends java.lang.Comparable > java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue(){
return Queues.newPriorityBlockingQueue();
}
}
