package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2LongSortedMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(short p0,long p1){
return Short2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(java.lang.Short p0,java.lang.Long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(java.lang.Short p0,java.lang.Long p1){
return Short2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(short p0,long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap p0){
return Short2LongSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap p0,java.lang.Object p1){
return Short2LongSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap p0){
return Short2LongSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.shorts.Short2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap p0){
return Short2LongSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.shorts.Short2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap p0){
return Short2LongSortedMaps.fastIterable(p0);
}
}
