package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Double2CharSortedMapUtil{ 
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(double p0,char p1){
return Double2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(java.lang.Double p0,java.lang.Character p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(java.lang.Double p0,java.lang.Character p1){
return Double2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(double p0,char p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap unmodifiable(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap p0){
return Double2CharSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap p0,java.lang.Object p1){
return Double2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap p0){
return Double2CharSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.doubles.Double2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap p0){
return Double2CharSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.doubles.Double2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap p0){
return Double2CharSortedMaps.fastIterable(p0);
}
}
