package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IndirectPriorityQueueUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.IndirectPriorityQueue<K> it.unimi.dsi.fastutil.IndirectPriorityQueues.synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.IndirectPriorityQueue<K> synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K> p0){
	return it.unimi.dsi.fastutil.IndirectPriorityQueues.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.IndirectPriorityQueue<K> it.unimi.dsi.fastutil.IndirectPriorityQueues.synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.IndirectPriorityQueue<K> synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.IndirectPriorityQueues.synchronize(p0,p1);
}
}
