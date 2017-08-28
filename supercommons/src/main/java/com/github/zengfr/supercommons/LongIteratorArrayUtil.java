package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.LongIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongIteratorArrayUtil{ 
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator[] p0,int p1,int p2){
return LongIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator[] p0){
return LongIterators.concat(p0);
}
}
