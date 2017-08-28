package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2LongSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2LongSortedMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(long p0,long p1){
return Long2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(java.lang.Long p0,java.lang.Long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(java.lang.Long p0,java.lang.Long p1){
return Long2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0){
return Long2LongSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0,java.lang.Object p1){
return Long2LongSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0){
return Long2LongSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.longs.Long2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0){
return Long2LongSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.longs.Long2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0){
return Long2LongSortedMaps.fastIterable(p0);
}
}
