package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2IntSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2IntSortedMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap singleton(int p0,int p1){
return Int2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap singleton(java.lang.Integer p0,java.lang.Integer p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap singleton(java.lang.Integer p0,java.lang.Integer p1){
return Int2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap singleton(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2IntSortedMap p0){
return Int2IntSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2IntSortedMap p0,java.lang.Object p1){
return Int2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2IntSortedMap p0){
return Int2IntSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2IntSortedMap p0){
return Int2IntSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2IntSortedMap p0){
return Int2IntSortedMaps.fastIterable(p0);
}
}
