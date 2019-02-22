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
public final class FactoryUtil{ 
/**
*{@link org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Factory)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.asTransformer(org.apache.commons.collections.Factory)
*asTransformer(org.apache.commons.collections.Factory p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Factory p0){
	return org.apache.commons.collections.TransformerUtils.asTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.functors.ConstantFactory#constantFactory(T)}
*@see org.apache.commons.collections4.functors.ConstantFactory#constantFactory(T)
*<code>public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.functors.ConstantFactory.constantFactory(T)
*constantFactory(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Factory<T> constantFactory(T p0){
	return org.apache.commons.collections4.functors.ConstantFactory.constantFactory(p0);
}
/**
*{@link org.apache.commons.collections.FactoryUtils#constantFactory(java.lang.Object)}
*@see org.apache.commons.collections.FactoryUtils#constantFactory(java.lang.Object)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.constantFactory(java.lang.Object)
*constantFactory(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory constantFactory(java.lang.Object p0){
	return org.apache.commons.collections.FactoryUtils.constantFactory(p0);
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
*{@link org.apache.commons.collections.list.LazyList#decorate(java.util.List,org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.list.LazyList#decorate(java.util.List,org.apache.commons.collections.Factory)
*<code>public static java.util.List org.apache.commons.collections.list.LazyList.decorate(java.util.List,org.apache.commons.collections.Factory)
*decorate(java.util.List p0,org.apache.commons.collections.Factory p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.list.LazyList.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.functors.ExceptionFactory#exceptionFactory()}
*@see org.apache.commons.collections4.functors.ExceptionFactory#exceptionFactory()
*<code>public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory()
*exceptionFactory()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Factory<T> exceptionFactory(){
	return org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
}
/**
*{@link org.apache.commons.collections.functors.PrototypeFactory#getInstance(java.lang.Object)}
*@see org.apache.commons.collections.functors.PrototypeFactory#getInstance(java.lang.Object)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.functors.PrototypeFactory.getInstance(java.lang.Object)
*getInstance(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory getInstance(java.lang.Object p0){
	return org.apache.commons.collections.functors.PrototypeFactory.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.ExceptionFactory#getInstance()}
*@see org.apache.commons.collections.functors.ExceptionFactory#getInstance()
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.functors.ExceptionFactory.getInstance()
*getInstance()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory getInstance(){
	return org.apache.commons.collections.functors.ExceptionFactory.getInstance();
}
/**
*{@link org.apache.commons.collections.functors.FactoryTransformer#getInstance(org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.functors.FactoryTransformer#getInstance(org.apache.commons.collections.Factory)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.FactoryTransformer.getInstance(org.apache.commons.collections.Factory)
*getInstance(org.apache.commons.collections.Factory p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Factory p0){
	return org.apache.commons.collections.functors.FactoryTransformer.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.InstantiateFactory#getInstance(java.lang.Class,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.functors.InstantiateFactory#getInstance(java.lang.Class,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.functors.InstantiateFactory.getInstance(java.lang.Class,java.lang.Class[],java.lang.Object[])
*getInstance(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory getInstance(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.functors.InstantiateFactory.getInstance(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.functors.InstantiateFactory#instantiateFactory(java.lang.Class<T>,java.lang.Class<?>[],java.lang.Object...)}
*@see org.apache.commons.collections4.functors.InstantiateFactory#instantiateFactory(java.lang.Class<T>,java.lang.Class<?>[],java.lang.Object...)
*<code>public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.functors.InstantiateFactory.instantiateFactory(java.lang.Class<T>,java.lang.Class<?>[],java.lang.Object[])
*instantiateFactory(java.lang.Class<T> p0,java.lang.Class<?>[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Factory<T> instantiateFactory(java.lang.Class<T> p0,java.lang.Class<?>[] p1,java.lang.Object... p2){
	return org.apache.commons.collections4.functors.InstantiateFactory.instantiateFactory(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.FactoryUtils#instantiateFactory(java.lang.Class<T>)}
*@see org.apache.commons.collections4.FactoryUtils#instantiateFactory(java.lang.Class<T>)
*<code>public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.FactoryUtils.instantiateFactory(java.lang.Class<T>)
*instantiateFactory(java.lang.Class<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Factory<T> instantiateFactory(java.lang.Class<T> p0){
	return org.apache.commons.collections4.FactoryUtils.instantiateFactory(p0);
}
/**
*{@link org.apache.commons.collections.FactoryUtils#instantiateFactory(java.lang.Class)}
*@see org.apache.commons.collections.FactoryUtils#instantiateFactory(java.lang.Class)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.instantiateFactory(java.lang.Class)
*instantiateFactory(java.lang.Class p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0){
	return org.apache.commons.collections.FactoryUtils.instantiateFactory(p0);
}
/**
*{@link org.apache.commons.collections.FactoryUtils#instantiateFactory(java.lang.Class,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.FactoryUtils#instantiateFactory(java.lang.Class,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.instantiateFactory(java.lang.Class,java.lang.Class[],java.lang.Object[])
*instantiateFactory(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.FactoryUtils.instantiateFactory(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.ListUtils#lazyList(java.util.List,org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.ListUtils#lazyList(java.util.List,org.apache.commons.collections.Factory)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.lazyList(java.util.List,org.apache.commons.collections.Factory)
*lazyList(java.util.List p0,org.apache.commons.collections.Factory p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List lazyList(java.util.List p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.ListUtils.lazyList(p0,p1);
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
*{@link org.apache.commons.collections4.FactoryUtils#nullFactory()}
*@see org.apache.commons.collections4.FactoryUtils#nullFactory()
*<code>public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.FactoryUtils.nullFactory()
*nullFactory()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Factory<T> nullFactory(){
	return org.apache.commons.collections4.FactoryUtils.nullFactory();
}
/**
*{@link org.apache.commons.collections4.functors.PrototypeFactory#prototypeFactory(T)}
*@see org.apache.commons.collections4.functors.PrototypeFactory#prototypeFactory(T)
*<code>public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.functors.PrototypeFactory.prototypeFactory(T)
*prototypeFactory(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Factory<T> prototypeFactory(T p0){
	return org.apache.commons.collections4.functors.PrototypeFactory.prototypeFactory(p0);
}
/**
*{@link org.apache.commons.collections.FactoryUtils#prototypeFactory(java.lang.Object)}
*@see org.apache.commons.collections.FactoryUtils#prototypeFactory(java.lang.Object)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.prototypeFactory(java.lang.Object)
*prototypeFactory(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory prototypeFactory(java.lang.Object p0){
	return org.apache.commons.collections.FactoryUtils.prototypeFactory(p0);
}
}
