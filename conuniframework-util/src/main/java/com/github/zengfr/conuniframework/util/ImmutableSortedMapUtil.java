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
public final class ImmutableSortedMapUtil{ 
/**
*{@link com.google.common.collect.ImmutableSortedMap#copyOf(java.util.Map<? extends K, ? extends V>)}
*@see com.google.common.collect.ImmutableSortedMap#copyOf(java.util.Map<? extends K, ? extends V>)
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.copyOf(java.util.Map<? extends K, ? extends V>)
*copyOf(java.util.Map<? extends K, ? extends V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> p0){
	return com.google.common.collect.ImmutableSortedMap.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#copyOf(java.util.Map<? extends K, ? extends V>,java.util.Comparator<? super K>)}
*@see com.google.common.collect.ImmutableSortedMap#copyOf(java.util.Map<? extends K, ? extends V>,java.util.Comparator<? super K>)
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.copyOf(java.util.Map<? extends K, ? extends V>,java.util.Comparator<? super K>)
*copyOf(java.util.Map<? extends K, ? extends V> p0,java.util.Comparator<? super K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> p0,java.util.Comparator<? super K> p1){
	return com.google.common.collect.ImmutableSortedMap.copyOf(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>)}
*@see com.google.common.collect.ImmutableSortedMap#copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>)
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>)
*copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> p0){
	return com.google.common.collect.ImmutableSortedMap.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>,java.util.Comparator<? super K>)}
*@see com.google.common.collect.ImmutableSortedMap#copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>,java.util.Comparator<? super K>)
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>,java.util.Comparator<? super K>)
*copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>> p0,java.util.Comparator<? super K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> p0,java.util.Comparator<? super K> p1){
	return com.google.common.collect.ImmutableSortedMap.copyOf(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#copyOfSorted(java.util.SortedMap<K, ? extends V>)}
*@see com.google.common.collect.ImmutableSortedMap#copyOfSorted(java.util.SortedMap<K, ? extends V>)
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.copyOfSorted(java.util.SortedMap<K, ? extends V>)
*copyOfSorted(java.util.SortedMap<K, ? extends V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfSorted(java.util.SortedMap<K, ? extends V> p0){
	return com.google.common.collect.ImmutableSortedMap.copyOfSorted(p0);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#of(K,V)}
*@see com.google.common.collect.ImmutableSortedMap#of(K,V)
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.of(K,V)
*of(K p0,V p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K extends java.lang.Comparable<? super K> ,V> com.google.common.collect.ImmutableSortedMap<K, V> of(K p0,V p1){
	return com.google.common.collect.ImmutableSortedMap.of(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#of()}
*@see com.google.common.collect.ImmutableSortedMap#of()
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.of()
*of()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> of(){
	return com.google.common.collect.ImmutableSortedMap.of();
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#of(K,V,K,V,K,V,K,V,K,V)}
*@see com.google.common.collect.ImmutableSortedMap#of(K,V,K,V,K,V,K,V,K,V)
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.of(K,V,K,V,K,V,K,V,K,V)
*of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K extends java.lang.Comparable<? super K> ,V> com.google.common.collect.ImmutableSortedMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9){
	return com.google.common.collect.ImmutableSortedMap.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#of(K,V,K,V,K,V)}
*@see com.google.common.collect.ImmutableSortedMap#of(K,V,K,V,K,V)
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.of(K,V,K,V,K,V)
*of(K p0,V p1,K p2,V p3,K p4,V p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K extends java.lang.Comparable<? super K> ,V> com.google.common.collect.ImmutableSortedMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5){
	return com.google.common.collect.ImmutableSortedMap.of(p0,p1,p2,p3,p4,p5);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#of(K,V,K,V,K,V,K,V)}
*@see com.google.common.collect.ImmutableSortedMap#of(K,V,K,V,K,V,K,V)
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.of(K,V,K,V,K,V,K,V)
*of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K extends java.lang.Comparable<? super K> ,V> com.google.common.collect.ImmutableSortedMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7){
	return com.google.common.collect.ImmutableSortedMap.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
/**
*{@link com.google.common.collect.ImmutableSortedMap#of(K,V,K,V)}
*@see com.google.common.collect.ImmutableSortedMap#of(K,V,K,V)
*<code>public static <K,V> com.google.common.collect.ImmutableSortedMap<K, V> com.google.common.collect.ImmutableSortedMap.of(K,V,K,V)
*of(K p0,V p1,K p2,V p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K extends java.lang.Comparable<? super K> ,V> com.google.common.collect.ImmutableSortedMap<K, V> of(K p0,V p1,K p2,V p3){
	return com.google.common.collect.ImmutableSortedMap.of(p0,p1,p2,p3);
}
}
