package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class KUtil{ 
/**
*public static <K> int it.unimi.dsi.fastutil.objects.ObjectArrays.binarySearch(K[],int,int,K,java.util.Comparator<K>)
*/ 
public static <K> int binarySearch(K[] p0,int p1,int p2,K p3,java.util.Comparator<K> p4){
	return it.unimi.dsi.fastutil.objects.ObjectArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*public static <K> int it.unimi.dsi.fastutil.objects.ObjectArrays.binarySearch(K[],K,java.util.Comparator<K>)
*/ 
public static <K> int binarySearch(K[] p0,K p1,java.util.Comparator<K> p2){
	return it.unimi.dsi.fastutil.objects.ObjectArrays.binarySearch(p0,p1,p2);
}
/**
*public static <K> int it.unimi.dsi.fastutil.objects.ObjectArrays.binarySearch(K[],K)
*/ 
public static <K> int binarySearch(K[] p0,K p1){
	return it.unimi.dsi.fastutil.objects.ObjectArrays.binarySearch(p0,p1);
}
/**
*public static <K> int it.unimi.dsi.fastutil.objects.ObjectArrays.binarySearch(K[],int,int,K)
*/ 
public static <K> int binarySearch(K[] p0,int p1,int p2,K p3){
	return it.unimi.dsi.fastutil.objects.ObjectArrays.binarySearch(p0,p1,p2,p3);
}
/**
*public static <K> long it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(K[][],long,long,K,java.util.Comparator<K>)
*/ 
public static <K> long binarySearch(K[][] p0,long p1,long p2,K p3,java.util.Comparator<K> p4){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*public static <K> long it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(K[][],long,long,K)
*/ 
public static <K> long binarySearch(K[][] p0,long p1,long p2,K p3){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(p0,p1,p2,p3);
}
/**
*public static <K> long it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(K[][],K,java.util.Comparator<K>)
*/ 
public static <K> long binarySearch(K[][] p0,K p1,java.util.Comparator<K> p2){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.binarySearch(p0,p1,p2);
}
/**
*public static <K,V> com.google.common.cache.RemovalNotification<K, V> com.google.common.cache.RemovalNotification.create(K,V,com.google.common.cache.RemovalCause)
*/ 
public static <K,V> com.google.common.cache.RemovalNotification<K, V> create(K p0,V p1,com.google.common.cache.RemovalCause p2){
	return com.google.common.cache.RemovalNotification.create(p0,p1,p2);
}
/**
*public static <K,V> org.apache.commons.math3.util.Pair<K, V> org.apache.commons.math3.util.Pair.create(K,V)
*/ 
public static <K,V> org.apache.commons.math3.util.Pair<K, V> create(K p0,V p1){
	return org.apache.commons.math3.util.Pair.create(p0,p1);
}
/**
*public static <K,V> V org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsent(java.util.concurrent.ConcurrentMap<K, V>,K,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V>) throws org.apache.commons.lang3.concurrent.ConcurrentException
*/ 
public static <K,V> V createIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> p2) throws org.apache.commons.lang3.concurrent.ConcurrentException{
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsent(p0,p1,p2);
}
/**
*public static <K,V> V org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap<K, V>,K,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V>)
*/ 
public static <K,V> V createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> p2){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsentUnchecked(p0,p1,p2);
}
/**
*public static <K> void it.unimi.dsi.fastutil.objects.ObjectArrays.fill(K[],int,int,K)
*/ 
public static <K> void fill(K[] p0,int p1,int p2,K p3){
	 it.unimi.dsi.fastutil.objects.ObjectArrays.fill(p0,p1,p2,p3);
}
/**
*public static <K> void it.unimi.dsi.fastutil.objects.ObjectArrays.fill(K[],K)
*/ 
public static <K> void fill(K[] p0,K p1){
	 it.unimi.dsi.fastutil.objects.ObjectArrays.fill(p0,p1);
}
/**
*public static <K> void it.unimi.dsi.fastutil.objects.ObjectBigArrays.fill(K[][],long,long,K)
*/ 
public static <K> void fill(K[][] p0,long p1,long p2,K p3){
	 it.unimi.dsi.fastutil.objects.ObjectBigArrays.fill(p0,p1,p2,p3);
}
/**
*public static <K> void it.unimi.dsi.fastutil.objects.ObjectBigArrays.fill(K[][],K)
*/ 
public static <K> void fill(K[][] p0,K p1){
	 it.unimi.dsi.fastutil.objects.ObjectBigArrays.fill(p0,p1);
}
/**
*public static <K> java.lang.Boolean org.apache.commons.collections4.MapUtils.getBoolean(java.util.Map<? super K, ?>,K)
*/ 
public static <K> java.lang.Boolean getBoolean(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getBoolean(p0,p1);
}
/**
*public static <K> java.lang.Boolean org.apache.commons.collections4.MapUtils.getBoolean(java.util.Map<? super K, ?>,K,java.lang.Boolean)
*/ 
public static <K> java.lang.Boolean getBoolean(java.util.Map<? super K, ?> p0,K p1,java.lang.Boolean p2){
	return org.apache.commons.collections4.MapUtils.getBoolean(p0,p1,p2);
}
/**
*public static <K> boolean org.apache.commons.collections4.MapUtils.getBooleanValue(java.util.Map<? super K, ?>,K)
*/ 
public static <K> boolean getBooleanValue(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getBooleanValue(p0,p1);
}
/**
*public static <K> boolean org.apache.commons.collections4.MapUtils.getBooleanValue(java.util.Map<? super K, ?>,K,boolean)
*/ 
public static <K> boolean getBooleanValue(java.util.Map<? super K, ?> p0,K p1,boolean p2){
	return org.apache.commons.collections4.MapUtils.getBooleanValue(p0,p1,p2);
}
/**
*public static <K> java.lang.Byte org.apache.commons.collections4.MapUtils.getByte(java.util.Map<? super K, ?>,K,java.lang.Byte)
*/ 
public static <K> java.lang.Byte getByte(java.util.Map<? super K, ?> p0,K p1,java.lang.Byte p2){
	return org.apache.commons.collections4.MapUtils.getByte(p0,p1,p2);
}
/**
*public static <K> java.lang.Byte org.apache.commons.collections4.MapUtils.getByte(java.util.Map<? super K, ?>,K)
*/ 
public static <K> java.lang.Byte getByte(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getByte(p0,p1);
}
/**
*public static <K> byte org.apache.commons.collections4.MapUtils.getByteValue(java.util.Map<? super K, ?>,K,byte)
*/ 
public static <K> byte getByteValue(java.util.Map<? super K, ?> p0,K p1,byte p2){
	return org.apache.commons.collections4.MapUtils.getByteValue(p0,p1,p2);
}
/**
*public static <K> byte org.apache.commons.collections4.MapUtils.getByteValue(java.util.Map<? super K, ?>,K)
*/ 
public static <K> byte getByteValue(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getByteValue(p0,p1);
}
/**
*public static <K,V> java.util.Collection<V> org.apache.commons.collections4.MultiMapUtils.getCollection(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*/ 
public static <K,V> java.util.Collection<V> getCollection(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
	return org.apache.commons.collections4.MultiMapUtils.getCollection(p0,p1);
}
/**
*public static <K> java.lang.Double org.apache.commons.collections4.MapUtils.getDouble(java.util.Map<? super K, ?>,K)
*/ 
public static <K> java.lang.Double getDouble(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getDouble(p0,p1);
}
/**
*public static <K> java.lang.Double org.apache.commons.collections4.MapUtils.getDouble(java.util.Map<? super K, ?>,K,java.lang.Double)
*/ 
public static <K> java.lang.Double getDouble(java.util.Map<? super K, ?> p0,K p1,java.lang.Double p2){
	return org.apache.commons.collections4.MapUtils.getDouble(p0,p1,p2);
}
/**
*public static <K> double org.apache.commons.collections4.MapUtils.getDoubleValue(java.util.Map<? super K, ?>,K,double)
*/ 
public static <K> double getDoubleValue(java.util.Map<? super K, ?> p0,K p1,double p2){
	return org.apache.commons.collections4.MapUtils.getDoubleValue(p0,p1,p2);
}
/**
*public static <K> double org.apache.commons.collections4.MapUtils.getDoubleValue(java.util.Map<? super K, ?>,K)
*/ 
public static <K> double getDoubleValue(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getDoubleValue(p0,p1);
}
/**
*public static <K> java.lang.Float org.apache.commons.collections4.MapUtils.getFloat(java.util.Map<? super K, ?>,K,java.lang.Float)
*/ 
public static <K> java.lang.Float getFloat(java.util.Map<? super K, ?> p0,K p1,java.lang.Float p2){
	return org.apache.commons.collections4.MapUtils.getFloat(p0,p1,p2);
}
/**
*public static <K> java.lang.Float org.apache.commons.collections4.MapUtils.getFloat(java.util.Map<? super K, ?>,K)
*/ 
public static <K> java.lang.Float getFloat(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getFloat(p0,p1);
}
/**
*public static <K> float org.apache.commons.collections4.MapUtils.getFloatValue(java.util.Map<? super K, ?>,K)
*/ 
public static <K> float getFloatValue(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getFloatValue(p0,p1);
}
/**
*public static <K> float org.apache.commons.collections4.MapUtils.getFloatValue(java.util.Map<? super K, ?>,K,float)
*/ 
public static <K> float getFloatValue(java.util.Map<? super K, ?> p0,K p1,float p2){
	return org.apache.commons.collections4.MapUtils.getFloatValue(p0,p1,p2);
}
/**
*public static <K> int org.apache.commons.collections4.MapUtils.getIntValue(java.util.Map<? super K, ?>,K,int)
*/ 
public static <K> int getIntValue(java.util.Map<? super K, ?> p0,K p1,int p2){
	return org.apache.commons.collections4.MapUtils.getIntValue(p0,p1,p2);
}
/**
*public static <K> int org.apache.commons.collections4.MapUtils.getIntValue(java.util.Map<? super K, ?>,K)
*/ 
public static <K> int getIntValue(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getIntValue(p0,p1);
}
/**
*public static <K> java.lang.Integer org.apache.commons.collections4.MapUtils.getInteger(java.util.Map<? super K, ?>,K,java.lang.Integer)
*/ 
public static <K> java.lang.Integer getInteger(java.util.Map<? super K, ?> p0,K p1,java.lang.Integer p2){
	return org.apache.commons.collections4.MapUtils.getInteger(p0,p1,p2);
}
/**
*public static <K> java.lang.Integer org.apache.commons.collections4.MapUtils.getInteger(java.util.Map<? super K, ?>,K)
*/ 
public static <K> java.lang.Integer getInteger(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getInteger(p0,p1);
}
/**
*public static <K> java.lang.Long org.apache.commons.collections4.MapUtils.getLong(java.util.Map<? super K, ?>,K,java.lang.Long)
*/ 
public static <K> java.lang.Long getLong(java.util.Map<? super K, ?> p0,K p1,java.lang.Long p2){
	return org.apache.commons.collections4.MapUtils.getLong(p0,p1,p2);
}
/**
*public static <K> java.lang.Long org.apache.commons.collections4.MapUtils.getLong(java.util.Map<? super K, ?>,K)
*/ 
public static <K> java.lang.Long getLong(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getLong(p0,p1);
}
/**
*public static <K> long org.apache.commons.collections4.MapUtils.getLongValue(java.util.Map<? super K, ?>,K)
*/ 
public static <K> long getLongValue(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getLongValue(p0,p1);
}
/**
*public static <K> long org.apache.commons.collections4.MapUtils.getLongValue(java.util.Map<? super K, ?>,K,long)
*/ 
public static <K> long getLongValue(java.util.Map<? super K, ?> p0,K p1,long p2){
	return org.apache.commons.collections4.MapUtils.getLongValue(p0,p1,p2);
}
/**
*public static <K> java.util.Map<?, ?> org.apache.commons.collections4.MapUtils.getMap(java.util.Map<? super K, ?>,K,java.util.Map<?, ?>)
*/ 
public static <K> java.util.Map<?, ?> getMap(java.util.Map<? super K, ?> p0,K p1,java.util.Map<?, ?> p2){
	return org.apache.commons.collections4.MapUtils.getMap(p0,p1,p2);
}
/**
*public static <K> java.util.Map<?, ?> org.apache.commons.collections4.MapUtils.getMap(java.util.Map<? super K, ?>,K)
*/ 
public static <K> java.util.Map<?, ?> getMap(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getMap(p0,p1);
}
/**
*public static <K> java.lang.Number org.apache.commons.collections4.MapUtils.getNumber(java.util.Map<? super K, ?>,K)
*/ 
public static <K> java.lang.Number getNumber(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getNumber(p0,p1);
}
/**
*public static <K> java.lang.Number org.apache.commons.collections4.MapUtils.getNumber(java.util.Map<? super K, ?>,K,java.lang.Number)
*/ 
public static <K> java.lang.Number getNumber(java.util.Map<? super K, ?> p0,K p1,java.lang.Number p2){
	return org.apache.commons.collections4.MapUtils.getNumber(p0,p1,p2);
}
/**
*public static <K,V> V org.apache.commons.collections4.MapUtils.getObject(java.util.Map<K, V>,K,V)
*/ 
public static <K,V> V getObject(java.util.Map<K, V> p0,K p1,V p2){
	return org.apache.commons.collections4.MapUtils.getObject(p0,p1,p2);
}
/**
*public static <K,V> V org.apache.commons.collections4.MapUtils.getObject(java.util.Map<? super K, V>,K)
*/ 
public static <K,V> V getObject(java.util.Map<? super K, V> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getObject(p0,p1);
}
/**
*public static <K> java.lang.Short org.apache.commons.collections4.MapUtils.getShort(java.util.Map<? super K, ?>,K)
*/ 
public static <K> java.lang.Short getShort(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getShort(p0,p1);
}
/**
*public static <K> java.lang.Short org.apache.commons.collections4.MapUtils.getShort(java.util.Map<? super K, ?>,K,java.lang.Short)
*/ 
public static <K> java.lang.Short getShort(java.util.Map<? super K, ?> p0,K p1,java.lang.Short p2){
	return org.apache.commons.collections4.MapUtils.getShort(p0,p1,p2);
}
/**
*public static <K> short org.apache.commons.collections4.MapUtils.getShortValue(java.util.Map<? super K, ?>,K)
*/ 
public static <K> short getShortValue(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getShortValue(p0,p1);
}
/**
*public static <K> short org.apache.commons.collections4.MapUtils.getShortValue(java.util.Map<? super K, ?>,K,short)
*/ 
public static <K> short getShortValue(java.util.Map<? super K, ?> p0,K p1,short p2){
	return org.apache.commons.collections4.MapUtils.getShortValue(p0,p1,p2);
}
/**
*public static <K> java.lang.String org.apache.commons.collections4.MapUtils.getString(java.util.Map<? super K, ?>,K)
*/ 
public static <K> java.lang.String getString(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getString(p0,p1);
}
/**
*public static <K> java.lang.String org.apache.commons.collections4.MapUtils.getString(java.util.Map<? super K, ?>,K,java.lang.String)
*/ 
public static <K> java.lang.String getString(java.util.Map<? super K, ?> p0,K p1,java.lang.String p2){
	return org.apache.commons.collections4.MapUtils.getString(p0,p1,p2);
}
/**
*public static <K,V> org.apache.commons.collections4.Bag<V> org.apache.commons.collections4.MultiMapUtils.getValuesAsBag(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*/ 
public static <K,V> org.apache.commons.collections4.Bag<V> getValuesAsBag(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
	return org.apache.commons.collections4.MultiMapUtils.getValuesAsBag(p0,p1);
}
/**
*public static <K,V> java.util.List<V> org.apache.commons.collections4.MultiMapUtils.getValuesAsList(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*/ 
public static <K,V> java.util.List<V> getValuesAsList(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
	return org.apache.commons.collections4.MultiMapUtils.getValuesAsList(p0,p1);
}
/**
*public static <K,V> java.util.Set<V> org.apache.commons.collections4.MultiMapUtils.getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*/ 
public static <K,V> java.util.Set<V> getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
	return org.apache.commons.collections4.MultiMapUtils.getValuesAsSet(p0,p1);
}
/**
*public static <K,V> java.util.Map.java.util.Map$Entry<K, V> com.google.common.collect.Maps.immutableEntry(K,V)
*/ 
public static <K,V> Entry<K, V> immutableEntry(K p0,V p1){
	return com.google.common.collect.Maps.immutableEntry(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> com.google.common.collect.ImmutableBiMap.of(K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5){
	return com.google.common.collect.ImmutableBiMap.of(p0,p1,p2,p3,p4,p5);
}
/**
*public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> com.google.common.collect.ImmutableBiMap.of(K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> of(K p0,V p1,K p2,V p3){
	return com.google.common.collect.ImmutableBiMap.of(p0,p1,p2,p3);
}
/**
*public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> com.google.common.collect.ImmutableBiMap.of(K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> of(K p0,V p1){
	return com.google.common.collect.ImmutableBiMap.of(p0,p1);
}
/**
*public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> com.google.common.collect.ImmutableBiMap.of(K,V,K,V,K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9){
	return com.google.common.collect.ImmutableBiMap.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
/**
*public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> com.google.common.collect.ImmutableBiMap.of(K,V,K,V,K,V,K,V)
*/ 
public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7){
	return com.google.common.collect.ImmutableBiMap.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
/**
*public static <K,V> V org.apache.commons.lang3.concurrent.ConcurrentUtils.putIfAbsent(java.util.concurrent.ConcurrentMap<K, V>,K,V)
*/ 
public static <K,V> V putIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,V p2){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.putIfAbsent(p0,p1,p2);
}
/**
*public static <K> void org.apache.commons.collections4.MapUtils.safeAddToMap(java.util.Map<? super K, java.lang.Object>,K,java.lang.Object) throws java.lang.NullPointerException
*/ 
public static <K> void safeAddToMap(java.util.Map<? super K, java.lang.Object> p0,K p1,java.lang.Object p2) throws java.lang.NullPointerException{
	 org.apache.commons.collections4.MapUtils.safeAddToMap(p0,p1,p2);
}
/**
*public static <K> void it.unimi.dsi.fastutil.objects.ObjectBigArrays.set(K[][],long,K)
*/ 
public static <K> void set(K[][] p0,long p1,K p2){
	 it.unimi.dsi.fastutil.objects.ObjectBigArrays.set(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(K,java.lang.Boolean)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> singleton(K p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(K,boolean)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> singleton(K p0,boolean p1){
	return it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(K,java.lang.Boolean,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> singleton(K p0,java.lang.Boolean p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(K,boolean,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> singleton(K p0,boolean p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> it.unimi.dsi.fastutil.objects.Object2ByteFunctions.singleton(K,java.lang.Byte)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> singleton(K p0,java.lang.Byte p1){
	return it.unimi.dsi.fastutil.objects.Object2ByteFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> it.unimi.dsi.fastutil.objects.Object2ByteFunctions.singleton(K,byte)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> singleton(K p0,byte p1){
	return it.unimi.dsi.fastutil.objects.Object2ByteFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps.singleton(K,java.lang.Byte,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> singleton(K p0,java.lang.Byte p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps.singleton(K,byte,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> singleton(K p0,byte p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> it.unimi.dsi.fastutil.objects.Object2CharFunctions.singleton(K,java.lang.Character)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> singleton(K p0,java.lang.Character p1){
	return it.unimi.dsi.fastutil.objects.Object2CharFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> it.unimi.dsi.fastutil.objects.Object2CharFunctions.singleton(K,char)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> singleton(K p0,char p1){
	return it.unimi.dsi.fastutil.objects.Object2CharFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> it.unimi.dsi.fastutil.objects.Object2CharSortedMaps.singleton(K,java.lang.Character,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> singleton(K p0,java.lang.Character p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> it.unimi.dsi.fastutil.objects.Object2CharSortedMaps.singleton(K,char,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> singleton(K p0,char p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> it.unimi.dsi.fastutil.objects.Object2DoubleFunctions.singleton(K,java.lang.Double)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> singleton(K p0,java.lang.Double p1){
	return it.unimi.dsi.fastutil.objects.Object2DoubleFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> it.unimi.dsi.fastutil.objects.Object2DoubleFunctions.singleton(K,double)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> singleton(K p0,double p1){
	return it.unimi.dsi.fastutil.objects.Object2DoubleFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps.singleton(K,java.lang.Double,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> singleton(K p0,java.lang.Double p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps.singleton(K,double,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> singleton(K p0,double p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> it.unimi.dsi.fastutil.objects.Object2FloatFunctions.singleton(K,java.lang.Float)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> singleton(K p0,java.lang.Float p1){
	return it.unimi.dsi.fastutil.objects.Object2FloatFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> it.unimi.dsi.fastutil.objects.Object2FloatFunctions.singleton(K,float)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> singleton(K p0,float p1){
	return it.unimi.dsi.fastutil.objects.Object2FloatFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps.singleton(K,java.lang.Float,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> singleton(K p0,java.lang.Float p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps.singleton(K,float,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> singleton(K p0,float p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> it.unimi.dsi.fastutil.objects.Object2IntFunctions.singleton(K,java.lang.Integer)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> singleton(K p0,java.lang.Integer p1){
	return it.unimi.dsi.fastutil.objects.Object2IntFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> it.unimi.dsi.fastutil.objects.Object2IntFunctions.singleton(K,int)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> singleton(K p0,int p1){
	return it.unimi.dsi.fastutil.objects.Object2IntFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> it.unimi.dsi.fastutil.objects.Object2IntSortedMaps.singleton(K,java.lang.Integer,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> singleton(K p0,java.lang.Integer p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> it.unimi.dsi.fastutil.objects.Object2IntSortedMaps.singleton(K,int,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> singleton(K p0,int p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> it.unimi.dsi.fastutil.objects.Object2LongFunctions.singleton(K,java.lang.Long)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> singleton(K p0,java.lang.Long p1){
	return it.unimi.dsi.fastutil.objects.Object2LongFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> it.unimi.dsi.fastutil.objects.Object2LongFunctions.singleton(K,long)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> singleton(K p0,long p1){
	return it.unimi.dsi.fastutil.objects.Object2LongFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> it.unimi.dsi.fastutil.objects.Object2LongSortedMaps.singleton(K,java.lang.Long,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> singleton(K p0,java.lang.Long p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> it.unimi.dsi.fastutil.objects.Object2LongSortedMaps.singleton(K,long,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> singleton(K p0,long p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.singleton(K,V)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> singleton(K p0,V p1){
	return it.unimi.dsi.fastutil.objects.Object2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps.singleton(K,V,java.util.Comparator<? super K>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> singleton(K p0,V p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> it.unimi.dsi.fastutil.objects.Object2ShortFunctions.singleton(K,java.lang.Short)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> singleton(K p0,java.lang.Short p1){
	return it.unimi.dsi.fastutil.objects.Object2ShortFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> it.unimi.dsi.fastutil.objects.Object2ShortFunctions.singleton(K,short)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> singleton(K p0,short p1){
	return it.unimi.dsi.fastutil.objects.Object2ShortFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps.singleton(K,java.lang.Short,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> singleton(K p0,java.lang.Short p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps.singleton(K,short,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> singleton(K p0,short p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> it.unimi.dsi.fastutil.objects.ObjectBigListIterators.singleton(K)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> singleton(K p0){
	return it.unimi.dsi.fastutil.objects.ObjectBigListIterators.singleton(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> it.unimi.dsi.fastutil.objects.ObjectSortedSets.singleton(K,java.util.Comparator<? super K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> singleton(K p0,java.util.Comparator<? super K> p1){
	return it.unimi.dsi.fastutil.objects.ObjectSortedSets.singleton(p0,p1);
}
}
