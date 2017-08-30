package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SynchronousQueueUtil{ 
/**
*public static <E> java.util.concurrent.SynchronousQueue<E> com.google.common.collect.Queues.newSynchronousQueue()
*/ 
public static <E> java.util.concurrent.SynchronousQueue<E> newSynchronousQueue(){
	return com.google.common.collect.Queues.newSynchronousQueue();
}
}
