package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2LongMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2LongMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2LongMap singleton(double p0,long p1){
return Double2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongMap singleton(java.lang.Double p0,java.lang.Long p1){
return Double2LongMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2LongMap p0){
return Double2LongMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongMap synchronize(it.unimi.dsi.fastutil.doubles.Double2LongMap p0){
return Double2LongMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongMap synchronize(it.unimi.dsi.fastutil.doubles.Double2LongMap p0,java.lang.Object p1){
return Double2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2LongMap p0){
return Double2LongMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2LongMap.Entry> p1){
 Double2LongMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.doubles.Double2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2LongMap p0){
return Double2LongMaps.fastIterable(p0);
}
}
