package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2DoubleMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2DoubleMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2DoubleMap singleton(float p0,double p1){
return Float2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleMap singleton(java.lang.Float p0,java.lang.Double p1){
return Float2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0){
return Float2DoubleMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleMap synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0){
return Float2DoubleMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleMap synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0,java.lang.Object p1){
return Float2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0){
return Float2DoubleMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2DoubleMap.Entry> p1){
 Float2DoubleMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.floats.Float2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0){
return Float2DoubleMaps.fastIterable(p0);
}
}
