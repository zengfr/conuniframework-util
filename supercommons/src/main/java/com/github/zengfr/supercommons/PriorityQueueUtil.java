package com.github.zengfr.supercommons;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.PriorityQueues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PriorityQueueUtil{ 
public static <E extends java.lang.Comparable > java.util.PriorityQueue<E> newPriorityQueue(java.lang.Iterable<? extends E> p0){
return Queues.newPriorityQueue(p0);
}
public static <E extends java.lang.Comparable > java.util.PriorityQueue<E> newPriorityQueue(){
return Queues.newPriorityQueue();
}
public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> emptyQueue(){
return PriorityQueues.emptyQueue();
}
public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> synchronize(it.unimi.dsi.fastutil.PriorityQueue<K> p0,java.lang.Object p1){
return PriorityQueues.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> synchronize(it.unimi.dsi.fastutil.PriorityQueue<K> p0){
return PriorityQueues.synchronize(p0);
}
}
