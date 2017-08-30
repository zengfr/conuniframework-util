package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComparatorUtil{ 
/**
*public static java.util.Comparator<boolean[]> com.google.common.primitives.Booleans.lexicographicalComparator()
*/ 
public static java.util.Comparator<boolean[]> lexicographicalComparator(){
	return com.google.common.primitives.Booleans.lexicographicalComparator();
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Collection)
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Collection p1){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Iterator,java.util.Iterator)
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator p1,java.util.Iterator p2){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1,p2);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Iterator[])
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator[] p1){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1);
}
/**
*public static java.lang.Object org.apache.commons.collections.ComparatorUtils.min(java.lang.Object,java.lang.Object,java.util.Comparator)
*/ 
public static java.lang.Object min(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2){
	return org.apache.commons.collections.ComparatorUtils.min(p0,p1,p2);
}
/**
*public static java.lang.Object org.apache.commons.collections.ComparatorUtils.max(java.lang.Object,java.lang.Object,java.util.Comparator)
*/ 
public static java.lang.Object max(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2){
	return org.apache.commons.collections.ComparatorUtils.max(p0,p1,p2);
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.chainedComparator(java.util.Comparator,java.util.Comparator)
*/ 
public static java.util.Comparator chainedComparator(java.util.Comparator p0,java.util.Comparator p1){
	return org.apache.commons.collections.ComparatorUtils.chainedComparator(p0,p1);
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.chainedComparator(java.util.Comparator[])
*/ 
public static java.util.Comparator chainedComparator(java.util.Comparator[] p0){
	return org.apache.commons.collections.ComparatorUtils.chainedComparator(p0);
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.chainedComparator(java.util.Collection)
*/ 
public static java.util.Comparator chainedComparator(java.util.Collection p0){
	return org.apache.commons.collections.ComparatorUtils.chainedComparator(p0);
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.naturalComparator()
*/ 
public static java.util.Comparator naturalComparator(){
	return org.apache.commons.collections.ComparatorUtils.naturalComparator();
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.reversedComparator(java.util.Comparator)
*/ 
public static java.util.Comparator reversedComparator(java.util.Comparator p0){
	return org.apache.commons.collections.ComparatorUtils.reversedComparator(p0);
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.booleanComparator(boolean)
*/ 
public static java.util.Comparator booleanComparator(boolean p0){
	return org.apache.commons.collections.ComparatorUtils.booleanComparator(p0);
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.transformedComparator(java.util.Comparator,org.apache.commons.collections.Transformer)
*/ 
public static java.util.Comparator transformedComparator(java.util.Comparator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.ComparatorUtils.transformedComparator(p0,p1);
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.nullLowComparator(java.util.Comparator)
*/ 
public static java.util.Comparator nullLowComparator(java.util.Comparator p0){
	return org.apache.commons.collections.ComparatorUtils.nullLowComparator(p0);
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.nullHighComparator(java.util.Comparator)
*/ 
public static java.util.Comparator nullHighComparator(java.util.Comparator p0){
	return org.apache.commons.collections.ComparatorUtils.nullHighComparator(p0);
}
/**
*public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.chainedComparator(java.util.Comparator<E>...)
*/ 
public static <E> java.util.Comparator<E> chainedComparator(java.util.Comparator<E>... p0){
	return org.apache.commons.collections4.ComparatorUtils.chainedComparator(p0);
}
/**
*public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.chainedComparator(java.util.Collection<java.util.Comparator<E>>)
*/ 
public static <E> java.util.Comparator<E> chainedComparator(java.util.Collection<java.util.Comparator<E>> p0){
	return org.apache.commons.collections4.ComparatorUtils.chainedComparator(p0);
}
/**
*public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.reversedComparator(java.util.Comparator<E>)
*/ 
public static <E> java.util.Comparator<E> reversedComparator(java.util.Comparator<E> p0){
	return org.apache.commons.collections4.ComparatorUtils.reversedComparator(p0);
}
/**
*public static <I,O> java.util.Comparator<I> org.apache.commons.collections4.ComparatorUtils.transformedComparator(java.util.Comparator<O>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*/ 
public static <I,O> java.util.Comparator<I> transformedComparator(java.util.Comparator<O> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
	return org.apache.commons.collections4.ComparatorUtils.transformedComparator(p0,p1);
}
/**
*public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.nullLowComparator(java.util.Comparator<E>)
*/ 
public static <E> java.util.Comparator<E> nullLowComparator(java.util.Comparator<E> p0){
	return org.apache.commons.collections4.ComparatorUtils.nullLowComparator(p0);
}
/**
*public static <E> java.util.Comparator<E> org.apache.commons.collections4.ComparatorUtils.nullHighComparator(java.util.Comparator<E>)
*/ 
public static <E> java.util.Comparator<E> nullHighComparator(java.util.Comparator<E> p0){
	return org.apache.commons.collections4.ComparatorUtils.nullHighComparator(p0);
}
/**
*public static java.util.Comparator<? super java.util.Map.java.util.Map$Entry<java.lang.Byte, ?>> it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator)
*/ 
public static java.util.Comparator<? super Entry<java.lang.Byte, ?>> entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator p0){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.entryComparator(p0);
}
/**
*public static java.util.Comparator<? super java.util.Map.java.util.Map$Entry<java.lang.Character, ?>> it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static java.util.Comparator<? super Entry<java.lang.Character, ?>> entryComparator(it.unimi.dsi.fastutil.chars.CharComparator p0){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.entryComparator(p0);
}
/**
*public static java.util.Comparator<? super java.util.Map.java.util.Map$Entry<java.lang.Double, ?>> it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator)
*/ 
public static java.util.Comparator<? super Entry<java.lang.Double, ?>> entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator p0){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.entryComparator(p0);
}
/**
*public static java.util.Comparator<? super java.util.Map.java.util.Map$Entry<java.lang.Float, ?>> it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator)
*/ 
public static java.util.Comparator<? super Entry<java.lang.Float, ?>> entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator p0){
	return it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.entryComparator(p0);
}
/**
*public static java.util.Comparator<? super java.util.Map.java.util.Map$Entry<java.lang.Integer, ?>> it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.ints.IntComparator)
*/ 
public static java.util.Comparator<? super Entry<java.lang.Integer, ?>> entryComparator(it.unimi.dsi.fastutil.ints.IntComparator p0){
	return it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.entryComparator(p0);
}
/**
*public static java.util.Comparator<? super java.util.Map.java.util.Map$Entry<java.lang.Long, ?>> it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.longs.LongComparator)
*/ 
public static java.util.Comparator<? super Entry<java.lang.Long, ?>> entryComparator(it.unimi.dsi.fastutil.longs.LongComparator p0){
	return it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.entryComparator(p0);
}
/**
*public static <K> java.util.Comparator<? super java.util.Map.java.util.Map$Entry<K, ?>> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.entryComparator(java.util.Comparator<? super K>)
*/ 
public static <K> java.util.Comparator<? super Entry<K, ?>> entryComparator(java.util.Comparator<? super K> p0){
	return it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.entryComparator(p0);
}
/**
*public static <K> java.util.Comparator<K> it.unimi.dsi.fastutil.objects.ObjectComparators.oppositeComparator(java.util.Comparator<K>)
*/ 
public static <K> java.util.Comparator<K> oppositeComparator(java.util.Comparator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectComparators.oppositeComparator(p0);
}
/**
*public static java.util.Comparator<? super java.util.Map.java.util.Map$Entry<java.lang.Short, ?>> it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator)
*/ 
public static java.util.Comparator<? super Entry<java.lang.Short, ?>> entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator p0){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.entryComparator(p0);
}
}
