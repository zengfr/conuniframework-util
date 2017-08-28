package com.github.zengfr.supercommons;
import com.google.common.collect.Queues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DequeUtil{ 
public static <E> java.util.Deque<E> synchronizedDeque(java.util.Deque<E> p0){
return Queues.synchronizedDeque(p0);
}
}
