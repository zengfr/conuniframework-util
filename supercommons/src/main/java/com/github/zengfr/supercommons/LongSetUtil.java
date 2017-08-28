package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.LongSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongSetUtil{ 
public static it.unimi.dsi.fastutil.longs.LongSet singleton(java.lang.Long p0){
return LongSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.LongSet singleton(long p0){
return LongSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.LongSet unmodifiable(it.unimi.dsi.fastutil.longs.LongSet p0){
return LongSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongSet synchronize(it.unimi.dsi.fastutil.longs.LongSet p0){
return LongSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.LongSet synchronize(it.unimi.dsi.fastutil.longs.LongSet p0,java.lang.Object p1){
return LongSets.synchronize(p0,p1);
}
}
