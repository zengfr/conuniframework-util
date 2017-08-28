package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2CharSortedMapUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(byte p0,char p1){
return Byte2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(java.lang.Byte p0,java.lang.Character p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(java.lang.Byte p0,java.lang.Character p1){
return Byte2CharSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(byte p0,char p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap p0){
return Byte2CharSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap p0,java.lang.Object p1){
return Byte2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap p0){
return Byte2CharSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.bytes.Byte2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap p0){
return Byte2CharSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.bytes.Byte2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap p0){
return Byte2CharSortedMaps.fastIterable(p0);
}
}
