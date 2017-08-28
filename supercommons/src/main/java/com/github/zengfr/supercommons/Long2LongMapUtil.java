package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2LongMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2LongMap singleton(long p0,long p1){
return Long2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongMap singleton(java.lang.Long p0,java.lang.Long p1){
return Long2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2LongMap p0){
return Long2LongMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2LongMap synchronize(it.unimi.dsi.fastutil.longs.Long2LongMap p0){
return Long2LongMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2LongMap synchronize(it.unimi.dsi.fastutil.longs.Long2LongMap p0,java.lang.Object p1){
return Long2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2LongMap p0){
return Long2LongMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2LongMap.Entry> p1){
 Long2LongMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.longs.Long2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2LongMap p0){
return Long2LongMaps.fastIterable(p0);
}
}
