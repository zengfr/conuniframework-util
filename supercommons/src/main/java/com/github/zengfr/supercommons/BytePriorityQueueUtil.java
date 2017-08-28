package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.BytePriorityQueues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BytePriorityQueueUtil{ 
public static it.unimi.dsi.fastutil.bytes.BytePriorityQueue synchronize(it.unimi.dsi.fastutil.bytes.BytePriorityQueue p0){
return BytePriorityQueues.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.BytePriorityQueue synchronize(it.unimi.dsi.fastutil.bytes.BytePriorityQueue p0,java.lang.Object p1){
return BytePriorityQueues.synchronize(p0,p1);
}
}
