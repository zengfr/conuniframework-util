package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2CharSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2CharSortedMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(int p0,char p1){
return Int2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(java.lang.Integer p0,java.lang.Character p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(java.lang.Integer p0,java.lang.Character p1){
return Int2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(int p0,char p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2CharSortedMap p0){
return Int2CharSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2CharSortedMap p0,java.lang.Object p1){
return Int2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2CharSortedMap p0){
return Int2CharSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2CharSortedMap p0){
return Int2CharSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2CharSortedMap p0){
return Int2CharSortedMaps.fastIterable(p0);
}
}
