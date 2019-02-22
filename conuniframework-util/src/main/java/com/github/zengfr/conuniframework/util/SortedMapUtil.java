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
public final class SortedMapUtil{ 
/**
*{@link com.google.common.collect.Maps#asMap(java.util.SortedSet<K>,com.google.common.base.Function<? super K, V>)}
*@see com.google.common.collect.Maps#asMap(java.util.SortedSet<K>,com.google.common.base.Function<? super K, V>)
*<code>public static <K,V> java.util.SortedMap<K, V> com.google.common.collect.Maps.asMap(java.util.SortedSet<K>,com.google.common.base.Function<? super K, V>)
*asMap(java.util.SortedSet<K> p0,com.google.common.base.Function<? super K, V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> asMap(java.util.SortedSet<K> p0,com.google.common.base.Function<? super K, V> p1){
	return com.google.common.collect.Maps.asMap(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.FixedSizeSortedMap#decorate(java.util.SortedMap)}
*@see org.apache.commons.collections.map.FixedSizeSortedMap#decorate(java.util.SortedMap)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.FixedSizeSortedMap.decorate(java.util.SortedMap)
*decorate(java.util.SortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0){
	return org.apache.commons.collections.map.FixedSizeSortedMap.decorate(p0);
}
/**
*{@link org.apache.commons.collections.map.TransformedSortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.TransformedSortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.TransformedSortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.map.TransformedSortedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.LazySortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.map.LazySortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Factory)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.LazySortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Factory)
*decorate(java.util.SortedMap p0,org.apache.commons.collections.Factory p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.map.LazySortedMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.LazySortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.LazySortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.LazySortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Transformer)
*decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.map.LazySortedMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.PredicatedSortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.map.PredicatedSortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.PredicatedSortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*decorate(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.map.PredicatedSortedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.TypedSortedMap#decorate(java.util.SortedMap,java.lang.Class,java.lang.Class)}
*@see org.apache.commons.collections.map.TypedSortedMap#decorate(java.util.SortedMap,java.lang.Class,java.lang.Class)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.TypedSortedMap.decorate(java.util.SortedMap,java.lang.Class,java.lang.Class)
*decorate(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2){
	return org.apache.commons.collections.map.TypedSortedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.TransformedSortedMap#decorateTransform(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.TransformedSortedMap#decorateTransform(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.TransformedSortedMap.decorateTransform(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*decorateTransform(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorateTransform(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.map.TransformedSortedMap.decorateTransform(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Maps#filterEntries(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)}
*@see com.google.common.collect.Maps#filterEntries(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)
*<code>public static <K,V> java.util.SortedMap<K, V> com.google.common.collect.Maps.filterEntries(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)
*filterEntries(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> filterEntries(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> p1){
	return com.google.common.collect.Maps.filterEntries(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#filterKeys(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super K>)}
*@see com.google.common.collect.Maps#filterKeys(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super K>)
*<code>public static <K,V> java.util.SortedMap<K, V> com.google.common.collect.Maps.filterKeys(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super K>)
*filterKeys(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> filterKeys(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
	return com.google.common.collect.Maps.filterKeys(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#filterValues(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super V>)}
*@see com.google.common.collect.Maps#filterValues(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super V>)
*<code>public static <K,V> java.util.SortedMap<K, V> com.google.common.collect.Maps.filterValues(java.util.SortedMap<K, V>,com.google.common.base.Predicate<? super V>)
*filterValues(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> filterValues(java.util.SortedMap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
	return com.google.common.collect.Maps.filterValues(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#fixedSizeSortedMap(java.util.SortedMap<K, V>)}
*@see org.apache.commons.collections4.MapUtils#fixedSizeSortedMap(java.util.SortedMap<K, V>)
*<code>public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(java.util.SortedMap<K, V>)
*fixedSizeSortedMap(java.util.SortedMap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> fixedSizeSortedMap(java.util.SortedMap<K, V> p0){
	return org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#fixedSizeSortedMap(java.util.SortedMap)}
*@see org.apache.commons.collections.MapUtils#fixedSizeSortedMap(java.util.SortedMap)
*<code>public static java.util.SortedMap org.apache.commons.collections.MapUtils.fixedSizeSortedMap(java.util.SortedMap)
*fixedSizeSortedMap(java.util.SortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap fixedSizeSortedMap(java.util.SortedMap p0){
	return org.apache.commons.collections.MapUtils.fixedSizeSortedMap(p0);
}
/**
*{@link org.apache.commons.collections4.MapUtils#lazySortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Factory<? extends V>)}
*@see org.apache.commons.collections4.MapUtils#lazySortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Factory<? extends V>)
*<code>public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.lazySortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Factory<? extends V>)
*lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
	return org.apache.commons.collections4.MapUtils.lazySortedMap(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#lazySortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends V>)}
*@see org.apache.commons.collections4.MapUtils#lazySortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends V>)
*<code>public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.lazySortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends V>)
*lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
	return org.apache.commons.collections4.MapUtils.lazySortedMap(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.MapUtils#lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedMap org.apache.commons.collections.MapUtils.lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer)
*lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.MapUtils.lazySortedMap(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.MapUtils#lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Factory)
*<code>public static java.util.SortedMap org.apache.commons.collections.MapUtils.lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Factory)
*lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Factory p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.MapUtils.lazySortedMap(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#predicatedSortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Predicate<? super K>,org.apache.commons.collections4.Predicate<? super V>)}
*@see org.apache.commons.collections4.MapUtils#predicatedSortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Predicate<? super K>,org.apache.commons.collections4.Predicate<? super V>)
*<code>public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.predicatedSortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Predicate<? super K>,org.apache.commons.collections4.Predicate<? super V>)
*predicatedSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Predicate<? super K> p1,org.apache.commons.collections4.Predicate<? super V> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> predicatedSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Predicate<? super K> p1,org.apache.commons.collections4.Predicate<? super V> p2){
	return org.apache.commons.collections4.MapUtils.predicatedSortedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#predicatedSortedMap(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.MapUtils#predicatedSortedMap(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*<code>public static java.util.SortedMap org.apache.commons.collections.MapUtils.predicatedSortedMap(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*predicatedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap predicatedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.MapUtils.predicatedSortedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.Charsets#requiredCharsets()}
*@see org.apache.commons.io.Charsets#requiredCharsets()
*<code>public static java.util.SortedMap<java.lang.String, java.nio.charset.Charset> org.apache.commons.io.Charsets.requiredCharsets()
*requiredCharsets()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap<java.lang.String, java.nio.charset.Charset> requiredCharsets(){
	return org.apache.commons.io.Charsets.requiredCharsets();
}
/**
*{@link org.apache.commons.collections4.MapUtils#synchronizedSortedMap(java.util.SortedMap<K, V>)}
*@see org.apache.commons.collections4.MapUtils#synchronizedSortedMap(java.util.SortedMap<K, V>)
*<code>public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.synchronizedSortedMap(java.util.SortedMap<K, V>)
*synchronizedSortedMap(java.util.SortedMap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> synchronizedSortedMap(java.util.SortedMap<K, V> p0){
	return org.apache.commons.collections4.MapUtils.synchronizedSortedMap(p0);
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
*{@link com.google.common.collect.Maps#transformEntries(java.util.SortedMap<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)}
*@see com.google.common.collect.Maps#transformEntries(java.util.SortedMap<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*<code>public static <K,V1,V2> java.util.SortedMap<K, V2> com.google.common.collect.Maps.transformEntries(java.util.SortedMap<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*transformEntries(java.util.SortedMap<K, V1> p0,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V1,V2> java.util.SortedMap<K, V2> transformEntries(java.util.SortedMap<K, V1> p0,com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> p1){
	return com.google.common.collect.Maps.transformEntries(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#transformValues(java.util.SortedMap<K, V1>,com.google.common.base.Function<? super V1, V2>)}
*@see com.google.common.collect.Maps#transformValues(java.util.SortedMap<K, V1>,com.google.common.base.Function<? super V1, V2>)
*<code>public static <K,V1,V2> java.util.SortedMap<K, V2> com.google.common.collect.Maps.transformValues(java.util.SortedMap<K, V1>,com.google.common.base.Function<? super V1, V2>)
*transformValues(java.util.SortedMap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V1,V2> java.util.SortedMap<K, V2> transformValues(java.util.SortedMap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
	return com.google.common.collect.Maps.transformValues(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#transformedSortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)}
*@see org.apache.commons.collections4.MapUtils#transformedSortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*<code>public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.MapUtils.transformedSortedMap(java.util.SortedMap<K, V>,org.apache.commons.collections4.Transformer<? super K, ? extends K>,org.apache.commons.collections4.Transformer<? super V, ? extends V>)
*transformedSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> transformedSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
	return org.apache.commons.collections4.MapUtils.transformedSortedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#transformedSortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.MapUtils#transformedSortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedMap org.apache.commons.collections.MapUtils.transformedSortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*transformedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap transformedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.MapUtils.transformedSortedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#typedSortedMap(java.util.SortedMap,java.lang.Class,java.lang.Class)}
*@see org.apache.commons.collections.MapUtils#typedSortedMap(java.util.SortedMap,java.lang.Class,java.lang.Class)
*<code>public static java.util.SortedMap org.apache.commons.collections.MapUtils.typedSortedMap(java.util.SortedMap,java.lang.Class,java.lang.Class)
*typedSortedMap(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap typedSortedMap(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2){
	return org.apache.commons.collections.MapUtils.typedSortedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.map.UnmodifiableSortedMap#unmodifiableSortedMap(java.util.SortedMap<K, ? extends V>)}
*@see org.apache.commons.collections4.map.UnmodifiableSortedMap#unmodifiableSortedMap(java.util.SortedMap<K, ? extends V>)
*<code>public static <K,V> java.util.SortedMap<K, V> org.apache.commons.collections4.map.UnmodifiableSortedMap.unmodifiableSortedMap(java.util.SortedMap<K, ? extends V>)
*unmodifiableSortedMap(java.util.SortedMap<K, ? extends V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.SortedMap<K, V> unmodifiableSortedMap(java.util.SortedMap<K, ? extends V> p0){
	return org.apache.commons.collections4.map.UnmodifiableSortedMap.unmodifiableSortedMap(p0);
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
}
