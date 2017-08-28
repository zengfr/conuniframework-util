package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2ShortMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ShortMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2ShortMap singleton(int p0,short p1){
return Int2ShortMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortMap singleton(java.lang.Integer p0,java.lang.Short p1){
return Int2ShortMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2ShortMap p0){
return Int2ShortMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortMap synchronize(it.unimi.dsi.fastutil.ints.Int2ShortMap p0){
return Int2ShortMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortMap synchronize(it.unimi.dsi.fastutil.ints.Int2ShortMap p0,java.lang.Object p1){
return Int2ShortMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2ShortMap p0){
return Int2ShortMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2ShortMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2ShortMap.Entry> p1){
 Int2ShortMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.ints.Int2ShortMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2ShortMap p0){
return Int2ShortMaps.fastIterable(p0);
}
}
