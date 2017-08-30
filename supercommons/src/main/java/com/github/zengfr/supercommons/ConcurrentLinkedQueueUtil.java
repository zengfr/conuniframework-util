package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConcurrentLinkedQueueUtil{ 
/**
*public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> com.google.common.collect.Queues.newConcurrentLinkedQueue()
*/ 
public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(){
	return com.google.common.collect.Queues.newConcurrentLinkedQueue();
}
/**
*public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> com.google.common.collect.Queues.newConcurrentLinkedQueue(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Queues.newConcurrentLinkedQueue(p0);
}
}
