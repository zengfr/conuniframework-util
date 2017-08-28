package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2BooleanSortedMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(long p0,boolean p1){
return Long2BooleanSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(java.lang.Long p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(java.lang.Long p0,java.lang.Boolean p1){
return Long2BooleanSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(long p0,boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap p0){
return Long2BooleanSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap p0,java.lang.Object p1){
return Long2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap p0){
return Long2BooleanSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.longs.Long2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap p0){
return Long2BooleanSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.longs.Long2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap p0){
return Long2BooleanSortedMaps.fastIterable(p0);
}
}
