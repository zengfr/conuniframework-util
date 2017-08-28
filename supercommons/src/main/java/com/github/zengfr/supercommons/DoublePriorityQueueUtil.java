package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.DoublePriorityQueues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoublePriorityQueueUtil{ 
public static it.unimi.dsi.fastutil.doubles.DoublePriorityQueue synchronize(it.unimi.dsi.fastutil.doubles.DoublePriorityQueue p0){
return DoublePriorityQueues.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoublePriorityQueue synchronize(it.unimi.dsi.fastutil.doubles.DoublePriorityQueue p0,java.lang.Object p1){
return DoublePriorityQueues.synchronize(p0,p1);
}
}
