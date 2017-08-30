package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PriorityBlockingQueueUtil{ 
/**
*public static <E> java.util.concurrent.PriorityBlockingQueue<E> com.google.common.collect.Queues.newPriorityBlockingQueue()
*/ 
public static <E extends java.lang.Comparable > java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue(){
	return com.google.common.collect.Queues.newPriorityBlockingQueue();
}
/**
*public static <E> java.util.concurrent.PriorityBlockingQueue<E> com.google.common.collect.Queues.newPriorityBlockingQueue(java.lang.Iterable<? extends E>)
*/ 
public static <E extends java.lang.Comparable > java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Queues.newPriorityBlockingQueue(p0);
}
}
