package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2FloatMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2FloatMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2FloatMap singleton(long p0,float p1){
return Long2FloatMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatMap singleton(java.lang.Long p0,java.lang.Float p1){
return Long2FloatMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2FloatMap p0){
return Long2FloatMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatMap synchronize(it.unimi.dsi.fastutil.longs.Long2FloatMap p0){
return Long2FloatMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatMap synchronize(it.unimi.dsi.fastutil.longs.Long2FloatMap p0,java.lang.Object p1){
return Long2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2FloatMap p0){
return Long2FloatMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2FloatMap.Entry> p1){
 Long2FloatMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.longs.Long2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2FloatMap p0){
return Long2FloatMaps.fastIterable(p0);
}
}
