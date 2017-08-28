package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2CharSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2CharSortedMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(long p0,char p1){
return Long2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(java.lang.Long p0,java.lang.Character p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(java.lang.Long p0,java.lang.Character p1){
return Long2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(long p0,char p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2CharSortedMap p0){
return Long2CharSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2CharSortedMap p0,java.lang.Object p1){
return Long2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2CharSortedMap p0){
return Long2CharSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.longs.Long2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2CharSortedMap p0){
return Long2CharSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.longs.Long2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2CharSortedMap p0){
return Long2CharSortedMaps.fastIterable(p0);
}
}
