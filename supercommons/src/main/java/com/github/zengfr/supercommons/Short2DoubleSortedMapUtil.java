package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2DoubleSortedMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(short p0,double p1){
return Short2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(java.lang.Short p0,java.lang.Double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(java.lang.Short p0,java.lang.Double p1){
return Short2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(short p0,double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap p0){
return Short2DoubleSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap p0,java.lang.Object p1){
return Short2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap p0){
return Short2DoubleSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.shorts.Short2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap p0){
return Short2DoubleSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.shorts.Short2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap p0){
return Short2DoubleSortedMaps.fastIterable(p0);
}
}
