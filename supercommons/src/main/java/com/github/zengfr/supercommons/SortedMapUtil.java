package com.github.zengfr.supercommons;
import com.google.common.collect.Maps;
import org.apache.commons.io.Charsets;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.map.FixedSizeSortedMap;
import org.apache.commons.collections.map.TransformedSortedMap;
import org.apache.commons.collections.map.LazySortedMap;
import org.apache.commons.collections.map.PredicatedSortedMap;
import org.apache.commons.collections.map.TypedSortedMap;
import org.apache.commons.collections.map.UnmodifiableSortedMap;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.map.UnmodifiableSortedMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedMapUtil{ 
public static <K,V> java.util.SortedMap<K, V> asMap(java.util.SortedSet<K> p0,com.google.common.base.Function<? super K, V> p1){
return Maps.asMap(p0,p1);
}
public static <K,V> java.util.SortedMap<K, V> filterEntries(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map.java.util.Map.Entry<K, V>> p1){
return Maps.filterEntries(p0,p1);
}
public static <K,V> java.util.SortedMap<K, V> filterValues(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
return Maps.filterValues(p0,p1);
}
public static <K,V1,V2> java.util.SortedMap<K, V2> transformEntries(java.util.SortedMap<K, V1> p0,EntryTransformer<? super K, ? super V1, V2> p1){
return Maps.transformEntries(p0,p1);
}
public static <K,V1,V2> java.util.SortedMap<K, V2> transformValues(java.util.SortedMap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
return Maps.transformValues(p0,p1);
}
public static <K,V> java.util.SortedMap<K, V> filterKeys(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
return Maps.filterKeys(p0,p1);
}
public static java.util.SortedMap<java.lang.String, java.nio.charset.Charset> requiredCharsets(){
return Charsets.requiredCharsets();
}
public static java.util.Map synchronizedSortedMap(java.util.SortedMap p0){
return MapUtils.synchronizedSortedMap(p0);
}
public static java.util.Map unmodifiableSortedMap(java.util.SortedMap p0){
return MapUtils.unmodifiableSortedMap(p0);
}
public static java.util.SortedMap lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Factory p1){
return MapUtils.lazySortedMap(p0,p1);
}
public static java.util.SortedMap lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1){
return MapUtils.lazySortedMap(p0,p1);
}
public static java.util.SortedMap typedSortedMap(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2){
return MapUtils.typedSortedMap(p0,p1,p2);
}
public static java.util.SortedMap predicatedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
return MapUtils.predicatedSortedMap(p0,p1,p2);
}
public static java.util.SortedMap fixedSizeSortedMap(java.util.SortedMap p0){
return MapUtils.fixedSizeSortedMap(p0);
}
public static java.util.SortedMap transformedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return MapUtils.transformedSortedMap(p0,p1,p2);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0){
return FixedSizeSortedMap.decorate(p0);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return TransformedSortedMap.decorate(p0,p1,p2);
}
public static java.util.SortedMap decorateTransform(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return TransformedSortedMap.decorateTransform(p0,p1,p2);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Factory p1){
return LazySortedMap.decorate(p0,p1);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1){
return LazySortedMap.decorate(p0,p1);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
return PredicatedSortedMap.decorate(p0,p1,p2);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2){
return TypedSortedMap.decorate(p0,p1,p2);
}
public static <K,V> java.util.SortedMap<K, V> synchronizedSortedMap(java.util.SortedMap<K, V> p0){
return MapUtils.synchronizedSortedMap(p0);
}
public static <K,V> java.util.SortedMap<K, V> unmodifiableSortedMap(java.util.SortedMap<K, ? extends V> p0){
return MapUtils.unmodifiableSortedMap(p0);
}
public static <K,V> java.util.SortedMap<K, V> lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
return MapUtils.lazySortedMap(p0,p1);
}
public static <K,V> java.util.SortedMap<K, V> lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
return MapUtils.lazySortedMap(p0,p1);
}
public static <K,V> java.util.SortedMap<K, V> predicatedSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Predicate<? super K> p1,org.apache.commons.collections4.Predicate<? super V> p2){
return MapUtils.predicatedSortedMap(p0,p1,p2);
}
public static <K,V> java.util.SortedMap<K, V> fixedSizeSortedMap(java.util.SortedMap<K, V> p0){
return MapUtils.fixedSizeSortedMap(p0);
}
public static <K,V> java.util.SortedMap<K, V> transformedSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
return MapUtils.transformedSortedMap(p0,p1,p2);
}
}
