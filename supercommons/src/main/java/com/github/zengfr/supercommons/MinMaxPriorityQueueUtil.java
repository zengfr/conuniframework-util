package com.zengfr.supercommons;
import com.google.common.collect.MinMaxPriorityQueue;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MinMaxPriorityQueueUtil{ 
public static <E extends java.lang.Comparable<E> > com.google.common.collect.MinMaxPriorityQueue<E> create(){
return MinMaxPriorityQueue.create();
}
public static <E extends java.lang.Comparable<E> > com.google.common.collect.MinMaxPriorityQueue<E> create(java.lang.Iterable<? extends E> p0){
return MinMaxPriorityQueue.create(p0);
}
}
