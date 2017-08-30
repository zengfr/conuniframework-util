package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ArrayBlockingQueueUtil{ 
/**
*public static <E> java.util.concurrent.ArrayBlockingQueue<E> com.google.common.collect.Queues.newArrayBlockingQueue(int)
*/ 
public static <E> java.util.concurrent.ArrayBlockingQueue<E> newArrayBlockingQueue(int p0){
	return com.google.common.collect.Queues.newArrayBlockingQueue(p0);
}
}
