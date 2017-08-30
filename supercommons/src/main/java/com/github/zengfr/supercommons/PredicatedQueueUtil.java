package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedQueueUtil{ 
/**
*public static <E> org.apache.commons.collections4.queue.PredicatedQueue<E> org.apache.commons.collections4.queue.PredicatedQueue.predicatedQueue(java.util.Queue<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> org.apache.commons.collections4.queue.PredicatedQueue<E> predicatedQueue(java.util.Queue<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.queue.PredicatedQueue.predicatedQueue(p0,p1);
}
}
