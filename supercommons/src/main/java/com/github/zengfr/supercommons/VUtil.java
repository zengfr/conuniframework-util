package com.zengfr.supercommons;
import com.google.common.base.Functions;
import com.google.common.cache.RemovalNotification;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMapFauxverideShim;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Tables;
import com.google.common.util.concurrent.Atomics;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFutureTask;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.map.DefaultedMap;
import org.apache.commons.collections4.set.MapBackedSet;
import org.apache.commons.lang3.concurrent.ConcurrentUtils;
import org.apache.commons.math3.util.Pair;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectFunctions;
import it.unimi.dsi.fastutil.chars.Char2ObjectMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions;
import it.unimi.dsi.fastutil.chars.Char2ReferenceMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ObjectMaps;
import it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ObjectFunctions;
import it.unimi.dsi.fastutil.floats.Float2ObjectMaps;
import it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions;
import it.unimi.dsi.fastutil.floats.Float2ReferenceMaps;
import it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectFunctions;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions;
import it.unimi.dsi.fastutil.ints.Int2ReferenceMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunctions;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceFunctions;
import it.unimi.dsi.fastutil.longs.Long2ReferenceMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectFunctions;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMaps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class VUtil{ 
public static <K,V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, ? extends V> p0,V p1){
return Functions.forMap(p0,p1);
}
public static <K,V> com.google.common.cache.RemovalNotification<K, V> create(K p0,V p1,com.google.common.cache.RemovalCause p2){
return RemovalNotification.create(p0,p1,p2);
}
public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5){
return ImmutableBiMap.of(p0,p1,p2,p3,p4,p5);
}
public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> of(K p0,V p1,K p2,V p3){
return ImmutableBiMap.of(p0,p1,p2,p3);
}
public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> of(K p0,V p1){
return ImmutableBiMap.of(p0,p1);
}
public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7,K p8,V p9){
return ImmutableBiMap.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
public static <K,V> com.google.common.collect.ImmutableBiMap<K, V> of(K p0,V p1,K p2,V p3,K p4,V p5,K p6,V p7){
return ImmutableBiMap.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static <K extends java.lang.Comparable<?> ,V> com.google.common.collect.ImmutableRangeMap<K, V> of(com.google.common.collect.Range<K> p0,V p1){
return ImmutableRangeMap.of(p0,p1);
}
public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> of(R p0,C p1,V p2){
return ImmutableTable.of(p0,p1,p2);
}
public static <K,V> java.util.Map.java.util.Map.Entry<K, V> immutableEntry(K p0,V p1){
return Maps.immutableEntry(p0,p1);
}
public static <R,C,V> com.google.common.collect.Table.com.google.common.collect.Table.Cell<R, C, V> immutableCell(R p0,C p1,V p2){
return Tables.immutableCell(p0,p1,p2);
}
public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference(V p0){
return Atomics.newReference(p0);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(V p0){
return Futures.immediateFuture(p0);
}
public static <V,X extends java.lang.Exception > com.google.common.util.concurrent.CheckedFuture<V, X> immediateCheckedFuture(V p0){
return Futures.immediateCheckedFuture(p0);
}
public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.lang.Runnable p0,V p1){
return ListenableFutureTask.create(p0,p1);
}
public static <K,V> V getObject(java.util.Map<K, V> p0,K p1,V p2){
return MapUtils.getObject(p0,p1,p2);
}
public static <K,V> org.apache.commons.collections4.map.DefaultedMap<K, V> defaultedMap(java.util.Map<K, V> p0,V p1){
return DefaultedMap.defaultedMap(p0,p1);
}
public static <E,V> org.apache.commons.collections4.set.MapBackedSet<E, V> mapBackedSet(java.util.Map<E, ? super V> p0,V p1){
return MapBackedSet.mapBackedSet(p0,p1);
}
public static <K,V> V putIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,V p2){
return ConcurrentUtils.putIfAbsent(p0,p1,p2);
}
public static <K,V> org.apache.commons.math3.util.Pair<K, V> create(K p0,V p1){
return Pair.create(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> singleton(java.lang.Byte p0,V p1){
return Byte2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> singleton(byte p0,V p1){
return Byte2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(java.lang.Byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> singleton(java.lang.Character p0,V p1){
return Char2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> singleton(char p0,V p1){
return Char2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(java.lang.Character p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(char p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> singleton(java.lang.Double p0,V p1){
return Double2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> singleton(double p0,V p1){
return Double2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(java.lang.Double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> singleton(java.lang.Float p0,V p1){
return Float2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> singleton(float p0,V p1){
return Float2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(java.lang.Float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> singleton(java.lang.Integer p0,V p1){
return Int2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> singleton(int p0,V p1){
return Int2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> singleton(java.lang.Integer p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> singleton(int p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> singleton(java.lang.Long p0,V p1){
return Long2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> singleton(long p0,V p1){
return Long2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(java.lang.Long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> singleton(K p0,V p1){
return Object2ObjectFunctions.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> singleton(K p0,V p1,java.util.Comparator<? super K> p2){
return Object2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> singleton(java.lang.Short p0,V p1){
return Short2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> singleton(short p0,V p1){
return Short2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(java.lang.Short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
}
