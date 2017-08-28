package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.CharPriorityQueues;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharPriorityQueueUtil{ 
public static it.unimi.dsi.fastutil.chars.CharPriorityQueue synchronize(it.unimi.dsi.fastutil.chars.CharPriorityQueue p0){
return CharPriorityQueues.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.CharPriorityQueue synchronize(it.unimi.dsi.fastutil.chars.CharPriorityQueue p0,java.lang.Object p1){
return CharPriorityQueues.synchronize(p0,p1);
}
}
