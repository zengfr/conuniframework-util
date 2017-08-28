package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.FloatPriorityQueues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatPriorityQueueUtil{ 
public static it.unimi.dsi.fastutil.floats.FloatPriorityQueue synchronize(it.unimi.dsi.fastutil.floats.FloatPriorityQueue p0){
return FloatPriorityQueues.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatPriorityQueue synchronize(it.unimi.dsi.fastutil.floats.FloatPriorityQueue p0,java.lang.Object p1){
return FloatPriorityQueues.synchronize(p0,p1);
}
}
