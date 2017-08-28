package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2BooleanSortedMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(int p0,boolean p1){
return Int2BooleanSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(java.lang.Integer p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(java.lang.Integer p0,java.lang.Boolean p1){
return Int2BooleanSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(int p0,boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap p0){
return Int2BooleanSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap p0,java.lang.Object p1){
return Int2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap p0){
return Int2BooleanSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap p0){
return Int2BooleanSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap p0){
return Int2BooleanSortedMaps.fastIterable(p0);
}
}
