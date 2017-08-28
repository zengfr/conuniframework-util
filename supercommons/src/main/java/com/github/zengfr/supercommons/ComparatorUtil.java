package com.zengfr.supercommons;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.primitives.UnsignedInts;
import com.google.common.primitives.UnsignedLongs;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.ComparatorUtils;
import org.apache.commons.collections4.ComparatorUtils;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2CharSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2IntSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2LongSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2CharSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2IntSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2LongSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2CharSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2IntSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2LongSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2CharSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2LongSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2CharSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2LongSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps;
import it.unimi.dsi.fastutil.objects.ObjectComparators;
import it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ByteSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2LongSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ShortSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComparatorUtil{ 
public static java.util.Comparator<boolean[]> lexicographicalComparator(){
return Booleans.lexicographicalComparator();
}
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator[] p1){
return IteratorUtils.collatedIterator(p0,p1);
}
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator p1,java.util.Iterator p2){
return IteratorUtils.collatedIterator(p0,p1,p2);
}
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Collection p1){
return IteratorUtils.collatedIterator(p0,p1);
}
public static java.lang.Object min(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2){
return ComparatorUtils.min(p0,p1,p2);
}
public static java.lang.Object max(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2){
return ComparatorUtils.max(p0,p1,p2);
}
public static java.util.Comparator nullLowComparator(java.util.Comparator p0){
return ComparatorUtils.nullLowComparator(p0);
}
public static java.util.Comparator nullHighComparator(java.util.Comparator p0){
return ComparatorUtils.nullHighComparator(p0);
}
public static java.util.Comparator transformedComparator(java.util.Comparator p0,org.apache.commons.collections.Transformer p1){
return ComparatorUtils.transformedComparator(p0,p1);
}
public static java.util.Comparator naturalComparator(){
return ComparatorUtils.naturalComparator();
}
public static java.util.Comparator reversedComparator(java.util.Comparator p0){
return ComparatorUtils.reversedComparator(p0);
}
public static java.util.Comparator chainedComparator(java.util.Comparator[] p0){
return ComparatorUtils.chainedComparator(p0);
}
public static java.util.Comparator chainedComparator(java.util.Collection p0){
return ComparatorUtils.chainedComparator(p0);
}
public static java.util.Comparator chainedComparator(java.util.Comparator p0,java.util.Comparator p1){
return ComparatorUtils.chainedComparator(p0,p1);
}
public static java.util.Comparator booleanComparator(boolean p0){
return ComparatorUtils.booleanComparator(p0);
}
public static <E> java.util.Comparator<E> nullLowComparator(java.util.Comparator<E> p0){
return ComparatorUtils.nullLowComparator(p0);
}
public static <E> java.util.Comparator<E> nullHighComparator(java.util.Comparator<E> p0){
return ComparatorUtils.nullHighComparator(p0);
}
public static <I,O> java.util.Comparator<I> transformedComparator(java.util.Comparator<O> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
return ComparatorUtils.transformedComparator(p0,p1);
}
public static <E> java.util.Comparator<E> reversedComparator(java.util.Comparator<E> p0){
return ComparatorUtils.reversedComparator(p0);
}
public static <E> java.util.Comparator<E> chainedComparator(java.util.Collection<java.util.Comparator<E>> p0){
return ComparatorUtils.chainedComparator(p0);
}
public static <E> java.util.Comparator<E> chainedComparator(java.util.Comparator<E>... p0){
return ComparatorUtils.chainedComparator(p0);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Byte, ?>> entryComparator(it.unimi.dsi.fastutil.bytes.ByteComparator p0){
return Byte2BooleanSortedMaps.entryComparator(p0);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Character, ?>> entryComparator(it.unimi.dsi.fastutil.chars.CharComparator p0){
return Char2BooleanSortedMaps.entryComparator(p0);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Double, ?>> entryComparator(it.unimi.dsi.fastutil.doubles.DoubleComparator p0){
return Double2BooleanSortedMaps.entryComparator(p0);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Float, ?>> entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator p0){
return Float2BooleanSortedMaps.entryComparator(p0);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Integer, ?>> entryComparator(it.unimi.dsi.fastutil.ints.IntComparator p0){
return Int2BooleanSortedMaps.entryComparator(p0);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Long, ?>> entryComparator(it.unimi.dsi.fastutil.longs.LongComparator p0){
return Long2BooleanSortedMaps.entryComparator(p0);
}
public static <K> java.util.Comparator<? super java.util.Map.java.util.Map.Entry<K, ?>> entryComparator(java.util.Comparator<? super K> p0){
return Object2BooleanSortedMaps.entryComparator(p0);
}
public static <K> java.util.Comparator<K> oppositeComparator(java.util.Comparator<K> p0){
return ObjectComparators.oppositeComparator(p0);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Short, ?>> entryComparator(it.unimi.dsi.fastutil.shorts.ShortComparator p0){
return Short2BooleanSortedMaps.entryComparator(p0);
}
}
