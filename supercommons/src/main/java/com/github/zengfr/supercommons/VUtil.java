package com.github.zengfr.supercommons;

import java.util.Map.Entry;

import com.google.common.collect.Table.Cell;

/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class VUtil{
/**
*public static <K,V> com.google.common.base.Function<K, V> com.google.common.base.Functions.forMap(java.util.Map<K, ? extends V>,V)
*/
public static <K,V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, ? extends V> p0,V p1){
	return com.google.common.base.Functions.forMap(p0,p1);
}
/**
*public static <K,V> com.google.common.cache.RemovalNotification<K, V> com.google.common.cache.RemovalNotification.create(K,V,com.google.common.cache.RemovalCause)
*/
public static <K,V> com.google.common.cache.RemovalNotification<K, V> create(K p0,V p1,com.google.common.cache.RemovalCause p2){
	return com.google.common.cache.RemovalNotification.create(p0,p1,p2);
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
*public static <K,V> com.google.common.collect.ImmutableRangeMap<K, V> com.google.common.collect.ImmutableRangeMap.of(com.google.common.collect.Range<K>,V)
*/
public static <K extends java.lang.Comparable<?> ,V> com.google.common.collect.ImmutableRangeMap<K, V> of(com.google.common.collect.Range<K> p0,V p1){
	return com.google.common.collect.ImmutableRangeMap.of(p0,p1);
}
/**
*public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> com.google.common.collect.ImmutableTable.of(R,C,V)
*/
public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> of(R p0,C p1,V p2){
	return com.google.common.collect.ImmutableTable.of(p0,p1,p2);
}
/**
*public static <K,V> java.util.Map.java.util.Map$Entry<K, V> com.google.common.collect.Maps.immutableEntry(K,V)
*/
public static <K,V> Entry<K, V> immutableEntry(K p0,V p1){
	return com.google.common.collect.Maps.immutableEntry(p0,p1);
}
/**
*public static <R,C,V> com.google.common.collect.Table.com.google.common.collect.Table$Cell<R, C, V> com.google.common.collect.Tables.immutableCell(R,C,V)
*/
public static <R,C,V> Cell<R, C, V> immutableCell(R p0,C p1,V p2){
	return com.google.common.collect.Tables.immutableCell(p0,p1,p2);
}
/**
*public static <V> java.util.concurrent.atomic.AtomicReference<V> com.google.common.util.concurrent.Atomics.newReference(V)
*/
public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference(V p0){
	return com.google.common.util.concurrent.Atomics.newReference(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.immediateFuture(V)
*/
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(V p0){
	return com.google.common.util.concurrent.Futures.immediateFuture(p0);
}
/**
*public static <V,X> com.google.common.util.concurrent.CheckedFuture<V, X> com.google.common.util.concurrent.Futures.immediateCheckedFuture(V)
*/
public static <V,X extends java.lang.Exception > com.google.common.util.concurrent.CheckedFuture<V, X> immediateCheckedFuture(V p0){
	return com.google.common.util.concurrent.Futures.immediateCheckedFuture(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> com.google.common.util.concurrent.ListenableFutureTask.create(java.lang.Runnable,V)
*/
public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.lang.Runnable p0,V p1){
	return com.google.common.util.concurrent.ListenableFutureTask.create(p0,p1);
}
/**
*public static <K,V> V org.apache.commons.collections4.MapUtils.getObject(java.util.Map<K, V>,K,V)
*/
public static <K,V> V getObject(java.util.Map<K, V> p0,K p1,V p2){
	return org.apache.commons.collections4.MapUtils.getObject(p0,p1,p2);
}
/**
*public static <K,V> org.apache.commons.collections4.map.DefaultedMap<K, V> org.apache.commons.collections4.map.DefaultedMap.defaultedMap(java.util.Map<K, V>,V)
*/
public static <K,V> org.apache.commons.collections4.map.DefaultedMap<K, V> defaultedMap(java.util.Map<K, V> p0,V p1){
	return org.apache.commons.collections4.map.DefaultedMap.defaultedMap(p0,p1);
}
/**
*public static <E,V> org.apache.commons.collections4.set.MapBackedSet<E, V> org.apache.commons.collections4.set.MapBackedSet.mapBackedSet(java.util.Map<E, ? super V>,V)
*/
public static <E,V> org.apache.commons.collections4.set.MapBackedSet<E, V> mapBackedSet(java.util.Map<E, ? super V> p0,V p1){
	return org.apache.commons.collections4.set.MapBackedSet.mapBackedSet(p0,p1);
}
/**
*public static <K,V> V org.apache.commons.lang3.concurrent.ConcurrentUtils.putIfAbsent(java.util.concurrent.ConcurrentMap<K, V>,K,V)
*/
public static <K,V> V putIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,V p2){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.putIfAbsent(p0,p1,p2);
}
/**
*public static <K,V> org.apache.commons.math3.util.Pair<K, V> org.apache.commons.math3.util.Pair.create(K,V)
*/
public static <K,V> org.apache.commons.math3.util.Pair<K, V> create(K p0,V p1){
	return org.apache.commons.math3.util.Pair.create(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.singleton(java.lang.Byte,V)
*/
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> singleton(java.lang.Byte p0,V p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.singleton(byte,V)
*/
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> singleton(byte p0,V p1){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps.singleton(java.lang.Byte,V,it.unimi.dsi.fastutil.bytes.ByteComparator)
*/
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(java.lang.Byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps.singleton(byte,V,it.unimi.dsi.fastutil.bytes.ByteComparator)
*/
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.singleton(java.lang.Character,V)
*/
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> singleton(java.lang.Character p0,V p1){
	return it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.singleton(char,V)
*/
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> singleton(char p0,V p1){
	return it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.singleton(java.lang.Character,V,it.unimi.dsi.fastutil.chars.CharComparator)
*/
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(java.lang.Character p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.singleton(char,V,it.unimi.dsi.fastutil.chars.CharComparator)
*/
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(char p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.singleton(java.lang.Double,V)
*/
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> singleton(java.lang.Double p0,V p1){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.singleton(double,V)
*/
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> singleton(double p0,V p1){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps.singleton(java.lang.Double,V,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*/
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(java.lang.Double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps.singleton(double,V,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*/
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.singleton(java.lang.Float,V)
*/
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> singleton(java.lang.Float p0,V p1){
	return it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.singleton(float,V)
*/
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> singleton(float p0,V p1){
	return it.unimi.dsi.fastutil.floats.Float2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps.singleton(java.lang.Float,V,it.unimi.dsi.fastutil.floats.FloatComparator)
*/
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(java.lang.Float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps.singleton(float,V,it.unimi.dsi.fastutil.floats.FloatComparator)
*/
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.singleton(java.lang.Integer,V)
*/
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> singleton(java.lang.Integer p0,V p1){
	return it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.singleton(int,V)
*/
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> singleton(int p0,V p1){
	return it.unimi.dsi.fastutil.ints.Int2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps.singleton(java.lang.Integer,V,it.unimi.dsi.fastutil.ints.IntComparator)
*/
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> singleton(java.lang.Integer p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps.singleton(int,V,it.unimi.dsi.fastutil.ints.IntComparator)
*/
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> singleton(int p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.singleton(java.lang.Long,V)
*/
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> singleton(java.lang.Long p0,V p1){
	return it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.singleton(long,V)
*/
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> singleton(long p0,V p1){
	return it.unimi.dsi.fastutil.longs.Long2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps.singleton(java.lang.Long,V,it.unimi.dsi.fastutil.longs.LongComparator)
*/
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(java.lang.Long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps.singleton(long,V,it.unimi.dsi.fastutil.longs.LongComparator)
*/
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps.singleton(p0,p1,p2);
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
*public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.singleton(java.lang.Short,V)
*/
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> singleton(java.lang.Short p0,V p1){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.singleton(short,V)
*/
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> singleton(short p0,V p1){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions.singleton(p0,p1);
}
/**
*public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps.singleton(java.lang.Short,V,it.unimi.dsi.fastutil.shorts.ShortComparator)
*/
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(java.lang.Short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps.singleton(short,V,it.unimi.dsi.fastutil.shorts.ShortComparator)
*/
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
}
