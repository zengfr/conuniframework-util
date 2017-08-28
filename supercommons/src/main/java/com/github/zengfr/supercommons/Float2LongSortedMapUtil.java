package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2LongSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2LongSortedMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(float p0,long p1){
return Float2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(java.lang.Float p0,java.lang.Long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(java.lang.Float p0,java.lang.Long p1){
return Float2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(float p0,long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2LongSortedMap p0){
return Float2LongSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2LongSortedMap p0,java.lang.Object p1){
return Float2LongSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2LongSortedMap p0){
return Float2LongSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.floats.Float2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2LongSortedMap p0){
return Float2LongSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.floats.Float2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2LongSortedMap p0){
return Float2LongSortedMaps.fastIterable(p0);
}
}
