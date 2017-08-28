package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2ShortSortedMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(float p0,short p1){
return Float2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(java.lang.Float p0,java.lang.Short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(java.lang.Float p0,java.lang.Short p1){
return Float2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(float p0,short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap p0){
return Float2ShortSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap p0,java.lang.Object p1){
return Float2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap p0){
return Float2ShortSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.floats.Float2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap p0){
return Float2ShortSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.floats.Float2ShortMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap p0){
return Float2ShortSortedMaps.fastIterable(p0);
}
}
