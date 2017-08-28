package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2ShortSortedMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(int p0,short p1){
return Int2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(java.lang.Integer p0,java.lang.Short p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(java.lang.Integer p0,java.lang.Short p1){
return Int2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(int p0,short p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap p0){
return Int2ShortSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap p0,java.lang.Object p1){
return Int2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap p0){
return Int2ShortSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap p0){
return Int2ShortSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2ShortMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap p0){
return Int2ShortSortedMaps.fastIterable(p0);
}
}
