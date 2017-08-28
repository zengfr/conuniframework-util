package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2IntSortedMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(byte p0,int p1){
return Byte2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(java.lang.Byte p0,java.lang.Integer p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(java.lang.Byte p0,java.lang.Integer p1){
return Byte2IntSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(byte p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap p0){
return Byte2IntSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap p0,java.lang.Object p1){
return Byte2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap p0){
return Byte2IntSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.bytes.Byte2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap p0){
return Byte2IntSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.bytes.Byte2IntMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap p0){
return Byte2IntSortedMaps.fastIterable(p0);
}
}
