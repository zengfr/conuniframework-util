package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2IntSortedMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(long p0,int p1){
return Long2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(java.lang.Long p0,java.lang.Integer p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(java.lang.Long p0,java.lang.Integer p1){
return Long2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(long p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2IntSortedMap p0){
return Long2IntSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2IntSortedMap p0,java.lang.Object p1){
return Long2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2IntSortedMap p0){
return Long2IntSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.longs.Long2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2IntSortedMap p0){
return Long2IntSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.longs.Long2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2IntSortedMap p0){
return Long2IntSortedMaps.fastIterable(p0);
}
}
