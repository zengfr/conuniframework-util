package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2FloatSortedMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(short p0,float p1){
return Short2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(java.lang.Short p0,java.lang.Float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(java.lang.Short p0,java.lang.Float p1){
return Short2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(short p0,float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap p0){
return Short2FloatSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap p0,java.lang.Object p1){
return Short2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap p0){
return Short2FloatSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.shorts.Short2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap p0){
return Short2FloatSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.shorts.Short2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap p0){
return Short2FloatSortedMaps.fastIterable(p0);
}
}
