package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2BooleanSortedMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(byte p0,boolean p1){
return Byte2BooleanSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(java.lang.Byte p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(java.lang.Byte p0,java.lang.Boolean p1){
return Byte2BooleanSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(byte p0,boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap p0){
return Byte2BooleanSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap p0,java.lang.Object p1){
return Byte2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap p0){
return Byte2BooleanSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.bytes.Byte2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap p0){
return Byte2BooleanSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.bytes.Byte2BooleanMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap p0){
return Byte2BooleanSortedMaps.fastIterable(p0);
}
}
