package com.zengfr.supercommons;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Multimaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableListMultimapUtil{ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.java.util.Map.Entry<? extends K, ? extends V>> p0){
return ImmutableListMultimap.copyOf(p0);
}
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
return ImmutableListMultimap.copyOf(p0);
}
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(){
return ImmutableListMultimap.of();
}
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9){
return ImmutableListMultimap.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1){
return ImmutableListMultimap.of(p0,p1);
}
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7){
return ImmutableListMultimap.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5){
return ImmutableListMultimap.of(p0,p1,p2,p3,p4,p5);
}
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3){
return ImmutableListMultimap.of(p0,p1,p2,p3);
}
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.lang.Iterable<V> p0,com.google.common.base.Function<? super V, K> p1){
return Multimaps.index(p0,p1);
}
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.util.Iterator<V> p0,com.google.common.base.Function<? super V, K> p1){
return Multimaps.index(p0,p1);
}
}
