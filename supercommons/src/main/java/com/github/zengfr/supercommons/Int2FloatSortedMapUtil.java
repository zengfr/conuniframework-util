package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2FloatSortedMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(int p0,float p1){
return Int2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(java.lang.Integer p0,java.lang.Float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(java.lang.Integer p0,java.lang.Float p1){
return Int2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(int p0,float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0){
return Int2FloatSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0,java.lang.Object p1){
return Int2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0){
return Int2FloatSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0){
return Int2FloatSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0){
return Int2FloatSortedMaps.fastIterable(p0);
}
}
