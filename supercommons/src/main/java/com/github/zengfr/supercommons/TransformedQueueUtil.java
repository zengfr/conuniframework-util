package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedQueueUtil{ 
/**
*public static <E> org.apache.commons.collections4.queue.TransformedQueue<E> org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(java.util.Queue<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> org.apache.commons.collections4.queue.TransformedQueue<E> transformingQueue(java.util.Queue<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.queue.TransformedQueue<E> org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(java.util.Queue<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> org.apache.commons.collections4.queue.TransformedQueue<E> transformedQueue(java.util.Queue<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(p0,p1);
}
}
