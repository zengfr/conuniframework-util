package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2DoubleSortedMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(byte p0,double p1){
return Byte2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(java.lang.Byte p0,java.lang.Double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(java.lang.Byte p0,java.lang.Double p1){
return Byte2DoubleSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(byte p0,double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap p0){
return Byte2DoubleSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap p0,java.lang.Object p1){
return Byte2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap p0){
return Byte2DoubleSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.bytes.Byte2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap p0){
return Byte2DoubleSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.bytes.Byte2DoubleMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap p0){
return Byte2DoubleSortedMaps.fastIterable(p0);
}
}
