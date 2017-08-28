package com.github.zengfr.supercommons;
import com.google.common.collect.ImmutableMultimap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableMultimapUtil{ 
public static <K,V> com.google.common.collect.ImmutableMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.java.util.Map.Entry<? extends K, ? extends V>> p0){
return ImmutableMultimap.copyOf(p0);
}
public static <K,V> com.google.common.collect.ImmutableMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
return ImmutableMultimap.copyOf(p0);
}
public static <K,V> com.google.common.collect.ImmutableMultimap<K, V> of(){
return ImmutableMultimap.of();
}
public static <K,V> com.google.common.collect.ImmutableMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7){
return ImmutableMultimap.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static <K,V> com.google.common.collect.ImmutableMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9){
return ImmutableMultimap.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
public static <K,V> com.google.common.collect.ImmutableMultimap<K, V> of(K p0,V p1,K p2,V p3){
return ImmutableMultimap.of(p0,p1,p2,p3);
}
public static <K,V> com.google.common.collect.ImmutableMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5){
return ImmutableMultimap.of(p0,p1,p2,p3,p4,p5);
}
public static <K,V> com.google.common.collect.ImmutableMultimap<K, V> of(K p0,V p1){
return ImmutableMultimap.of(p0,p1);
}
}
