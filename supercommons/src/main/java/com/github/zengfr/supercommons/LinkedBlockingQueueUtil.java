package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedBlockingQueueUtil{ 
/**
*public static <E> java.util.concurrent.LinkedBlockingQueue<E> com.google.common.collect.Queues.newLinkedBlockingQueue(int)
*/ 
public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(int p0){
	return com.google.common.collect.Queues.newLinkedBlockingQueue(p0);
}
/**
*public static <E> java.util.concurrent.LinkedBlockingQueue<E> com.google.common.collect.Queues.newLinkedBlockingQueue(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Queues.newLinkedBlockingQueue(p0);
}
/**
*public static <E> java.util.concurrent.LinkedBlockingQueue<E> com.google.common.collect.Queues.newLinkedBlockingQueue()
*/ 
public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(){
	return com.google.common.collect.Queues.newLinkedBlockingQueue();
}
}
