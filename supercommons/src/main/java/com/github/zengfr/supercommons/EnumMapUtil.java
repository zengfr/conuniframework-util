package com.github.zengfr.supercommons;
import com.google.common.collect.Maps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumMapUtil{ 
public static <K extends java.lang.Enum<K> ,V> java.util.EnumMap<K, V> newEnumMap(java.util.Map<K, ? extends V> p0){
return Maps.newEnumMap(p0);
}
public static <K extends java.lang.Enum<K> ,V> java.util.EnumMap<K, V> newEnumMap(java.lang.Class<K> p0){
return Maps.newEnumMap(p0);
}
}
