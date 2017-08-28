package com.github.zengfr.supercommons;
import com.google.common.collect.EnumBiMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumBiMapUtil{ 
public static <K extends java.lang.Enum<K> ,V extends java.lang.Enum<V> > com.google.common.collect.EnumBiMap<K, V> create(java.util.Map<K, V> p0){
return EnumBiMap.create(p0);
}
public static <K extends java.lang.Enum<K> ,V extends java.lang.Enum<V> > com.google.common.collect.EnumBiMap<K, V> create(java.lang.Class<K> p0,java.lang.Class<V> p1){
return EnumBiMap.create(p0,p1);
}
}
