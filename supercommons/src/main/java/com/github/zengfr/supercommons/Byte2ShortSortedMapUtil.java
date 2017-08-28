package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2ShortSortedMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(byte p0,short p1){
return Byte2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(java.lang.Byte p0,java.lang.Short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(java.lang.Byte p0,java.lang.Short p1){
return Byte2ShortSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(byte p0,short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap p0){
return Byte2ShortSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap p0,java.lang.Object p1){
return Byte2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap p0){
return Byte2ShortSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.bytes.Byte2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap p0){
return Byte2ShortSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.bytes.Byte2ShortMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap p0){
return Byte2ShortSortedMaps.fastIterable(p0);
}
}
