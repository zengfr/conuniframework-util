package com.zengfr.supercommons;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMapFauxverideShim;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultisetFauxverideShim;
import com.google.common.collect.ImmutableSortedSetFauxverideShim;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.MinMaxPriorityQueue;
import com.google.common.escape.Escapers;
import com.google.common.reflect.ImmutableTypeToInstanceMap;
import org.apache.commons.collections4.collection.PredicatedCollection;
import org.apache.commons.text.StringEscapeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BuilderUtil{ 
public static <E> com.google.common.collect.ImmutableSortedSet.com.google.common.collect.ImmutableSortedSet.Builder<E> builder(){
return ContiguousSet.builder();
}
public static <E extends java.lang.Comparable<?> > Builder<E> naturalOrder(){
return ImmutableSortedSet.naturalOrder();
}
public static <E extends java.lang.Comparable<?> > Builder<E> reverseOrder(){
return ImmutableSortedSet.reverseOrder();
}
public static <E> Builder<E> orderedBy(java.util.Comparator<E> p0){
return ImmutableSortedSet.orderedBy(p0);
}
public static <K,V> Builder<K, V> orderedBy(java.util.Comparator<K> p0){
return ImmutableSortedMap.orderedBy(p0);
}
public static Builder<java.lang.Comparable> maximumSize(int p0){
return MinMaxPriorityQueue.maximumSize(p0);
}
public static Builder<java.lang.Comparable> expectedSize(int p0){
return MinMaxPriorityQueue.expectedSize(p0);
}
public static <B> Builder<B> orderedBy(java.util.Comparator<B> p0){
return MinMaxPriorityQueue.orderedBy(p0);
}
public static <E> Builder<E> builder(org.apache.commons.collections4.Predicate<? super E> p0){
return PredicatedCollection.builder(p0);
}
public static <E> Builder<E> notNullBuilder(){
return PredicatedCollection.notNullBuilder();
}
public static Builder builder(org.apache.commons.text.translate.CharSequenceTranslator p0){
return StringEscapeUtils.builder(p0);
}
}
