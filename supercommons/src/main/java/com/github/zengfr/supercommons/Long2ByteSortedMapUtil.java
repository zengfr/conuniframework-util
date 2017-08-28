package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ByteSortedMapUtil{ 
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(long p0,byte p1){
return Long2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(java.lang.Long p0,java.lang.Byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(java.lang.Long p0,java.lang.Byte p1){
return Long2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(long p0,byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap p0){
return Long2ByteSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap p0,java.lang.Object p1){
return Long2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap p0){
return Long2ByteSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap p0){
return Long2ByteSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap p0){
return Long2ByteSortedMaps.fastIterable(p0);
}
}
