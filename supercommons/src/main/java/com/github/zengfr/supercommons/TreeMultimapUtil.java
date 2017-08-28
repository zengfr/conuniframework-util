package com.zengfr.supercommons;
import com.google.common.collect.TreeMultimap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeMultimapUtil{ 
public static <K extends java.lang.Comparable ,V extends java.lang.Comparable > com.google.common.collect.TreeMultimap<K, V> create(){
return TreeMultimap.create();
}
public static <K,V> com.google.common.collect.TreeMultimap<K, V> create(java.util.Comparator<? super K> p0,java.util.Comparator<? super V> p1){
return TreeMultimap.create(p0,p1);
}
public static <K extends java.lang.Comparable ,V extends java.lang.Comparable > com.google.common.collect.TreeMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
return TreeMultimap.create(p0);
}
}
