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
public final class NavigableMapUtil{ 
/**
*{@link com.google.common.collect.Maps#asMap(java.util.NavigableSet<K>,com.google.common.base.Function<? super K, V>)}
*@see com.google.common.collect.Maps#asMap(java.util.NavigableSet<K>,com.google.common.base.Function<? super K, V>)
*<code>public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.asMap(java.util.NavigableSet<K>,com.google.common.base.Function<? super K, V>)
*asMap(java.util.NavigableSet<K> p0,com.google.common.base.Function<? super K, V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.NavigableMap<K, V> asMap(java.util.NavigableSet<K> p0,com.google.common.base.Function<? super K, V> p1){
	return com.google.common.collect.Maps.asMap(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#filterEntries(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)}
*@see com.google.common.collect.Maps#filterEntries(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)
*<code>public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.filterEntries(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>>)
*filterEntries(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.NavigableMap<K, V> filterEntries(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> p1){
	return com.google.common.collect.Maps.filterEntries(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#filterKeys(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super K>)}
*@see com.google.common.collect.Maps#filterKeys(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super K>)
*<code>public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.filterKeys(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super K>)
*filterKeys(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.NavigableMap<K, V> filterKeys(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super K> p1){
	return com.google.common.collect.Maps.filterKeys(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#filterValues(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super V>)}
*@see com.google.common.collect.Maps#filterValues(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super V>)
*<code>public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.filterValues(java.util.NavigableMap<K, V>,com.google.common.base.Predicate<? super V>)
*filterValues(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super V> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.NavigableMap<K, V> filterValues(java.util.NavigableMap<K, V> p0,com.google.common.base.Predicate<? super V> p1){
	return com.google.common.collect.Maps.filterValues(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#subMap(java.util.NavigableMap<K, V>,com.google.common.collect.Range<K>)}
*@see com.google.common.collect.Maps#subMap(java.util.NavigableMap<K, V>,com.google.common.collect.Range<K>)
*<code>public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.subMap(java.util.NavigableMap<K, V>,com.google.common.collect.Range<K>)
*subMap(java.util.NavigableMap<K, V> p0,com.google.common.collect.Range<K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K extends java.lang.Comparable<? super K> ,V> java.util.NavigableMap<K, V> subMap(java.util.NavigableMap<K, V> p0,com.google.common.collect.Range<K> p1){
	return com.google.common.collect.Maps.subMap(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#synchronizedNavigableMap(java.util.NavigableMap<K, V>)}
*@see com.google.common.collect.Maps#synchronizedNavigableMap(java.util.NavigableMap<K, V>)
*<code>public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.synchronizedNavigableMap(java.util.NavigableMap<K, V>)
*synchronizedNavigableMap(java.util.NavigableMap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.NavigableMap<K, V> synchronizedNavigableMap(java.util.NavigableMap<K, V> p0){
	return com.google.common.collect.Maps.synchronizedNavigableMap(p0);
}
/**
*{@link com.google.common.collect.Maps#transformEntries(java.util.NavigableMap<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)}
*@see com.google.common.collect.Maps#transformEntries(java.util.NavigableMap<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*<code>public static <K,V1,V2> java.util.NavigableMap<K, V2> com.google.common.collect.Maps.transformEntries(java.util.NavigableMap<K, V1>,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2>)
*transformEntries(java.util.NavigableMap<K, V1> p0,com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V1,V2> java.util.NavigableMap<K, V2> transformEntries(java.util.NavigableMap<K, V1> p0,com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> p1){
	return com.google.common.collect.Maps.transformEntries(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#transformValues(java.util.NavigableMap<K, V1>,com.google.common.base.Function<? super V1, V2>)}
*@see com.google.common.collect.Maps#transformValues(java.util.NavigableMap<K, V1>,com.google.common.base.Function<? super V1, V2>)
*<code>public static <K,V1,V2> java.util.NavigableMap<K, V2> com.google.common.collect.Maps.transformValues(java.util.NavigableMap<K, V1>,com.google.common.base.Function<? super V1, V2>)
*transformValues(java.util.NavigableMap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V1,V2> java.util.NavigableMap<K, V2> transformValues(java.util.NavigableMap<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
	return com.google.common.collect.Maps.transformValues(p0,p1);
}
/**
*{@link com.google.common.collect.Maps#unmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V>)}
*@see com.google.common.collect.Maps#unmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V>)
*<code>public static <K,V> java.util.NavigableMap<K, V> com.google.common.collect.Maps.unmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V>)
*unmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.NavigableMap<K, V> unmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> p0){
	return com.google.common.collect.Maps.unmodifiableNavigableMap(p0);
}
}
