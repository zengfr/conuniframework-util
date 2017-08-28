package com.zengfr.supercommons;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMapFauxverideShim;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableSortedMapUtil{ 
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> p0){
return ImmutableSortedMap.copyOf(p0);
}
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> p0,java.util.Comparator<? super K> p1){
return ImmutableSortedMap.copyOf(p0,p1);
}
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.java.util.Map.Entry<? extends K, ? extends V>> p0){
return ImmutableSortedMap.copyOf(p0);
}
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.java.util.Map.Entry<? extends K, ? extends V>> p0,java.util.Comparator<? super K> p1){
return ImmutableSortedMap.copyOf(p0,p1);
}
public static <K extends java.lang.Comparable<? super K> ,V> com.google.common.collect.ImmutableSortedMap<K, V> of(K p0,V p1,K p2,V p3){
return ImmutableSortedMap.of(p0,p1,p2,p3);
}
public static <K extends java.lang.Comparable<? super K> ,V> com.google.common.collect.ImmutableSortedMap<K, V> of(K p0,V p1){
return ImmutableSortedMap.of(p0,p1);
}
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> of(){
return ImmutableSortedMap.of();
}
public static <K extends java.lang.Comparable<? super K> ,V> com.google.common.collect.ImmutableSortedMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9){
return ImmutableSortedMap.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
public static <K extends java.lang.Comparable<? super K> ,V> com.google.common.collect.ImmutableSortedMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7){
return ImmutableSortedMap.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static <K extends java.lang.Comparable<? super K> ,V> com.google.common.collect.ImmutableSortedMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5){
return ImmutableSortedMap.of(p0,p1,p2,p3,p4,p5);
}
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfSorted(java.util.SortedMap<K, ? extends V> p0){
return ImmutableSortedMap.copyOfSorted(p0);
}
}
