package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2IntMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2IntMap singleton(long p0,int p1){
return Long2IntMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntMap singleton(java.lang.Long p0,java.lang.Integer p1){
return Long2IntMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2IntMap p0){
return Long2IntMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2IntMap synchronize(it.unimi.dsi.fastutil.longs.Long2IntMap p0){
return Long2IntMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2IntMap synchronize(it.unimi.dsi.fastutil.longs.Long2IntMap p0,java.lang.Object p1){
return Long2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2IntMap p0){
return Long2IntMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2IntMap.Entry> p1){
 Long2IntMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.longs.Long2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2IntMap p0){
return Long2IntMaps.fastIterable(p0);
}
}
