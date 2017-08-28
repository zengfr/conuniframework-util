package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2LongSortedMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(byte p0,long p1){
return Byte2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(java.lang.Byte p0,java.lang.Long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(java.lang.Byte p0,java.lang.Long p1){
return Byte2LongSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(byte p0,long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap p0){
return Byte2LongSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap p0,java.lang.Object p1){
return Byte2LongSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap p0){
return Byte2LongSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.bytes.Byte2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap p0){
return Byte2LongSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.bytes.Byte2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap p0){
return Byte2LongSortedMaps.fastIterable(p0);
}
}
