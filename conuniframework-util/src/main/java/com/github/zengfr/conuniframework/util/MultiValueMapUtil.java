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
public final class MultiValueMapUtil{ 
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
*{@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,org.apache.commons.collections.Factory)
*<code>public static org.apache.commons.collections.map.MultiValueMap org.apache.commons.collections.map.MultiValueMap.decorate(java.util.Map,org.apache.commons.collections.Factory)
*decorate(java.util.Map p0,org.apache.commons.collections.Factory p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.map.MultiValueMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map)}
*@see org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map)
*<code>public static org.apache.commons.collections.map.MultiValueMap org.apache.commons.collections.map.MultiValueMap.decorate(java.util.Map)
*decorate(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0){
	return org.apache.commons.collections.map.MultiValueMap.decorate(p0);
}
/**
*{@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map<K, ? super C>,java.lang.Class<C>)}
*@see org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map<K, ? super C>,java.lang.Class<C>)
*<code>public static <K,V,C> org.apache.commons.collections4.map.MultiValueMap<K, V> org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map<K, ? super C>,java.lang.Class<C>)
*multiValueMap(java.util.Map<K, ? super C> p0,java.lang.Class<C> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, ? super C> p0,java.lang.Class<C> p1){
	return org.apache.commons.collections4.map.MultiValueMap.multiValueMap(p0,p1);
}
/**
*{@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map<K, ? super java.util.Collection<V>>)}
*@see org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map<K, ? super java.util.Collection<V>>)
*<code>public static <K,V> org.apache.commons.collections4.map.MultiValueMap<K, V> org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map<K, ? super java.util.Collection<V>>)
*multiValueMap(java.util.Map<K, ? super java.util.Collection<V>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, ? super java.util.Collection<V>> p0){
	return org.apache.commons.collections4.map.MultiValueMap.multiValueMap(p0);
}
/**
*{@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map<K, ? super C>,org.apache.commons.collections4.Factory<C>)}
*@see org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map<K, ? super C>,org.apache.commons.collections4.Factory<C>)
*<code>public static <K,V,C> org.apache.commons.collections4.map.MultiValueMap<K, V> org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map<K, ? super C>,org.apache.commons.collections4.Factory<C>)
*multiValueMap(java.util.Map<K, ? super C> p0,org.apache.commons.collections4.Factory<C> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, ? super C> p0,org.apache.commons.collections4.Factory<C> p1){
	return org.apache.commons.collections4.map.MultiValueMap.multiValueMap(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#multiValueMap(java.util.Map<K, C>,org.apache.commons.collections4.Factory<C>)}
*@see org.apache.commons.collections4.MapUtils#multiValueMap(java.util.Map<K, C>,org.apache.commons.collections4.Factory<C>)
*<code>public static <K,V,C> org.apache.commons.collections4.map.MultiValueMap<K, V> org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map<K, C>,org.apache.commons.collections4.Factory<C>)
*multiValueMap(java.util.Map<K, C> p0,org.apache.commons.collections4.Factory<C> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, C> p0,org.apache.commons.collections4.Factory<C> p1){
	return org.apache.commons.collections4.MapUtils.multiValueMap(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#multiValueMap(java.util.Map<K, C>,java.lang.Class<C>)}
*@see org.apache.commons.collections4.MapUtils#multiValueMap(java.util.Map<K, C>,java.lang.Class<C>)
*<code>public static <K,V,C> org.apache.commons.collections4.map.MultiValueMap<K, V> org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map<K, C>,java.lang.Class<C>)
*multiValueMap(java.util.Map<K, C> p0,java.lang.Class<C> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, C> p0,java.lang.Class<C> p1){
	return org.apache.commons.collections4.MapUtils.multiValueMap(p0,p1);
}
}
