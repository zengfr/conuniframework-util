package com.zengfr.supercommons;
import com.google.common.collect.Sets;
import com.google.common.primitives.Primitives;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.collections.map.UnmodifiableEntrySet;
import org.apache.commons.collections.SetUtils;
import org.apache.commons.collections.set.PredicatedSet;
import org.apache.commons.collections.set.TransformedSet;
import org.apache.commons.collections.set.MapBackedSet;
import org.apache.commons.collections.set.SynchronizedSet;
import org.apache.commons.collections.set.TypedSet;
import org.apache.commons.collections.set.UnmodifiableSet;
import org.apache.commons.collections.set.ListOrderedSet;
import org.apache.commons.collections4.map.UnmodifiableEntrySet;
import org.apache.commons.collections4.SetUtils;
import org.apache.commons.collections4.MultiMapUtils;
import org.apache.commons.collections4.set.TransformedSet;
import org.apache.commons.collections4.set.UnmodifiableSet;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.lang.LocaleUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SetUtil{ 
public static <E> java.util.Set<E> newSetFromMap(java.util.Map<E, java.lang.Boolean> p0){
return Sets.newSetFromMap(p0);
}
public static <E> java.util.Set<E> filter(java.util.Set<E> p0,com.google.common.base.Predicate<? super E> p1){
return Sets.filter(p0,p1);
}
public static <E> java.util.Set<E> newConcurrentHashSet(){
return Sets.newConcurrentHashSet();
}
public static <E> java.util.Set<E> newConcurrentHashSet(java.lang.Iterable<? extends E> p0){
return Sets.newConcurrentHashSet(p0);
}
public static <E> java.util.Set<E> newIdentityHashSet(){
return Sets.newIdentityHashSet();
}
public static <E> java.util.Set<java.util.Set<E>> powerSet(java.util.Set<E> p0){
return Sets.powerSet(p0);
}
public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.Set<? extends B>... p0){
return Sets.cartesianProduct(p0);
}
public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.Set<? extends B>> p0){
return Sets.cartesianProduct(p0);
}
public static java.util.Set<java.lang.Class<?>> allWrapperTypes(){
return Primitives.allWrapperTypes();
}
public static java.util.Set<java.lang.Class<?>> allPrimitiveTypes(){
return Primitives.allPrimitiveTypes();
}
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
return FileFilterUtils.filterSet(p0,p1);
}
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
return FileFilterUtils.filterSet(p0,p1);
}
public static java.util.Set decorate(java.util.Set p0){
return UnmodifiableEntrySet.decorate(p0);
}
public static java.util.Set synchronizedSet(java.util.Set p0){
return SetUtils.synchronizedSet(p0);
}
public static java.util.Set unmodifiableSet(java.util.Set p0){
return SetUtils.unmodifiableSet(p0);
}
public static java.util.Set transformedSet(java.util.Set p0,org.apache.commons.collections.Transformer p1){
return SetUtils.transformedSet(p0,p1);
}
public static java.util.Set orderedSet(java.util.Set p0){
return SetUtils.orderedSet(p0);
}
public static java.util.Set typedSet(java.util.Set p0,java.lang.Class p1){
return SetUtils.typedSet(p0,p1);
}
public static java.util.Set predicatedSet(java.util.Set p0,org.apache.commons.collections.Predicate p1){
return SetUtils.predicatedSet(p0,p1);
}
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Predicate p1){
return PredicatedSet.decorate(p0,p1);
}
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Transformer p1){
return TransformedSet.decorate(p0,p1);
}
public static java.util.Set decorate(java.util.Map p0,java.lang.Object p1){
return MapBackedSet.decorate(p0,p1);
}
public static java.util.Set decorate(java.util.Map p0){
return MapBackedSet.decorate(p0);
}
public static java.util.Set decorate(java.util.Set p0,java.lang.Class p1){
return TypedSet.decorate(p0,p1);
}
public static org.apache.commons.collections.set.ListOrderedSet decorate(java.util.Set p0,java.util.List p1){
return ListOrderedSet.decorate(p0,p1);
}
public static <K,V> java.util.Set<java.util.Map.java.util.Map.Entry<K, V>> unmodifiableEntrySet(java.util.Set<java.util.Map.java.util.Map.Entry<K, V>> p0){
return UnmodifiableEntrySet.unmodifiableEntrySet(p0);
}
public static <E> java.util.Set<E> synchronizedSet(java.util.Set<E> p0){
return SetUtils.synchronizedSet(p0);
}
public static <E> java.util.Set<E> emptySet(){
return SetUtils.emptySet();
}
public static <E> java.util.Set<E> unmodifiableSet(java.util.Set<? extends E> p0){
return SetUtils.unmodifiableSet(p0);
}
public static <E> java.util.Set<E> transformedSet(java.util.Set<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return SetUtils.transformedSet(p0,p1);
}
public static <E> java.util.Set<E> orderedSet(java.util.Set<E> p0){
return SetUtils.orderedSet(p0);
}
public static <E> java.util.Set<E> predicatedSet(java.util.Set<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return SetUtils.predicatedSet(p0,p1);
}
public static <T> java.util.Set<T> emptyIfNull(java.util.Set<T> p0){
return SetUtils.emptyIfNull(p0);
}
public static <K,V> java.util.Set<V> getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
return MultiMapUtils.getValuesAsSet(p0,p1);
}
public static java.util.Set<java.util.Locale> availableLocaleSet(){
return LocaleUtils.availableLocaleSet();
}
public static java.util.Set<java.lang.reflect.Method> getOverrideHierarchy(java.lang.reflect.Method p0,org.apache.commons.lang3.ClassUtils.Interfaces p1){
return MethodUtils.getOverrideHierarchy(p0,p1);
}
}
