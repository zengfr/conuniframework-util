package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ArrayDequeUtil{ 
/**
*public static <E> java.util.ArrayDeque<E> com.google.common.collect.Queues.newArrayDeque(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.ArrayDeque<E> newArrayDeque(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Queues.newArrayDeque(p0);
}
/**
*public static <E> java.util.ArrayDeque<E> com.google.common.collect.Queues.newArrayDeque()
*/ 
public static <E> java.util.ArrayDeque<E> newArrayDeque(){
	return com.google.common.collect.Queues.newArrayDeque();
}
}
