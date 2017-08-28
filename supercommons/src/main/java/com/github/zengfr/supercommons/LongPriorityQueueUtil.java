package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.LongPriorityQueues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongPriorityQueueUtil{ 
public static it.unimi.dsi.fastutil.longs.LongPriorityQueue synchronize(it.unimi.dsi.fastutil.longs.LongPriorityQueue p0){
return LongPriorityQueues.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.LongPriorityQueue synchronize(it.unimi.dsi.fastutil.longs.LongPriorityQueue p0,java.lang.Object p1){
return LongPriorityQueues.synchronize(p0,p1);
}
}
