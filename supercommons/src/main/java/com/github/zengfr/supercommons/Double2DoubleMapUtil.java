package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2DoubleMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2DoubleMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2DoubleMap singleton(double p0,double p1){
return Double2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleMap singleton(java.lang.Double p0,java.lang.Double p1){
return Double2DoubleMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0){
return Double2DoubleMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleMap synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0){
return Double2DoubleMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleMap synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0,java.lang.Object p1){
return Double2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0){
return Double2DoubleMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2DoubleMap.Entry> p1){
 Double2DoubleMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.doubles.Double2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0){
return Double2DoubleMaps.fastIterable(p0);
}
}
