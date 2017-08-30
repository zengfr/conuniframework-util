package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MinMaxPriorityQueueUtil{ 
/**
*public static <E> com.google.common.collect.MinMaxPriorityQueue<E> com.google.common.collect.MinMaxPriorityQueue.create()
*/ 
public static <E extends java.lang.Comparable<E> > com.google.common.collect.MinMaxPriorityQueue<E> create(){
	return com.google.common.collect.MinMaxPriorityQueue.create();
}
/**
*public static <E> com.google.common.collect.MinMaxPriorityQueue<E> com.google.common.collect.MinMaxPriorityQueue.create(java.lang.Iterable<? extends E>)
*/ 
public static <E extends java.lang.Comparable<E> > com.google.common.collect.MinMaxPriorityQueue<E> create(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.MinMaxPriorityQueue.create(p0);
}
}
