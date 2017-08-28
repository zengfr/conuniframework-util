package com.github.zengfr.supercommons;
import com.google.common.collect.Maps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedMapDifferenceUtil{ 
public static <K,V> com.google.common.collect.SortedMapDifference<K, V> difference(java.util.SortedMap<K, ? extends V> p0,java.util.Map<? extends K, ? extends V> p1){
return Maps.difference(p0,p1);
}
}
