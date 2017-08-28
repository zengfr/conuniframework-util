package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2IntSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2IntSortedMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(float p0,int p1){
return Float2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(java.lang.Float p0,java.lang.Integer p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(java.lang.Float p0,java.lang.Integer p1){
return Float2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(float p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2IntSortedMap p0){
return Float2IntSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2IntSortedMap p0,java.lang.Object p1){
return Float2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2IntSortedMap p0){
return Float2IntSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.floats.Float2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2IntSortedMap p0){
return Float2IntSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.floats.Float2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2IntSortedMap p0){
return Float2IntSortedMaps.fastIterable(p0);
}
}
