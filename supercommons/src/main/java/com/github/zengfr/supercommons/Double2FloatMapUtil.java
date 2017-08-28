package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2FloatMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2FloatMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2FloatMap singleton(double p0,float p1){
return Double2FloatMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatMap singleton(java.lang.Double p0,java.lang.Float p1){
return Double2FloatMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0){
return Double2FloatMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatMap synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0){
return Double2FloatMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatMap synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0,java.lang.Object p1){
return Double2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0){
return Double2FloatMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2FloatMap.Entry> p1){
 Double2FloatMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.doubles.Double2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0){
return Double2FloatMaps.fastIterable(p0);
}
}
