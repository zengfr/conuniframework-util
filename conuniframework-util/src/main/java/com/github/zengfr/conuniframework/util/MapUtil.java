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
public final class MapUtil{ 
/**
*{@link com.google.common.collect.Maps#asMap(java.util.Set<K>,com.google.common.base.Function<? super K, V>)}
*@see com.google.common.collect.Maps#asMap(java.util.Set<K>,com.google.common.base.Function<? super K, V>)
*<code>public static <K,V> java.util.Map<K, V> com.google.common.collect.Maps.asMap(java.util.Set<K>,com.google.common.base.Function<? super K, V>)
*asMap(java.util.Set<K> p0,com.google.common.base.Function<? super K, V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> asMap(java.util.Set<K> p0,com.google.common.base.Function<? super K, V> p1){
	return com.google.common.collect.Maps.asMap(p0,p1);
}
/**
*{@link com.google.common.collect.Multimaps#asMap(com.google.common.collect.ListMultimap<K, V>)}
*@see com.google.common.collect.Multimaps#asMap(com.google.common.collect.ListMultimap<K, V>)
*<code>public static <K,V> java.util.Map<K, java.util.List<V>> com.google.common.collect.Multimaps.asMap(com.google.common.collect.ListMultimap<K, V>)
*asMap(com.google.common.collect.ListMultimap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, java.util.List<V>> asMap(com.google.common.collect.ListMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.asMap(p0);
}
/**
*{@link com.google.common.collect.Multimaps#asMap(com.google.common.collect.SetMultimap<K, V>)}
*@see com.google.common.collect.Multimaps#asMap(com.google.common.collect.SetMultimap<K, V>)
*<code>public static <K,V> java.util.Map<K, java.util.Set<V>> com.google.common.collect.Multimaps.asMap(com.google.common.collect.SetMultimap<K, V>)
*asMap(com.google.common.collect.SetMultimap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, java.util.Set<V>> asMap(com.google.common.collect.SetMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.asMap(p0);
}
/**
*{@link com.google.common.collect.Multimaps#asMap(com.google.common.collect.SortedSetMultimap<K, V>)}
*@see com.google.common.collect.Multimaps#asMap(com.google.common.collect.SortedSetMultimap<K, V>)
*<code>public static <K,V> java.util.Map<K, java.util.SortedSet<V>> com.google.common.collect.Multimaps.asMap(com.google.common.collect.SortedSetMultimap<K, V>)
*asMap(com.google.common.collect.SortedSetMultimap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, java.util.SortedSet<V>> asMap(com.google.common.collect.SortedSetMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.asMap(p0);
}
/**
*{@link com.google.common.collect.Multimaps#asMap(com.google.common.collect.Multimap<K, V>)}
*@see com.google.common.collect.Multimaps#asMap(com.google.common.collect.Multimap<K, V>)
*<code>public static <K,V> java.util.Map<K, java.util.Collection<V>> com.google.common.collect.Multimaps.asMap(com.google.common.collect.Multimap<K, V>)
*asMap(com.google.common.collect.Multimap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, java.util.Collection<V>> asMap(com.google.common.collect.Multimap<K, V> p0){
	return com.google.common.collect.Multimaps.asMap(p0);
}
/**
*{@link org.apache.commons.exec.util.MapUtils#copy(java.util.Map<K, V>)}
*@see org.apache.commons.exec.util.MapUtils#copy(java.util.Map<K, V>)
*<code>public static <K,V> java.util.Map<K, V> org.apache.commons.exec.util.MapUtils.copy(java.util.Map<K, V>)
*copy(java.util.Map<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> copy(java.util.Map<K, V> p0){
	return org.apache.commons.exec.util.MapUtils.copy(p0);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#createCache()}
*@see org.apache.commons.beanutils.BeanUtils#createCache()
*<code>public static <K,V> java.util.Map<K, V> org.apache.commons.beanutils.BeanUtils.createCache()
*createCache()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> createCache(){
	return org.apache.commons.beanutils.BeanUtils.createCache();
}
/**
*{@link org.apache.commons.collections.MapUtils#debugPrint(java.io.PrintStream,java.lang.Object,java.util.Map)}
*@see org.apache.commons.collections.MapUtils#debugPrint(java.io.PrintStream,java.lang.Object,java.util.Map)
*<code>public static void org.apache.commons.collections.MapUtils.debugPrint(java.io.PrintStream,java.lang.Object,java.util.Map)
*debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
	 org.apache.commons.collections.MapUtils.debugPrint(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.ListOrderedMap#decorate(java.util.Map)}
*@see org.apache.commons.collections.map.ListOrderedMap#decorate(java.util.Map)
*<code>public static org.apache.commons.collections.OrderedMap org.apache.commons.collections.map.ListOrderedMap.decorate(java.util.Map)
*decorate(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.OrderedMap decorate(java.util.Map p0){
	return org.apache.commons.collections.map.ListOrderedMap.decorate(p0);
}
/**
*{@link org.apache.commons.collections.map.TransformedMap#decorate(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.TransformedMap#decorate(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.Map org.apache.commons.collections.map.TransformedMap.decorate(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.map.TransformedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.PredicatedMap#decorate(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.map.PredicatedMap#decorate(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static java.util.Map org.apache.commons.collections.map.PredicatedMap.decorate(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*decorate(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.map.PredicatedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.DefaultedMap#decorate(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.map.DefaultedMap#decorate(java.util.Map,java.lang.Object)
*<code>public static java.util.Map org.apache.commons.collections.map.DefaultedMap.decorate(java.util.Map,java.lang.Object)
*decorate(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.map.DefaultedMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.DefaultedMap#decorate(java.util.Map,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.DefaultedMap#decorate(java.util.Map,org.apache.commons.collections.Transformer)
*<code>public static java.util.Map org.apache.commons.collections.map.DefaultedMap.decorate(java.util.Map,org.apache.commons.collections.Transformer)
*decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.map.DefaultedMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.DefaultedMap#decorate(java.util.Map,org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.map.DefaultedMap#decorate(java.util.Map,org.apache.commons.collections.Factory)
*<code>public static java.util.Map org.apache.commons.collections.map.DefaultedMap.decorate(java.util.Map,org.apache.commons.collections.Factory)
*decorate(java.util.Map p0,org.apache.commons.collections.Factory p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.map.DefaultedMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.TypedMap#decorate(java.util.Map,java.lang.Class,java.lang.Class)}
*@see org.apache.commons.collections.map.TypedMap#decorate(java.util.Map,java.lang.Class,java.lang.Class)
*<code>public static java.util.Map org.apache.commons.collections.map.TypedMap.decorate(java.util.Map,java.lang.Class,java.lang.Class)
*decorate(java.util.Map p0,java.lang.Class p1,java.lang.Class p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,java.lang.Class p1,java.lang.Class p2){
	return org.apache.commons.collections.map.TypedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,java.lang.Class)}
*@see org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,java.lang.Class)
*<code>public static org.apache.commons.collections.map.MultiValueMap org.apache.commons.collections.map.MultiValueMap.decorate(java.util.Map,java.lang.Class)
*decorate(java.util.Map p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0,java.lang.Class p1){
	return org.apache.commons.collections.map.MultiValueMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.TransformedMap#decorateTransform(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.TransformedMap#decorateTransform(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.Map org.apache.commons.collections.map.TransformedMap.decorateTransform(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*decorateTransform(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorateTransform(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.map.TransformedMap.decorateTransform(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.map.DefaultedMap#defaultedMap(java.util.Map<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends V>)}
*@see org.apache.commons.collections4.map.DefaultedMap#defaultedMap(java.util.Map<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends V>)
*<code>public static <K,V> java.util.Map<K, V> org.apache.commons.collections4.map.DefaultedMap.defaultedMap(java.util.Map<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends V>)
*defaultedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> defaultedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
	return org.apache.commons.collections4.map.DefaultedMap.defaultedMap(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#describe(java.lang.Object)}
*@see org.apache.commons.beanutils.BeanUtils#describe(java.lang.Object)
*<code>public static java.util.Map<java.lang.String, java.lang.String> org.apache.commons.beanutils.BeanUtils.describe(java.lang.Object) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*describe(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.String, java.lang.String> describe(java.lang.Object p0) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.BeanUtils.describe(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#determineTypeArguments(java.lang.Class<?>,java.lang.reflect.ParameterizedType)}
*@see org.apache.commons.lang3.reflect.TypeUtils#determineTypeArguments(java.lang.Class<?>,java.lang.reflect.ParameterizedType)
*<code>public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(java.lang.Class<?>,java.lang.reflect.ParameterizedType)
*determineTypeArguments(java.lang.Class<?> p0,java.lang.reflect.ParameterizedType p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> determineTypeArguments(java.lang.Class<?> p0,java.lang.reflect.ParameterizedType p1){
	return org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#emptyIfNull(java.util.Map<K, V>)}
*@see org.apache.commons.collections4.MapUtils#emptyIfNull(java.util.Map<K, V>)
*<code>public static <K,V> java.util.Map<K, V> org.apache.commons.collections4.MapUtils.emptyIfNull(java.util.Map<K, V>)
*emptyIfNull(java.util.Map<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> emptyIfNull(java.util.Map<K, V> p0){
	return org.apache.commons.collections4.MapUtils.emptyIfNull(p0);
}
/**
*{@link com.google.common.collect.Maps#filterEntries(java.util.Map<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)}
*@see com.google.common.collect.Maps#filterEntries(java.util.Map<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)
*<code>public static <K,V> java.util.Map<K, V> com.google.common.collect.Maps.filterEntries(java.util.Map<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)
*filterEntries(java.util.Map<K, V> p0,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> filterEntries(java.util.Map<K, V> p0,com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> p1){
	return com.google.common.collect.Maps.filterEntries(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#filterKeys(java.util.Map<K, V>,com.google.common.base.Predicate<? super K>)}
*@see com.google.common.collect.Maps#filterKeys(java.util.Map<K, V>,com.google.common.base.Predicate<? super K>)
*<code>public static <K,V> java.util.Map<K, V> com.google.common.collect.Maps.filterKeys(java.util.Map<K, V>,com.google.common.base.Predicate<? super K>)
*filterKeys(java.util.Map<K, V> p0,com.google.common.base.Predicate<? super K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> filterKeys(java.util.Map<K, V> p0,com.google.common.base.Predicate<? super K> p1){
	return com.google.common.collect.Maps.filterKeys(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#filterValues(java.util.Map<K, V>,com.google.common.base.Predicate<? super V>)}
*@see com.google.common.collect.Maps#filterValues(java.util.Map<K, V>,com.google.common.base.Predicate<? super V>)
*<code>public static <K,V> java.util.Map<K, V> com.google.common.collect.Maps.filterValues(java.util.Map<K, V>,com.google.common.base.Predicate<? super V>)
*filterValues(java.util.Map<K, V> p0,com.google.common.base.Predicate<? super V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> filterValues(java.util.Map<K, V> p0,com.google.common.base.Predicate<? super V> p1){
	return com.google.common.collect.Maps.filterValues(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#fixedSizeMap(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#fixedSizeMap(java.util.Map)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.fixedSizeMap(java.util.Map)
*fixedSizeMap(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map fixedSizeMap(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.fixedSizeMap(p0);
}
/**
*{@link java.lang.Thread#getAllStackTraces()}
*@see java.lang.Thread#getAllStackTraces()
*<code>public static java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> java.lang.Thread.getAllStackTraces()
*getAllStackTraces()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> getAllStackTraces(){
	return java.lang.Thread.getAllStackTraces();
}
/**
*{@link org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object,java.lang.Boolean)}
*@see org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object,java.lang.Boolean)
*<code>public static java.lang.Boolean org.apache.commons.collections.MapUtils.getBoolean(java.util.Map,java.lang.Object,java.lang.Boolean)
*getBoolean(java.util.Map p0,java.lang.Object p1,java.lang.Boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1,java.lang.Boolean p2){
	return org.apache.commons.collections.MapUtils.getBoolean(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object)
*<code>public static java.lang.Boolean org.apache.commons.collections.MapUtils.getBoolean(java.util.Map,java.lang.Object)
*getBoolean(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getBoolean(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object,boolean)}
*@see org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object,boolean)
*<code>public static boolean org.apache.commons.collections.MapUtils.getBooleanValue(java.util.Map,java.lang.Object,boolean)
*getBooleanValue(java.util.Map p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1,boolean p2){
	return org.apache.commons.collections.MapUtils.getBooleanValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object)
*<code>public static boolean org.apache.commons.collections.MapUtils.getBooleanValue(java.util.Map,java.lang.Object)
*getBooleanValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getBooleanValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getByte(java.util.Map,java.lang.Object,java.lang.Byte)}
*@see org.apache.commons.collections.MapUtils#getByte(java.util.Map,java.lang.Object,java.lang.Byte)
*<code>public static java.lang.Byte org.apache.commons.collections.MapUtils.getByte(java.util.Map,java.lang.Object,java.lang.Byte)
*getByte(java.util.Map p0,java.lang.Object p1,java.lang.Byte p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Byte getByte(java.util.Map p0,java.lang.Object p1,java.lang.Byte p2){
	return org.apache.commons.collections.MapUtils.getByte(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getByte(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getByte(java.util.Map,java.lang.Object)
*<code>public static java.lang.Byte org.apache.commons.collections.MapUtils.getByte(java.util.Map,java.lang.Object)
*getByte(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Byte getByte(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getByte(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getByteValue(java.util.Map,java.lang.Object,byte)}
*@see org.apache.commons.collections.MapUtils#getByteValue(java.util.Map,java.lang.Object,byte)
*<code>public static byte org.apache.commons.collections.MapUtils.getByteValue(java.util.Map,java.lang.Object,byte)
*getByteValue(java.util.Map p0,java.lang.Object p1,byte p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte getByteValue(java.util.Map p0,java.lang.Object p1,byte p2){
	return org.apache.commons.collections.MapUtils.getByteValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getByteValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getByteValue(java.util.Map,java.lang.Object)
*<code>public static byte org.apache.commons.collections.MapUtils.getByteValue(java.util.Map,java.lang.Object)
*getByteValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte getByteValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getByteValue(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#getCardinalityMap(java.lang.Iterable<? extends O>)}
*@see org.apache.commons.collections4.CollectionUtils#getCardinalityMap(java.lang.Iterable<? extends O>)
*<code>public static <O> java.util.Map<O, java.lang.Integer> org.apache.commons.collections4.CollectionUtils.getCardinalityMap(java.lang.Iterable<? extends O>)
*getCardinalityMap(java.lang.Iterable<? extends O> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.Map<O, java.lang.Integer> getCardinalityMap(java.lang.Iterable<? extends O> p0){
	return org.apache.commons.collections4.CollectionUtils.getCardinalityMap(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#getCardinalityMap(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#getCardinalityMap(java.util.Collection)
*<code>public static java.util.Map org.apache.commons.collections.CollectionUtils.getCardinalityMap(java.util.Collection)
*getCardinalityMap(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map getCardinalityMap(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.getCardinalityMap(p0);
}
/**
*{@link org.codehaus.plexus.util.CollectionUtils#getCardinalityMap(java.util.Collection<E>)}
*@see org.codehaus.plexus.util.CollectionUtils#getCardinalityMap(java.util.Collection<E>)
*<code>public static <E> java.util.Map<E, java.lang.Integer> org.codehaus.plexus.util.CollectionUtils.getCardinalityMap(java.util.Collection<E>)
*getCardinalityMap(java.util.Collection<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Map<E, java.lang.Integer> getCardinalityMap(java.util.Collection<E> p0){
	return org.codehaus.plexus.util.CollectionUtils.getCardinalityMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#getDouble(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getDouble(java.util.Map,java.lang.Object)
*<code>public static java.lang.Double org.apache.commons.collections.MapUtils.getDouble(java.util.Map,java.lang.Object)
*getDouble(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Double getDouble(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getDouble(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getDouble(java.util.Map,java.lang.Object,java.lang.Double)}
*@see org.apache.commons.collections.MapUtils#getDouble(java.util.Map,java.lang.Object,java.lang.Double)
*<code>public static java.lang.Double org.apache.commons.collections.MapUtils.getDouble(java.util.Map,java.lang.Object,java.lang.Double)
*getDouble(java.util.Map p0,java.lang.Object p1,java.lang.Double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Double getDouble(java.util.Map p0,java.lang.Object p1,java.lang.Double p2){
	return org.apache.commons.collections.MapUtils.getDouble(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getDoubleValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getDoubleValue(java.util.Map,java.lang.Object)
*<code>public static double org.apache.commons.collections.MapUtils.getDoubleValue(java.util.Map,java.lang.Object)
*getDoubleValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double getDoubleValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getDoubleValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getDoubleValue(java.util.Map,java.lang.Object,double)}
*@see org.apache.commons.collections.MapUtils#getDoubleValue(java.util.Map,java.lang.Object,double)
*<code>public static double org.apache.commons.collections.MapUtils.getDoubleValue(java.util.Map,java.lang.Object,double)
*getDoubleValue(java.util.Map p0,java.lang.Object p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double getDoubleValue(java.util.Map p0,java.lang.Object p1,double p2){
	return org.apache.commons.collections.MapUtils.getDoubleValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.EnumUtils#getEnumMap(java.lang.Class<E>)}
*@see org.apache.commons.lang3.EnumUtils#getEnumMap(java.lang.Class<E>)
*<code>public static <E> java.util.Map<java.lang.String, E> org.apache.commons.lang3.EnumUtils.getEnumMap(java.lang.Class<E>)
*getEnumMap(java.lang.Class<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Enum<E> > java.util.Map<java.lang.String, E> getEnumMap(java.lang.Class<E> p0){
	return org.apache.commons.lang3.EnumUtils.getEnumMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#getFloat(java.util.Map,java.lang.Object,java.lang.Float)}
*@see org.apache.commons.collections.MapUtils#getFloat(java.util.Map,java.lang.Object,java.lang.Float)
*<code>public static java.lang.Float org.apache.commons.collections.MapUtils.getFloat(java.util.Map,java.lang.Object,java.lang.Float)
*getFloat(java.util.Map p0,java.lang.Object p1,java.lang.Float p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Float getFloat(java.util.Map p0,java.lang.Object p1,java.lang.Float p2){
	return org.apache.commons.collections.MapUtils.getFloat(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getFloat(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getFloat(java.util.Map,java.lang.Object)
*<code>public static java.lang.Float org.apache.commons.collections.MapUtils.getFloat(java.util.Map,java.lang.Object)
*getFloat(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Float getFloat(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getFloat(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getFloatValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getFloatValue(java.util.Map,java.lang.Object)
*<code>public static float org.apache.commons.collections.MapUtils.getFloatValue(java.util.Map,java.lang.Object)
*getFloatValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float getFloatValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getFloatValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getFloatValue(java.util.Map,java.lang.Object,float)}
*@see org.apache.commons.collections.MapUtils#getFloatValue(java.util.Map,java.lang.Object,float)
*<code>public static float org.apache.commons.collections.MapUtils.getFloatValue(java.util.Map,java.lang.Object,float)
*getFloatValue(java.util.Map p0,java.lang.Object p1,float p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float getFloatValue(java.util.Map p0,java.lang.Object p1,float p2){
	return org.apache.commons.collections.MapUtils.getFloatValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.functors.SwitchClosure#getInstance(java.util.Map)}
*@see org.apache.commons.collections.functors.SwitchClosure#getInstance(java.util.Map)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.SwitchClosure.getInstance(java.util.Map)
*getInstance(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(java.util.Map p0){
	return org.apache.commons.collections.functors.SwitchClosure.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#getIntValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getIntValue(java.util.Map,java.lang.Object)
*<code>public static int org.apache.commons.collections.MapUtils.getIntValue(java.util.Map,java.lang.Object)
*getIntValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int getIntValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getIntValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getIntValue(java.util.Map,java.lang.Object,int)}
*@see org.apache.commons.collections.MapUtils#getIntValue(java.util.Map,java.lang.Object,int)
*<code>public static int org.apache.commons.collections.MapUtils.getIntValue(java.util.Map,java.lang.Object,int)
*getIntValue(java.util.Map p0,java.lang.Object p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int getIntValue(java.util.Map p0,java.lang.Object p1,int p2){
	return org.apache.commons.collections.MapUtils.getIntValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getInteger(java.util.Map,java.lang.Object,java.lang.Integer)}
*@see org.apache.commons.collections.MapUtils#getInteger(java.util.Map,java.lang.Object,java.lang.Integer)
*<code>public static java.lang.Integer org.apache.commons.collections.MapUtils.getInteger(java.util.Map,java.lang.Object,java.lang.Integer)
*getInteger(java.util.Map p0,java.lang.Object p1,java.lang.Integer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Integer getInteger(java.util.Map p0,java.lang.Object p1,java.lang.Integer p2){
	return org.apache.commons.collections.MapUtils.getInteger(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getInteger(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getInteger(java.util.Map,java.lang.Object)
*<code>public static java.lang.Integer org.apache.commons.collections.MapUtils.getInteger(java.util.Map,java.lang.Object)
*getInteger(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Integer getInteger(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getInteger(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getLong(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getLong(java.util.Map,java.lang.Object)
*<code>public static java.lang.Long org.apache.commons.collections.MapUtils.getLong(java.util.Map,java.lang.Object)
*getLong(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Long getLong(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getLong(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getLong(java.util.Map,java.lang.Object,java.lang.Long)}
*@see org.apache.commons.collections.MapUtils#getLong(java.util.Map,java.lang.Object,java.lang.Long)
*<code>public static java.lang.Long org.apache.commons.collections.MapUtils.getLong(java.util.Map,java.lang.Object,java.lang.Long)
*getLong(java.util.Map p0,java.lang.Object p1,java.lang.Long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Long getLong(java.util.Map p0,java.lang.Object p1,java.lang.Long p2){
	return org.apache.commons.collections.MapUtils.getLong(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getLongValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getLongValue(java.util.Map,java.lang.Object)
*<code>public static long org.apache.commons.collections.MapUtils.getLongValue(java.util.Map,java.lang.Object)
*getLongValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long getLongValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getLongValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getLongValue(java.util.Map,java.lang.Object,long)}
*@see org.apache.commons.collections.MapUtils#getLongValue(java.util.Map,java.lang.Object,long)
*<code>public static long org.apache.commons.collections.MapUtils.getLongValue(java.util.Map,java.lang.Object,long)
*getLongValue(java.util.Map p0,java.lang.Object p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long getLongValue(java.util.Map p0,java.lang.Object p1,long p2){
	return org.apache.commons.collections.MapUtils.getLongValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.MapUtils#getMap(java.util.Map<? super K, ?>,K)}
*@see org.apache.commons.collections4.MapUtils#getMap(java.util.Map<? super K, ?>,K)
*<code>public static <K> java.util.Map<?, ?> org.apache.commons.collections4.MapUtils.getMap(java.util.Map<? super K, ?>,K)
*getMap(java.util.Map<? super K, ?> p0,K p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> java.util.Map<?, ?> getMap(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getMap(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#getMap(java.util.Map<? super K, ?>,K,java.util.Map<?, ?>)}
*@see org.apache.commons.collections4.MapUtils#getMap(java.util.Map<? super K, ?>,K,java.util.Map<?, ?>)
*<code>public static <K> java.util.Map<?, ?> org.apache.commons.collections4.MapUtils.getMap(java.util.Map<? super K, ?>,K,java.util.Map<?, ?>)
*getMap(java.util.Map<? super K, ?> p0,K p1,java.util.Map<?, ?> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> java.util.Map<?, ?> getMap(java.util.Map<? super K, ?> p0,K p1,java.util.Map<?, ?> p2){
	return org.apache.commons.collections4.MapUtils.getMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getMap(java.util.Map,java.lang.Object,java.util.Map)}
*@see org.apache.commons.collections.MapUtils#getMap(java.util.Map,java.lang.Object,java.util.Map)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.getMap(java.util.Map,java.lang.Object,java.util.Map)
*getMap(java.util.Map p0,java.lang.Object p1,java.util.Map p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map getMap(java.util.Map p0,java.lang.Object p1,java.util.Map p2){
	return org.apache.commons.collections.MapUtils.getMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getMap(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getMap(java.util.Map,java.lang.Object)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.getMap(java.util.Map,java.lang.Object)
*getMap(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map getMap(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getMap(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getNumber(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getNumber(java.util.Map,java.lang.Object)
*<code>public static java.lang.Number org.apache.commons.collections.MapUtils.getNumber(java.util.Map,java.lang.Object)
*getNumber(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Number getNumber(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getNumber(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getNumber(java.util.Map,java.lang.Object,java.lang.Number)}
*@see org.apache.commons.collections.MapUtils#getNumber(java.util.Map,java.lang.Object,java.lang.Number)
*<code>public static java.lang.Number org.apache.commons.collections.MapUtils.getNumber(java.util.Map,java.lang.Object,java.lang.Number)
*getNumber(java.util.Map p0,java.lang.Object p1,java.lang.Number p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Number getNumber(java.util.Map p0,java.lang.Object p1,java.lang.Number p2){
	return org.apache.commons.collections.MapUtils.getNumber(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getObject(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getObject(java.util.Map,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.collections.MapUtils.getObject(java.util.Map,java.lang.Object)
*getObject(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object getObject(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getObject(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getObject(java.util.Map,java.lang.Object,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getObject(java.util.Map,java.lang.Object,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.collections.MapUtils.getObject(java.util.Map,java.lang.Object,java.lang.Object)
*getObject(java.util.Map p0,java.lang.Object p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object getObject(java.util.Map p0,java.lang.Object p1,java.lang.Object p2){
	return org.apache.commons.collections.MapUtils.getObject(p0,p1,p2);
}
/**
*{@link org.apache.commons.exec.environment.EnvironmentUtils#getProcEnvironment()}
*@see org.apache.commons.exec.environment.EnvironmentUtils#getProcEnvironment()
*<code>public static java.util.Map<java.lang.String, java.lang.String> org.apache.commons.exec.environment.EnvironmentUtils.getProcEnvironment() throws java.io.IOException
*getProcEnvironment()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.String, java.lang.String> getProcEnvironment() throws java.io.IOException{
	return org.apache.commons.exec.environment.EnvironmentUtils.getProcEnvironment();
}
/**
*{@link org.apache.commons.collections.MapUtils#getShort(java.util.Map,java.lang.Object,java.lang.Short)}
*@see org.apache.commons.collections.MapUtils#getShort(java.util.Map,java.lang.Object,java.lang.Short)
*<code>public static java.lang.Short org.apache.commons.collections.MapUtils.getShort(java.util.Map,java.lang.Object,java.lang.Short)
*getShort(java.util.Map p0,java.lang.Object p1,java.lang.Short p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Short getShort(java.util.Map p0,java.lang.Object p1,java.lang.Short p2){
	return org.apache.commons.collections.MapUtils.getShort(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getShort(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getShort(java.util.Map,java.lang.Object)
*<code>public static java.lang.Short org.apache.commons.collections.MapUtils.getShort(java.util.Map,java.lang.Object)
*getShort(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Short getShort(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getShort(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getShortValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getShortValue(java.util.Map,java.lang.Object)
*<code>public static short org.apache.commons.collections.MapUtils.getShortValue(java.util.Map,java.lang.Object)
*getShortValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short getShortValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getShortValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getShortValue(java.util.Map,java.lang.Object,short)}
*@see org.apache.commons.collections.MapUtils#getShortValue(java.util.Map,java.lang.Object,short)
*<code>public static short org.apache.commons.collections.MapUtils.getShortValue(java.util.Map,java.lang.Object,short)
*getShortValue(java.util.Map p0,java.lang.Object p1,short p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short getShortValue(java.util.Map p0,java.lang.Object p1,short p2){
	return org.apache.commons.collections.MapUtils.getShortValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getString(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getString(java.util.Map,java.lang.Object)
*<code>public static java.lang.String org.apache.commons.collections.MapUtils.getString(java.util.Map,java.lang.Object)
*getString(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getString(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getString(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getString(java.util.Map,java.lang.Object,java.lang.String)}
*@see org.apache.commons.collections.MapUtils#getString(java.util.Map,java.lang.Object,java.lang.String)
*<code>public static java.lang.String org.apache.commons.collections.MapUtils.getString(java.util.Map,java.lang.Object,java.lang.String)
*getString(java.util.Map p0,java.lang.Object p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getString(java.util.Map p0,java.lang.Object p1,java.lang.String p2){
	return org.apache.commons.collections.MapUtils.getString(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#getTypeArguments(java.lang.reflect.ParameterizedType)}
*@see org.apache.commons.lang3.reflect.TypeUtils#getTypeArguments(java.lang.reflect.ParameterizedType)
*<code>public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.ParameterizedType)
*getTypeArguments(java.lang.reflect.ParameterizedType p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.ParameterizedType p0){
	return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#getTypeArguments(java.lang.reflect.Type,java.lang.Class<?>)}
*@see org.apache.commons.lang3.reflect.TypeUtils#getTypeArguments(java.lang.reflect.Type,java.lang.Class<?>)
*<code>public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.Type,java.lang.Class<?>)
*getTypeArguments(java.lang.reflect.Type p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.Type p0,java.lang.Class<?> p1){
	return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#getVariablesAndValuesIncludingSuperclasses(java.lang.Object)}
*@see org.codehaus.plexus.util.ReflectionUtils#getVariablesAndValuesIncludingSuperclasses(java.lang.Object)
*<code>public static java.util.Map<java.lang.String, java.lang.Object> org.codehaus.plexus.util.ReflectionUtils.getVariablesAndValuesIncludingSuperclasses(java.lang.Object) throws java.lang.IllegalAccessException
*getVariablesAndValuesIncludingSuperclasses(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.String, java.lang.Object> getVariablesAndValuesIncludingSuperclasses(java.lang.Object p0) throws java.lang.IllegalAccessException{
	return org.codehaus.plexus.util.ReflectionUtils.getVariablesAndValuesIncludingSuperclasses(p0);
}
/**
*{@link org.apache.commons.text.translate.EntityArrays#invert(java.util.Map<java.lang.CharSequence, java.lang.CharSequence>)}
*@see org.apache.commons.text.translate.EntityArrays#invert(java.util.Map<java.lang.CharSequence, java.lang.CharSequence>)
*<code>public static java.util.Map<java.lang.CharSequence, java.lang.CharSequence> org.apache.commons.text.translate.EntityArrays.invert(java.util.Map<java.lang.CharSequence, java.lang.CharSequence>)
*invert(java.util.Map<java.lang.CharSequence, java.lang.CharSequence> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.CharSequence, java.lang.CharSequence> invert(java.util.Map<java.lang.CharSequence, java.lang.CharSequence> p0){
	return org.apache.commons.text.translate.EntityArrays.invert(p0);
}
/**
*{@link org.apache.commons.collections4.MapUtils#invertMap(java.util.Map<K, V>)}
*@see org.apache.commons.collections4.MapUtils#invertMap(java.util.Map<K, V>)
*<code>public static <K,V> java.util.Map<V, K> org.apache.commons.collections4.MapUtils.invertMap(java.util.Map<K, V>)
*invertMap(java.util.Map<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<V, K> invertMap(java.util.Map<K, V> p0){
	return org.apache.commons.collections4.MapUtils.invertMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#invertMap(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#invertMap(java.util.Map)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.invertMap(java.util.Map)
*invertMap(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map invertMap(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.invertMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#isEmpty(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#isEmpty(java.util.Map)
*<code>public static boolean org.apache.commons.collections.MapUtils.isEmpty(java.util.Map)
*isEmpty(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#isNotEmpty(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#isNotEmpty(java.util.Map)
*<code>public static boolean org.apache.commons.collections.MapUtils.isNotEmpty(java.util.Map)
*isNotEmpty(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#lazyMap(java.util.Map,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.MapUtils#lazyMap(java.util.Map,org.apache.commons.collections.Transformer)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.lazyMap(java.util.Map,org.apache.commons.collections.Transformer)
*lazyMap(java.util.Map p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map lazyMap(java.util.Map p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.MapUtils.lazyMap(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#lazyMap(java.util.Map,org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.MapUtils#lazyMap(java.util.Map,org.apache.commons.collections.Factory)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.lazyMap(java.util.Map,org.apache.commons.collections.Factory)
*lazyMap(java.util.Map p0,org.apache.commons.collections.Factory p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map lazyMap(java.util.Map p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.MapUtils.lazyMap(p0,p1);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#mapTransformer(java.util.Map)}
*@see org.apache.commons.collections.TransformerUtils#mapTransformer(java.util.Map)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.mapTransformer(java.util.Map)
*mapTransformer(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer mapTransformer(java.util.Map p0){
	return org.apache.commons.collections.TransformerUtils.mapTransformer(p0);
}
/**
*{@link org.apache.commons.exec.util.MapUtils#merge(java.util.Map<K, V>,java.util.Map<K, V>)}
*@see org.apache.commons.exec.util.MapUtils#merge(java.util.Map<K, V>,java.util.Map<K, V>)
*<code>public static <K,V> java.util.Map<K, V> org.apache.commons.exec.util.MapUtils.merge(java.util.Map<K, V>,java.util.Map<K, V>)
*merge(java.util.Map<K, V> p0,java.util.Map<K, V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> merge(java.util.Map<K, V> p0,java.util.Map<K, V> p1){
	return org.apache.commons.exec.util.MapUtils.merge(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.CollectionUtils#mergeMaps(java.util.Map<K, V>...)}
*@see org.codehaus.plexus.util.CollectionUtils#mergeMaps(java.util.Map<K, V>...)
*<code>public static <K,V> java.util.Map<K, V> org.codehaus.plexus.util.CollectionUtils.mergeMaps(java.util.Map<K, V>[])
*mergeMaps(java.util.Map<K, V>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> mergeMaps(java.util.Map<K, V>... p0){
	return org.codehaus.plexus.util.CollectionUtils.mergeMaps(p0);
}
/**
*{@link org.codehaus.plexus.util.CollectionUtils#mergeMaps(java.util.Map<K, V>,java.util.Map<K, V>)}
*@see org.codehaus.plexus.util.CollectionUtils#mergeMaps(java.util.Map<K, V>,java.util.Map<K, V>)
*<code>public static <K,V> java.util.Map<K, V> org.codehaus.plexus.util.CollectionUtils.mergeMaps(java.util.Map<K, V>,java.util.Map<K, V>)
*mergeMaps(java.util.Map<K, V> p0,java.util.Map<K, V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> mergeMaps(java.util.Map<K, V> p0,java.util.Map<K, V> p1){
	return org.codehaus.plexus.util.CollectionUtils.mergeMaps(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#multiValueMap(java.util.Map,org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.MapUtils#multiValueMap(java.util.Map,org.apache.commons.collections.Factory)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.multiValueMap(java.util.Map,org.apache.commons.collections.Factory)
*multiValueMap(java.util.Map p0,org.apache.commons.collections.Factory p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map multiValueMap(java.util.Map p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.MapUtils.multiValueMap(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#multiValueMap(java.util.Map,java.lang.Class)}
*@see org.apache.commons.collections.MapUtils#multiValueMap(java.util.Map,java.lang.Class)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.multiValueMap(java.util.Map,java.lang.Class)
*multiValueMap(java.util.Map p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map multiValueMap(java.util.Map p0,java.lang.Class p1){
	return org.apache.commons.collections.MapUtils.multiValueMap(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#multiValueMap(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#multiValueMap(java.util.Map)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.multiValueMap(java.util.Map)
*multiValueMap(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map multiValueMap(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.multiValueMap(p0);
}
/**
*{@link org.apache.commons.lang3.Validate#notEmpty(T,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.Validate#notEmpty(T,java.lang.String,java.lang.Object...)
*<code>public static <T> T org.apache.commons.lang3.Validate.notEmpty(T,java.lang.String,java.lang.Object...)
*notEmpty(T p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.util.Map<?, ?> > T notEmpty(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.notEmpty(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.Validate#notEmpty(T)}
*@see org.apache.commons.lang3.Validate#notEmpty(T)
*<code>public static <T> T org.apache.commons.lang3.Validate.notEmpty(T)
*notEmpty(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.util.Map<?, ?> > T notEmpty(T p0){
	return org.apache.commons.lang3.Validate.notEmpty(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#orderedMap(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#orderedMap(java.util.Map)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.orderedMap(java.util.Map)
*orderedMap(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map orderedMap(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.orderedMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#predicatedMap(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.MapUtils#predicatedMap(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.predicatedMap(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*predicatedMap(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map predicatedMap(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.MapUtils.predicatedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.exec.util.MapUtils#prefix(java.util.Map<K, V>,java.lang.String)}
*@see org.apache.commons.exec.util.MapUtils#prefix(java.util.Map<K, V>,java.lang.String)
*<code>public static <K,V> java.util.Map<java.lang.String, V> org.apache.commons.exec.util.MapUtils.prefix(java.util.Map<K, V>,java.lang.String)
*prefix(java.util.Map<K, V> p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<java.lang.String, V> prefix(java.util.Map<K, V> p0,java.lang.String p1){
	return org.apache.commons.exec.util.MapUtils.prefix(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#putAll(java.util.Map<K, V>,java.lang.Object...)}
*@see org.apache.commons.collections4.MapUtils#putAll(java.util.Map<K, V>,java.lang.Object...)
*<code>public static <K,V> java.util.Map<K, V> org.apache.commons.collections4.MapUtils.putAll(java.util.Map<K, V>,java.lang.Object[])
*putAll(java.util.Map<K, V> p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> putAll(java.util.Map<K, V> p0,java.lang.Object... p1){
	return org.apache.commons.collections4.MapUtils.putAll(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#putAll(java.util.Map,java.lang.Object...)}
*@see org.apache.commons.collections.MapUtils#putAll(java.util.Map,java.lang.Object...)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.putAll(java.util.Map,java.lang.Object[])
*putAll(java.util.Map p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map putAll(java.util.Map p0,java.lang.Object... p1){
	return org.apache.commons.collections.MapUtils.putAll(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#safeAddToMap(java.util.Map,java.lang.Object,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#safeAddToMap(java.util.Map,java.lang.Object,java.lang.Object)
*<code>public static void org.apache.commons.collections.MapUtils.safeAddToMap(java.util.Map,java.lang.Object,java.lang.Object) throws java.lang.NullPointerException
*safeAddToMap(java.util.Map p0,java.lang.Object p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void safeAddToMap(java.util.Map p0,java.lang.Object p1,java.lang.Object p2) throws java.lang.NullPointerException{
	 org.apache.commons.collections.MapUtils.safeAddToMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#switchClosure(java.util.Map)}
*@see org.apache.commons.collections.ClosureUtils#switchClosure(java.util.Map)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchClosure(java.util.Map)
*switchClosure(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure switchClosure(java.util.Map p0){
	return org.apache.commons.collections.ClosureUtils.switchClosure(p0);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#switchMapClosure(java.util.Map)}
*@see org.apache.commons.collections.ClosureUtils#switchMapClosure(java.util.Map)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchMapClosure(java.util.Map)
*switchMapClosure(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure switchMapClosure(java.util.Map p0){
	return org.apache.commons.collections.ClosureUtils.switchMapClosure(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#switchMapTransformer(java.util.Map)}
*@see org.apache.commons.collections.TransformerUtils#switchMapTransformer(java.util.Map)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchMapTransformer(java.util.Map)
*switchMapTransformer(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer switchMapTransformer(java.util.Map p0){
	return org.apache.commons.collections.TransformerUtils.switchMapTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#switchTransformer(java.util.Map)}
*@see org.apache.commons.collections.TransformerUtils#switchTransformer(java.util.Map)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(java.util.Map)
*switchTransformer(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(java.util.Map p0){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.MapUtils#synchronizedMap(java.util.Map<K, V>)}
*@see org.apache.commons.collections4.MapUtils#synchronizedMap(java.util.Map<K, V>)
*<code>public static <K,V> java.util.Map<K, V> org.apache.commons.collections4.MapUtils.synchronizedMap(java.util.Map<K, V>)
*synchronizedMap(java.util.Map<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> p0){
	return org.apache.commons.collections4.MapUtils.synchronizedMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#synchronizedMap(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#synchronizedMap(java.util.Map)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.synchronizedMap(java.util.Map)
*synchronizedMap(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map synchronizedMap(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.synchronizedMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#synchronizedSortedMap(java.util.SortedMap)}
*@see org.apache.commons.collections.MapUtils#synchronizedSortedMap(java.util.SortedMap)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.synchronizedSortedMap(java.util.SortedMap)
*synchronizedSortedMap(java.util.SortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map synchronizedSortedMap(java.util.SortedMap p0){
	return org.apache.commons.collections.MapUtils.synchronizedSortedMap(p0);
}
/**
*{@link org.apache.commons.collections4.MapUtils#toMap(java.util.ResourceBundle)}
*@see org.apache.commons.collections4.MapUtils#toMap(java.util.ResourceBundle)
*<code>public static java.util.Map<java.lang.String, java.lang.Object> org.apache.commons.collections4.MapUtils.toMap(java.util.ResourceBundle)
*toMap(java.util.ResourceBundle p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.String, java.lang.Object> toMap(java.util.ResourceBundle p0){
	return org.apache.commons.collections4.MapUtils.toMap(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#toMap(java.lang.Object...)}
*@see org.apache.commons.lang3.ArrayUtils#toMap(java.lang.Object...)
*<code>public static java.util.Map<java.lang.Object, java.lang.Object> org.apache.commons.lang3.ArrayUtils.toMap(java.lang.Object[])
*toMap(java.lang.Object... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.Object, java.lang.Object> toMap(java.lang.Object... p0){
	return org.apache.commons.lang3.ArrayUtils.toMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#toProperties(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#toProperties(java.util.Map)
*<code>public static java.util.Properties org.apache.commons.collections.MapUtils.toProperties(java.util.Map)
*toProperties(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties toProperties(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.toProperties(p0);
}
/**
*{@link com.google.common.collect.Maps#transformEntries(java.util.Map<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)}
*@see com.google.common.collect.Maps#transformEntries(java.util.Map<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*<code>public static <K,V1,V2> java.util.Map<K, V2> com.google.common.collect.Maps.transformEntries(java.util.Map<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*transformEntries(java.util.Map<K, V1> p0,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V1,V2> java.util.Map<K, V2> transformEntries(java.util.Map<K, V1> p0,com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> p1){
	return com.google.common.collect.Maps.transformEntries(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#transformValues(java.util.Map<K, V1>,com.google.common.base.Function<? super V1, V2>)}
*@see com.google.common.collect.Maps#transformValues(java.util.Map<K, V1>,com.google.common.base.Function<? super V1, V2>)
*<code>public static <K,V1,V2> java.util.Map<K, V2> com.google.common.collect.Maps.transformValues(java.util.Map<K, V1>,com.google.common.base.Function<? super V1, V2>)
*transformValues(java.util.Map<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V1,V2> java.util.Map<K, V2> transformValues(java.util.Map<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
	return com.google.common.collect.Maps.transformValues(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#transformedMap(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.MapUtils#transformedMap(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.transformedMap(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*transformedMap(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map transformedMap(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.MapUtils.transformedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#typedMap(java.util.Map,java.lang.Class,java.lang.Class)}
*@see org.apache.commons.collections.MapUtils#typedMap(java.util.Map,java.lang.Class,java.lang.Class)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.typedMap(java.util.Map,java.lang.Class,java.lang.Class)
*typedMap(java.util.Map p0,java.lang.Class p1,java.lang.Class p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map typedMap(java.util.Map p0,java.lang.Class p1,java.lang.Class p2){
	return org.apache.commons.collections.MapUtils.typedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.MapUtils#unmodifiableMap(java.util.Map<? extends K, ? extends V>)}
*@see org.apache.commons.collections4.MapUtils#unmodifiableMap(java.util.Map<? extends K, ? extends V>)
*<code>public static <K,V> java.util.Map<K, V> org.apache.commons.collections4.MapUtils.unmodifiableMap(java.util.Map<? extends K, ? extends V>)
*unmodifiableMap(java.util.Map<? extends K, ? extends V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> p0){
	return org.apache.commons.collections4.MapUtils.unmodifiableMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#unmodifiableMap(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#unmodifiableMap(java.util.Map)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.unmodifiableMap(java.util.Map)
*unmodifiableMap(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map unmodifiableMap(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.unmodifiableMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#unmodifiableSortedMap(java.util.SortedMap)}
*@see org.apache.commons.collections.MapUtils#unmodifiableSortedMap(java.util.SortedMap)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.unmodifiableSortedMap(java.util.SortedMap)
*unmodifiableSortedMap(java.util.SortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map unmodifiableSortedMap(java.util.SortedMap p0){
	return org.apache.commons.collections.MapUtils.unmodifiableSortedMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#verbosePrint(java.io.PrintStream,java.lang.Object,java.util.Map)}
*@see org.apache.commons.collections.MapUtils#verbosePrint(java.io.PrintStream,java.lang.Object,java.util.Map)
*<code>public static void org.apache.commons.collections.MapUtils.verbosePrint(java.io.PrintStream,java.lang.Object,java.util.Map)
*verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
	 org.apache.commons.collections.MapUtils.verbosePrint(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.SplitMapUtils#writableMap(org.apache.commons.collections4.Put<K, V>)}
*@see org.apache.commons.collections4.SplitMapUtils#writableMap(org.apache.commons.collections4.Put<K, V>)
*<code>public static <K,V> java.util.Map<K, V> org.apache.commons.collections4.SplitMapUtils.writableMap(org.apache.commons.collections4.Put<K, V>)
*writableMap(org.apache.commons.collections4.Put<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Map<K, V> writableMap(org.apache.commons.collections4.Put<K, V> p0){
	return org.apache.commons.collections4.SplitMapUtils.writableMap(p0);
}
}
