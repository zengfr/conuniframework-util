package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2BooleanMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2BooleanMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanMap singleton(long p0,boolean p1){
return Long2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanMap singleton(java.lang.Long p0,java.lang.Boolean p1){
return Long2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0){
return Long2BooleanMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanMap synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0){
return Long2BooleanMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanMap synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0,java.lang.Object p1){
return Long2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0){
return Long2BooleanMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2BooleanMap.Entry> p1){
 Long2BooleanMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.longs.Long2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0){
return Long2BooleanMaps.fastIterable(p0);
}
}
