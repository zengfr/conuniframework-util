package com.github.zengfr.supercommons;
import com.google.common.cache.RemovalNotification;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMapFauxverideShim;
import com.google.common.collect.Maps;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.MultiMapUtils;
import org.apache.commons.lang3.concurrent.ConcurrentUtils;
import org.apache.commons.math3.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2BooleanFunctions;
import it.unimi.dsi.fastutil.objects.Object2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ByteFunctions;
import it.unimi.dsi.fastutil.objects.Object2ByteMaps;
import it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2CharFunctions;
import it.unimi.dsi.fastutil.objects.Object2CharMaps;
import it.unimi.dsi.fastutil.objects.Object2CharSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2DoubleFunctions;
import it.unimi.dsi.fastutil.objects.Object2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatFunctions;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2IntFunctions;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2LongFunctions;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectFunctions;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ShortFunctions;
import it.unimi.dsi.fastutil.objects.Object2ShortMaps;
import it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import it.unimi.dsi.fastutil.objects.ObjectBigArrays;
import it.unimi.dsi.fastutil.objects.ObjectBigListIterators;
import it.unimi.dsi.fastutil.objects.ObjectBigLists;
import it.unimi.dsi.fastutil.objects.ObjectIterators;
import it.unimi.dsi.fastutil.objects.ObjectLists;
import it.unimi.dsi.fastutil.objects.ObjectSets;
import it.unimi.dsi.fastutil.objects.ObjectSortedSets;
import it.unimi.dsi.fastutil.objects.Reference2BooleanFunctions;
import it.unimi.dsi.fastutil.objects.Reference2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ByteFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ByteMaps;
import it.unimi.dsi.fastutil.objects.Reference2ByteSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharFunctions;
import it.unimi.dsi.fastutil.objects.Reference2CharMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleFunctions;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatFunctions;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntFunctions;
import it.unimi.dsi.fastutil.objects.Reference2IntMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2LongFunctions;
import it.unimi.dsi.fastutil.objects.Reference2LongMaps;
import it.unimi.dsi.fastutil.objects.Reference2LongSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ShortFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ShortMaps;
import it.unimi.dsi.fastutil.objects.Reference2ShortSortedMaps;
import it.unimi.dsi.fastutil.objects.ReferenceBigLists;
import it.unimi.dsi.fastutil.objects.ReferenceLists;
import it.unimi.dsi.fastutil.objects.ReferenceSets;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class KUtil{ 
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
public static <K,V> java.util.Map.java.util.Map.Entry<K, V> immutableEntry(K p0,V p1){
return Maps.immutableEntry(p0,p1);
}
public static <K> java.lang.Number getNumber(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getNumber(p0,p1);
}
public static <K> java.lang.Number getNumber(java.util.Map<? super K, ?> p0,K p1,java.lang.Number p2){
return MapUtils.getNumber(p0,p1,p2);
}
public static <K,V> V getObject(java.util.Map<K, V> p0,K p1,V p2){
return MapUtils.getObject(p0,p1,p2);
}
public static <K,V> V getObject(java.util.Map<? super K, V> p0,K p1){
return MapUtils.getObject(p0,p1);
}
public static <K> java.lang.Boolean getBoolean(java.util.Map<? super K, ?> p0,K p1,java.lang.Boolean p2){
return MapUtils.getBoolean(p0,p1,p2);
}
public static <K> java.lang.Boolean getBoolean(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getBoolean(p0,p1);
}
public static <K> java.lang.Byte getByte(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getByte(p0,p1);
}
public static <K> java.lang.Byte getByte(java.util.Map<? super K, ?> p0,K p1,java.lang.Byte p2){
return MapUtils.getByte(p0,p1,p2);
}
public static <K> java.lang.Short getShort(java.util.Map<? super K, ?> p0,K p1,java.lang.Short p2){
return MapUtils.getShort(p0,p1,p2);
}
public static <K> java.lang.Short getShort(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getShort(p0,p1);
}
public static <K> java.lang.Long getLong(java.util.Map<? super K, ?> p0,K p1,java.lang.Long p2){
return MapUtils.getLong(p0,p1,p2);
}
public static <K> java.lang.Long getLong(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getLong(p0,p1);
}
public static <K> java.lang.Float getFloat(java.util.Map<? super K, ?> p0,K p1,java.lang.Float p2){
return MapUtils.getFloat(p0,p1,p2);
}
public static <K> java.lang.Float getFloat(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getFloat(p0,p1);
}
public static <K> java.lang.Double getDouble(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getDouble(p0,p1);
}
public static <K> java.lang.Double getDouble(java.util.Map<? super K, ?> p0,K p1,java.lang.Double p2){
return MapUtils.getDouble(p0,p1,p2);
}
public static <K> java.lang.Integer getInteger(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getInteger(p0,p1);
}
public static <K> java.lang.Integer getInteger(java.util.Map<? super K, ?> p0,K p1,java.lang.Integer p2){
return MapUtils.getInteger(p0,p1,p2);
}
public static <K> java.util.Map<?, ?> getMap(java.util.Map<? super K, ?> p0,K p1,java.util.Map<?, ?> p2){
return MapUtils.getMap(p0,p1,p2);
}
public static <K> java.util.Map<?, ?> getMap(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getMap(p0,p1);
}
public static <K> java.lang.String getString(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getString(p0,p1);
}
public static <K> java.lang.String getString(java.util.Map<? super K, ?> p0,K p1,java.lang.String p2){
return MapUtils.getString(p0,p1,p2);
}
public static <K> short getShortValue(java.util.Map<? super K, ?> p0,K p1,short p2){
return MapUtils.getShortValue(p0,p1,p2);
}
public static <K> short getShortValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getShortValue(p0,p1);
}
public static <K> void safeAddToMap(java.util.Map<? super K, java.lang.Object> p0,K p1,java.lang.Object p2) throws java.lang.NullPointerException{
 MapUtils.safeAddToMap(p0,p1,p2);
}
public static <K> float getFloatValue(java.util.Map<? super K, ?> p0,K p1,float p2){
return MapUtils.getFloatValue(p0,p1,p2);
}
public static <K> float getFloatValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getFloatValue(p0,p1);
}
public static <K> byte getByteValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getByteValue(p0,p1);
}
public static <K> byte getByteValue(java.util.Map<? super K, ?> p0,K p1,byte p2){
return MapUtils.getByteValue(p0,p1,p2);
}
public static <K> long getLongValue(java.util.Map<? super K, ?> p0,K p1,long p2){
return MapUtils.getLongValue(p0,p1,p2);
}
public static <K> long getLongValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getLongValue(p0,p1);
}
public static <K> int getIntValue(java.util.Map<? super K, ?> p0,K p1,int p2){
return MapUtils.getIntValue(p0,p1,p2);
}
public static <K> int getIntValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getIntValue(p0,p1);
}
public static <K> double getDoubleValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getDoubleValue(p0,p1);
}
public static <K> double getDoubleValue(java.util.Map<? super K, ?> p0,K p1,double p2){
return MapUtils.getDoubleValue(p0,p1,p2);
}
public static <K> boolean getBooleanValue(java.util.Map<? super K, ?> p0,K p1,boolean p2){
return MapUtils.getBooleanValue(p0,p1,p2);
}
public static <K> boolean getBooleanValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getBooleanValue(p0,p1);
}
public static <K,V> java.util.Collection<V> getCollection(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
return MultiMapUtils.getCollection(p0,p1);
}
public static <K,V> java.util.Set<V> getValuesAsSet(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
return MultiMapUtils.getValuesAsSet(p0,p1);
}
public static <K,V> java.util.List<V> getValuesAsList(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
return MultiMapUtils.getValuesAsList(p0,p1);
}
public static <K,V> org.apache.commons.collections4.Bag<V> getValuesAsBag(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
return MultiMapUtils.getValuesAsBag(p0,p1);
}
public static <K,V> V putIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,V p2){
return ConcurrentUtils.putIfAbsent(p0,p1,p2);
}
public static <K,V> V createIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> p2) throws org.apache.commons.lang3.concurrent.ConcurrentException{
return ConcurrentUtils.createIfAbsent(p0,p1,p2);
}
public static <K,V> V createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> p2){
return ConcurrentUtils.createIfAbsentUnchecked(p0,p1,p2);
}
public static <K,V> org.apache.commons.math3.util.Pair<K, V> create(K p0,V p1){
return Pair.create(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> singleton(K p0,boolean p1){
return Object2BooleanFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> singleton(K p0,java.lang.Boolean p1){
return Object2BooleanFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> singleton(K p0,java.lang.Boolean p1,java.util.Comparator<? super K> p2){
return Object2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> singleton(K p0,boolean p1,java.util.Comparator<? super K> p2){
return Object2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> singleton(K p0,byte p1){
return Object2ByteFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> singleton(K p0,java.lang.Byte p1){
return Object2ByteFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> singleton(K p0,java.lang.Byte p1,java.util.Comparator<? super K> p2){
return Object2ByteSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> singleton(K p0,byte p1,java.util.Comparator<? super K> p2){
return Object2ByteSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> singleton(K p0,char p1){
return Object2CharFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> singleton(K p0,java.lang.Character p1){
return Object2CharFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> singleton(K p0,java.lang.Character p1,java.util.Comparator<? super K> p2){
return Object2CharSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> singleton(K p0,char p1,java.util.Comparator<? super K> p2){
return Object2CharSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> singleton(K p0,double p1){
return Object2DoubleFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> singleton(K p0,java.lang.Double p1){
return Object2DoubleFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> singleton(K p0,java.lang.Double p1,java.util.Comparator<? super K> p2){
return Object2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> singleton(K p0,double p1,java.util.Comparator<? super K> p2){
return Object2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> singleton(K p0,float p1){
return Object2FloatFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> singleton(K p0,java.lang.Float p1){
return Object2FloatFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> singleton(K p0,java.lang.Float p1,java.util.Comparator<? super K> p2){
return Object2FloatSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> singleton(K p0,float p1,java.util.Comparator<? super K> p2){
return Object2FloatSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> singleton(K p0,int p1){
return Object2IntFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> singleton(K p0,java.lang.Integer p1){
return Object2IntFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> singleton(K p0,java.lang.Integer p1,java.util.Comparator<? super K> p2){
return Object2IntSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> singleton(K p0,int p1,java.util.Comparator<? super K> p2){
return Object2IntSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> singleton(K p0,long p1){
return Object2LongFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> singleton(K p0,java.lang.Long p1){
return Object2LongFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> singleton(K p0,java.lang.Long p1,java.util.Comparator<? super K> p2){
return Object2LongSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> singleton(K p0,long p1,java.util.Comparator<? super K> p2){
return Object2LongSortedMaps.singleton(p0,p1,p2);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> singleton(K p0,V p1){
return Object2ObjectFunctions.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> singleton(K p0,V p1,java.util.Comparator<? super K> p2){
return Object2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> singleton(K p0,short p1){
return Object2ShortFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> singleton(K p0,java.lang.Short p1){
return Object2ShortFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> singleton(K p0,java.lang.Short p1,java.util.Comparator<? super K> p2){
return Object2ShortSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> singleton(K p0,short p1,java.util.Comparator<? super K> p2){
return Object2ShortSortedMaps.singleton(p0,p1,p2);
}
public static <K> void fill(K[] p0,int p1,int p2,K p3){
 ObjectArrays.fill(p0,p1,p2,p3);
}
public static <K> void fill(K[] p0,K p1){
 ObjectArrays.fill(p0,p1);
}
public static <K> int binarySearch(K[] p0,int p1,int p2,K p3,java.util.Comparator<K> p4){
return ObjectArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static <K> int binarySearch(K[] p0,K p1,java.util.Comparator<K> p2){
return ObjectArrays.binarySearch(p0,p1,p2);
}
public static <K> int binarySearch(K[] p0,int p1,int p2,K p3){
return ObjectArrays.binarySearch(p0,p1,p2,p3);
}
public static <K> int binarySearch(K[] p0,K p1){
return ObjectArrays.binarySearch(p0,p1);
}
public static <K> void set(K[][] p0,long p1,K p2){
 ObjectBigArrays.set(p0,p1,p2);
}
public static <K> void fill(K[][] p0,long p1,long p2,K p3){
 ObjectBigArrays.fill(p0,p1,p2,p3);
}
public static <K> void fill(K[][] p0,K p1){
 ObjectBigArrays.fill(p0,p1);
}
public static <K> long binarySearch(K[][] p0,long p1,long p2,K p3,java.util.Comparator<K> p4){
return ObjectBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static <K> long binarySearch(K[][] p0,long p1,long p2,K p3){
return ObjectBigArrays.binarySearch(p0,p1,p2,p3);
}
public static <K> long binarySearch(K[][] p0,K p1,java.util.Comparator<K> p2){
return ObjectBigArrays.binarySearch(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> singleton(K p0){
return ObjectBigListIterators.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> singleton(K p0,java.util.Comparator<? super K> p1){
return ObjectSortedSets.singleton(p0,p1);
}
}
