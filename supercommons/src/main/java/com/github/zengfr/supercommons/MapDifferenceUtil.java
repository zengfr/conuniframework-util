package com.github.zengfr.supercommons;
import com.google.common.collect.Maps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MapDifferenceUtil{ 
public static <K,V> com.google.common.collect.MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> p0,java.util.Map<? extends K, ? extends V> p1,com.google.common.base.Equivalence<? super V> p2){
return Maps.difference(p0,p1,p2);
}
public static <K,V> com.google.common.collect.MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> p0,java.util.Map<? extends K, ? extends V> p1){
return Maps.difference(p0,p1);
}
}
