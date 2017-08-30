package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BuilderUtil{ 
/**
*public static <E> com.google.common.collect.ImmutableSortedSet.com.google.common.collect.ImmutableSortedSet$Builder<E> com.google.common.collect.ContiguousSet.builder()
*/ 
public static <E> Builder<E> builder(){
	return com.google.common.collect.ContiguousSet.builder();
}
/**
*public static <E> com.google.common.collect.ImmutableSortedSet.com.google.common.collect.ImmutableSortedSet$Builder<E> com.google.common.collect.ImmutableSortedSet.naturalOrder()
*/ 
public static <E extends java.lang.Comparable<?> > Builder<E> naturalOrder(){
	return com.google.common.collect.ImmutableSortedSet.naturalOrder();
}
/**
*public static <E> com.google.common.collect.ImmutableSortedSet.com.google.common.collect.ImmutableSortedSet$Builder<E> com.google.common.collect.ImmutableSortedSet.reverseOrder()
*/ 
public static <E extends java.lang.Comparable<?> > Builder<E> reverseOrder(){
	return com.google.common.collect.ImmutableSortedSet.reverseOrder();
}
/**
*public static <E> com.google.common.collect.ImmutableSortedSet.com.google.common.collect.ImmutableSortedSet$Builder<E> com.google.common.collect.ImmutableSortedSet.orderedBy(java.util.Comparator<E>)
*/ 
public static <E> Builder<E> orderedBy(java.util.Comparator<E> p0){
	return com.google.common.collect.ImmutableSortedSet.orderedBy(p0);
}
/**
*public static <K,V> com.google.common.collect.ImmutableSortedMap.com.google.common.collect.ImmutableSortedMap$Builder<K, V> com.google.common.collect.ImmutableSortedMap.orderedBy(java.util.Comparator<K>)
*/ 
public static <K,V> Builder<K, V> orderedBy(java.util.Comparator<K> p0){
	return com.google.common.collect.ImmutableSortedMap.orderedBy(p0);
}
/**
*public static com.google.common.collect.MinMaxPriorityQueue.com.google.common.collect.MinMaxPriorityQueue$Builder<java.lang.Comparable> com.google.common.collect.MinMaxPriorityQueue.maximumSize(int)
*/ 
public static Builder<java.lang.Comparable> maximumSize(int p0){
	return com.google.common.collect.MinMaxPriorityQueue.maximumSize(p0);
}
/**
*public static com.google.common.collect.MinMaxPriorityQueue.com.google.common.collect.MinMaxPriorityQueue$Builder<java.lang.Comparable> com.google.common.collect.MinMaxPriorityQueue.expectedSize(int)
*/ 
public static Builder<java.lang.Comparable> expectedSize(int p0){
	return com.google.common.collect.MinMaxPriorityQueue.expectedSize(p0);
}
/**
*public static <B> com.google.common.collect.MinMaxPriorityQueue.com.google.common.collect.MinMaxPriorityQueue$Builder<B> com.google.common.collect.MinMaxPriorityQueue.orderedBy(java.util.Comparator<B>)
*/ 
public static <B> Builder<B> orderedBy(java.util.Comparator<B> p0){
	return com.google.common.collect.MinMaxPriorityQueue.orderedBy(p0);
}
/**
*public static <E> org.apache.commons.collections4.collection.PredicatedCollection.org.apache.commons.collections4.collection.PredicatedCollection$Builder<E> org.apache.commons.collections4.collection.PredicatedCollection.builder(org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> Builder<E> builder(org.apache.commons.collections4.Predicate<? super E> p0){
	return org.apache.commons.collections4.collection.PredicatedCollection.builder(p0);
}
/**
*public static <E> org.apache.commons.collections4.collection.PredicatedCollection.org.apache.commons.collections4.collection.PredicatedCollection$Builder<E> org.apache.commons.collections4.collection.PredicatedCollection.notNullBuilder()
*/ 
public static <E> Builder<E> notNullBuilder(){
	return org.apache.commons.collections4.collection.PredicatedCollection.notNullBuilder();
}
/**
*public static org.apache.commons.text.StringEscapeUtils$Builder org.apache.commons.text.StringEscapeUtils.builder(org.apache.commons.text.translate.CharSequenceTranslator)
*/ 
public static Builder builder(org.apache.commons.text.translate.CharSequenceTranslator p0){
	return org.apache.commons.text.StringEscapeUtils.builder(p0);
}
}
