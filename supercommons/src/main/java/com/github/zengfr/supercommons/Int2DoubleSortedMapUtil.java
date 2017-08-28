package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Int2DoubleSortedMapUtil{ 
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(int p0,double p1){
return Int2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(java.lang.Integer p0,java.lang.Double p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(java.lang.Integer p0,java.lang.Double p1){
return Int2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(int p0,double p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap p0){
return Int2DoubleSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap p0,java.lang.Object p1){
return Int2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap p0){
return Int2DoubleSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap p0){
return Int2DoubleSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap p0){
return Int2DoubleSortedMaps.fastIterable(p0);
}
}
