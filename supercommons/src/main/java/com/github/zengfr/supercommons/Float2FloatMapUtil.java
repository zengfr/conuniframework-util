package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2FloatMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2FloatMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2FloatMap singleton(float p0,float p1){
return Float2FloatMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatMap singleton(java.lang.Float p0,java.lang.Float p1){
return Float2FloatMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2FloatMap p0){
return Float2FloatMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatMap synchronize(it.unimi.dsi.fastutil.floats.Float2FloatMap p0){
return Float2FloatMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatMap synchronize(it.unimi.dsi.fastutil.floats.Float2FloatMap p0,java.lang.Object p1){
return Float2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2FloatMap p0){
return Float2FloatMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2FloatMap.Entry> p1){
 Float2FloatMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.floats.Float2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2FloatMap p0){
return Float2FloatMaps.fastIterable(p0);
}
}
