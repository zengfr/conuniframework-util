package com.zengfr.supercommons;
import com.google.common.collect.Queues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ArrayDequeUtil{ 
public static <E> java.util.ArrayDeque<E> newArrayDeque(java.lang.Iterable<? extends E> p0){
return Queues.newArrayDeque(p0);
}
public static <E> java.util.ArrayDeque<E> newArrayDeque(){
return Queues.newArrayDeque();
}
}
