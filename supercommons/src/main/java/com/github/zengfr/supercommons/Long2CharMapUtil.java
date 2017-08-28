package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2CharMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2CharMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2CharMap singleton(long p0,char p1){
return Long2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharMap singleton(java.lang.Long p0,java.lang.Character p1){
return Long2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2CharMap p0){
return Long2CharMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2CharMap synchronize(it.unimi.dsi.fastutil.longs.Long2CharMap p0){
return Long2CharMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2CharMap synchronize(it.unimi.dsi.fastutil.longs.Long2CharMap p0,java.lang.Object p1){
return Long2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2CharMap p0){
return Long2CharMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2CharMap.Entry> p1){
 Long2CharMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.longs.Long2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2CharMap p0){
return Long2CharMaps.fastIterable(p0);
}
}
