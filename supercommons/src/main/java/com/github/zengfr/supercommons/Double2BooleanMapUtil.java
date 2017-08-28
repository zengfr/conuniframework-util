package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2BooleanMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2BooleanMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanMap singleton(double p0,boolean p1){
return Double2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanMap singleton(java.lang.Double p0,java.lang.Boolean p1){
return Double2BooleanMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0){
return Double2BooleanMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanMap synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0){
return Double2BooleanMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanMap synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0,java.lang.Object p1){
return Double2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0){
return Double2BooleanMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2BooleanMap.Entry> p1){
 Double2BooleanMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.doubles.Double2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0){
return Double2BooleanMaps.fastIterable(p0);
}
}
