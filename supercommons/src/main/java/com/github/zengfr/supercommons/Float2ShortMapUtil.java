package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ShortMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ShortMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2ShortMap singleton(float p0,short p1){
return Float2ShortMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortMap singleton(java.lang.Float p0,java.lang.Short p1){
return Float2ShortMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2ShortMap p0){
return Float2ShortMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortMap synchronize(it.unimi.dsi.fastutil.floats.Float2ShortMap p0){
return Float2ShortMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortMap synchronize(it.unimi.dsi.fastutil.floats.Float2ShortMap p0,java.lang.Object p1){
return Float2ShortMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2ShortMap p0){
return Float2ShortMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2ShortMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2ShortMap.Entry> p1){
 Float2ShortMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.floats.Float2ShortMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2ShortMap p0){
return Float2ShortMaps.fastIterable(p0);
}
}
