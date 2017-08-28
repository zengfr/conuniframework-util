package com.zengfr.supercommons;
import com.google.common.collect.Queues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConcurrentLinkedQueueUtil{ 
public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(java.lang.Iterable<? extends E> p0){
return Queues.newConcurrentLinkedQueue(p0);
}
public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(){
return Queues.newConcurrentLinkedQueue();
}
}
