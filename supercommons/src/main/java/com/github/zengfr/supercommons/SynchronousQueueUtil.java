package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
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
