package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2ShortSortedMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(double p0,short p1){
return Double2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(java.lang.Double p0,java.lang.Short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(java.lang.Double p0,java.lang.Short p1){
return Double2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(double p0,short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap p0){
return Double2ShortSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap p0,java.lang.Object p1){
return Double2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap p0){
return Double2ShortSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.doubles.Double2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap p0){
return Double2ShortSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.doubles.Double2ShortMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap p0){
return Double2ShortSortedMaps.fastIterable(p0);
}
}
