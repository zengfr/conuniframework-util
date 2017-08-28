package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ShortSortedMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(long p0,short p1){
return Long2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(java.lang.Long p0,java.lang.Short p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(java.lang.Long p0,java.lang.Short p1){
return Long2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(long p0,short p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap p0){
return Long2ShortSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap p0,java.lang.Object p1){
return Long2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap p0){
return Long2ShortSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.longs.Long2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap p0){
return Long2ShortSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.longs.Long2ShortMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap p0){
return Long2ShortSortedMaps.fastIterable(p0);
}
}
