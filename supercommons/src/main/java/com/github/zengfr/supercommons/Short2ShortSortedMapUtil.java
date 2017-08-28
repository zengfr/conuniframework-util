package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2ShortSortedMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap singleton(short p0,short p1){
return Short2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap singleton(java.lang.Short p0,java.lang.Short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap singleton(java.lang.Short p0,java.lang.Short p1){
return Short2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap singleton(short p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap p0){
return Short2ShortSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap p0,java.lang.Object p1){
return Short2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap p0){
return Short2ShortSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.shorts.Short2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap p0){
return Short2ShortSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.shorts.Short2ShortMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap p0){
return Short2ShortSortedMaps.fastIterable(p0);
}
}
