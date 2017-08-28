package com.zengfr.supercommons;
import com.google.common.collect.Queues;
import org.apache.commons.collections4.QueueUtils;
import org.apache.commons.collections4.queue.UnmodifiableQueue;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class QueueUtil{ 
public static <E> java.util.Queue<E> synchronizedQueue(java.util.Queue<E> p0){
return Queues.synchronizedQueue(p0);
}
public static <E> java.util.Queue<E> unmodifiableQueue(java.util.Queue<? extends E> p0){
return QueueUtils.unmodifiableQueue(p0);
}
public static <E> java.util.Queue<E> transformingQueue(java.util.Queue<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return QueueUtils.transformingQueue(p0,p1);
}
public static <E> java.util.Queue<E> predicatedQueue(java.util.Queue<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return QueueUtils.predicatedQueue(p0,p1);
}
public static <E> java.util.Queue<E> emptyQueue(){
return QueueUtils.emptyQueue();
}
}
