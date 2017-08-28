package com.zengfr.supercommons;
import com.google.common.collect.EvictingQueue;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EvictingQueueUtil{ 
public static <E> com.google.common.collect.EvictingQueue<E> create(int p0){
return EvictingQueue.create(p0);
}
}
