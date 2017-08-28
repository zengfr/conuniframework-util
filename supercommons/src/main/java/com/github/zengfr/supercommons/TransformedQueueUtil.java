package com.zengfr.supercommons;
import org.apache.commons.collections4.queue.TransformedQueue;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedQueueUtil{ 
public static <E> org.apache.commons.collections4.queue.TransformedQueue<E> transformingQueue(java.util.Queue<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedQueue.transformingQueue(p0,p1);
}
public static <E> org.apache.commons.collections4.queue.TransformedQueue<E> transformedQueue(java.util.Queue<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedQueue.transformedQueue(p0,p1);
}
}
