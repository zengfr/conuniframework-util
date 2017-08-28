package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2LongMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2LongMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2LongMap singleton(float p0,long p1){
return Float2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongMap singleton(java.lang.Float p0,java.lang.Long p1){
return Float2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2LongMap p0){
return Float2LongMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2LongMap synchronize(it.unimi.dsi.fastutil.floats.Float2LongMap p0){
return Float2LongMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2LongMap synchronize(it.unimi.dsi.fastutil.floats.Float2LongMap p0,java.lang.Object p1){
return Float2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2LongMap p0){
return Float2LongMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2LongMap.Entry> p1){
 Float2LongMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.floats.Float2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2LongMap p0){
return Float2LongMaps.fastIterable(p0);
}
}
