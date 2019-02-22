package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class CollectorUtil{ 
/**
*{@link com.google.common.collect.ImmutableListMultimap#flatteningToImmutableListMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>>)}
*@see com.google.common.collect.ImmutableListMultimap#flatteningToImmutableListMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableListMultimap<K, V>> com.google.common.collect.ImmutableListMultimap.flatteningToImmutableListMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>>)
*flatteningToImmutableListMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> p1){
	return com.google.common.collect.ImmutableListMultimap.flatteningToImmutableListMultimap(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSetMultimap#flatteningToImmutableSetMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>>)}
*@see com.google.common.collect.ImmutableSetMultimap#flatteningToImmutableSetMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSetMultimap<K, V>> com.google.common.collect.ImmutableSetMultimap.flatteningToImmutableSetMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>>)
*flatteningToImmutableSetMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> p1){
	return com.google.common.collect.ImmutableSetMultimap.flatteningToImmutableSetMultimap(p0,p1);
}
/**
*{@link com.google.common.collect.Multimaps#flatteningToMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>>,java.util.function.Supplier<M>)}
*@see com.google.common.collect.Multimaps#flatteningToMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>>,java.util.function.Supplier<M>)
*<code>public static <T,K,V,M> java.util.stream.Collector<T, ?, M> com.google.common.collect.Multimaps.flatteningToMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>>,java.util.function.Supplier<M>)
*flatteningToMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> p1,java.util.function.Supplier<M> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V,M extends com.google.common.collect.Multimap<K, V> > java.util.stream.Collector<T, ?, M> flatteningToMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> p1,java.util.function.Supplier<M> p2){
	return com.google.common.collect.Multimaps.flatteningToMultimap(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Comparators#greatest(int,java.util.Comparator<? super T>)}
*@see com.google.common.collect.Comparators#greatest(int,java.util.Comparator<? super T>)
*<code>public static <T> java.util.stream.Collector<T, ?, java.util.List<T>> com.google.common.collect.Comparators.greatest(int,java.util.Comparator<? super T>)
*greatest(int p0,java.util.Comparator<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Collector<T, ?, java.util.List<T>> greatest(int p0,java.util.Comparator<? super T> p1){
	return com.google.common.collect.Comparators.greatest(p0,p1);
}
/**
*{@link com.google.common.collect.Comparators#least(int,java.util.Comparator<? super T>)}
*@see com.google.common.collect.Comparators#least(int,java.util.Comparator<? super T>)
*<code>public static <T> java.util.stream.Collector<T, ?, java.util.List<T>> com.google.common.collect.Comparators.least(int,java.util.Comparator<? super T>)
*least(int p0,java.util.Comparator<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Collector<T, ?, java.util.List<T>> least(int p0,java.util.Comparator<? super T> p1){
	return com.google.common.collect.Comparators.least(p0,p1);
}
/**
*{@link com.google.common.collect.MoreCollectors#onlyElement()}
*@see com.google.common.collect.MoreCollectors#onlyElement()
*<code>public static <T> java.util.stream.Collector<T, ?, T> com.google.common.collect.MoreCollectors.onlyElement()
*onlyElement()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Collector<T, ?, T> onlyElement(){
	return com.google.common.collect.MoreCollectors.onlyElement();
}
/**
*{@link com.google.common.hash.BloomFilter#toBloomFilter(com.google.common.hash.Funnel<? super T>,long,double)}
*@see com.google.common.hash.BloomFilter#toBloomFilter(com.google.common.hash.Funnel<? super T>,long,double)
*<code>public static <T> java.util.stream.Collector<T, ?, com.google.common.hash.BloomFilter<T>> com.google.common.hash.BloomFilter.toBloomFilter(com.google.common.hash.Funnel<? super T>,long,double)
*toBloomFilter(com.google.common.hash.Funnel<? super T> p0,long p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Collector<T, ?, com.google.common.hash.BloomFilter<T>> toBloomFilter(com.google.common.hash.Funnel<? super T> p0,long p1,double p2){
	return com.google.common.hash.BloomFilter.toBloomFilter(p0,p1,p2);
}
/**
*{@link com.google.common.hash.BloomFilter#toBloomFilter(com.google.common.hash.Funnel<? super T>,long)}
*@see com.google.common.hash.BloomFilter#toBloomFilter(com.google.common.hash.Funnel<? super T>,long)
*<code>public static <T> java.util.stream.Collector<T, ?, com.google.common.hash.BloomFilter<T>> com.google.common.hash.BloomFilter.toBloomFilter(com.google.common.hash.Funnel<? super T>,long)
*toBloomFilter(com.google.common.hash.Funnel<? super T> p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Collector<T, ?, com.google.common.hash.BloomFilter<T>> toBloomFilter(com.google.common.hash.Funnel<? super T> p0,long p1){
	return com.google.common.hash.BloomFilter.toBloomFilter(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableBiMap#toImmutableBiMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)}
*@see com.google.common.collect.ImmutableBiMap#toImmutableBiMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableBiMap<K, V>> com.google.common.collect.ImmutableBiMap.toImmutableBiMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*toImmutableBiMap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableBiMap<K, V>> toImmutableBiMap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1){
	return com.google.common.collect.ImmutableBiMap.toImmutableBiMap(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#toImmutableEnumMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)}
*@see com.google.common.collect.Maps#toImmutableEnumMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> com.google.common.collect.Maps.toImmutableEnumMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K extends java.lang.Enum<K> ,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1){
	return com.google.common.collect.Maps.toImmutableEnumMap(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#toImmutableEnumMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)}
*@see com.google.common.collect.Maps#toImmutableEnumMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> com.google.common.collect.Maps.toImmutableEnumMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)
*toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1,java.util.function.BinaryOperator<V> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K extends java.lang.Enum<K> ,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1,java.util.function.BinaryOperator<V> p2){
	return com.google.common.collect.Maps.toImmutableEnumMap(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Sets#toImmutableEnumSet()}
*@see com.google.common.collect.Sets#toImmutableEnumSet()
*<code>public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> com.google.common.collect.Sets.toImmutableEnumSet()
*toImmutableEnumSet()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Enum<E> > java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> toImmutableEnumSet(){
	return com.google.common.collect.Sets.toImmutableEnumSet();
}
/**
*{@link com.google.common.collect.ImmutableList#toImmutableList()}
*@see com.google.common.collect.ImmutableList#toImmutableList()
*<code>public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableList<E>> com.google.common.collect.ImmutableList.toImmutableList()
*toImmutableList()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableList<E>> toImmutableList(){
	return com.google.common.collect.ImmutableList.toImmutableList();
}
/**
*{@link com.google.common.collect.ImmutableListMultimap#toImmutableListMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)}
*@see com.google.common.collect.ImmutableListMultimap#toImmutableListMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableListMultimap<K, V>> com.google.common.collect.ImmutableListMultimap.toImmutableListMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*toImmutableListMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableListMultimap<K, V>> toImmutableListMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1){
	return com.google.common.collect.ImmutableListMultimap.toImmutableListMultimap(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableBiMapFauxverideShim#toImmutableMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)}
*@see com.google.common.collect.ImmutableBiMapFauxverideShim#toImmutableMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> com.google.common.collect.ImmutableBiMapFauxverideShim.toImmutableMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*toImmutableMap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1){
	return com.google.common.collect.ImmutableBiMapFauxverideShim.toImmutableMap(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableBiMapFauxverideShim#toImmutableMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)}
*@see com.google.common.collect.ImmutableBiMapFauxverideShim#toImmutableMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> com.google.common.collect.ImmutableBiMapFauxverideShim.toImmutableMap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)
*toImmutableMap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1,java.util.function.BinaryOperator<V> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1,java.util.function.BinaryOperator<V> p2){
	return com.google.common.collect.ImmutableBiMapFauxverideShim.toImmutableMap(p0,p1,p2);
}
/**
*{@link com.google.common.collect.ImmutableMultiset#toImmutableMultiset()}
*@see com.google.common.collect.ImmutableMultiset#toImmutableMultiset()
*<code>public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableMultiset<E>> com.google.common.collect.ImmutableMultiset.toImmutableMultiset()
*toImmutableMultiset()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset(){
	return com.google.common.collect.ImmutableMultiset.toImmutableMultiset();
}
/**
*{@link com.google.common.collect.ImmutableMultiset#toImmutableMultiset(java.util.function.Function<? super T, ? extends E>,java.util.function.ToIntFunction<? super T>)}
*@see com.google.common.collect.ImmutableMultiset#toImmutableMultiset(java.util.function.Function<? super T, ? extends E>,java.util.function.ToIntFunction<? super T>)
*<code>public static <T,E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMultiset<E>> com.google.common.collect.ImmutableMultiset.toImmutableMultiset(java.util.function.Function<? super T, ? extends E>,java.util.function.ToIntFunction<? super T>)
*toImmutableMultiset(java.util.function.Function<? super T, ? extends E> p0,java.util.function.ToIntFunction<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset(java.util.function.Function<? super T, ? extends E> p0,java.util.function.ToIntFunction<? super T> p1){
	return com.google.common.collect.ImmutableMultiset.toImmutableMultiset(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedSetFauxverideShim#toImmutableSet()}
*@see com.google.common.collect.ImmutableSortedSetFauxverideShim#toImmutableSet()
*<code>public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> com.google.common.collect.ImmutableSortedSetFauxverideShim.toImmutableSet()
*toImmutableSet()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> toImmutableSet(){
	return com.google.common.collect.ImmutableSortedSetFauxverideShim.toImmutableSet();
}
/**
*{@link com.google.common.collect.ImmutableSetMultimap#toImmutableSetMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)}
*@see com.google.common.collect.ImmutableSetMultimap#toImmutableSetMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSetMultimap<K, V>> com.google.common.collect.ImmutableSetMultimap.toImmutableSetMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*toImmutableSetMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSetMultimap<K, V>> toImmutableSetMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1){
	return com.google.common.collect.ImmutableSetMultimap.toImmutableSetMultimap(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#toImmutableSortedMap(java.util.Comparator<? super K>,java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)}
*@see com.google.common.collect.ImmutableSortedMap#toImmutableSortedMap(java.util.Comparator<? super K>,java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMap<K, V>> com.google.common.collect.ImmutableSortedMap.toImmutableSortedMap(java.util.Comparator<? super K>,java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)
*toImmutableSortedMap(java.util.Comparator<? super K> p0,java.util.function.Function<? super T, ? extends K> p1,java.util.function.Function<? super T, ? extends V> p2,java.util.function.BinaryOperator<V> p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMap<K, V>> toImmutableSortedMap(java.util.Comparator<? super K> p0,java.util.function.Function<? super T, ? extends K> p1,java.util.function.Function<? super T, ? extends V> p2,java.util.function.BinaryOperator<V> p3){
	return com.google.common.collect.ImmutableSortedMap.toImmutableSortedMap(p0,p1,p2,p3);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#toImmutableSortedMap(java.util.Comparator<? super K>,java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)}
*@see com.google.common.collect.ImmutableSortedMap#toImmutableSortedMap(java.util.Comparator<? super K>,java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*<code>public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMap<K, V>> com.google.common.collect.ImmutableSortedMap.toImmutableSortedMap(java.util.Comparator<? super K>,java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>)
*toImmutableSortedMap(java.util.Comparator<? super K> p0,java.util.function.Function<? super T, ? extends K> p1,java.util.function.Function<? super T, ? extends V> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMap<K, V>> toImmutableSortedMap(java.util.Comparator<? super K> p0,java.util.function.Function<? super T, ? extends K> p1,java.util.function.Function<? super T, ? extends V> p2){
	return com.google.common.collect.ImmutableSortedMap.toImmutableSortedMap(p0,p1,p2);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#toImmutableSortedMultiset(java.util.Comparator<? super E>,java.util.function.Function<? super T, ? extends E>,java.util.function.ToIntFunction<? super T>)}
*@see com.google.common.collect.ImmutableSortedMultiset#toImmutableSortedMultiset(java.util.Comparator<? super E>,java.util.function.Function<? super T, ? extends E>,java.util.function.ToIntFunction<? super T>)
*<code>public static <T,E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMultiset<E>> com.google.common.collect.ImmutableSortedMultiset.toImmutableSortedMultiset(java.util.Comparator<? super E>,java.util.function.Function<? super T, ? extends E>,java.util.function.ToIntFunction<? super T>)
*toImmutableSortedMultiset(java.util.Comparator<? super E> p0,java.util.function.Function<? super T, ? extends E> p1,java.util.function.ToIntFunction<? super T> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMultiset<E>> toImmutableSortedMultiset(java.util.Comparator<? super E> p0,java.util.function.Function<? super T, ? extends E> p1,java.util.function.ToIntFunction<? super T> p2){
	return com.google.common.collect.ImmutableSortedMultiset.toImmutableSortedMultiset(p0,p1,p2);
}
/**
*{@link com.google.common.collect.ImmutableSortedMultiset#toImmutableSortedMultiset(java.util.Comparator<? super E>)}
*@see com.google.common.collect.ImmutableSortedMultiset#toImmutableSortedMultiset(java.util.Comparator<? super E>)
*<code>public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSortedMultiset<E>> com.google.common.collect.ImmutableSortedMultiset.toImmutableSortedMultiset(java.util.Comparator<? super E>)
*toImmutableSortedMultiset(java.util.Comparator<? super E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSortedMultiset<E>> toImmutableSortedMultiset(java.util.Comparator<? super E> p0){
	return com.google.common.collect.ImmutableSortedMultiset.toImmutableSortedMultiset(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedSet#toImmutableSortedSet(java.util.Comparator<? super E>)}
*@see com.google.common.collect.ImmutableSortedSet#toImmutableSortedSet(java.util.Comparator<? super E>)
*<code>public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSortedSet<E>> com.google.common.collect.ImmutableSortedSet.toImmutableSortedSet(java.util.Comparator<? super E>)
*toImmutableSortedSet(java.util.Comparator<? super E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSortedSet<E>> toImmutableSortedSet(java.util.Comparator<? super E> p0){
	return com.google.common.collect.ImmutableSortedSet.toImmutableSortedSet(p0);
}
/**
*{@link com.google.common.collect.ImmutableTable#toImmutableTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>)}
*@see com.google.common.collect.ImmutableTable#toImmutableTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>)
*<code>public static <T,R,C,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> com.google.common.collect.ImmutableTable.toImmutableTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>)
*toImmutableTable(java.util.function.Function<? super T, ? extends R> p0,java.util.function.Function<? super T, ? extends C> p1,java.util.function.Function<? super T, ? extends V> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,R,C,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> toImmutableTable(java.util.function.Function<? super T, ? extends R> p0,java.util.function.Function<? super T, ? extends C> p1,java.util.function.Function<? super T, ? extends V> p2){
	return com.google.common.collect.ImmutableTable.toImmutableTable(p0,p1,p2);
}
/**
*{@link com.google.common.collect.ImmutableTable#toImmutableTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)}
*@see com.google.common.collect.ImmutableTable#toImmutableTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)
*<code>public static <T,R,C,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> com.google.common.collect.ImmutableTable.toImmutableTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>)
*toImmutableTable(java.util.function.Function<? super T, ? extends R> p0,java.util.function.Function<? super T, ? extends C> p1,java.util.function.Function<? super T, ? extends V> p2,java.util.function.BinaryOperator<V> p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,R,C,V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> toImmutableTable(java.util.function.Function<? super T, ? extends R> p0,java.util.function.Function<? super T, ? extends C> p1,java.util.function.Function<? super T, ? extends V> p2,java.util.function.BinaryOperator<V> p3){
	return com.google.common.collect.ImmutableTable.toImmutableTable(p0,p1,p2,p3);
}
/**
*{@link com.google.common.collect.Multimaps#toMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.Supplier<M>)}
*@see com.google.common.collect.Multimaps#toMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.Supplier<M>)
*<code>public static <T,K,V,M> java.util.stream.Collector<T, ?, M> com.google.common.collect.Multimaps.toMultimap(java.util.function.Function<? super T, ? extends K>,java.util.function.Function<? super T, ? extends V>,java.util.function.Supplier<M>)
*toMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1,java.util.function.Supplier<M> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,K,V,M extends com.google.common.collect.Multimap<K, V> > java.util.stream.Collector<T, ?, M> toMultimap(java.util.function.Function<? super T, ? extends K> p0,java.util.function.Function<? super T, ? extends V> p1,java.util.function.Supplier<M> p2){
	return com.google.common.collect.Multimaps.toMultimap(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Multisets#toMultiset(java.util.function.Function<? super T, E>,java.util.function.ToIntFunction<? super T>,java.util.function.Supplier<M>)}
*@see com.google.common.collect.Multisets#toMultiset(java.util.function.Function<? super T, E>,java.util.function.ToIntFunction<? super T>,java.util.function.Supplier<M>)
*<code>public static <T,E,M> java.util.stream.Collector<T, ?, M> com.google.common.collect.Multisets.toMultiset(java.util.function.Function<? super T, E>,java.util.function.ToIntFunction<? super T>,java.util.function.Supplier<M>)
*toMultiset(java.util.function.Function<? super T, E> p0,java.util.function.ToIntFunction<? super T> p1,java.util.function.Supplier<M> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,E,M extends com.google.common.collect.Multiset<E> > java.util.stream.Collector<T, ?, M> toMultiset(java.util.function.Function<? super T, E> p0,java.util.function.ToIntFunction<? super T> p1,java.util.function.Supplier<M> p2){
	return com.google.common.collect.Multisets.toMultiset(p0,p1,p2);
}
/**
*{@link com.google.common.collect.MoreCollectors#toOptional()}
*@see com.google.common.collect.MoreCollectors#toOptional()
*<code>public static <T> java.util.stream.Collector<T, ?, java.util.Optional<T>> com.google.common.collect.MoreCollectors.toOptional()
*toOptional()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Collector<T, ?, java.util.Optional<T>> toOptional(){
	return com.google.common.collect.MoreCollectors.toOptional();
}
/**
*{@link com.google.common.collect.Tables#toTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>,java.util.function.Supplier<I>)}
*@see com.google.common.collect.Tables#toTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>,java.util.function.Supplier<I>)
*<code>public static <T,R,C,V,I> java.util.stream.Collector<T, ?, I> com.google.common.collect.Tables.toTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>,java.util.function.Supplier<I>)
*toTable(java.util.function.Function<? super T, ? extends R> p0,java.util.function.Function<? super T, ? extends C> p1,java.util.function.Function<? super T, ? extends V> p2,java.util.function.Supplier<I> p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,R,C,V,I extends com.google.common.collect.Table<R, C, V> > java.util.stream.Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> p0,java.util.function.Function<? super T, ? extends C> p1,java.util.function.Function<? super T, ? extends V> p2,java.util.function.Supplier<I> p3){
	return com.google.common.collect.Tables.toTable(p0,p1,p2,p3);
}
/**
*{@link com.google.common.collect.Tables#toTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>,java.util.function.Supplier<I>)}
*@see com.google.common.collect.Tables#toTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>,java.util.function.Supplier<I>)
*<code>public static <T,R,C,V,I> java.util.stream.Collector<T, ?, I> com.google.common.collect.Tables.toTable(java.util.function.Function<? super T, ? extends R>,java.util.function.Function<? super T, ? extends C>,java.util.function.Function<? super T, ? extends V>,java.util.function.BinaryOperator<V>,java.util.function.Supplier<I>)
*toTable(java.util.function.Function<? super T, ? extends R> p0,java.util.function.Function<? super T, ? extends C> p1,java.util.function.Function<? super T, ? extends V> p2,java.util.function.BinaryOperator<V> p3,java.util.function.Supplier<I> p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,R,C,V,I extends com.google.common.collect.Table<R, C, V> > java.util.stream.Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> p0,java.util.function.Function<? super T, ? extends C> p1,java.util.function.Function<? super T, ? extends V> p2,java.util.function.BinaryOperator<V> p3,java.util.function.Supplier<I> p4){
	return com.google.common.collect.Tables.toTable(p0,p1,p2,p3,p4);
}
}
