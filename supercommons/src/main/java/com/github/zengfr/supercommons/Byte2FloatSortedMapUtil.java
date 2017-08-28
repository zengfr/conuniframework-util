package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2FloatSortedMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(byte p0,float p1){
return Byte2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(java.lang.Byte p0,java.lang.Float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(java.lang.Byte p0,java.lang.Float p1){
return Byte2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(byte p0,float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap p0){
return Byte2FloatSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap p0,java.lang.Object p1){
return Byte2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap p0){
return Byte2FloatSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.bytes.Byte2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap p0){
return Byte2FloatSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.bytes.Byte2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap p0){
return Byte2FloatSortedMaps.fastIterable(p0);
}
}
