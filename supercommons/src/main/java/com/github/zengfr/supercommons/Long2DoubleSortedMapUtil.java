package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2DoubleSortedMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(long p0,double p1){
return Long2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(java.lang.Long p0,java.lang.Double p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(java.lang.Long p0,java.lang.Double p1){
return Long2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(long p0,double p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap p0){
return Long2DoubleSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap p0,java.lang.Object p1){
return Long2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap p0){
return Long2DoubleSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.longs.Long2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap p0){
return Long2DoubleSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.longs.Long2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap p0){
return Long2DoubleSortedMaps.fastIterable(p0);
}
}
