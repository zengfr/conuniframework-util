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
public final class MultimapUtil{ 
/**
*{@link com.google.common.collect.Multimaps#filterEntries(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)}
*@see com.google.common.collect.Multimaps#filterEntries(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)
*<code>public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.filterEntries(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)
*filterEntries(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> filterEntries(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> p1){
	return com.google.common.collect.Multimaps.filterEntries(p0,p1);
}
/**
*{@link com.google.common.collect.Multimaps#filterKeys(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super K>)}
*@see com.google.common.collect.Multimaps#filterKeys(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super K>)
*<code>public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.filterKeys(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super K>)
*filterKeys(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> filterKeys(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
	return com.google.common.collect.Multimaps.filterKeys(p0,p1);
}
/**
*{@link com.google.common.collect.Multimaps#filterValues(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super V>)}
*@see com.google.common.collect.Multimaps#filterValues(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super V>)
*<code>public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.filterValues(com.google.common.collect.Multimap<K, V>,com.google.common.base.Predicate<? super V>)
*filterValues(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> filterValues(com.google.common.collect.Multimap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
	return com.google.common.collect.Multimaps.filterValues(p0,p1);
}
/**
*{@link com.google.common.collect.Multimaps#invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K>,M)}
*@see com.google.common.collect.Multimaps#invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K>,M)
*<code>public static <K,V,M> M com.google.common.collect.Multimaps.invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K>,M)
*invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K> p0,M p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V,M extends com.google.common.collect.Multimap<K, V> > M invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K> p0,M p1){
	return com.google.common.collect.Multimaps.invertFrom(p0,p1);
}
/**
*{@link com.google.common.collect.Multimaps#newMultimap(java.util.Map<K, java.util.Collection<V>>,com.google.common.base.Supplier<? extends java.util.Collection<V>>)}
*@see com.google.common.collect.Multimaps#newMultimap(java.util.Map<K, java.util.Collection<V>>,com.google.common.base.Supplier<? extends java.util.Collection<V>>)
*<code>public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.newMultimap(java.util.Map<K, java.util.Collection<V>>,com.google.common.base.Supplier<? extends java.util.Collection<V>>)
*newMultimap(java.util.Map<K, java.util.Collection<V>> p0,com.google.common.base.Supplier<? extends java.util.Collection<V>> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> newMultimap(java.util.Map<K, java.util.Collection<V>> p0,com.google.common.base.Supplier<? extends java.util.Collection<V>> p1){
	return com.google.common.collect.Multimaps.newMultimap(p0,p1);
}
/**
*{@link com.google.common.collect.Multimaps#synchronizedMultimap(com.google.common.collect.Multimap<K, V>)}
*@see com.google.common.collect.Multimaps#synchronizedMultimap(com.google.common.collect.Multimap<K, V>)
*<code>public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.synchronizedMultimap(com.google.common.collect.Multimap<K, V>)
*synchronizedMultimap(com.google.common.collect.Multimap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> synchronizedMultimap(com.google.common.collect.Multimap<K, V> p0){
	return com.google.common.collect.Multimaps.synchronizedMultimap(p0);
}
/**
*{@link com.google.common.collect.Multimaps#transformEntries(com.google.common.collect.Multimap<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)}
*@see com.google.common.collect.Multimaps#transformEntries(com.google.common.collect.Multimap<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*<code>public static <K,V1,V2> com.google.common.collect.Multimap<K, V2> com.google.common.collect.Multimaps.transformEntries(com.google.common.collect.Multimap<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*transformEntries(com.google.common.collect.Multimap<K, V1> p0,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V1,V2> com.google.common.collect.Multimap<K, V2> transformEntries(com.google.common.collect.Multimap<K, V1> p0,com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> p1){
	return com.google.common.collect.Multimaps.transformEntries(p0,p1);
}
/**
*{@link com.google.common.collect.Multimaps#transformValues(com.google.common.collect.Multimap<K, V1>,com.google.common.base.Function<? super V1, V2>)}
*@see com.google.common.collect.Multimaps#transformValues(com.google.common.collect.Multimap<K, V1>,com.google.common.base.Function<? super V1, V2>)
*<code>public static <K,V1,V2> com.google.common.collect.Multimap<K, V2> com.google.common.collect.Multimaps.transformValues(com.google.common.collect.Multimap<K, V1>,com.google.common.base.Function<? super V1, V2>)
*transformValues(com.google.common.collect.Multimap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V1,V2> com.google.common.collect.Multimap<K, V2> transformValues(com.google.common.collect.Multimap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
	return com.google.common.collect.Multimaps.transformValues(p0,p1);
}
/**
*{@link com.google.common.collect.Multimaps#unmodifiableMultimap(com.google.common.collect.Multimap<K, V>)}
*@see com.google.common.collect.Multimaps#unmodifiableMultimap(com.google.common.collect.Multimap<K, V>)
*<code>public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.unmodifiableMultimap(com.google.common.collect.Multimap<K, V>)
*unmodifiableMultimap(com.google.common.collect.Multimap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.Multimap<K, V> p0){
	return com.google.common.collect.Multimaps.unmodifiableMultimap(p0);
}
/**
*{@link com.google.common.collect.Multimaps#unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V>)}
*@see com.google.common.collect.Multimaps#unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V>)
*<code>public static <K,V> com.google.common.collect.Multimap<K, V> com.google.common.collect.Multimaps.unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V>)
*unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V> p0){
	return com.google.common.collect.Multimaps.unmodifiableMultimap(p0);
}
}
