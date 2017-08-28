package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.IntPriorityQueues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntPriorityQueueUtil{ 
public static it.unimi.dsi.fastutil.ints.IntPriorityQueue synchronize(it.unimi.dsi.fastutil.ints.IntPriorityQueue p0){
return IntPriorityQueues.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.IntPriorityQueue synchronize(it.unimi.dsi.fastutil.ints.IntPriorityQueue p0,java.lang.Object p1){
return IntPriorityQueues.synchronize(p0,p1);
}
}
