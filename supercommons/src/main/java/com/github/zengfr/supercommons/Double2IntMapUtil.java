package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2IntMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2IntMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2IntMap singleton(double p0,int p1){
return Double2IntMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntMap singleton(java.lang.Double p0,java.lang.Integer p1){
return Double2IntMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2IntMap p0){
return Double2IntMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntMap synchronize(it.unimi.dsi.fastutil.doubles.Double2IntMap p0){
return Double2IntMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntMap synchronize(it.unimi.dsi.fastutil.doubles.Double2IntMap p0,java.lang.Object p1){
return Double2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2IntMap p0){
return Double2IntMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2IntMap.Entry> p1){
 Double2IntMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.doubles.Double2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2IntMap p0){
return Double2IntMaps.fastIterable(p0);
}
}
