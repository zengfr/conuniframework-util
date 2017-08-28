package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2CharSortedMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(short p0,char p1){
return Short2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(java.lang.Short p0,java.lang.Character p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(java.lang.Short p0,java.lang.Character p1){
return Short2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(short p0,char p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap p0){
return Short2CharSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap p0,java.lang.Object p1){
return Short2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap p0){
return Short2CharSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.shorts.Short2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap p0){
return Short2CharSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.shorts.Short2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap p0){
return Short2CharSortedMaps.fastIterable(p0);
}
}
