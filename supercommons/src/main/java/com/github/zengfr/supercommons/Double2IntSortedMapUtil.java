package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2IntSortedMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(double p0,int p1){
return Double2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(java.lang.Double p0,java.lang.Integer p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(java.lang.Double p0,java.lang.Integer p1){
return Double2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(double p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap p0){
return Double2IntSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap p0,java.lang.Object p1){
return Double2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap p0){
return Double2IntSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.doubles.Double2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap p0){
return Double2IntSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.doubles.Double2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap p0){
return Double2IntSortedMaps.fastIterable(p0);
}
}
