package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2CharSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2CharSortedMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(float p0,char p1){
return Float2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(java.lang.Float p0,java.lang.Character p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(java.lang.Float p0,java.lang.Character p1){
return Float2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(float p0,char p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2CharSortedMap p0){
return Float2CharSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2CharSortedMap p0,java.lang.Object p1){
return Float2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2CharSortedMap p0){
return Float2CharSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.floats.Float2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2CharSortedMap p0){
return Float2CharSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.floats.Float2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2CharSortedMap p0){
return Float2CharSortedMaps.fastIterable(p0);
}
}
