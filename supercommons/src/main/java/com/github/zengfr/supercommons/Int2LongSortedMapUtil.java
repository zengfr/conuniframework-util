package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2LongSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2LongSortedMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(int p0,long p1){
return Int2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(java.lang.Integer p0,java.lang.Long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(java.lang.Integer p0,java.lang.Long p1){
return Int2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(int p0,long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0){
return Int2LongSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0,java.lang.Object p1){
return Int2LongSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0){
return Int2LongSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0){
return Int2LongSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0){
return Int2LongSortedMaps.fastIterable(p0);
}
}
