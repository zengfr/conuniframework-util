package com.zengfr.supercommons;
import com.google.common.collect.Queues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedBlockingDequeUtil{ 
public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(){
return Queues.newLinkedBlockingDeque();
}
public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(java.lang.Iterable<? extends E> p0){
return Queues.newLinkedBlockingDeque(p0);
}
public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(int p0){
return Queues.newLinkedBlockingDeque(p0);
}
}
