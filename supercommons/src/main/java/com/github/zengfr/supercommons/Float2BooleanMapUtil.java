package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2BooleanMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2BooleanMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanMap singleton(float p0,boolean p1){
return Float2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanMap singleton(java.lang.Float p0,java.lang.Boolean p1){
return Float2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0){
return Float2BooleanMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanMap synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0){
return Float2BooleanMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanMap synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0,java.lang.Object p1){
return Float2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0){
return Float2BooleanMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2BooleanMap.Entry> p1){
 Float2BooleanMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.floats.Float2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0){
return Float2BooleanMaps.fastIterable(p0);
}
}
