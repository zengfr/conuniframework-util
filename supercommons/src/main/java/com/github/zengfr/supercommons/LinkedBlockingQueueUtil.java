package com.github.zengfr.supercommons;
import com.google.common.collect.Queues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedBlockingQueueUtil{ 
public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(int p0){
return Queues.newLinkedBlockingQueue(p0);
}
public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(java.lang.Iterable<? extends E> p0){
return Queues.newLinkedBlockingQueue(p0);
}
public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(){
return Queues.newLinkedBlockingQueue();
}
}
