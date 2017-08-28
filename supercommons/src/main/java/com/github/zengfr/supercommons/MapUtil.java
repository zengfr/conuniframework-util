package com.github.zengfr.supercommons;
import com.google.common.collect.MapConstraints;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.map.ListOrderedMap;
import org.apache.commons.collections.map.TransformedMap;
import org.apache.commons.collections.map.PredicatedMap;
import org.apache.commons.collections.map.UnmodifiableMap;
import org.apache.commons.collections.map.DefaultedMap;
import org.apache.commons.collections.map.FixedSizeMap;
import org.apache.commons.collections.map.LazyMap;
import org.apache.commons.collections.map.TypedMap;
import org.apache.commons.collections.map.MultiValueMap;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.set.MapBackedSet;
import org.apache.commons.collections.functors.SwitchClosure;
import org.apache.commons.collections.functors.MapTransformer;
import org.apache.commons.collections.functors.SwitchTransformer;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.map.UnmodifiableMap;
import org.apache.commons.collections4.map.DefaultedMap;
import org.apache.commons.collections4.SplitMapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.text.translate.EntityArrays;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.enum.EnumUtils;
import org.apache.commons.lang.enums.EnumUtils;
import org.apache.commons.lang.text.StrLookup;
import org.apache.commons.lang.text.StrSubstitutor;
import org.apache.commons.lang.Validate;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MapUtil{ 
public static <K,V> java.util.Map<K, V> constrainedMap(java.util.Map<K, V> p0,com.google.common.collect.MapConstraint<? super K, ? super V> p1){
return MapConstraints.constrainedMap(p0,p1);
}
public static <K,V> java.util.Map<K, V> asMap(java.util.Set<K> p0,com.google.common.base.Function<? super K, V> p1){
return Maps.asMap(p0,p1);
}
public static <K,V> java.util.Map<K, V> filterEntries(java.util.Map<K, V> p0,com.google.common.base.Predicate<? super java.util.Map.java.util.Map.Entry<K, V>> p1){
return Maps.filterEntries(p0,p1);
}
public static <K,V> java.util.Map<K, V> filterValues(java.util.Map<K, V> p0,com.google.common.base.Predicate<? super V> p1){
return Maps.filterValues(p0,p1);
}
public static <K,V1,V2> java.util.Map<K, V2> transformEntries(java.util.Map<K, V1> p0,EntryTransformer<? super K, ? super V1, V2> p1){
return Maps.transformEntries(p0,p1);
}
public static <K,V1,V2> java.util.Map<K, V2> transformValues(java.util.Map<K, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
return Maps.transformValues(p0,p1);
}
public static <K,V> java.util.Map<K, V> filterKeys(java.util.Map<K, V> p0,com.google.common.base.Predicate<? super K> p1){
return Maps.filterKeys(p0,p1);
}
public static <K,V> java.util.Map<K, java.util.List<V>> asMap(com.google.common.collect.ListMultimap<K, V> p0){
return Multimaps.asMap(p0);
}
public static <K,V> java.util.Map<K, java.util.Collection<V>> asMap(com.google.common.collect.Multimap<K, V> p0){
return Multimaps.asMap(p0);
}
public static <K,V> java.util.Map<K, java.util.Set<V>> asMap(com.google.common.collect.SetMultimap<K, V> p0){
return Multimaps.asMap(p0);
}
public static <K,V> java.util.Map<K, java.util.SortedSet<V>> asMap(com.google.common.collect.SortedSetMultimap<K, V> p0){
return Multimaps.asMap(p0);
}
public static org.apache.commons.collections.Transformer mapTransformer(java.util.Map p0){
return TransformerUtils.mapTransformer(p0);
}
public static org.apache.commons.collections.Transformer switchTransformer(java.util.Map p0){
return TransformerUtils.switchTransformer(p0);
}
public static org.apache.commons.collections.Transformer switchMapTransformer(java.util.Map p0){
return TransformerUtils.switchMapTransformer(p0);
}
public static java.util.Map getCardinalityMap(java.util.Collection p0){
return CollectionUtils.getCardinalityMap(p0);
}
public static java.lang.Number getNumber(java.util.Map p0,java.lang.Object p1){
return MapUtils.getNumber(p0,p1);
}
public static java.lang.Number getNumber(java.util.Map p0,java.lang.Object p1,java.lang.Number p2){
return MapUtils.getNumber(p0,p1,p2);
}
public static java.lang.Object getObject(java.util.Map p0,java.lang.Object p1){
return MapUtils.getObject(p0,p1);
}
public static java.lang.Object getObject(java.util.Map p0,java.lang.Object p1,java.lang.Object p2){
return MapUtils.getObject(p0,p1,p2);
}
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1,java.lang.Boolean p2){
return MapUtils.getBoolean(p0,p1,p2);
}
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1){
return MapUtils.getBoolean(p0,p1);
}
public static java.lang.Byte getByte(java.util.Map p0,java.lang.Object p1){
return MapUtils.getByte(p0,p1);
}
public static java.lang.Byte getByte(java.util.Map p0,java.lang.Object p1,java.lang.Byte p2){
return MapUtils.getByte(p0,p1,p2);
}
public static java.lang.Short getShort(java.util.Map p0,java.lang.Object p1,java.lang.Short p2){
return MapUtils.getShort(p0,p1,p2);
}
public static java.lang.Short getShort(java.util.Map p0,java.lang.Object p1){
return MapUtils.getShort(p0,p1);
}
public static java.lang.Long getLong(java.util.Map p0,java.lang.Object p1,java.lang.Long p2){
return MapUtils.getLong(p0,p1,p2);
}
public static java.lang.Long getLong(java.util.Map p0,java.lang.Object p1){
return MapUtils.getLong(p0,p1);
}
public static java.lang.Float getFloat(java.util.Map p0,java.lang.Object p1,java.lang.Float p2){
return MapUtils.getFloat(p0,p1,p2);
}
public static java.lang.Float getFloat(java.util.Map p0,java.lang.Object p1){
return MapUtils.getFloat(p0,p1);
}
public static java.lang.Double getDouble(java.util.Map p0,java.lang.Object p1){
return MapUtils.getDouble(p0,p1);
}
public static java.lang.Double getDouble(java.util.Map p0,java.lang.Object p1,java.lang.Double p2){
return MapUtils.getDouble(p0,p1,p2);
}
public static boolean isEmpty(java.util.Map p0){
return MapUtils.isEmpty(p0);
}
public static java.util.Map putAll(java.util.Map p0,java.lang.Object[] p1){
return MapUtils.putAll(p0,p1);
}
public static java.util.Map toMap(java.util.ResourceBundle p0){
return MapUtils.toMap(p0);
}
public static java.lang.Integer getInteger(java.util.Map p0,java.lang.Object p1,java.lang.Integer p2){
return MapUtils.getInteger(p0,p1,p2);
}
public static java.lang.Integer getInteger(java.util.Map p0,java.lang.Object p1){
return MapUtils.getInteger(p0,p1);
}
public static java.util.Map synchronizedMap(java.util.Map p0){
return MapUtils.synchronizedMap(p0);
}
public static java.util.Map synchronizedSortedMap(java.util.SortedMap p0){
return MapUtils.synchronizedSortedMap(p0);
}
public static java.util.Map unmodifiableMap(java.util.Map p0){
return MapUtils.unmodifiableMap(p0);
}
public static java.util.Map unmodifiableSortedMap(java.util.SortedMap p0){
return MapUtils.unmodifiableSortedMap(p0);
}
public static java.util.Map getMap(java.util.Map p0,java.lang.Object p1,java.util.Map p2){
return MapUtils.getMap(p0,p1,p2);
}
public static java.util.Map getMap(java.util.Map p0,java.lang.Object p1){
return MapUtils.getMap(p0,p1);
}
public static java.lang.String getString(java.util.Map p0,java.lang.Object p1){
return MapUtils.getString(p0,p1);
}
public static java.lang.String getString(java.util.Map p0,java.lang.Object p1,java.lang.String p2){
return MapUtils.getString(p0,p1,p2);
}
public static boolean isNotEmpty(java.util.Map p0){
return MapUtils.isNotEmpty(p0);
}
public static java.util.Map invertMap(java.util.Map p0){
return MapUtils.invertMap(p0);
}
public static short getShortValue(java.util.Map p0,java.lang.Object p1,short p2){
return MapUtils.getShortValue(p0,p1,p2);
}
public static short getShortValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getShortValue(p0,p1);
}
public static void safeAddToMap(java.util.Map p0,java.lang.Object p1,java.lang.Object p2) throws java.lang.NullPointerException{
 MapUtils.safeAddToMap(p0,p1,p2);
}
public static java.util.Map transformedMap(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return MapUtils.transformedMap(p0,p1,p2);
}
public static java.util.Map fixedSizeMap(java.util.Map p0){
return MapUtils.fixedSizeMap(p0);
}
public static java.util.Map predicatedMap(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
return MapUtils.predicatedMap(p0,p1,p2);
}
public static java.util.Map lazyMap(java.util.Map p0,org.apache.commons.collections.Transformer p1){
return MapUtils.lazyMap(p0,p1);
}
public static java.util.Map lazyMap(java.util.Map p0,org.apache.commons.collections.Factory p1){
return MapUtils.lazyMap(p0,p1);
}
public static java.util.Map multiValueMap(java.util.Map p0,java.lang.Class p1){
return MapUtils.multiValueMap(p0,p1);
}
public static java.util.Map multiValueMap(java.util.Map p0,org.apache.commons.collections.Factory p1){
return MapUtils.multiValueMap(p0,p1);
}
public static java.util.Map multiValueMap(java.util.Map p0){
return MapUtils.multiValueMap(p0);
}
public static float getFloatValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getFloatValue(p0,p1);
}
public static float getFloatValue(java.util.Map p0,java.lang.Object p1,float p2){
return MapUtils.getFloatValue(p0,p1,p2);
}
public static byte getByteValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getByteValue(p0,p1);
}
public static byte getByteValue(java.util.Map p0,java.lang.Object p1,byte p2){
return MapUtils.getByteValue(p0,p1,p2);
}
public static long getLongValue(java.util.Map p0,java.lang.Object p1,long p2){
return MapUtils.getLongValue(p0,p1,p2);
}
public static long getLongValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getLongValue(p0,p1);
}
public static void debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
 MapUtils.debugPrint(p0,p1,p2);
}
public static java.util.Map typedMap(java.util.Map p0,java.lang.Class p1,java.lang.Class p2){
return MapUtils.typedMap(p0,p1,p2);
}
public static int getIntValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getIntValue(p0,p1);
}
public static int getIntValue(java.util.Map p0,java.lang.Object p1,int p2){
return MapUtils.getIntValue(p0,p1,p2);
}
public static double getDoubleValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getDoubleValue(p0,p1);
}
public static double getDoubleValue(java.util.Map p0,java.lang.Object p1,double p2){
return MapUtils.getDoubleValue(p0,p1,p2);
}
public static void verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
 MapUtils.verbosePrint(p0,p1,p2);
}
public static java.util.Map orderedMap(java.util.Map p0){
return MapUtils.orderedMap(p0);
}
public static java.util.Properties toProperties(java.util.Map p0){
return MapUtils.toProperties(p0);
}
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1,boolean p2){
return MapUtils.getBooleanValue(p0,p1,p2);
}
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getBooleanValue(p0,p1);
}
public static org.apache.commons.collections.OrderedMap decorate(java.util.Map p0){
return ListOrderedMap.decorate(p0);
}
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return TransformedMap.decorate(p0,p1,p2);
}
public static java.util.Map decorateTransform(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return TransformedMap.decorateTransform(p0,p1,p2);
}
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
return PredicatedMap.decorate(p0,p1,p2);
}
public static java.util.Map decorate(java.util.Map p0,java.lang.Object p1){
return DefaultedMap.decorate(p0,p1);
}
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1){
return DefaultedMap.decorate(p0,p1);
}
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Factory p1){
return DefaultedMap.decorate(p0,p1);
}
public static java.util.Map decorate(java.util.Map p0,java.lang.Class p1,java.lang.Class p2){
return TypedMap.decorate(p0,p1,p2);
}
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0,java.lang.Class p1){
return MultiValueMap.decorate(p0,p1);
}
public static org.apache.commons.collections.Closure switchClosure(java.util.Map p0){
return ClosureUtils.switchClosure(p0);
}
public static org.apache.commons.collections.Closure switchMapClosure(java.util.Map p0){
return ClosureUtils.switchMapClosure(p0);
}
public static org.apache.commons.collections.Closure getInstance(java.util.Map p0){
return SwitchClosure.getInstance(p0);
}
public static <O> java.util.Map<O, java.lang.Integer> getCardinalityMap(java.lang.Iterable<? extends O> p0){
return CollectionUtils.getCardinalityMap(p0);
}
public static <K,V> java.util.Map<K, V> putAll(java.util.Map<K, V> p0,java.lang.Object[] p1){
return MapUtils.putAll(p0,p1);
}
public static <K,V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> p0){
return MapUtils.synchronizedMap(p0);
}
public static <K,V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> p0){
return MapUtils.unmodifiableMap(p0);
}
public static <K> java.util.Map<?, ?> getMap(java.util.Map<? super K, ?> p0,K p1,java.util.Map<?, ?> p2){
return MapUtils.getMap(p0,p1,p2);
}
public static <K> java.util.Map<?, ?> getMap(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getMap(p0,p1);
}
public static <K,V> java.util.Map<V, K> invertMap(java.util.Map<K, V> p0){
return MapUtils.invertMap(p0);
}
public static <K,V> java.util.Map<K, V> emptyIfNull(java.util.Map<K, V> p0){
return MapUtils.emptyIfNull(p0);
}
public static <K,V> java.util.Map<K, V> defaultedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
return DefaultedMap.defaultedMap(p0,p1);
}
public static <K,V> java.util.Map<K, V> writableMap(org.apache.commons.collections4.Put<K, V> p0){
return SplitMapUtils.writableMap(p0);
}
public static java.util.Map<java.lang.Object, java.lang.Object> toMap(java.lang.Object[] p0){
return ArrayUtils.toMap(p0);
}
public static <E extends java.lang.Enum<E> > java.util.Map<java.lang.String, E> getEnumMap(java.lang.Class<E> p0){
return EnumUtils.getEnumMap(p0);
}
public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.ParameterizedType p0){
return TypeUtils.getTypeArguments(p0);
}
public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.Type p0,java.lang.Class<?> p1){
return TypeUtils.getTypeArguments(p0,p1);
}
public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> determineTypeArguments(java.lang.Class<?> p0,java.lang.reflect.ParameterizedType p1){
return TypeUtils.determineTypeArguments(p0,p1);
}
public static <T extends java.util.Map<?, ?> > T notEmpty(T p0){
return Validate.notEmpty(p0);
}
public static <T extends java.util.Map<?, ?> > T notEmpty(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notEmpty(p0,p1,p2);
}
public static java.util.Map<java.lang.String, java.lang.String> describe(java.lang.Object p0) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return BeanUtils.describe(p0);
}
public static <K,V> java.util.Map<K, V> createCache(){
return BeanUtils.createCache();
}
public static java.util.Map<java.lang.CharSequence, java.lang.CharSequence> invert(java.util.Map<java.lang.CharSequence, java.lang.CharSequence> p0){
return EntityArrays.invert(p0);
}
public static java.util.Map getEnumMap(java.lang.Class p0){
return EnumUtils.getEnumMap(p0);
}
public static org.apache.commons.lang.text.StrLookup mapLookup(java.util.Map p0){
return StrLookup.mapLookup(p0);
}
public static java.lang.String replace(java.lang.Object p0,java.util.Map p1){
return StrSubstitutor.replace(p0,p1);
}
public static java.lang.String replace(java.lang.Object p0,java.util.Map p1,java.lang.String p2,java.lang.String p3){
return StrSubstitutor.replace(p0,p1,p2,p3);
}
public static void notEmpty(java.util.Map p0){
 Validate.notEmpty(p0);
}
public static void notEmpty(java.util.Map p0,java.lang.String p1){
 Validate.notEmpty(p0,p1);
}
}
