package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedBlockingDequeUtil{ 
/**
*public static <E> java.util.concurrent.LinkedBlockingDeque<E> com.google.common.collect.Queues.newLinkedBlockingDeque()
*/ 
public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(){
	return com.google.common.collect.Queues.newLinkedBlockingDeque();
}
/**
*public static <E> java.util.concurrent.LinkedBlockingDeque<E> com.google.common.collect.Queues.newLinkedBlockingDeque(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Queues.newLinkedBlockingDeque(p0);
}
/**
*public static <E> java.util.concurrent.LinkedBlockingDeque<E> com.google.common.collect.Queues.newLinkedBlockingDeque(int)
*/ 
public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(int p0){
	return com.google.common.collect.Queues.newLinkedBlockingDeque(p0);
}
}
