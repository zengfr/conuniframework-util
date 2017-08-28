package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2ReferenceSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> emptyMap(){
return Byte2ReferenceSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> singleton(java.lang.Byte p0,V p1){
return Byte2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> singleton(byte p0,V p1){
return Byte2ReferenceSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> singleton(java.lang.Byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> singleton(byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ReferenceSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> p0){
return Byte2ReferenceSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Byte2ReferenceSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> p0){
return Byte2ReferenceSortedMaps.synchronize(p0);
}
}
