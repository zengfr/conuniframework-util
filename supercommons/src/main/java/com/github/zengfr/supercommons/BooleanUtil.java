package com.github.zengfr.supercommons;

import org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation;
import org.apache.commons.math3.util.MathArrays.OrderDirection;

/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanUtil{
///**
//*public static java.lang.Boolean org.apache.commons.collections.MapUtils.getBoolean(java.util.Map,java.lang.Object)
//*/
//public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1){
//	return org.apache.commons.collections.MapUtils.getBoolean(p0,p1);
//}
///**
//*public static java.lang.Boolean org.apache.commons.collections.MapUtils.getBoolean(java.util.Map,java.lang.Object,java.lang.Boolean)
//*/
//public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1,java.lang.Boolean p2){
//	return org.apache.commons.collections.MapUtils.getBoolean(p0,p1,p2);
//}
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
*public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.and(java.lang.Boolean...)
*/
public static java.lang.Boolean and(java.lang.Boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.and(p0);
}
/**
*public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.or(java.lang.Boolean...)
*/
public static java.lang.Boolean or(java.lang.Boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.or(p0);
}
/**
*public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.xor(java.lang.Boolean...)
*/
public static java.lang.Boolean xor(java.lang.Boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.xor(p0);
}
/**
*public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.negate(java.lang.Boolean)
*/
public static java.lang.Boolean negate(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.negate(p0);
}
/**
*public static int org.apache.commons.lang3.BooleanUtils.toInteger(java.lang.Boolean,int,int,int)
*/
public static int toInteger(java.lang.Boolean p0,int p1,int p2,int p3){
	return org.apache.commons.lang3.BooleanUtils.toInteger(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.Boolean)
*/
public static boolean toBoolean(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.isTrue(java.lang.Boolean)
*/
public static boolean isTrue(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.isTrue(p0);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.isFalse(java.lang.Boolean)
*/
public static boolean isFalse(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.isFalse(p0);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.isNotFalse(java.lang.Boolean)
*/
public static boolean isNotFalse(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.isNotFalse(p0);
}
/**
*public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringYesNo(java.lang.Boolean)
*/
public static java.lang.String toStringYesNo(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringYesNo(p0);
}
/**
*public static java.lang.Integer org.apache.commons.lang3.BooleanUtils.toIntegerObject(java.lang.Boolean,java.lang.Integer,java.lang.Integer,java.lang.Integer)
*/
public static java.lang.Integer toIntegerObject(java.lang.Boolean p0,java.lang.Integer p1,java.lang.Integer p2,java.lang.Integer p3){
	return org.apache.commons.lang3.BooleanUtils.toIntegerObject(p0,p1,p2,p3);
}
/**
*public static java.lang.Integer org.apache.commons.lang3.BooleanUtils.toIntegerObject(java.lang.Boolean)
*/
public static java.lang.Integer toIntegerObject(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toIntegerObject(p0);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.isNotTrue(java.lang.Boolean)
*/
public static boolean isNotTrue(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.isNotTrue(p0);
}
/**
*public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)
*/
public static java.lang.Boolean toBooleanObject(java.lang.Integer p0,java.lang.Integer p1,java.lang.Integer p2,java.lang.Integer p3){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
/**
*public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.Integer)
*/
public static java.lang.Boolean toBooleanObject(java.lang.Integer p0){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0);
}
/**
*public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(int,int,int,int)
*/
public static java.lang.Boolean toBooleanObject(int p0,int p1,int p2,int p3){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
/**
*public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.String)
*/
public static java.lang.Boolean toBooleanObject(java.lang.String p0){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0);
}
/**
*public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(int)
*/
public static java.lang.Boolean toBooleanObject(int p0){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0);
}
/**
*public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
*/
public static java.lang.Boolean toBooleanObject(java.lang.String p0,java.lang.String p1,java.lang.String p2,java.lang.String p3){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
/**
*public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringOnOff(java.lang.Boolean)
*/
public static java.lang.String toStringOnOff(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringOnOff(p0);
}
/**
*public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(java.lang.Boolean)
*/
public static java.lang.String toStringTrueFalse(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(p0);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull(java.lang.Boolean,boolean)
*/
public static boolean toBooleanDefaultIfNull(java.lang.Boolean p0,boolean p1){
	return org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanSet it.unimi.dsi.fastutil.booleans.BooleanSets.singleton(java.lang.Boolean)
*/
public static it.unimi.dsi.fastutil.booleans.BooleanSet singleton(java.lang.Boolean p0){
	return it.unimi.dsi.fastutil.booleans.BooleanSets.singleton(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions.singleton(java.lang.Byte,java.lang.Boolean)
*/
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction singleton(java.lang.Byte p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(java.lang.Byte,java.lang.Boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)
*/
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(java.lang.Byte p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.singleton(java.lang.Character,java.lang.Boolean)
*/
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(java.lang.Character p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(java.lang.Character,java.lang.Boolean,it.unimi.dsi.fastutil.chars.CharComparator)
*/
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(java.lang.Character p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions.singleton(java.lang.Double,java.lang.Boolean)
*/
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction singleton(java.lang.Double p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(java.lang.Double,java.lang.Boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*/
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(java.lang.Double p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction it.unimi.dsi.fastutil.floats.Float2BooleanFunctions.singleton(java.lang.Float,java.lang.Boolean)
*/
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction singleton(java.lang.Float p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.floats.Float2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(java.lang.Float,java.lang.Boolean,it.unimi.dsi.fastutil.floats.FloatComparator)
*/
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(java.lang.Float p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction it.unimi.dsi.fastutil.ints.Int2BooleanFunctions.singleton(java.lang.Integer,java.lang.Boolean)
*/
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction singleton(java.lang.Integer p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.ints.Int2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(java.lang.Integer,java.lang.Boolean,it.unimi.dsi.fastutil.ints.IntComparator)
*/
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(java.lang.Integer p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction it.unimi.dsi.fastutil.longs.Long2BooleanFunctions.singleton(java.lang.Long,java.lang.Boolean)
*/
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction singleton(java.lang.Long p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.longs.Long2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(java.lang.Long,java.lang.Boolean,it.unimi.dsi.fastutil.longs.LongComparator)
*/
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(java.lang.Long p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(K,java.lang.Boolean)
*/
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> singleton(K p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(K,java.lang.Boolean,java.util.Comparator<? super K>)
*/
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> singleton(K p0,java.lang.Boolean p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions.singleton(java.lang.Short,java.lang.Boolean)
*/
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction singleton(java.lang.Short p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(java.lang.Short,java.lang.Boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)
*/
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(java.lang.Short p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static java.lang.Boolean org.apache.commons.lang.BooleanUtils.xor(java.lang.Boolean[])
*/
public static java.lang.Boolean xor(java.lang.Boolean[] p0){
	return org.apache.commons.lang.BooleanUtils.xor(p0);
}
/**
*public static java.lang.Boolean org.apache.commons.lang.BooleanUtils.toBooleanObject(boolean)
*/
public static java.lang.Boolean toBooleanObject(boolean p0){
	return org.apache.commons.lang.BooleanUtils.toBooleanObject(p0);
}
/**
*public static boolean com.google.common.base.Ascii.equalsIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*/
public static boolean equalsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return com.google.common.base.Ascii.equalsIgnoreCase(p0,p1);
}
/**
*public static boolean com.google.common.base.Ascii.isLowerCase(char)
*/
public static boolean isLowerCase(char p0){
	return com.google.common.base.Ascii.isLowerCase(p0);
}
/**
*public static boolean com.google.common.base.Ascii.isUpperCase(char)
*/
public static boolean isUpperCase(char p0){
	return com.google.common.base.Ascii.isUpperCase(p0);
}
/**
*public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.Object)
*/
public static void checkArgument(boolean p0,java.lang.Object p1){
	 com.google.common.base.Preconditions.checkArgument(p0,p1);
}
/**
*public static void com.google.common.base.Preconditions.checkArgument(boolean)
*/
public static void checkArgument(boolean p0){
	 com.google.common.base.Preconditions.checkArgument(p0);
}
/**
*public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object...)
*/
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object... p2){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2);
}
/**
*public static void com.google.common.base.Preconditions.checkState(boolean)
*/
public static void checkState(boolean p0){
	 com.google.common.base.Preconditions.checkState(p0);
}
/**
*public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.Object)
*/
public static void checkState(boolean p0,java.lang.Object p1){
	 com.google.common.base.Preconditions.checkState(p0,p1);
}
/**
*public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object...)
*/
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object... p2){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2);
}
/**
*public static boolean com.google.common.base.Strings.isNullOrEmpty(java.lang.String)
*/
public static boolean isNullOrEmpty(java.lang.String p0){
	return com.google.common.base.Strings.isNullOrEmpty(p0);
}
/**
*public static boolean com.google.common.base.Throwables.lazyStackTraceIsLazy()
*/
public static boolean lazyStackTraceIsLazy(){
	return com.google.common.base.Throwables.lazyStackTraceIsLazy();
}
/**
*public static boolean com.google.common.base.Utf8.isWellFormed(byte[])
*/
public static boolean isWellFormed(byte[] p0){
	return com.google.common.base.Utf8.isWellFormed(p0);
}
/**
*public static boolean com.google.common.base.Utf8.isWellFormed(byte[],int,int)
*/
public static boolean isWellFormed(byte[] p0,int p1,int p2){
	return com.google.common.base.Utf8.isWellFormed(p0,p1,p2);
}
/**
*public static void com.google.common.base.Verify.verify(boolean)
*/
public static void verify(boolean p0){
	 com.google.common.base.Verify.verify(p0);
}
/**
*public static void com.google.common.base.Verify.verify(boolean,java.lang.String,java.lang.Object...)
*/
public static void verify(boolean p0,java.lang.String p1,java.lang.Object... p2){
	 com.google.common.base.Verify.verify(p0,p1,p2);
}
/**
*public static <T> boolean com.google.common.collect.Iterables.all(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*/
public static <T> boolean all(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterables.all(p0,p1);
}
/**
*public static boolean com.google.common.collect.Iterables.contains(java.lang.Iterable<?>,java.lang.Object)
*/
public static boolean contains(java.lang.Iterable<?> p0,java.lang.Object p1){
	return com.google.common.collect.Iterables.contains(p0,p1);
}
/**
*public static boolean com.google.common.collect.Iterables.isEmpty(java.lang.Iterable<?>)
*/
public static boolean isEmpty(java.lang.Iterable<?> p0){
	return com.google.common.collect.Iterables.isEmpty(p0);
}
/**
*public static <T> boolean com.google.common.collect.Iterables.addAll(java.util.Collection<T>,java.lang.Iterable<? extends T>)
*/
public static <T> boolean addAll(java.util.Collection<T> p0,java.lang.Iterable<? extends T> p1){
	return com.google.common.collect.Iterables.addAll(p0,p1);
}
/**
*public static boolean com.google.common.collect.Iterables.removeAll(java.lang.Iterable<?>,java.util.Collection<?>)
*/
public static boolean removeAll(java.lang.Iterable<?> p0,java.util.Collection<?> p1){
	return com.google.common.collect.Iterables.removeAll(p0,p1);
}
/**
*public static <T> boolean com.google.common.collect.Iterables.removeIf(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*/
public static <T> boolean removeIf(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterables.removeIf(p0,p1);
}
/**
*public static boolean com.google.common.collect.Iterables.retainAll(java.lang.Iterable<?>,java.util.Collection<?>)
*/
public static boolean retainAll(java.lang.Iterable<?> p0,java.util.Collection<?> p1){
	return com.google.common.collect.Iterables.retainAll(p0,p1);
}
/**
*public static <T> boolean com.google.common.collect.Iterables.any(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*/
public static <T> boolean any(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterables.any(p0,p1);
}
/**
*public static boolean com.google.common.collect.Iterables.elementsEqual(java.lang.Iterable<?>,java.lang.Iterable<?>)
*/
public static boolean elementsEqual(java.lang.Iterable<?> p0,java.lang.Iterable<?> p1){
	return com.google.common.collect.Iterables.elementsEqual(p0,p1);
}
/**
*public static <T> boolean com.google.common.collect.Iterators.all(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*/
public static <T> boolean all(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.all(p0,p1);
}
/**
*public static boolean com.google.common.collect.Iterators.contains(java.util.Iterator<?>,java.lang.Object)
*/
public static boolean contains(java.util.Iterator<?> p0,java.lang.Object p1){
	return com.google.common.collect.Iterators.contains(p0,p1);
}
/**
*public static <T> boolean com.google.common.collect.Iterators.addAll(java.util.Collection<T>,java.util.Iterator<? extends T>)
*/
public static <T> boolean addAll(java.util.Collection<T> p0,java.util.Iterator<? extends T> p1){
	return com.google.common.collect.Iterators.addAll(p0,p1);
}
/**
*public static boolean com.google.common.collect.Iterators.removeAll(java.util.Iterator<?>,java.util.Collection<?>)
*/
public static boolean removeAll(java.util.Iterator<?> p0,java.util.Collection<?> p1){
	return com.google.common.collect.Iterators.removeAll(p0,p1);
}
/**
*public static <T> boolean com.google.common.collect.Iterators.removeIf(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*/
public static <T> boolean removeIf(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.removeIf(p0,p1);
}
/**
*public static boolean com.google.common.collect.Iterators.retainAll(java.util.Iterator<?>,java.util.Collection<?>)
*/
public static boolean retainAll(java.util.Iterator<?> p0,java.util.Collection<?> p1){
	return com.google.common.collect.Iterators.retainAll(p0,p1);
}
/**
*public static <T> boolean com.google.common.collect.Iterators.any(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*/
public static <T> boolean any(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.any(p0,p1);
}
/**
*public static boolean com.google.common.collect.Iterators.elementsEqual(java.util.Iterator<?>,java.util.Iterator<?>)
*/
public static boolean elementsEqual(java.util.Iterator<?> p0,java.util.Iterator<?> p1){
	return com.google.common.collect.Iterators.elementsEqual(p0,p1);
}
/**
*public static boolean com.google.common.collect.Multisets.removeOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)
*/
public static boolean removeOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1){
	return com.google.common.collect.Multisets.removeOccurrences(p0,p1);
}
/**
*public static boolean com.google.common.collect.Multisets.removeOccurrences(com.google.common.collect.Multiset<?>,java.lang.Iterable<?>)
*/
public static boolean removeOccurrences(com.google.common.collect.Multiset<?> p0,java.lang.Iterable<?> p1){
	return com.google.common.collect.Multisets.removeOccurrences(p0,p1);
}
/**
*public static boolean com.google.common.collect.Multisets.containsOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)
*/
public static boolean containsOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1){
	return com.google.common.collect.Multisets.containsOccurrences(p0,p1);
}
/**
*public static boolean com.google.common.collect.Multisets.retainOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)
*/
public static boolean retainOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1){
	return com.google.common.collect.Multisets.retainOccurrences(p0,p1);
}
/**
*public static void com.google.common.io.Closeables.close(java.io.Closeable,boolean) throws java.io.IOException
*/
public static void close(java.io.Closeable p0,boolean p1) throws java.io.IOException{
	 com.google.common.io.Closeables.close(p0,p1);
}
/**
*public static void com.google.common.io.Flushables.flush(java.io.Flushable,boolean) throws java.io.IOException
*/
public static void flush(java.io.Flushable p0,boolean p1) throws java.io.IOException{
	 com.google.common.io.Flushables.flush(p0,p1);
}
/**
*public static boolean com.google.common.math.BigIntegerMath.isPowerOfTwo(java.math.BigInteger)
*/
public static boolean isPowerOfTwo(java.math.BigInteger p0){
	return com.google.common.math.BigIntegerMath.isPowerOfTwo(p0);
}
/**
*public static boolean com.google.common.math.DoubleMath.isMathematicalInteger(double)
*/
public static boolean isMathematicalInteger(double p0){
	return com.google.common.math.DoubleMath.isMathematicalInteger(p0);
}
/**
*public static boolean com.google.common.math.DoubleMath.isPowerOfTwo(double)
*/
public static boolean isPowerOfTwo(double p0){
	return com.google.common.math.DoubleMath.isPowerOfTwo(p0);
}
/**
*public static boolean com.google.common.math.DoubleMath.fuzzyEquals(double,double,double)
*/
public static boolean fuzzyEquals(double p0,double p1,double p2){
	return com.google.common.math.DoubleMath.fuzzyEquals(p0,p1,p2);
}
/**
*public static boolean com.google.common.math.IntMath.isPowerOfTwo(int)
*/
public static boolean isPowerOfTwo(int p0){
	return com.google.common.math.IntMath.isPowerOfTwo(p0);
}
/**
*public static boolean com.google.common.math.LongMath.isPowerOfTwo(long)
*/
public static boolean isPowerOfTwo(long p0){
	return com.google.common.math.LongMath.isPowerOfTwo(p0);
}
/**
*public static boolean com.google.common.net.HostSpecifier.isValid(java.lang.String)
*/
public static boolean isValid(java.lang.String p0){
	return com.google.common.net.HostSpecifier.isValid(p0);
}
/**
*public static boolean com.google.common.net.InetAddresses.isCompatIPv4Address(java.net.Inet6Address)
*/
public static boolean isCompatIPv4Address(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.isCompatIPv4Address(p0);
}
/**
*public static boolean com.google.common.net.InetAddresses.isMappedIPv4Address(java.lang.String)
*/
public static boolean isMappedIPv4Address(java.lang.String p0){
	return com.google.common.net.InetAddresses.isMappedIPv4Address(p0);
}
/**
*public static boolean com.google.common.net.InetAddresses.hasEmbeddedIPv4ClientAddress(java.net.Inet6Address)
*/
public static boolean hasEmbeddedIPv4ClientAddress(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.hasEmbeddedIPv4ClientAddress(p0);
}
/**
*public static boolean com.google.common.net.InetAddresses.isUriInetAddress(java.lang.String)
*/
public static boolean isUriInetAddress(java.lang.String p0){
	return com.google.common.net.InetAddresses.isUriInetAddress(p0);
}
/**
*public static boolean com.google.common.net.InetAddresses.is6to4Address(java.net.Inet6Address)
*/
public static boolean is6to4Address(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.is6to4Address(p0);
}
/**
*public static boolean com.google.common.net.InetAddresses.isTeredoAddress(java.net.Inet6Address)
*/
public static boolean isTeredoAddress(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.isTeredoAddress(p0);
}
/**
*public static boolean com.google.common.net.InetAddresses.isMaximum(java.net.InetAddress)
*/
public static boolean isMaximum(java.net.InetAddress p0){
	return com.google.common.net.InetAddresses.isMaximum(p0);
}
/**
*public static boolean com.google.common.net.InetAddresses.isIsatapAddress(java.net.Inet6Address)
*/
public static boolean isIsatapAddress(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.isIsatapAddress(p0);
}
/**
*public static boolean com.google.common.net.InetAddresses.isInetAddress(java.lang.String)
*/
public static boolean isInetAddress(java.lang.String p0){
	return com.google.common.net.InetAddresses.isInetAddress(p0);
}
/**
*public static int com.google.common.primitives.Booleans.indexOf(boolean[],boolean)
*/
public static int indexOf(boolean[] p0,boolean p1){
	return com.google.common.primitives.Booleans.indexOf(p0,p1);
}
/**
*public static int com.google.common.primitives.Booleans.compare(boolean,boolean)
*/
public static int compare(boolean p0,boolean p1){
	return com.google.common.primitives.Booleans.compare(p0,p1);
}
/**
*public static boolean com.google.common.primitives.Booleans.contains(boolean[],boolean)
*/
public static boolean contains(boolean[] p0,boolean p1){
	return com.google.common.primitives.Booleans.contains(p0,p1);
}
/**
*public static int com.google.common.primitives.Booleans.lastIndexOf(boolean[],boolean)
*/
public static int lastIndexOf(boolean[] p0,boolean p1){
	return com.google.common.primitives.Booleans.lastIndexOf(p0,p1);
}
/**
*public static boolean com.google.common.primitives.Bytes.contains(byte[],byte)
*/
public static boolean contains(byte[] p0,byte p1){
	return com.google.common.primitives.Bytes.contains(p0,p1);
}
/**
*public static boolean com.google.common.primitives.Chars.contains(char[],char)
*/
public static boolean contains(char[] p0,char p1){
	return com.google.common.primitives.Chars.contains(p0,p1);
}
/**
*public static boolean com.google.common.primitives.Doubles.contains(double[],double)
*/
public static boolean contains(double[] p0,double p1){
	return com.google.common.primitives.Doubles.contains(p0,p1);
}
/**
*public static boolean com.google.common.primitives.Doubles.isFinite(double)
*/
public static boolean isFinite(double p0){
	return com.google.common.primitives.Doubles.isFinite(p0);
}
/**
*public static boolean com.google.common.primitives.Floats.contains(float[],float)
*/
public static boolean contains(float[] p0,float p1){
	return com.google.common.primitives.Floats.contains(p0,p1);
}
/**
*public static boolean com.google.common.primitives.Floats.isFinite(float)
*/
public static boolean isFinite(float p0){
	return com.google.common.primitives.Floats.isFinite(p0);
}
/**
*public static boolean com.google.common.primitives.Ints.contains(int[],int)
*/
public static boolean contains(int[] p0,int p1){
	return com.google.common.primitives.Ints.contains(p0,p1);
}
/**
*public static boolean com.google.common.primitives.Longs.contains(long[],long)
*/
public static boolean contains(long[] p0,long p1){
	return com.google.common.primitives.Longs.contains(p0,p1);
}
/**
*public static boolean com.google.common.primitives.Primitives.isWrapperType(java.lang.Class<?>)
*/
public static boolean isWrapperType(java.lang.Class<?> p0){
	return com.google.common.primitives.Primitives.isWrapperType(p0);
}
/**
*public static boolean com.google.common.primitives.Shorts.contains(short[],short)
*/
public static boolean contains(short[] p0,short p1){
	return com.google.common.primitives.Shorts.contains(p0,p1);
}
/**
*public static void java.lang.reflect.AccessibleObject.setAccessible(java.lang.reflect.AccessibleObject[],boolean) throws java.lang.SecurityException
*/
public static void setAccessible(java.lang.reflect.AccessibleObject[] p0,boolean p1) throws java.lang.SecurityException{
	 java.lang.reflect.AccessibleObject.setAccessible(p0,p1);
}
/**
*public static boolean com.google.common.util.concurrent.MoreExecutors.shutdownAndAwaitTermination(java.util.concurrent.ExecutorService,long,java.util.concurrent.TimeUnit)
*/
public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.MoreExecutors.shutdownAndAwaitTermination(p0,p1,p2);
}
/**
*public static boolean com.google.common.util.concurrent.Uninterruptibles.awaitUninterruptibly(java.util.concurrent.CountDownLatch,long,java.util.concurrent.TimeUnit)
*/
public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.Uninterruptibles.awaitUninterruptibly(p0,p1,p2);
}
/**
*public static boolean com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(java.util.concurrent.Semaphore,long,java.util.concurrent.TimeUnit)
*/
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2);
}
/**
*public static boolean com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(java.util.concurrent.Semaphore,int,long,java.util.concurrent.TimeUnit)
*/
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,int p1,long p2,java.util.concurrent.TimeUnit p3){
	return com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.io.IOUtils.contentEquals(java.io.Reader,java.io.Reader) throws java.io.IOException
*/
public static boolean contentEquals(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.contentEquals(p0,p1);
}
/**
*public static boolean org.apache.commons.io.IOUtils.contentEquals(java.io.InputStream,java.io.InputStream) throws java.io.IOException
*/
public static boolean contentEquals(java.io.InputStream p0,java.io.InputStream p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.contentEquals(p0,p1);
}
/**
*public static boolean org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL(java.io.Reader,java.io.Reader) throws java.io.IOException
*/
public static boolean contentEqualsIgnoreEOL(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL(p0,p1);
}
/**
*public static boolean org.apache.commons.io.TaggedIOException.isTaggedWith(java.lang.Throwable,java.lang.Object)
*/
public static boolean isTaggedWith(java.lang.Throwable p0,java.lang.Object p1){
	return org.apache.commons.io.TaggedIOException.isTaggedWith(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.io.FilenameUtils.normalize(java.lang.String,boolean)
*/
public static java.lang.String normalize(java.lang.String p0,boolean p1){
	return org.apache.commons.io.FilenameUtils.normalize(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FilenameUtils.equalsOnSystem(java.lang.String,java.lang.String)
*/
public static boolean equalsOnSystem(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.equalsOnSystem(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FilenameUtils.isExtension(java.lang.String,java.lang.String)
*/
public static boolean isExtension(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.isExtension(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FilenameUtils.isExtension(java.lang.String,java.lang.String[])
*/
public static boolean isExtension(java.lang.String p0,java.lang.String[] p1){
	return org.apache.commons.io.FilenameUtils.isExtension(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FilenameUtils.isExtension(java.lang.String,java.util.Collection<java.lang.String>)
*/
public static boolean isExtension(java.lang.String p0,java.util.Collection<java.lang.String> p1){
	return org.apache.commons.io.FilenameUtils.isExtension(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FilenameUtils.wildcardMatch(java.lang.String,java.lang.String)
*/
public static boolean wildcardMatch(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.wildcardMatch(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FilenameUtils.wildcardMatch(java.lang.String,java.lang.String,org.apache.commons.io.IOCase)
*/
public static boolean wildcardMatch(java.lang.String p0,java.lang.String p1,org.apache.commons.io.IOCase p2){
	return org.apache.commons.io.FilenameUtils.wildcardMatch(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.io.FilenameUtils.equalsNormalized(java.lang.String,java.lang.String)
*/
public static boolean equalsNormalized(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.equalsNormalized(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem(java.lang.String,java.lang.String)
*/
public static boolean wildcardMatchOnSystem(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FilenameUtils.directoryContains(java.lang.String,java.lang.String) throws java.io.IOException
*/
public static boolean directoryContains(java.lang.String p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.FilenameUtils.directoryContains(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator(java.lang.String,boolean)
*/
public static java.lang.String normalizeNoEndSeparator(java.lang.String p0,boolean p1){
	return org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem(java.lang.String,java.lang.String)
*/
public static boolean equalsNormalizedOnSystem(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem(p0,p1);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean)
*/
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*/
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4,int p5){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4,p5);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,java.nio.charset.Charset,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*/
public static org.apache.commons.io.input.Tailer create(java.io.File p0,java.nio.charset.Charset p1,org.apache.commons.io.input.TailerListener p2,long p3,boolean p4,boolean p5,int p6){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4,p5,p6);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,int)
*/
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,int p4){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean)
*/
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.sizeFileFilter(long,boolean)
*/
public static org.apache.commons.io.filefilter.IOFileFilter sizeFileFilter(long p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.sizeFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(long,boolean)
*/
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(long p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.io.File,boolean)
*/
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.util.Date,boolean)
*/
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.util.Date p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.contentEquals(java.io.File,java.io.File) throws java.io.IOException
*/
public static boolean contentEquals(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.contentEquals(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset,boolean) throws java.io.IOException
*/
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.lang.String,boolean) throws java.io.IOException
*/
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,boolean) throws java.io.IOException
*/
public static void write(java.io.File p0,java.lang.CharSequence p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,java.lang.String[],boolean)
*/
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>,boolean) throws java.io.IOException
*/
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>,java.lang.String,boolean) throws java.io.IOException
*/
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>,boolean) throws java.io.IOException
*/
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String,boolean) throws java.io.IOException
*/
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3,boolean p4) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3,p4);
}
/**
*public static boolean org.apache.commons.io.FileUtils.waitFor(java.io.File,int)
*/
public static boolean waitFor(java.io.File p0,int p1){
	return org.apache.commons.io.FileUtils.waitFor(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(java.io.File,java.io.File,java.lang.String) throws java.io.IOException
*/
public static boolean contentEqualsIgnoreEOL(java.io.File p0,java.io.File p1,java.lang.String p2) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(p0,p1,p2);
}
/**
*public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,java.lang.String[],boolean)
*/
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.File,boolean) throws java.io.IOException
*/
public static void copyFile(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyFile(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean) throws java.io.IOException
*/
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*/
public static void copyDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2);
}
/**
*public static java.io.FileOutputStream org.apache.commons.io.FileUtils.openOutputStream(java.io.File,boolean) throws java.io.IOException
*/
public static java.io.FileOutputStream openOutputStream(java.io.File p0,boolean p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.openOutputStream(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.moveToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*/
public static void moveToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveToDirectory(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isSymlink(java.io.File) throws java.io.IOException
*/
public static boolean isSymlink(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.isSymlink(p0);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.io.File)
*/
public static boolean isFileOlder(java.io.File p0,java.io.File p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,long)
*/
public static boolean isFileOlder(java.io.File p0,long p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.util.Date)
*/
public static boolean isFileOlder(java.io.File p0,java.util.Date p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.util.Date)
*/
public static boolean isFileNewer(java.io.File p0,java.util.Date p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,long)
*/
public static boolean isFileNewer(java.io.File p0,long p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.io.File)
*/
public static boolean isFileNewer(java.io.File p0,java.io.File p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.copyFileToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*/
public static void copyFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyFileToDirectory(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.moveDirectoryToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*/
public static void moveDirectoryToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveDirectoryToDirectory(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],int,int,boolean) throws java.io.IOException
*/
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3,boolean p4) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1,p2,p3,p4);
}
/**
*public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],boolean) throws java.io.IOException
*/
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.moveFileToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*/
public static void moveFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveFileToDirectory(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset,boolean) throws java.io.IOException
*/
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,boolean) throws java.io.IOException
*/
public static void writeStringToFile(java.io.File p0,java.lang.String p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*/
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.io.FileUtils.directoryContains(java.io.File,java.io.File) throws java.io.IOException
*/
public static boolean directoryContains(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.directoryContains(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.deleteQuietly(java.io.File)
*/
public static boolean deleteQuietly(java.io.File p0){
	return org.apache.commons.io.FileUtils.deleteQuietly(p0);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.isEmpty(java.util.Collection)
*/
/*public static boolean isEmpty(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isEmpty(p0);
}*/
/**
*public static boolean org.apache.commons.collections.CollectionUtils.exists(java.util.Collection,org.apache.commons.collections.Predicate)
*/
public static boolean exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.exists(p0,p1);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.isNotEmpty(java.util.Collection)
*//*
public static boolean isNotEmpty(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isNotEmpty(p0);
}
*//**
*public static boolean org.apache.commons.collections.CollectionUtils.containsAny(java.util.Collection,java.util.Collection)
*//*
public static boolean containsAny(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.containsAny(p0,p1);
}
*//**
*public static boolean org.apache.commons.collections.CollectionUtils.isFull(java.util.Collection)
*//*
public static boolean isFull(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isFull(p0);
}
*//**
*public static boolean org.apache.commons.collections.CollectionUtils.isEqualCollection(java.util.Collection,java.util.Collection)
*//*
public static boolean isEqualCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isEqualCollection(p0,p1);
}
*//**
*public static boolean org.apache.commons.collections.CollectionUtils.isProperSubCollection(java.util.Collection,java.util.Collection)
*//*
public static boolean isProperSubCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isProperSubCollection(p0,p1);
}
*//**
*public static boolean org.apache.commons.collections.CollectionUtils.addIgnoreNull(java.util.Collection,java.lang.Object)
*//*
public static boolean addIgnoreNull(java.util.Collection p0,java.lang.Object p1){
	return org.apache.commons.collections.CollectionUtils.addIgnoreNull(p0,p1);
}*/
/**
*public static boolean org.apache.commons.collections.CollectionUtils.sizeIsEmpty(java.lang.Object)
*/
public static boolean sizeIsEmpty(java.lang.Object p0){
	return org.apache.commons.collections.CollectionUtils.sizeIsEmpty(p0);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.isSubCollection(java.util.Collection,java.util.Collection)
*/
public static boolean isSubCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isSubCollection(p0,p1);
}
/**
*public static boolean org.apache.commons.collections.MapUtils.isEmpty(java.util.Map)
*/
public static boolean isEmpty(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.collections.MapUtils.isNotEmpty(java.util.Map)
*/
public static boolean isNotEmpty(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.collections.MapUtils.getBooleanValue(java.util.Map,java.lang.Object)
*/
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getBooleanValue(p0,p1);
}
/**
*public static boolean org.apache.commons.collections.MapUtils.getBooleanValue(java.util.Map,java.lang.Object,boolean)
*/
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1,boolean p2){
	return org.apache.commons.collections.MapUtils.getBooleanValue(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.collections.SetUtils.isEqualSet(java.util.Collection,java.util.Collection)
*/
public static boolean isEqualSet(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.SetUtils.isEqualSet(p0,p1);
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.booleanComparator(boolean)
*/
public static java.util.Comparator booleanComparator(boolean p0){
	return org.apache.commons.collections.ComparatorUtils.booleanComparator(p0);
}
/**
*public static org.apache.commons.collections.comparators.BooleanComparator org.apache.commons.collections.comparators.BooleanComparator.getBooleanComparator(boolean)
*/
public static org.apache.commons.collections.comparators.BooleanComparator getBooleanComparator(boolean p0){
	return org.apache.commons.collections.comparators.BooleanComparator.getBooleanComparator(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.WhileClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,boolean)
*/
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,boolean p2){
	return org.apache.commons.collections.functors.WhileClosure.getInstance(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.collections.ListUtils.isEqualList(java.util.Collection,java.util.Collection)
*/
public static boolean isEqualList(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.ListUtils.isEqualList(p0,p1);
}
/**
*public static boolean org.apache.commons.collections4.CollectionUtils.isEmpty(java.util.Collection<?>)
*/
public static boolean isEmpty(java.util.Collection<?> p0){
	return org.apache.commons.collections4.CollectionUtils.isEmpty(p0);
}
/**
*public static <C> boolean org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection<C>,java.lang.Iterable<? extends C>)
*/
public static <C> boolean addAll(java.util.Collection<C> p0,java.lang.Iterable<? extends C> p1){
	return org.apache.commons.collections4.CollectionUtils.addAll(p0,p1);
}
/**
*public static <C> boolean org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection<C>,java.util.Iterator<? extends C>)
*/
public static <C> boolean addAll(java.util.Collection<C> p0,java.util.Iterator<? extends C> p1){
	return org.apache.commons.collections4.CollectionUtils.addAll(p0,p1);
}
/**
*public static <C> boolean org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection<C>,java.util.Enumeration<? extends C>)
*/
public static <C> boolean addAll(java.util.Collection<C> p0,java.util.Enumeration<? extends C> p1){
	return org.apache.commons.collections4.CollectionUtils.addAll(p0,p1);
}
/**
*public static <C> boolean org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection<C>,C[])
*/
public static <C> boolean addAll(java.util.Collection<C> p0,C[] p1){
	return org.apache.commons.collections4.CollectionUtils.addAll(p0,p1);
}
/**
*public static <C> boolean org.apache.commons.collections4.CollectionUtils.exists(java.lang.Iterable<C>,org.apache.commons.collections4.Predicate<? super C>)
*/
public static <C> boolean exists(java.lang.Iterable<C> p0,org.apache.commons.collections4.Predicate<? super C> p1){
	return org.apache.commons.collections4.CollectionUtils.exists(p0,p1);
}
/**
*public static boolean org.apache.commons.collections4.CollectionUtils.containsAll(java.util.Collection<?>,java.util.Collection<?>)
*/
public static boolean containsAll(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.containsAll(p0,p1);
}
/**
*public static <T> boolean org.apache.commons.collections4.CollectionUtils.filter(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)
*/
public static <T> boolean filter(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.CollectionUtils.filter(p0,p1);
}
/**
*public static boolean org.apache.commons.collections4.CollectionUtils.isNotEmpty(java.util.Collection<?>)
*/
public static boolean isNotEmpty(java.util.Collection<?> p0){
	return org.apache.commons.collections4.CollectionUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.collections4.CollectionUtils.containsAny(java.util.Collection<?>,java.util.Collection<?>)
*/
public static boolean containsAny(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.containsAny(p0,p1);
}
/**
*public static boolean org.apache.commons.collections4.CollectionUtils.isFull(java.util.Collection<?>)
*/
public static boolean isFull(java.util.Collection<?> p0){
	return org.apache.commons.collections4.CollectionUtils.isFull(p0);
}
/**
*public static boolean org.apache.commons.collections4.CollectionUtils.isEqualCollection(java.util.Collection<?>,java.util.Collection<?>)
*/
public static boolean isEqualCollection(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.isEqualCollection(p0,p1);
}
/**
*public static <E> boolean org.apache.commons.collections4.CollectionUtils.isEqualCollection(java.util.Collection<? extends E>,java.util.Collection<? extends E>,org.apache.commons.collections4.Equator<? super E>)
*/
public static <E> boolean isEqualCollection(java.util.Collection<? extends E> p0,java.util.Collection<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2){
	return org.apache.commons.collections4.CollectionUtils.isEqualCollection(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.collections4.CollectionUtils.isProperSubCollection(java.util.Collection<?>,java.util.Collection<?>)
*/
public static boolean isProperSubCollection(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.isProperSubCollection(p0,p1);
}
/**
*public static <O> java.util.List<O> org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,java.util.Comparator<? super O>,boolean)
*/
public static <O> java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,java.util.Comparator<? super O> p2,boolean p3){
	return org.apache.commons.collections4.CollectionUtils.collate(p0,p1,p2,p3);
}
/**
*public static <O> java.util.List<O> org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,boolean)
*/
public static <O extends java.lang.Comparable<? super O> > java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,boolean p2){
	return org.apache.commons.collections4.CollectionUtils.collate(p0,p1,p2);
}
/**
*public static <C> boolean org.apache.commons.collections4.CollectionUtils.matchesAll(java.lang.Iterable<C>,org.apache.commons.collections4.Predicate<? super C>)
*/
public static <C> boolean matchesAll(java.lang.Iterable<C> p0,org.apache.commons.collections4.Predicate<? super C> p1){
	return org.apache.commons.collections4.CollectionUtils.matchesAll(p0,p1);
}
/**
*public static <T> boolean org.apache.commons.collections4.CollectionUtils.filterInverse(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)
*/
public static <T> boolean filterInverse(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.CollectionUtils.filterInverse(p0,p1);
}
/**
*public static <T> boolean org.apache.commons.collections4.CollectionUtils.addIgnoreNull(java.util.Collection<T>,T)
*/
public static <T> boolean addIgnoreNull(java.util.Collection<T> p0,T p1){
	return org.apache.commons.collections4.CollectionUtils.addIgnoreNull(p0,p1);
}
/**
*public static boolean org.apache.commons.collections4.CollectionUtils.isSubCollection(java.util.Collection<?>,java.util.Collection<?>)
*/
public static boolean isSubCollection(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.isSubCollection(p0,p1);
}
/**
*public static boolean org.apache.commons.collections4.MapUtils.isEmpty(java.util.Map<?, ?>)
*/
public static boolean isEmpty(java.util.Map<?, ?> p0){
	return org.apache.commons.collections4.MapUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.collections4.MapUtils.isNotEmpty(java.util.Map<?, ?>)
*/
public static boolean isNotEmpty(java.util.Map<?, ?> p0){
	return org.apache.commons.collections4.MapUtils.isNotEmpty(p0);
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
*public static <E> boolean org.apache.commons.collections4.IteratorUtils.contains(java.util.Iterator<E>,java.lang.Object)
*/
public static <E> boolean contains(java.util.Iterator<E> p0,java.lang.Object p1){
	return org.apache.commons.collections4.IteratorUtils.contains(p0,p1);
}
/**
*public static boolean org.apache.commons.collections4.IteratorUtils.isEmpty(java.util.Iterator<?>)
*/
public static boolean isEmpty(java.util.Iterator<?> p0){
	return org.apache.commons.collections4.IteratorUtils.isEmpty(p0);
}
/**
*public static <E> boolean org.apache.commons.collections4.IteratorUtils.matchesAny(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)
*/
public static <E> boolean matchesAny(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.matchesAny(p0,p1);
}
/**
*public static <E> boolean org.apache.commons.collections4.IteratorUtils.matchesAll(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)
*/
public static <E> boolean matchesAll(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.matchesAll(p0,p1);
}
/**
*public static boolean org.apache.commons.collections4.SetUtils.isEqualSet(java.util.Collection<?>,java.util.Collection<?>)
*/
public static boolean isEqualSet(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.SetUtils.isEqualSet(p0,p1);
}
/**
*public static boolean org.apache.commons.collections4.MultiMapUtils.isEmpty(org.apache.commons.collections4.MultiValuedMap<?, ?>)
*/
public static boolean isEmpty(org.apache.commons.collections4.MultiValuedMap<?, ?> p0){
	return org.apache.commons.collections4.MultiMapUtils.isEmpty(p0);
}
/**
*public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.functors.WhileClosure.whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,boolean)
*/
public static <E> org.apache.commons.collections4.Closure<E> whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,boolean p2){
	return org.apache.commons.collections4.functors.WhileClosure.whileClosure(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.collections4.ListUtils.isEqualList(java.util.Collection<?>,java.util.Collection<?>)
*/
public static boolean isEqualList(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.ListUtils.isEqualList(p0,p1);
}
/**
*public static <E> boolean org.apache.commons.collections4.IterableUtils.contains(java.lang.Iterable<? extends E>,E,org.apache.commons.collections4.Equator<? super E>)
*/
public static <E> boolean contains(java.lang.Iterable<? extends E> p0,E p1,org.apache.commons.collections4.Equator<? super E> p2){
	return org.apache.commons.collections4.IterableUtils.contains(p0,p1,p2);
}
/**
*public static <E> boolean org.apache.commons.collections4.IterableUtils.contains(java.lang.Iterable<E>,java.lang.Object)
*/
public static <E> boolean contains(java.lang.Iterable<E> p0,java.lang.Object p1){
	return org.apache.commons.collections4.IterableUtils.contains(p0,p1);
}
/**
*public static <E> boolean org.apache.commons.collections4.IterableUtils.matchesAny(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)
*/
public static <E> boolean matchesAny(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IterableUtils.matchesAny(p0,p1);
}
/**
*public static <E> boolean org.apache.commons.collections4.IterableUtils.matchesAll(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)
*/
public static <E> boolean matchesAll(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IterableUtils.matchesAll(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(java.lang.Class<?>)
*/
public static boolean isValidAnnotationMemberType(java.lang.Class<?> p0){
	return org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(p0);
}
/**
*public static boolean[] org.apache.commons.lang3.ArrayUtils.add(boolean[],int,boolean)
*/
public static boolean[] add(boolean[] p0,int p1,boolean p2){
	return org.apache.commons.lang3.ArrayUtils.add(p0,p1,p2);
}
/**
*public static boolean[] org.apache.commons.lang3.ArrayUtils.add(boolean[],boolean)
*/
public static boolean[] add(boolean[] p0,boolean p1){
	return org.apache.commons.lang3.ArrayUtils.add(p0,p1);
}
/**
*public static int org.apache.commons.lang3.ArrayUtils.indexOf(boolean[],boolean,int)
*/
public static int indexOf(boolean[] p0,boolean p1,int p2){
	return org.apache.commons.lang3.ArrayUtils.indexOf(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.contains(java.lang.Object[],java.lang.Object)
*/
public static boolean contains(java.lang.Object[] p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.contains(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.contains(double[],double,double)
*/
public static boolean contains(double[] p0,double p1,double p2){
	return org.apache.commons.lang3.ArrayUtils.contains(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(double[])
*/
public static boolean isEmpty(double[] p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(int[])
*/
public static boolean isEmpty(int[] p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(byte[])
*/
public static boolean isEmpty(byte[] p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(char[])
*/
public static boolean isEmpty(char[] p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(java.lang.Object[])
*/
public static boolean isEmpty(java.lang.Object[] p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(long[])
*/
public static boolean isEmpty(long[] p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(short[])
*/
public static boolean isEmpty(short[] p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(boolean[])
*/
public static boolean isEmpty(boolean[] p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(float[])
*/
public static boolean isEmpty(float[] p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*public static int org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[],boolean,int)
*/
public static int lastIndexOf(boolean[] p0,boolean p1,int p2){
	return org.apache.commons.lang3.ArrayUtils.lastIndexOf(p0,p1,p2);
}
/**
*public static boolean[] org.apache.commons.lang3.ArrayUtils.removeElement(boolean[],boolean)
*/
public static boolean[] removeElement(boolean[] p0,boolean p1){
	return org.apache.commons.lang3.ArrayUtils.removeElement(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(short[])
*/
public static boolean isNotEmpty(short[] p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(char[])
*/
public static boolean isNotEmpty(char[] p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(int[])
*/
public static boolean isNotEmpty(int[] p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(boolean[])
*/
public static boolean isNotEmpty(boolean[] p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(float[])
*/
public static boolean isNotEmpty(float[] p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(double[])
*/
public static boolean isNotEmpty(double[] p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(byte[])
*/
public static boolean isNotEmpty(byte[] p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(long[])
*/
public static boolean isNotEmpty(long[] p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*public static <T> boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(T[])
*/
public static <T> boolean isNotEmpty(T[] p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSameType(java.lang.Object,java.lang.Object)
*/
public static boolean isSameType(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.isSameType(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isEquals(java.lang.Object,java.lang.Object)
*/
public static boolean isEquals(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.isEquals(p0,p1);
}
/**
*public static boolean[] org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[],boolean)
*/
public static boolean[] toPrimitive(java.lang.Boolean[] p0,boolean p1){
	return org.apache.commons.lang3.ArrayUtils.toPrimitive(p0,p1);
}
/**
*public static <T> boolean org.apache.commons.lang3.ArrayUtils.isSorted(T[],java.util.Comparator<T>)
*/
public static <T> boolean isSorted(T[] p0,java.util.Comparator<T> p1){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(float[])
*/
public static boolean isSorted(float[] p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(double[])
*/
public static boolean isSorted(double[] p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(char[])
*/
public static boolean isSorted(char[] p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(boolean[])
*/
public static boolean isSorted(boolean[] p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*public static <T> boolean org.apache.commons.lang3.ArrayUtils.isSorted(T[])
*/
public static <T extends java.lang.Comparable<? super T> > boolean isSorted(T[] p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(int[])
*/
public static boolean isSorted(int[] p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(long[])
*/
public static boolean isSorted(long[] p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(short[])
*/
public static boolean isSorted(short[] p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(byte[])
*/
public static boolean isSorted(byte[] p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(boolean[],boolean[])
*/
public static boolean isSameLength(boolean[] p0,boolean[] p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(float[],float[])
*/
public static boolean isSameLength(float[] p0,float[] p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(java.lang.Object[],java.lang.Object[])
*/
public static boolean isSameLength(java.lang.Object[] p0,java.lang.Object[] p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(long[],long[])
*/
public static boolean isSameLength(long[] p0,long[] p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(int[],int[])
*/
public static boolean isSameLength(int[] p0,int[] p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(short[],short[])
*/
public static boolean isSameLength(short[] p0,short[] p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(double[],double[])
*/
public static boolean isSameLength(double[] p0,double[] p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(byte[],byte[])
*/
public static boolean isSameLength(byte[] p0,byte[] p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(char[],char[])
*/
public static boolean isSameLength(char[] p0,char[] p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.and(boolean...)
*/
public static boolean and(boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.and(p0);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.or(boolean...)
*/
public static boolean or(boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.or(p0);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.xor(boolean...)
*/
public static boolean xor(boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.xor(p0);
}
/**
*public static int org.apache.commons.lang3.BooleanUtils.toInteger(boolean)
*/
public static int toInteger(boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toInteger(p0);
}
/**
*public static int org.apache.commons.lang3.BooleanUtils.toInteger(boolean,int,int)
*/
public static int toInteger(boolean p0,int p1,int p2){
	return org.apache.commons.lang3.BooleanUtils.toInteger(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.String,java.lang.String,java.lang.String)
*/
public static boolean toBoolean(java.lang.String p0,java.lang.String p1,java.lang.String p2){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(int)
*/
public static boolean toBoolean(int p0){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(int,int,int)
*/
public static boolean toBoolean(int p0,int p1,int p2){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.Integer,java.lang.Integer,java.lang.Integer)
*/
public static boolean toBoolean(java.lang.Integer p0,java.lang.Integer p1,java.lang.Integer p2){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.String)
*/
public static boolean toBoolean(java.lang.String p0){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0);
}
/**
*public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringYesNo(boolean)
*/
public static java.lang.String toStringYesNo(boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringYesNo(p0);
}
/**
*public static java.lang.Integer org.apache.commons.lang3.BooleanUtils.toIntegerObject(boolean)
*/
public static java.lang.Integer toIntegerObject(boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toIntegerObject(p0);
}
/**
*public static java.lang.Integer org.apache.commons.lang3.BooleanUtils.toIntegerObject(boolean,java.lang.Integer,java.lang.Integer)
*/
public static java.lang.Integer toIntegerObject(boolean p0,java.lang.Integer p1,java.lang.Integer p2){
	return org.apache.commons.lang3.BooleanUtils.toIntegerObject(p0,p1,p2);
}
/**
*public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringOnOff(boolean)
*/
public static java.lang.String toStringOnOff(boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringOnOff(p0);
}
/**
*public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(boolean)
*/
public static java.lang.String toStringTrueFalse(boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(p0);
}
/**
*public static int org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)
*/
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
	return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}
/**
*public static int org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,boolean)
*/
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2){
	return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,java.util.Collection<java.lang.String>)
*/
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)
*/
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4);
}
/**
*public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,boolean)
*/
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,java.lang.String...)
*/
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int,int,java.lang.Object,boolean)
*/
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3);
}
/**
*public static int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object,boolean)
*/
public static int reflectionHashCode(java.lang.Object p0,boolean p1){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1);
}
/**
*public static <T> int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int,int,T,boolean,java.lang.Class<? super T>,java.lang.String...)
*/
public static <T> int reflectionHashCode(int p0,int p1,T p2,boolean p3,java.lang.Class<? super T> p4,java.lang.String... p5){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}
/**
*public static <T> java.lang.String org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(T,org.apache.commons.lang3.builder.ToStringStyle,boolean,java.lang.Class<? super T>)
*/
public static <T> java.lang.String reflectionToString(T p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2,java.lang.Class<? super T> p3){
	return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
/**
*public static java.lang.String org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(java.lang.Object,org.apache.commons.lang3.builder.ToStringStyle,boolean)
*/
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2){
	return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.CharEncoding.isSupported(java.lang.String)
*/
public static boolean isSupported(java.lang.String p0){
	return org.apache.commons.lang3.CharEncoding.isSupported(p0);
}
/**
*public static boolean org.apache.commons.lang3.CharSetUtils.containsAny(java.lang.String,java.lang.String...)
*/
public static boolean containsAny(java.lang.String p0,java.lang.String... p1){
	return org.apache.commons.lang3.CharSetUtils.containsAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.CharUtils.isAscii(char)
*/
public static boolean isAscii(char p0){
	return org.apache.commons.lang3.CharUtils.isAscii(p0);
}
/**
*public static boolean org.apache.commons.lang3.CharUtils.isAsciiPrintable(char)
*/
public static boolean isAsciiPrintable(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiPrintable(p0);
}
/**
*public static boolean org.apache.commons.lang3.CharUtils.isAsciiControl(char)
*/
public static boolean isAsciiControl(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiControl(p0);
}
/**
*public static boolean org.apache.commons.lang3.CharUtils.isAsciiNumeric(char)
*/
public static boolean isAsciiNumeric(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiNumeric(p0);
}
/**
*public static boolean org.apache.commons.lang3.CharUtils.isAsciiAlpha(char)
*/
public static boolean isAsciiAlpha(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiAlpha(p0);
}
/**
*public static boolean org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper(char)
*/
public static boolean isAsciiAlphaUpper(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper(p0);
}
/**
*public static boolean org.apache.commons.lang3.CharUtils.isAsciiAlphaLower(char)
*/
public static boolean isAsciiAlphaLower(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiAlphaLower(p0);
}
/**
*public static boolean org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric(char)
*/
public static boolean isAsciiAlphanumeric(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric(p0);
}
/**
*public static boolean org.apache.commons.lang3.ClassUtils.isInnerClass(java.lang.Class<?>)
*/
public static boolean isInnerClass(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.isInnerClass(p0);
}
/**
*public static boolean org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class<?>,java.lang.Class<?>)
*/
public static boolean isAssignable(java.lang.Class<?> p0,java.lang.Class<?> p1){
	return org.apache.commons.lang3.ClassUtils.isAssignable(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class<?>,java.lang.Class<?>,boolean)
*/
public static boolean isAssignable(java.lang.Class<?> p0,java.lang.Class<?> p1,boolean p2){
	return org.apache.commons.lang3.ClassUtils.isAssignable(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class<?>[],java.lang.Class<?>[],boolean)
*/
public static boolean isAssignable(java.lang.Class<?>[] p0,java.lang.Class<?>[] p1,boolean p2){
	return org.apache.commons.lang3.ClassUtils.isAssignable(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class<?>[],java.lang.Class<?>...)
*/
public static boolean isAssignable(java.lang.Class<?>[] p0,java.lang.Class<?>... p1){
	return org.apache.commons.lang3.ClassUtils.isAssignable(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.ClassUtils.isPrimitiveWrapper(java.lang.Class<?>)
*/
public static boolean isPrimitiveWrapper(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.isPrimitiveWrapper(p0);
}
/**
*public static boolean org.apache.commons.lang3.ClassUtils.isPrimitiveOrWrapper(java.lang.Class<?>)
*/
public static boolean isPrimitiveOrWrapper(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.isPrimitiveOrWrapper(p0);
}
/**
*public static <E> boolean org.apache.commons.lang3.EnumUtils.isValidEnum(java.lang.Class<E>,java.lang.String)
*/
public static <E extends java.lang.Enum<E> > boolean isValidEnum(java.lang.Class<E> p0,java.lang.String p1){
	return org.apache.commons.lang3.EnumUtils.isValidEnum(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.LocaleUtils.isAvailableLocale(java.util.Locale)
*/
public static boolean isAvailableLocale(java.util.Locale p0){
	return org.apache.commons.lang3.LocaleUtils.isAvailableLocale(p0);
}
/**
*public static boolean org.apache.commons.lang3.math.NumberUtils.isNumber(java.lang.String)
*/
public static boolean isNumber(java.lang.String p0){
	return org.apache.commons.lang3.math.NumberUtils.isNumber(p0);
}
/**
*public static boolean org.apache.commons.lang3.math.NumberUtils.isDigits(java.lang.String)
*/
public static boolean isDigits(java.lang.String p0){
	return org.apache.commons.lang3.math.NumberUtils.isDigits(p0);
}
/**
*public static boolean org.apache.commons.lang3.math.NumberUtils.isParsable(java.lang.String)
*/
public static boolean isParsable(java.lang.String p0){
	return org.apache.commons.lang3.math.NumberUtils.isParsable(p0);
}
/**
*public static <T> int org.apache.commons.lang3.ObjectUtils.compare(T,T,boolean)
*/
public static <T extends java.lang.Comparable<? super T> > int compare(T p0,T p1,boolean p2){
	return org.apache.commons.lang3.ObjectUtils.compare(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.ObjectUtils.CONST(boolean)
*/
public static boolean CONST(boolean p0){
	return org.apache.commons.lang3.ObjectUtils.CONST(p0);
}
/**
*public static boolean org.apache.commons.lang3.ObjectUtils.notEqual(java.lang.Object,java.lang.Object)
*/
public static boolean notEqual(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang3.ObjectUtils.notEqual(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.lang3.RandomStringUtils.random(int,boolean,boolean)
*/
public static java.lang.String random(int p0,boolean p1,boolean p2){
	return org.apache.commons.lang3.RandomStringUtils.random(p0,p1,p2);
}
/**
*public static java.lang.String org.apache.commons.lang3.RandomStringUtils.random(int,int,int,boolean,boolean,char...)
*/
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char... p5){
	return org.apache.commons.lang3.RandomStringUtils.random(p0,p1,p2,p3,p4,p5);
}
/**
*public static java.lang.String org.apache.commons.lang3.RandomStringUtils.random(int,int,int,boolean,boolean,char[],java.util.Random)
*/
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5,java.util.Random p6){
	return org.apache.commons.lang3.RandomStringUtils.random(p0,p1,p2,p3,p4,p5,p6);
}
/**
*public static java.lang.String org.apache.commons.lang3.RandomStringUtils.random(int,int,int,boolean,boolean)
*/
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4){
	return org.apache.commons.lang3.RandomStringUtils.random(p0,p1,p2,p3,p4);
}
/**
*public static java.lang.reflect.Field org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class<?>,java.lang.String,boolean)
*/
public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(p0,p1,p2);
}
/**
*public static java.lang.reflect.Field org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class<?>,java.lang.String,boolean)
*/
public static java.lang.reflect.Field getField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang3.reflect.FieldUtils.getField(p0,p1,p2);
}
/**
*public static void org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*/
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*/
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(p0,p1,p2);
}
/**
*public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class<?>,java.lang.String,boolean) throws java.lang.IllegalAccessException
*/
public static java.lang.Object readStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readStaticField(p0,p1,p2);
}
/**
*public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field,boolean) throws java.lang.IllegalAccessException
*/
public static java.lang.Object readStaticField(java.lang.reflect.Field p0,boolean p1) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readStaticField(p0,p1);
}
/**
*public static void org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*/
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeField(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*/
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeField(p0,p1,p2,p3);
}
/**
*public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.Object,java.lang.String,boolean) throws java.lang.IllegalAccessException
*/
public static java.lang.Object readField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readField(p0,p1,p2);
}
/**
*public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*/
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readField(p0,p1,p2);
}
/**
*public static void org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*/
public static void writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.lang3.reflect.FieldUtils.removeFinalModifier(java.lang.reflect.Field,boolean)
*/
public static void removeFinalModifier(java.lang.reflect.Field p0,boolean p1){
	 org.apache.commons.lang3.reflect.FieldUtils.removeFinalModifier(p0,p1);
}
/**
*public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class<?>,java.lang.String,boolean) throws java.lang.IllegalAccessException
*/
public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(p0,p1,p2);
}
/**
*public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(java.lang.Object,java.lang.String,boolean) throws java.lang.IllegalAccessException
*/
public static java.lang.Object readDeclaredField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(p0,p1,p2);
}
/**
*public static void org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*/
public static void writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.lang3.reflect.TypeUtils.isInstance(java.lang.Object,java.lang.reflect.Type)
*/
public static boolean isInstance(java.lang.Object p0,java.lang.reflect.Type p1){
	return org.apache.commons.lang3.reflect.TypeUtils.isInstance(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.reflect.TypeUtils.isArrayType(java.lang.reflect.Type)
*/
public static boolean isArrayType(java.lang.reflect.Type p0){
	return org.apache.commons.lang3.reflect.TypeUtils.isArrayType(p0);
}
/**
*public static boolean org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type,java.lang.reflect.Type)
*/
public static boolean isAssignable(java.lang.reflect.Type p0,java.lang.reflect.Type p1){
	return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(java.lang.reflect.Type)
*/
public static boolean containsTypeVariables(java.lang.reflect.Type p0){
	return org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(p0);
}
/**
*public static boolean org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>)
*/
public static boolean typesSatisfyVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p0){
	return org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence,int)
*/
public static boolean contains(java.lang.CharSequence p0,int p1){
	return org.apache.commons.lang3.StringUtils.contains(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence,java.lang.CharSequence)
*/
public static boolean contains(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.contains(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.endsWith(java.lang.CharSequence,java.lang.CharSequence)
*/
public static boolean endsWith(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.endsWith(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isEmpty(java.lang.CharSequence)
*/
public static boolean isEmpty(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.startsWith(java.lang.CharSequence,java.lang.CharSequence)
*/
public static boolean startsWith(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.startsWith(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isWhitespace(java.lang.CharSequence)
*/
public static boolean isWhitespace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isWhitespace(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAlpha(java.lang.CharSequence)
*/
public static boolean isAlpha(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlpha(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isNumeric(java.lang.CharSequence)
*/
public static boolean isNumeric(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNumeric(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAlphanumericSpace(java.lang.CharSequence)
*/
public static boolean isAlphanumericSpace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlphanumericSpace(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*/
public static boolean containsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.containsIgnoreCase(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsWhitespace(java.lang.CharSequence)
*/
public static boolean containsWhitespace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.containsWhitespace(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isBlank(java.lang.CharSequence)
*/
public static boolean isBlank(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isBlank(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAnyBlank(java.lang.CharSequence...)
*/
public static boolean isAnyBlank(java.lang.CharSequence... p0){
	return org.apache.commons.lang3.StringUtils.isAnyBlank(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isNotEmpty(java.lang.CharSequence)
*/
public static boolean isNotEmpty(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isNotBlank(java.lang.CharSequence)
*/
public static boolean isNotBlank(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNotBlank(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isNoneBlank(java.lang.CharSequence...)
*/
public static boolean isNoneBlank(java.lang.CharSequence... p0){
	return org.apache.commons.lang3.StringUtils.isNoneBlank(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAnyEmpty(java.lang.CharSequence...)
*/
public static boolean isAnyEmpty(java.lang.CharSequence... p0){
	return org.apache.commons.lang3.StringUtils.isAnyEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isNoneEmpty(java.lang.CharSequence...)
*/
public static boolean isNoneEmpty(java.lang.CharSequence... p0){
	return org.apache.commons.lang3.StringUtils.isNoneEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence,char...)
*/
public static boolean containsOnly(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.containsOnly(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence,java.lang.String)
*/
public static boolean containsOnly(java.lang.CharSequence p0,java.lang.String p1){
	return org.apache.commons.lang3.StringUtils.containsOnly(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence,java.lang.String)
*/
public static boolean containsNone(java.lang.CharSequence p0,java.lang.String p1){
	return org.apache.commons.lang3.StringUtils.containsNone(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence,char...)
*/
public static boolean containsNone(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.containsNone(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence,java.lang.CharSequence...)
*/
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.containsAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence,java.lang.CharSequence)
*/
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.containsAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence,char...)
*/
public static boolean containsAny(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.containsAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAllLowerCase(java.lang.CharSequence)
*/
public static boolean isAllLowerCase(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAllLowerCase(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAsciiPrintable(java.lang.CharSequence)
*/
public static boolean isAsciiPrintable(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAsciiPrintable(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAlphanumeric(java.lang.CharSequence)
*/
public static boolean isAlphanumeric(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlphanumeric(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAllUpperCase(java.lang.CharSequence)
*/
public static boolean isAllUpperCase(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAllUpperCase(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isNumericSpace(java.lang.CharSequence)
*/
public static boolean isNumericSpace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNumericSpace(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAlphaSpace(java.lang.CharSequence)
*/
public static boolean isAlphaSpace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlphaSpace(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.startsWithAny(java.lang.CharSequence,java.lang.CharSequence...)
*/
public static boolean startsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.startsWithAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.endsWithAny(java.lang.CharSequence,java.lang.CharSequence...)
*/
public static boolean endsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.endsWithAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*/
public static boolean startsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*/
public static boolean endsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion)
*/
public static boolean isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion p0){
	return org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(p0);
}
/**
*public static boolean org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless()
*/
public static boolean isJavaAwtHeadless(){
	return org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless();
}
/**
*public static java.lang.String org.apache.commons.lang3.text.WordUtils.wrap(java.lang.String,int,java.lang.String,boolean)
*/
public static java.lang.String wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3){
	return org.apache.commons.lang3.text.WordUtils.wrap(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Date,java.util.Date)
*/
public static boolean isSameDay(java.util.Date p0,java.util.Date p1){
	return org.apache.commons.lang3.time.DateUtils.isSameDay(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Calendar,java.util.Calendar)
*/
public static boolean isSameDay(java.util.Calendar p0,java.util.Calendar p1){
	return org.apache.commons.lang3.time.DateUtils.isSameDay(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.time.DateUtils.isSameLocalTime(java.util.Calendar,java.util.Calendar)
*/
public static boolean isSameLocalTime(java.util.Calendar p0,java.util.Calendar p1){
	return org.apache.commons.lang3.time.DateUtils.isSameLocalTime(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Calendar,java.util.Calendar)
*/
public static boolean isSameInstant(java.util.Calendar p0,java.util.Calendar p1){
	return org.apache.commons.lang3.time.DateUtils.isSameInstant(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Date,java.util.Date)
*/
public static boolean isSameInstant(java.util.Date p0,java.util.Date p1){
	return org.apache.commons.lang3.time.DateUtils.isSameInstant(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Calendar,java.util.Calendar,int)
*/
public static boolean truncatedEquals(java.util.Calendar p0,java.util.Calendar p1,int p2){
	return org.apache.commons.lang3.time.DateUtils.truncatedEquals(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Date,java.util.Date,int)
*/
public static boolean truncatedEquals(java.util.Date p0,java.util.Date p1,int p2){
	return org.apache.commons.lang3.time.DateUtils.truncatedEquals(p0,p1,p2);
}
/**
*public static java.lang.String org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(long,boolean,boolean)
*/
public static java.lang.String formatDurationWords(long p0,boolean p1,boolean p2){
	return org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(p0,p1,p2);
}
/**
*public static java.lang.String org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(long,long,java.lang.String,boolean,java.util.TimeZone)
*/
public static java.lang.String formatPeriod(long p0,long p1,java.lang.String p2,boolean p3,java.util.TimeZone p4){
	return org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(p0,p1,p2,p3,p4);
}
/**
*public static java.lang.String org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(long,java.lang.String,boolean)
*/
public static java.lang.String formatDuration(long p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(p0,p1,p2);
}
/**
*public static void org.apache.commons.lang3.Validate.isTrue(boolean,java.lang.String,java.lang.Object...)
*/
public static void isTrue(boolean p0,java.lang.String p1,java.lang.Object... p2){
	 org.apache.commons.lang3.Validate.isTrue(p0,p1,p2);
}
/**
*public static void org.apache.commons.lang3.Validate.isTrue(boolean,java.lang.String,long)
*/
public static void isTrue(boolean p0,java.lang.String p1,long p2){
	 org.apache.commons.lang3.Validate.isTrue(p0,p1,p2);
}
/**
*public static void org.apache.commons.lang3.Validate.isTrue(boolean)
*/
public static void isTrue(boolean p0){
	 org.apache.commons.lang3.Validate.isTrue(p0);
}
/**
*public static void org.apache.commons.lang3.Validate.isTrue(boolean,java.lang.String,double)
*/
public static void isTrue(boolean p0,java.lang.String p1,double p2){
	 org.apache.commons.lang3.Validate.isTrue(p0,p1,p2);
}
/**
*public static void org.apache.commons.lang3.Validate.validState(boolean)
*/
public static void validState(boolean p0){
	 org.apache.commons.lang3.Validate.validState(p0);
}
/**
*public static void org.apache.commons.lang3.Validate.validState(boolean,java.lang.String,java.lang.Object...)
*/
public static void validState(boolean p0,java.lang.String p1,java.lang.Object... p2){
	 org.apache.commons.lang3.Validate.validState(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(double[],double[],boolean) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.NonMonotonicSequenceException
*/
public static boolean verifyInterpolationArray(double[] p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.NonMonotonicSequenceException{
	return org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isSequence(double,double,double)
*/
public static boolean isSequence(double p0,double p1,double p2){
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isSequence(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isBracketing(org.apache.commons.math3.analysis.UnivariateFunction,double,double) throws org.apache.commons.math3.exception.NullArgumentException
*/
public static boolean isBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isBracketing(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(double[],long[],double) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean chiSquareTest(double[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(long[][],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean chiSquareTest(long[][] p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(p0,p1);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.oneWayAnovaTest(java.util.Collection<double[]>,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.ConvergenceException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean oneWayAnovaTest(java.util.Collection<double[]> p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.ConvergenceException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.oneWayAnovaTest(p0,p1);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.tTest(double[],double[],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean tTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.tTest(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary,org.apache.commons.math3.stat.descriptive.StatisticalSummary,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.tTest(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.tTest(double,double[],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean tTest(double p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.tTest(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.tTest(double,org.apache.commons.math3.stat.descriptive.StatisticalSummary,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean tTest(double p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.tTest(p0,p1,p2);
}
/**
*public static double org.apache.commons.math3.stat.inference.TestUtils.monteCarloP(double,int,int,boolean,int)
*/
public static double monteCarloP(double p0,int p1,int p2,boolean p3,int p4){
	return org.apache.commons.math3.stat.inference.TestUtils.monteCarloP(p0,p1,p2,p3,p4);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.pairedTTest(double[],double[],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean pairedTTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.pairedTTest(p0,p1,p2);
}
/**
*public static double org.apache.commons.math3.stat.inference.TestUtils.exactP(double,int,int,boolean)
*/
public static double exactP(double p0,int p1,int p2,boolean p3){
	return org.apache.commons.math3.stat.inference.TestUtils.exactP(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.gTest(double[],long[],double) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean gTest(double[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.gTest(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.gTestDataSetsComparison(long[],long[],double) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean gTestDataSetsComparison(long[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.gTestDataSetsComparison(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[],double) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException
*/
public static boolean kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,double p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
/**
*public static double org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(double[],double[],boolean) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException
*/
public static double kolmogorovSmirnovTest(double[] p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
/**
*public static double org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[],boolean) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException
*/
public static double kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.homoscedasticTTest(double[],double[],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean homoscedasticTTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.homoscedasticTTest(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[],long[],double) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*/
public static boolean chiSquareTestDataSetsComparison(long[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.chiSquareTestDataSetsComparison(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.linear.MatrixUtils.isSymmetric(org.apache.commons.math3.linear.RealMatrix,double)
*/
public static boolean isSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1){
	return org.apache.commons.math3.linear.MatrixUtils.isSymmetric(p0,p1);
}
/**
*public static boolean org.apache.commons.math3.complex.Complex.equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex,org.apache.commons.math3.complex.Complex,double)
*/
public static boolean equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex p0,org.apache.commons.math3.complex.Complex p1,double p2){
	return org.apache.commons.math3.complex.Complex.equalsWithRelativeTolerance(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.primes.Primes.isPrime(int)
*/
public static boolean isPrime(int p0){
	return org.apache.commons.math3.primes.Primes.isPrime(p0);
}
/**
*public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int,boolean,org.apache.commons.math3.fitting.leastsquares.ParameterValidator)
*/
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<Evaluation> p4,int p5,int p6,boolean p7,org.apache.commons.math3.fitting.leastsquares.ParameterValidator p8){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
/**
*public static boolean org.apache.commons.math3.util.CompositeFormat.parseFixedstring(java.lang.String,java.lang.String,java.text.ParsePosition)
*/
public static boolean parseFixedstring(java.lang.String p0,java.lang.String p1,java.text.ParsePosition p2){
	return org.apache.commons.math3.util.CompositeFormat.parseFixedstring(p0,p1,p2);
}
/**
*public static <T> boolean org.apache.commons.math3.util.MathArrays.isMonotonic(T[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)
*/
public static <T extends java.lang.Comparable<? super T> > boolean isMonotonic(T[] p0,OrderDirection p1,boolean p2){
	return org.apache.commons.math3.util.MathArrays.isMonotonic(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.util.MathArrays.isMonotonic(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)
*/
public static boolean isMonotonic(double[] p0,OrderDirection p1,boolean p2){
	return org.apache.commons.math3.util.MathArrays.isMonotonic(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[],float[])
*/
public static boolean equalsIncludingNaN(float[] p0,float[] p1){
	return org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(p0,p1);
}
/**
*public static boolean org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(double[],double[])
*/
public static boolean equalsIncludingNaN(double[] p0,double[] p1){
	return org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(p0,p1);
}
/**
*public static void org.apache.commons.math3.util.MathArrays.checkOrder(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean) throws org.apache.commons.math3.exception.NonMonotonicSequenceException
*/
public static void checkOrder(double[] p0,OrderDirection p1,boolean p2) throws org.apache.commons.math3.exception.NonMonotonicSequenceException{
	 org.apache.commons.math3.util.MathArrays.checkOrder(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.util.MathArrays.checkOrder(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean,boolean) throws org.apache.commons.math3.exception.NonMonotonicSequenceException
*/
public static boolean checkOrder(double[] p0,OrderDirection p1,boolean p2,boolean p3) throws org.apache.commons.math3.exception.NonMonotonicSequenceException{
	return org.apache.commons.math3.util.MathArrays.checkOrder(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.math3.util.MathArrays.checkEqualLength(int[],int[],boolean)
*/
public static boolean checkEqualLength(int[] p0,int[] p1,boolean p2){
	return org.apache.commons.math3.util.MathArrays.checkEqualLength(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.util.MathArrays.checkEqualLength(double[],double[],boolean)
*/
public static boolean checkEqualLength(double[] p0,double[] p1,boolean p2){
	return org.apache.commons.math3.util.MathArrays.checkEqualLength(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.util.MathArrays.verifyValues(double[],int,int) throws org.apache.commons.math3.exception.MathIllegalArgumentException
*/
public static boolean verifyValues(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.util.MathArrays.verifyValues(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.util.MathArrays.verifyValues(double[],double[],int,int) throws org.apache.commons.math3.exception.MathIllegalArgumentException
*/
public static boolean verifyValues(double[] p0,double[] p1,int p2,int p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.util.MathArrays.verifyValues(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.math3.util.MathArrays.verifyValues(double[],int,int,boolean) throws org.apache.commons.math3.exception.MathIllegalArgumentException
*/
public static boolean verifyValues(double[] p0,int p1,int p2,boolean p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.util.MathArrays.verifyValues(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.math3.util.MathArrays.verifyValues(double[],double[],int,int,boolean) throws org.apache.commons.math3.exception.MathIllegalArgumentException
*/
public static boolean verifyValues(double[] p0,double[] p1,int p2,int p3,boolean p4) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.util.MathArrays.verifyValues(p0,p1,p2,p3,p4);
}
/**
*public static boolean org.apache.commons.math3.util.Precision.equalsWithRelativeTolerance(double,double,double)
*/
public static boolean equalsWithRelativeTolerance(double p0,double p1,double p2){
	return org.apache.commons.math3.util.Precision.equalsWithRelativeTolerance(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(double,double)
*/
public static boolean equalsIncludingNaN(double p0,double p1){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1);
}
/**
*public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(float,float,int)
*/
public static boolean equalsIncludingNaN(float p0,float p1,int p2){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(float,float,float)
*/
public static boolean equalsIncludingNaN(float p0,float p1,float p2){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(double,double,int)
*/
public static boolean equalsIncludingNaN(double p0,double p1,int p2){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(float,float)
*/
public static boolean equalsIncludingNaN(float p0,float p1){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1);
}
/**
*public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(double,double,double)
*/
public static boolean equalsIncludingNaN(double p0,double p1,double p2){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.beanutils.locale.LocaleBeanUtils.getApplyLocalized()
*/
public static boolean getApplyLocalized(){
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getApplyLocalized();
}
/**
*public static void org.apache.commons.beanutils.locale.LocaleBeanUtils.setApplyLocalized(boolean)
*/
public static void setApplyLocalized(boolean p0){
	 org.apache.commons.beanutils.locale.LocaleBeanUtils.setApplyLocalized(p0);
}
/**
*public static boolean org.apache.commons.beanutils.BeanUtils.initCause(java.lang.Throwable,java.lang.Throwable)
*/
public static boolean initCause(java.lang.Throwable p0,java.lang.Throwable p1){
	return org.apache.commons.beanutils.BeanUtils.initCause(p0,p1);
}
/**
*public static boolean org.apache.commons.beanutils.BeanUtils.getCacheFast(java.util.Map<?, ?>)
*/
public static boolean getCacheFast(java.util.Map<?, ?> p0){
	return org.apache.commons.beanutils.BeanUtils.getCacheFast(p0);
}
/**
*public static void org.apache.commons.beanutils.BeanUtils.setCacheFast(java.util.Map<?, ?>,boolean)
*/
public static void setCacheFast(java.util.Map<?, ?> p0,boolean p1){
	 org.apache.commons.beanutils.BeanUtils.setCacheFast(p0,p1);
}
/**
*public static boolean org.apache.commons.beanutils.PropertyUtils.removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector)
*/
public static boolean removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector p0){
	return org.apache.commons.beanutils.PropertyUtils.removeBeanIntrospector(p0);
}
/**
*public static boolean org.apache.commons.beanutils.PropertyUtils.isWriteable(java.lang.Object,java.lang.String)
*/
public static boolean isWriteable(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.beanutils.PropertyUtils.isWriteable(p0,p1);
}
/**
*public static boolean org.apache.commons.beanutils.PropertyUtils.isReadable(java.lang.Object,java.lang.String)
*/
public static boolean isReadable(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.beanutils.PropertyUtils.isReadable(p0,p1);
}
/**
*public static final boolean org.apache.commons.beanutils.MethodUtils.isAssignmentCompatible(java.lang.Class<?>,java.lang.Class<?>)
*/
public static final boolean isAssignmentCompatible(java.lang.Class<?> p0,java.lang.Class<?> p1){
	return org.apache.commons.beanutils.MethodUtils.isAssignmentCompatible(p0,p1);
}
/**
*public static synchronized void org.apache.commons.beanutils.MethodUtils.setCacheMethods(boolean)
*/
public static synchronized void setCacheMethods(boolean p0){
	 org.apache.commons.beanutils.MethodUtils.setCacheMethods(p0);
}
/**
*public static void org.apache.commons.beanutils.ConvertUtils.setDefaultBoolean(boolean)
*/
public static void setDefaultBoolean(boolean p0){
	 org.apache.commons.beanutils.ConvertUtils.setDefaultBoolean(p0);
}
/**
*public static boolean org.apache.commons.beanutils.ConvertUtils.getDefaultBoolean()
*/
public static boolean getDefaultBoolean(){
	return org.apache.commons.beanutils.ConvertUtils.getDefaultBoolean();
}
/**
*public static boolean org.apache.commons.text.WordUtils.isDelimiter(int,char[])
*/
public static boolean isDelimiter(int p0,char[] p1){
	return org.apache.commons.text.WordUtils.isDelimiter(p0,p1);
}
/**
*public static boolean org.apache.commons.text.WordUtils.isDelimiter(char,char[])
*/
public static boolean isDelimiter(char p0,char[] p1){
	return org.apache.commons.text.WordUtils.isDelimiter(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.text.WordUtils.wrap(java.lang.String,int,java.lang.String,boolean,java.lang.String)
*/
public static java.lang.String wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3,java.lang.String p4){
	return org.apache.commons.text.WordUtils.wrap(p0,p1,p2,p3,p4);
}
/**
*public static boolean org.apache.commons.text.WordUtils.containsAllWords(java.lang.CharSequence,java.lang.CharSequence...)
*/
public static boolean containsAllWords(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.text.WordUtils.containsAllWords(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.fill(boolean[],int,int,boolean)
*/
public static void fill(boolean[] p0,int p1,int p2,boolean p3){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.fill(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.fill(boolean[],boolean)
*/
public static void fill(boolean[] p0,boolean p1){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.fill(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.booleans.BooleanBigArrays.set(boolean[][],long,boolean)
*/
public static void set(boolean[][] p0,long p1,boolean p2){
	 it.unimi.dsi.fastutil.booleans.BooleanBigArrays.set(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.booleans.BooleanBigArrays.fill(boolean[][],long,long,boolean)
*/
public static void fill(boolean[][] p0,long p1,long p2,boolean p3){
	 it.unimi.dsi.fastutil.booleans.BooleanBigArrays.fill(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.booleans.BooleanBigArrays.fill(boolean[][],boolean)
*/
public static void fill(boolean[][] p0,boolean p1){
	 it.unimi.dsi.fastutil.booleans.BooleanBigArrays.fill(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanBigListIterator it.unimi.dsi.fastutil.booleans.BooleanBigListIterators.singleton(boolean)
*/
public static it.unimi.dsi.fastutil.booleans.BooleanBigListIterator singleton(boolean p0){
	return it.unimi.dsi.fastutil.booleans.BooleanBigListIterators.singleton(p0);
}
/**
*public static boolean it.unimi.dsi.fastutil.booleans.BooleanIterators.all(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*/
public static boolean all(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.booleans.BooleanIterators.any(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*/
public static boolean any(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions.singleton(byte,boolean)
*/
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction singleton(byte p0,boolean p1){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(byte,boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)
*/
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(byte p0,boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.bytes.ByteArrays.parallelRadixSortIndirect(int[],byte[],boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,byte[] p1,boolean p2){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.bytes.ByteArrays.parallelRadixSortIndirect(int[],byte[],int,int,boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(int[],byte[],byte[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,byte[] p1,byte[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*public static void it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(int[],byte[],boolean)
*/
public static void radixSortIndirect(int[] p0,byte[] p1,boolean p2){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(int[],byte[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(int[],byte[],byte[],boolean)
*/
public static void radixSortIndirect(int[] p0,byte[] p1,byte[] p2,boolean p3){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*public static boolean it.unimi.dsi.fastutil.bytes.ByteIterators.all(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*/
public static boolean all(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.bytes.ByteIterators.any(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*/
public static boolean any(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.singleton(char,boolean)
*/
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(char p0,boolean p1){
	return it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(char,boolean,it.unimi.dsi.fastutil.chars.CharComparator)
*/
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(char p0,boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.parallelRadixSortIndirect(int[],char[],boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,char[] p1,boolean p2){
	 it.unimi.dsi.fastutil.chars.CharArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.parallelRadixSortIndirect(int[],char[],int,int,boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.chars.CharArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(int[],char[],char[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(int[],char[],boolean)
*/
public static void radixSortIndirect(int[] p0,char[] p1,boolean p2){
	 it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(int[],char[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(int[],char[],char[],boolean)
*/
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,boolean p3){
	 it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*public static boolean it.unimi.dsi.fastutil.chars.CharIterators.all(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*/
public static boolean all(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.chars.CharIterators.any(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*/
public static boolean any(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions.singleton(double,boolean)
*/
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction singleton(double p0,boolean p1){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(double,boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*/
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(double p0,boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelRadixSortIndirect(int[],double[],boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,double[] p1,boolean p2){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelRadixSortIndirect(int[],double[],int,int,boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(int[],double[],double[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,double[] p1,double[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(int[],double[],boolean)
*/
public static void radixSortIndirect(int[] p0,double[] p1,boolean p2){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(int[],double[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(int[],double[],double[],boolean)
*/
public static void radixSortIndirect(int[] p0,double[] p1,double[] p2,boolean p3){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*public static boolean it.unimi.dsi.fastutil.doubles.DoubleIterators.all(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*/
public static boolean all(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.doubles.DoubleIterators.any(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*/
public static boolean any(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction it.unimi.dsi.fastutil.floats.Float2BooleanFunctions.singleton(float,boolean)
*/
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction singleton(float p0,boolean p1){
	return it.unimi.dsi.fastutil.floats.Float2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(float,boolean,it.unimi.dsi.fastutil.floats.FloatComparator)
*/
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(float p0,boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(int[],float[],boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,float[] p1,boolean p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(int[],float[],int,int,boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],float[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],boolean)
*/
public static void radixSortIndirect(int[] p0,float[] p1,boolean p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],float[],boolean)
*/
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,boolean p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*public static boolean it.unimi.dsi.fastutil.floats.FloatIterators.all(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*/
public static boolean all(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.floats.FloatIterators.any(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*/
public static boolean any(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction it.unimi.dsi.fastutil.ints.Int2BooleanFunctions.singleton(int,boolean)
*/
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction singleton(int p0,boolean p1){
	return it.unimi.dsi.fastutil.ints.Int2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(int,boolean,it.unimi.dsi.fastutil.ints.IntComparator)
*/
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(int p0,boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.parallelRadixSortIndirect(int[],int[],boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,int[] p1,boolean p2){
	 it.unimi.dsi.fastutil.ints.IntArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.parallelRadixSortIndirect(int[],int[],int,int,boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.ints.IntArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(int[],int[],int[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,int[] p1,int[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(int[],int[],boolean)
*/
public static void radixSortIndirect(int[] p0,int[] p1,boolean p2){
	 it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(int[],int[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(int[],int[],int[],boolean)
*/
public static void radixSortIndirect(int[] p0,int[] p1,int[] p2,boolean p3){
	 it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*public static boolean it.unimi.dsi.fastutil.ints.IntIterators.all(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*/
public static boolean all(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.ints.IntIterators.any(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*/
public static boolean any(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction it.unimi.dsi.fastutil.longs.Long2BooleanFunctions.singleton(long,boolean)
*/
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction singleton(long p0,boolean p1){
	return it.unimi.dsi.fastutil.longs.Long2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(long,boolean,it.unimi.dsi.fastutil.longs.LongComparator)
*/
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(long p0,boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.longs.LongArrays.parallelRadixSortIndirect(int[],long[],boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,long[] p1,boolean p2){
	 it.unimi.dsi.fastutil.longs.LongArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.longs.LongArrays.parallelRadixSortIndirect(int[],long[],int,int,boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.longs.LongArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(int[],long[],long[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,long[] p1,long[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*public static void it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(int[],long[],boolean)
*/
public static void radixSortIndirect(int[] p0,long[] p1,boolean p2){
	 it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(int[],long[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(int[],long[],long[],boolean)
*/
public static void radixSortIndirect(int[] p0,long[] p1,long[] p2,boolean p3){
	 it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*public static boolean it.unimi.dsi.fastutil.longs.LongIterators.all(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*/
public static boolean all(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.longs.LongIterators.any(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*/
public static boolean any(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.any(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(K,boolean)
*/
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> singleton(K p0,boolean p1){
	return it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(K,boolean,java.util.Comparator<? super K>)
*/
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> singleton(K p0,boolean p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <K> boolean it.unimi.dsi.fastutil.objects.ObjectIterators.all(it.unimi.dsi.fastutil.objects.ObjectIterator<K>,java.util.function.Predicate<? super K>)
*/
public static <K> boolean all(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0,java.util.function.Predicate<? super K> p1){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.all(p0,p1);
}
/**
*public static <K> boolean it.unimi.dsi.fastutil.objects.ObjectIterators.any(it.unimi.dsi.fastutil.objects.ObjectIterator<K>,java.util.function.Predicate<? super K>)
*/
public static <K> boolean any(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0,java.util.function.Predicate<? super K> p1){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions.singleton(short,boolean)
*/
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction singleton(short p0,boolean p1){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(short,boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)
*/
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(short p0,boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.shorts.ShortArrays.parallelRadixSortIndirect(int[],short[],boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,short[] p1,boolean p2){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.shorts.ShortArrays.parallelRadixSortIndirect(int[],short[],int,int,boolean)
*/
public static void parallelRadixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(int[],short[],short[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,short[] p1,short[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*public static void it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(int[],short[],boolean)
*/
public static void radixSortIndirect(int[] p0,short[] p1,boolean p2){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(int[],short[],int,int,boolean)
*/
public static void radixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(int[],short[],short[],boolean)
*/
public static void radixSortIndirect(int[] p0,short[] p1,short[] p2,boolean p3){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*public static boolean it.unimi.dsi.fastutil.shorts.ShortIterators.all(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*/
public static boolean all(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.shorts.ShortIterators.any(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*/
public static boolean any(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.any(p0,p1);
}
/**
*public static <T> void com.facebook.util.Validations.checkState(boolean,java.lang.Class<T>,java.lang.String,java.lang.Object...) throws T
*/
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1,java.lang.String p2,java.lang.Object... p3) throws T{
	 com.facebook.util.Validations.checkState(p0,p1,p2,p3);
}
/**
*public static <T> void com.facebook.util.Validations.checkState(boolean,java.lang.Class<T>,java.lang.String) throws T
*/
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1,java.lang.String p2) throws T{
	 com.facebook.util.Validations.checkState(p0,p1,p2);
}
/**
*public static <T> void com.facebook.util.Validations.checkState(boolean,java.lang.Class<T>) throws T
*/
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1) throws T{
	 com.facebook.util.Validations.checkState(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.ArrayUtils.isNotEmpty(java.lang.Object[])
*/
/*public static boolean isNotEmpty(java.lang.Object[] p0){
	return org.apache.commons.lang.ArrayUtils.isNotEmpty(p0);
}
*//**
*public static boolean org.apache.commons.lang.BooleanUtils.xor(boolean[])
*//*
public static boolean xor(boolean[] p0){
	return org.apache.commons.lang.BooleanUtils.xor(p0);
}*/
/**
*public static int org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,boolean,java.lang.Class,java.lang.String[])
*/
/*public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3,java.lang.String[] p4){
	return org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}*/
/**
*public static int org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,boolean,java.lang.Class)
*/
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3){
	return org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class)
*/
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3){
	return org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object)
*/
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class,java.lang.String[])
*/
/*public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3,java.lang.String[] p4){
	return org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4);
}
*//**
*public static boolean org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,java.lang.String[])
*//*
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.lang.String[] p2){
	return org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
*//**
*public static boolean org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,java.util.Collection)
*//*
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection p2){
	return org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}*/
/**
*public static int org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class)
*/
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3,java.lang.Class p4){
	return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4);
}
/**
*public static int org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])
*/
/*public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3,java.lang.Class p4,java.lang.String[] p5){
	return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}*/
/**
*public static java.lang.String org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object,org.apache.commons.lang.builder.ToStringStyle,boolean)
*/
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2){
	return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(p0,p1,p2);
}
/**
*public static java.lang.String org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object,org.apache.commons.lang.builder.ToStringStyle,boolean,java.lang.Class)
*/
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2,java.lang.Class p3){
	return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
/**
*public static boolean org.apache.commons.lang.ClassUtils.isInnerClass(java.lang.Class)
*/
/*public static boolean isInnerClass(java.lang.Class p0){
	return org.apache.commons.lang.ClassUtils.isInnerClass(p0);
}
*//**
*public static boolean org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class,java.lang.Class,boolean)
*//*
public static boolean isAssignable(java.lang.Class p0,java.lang.Class p1,boolean p2){
	return org.apache.commons.lang.ClassUtils.isAssignable(p0,p1,p2);
}
*//**
*public static boolean org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class[],java.lang.Class[])
*//*
public static boolean isAssignable(java.lang.Class[] p0,java.lang.Class[] p1){
	return org.apache.commons.lang.ClassUtils.isAssignable(p0,p1);
}
*//**
*public static boolean org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class[],java.lang.Class[],boolean)
*//*
public static boolean isAssignable(java.lang.Class[] p0,java.lang.Class[] p1,boolean p2){
	return org.apache.commons.lang.ClassUtils.isAssignable(p0,p1,p2);
}
*//**
*public static boolean org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class,java.lang.Class)
*//*
public static boolean isAssignable(java.lang.Class p0,java.lang.Class p1){
	return org.apache.commons.lang.ClassUtils.isAssignable(p0,p1);
}*/
/**
*public static boolean org.apache.commons.lang.exception.ExceptionUtils.setCause(java.lang.Throwable,java.lang.Throwable)
*/
public static boolean setCause(java.lang.Throwable p0,java.lang.Throwable p1){
	return org.apache.commons.lang.exception.ExceptionUtils.setCause(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.exception.ExceptionUtils.isCauseMethodName(java.lang.String)
*/
public static boolean isCauseMethodName(java.lang.String p0){
	return org.apache.commons.lang.exception.ExceptionUtils.isCauseMethodName(p0);
}
/**
*public static boolean org.apache.commons.lang.exception.ExceptionUtils.isThrowableNested()
*/
public static boolean isThrowableNested(){
	return org.apache.commons.lang.exception.ExceptionUtils.isThrowableNested();
}
/**
*public static boolean org.apache.commons.lang.exception.ExceptionUtils.isNestedThrowable(java.lang.Throwable)
*/
public static boolean isNestedThrowable(java.lang.Throwable p0){
	return org.apache.commons.lang.exception.ExceptionUtils.isNestedThrowable(p0);
}
/**
*public static boolean org.apache.commons.lang.math.RandomUtils.nextBoolean()
*/
public static boolean nextBoolean(){
	return org.apache.commons.lang.math.RandomUtils.nextBoolean();
}
/**
*public static boolean org.apache.commons.lang.math.RandomUtils.nextBoolean(java.util.Random)
*/
public static boolean nextBoolean(java.util.Random p0){
	return org.apache.commons.lang.math.RandomUtils.nextBoolean(p0);
}
/**
*public static int org.apache.commons.lang.ObjectUtils.compare(java.lang.Comparable,java.lang.Comparable,boolean)
*//*
public static int compare(java.lang.Comparable p0,java.lang.Comparable p1,boolean p2){
	return org.apache.commons.lang.ObjectUtils.compare(p0,p1,p2);
}
*//**
*public static java.lang.String org.apache.commons.lang.RandomStringUtils.random(int,int,int,boolean,boolean,char[])
*//*
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5){
	return org.apache.commons.lang.RandomStringUtils.random(p0,p1,p2,p3,p4,p5);
}
*//**
*public static java.lang.reflect.Field org.apache.commons.lang.reflect.FieldUtils.getDeclaredField(java.lang.Class,java.lang.String,boolean)
*//*
public static java.lang.reflect.Field getDeclaredField(java.lang.Class p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang.reflect.FieldUtils.getDeclaredField(p0,p1,p2);
}
*//**
*public static java.lang.reflect.Field org.apache.commons.lang.reflect.FieldUtils.getField(java.lang.Class,java.lang.String,boolean)
*//*
public static java.lang.reflect.Field getField(java.lang.Class p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang.reflect.FieldUtils.getField(p0,p1,p2);
}
*//**
*public static void org.apache.commons.lang.reflect.FieldUtils.writeStaticField(java.lang.Class,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*//*
public static void writeStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang.reflect.FieldUtils.writeStaticField(p0,p1,p2,p3);
}
*//**
*public static java.lang.Object org.apache.commons.lang.reflect.FieldUtils.readStaticField(java.lang.Class,java.lang.String,boolean) throws java.lang.IllegalAccessException
*//*
public static java.lang.Object readStaticField(java.lang.Class p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang.reflect.FieldUtils.readStaticField(p0,p1,p2);
}
*//**
*public static void org.apache.commons.lang.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*//*
public static void writeDeclaredStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang.reflect.FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
*//**
*public static java.lang.Object org.apache.commons.lang.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class,java.lang.String,boolean) throws java.lang.IllegalAccessException
*//*
public static java.lang.Object readDeclaredStaticField(java.lang.Class p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang.reflect.FieldUtils.readDeclaredStaticField(p0,p1,p2);
}*/
/**
*public static boolean org.apache.commons.lang.StringUtils.contains(java.lang.String,char)
*/
public static boolean contains(java.lang.String p0,char p1){
	return org.apache.commons.lang.StringUtils.contains(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.contains(java.lang.String,java.lang.String)
*/
public static boolean contains(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.contains(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.endsWith(java.lang.String,java.lang.String)
*/
public static boolean endsWith(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.endsWith(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.equalsIgnoreCase(java.lang.String,java.lang.String)
*/
public static boolean equalsIgnoreCase(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.equalsIgnoreCase(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isEmpty(java.lang.String)
*/
public static boolean isEmpty(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.startsWith(java.lang.String,java.lang.String)
*/
public static boolean startsWith(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.startsWith(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isWhitespace(java.lang.String)
*/
public static boolean isWhitespace(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isWhitespace(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isAlpha(java.lang.String)
*/
public static boolean isAlpha(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isAlpha(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isNumeric(java.lang.String)
*/
public static boolean isNumeric(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isNumeric(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isAlphanumericSpace(java.lang.String)
*/
public static boolean isAlphanumericSpace(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isAlphanumericSpace(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.containsIgnoreCase(java.lang.String,java.lang.String)
*/
public static boolean containsIgnoreCase(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.containsIgnoreCase(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isBlank(java.lang.String)
*/
public static boolean isBlank(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isBlank(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isNotEmpty(java.lang.String)
*/
public static boolean isNotEmpty(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isNotBlank(java.lang.String)
*/
public static boolean isNotBlank(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isNotBlank(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.containsOnly(java.lang.String,java.lang.String)
*/
public static boolean containsOnly(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.containsOnly(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.containsOnly(java.lang.String,char[])
*/
public static boolean containsOnly(java.lang.String p0,char[] p1){
	return org.apache.commons.lang.StringUtils.containsOnly(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.containsNone(java.lang.String,java.lang.String)
*/
public static boolean containsNone(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.containsNone(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.containsNone(java.lang.String,char[])
*/
public static boolean containsNone(java.lang.String p0,char[] p1){
	return org.apache.commons.lang.StringUtils.containsNone(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.containsAny(java.lang.String,java.lang.String)
*/
public static boolean containsAny(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.containsAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.containsAny(java.lang.String,char[])
*/
public static boolean containsAny(java.lang.String p0,char[] p1){
	return org.apache.commons.lang.StringUtils.containsAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isAllLowerCase(java.lang.String)
*/
public static boolean isAllLowerCase(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isAllLowerCase(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isAsciiPrintable(java.lang.String)
*/
public static boolean isAsciiPrintable(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isAsciiPrintable(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isAlphanumeric(java.lang.String)
*/
public static boolean isAlphanumeric(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isAlphanumeric(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isAllUpperCase(java.lang.String)
*/
public static boolean isAllUpperCase(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isAllUpperCase(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isNumericSpace(java.lang.String)
*/
public static boolean isNumericSpace(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isNumericSpace(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.isAlphaSpace(java.lang.String)
*/
public static boolean isAlphaSpace(java.lang.String p0){
	return org.apache.commons.lang.StringUtils.isAlphaSpace(p0);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.startsWithAny(java.lang.String,java.lang.String[])
*/
public static boolean startsWithAny(java.lang.String p0,java.lang.String[] p1){
	return org.apache.commons.lang.StringUtils.startsWithAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.endsWithAny(java.lang.String,java.lang.String[])
*/
public static boolean endsWithAny(java.lang.String p0,java.lang.String[] p1){
	return org.apache.commons.lang.StringUtils.endsWithAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.startsWithIgnoreCase(java.lang.String,java.lang.String)
*/
public static boolean startsWithIgnoreCase(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.startsWithIgnoreCase(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.StringUtils.endsWithIgnoreCase(java.lang.String,java.lang.String)
*/
public static boolean endsWithIgnoreCase(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.endsWithIgnoreCase(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.SystemUtils.isJavaVersionAtLeast(int)
*/
public static boolean isJavaVersionAtLeast(int p0){
	return org.apache.commons.lang.SystemUtils.isJavaVersionAtLeast(p0);
}
/**
*public static boolean org.apache.commons.lang.SystemUtils.isJavaVersionAtLeast(float)
*/
public static boolean isJavaVersionAtLeast(float p0){
	return org.apache.commons.lang.SystemUtils.isJavaVersionAtLeast(p0);
}
/**
*public static void org.apache.commons.lang.Validate.isTrue(boolean,java.lang.String,java.lang.Object)
*/
public static void isTrue(boolean p0,java.lang.String p1,java.lang.Object p2){
	 org.apache.commons.lang.Validate.isTrue(p0,p1,p2);
}
/**
*public static void org.apache.commons.lang.Validate.isTrue(boolean,java.lang.String)
*/
public static void isTrue(boolean p0,java.lang.String p1){
	 org.apache.commons.lang.Validate.isTrue(p0,p1);
}
}
