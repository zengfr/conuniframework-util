package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FactoryUtil{ 
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.asTransformer(org.apache.commons.collections.Factory)
*/ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Factory p0){
	return org.apache.commons.collections.TransformerUtils.asTransformer(p0);
}
/**
*public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.FactoryUtils.constantFactory(T)
*/ 
public static <T> org.apache.commons.collections4.Factory<T> constantFactory(T p0){
	return org.apache.commons.collections4.FactoryUtils.constantFactory(p0);
}
/**
*public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.constantFactory(java.lang.Object)
*/ 
public static org.apache.commons.collections.Factory constantFactory(java.lang.Object p0){
	return org.apache.commons.collections.FactoryUtils.constantFactory(p0);
}
/**
*public static java.util.Map org.apache.commons.collections.map.DefaultedMap.decorate(java.util.Map,org.apache.commons.collections.Factory)
*/ 
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.map.DefaultedMap.decorate(p0,p1);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.map.LazySortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Factory)
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.map.LazySortedMap.decorate(p0,p1);
}
/**
*public static java.util.List org.apache.commons.collections.list.LazyList.decorate(java.util.List,org.apache.commons.collections.Factory)
*/ 
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.list.LazyList.decorate(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.FactoryUtils.exceptionFactory()
*/ 
public static <T> org.apache.commons.collections4.Factory<T> exceptionFactory(){
	return org.apache.commons.collections4.FactoryUtils.exceptionFactory();
}
/**
*public static org.apache.commons.collections.Factory org.apache.commons.collections.functors.PrototypeFactory.getInstance(java.lang.Object)
*/ 
public static org.apache.commons.collections.Factory getInstance(java.lang.Object p0){
	return org.apache.commons.collections.functors.PrototypeFactory.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Factory org.apache.commons.collections.functors.ExceptionFactory.getInstance()
*/ 
public static org.apache.commons.collections.Factory getInstance(){
	return org.apache.commons.collections.functors.ExceptionFactory.getInstance();
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.FactoryTransformer.getInstance(org.apache.commons.collections.Factory)
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Factory p0){
	return org.apache.commons.collections.functors.FactoryTransformer.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Factory org.apache.commons.collections.functors.InstantiateFactory.getInstance(java.lang.Class,java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Factory getInstance(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.functors.InstantiateFactory.getInstance(p0,p1,p2);
}
/**
*public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.FactoryUtils.instantiateFactory(java.lang.Class<T>)
*/ 
public static <T> org.apache.commons.collections4.Factory<T> instantiateFactory(java.lang.Class<T> p0){
	return org.apache.commons.collections4.FactoryUtils.instantiateFactory(p0);
}
/**
*public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.FactoryUtils.instantiateFactory(java.lang.Class<T>,java.lang.Class<?>[],java.lang.Object[])
*/ 
public static <T> org.apache.commons.collections4.Factory<T> instantiateFactory(java.lang.Class<T> p0,java.lang.Class<?>[] p1,java.lang.Object... p2){
	return org.apache.commons.collections4.FactoryUtils.instantiateFactory(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.instantiateFactory(java.lang.Class)
*/ 
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0){
	return org.apache.commons.collections.FactoryUtils.instantiateFactory(p0);
}
/**
*public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.instantiateFactory(java.lang.Class,java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.FactoryUtils.instantiateFactory(p0,p1,p2);
}
/**
*public static java.util.List org.apache.commons.collections.ListUtils.lazyList(java.util.List,org.apache.commons.collections.Factory)
*/ 
public static java.util.List lazyList(java.util.List p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.ListUtils.lazyList(p0,p1);
}
/**
*public static java.util.Map org.apache.commons.collections.MapUtils.lazyMap(java.util.Map,org.apache.commons.collections.Factory)
*/ 
public static java.util.Map lazyMap(java.util.Map p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.MapUtils.lazyMap(p0,p1);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.MapUtils.lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Factory)
*/ 
public static java.util.SortedMap lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.MapUtils.lazySortedMap(p0,p1);
}
/**
*public static java.util.Map org.apache.commons.collections.MapUtils.multiValueMap(java.util.Map,org.apache.commons.collections.Factory)
*/ 
public static java.util.Map multiValueMap(java.util.Map p0,org.apache.commons.collections.Factory p1){
	return org.apache.commons.collections.MapUtils.multiValueMap(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.FactoryUtils.nullFactory()
*/ 
public static <T> org.apache.commons.collections4.Factory<T> nullFactory(){
	return org.apache.commons.collections4.FactoryUtils.nullFactory();
}
/**
*public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.FactoryUtils.prototypeFactory(T)
*/ 
public static <T> org.apache.commons.collections4.Factory<T> prototypeFactory(T p0){
	return org.apache.commons.collections4.FactoryUtils.prototypeFactory(p0);
}
/**
*public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.prototypeFactory(java.lang.Object)
*/ 
public static org.apache.commons.collections.Factory prototypeFactory(java.lang.Object p0){
	return org.apache.commons.collections.FactoryUtils.prototypeFactory(p0);
}
}
