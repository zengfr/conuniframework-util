package com.zengfr.supercommons;
import com.google.common.collect.Queues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ArrayBlockingQueueUtil{ 
public static <E> java.util.concurrent.ArrayBlockingQueue<E> newArrayBlockingQueue(int p0){
return Queues.newArrayBlockingQueue(p0);
}
}
