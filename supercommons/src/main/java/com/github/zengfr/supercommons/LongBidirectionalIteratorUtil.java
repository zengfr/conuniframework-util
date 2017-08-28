package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.LongIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongBidirectionalIteratorUtil{ 
public static it.unimi.dsi.fastutil.longs.LongBidirectionalIterator unmodifiable(it.unimi.dsi.fastutil.longs.LongBidirectionalIterator p0){
return LongIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongBidirectionalIterator fromTo(long p0,long p1){
return LongIterators.fromTo(p0,p1);
}
}
