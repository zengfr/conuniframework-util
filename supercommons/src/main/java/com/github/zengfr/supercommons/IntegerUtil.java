package com.github.zengfr.supercommons;
import com.google.common.primitives.Ints;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.math.NumberUtils;
import it.unimi.dsi.fastutil.bytes.Byte2IntFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2IntMaps;
import it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2IntFunctions;
import it.unimi.dsi.fastutil.chars.Char2IntMaps;
import it.unimi.dsi.fastutil.chars.Char2IntSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntFunctions;
import it.unimi.dsi.fastutil.doubles.Double2IntMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2IntFunctions;
import it.unimi.dsi.fastutil.floats.Float2IntMaps;
import it.unimi.dsi.fastutil.floats.Float2IntSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2BooleanFunctions;
import it.unimi.dsi.fastutil.ints.Int2BooleanMaps;
import it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ByteFunctions;
import it.unimi.dsi.fastutil.ints.Int2ByteMaps;
import it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2CharFunctions;
import it.unimi.dsi.fastutil.ints.Int2CharMaps;
import it.unimi.dsi.fastutil.ints.Int2CharSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2DoubleFunctions;
import it.unimi.dsi.fastutil.ints.Int2DoubleMaps;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2FloatFunctions;
import it.unimi.dsi.fastutil.ints.Int2FloatMaps;
import it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2IntFunctions;
import it.unimi.dsi.fastutil.ints.Int2IntMaps;
import it.unimi.dsi.fastutil.ints.Int2IntSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2LongFunctions;
import it.unimi.dsi.fastutil.ints.Int2LongMaps;
import it.unimi.dsi.fastutil.ints.Int2LongSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectFunctions;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions;
import it.unimi.dsi.fastutil.ints.Int2ReferenceMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ShortFunctions;
import it.unimi.dsi.fastutil.ints.Int2ShortMaps;
import it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.longs.Long2IntFunctions;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2IntFunctions;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntFunctions;
import it.unimi.dsi.fastutil.objects.Reference2IntMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntFunctions;
import it.unimi.dsi.fastutil.shorts.Short2IntMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.NumberUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntegerUtil{ 
public static java.lang.Integer tryParse(java.lang.String p0,int p1){
return Ints.tryParse(p0,p1);
}
public static java.lang.Integer tryParse(java.lang.String p0){
return Ints.tryParse(p0);
}
public static java.lang.Integer getInteger(java.util.Map p0,java.lang.Object p1,java.lang.Integer p2){
return MapUtils.getInteger(p0,p1,p2);
}
public static java.lang.Integer getInteger(java.util.Map p0,java.lang.Object p1){
return MapUtils.getInteger(p0,p1);
}
public static <K> java.lang.Integer getInteger(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getInteger(p0,p1);
}
public static <K> java.lang.Integer getInteger(java.util.Map<? super K, ?> p0,K p1,java.lang.Integer p2){
return MapUtils.getInteger(p0,p1,p2);
}
public static boolean toBoolean(java.lang.Integer p0,java.lang.Integer p1,java.lang.Integer p2){
return BooleanUtils.toBoolean(p0,p1,p2);
}
public static java.lang.Boolean toBooleanObject(java.lang.Integer p0){
return BooleanUtils.toBooleanObject(p0);
}
public static java.lang.Boolean toBooleanObject(java.lang.Integer p0,java.lang.Integer p1,java.lang.Integer p2,java.lang.Integer p3){
return BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
public static java.lang.Integer toIntegerObject(boolean p0,java.lang.Integer p1,java.lang.Integer p2){
return BooleanUtils.toIntegerObject(p0,p1,p2);
}
public static java.lang.Integer toIntegerObject(java.lang.Boolean p0,java.lang.Integer p1,java.lang.Integer p2,java.lang.Integer p3){
return BooleanUtils.toIntegerObject(p0,p1,p2,p3);
}
public static java.lang.Integer toIntegerObject(java.lang.Boolean p0){
return BooleanUtils.toIntegerObject(p0);
}
public static java.lang.Integer toIntegerObject(boolean p0){
return BooleanUtils.toIntegerObject(p0);
}
public static java.lang.Integer createInteger(java.lang.String p0){
return NumberUtils.createInteger(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction singleton(java.lang.Byte p0,java.lang.Integer p1){
return Byte2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(java.lang.Byte p0,java.lang.Integer p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2IntFunction singleton(java.lang.Character p0,java.lang.Integer p1){
return Char2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(java.lang.Character p0,java.lang.Integer p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction singleton(java.lang.Double p0,java.lang.Integer p1){
return Double2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(java.lang.Double p0,java.lang.Integer p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2IntFunction singleton(java.lang.Float p0,java.lang.Integer p1){
return Float2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(java.lang.Float p0,java.lang.Integer p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction singleton(java.lang.Integer p0,java.lang.Boolean p1){
return Int2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(java.lang.Integer p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction singleton(java.lang.Integer p0,java.lang.Byte p1){
return Int2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(java.lang.Integer p0,java.lang.Byte p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2CharFunction singleton(java.lang.Integer p0,java.lang.Character p1){
return Int2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(java.lang.Integer p0,java.lang.Character p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction singleton(java.lang.Integer p0,java.lang.Double p1){
return Int2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(java.lang.Integer p0,java.lang.Double p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction singleton(java.lang.Integer p0,java.lang.Float p1){
return Int2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(java.lang.Integer p0,java.lang.Float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2IntFunction singleton(java.lang.Integer p0,java.lang.Integer p1){
return Int2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap singleton(java.lang.Integer p0,java.lang.Integer p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2LongFunction singleton(java.lang.Integer p0,java.lang.Long p1){
return Int2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(java.lang.Integer p0,java.lang.Long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> singleton(java.lang.Integer p0,V p1){
return Int2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> singleton(java.lang.Integer p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction singleton(java.lang.Integer p0,java.lang.Short p1){
return Int2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(java.lang.Integer p0,java.lang.Short p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.IntSet singleton(java.lang.Integer p0){
return IntSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.longs.Long2IntFunction singleton(java.lang.Long p0,java.lang.Integer p1){
return Long2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(java.lang.Long p0,java.lang.Integer p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2IntSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> singleton(K p0,java.lang.Integer p1){
return Object2IntFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> singleton(K p0,java.lang.Integer p1,java.util.Comparator<? super K> p2){
return Object2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction singleton(java.lang.Short p0,java.lang.Integer p1){
return Short2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(java.lang.Short p0,java.lang.Integer p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2IntSortedMaps.singleton(p0,p1,p2);
}
}
