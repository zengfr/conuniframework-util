package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2FloatSortedMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(double p0,float p1){
return Double2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(java.lang.Double p0,java.lang.Float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(java.lang.Double p0,java.lang.Float p1){
return Double2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(double p0,float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap p0){
return Double2FloatSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap p0,java.lang.Object p1){
return Double2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap p0){
return Double2FloatSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.doubles.Double2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap p0){
return Double2FloatSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.doubles.Double2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap p0){
return Double2FloatSortedMaps.fastIterable(p0);
}
}
