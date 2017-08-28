package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2ObjectSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> emptyMap(){
return Byte2ObjectSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(java.lang.Byte p0,V p1){
return Byte2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(byte p0,V p1){
return Byte2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(java.lang.Byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> p0){
return Byte2ObjectSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> p0,java.lang.Object p1){
return Byte2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> p0){
return Byte2ObjectSortedMaps.synchronize(p0);
}
}
