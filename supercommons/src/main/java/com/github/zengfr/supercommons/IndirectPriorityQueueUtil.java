package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.IndirectPriorityQueues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IndirectPriorityQueueUtil{ 
public static <K> it.unimi.dsi.fastutil.IndirectPriorityQueue<K> synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K> p0){
return IndirectPriorityQueues.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.IndirectPriorityQueue<K> synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K> p0,java.lang.Object p1){
return IndirectPriorityQueues.synchronize(p0,p1);
}
}
