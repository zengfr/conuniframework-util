package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PriorityQueueUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> it.unimi.dsi.fastutil.PriorityQueues.emptyQueue()
*/ 
public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> emptyQueue(){
	return it.unimi.dsi.fastutil.PriorityQueues.emptyQueue();
}
/**
*public static <E> java.util.PriorityQueue<E> com.google.common.collect.Queues.newPriorityQueue()
*/ 
public static <E extends java.lang.Comparable > java.util.PriorityQueue<E> newPriorityQueue(){
	return com.google.common.collect.Queues.newPriorityQueue();
}
/**
*public static <E> java.util.PriorityQueue<E> com.google.common.collect.Queues.newPriorityQueue(java.lang.Iterable<? extends E>)
*/ 
public static <E extends java.lang.Comparable > java.util.PriorityQueue<E> newPriorityQueue(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Queues.newPriorityQueue(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> it.unimi.dsi.fastutil.PriorityQueues.synchronize(it.unimi.dsi.fastutil.PriorityQueue<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> synchronize(it.unimi.dsi.fastutil.PriorityQueue<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.PriorityQueues.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> it.unimi.dsi.fastutil.PriorityQueues.synchronize(it.unimi.dsi.fastutil.PriorityQueue<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> synchronize(it.unimi.dsi.fastutil.PriorityQueue<K> p0){
	return it.unimi.dsi.fastutil.PriorityQueues.synchronize(p0);
}
}
