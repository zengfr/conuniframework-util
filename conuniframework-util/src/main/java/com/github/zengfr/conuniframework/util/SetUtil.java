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
public final class SetUtil{ 
/**
*{@link com.google.common.primitives.Primitives#allPrimitiveTypes()}
*@see com.google.common.primitives.Primitives#allPrimitiveTypes()
*<code>public static java.util.Set<java.lang.Class<?>> com.google.common.primitives.Primitives.allPrimitiveTypes()
*allPrimitiveTypes()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set<java.lang.Class<?>> allPrimitiveTypes(){
	return com.google.common.primitives.Primitives.allPrimitiveTypes();
}
/**
*{@link com.google.common.primitives.Primitives#allWrapperTypes()}
*@see com.google.common.primitives.Primitives#allWrapperTypes()
*<code>public static java.util.Set<java.lang.Class<?>> com.google.common.primitives.Primitives.allWrapperTypes()
*allWrapperTypes()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set<java.lang.Class<?>> allWrapperTypes(){
	return com.google.common.primitives.Primitives.allWrapperTypes();
}
/**
*{@link org.apache.commons.lang3.LocaleUtils#availableLocaleSet()}
*@see org.apache.commons.lang3.LocaleUtils#availableLocaleSet()
*<code>public static java.util.Set<java.util.Locale> org.apache.commons.lang3.LocaleUtils.availableLocaleSet()
*availableLocaleSet()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set<java.util.Locale> availableLocaleSet(){
	return org.apache.commons.lang3.LocaleUtils.availableLocaleSet();
}
/**
*{@link com.google.common.collect.Sets#cartesianProduct(java.util.Set<? extends B>...)}
*@see com.google.common.collect.Sets#cartesianProduct(java.util.Set<? extends B>...)
*<code>public static <B> java.util.Set<java.util.List<B>> com.google.common.collect.Sets.cartesianProduct(java.util.Set<? extends B>...)
*cartesianProduct(java.util.Set<? extends B>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.Set<? extends B>... p0){
	return com.google.common.collect.Sets.cartesianProduct(p0);
}
/**
*{@link com.google.common.collect.Sets#cartesianProduct(java.util.List<? extends java.util.Set<? extends B>>)}
*@see com.google.common.collect.Sets#cartesianProduct(java.util.List<? extends java.util.Set<? extends B>>)
*<code>public static <B> java.util.Set<java.util.List<B>> com.google.common.collect.Sets.cartesianProduct(java.util.List<? extends java.util.Set<? extends B>>)
*cartesianProduct(java.util.List<? extends java.util.Set<? extends B>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.Set<? extends B>> p0){
	return com.google.common.collect.Sets.cartesianProduct(p0);
}
/**
*{@link com.google.common.collect.Sets#combinations(java.util.Set<E>,int)}
*@see com.google.common.collect.Sets#combinations(java.util.Set<E>,int)
*<code>public static <E> java.util.Set<java.util.Set<E>> com.google.common.collect.Sets.combinations(java.util.Set<E>,int)
*combinations(java.util.Set<E> p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<java.util.Set<E>> combinations(java.util.Set<E> p0,int p1){
	return com.google.common.collect.Sets.combinations(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.UnmodifiableEntrySet#decorate(java.util.Set)}
*@see org.apache.commons.collections.map.UnmodifiableEntrySet#decorate(java.util.Set)
*<code>public static java.util.Set org.apache.commons.collections.map.UnmodifiableEntrySet.decorate(java.util.Set)
*decorate(java.util.Set p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set decorate(java.util.Set p0){
	return org.apache.commons.collections.map.UnmodifiableEntrySet.decorate(p0);
}
/**
*{@link org.apache.commons.collections.set.PredicatedSet#decorate(java.util.Set,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.set.PredicatedSet#decorate(java.util.Set,org.apache.commons.collections.Predicate)
*<code>public static java.util.Set org.apache.commons.collections.set.PredicatedSet.decorate(java.util.Set,org.apache.commons.collections.Predicate)
*decorate(java.util.Set p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.set.PredicatedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.TransformedSet#decorate(java.util.Set,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.set.TransformedSet#decorate(java.util.Set,org.apache.commons.collections.Transformer)
*<code>public static java.util.Set org.apache.commons.collections.set.TransformedSet.decorate(java.util.Set,org.apache.commons.collections.Transformer)
*decorate(java.util.Set p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.set.TransformedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.MapBackedSet#decorate(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.set.MapBackedSet#decorate(java.util.Map,java.lang.Object)
*<code>public static java.util.Set org.apache.commons.collections.set.MapBackedSet.decorate(java.util.Map,java.lang.Object)
*decorate(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set decorate(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.set.MapBackedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.MapBackedSet#decorate(java.util.Map)}
*@see org.apache.commons.collections.set.MapBackedSet#decorate(java.util.Map)
*<code>public static java.util.Set org.apache.commons.collections.set.MapBackedSet.decorate(java.util.Map)
*decorate(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set decorate(java.util.Map p0){
	return org.apache.commons.collections.set.MapBackedSet.decorate(p0);
}
/**
*{@link org.apache.commons.collections.set.TypedSet#decorate(java.util.Set,java.lang.Class)}
*@see org.apache.commons.collections.set.TypedSet#decorate(java.util.Set,java.lang.Class)
*<code>public static java.util.Set org.apache.commons.collections.set.TypedSet.decorate(java.util.Set,java.lang.Class)
*decorate(java.util.Set p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set decorate(java.util.Set p0,java.lang.Class p1){
	return org.apache.commons.collections.set.TypedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.ListOrderedSet#decorate(java.util.Set,java.util.List)}
*@see org.apache.commons.collections.set.ListOrderedSet#decorate(java.util.Set,java.util.List)
*<code>public static org.apache.commons.collections.set.ListOrderedSet org.apache.commons.collections.set.ListOrderedSet.decorate(java.util.Set,java.util.List)
*decorate(java.util.Set p0,java.util.List p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.set.ListOrderedSet decorate(java.util.Set p0,java.util.List p1){
	return org.apache.commons.collections.set.ListOrderedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections4.SetUtils#emptyIfNull(java.util.Set<T>)}
*@see org.apache.commons.collections4.SetUtils#emptyIfNull(java.util.Set<T>)
*<code>public static <T> java.util.Set<T> org.apache.commons.collections4.SetUtils.emptyIfNull(java.util.Set<T>)
*emptyIfNull(java.util.Set<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Set<T> emptyIfNull(java.util.Set<T> p0){
	return org.apache.commons.collections4.SetUtils.emptyIfNull(p0);
}
/**
*{@link org.apache.commons.collections4.SetUtils#emptySet()}
*@see org.apache.commons.collections4.SetUtils#emptySet()
*<code>public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.emptySet()
*emptySet()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> emptySet(){
	return org.apache.commons.collections4.SetUtils.emptySet();
}
/**
*{@link com.google.common.collect.Sets#filter(java.util.Set<E>,com.google.common.base.Predicate<? super E>)}
*@see com.google.common.collect.Sets#filter(java.util.Set<E>,com.google.common.base.Predicate<? super E>)
*<code>public static <E> java.util.Set<E> com.google.common.collect.Sets.filter(java.util.Set<E>,com.google.common.base.Predicate<? super E>)
*filter(java.util.Set<E> p0,com.google.common.base.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> filter(java.util.Set<E> p0,com.google.common.base.Predicate<? super E> p1){
	return com.google.common.collect.Sets.filter(p0,p1);
}
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)
*<code>public static java.util.Set<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)
*filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterSet(p0,p1);
}
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)
*<code>public static java.util.Set<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)
*filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterSet(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#getOverrideHierarchy(java.lang.reflect.Method,org.apache.commons.lang3.ClassUtils$Interfaces)}
*@see org.apache.commons.lang3.reflect.MethodUtils#getOverrideHierarchy(java.lang.reflect.Method,org.apache.commons.lang3.ClassUtils$Interfaces)
*<code>public static java.util.Set<java.lang.reflect.Method> org.apache.commons.lang3.reflect.MethodUtils.getOverrideHierarchy(java.lang.reflect.Method,org.apache.commons.lang3.ClassUtils$Interfaces)
*getOverrideHierarchy(java.lang.reflect.Method p0,org.apache.commons.lang3.ClassUtils$Interfaces p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set<java.lang.reflect.Method> getOverrideHierarchy(java.lang.reflect.Method p0,org.apache.commons.lang3.ClassUtils.Interfaces p1){
	return org.apache.commons.lang3.reflect.MethodUtils.getOverrideHierarchy(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.Os#getValidFamilies()}
*@see org.codehaus.plexus.util.Os#getValidFamilies()
*<code>public static java.util.Set<java.lang.String> org.codehaus.plexus.util.Os.getValidFamilies()
*getValidFamilies()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set<java.lang.String> getValidFamilies(){
	return org.codehaus.plexus.util.Os.getValidFamilies();
}
/**
*{@link org.apache.commons.collections4.MultiMapUtils#getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V>,K)}
*@see org.apache.commons.collections4.MultiMapUtils#getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*<code>public static <K,V> java.util.Set<V> org.apache.commons.collections4.MultiMapUtils.getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Set<V> getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
	return org.apache.commons.collections4.MultiMapUtils.getValuesAsSet(p0,p1);
}
/**
*{@link com.google.common.collect.Sets#newConcurrentHashSet(java.lang.Iterable<? extends E>)}
*@see com.google.common.collect.Sets#newConcurrentHashSet(java.lang.Iterable<? extends E>)
*<code>public static <E> java.util.Set<E> com.google.common.collect.Sets.newConcurrentHashSet(java.lang.Iterable<? extends E>)
*newConcurrentHashSet(java.lang.Iterable<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> newConcurrentHashSet(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Sets.newConcurrentHashSet(p0);
}
/**
*{@link com.google.common.collect.Sets#newConcurrentHashSet()}
*@see com.google.common.collect.Sets#newConcurrentHashSet()
*<code>public static <E> java.util.Set<E> com.google.common.collect.Sets.newConcurrentHashSet()
*newConcurrentHashSet()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> newConcurrentHashSet(){
	return com.google.common.collect.Sets.newConcurrentHashSet();
}
/**
*{@link org.apache.commons.collections4.SetUtils#newIdentityHashSet()}
*@see org.apache.commons.collections4.SetUtils#newIdentityHashSet()
*<code>public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.newIdentityHashSet()
*newIdentityHashSet()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> newIdentityHashSet(){
	return org.apache.commons.collections4.SetUtils.newIdentityHashSet();
}
/**
*{@link com.google.common.collect.Sets#newSetFromMap(java.util.Map<E, java.lang.Boolean>)}
*@see com.google.common.collect.Sets#newSetFromMap(java.util.Map<E, java.lang.Boolean>)
*<code>public static <E> java.util.Set<E> com.google.common.collect.Sets.newSetFromMap(java.util.Map<E, java.lang.Boolean>)
*newSetFromMap(java.util.Map<E, java.lang.Boolean> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> newSetFromMap(java.util.Map<E, java.lang.Boolean> p0){
	return com.google.common.collect.Sets.newSetFromMap(p0);
}
/**
*{@link org.apache.commons.collections4.SetUtils#orderedSet(java.util.Set<E>)}
*@see org.apache.commons.collections4.SetUtils#orderedSet(java.util.Set<E>)
*<code>public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.orderedSet(java.util.Set<E>)
*orderedSet(java.util.Set<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> orderedSet(java.util.Set<E> p0){
	return org.apache.commons.collections4.SetUtils.orderedSet(p0);
}
/**
*{@link org.apache.commons.collections.SetUtils#orderedSet(java.util.Set)}
*@see org.apache.commons.collections.SetUtils#orderedSet(java.util.Set)
*<code>public static java.util.Set org.apache.commons.collections.SetUtils.orderedSet(java.util.Set)
*orderedSet(java.util.Set p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set orderedSet(java.util.Set p0){
	return org.apache.commons.collections.SetUtils.orderedSet(p0);
}
/**
*{@link com.google.common.collect.Sets#powerSet(java.util.Set<E>)}
*@see com.google.common.collect.Sets#powerSet(java.util.Set<E>)
*<code>public static <E> java.util.Set<java.util.Set<E>> com.google.common.collect.Sets.powerSet(java.util.Set<E>)
*powerSet(java.util.Set<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<java.util.Set<E>> powerSet(java.util.Set<E> p0){
	return com.google.common.collect.Sets.powerSet(p0);
}
/**
*{@link org.apache.commons.collections4.SetUtils#predicatedSet(java.util.Set<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.SetUtils#predicatedSet(java.util.Set<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.predicatedSet(java.util.Set<E>,org.apache.commons.collections4.Predicate<? super E>)
*predicatedSet(java.util.Set<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> predicatedSet(java.util.Set<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.SetUtils.predicatedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections.SetUtils#predicatedSet(java.util.Set,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.SetUtils#predicatedSet(java.util.Set,org.apache.commons.collections.Predicate)
*<code>public static java.util.Set org.apache.commons.collections.SetUtils.predicatedSet(java.util.Set,org.apache.commons.collections.Predicate)
*predicatedSet(java.util.Set p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set predicatedSet(java.util.Set p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.SetUtils.predicatedSet(p0,p1);
}
/**
*{@link com.google.common.graph.Graphs#reachableNodes(com.google.common.graph.Graph<N>,N)}
*@see com.google.common.graph.Graphs#reachableNodes(com.google.common.graph.Graph<N>,N)
*<code>public static <N> java.util.Set<N> com.google.common.graph.Graphs.reachableNodes(com.google.common.graph.Graph<N>,N)
*reachableNodes(com.google.common.graph.Graph<N> p0,N p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <N> java.util.Set<N> reachableNodes(com.google.common.graph.Graph<N> p0,N p1){
	return com.google.common.graph.Graphs.reachableNodes(p0,p1);
}
/**
*{@link org.apache.commons.collections4.SetUtils#synchronizedSet(java.util.Set<E>)}
*@see org.apache.commons.collections4.SetUtils#synchronizedSet(java.util.Set<E>)
*<code>public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.synchronizedSet(java.util.Set<E>)
*synchronizedSet(java.util.Set<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> synchronizedSet(java.util.Set<E> p0){
	return org.apache.commons.collections4.SetUtils.synchronizedSet(p0);
}
/**
*{@link org.apache.commons.collections.SetUtils#synchronizedSet(java.util.Set)}
*@see org.apache.commons.collections.SetUtils#synchronizedSet(java.util.Set)
*<code>public static java.util.Set org.apache.commons.collections.SetUtils.synchronizedSet(java.util.Set)
*synchronizedSet(java.util.Set p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set synchronizedSet(java.util.Set p0){
	return org.apache.commons.collections.SetUtils.synchronizedSet(p0);
}
/**
*{@link org.apache.commons.collections4.SetUtils#transformedSet(java.util.Set<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)}
*@see org.apache.commons.collections4.SetUtils#transformedSet(java.util.Set<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*<code>public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.transformedSet(java.util.Set<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*transformedSet(java.util.Set<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> transformedSet(java.util.Set<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.SetUtils.transformedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections.SetUtils#transformedSet(java.util.Set,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.SetUtils#transformedSet(java.util.Set,org.apache.commons.collections.Transformer)
*<code>public static java.util.Set org.apache.commons.collections.SetUtils.transformedSet(java.util.Set,org.apache.commons.collections.Transformer)
*transformedSet(java.util.Set p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set transformedSet(java.util.Set p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.SetUtils.transformedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections.SetUtils#typedSet(java.util.Set,java.lang.Class)}
*@see org.apache.commons.collections.SetUtils#typedSet(java.util.Set,java.lang.Class)
*<code>public static java.util.Set org.apache.commons.collections.SetUtils.typedSet(java.util.Set,java.lang.Class)
*typedSet(java.util.Set p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set typedSet(java.util.Set p0,java.lang.Class p1){
	return org.apache.commons.collections.SetUtils.typedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections4.map.UnmodifiableEntrySet#unmodifiableEntrySet(java.util.Set<java.util.Map$Entry<K, V>>)}
*@see org.apache.commons.collections4.map.UnmodifiableEntrySet#unmodifiableEntrySet(java.util.Set<java.util.Map$Entry<K, V>>)
*<code>public static <K,V> java.util.Set<java.util.Map$Entry<K, V>> org.apache.commons.collections4.map.UnmodifiableEntrySet.unmodifiableEntrySet(java.util.Set<java.util.Map$Entry<K, V>>)
*unmodifiableEntrySet(java.util.Set<java.util.Map$Entry<K, V>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Set<java.util.Map.Entry<K, V>> unmodifiableEntrySet(java.util.Set<java.util.Map.Entry<K, V>> p0){
	return org.apache.commons.collections4.map.UnmodifiableEntrySet.unmodifiableEntrySet(p0);
}
/**
*{@link org.apache.commons.collections4.set.UnmodifiableSet#unmodifiableSet(java.util.Set<? extends E>)}
*@see org.apache.commons.collections4.set.UnmodifiableSet#unmodifiableSet(java.util.Set<? extends E>)
*<code>public static <E> java.util.Set<E> org.apache.commons.collections4.set.UnmodifiableSet.unmodifiableSet(java.util.Set<? extends E>)
*unmodifiableSet(java.util.Set<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> unmodifiableSet(java.util.Set<? extends E> p0){
	return org.apache.commons.collections4.set.UnmodifiableSet.unmodifiableSet(p0);
}
/**
*{@link org.apache.commons.collections4.SetUtils#unmodifiableSet(E...)}
*@see org.apache.commons.collections4.SetUtils#unmodifiableSet(E...)
*<code>public static <E> java.util.Set<E> org.apache.commons.collections4.SetUtils.unmodifiableSet(E...)
*unmodifiableSet(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Set<E> unmodifiableSet(E... p0){
	return org.apache.commons.collections4.SetUtils.unmodifiableSet(p0);
}
/**
*{@link org.apache.commons.collections.SetUtils#unmodifiableSet(java.util.Set)}
*@see org.apache.commons.collections.SetUtils#unmodifiableSet(java.util.Set)
*<code>public static java.util.Set org.apache.commons.collections.SetUtils.unmodifiableSet(java.util.Set)
*unmodifiableSet(java.util.Set p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set unmodifiableSet(java.util.Set p0){
	return org.apache.commons.collections.SetUtils.unmodifiableSet(p0);
}
}
