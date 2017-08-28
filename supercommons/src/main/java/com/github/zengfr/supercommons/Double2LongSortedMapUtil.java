package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2LongSortedMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(double p0,long p1){
return Double2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(java.lang.Double p0,java.lang.Long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(java.lang.Double p0,java.lang.Long p1){
return Double2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(double p0,long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap p0){
return Double2LongSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap p0,java.lang.Object p1){
return Double2LongSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap p0){
return Double2LongSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.doubles.Double2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap p0){
return Double2LongSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.doubles.Double2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap p0){
return Double2LongSortedMaps.fastIterable(p0);
}
}
