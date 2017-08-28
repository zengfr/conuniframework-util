package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2DoubleSortedMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(float p0,double p1){
return Float2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(java.lang.Float p0,java.lang.Double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(java.lang.Float p0,java.lang.Double p1){
return Float2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(float p0,double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap p0){
return Float2DoubleSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap p0,java.lang.Object p1){
return Float2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap p0){
return Float2DoubleSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.floats.Float2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap p0){
return Float2DoubleSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.floats.Float2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap p0){
return Float2DoubleSortedMaps.fastIterable(p0);
}
}
