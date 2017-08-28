package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2FloatSortedMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(long p0,float p1){
return Long2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(java.lang.Long p0,java.lang.Float p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(java.lang.Long p0,java.lang.Float p1){
return Long2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(long p0,float p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap p0){
return Long2FloatSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap p0,java.lang.Object p1){
return Long2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap p0){
return Long2FloatSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.longs.Long2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap p0){
return Long2FloatSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.longs.Long2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap p0){
return Long2FloatSortedMaps.fastIterable(p0);
}
}
