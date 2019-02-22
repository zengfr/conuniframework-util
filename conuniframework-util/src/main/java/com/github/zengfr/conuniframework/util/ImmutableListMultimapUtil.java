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
public final class ImmutableListMultimapUtil{ 
/**
*{@link com.google.common.collect.ImmutableListMultimap#copyOf(com.google.common.collect.Multimap<? extends K, ? extends V>)}
*@see com.google.common.collect.ImmutableListMultimap#copyOf(com.google.common.collect.Multimap<? extends K, ? extends V>)
*<code>public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.copyOf(com.google.common.collect.Multimap<? extends K, ? extends V>)
*copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> p0){
	return com.google.common.collect.ImmutableListMultimap.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableListMultimap#copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>)}
*@see com.google.common.collect.ImmutableListMultimap#copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>)
*<code>public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>)
*copyOf(java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> p0){
	return com.google.common.collect.ImmutableListMultimap.copyOf(p0);
}
/**
*{@link com.google.common.collect.Multimaps#index(java.lang.Iterable<V>,com.google.common.base.Function<? super V, K>)}
*@see com.google.common.collect.Multimaps#index(java.lang.Iterable<V>,com.google.common.base.Function<? super V, K>)
*<code>public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.Multimaps.index(java.lang.Iterable<V>,com.google.common.base.Function<? super V, K>)
*index(java.lang.Iterable<V> p0,com.google.common.base.Function<? super V, K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.lang.Iterable<V> p0,com.google.common.base.Function<? super V, K> p1){
	return com.google.common.collect.Multimaps.index(p0,p1);
}
/**
*{@link com.google.common.collect.Multimaps#index(java.util.Iterator<V>,com.google.common.base.Function<? super V, K>)}
*@see com.google.common.collect.Multimaps#index(java.util.Iterator<V>,com.google.common.base.Function<? super V, K>)
*<code>public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.Multimaps.index(java.util.Iterator<V>,com.google.common.base.Function<? super V, K>)
*index(java.util.Iterator<V> p0,com.google.common.base.Function<? super V, K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.util.Iterator<V> p0,com.google.common.base.Function<? super V, K> p1){
	return com.google.common.collect.Multimaps.index(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableListMultimap#of(K,V)}
*@see com.google.common.collect.ImmutableListMultimap#of(K,V)
*<code>public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of(K,V)
*of(K p0,V p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1){
	return com.google.common.collect.ImmutableListMultimap.of(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableListMultimap#of()}
*@see com.google.common.collect.ImmutableListMultimap#of()
*<code>public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of()
*of()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(){
	return com.google.common.collect.ImmutableListMultimap.of();
}
/**
*{@link com.google.common.collect.ImmutableListMultimap#of(K,V,K,V,K,V)}
*@see com.google.common.collect.ImmutableListMultimap#of(K,V,K,V,K,V)
*<code>public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of(K,V,K,V,K,V)
*of(K p0,V p1,K p2,V p3,K p4,V p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5){
	return com.google.common.collect.ImmutableListMultimap.of(p0,p1,p2,p3,p4,p5);
}
/**
*{@link com.google.common.collect.ImmutableListMultimap#of(K,V,K,V,K,V,K,V)}
*@see com.google.common.collect.ImmutableListMultimap#of(K,V,K,V,K,V,K,V)
*<code>public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of(K,V,K,V,K,V,K,V)
*of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7){
	return com.google.common.collect.ImmutableListMultimap.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
/**
*{@link com.google.common.collect.ImmutableListMultimap#of(K,V,K,V,K,V,K,V,K,V)}
*@see com.google.common.collect.ImmutableListMultimap#of(K,V,K,V,K,V,K,V,K,V)
*<code>public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of(K,V,K,V,K,V,K,V,K,V)
*of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9){
	return com.google.common.collect.ImmutableListMultimap.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
/**
*{@link com.google.common.collect.ImmutableListMultimap#of(K,V,K,V)}
*@see com.google.common.collect.ImmutableListMultimap#of(K,V,K,V)
*<code>public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> com.google.common.collect.ImmutableListMultimap.of(K,V,K,V)
*of(K p0,V p1,K p2,V p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.ImmutableListMultimap<K, V> of(K p0,V p1,K p2,V p3){
	return com.google.common.collect.ImmutableListMultimap.of(p0,p1,p2,p3);
}
}
