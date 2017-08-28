package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2DoubleSortedMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap singleton(double p0,double p1){
return Double2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap singleton(java.lang.Double p0,java.lang.Double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap singleton(java.lang.Double p0,java.lang.Double p1){
return Double2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap singleton(double p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap p0){
return Double2DoubleSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap p0,java.lang.Object p1){
return Double2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap p0){
return Double2DoubleSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.doubles.Double2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap p0){
return Double2DoubleSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.doubles.Double2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap p0){
return Double2DoubleSortedMaps.fastIterable(p0);
}
}
