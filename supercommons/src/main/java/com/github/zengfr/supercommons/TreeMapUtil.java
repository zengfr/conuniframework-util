package com.zengfr.supercommons;
import com.google.common.collect.Maps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeMapUtil{ 
public static <K,V> java.util.TreeMap<K, V> newTreeMap(java.util.SortedMap<K, ? extends V> p0){
return Maps.newTreeMap(p0);
}
public static <K extends java.lang.Comparable ,V> java.util.TreeMap<K, V> newTreeMap(){
return Maps.newTreeMap();
}
public static <C,K,V> java.util.TreeMap<K, V> newTreeMap(java.util.Comparator<C> p0){
return Maps.newTreeMap(p0);
}
}
