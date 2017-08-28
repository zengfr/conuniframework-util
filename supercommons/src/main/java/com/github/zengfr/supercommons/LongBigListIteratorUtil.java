package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.LongBigListIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongBigListIteratorUtil{ 
public static it.unimi.dsi.fastutil.longs.LongBigListIterator singleton(long p0){
return LongBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.LongBigListIterator unmodifiable(it.unimi.dsi.fastutil.longs.LongBigListIterator p0){
return LongBigListIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongBigListIterator asBigListIterator(it.unimi.dsi.fastutil.longs.LongListIterator p0){
return LongBigListIterators.asBigListIterator(p0);
}
}
