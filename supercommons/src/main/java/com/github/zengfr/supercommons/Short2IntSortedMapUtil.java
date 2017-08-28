package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2IntSortedMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(short p0,int p1){
return Short2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(java.lang.Short p0,java.lang.Integer p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(java.lang.Short p0,java.lang.Integer p1){
return Short2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(short p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap p0){
return Short2IntSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap p0,java.lang.Object p1){
return Short2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap p0){
return Short2IntSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.shorts.Short2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap p0){
return Short2IntSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.shorts.Short2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap p0){
return Short2IntSortedMaps.fastIterable(p0);
}
}
