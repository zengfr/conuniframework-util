package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.ShortPriorityQueues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortPriorityQueueUtil{ 
public static it.unimi.dsi.fastutil.shorts.ShortPriorityQueue synchronize(it.unimi.dsi.fastutil.shorts.ShortPriorityQueue p0){
return ShortPriorityQueues.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortPriorityQueue synchronize(it.unimi.dsi.fastutil.shorts.ShortPriorityQueue p0,java.lang.Object p1){
return ShortPriorityQueues.synchronize(p0,p1);
}
}
