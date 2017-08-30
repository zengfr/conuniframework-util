package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class QueueUtil{ 
/**
*public static <E> java.util.Queue<E> org.apache.commons.collections4.QueueUtils.emptyQueue()
*/ 
public static <E> java.util.Queue<E> emptyQueue(){
	return org.apache.commons.collections4.QueueUtils.emptyQueue();
}
/**
*public static <E> java.util.Queue<E> org.apache.commons.collections4.QueueUtils.predicatedQueue(java.util.Queue<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> java.util.Queue<E> predicatedQueue(java.util.Queue<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.QueueUtils.predicatedQueue(p0,p1);
}
/**
*public static <E> java.util.Queue<E> com.google.common.collect.Queues.synchronizedQueue(java.util.Queue<E>)
*/ 
public static <E> java.util.Queue<E> synchronizedQueue(java.util.Queue<E> p0){
	return com.google.common.collect.Queues.synchronizedQueue(p0);
}
/**
*public static <E> java.util.Queue<E> org.apache.commons.collections4.QueueUtils.transformingQueue(java.util.Queue<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> java.util.Queue<E> transformingQueue(java.util.Queue<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.QueueUtils.transformingQueue(p0,p1);
}
/**
*public static <E> java.util.Queue<E> org.apache.commons.collections4.QueueUtils.unmodifiableQueue(java.util.Queue<? extends E>)
*/ 
public static <E> java.util.Queue<E> unmodifiableQueue(java.util.Queue<? extends E> p0){
	return org.apache.commons.collections4.QueueUtils.unmodifiableQueue(p0);
}
}
