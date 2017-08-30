package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DequeUtil{ 
/**
*public static <E> java.util.Deque<E> com.google.common.collect.Queues.synchronizedDeque(java.util.Deque<E>)
*/ 
public static <E> java.util.Deque<E> synchronizedDeque(java.util.Deque<E> p0){
	return com.google.common.collect.Queues.synchronizedDeque(p0);
}
}
