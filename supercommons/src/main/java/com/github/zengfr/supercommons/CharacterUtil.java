package com.github.zengfr.supercommons;
import org.apache.commons.lang3.CharUtils;
import it.unimi.dsi.fastutil.bytes.Byte2CharFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2CharMaps;
import it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2BooleanFunctions;
import it.unimi.dsi.fastutil.chars.Char2BooleanMaps;
import it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteFunctions;
import it.unimi.dsi.fastutil.chars.Char2ByteMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2CharFunctions;
import it.unimi.dsi.fastutil.chars.Char2CharMaps;
import it.unimi.dsi.fastutil.chars.Char2CharSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleFunctions;
import it.unimi.dsi.fastutil.chars.Char2DoubleMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatFunctions;
import it.unimi.dsi.fastutil.chars.Char2FloatMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2IntFunctions;
import it.unimi.dsi.fastutil.chars.Char2IntMaps;
import it.unimi.dsi.fastutil.chars.Char2IntSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2LongFunctions;
import it.unimi.dsi.fastutil.chars.Char2LongMaps;
import it.unimi.dsi.fastutil.chars.Char2LongSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectFunctions;
import it.unimi.dsi.fastutil.chars.Char2ObjectMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions;
import it.unimi.dsi.fastutil.chars.Char2ReferenceMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortFunctions;
import it.unimi.dsi.fastutil.chars.Char2ShortMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps;
import it.unimi.dsi.fastutil.chars.CharSets;
import it.unimi.dsi.fastutil.doubles.Double2CharFunctions;
import it.unimi.dsi.fastutil.doubles.Double2CharMaps;
import it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2CharFunctions;
import it.unimi.dsi.fastutil.floats.Float2CharMaps;
import it.unimi.dsi.fastutil.floats.Float2CharSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2CharFunctions;
import it.unimi.dsi.fastutil.ints.Int2CharMaps;
import it.unimi.dsi.fastutil.ints.Int2CharSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2CharFunctions;
import it.unimi.dsi.fastutil.longs.Long2CharMaps;
import it.unimi.dsi.fastutil.longs.Long2CharSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2CharFunctions;
import it.unimi.dsi.fastutil.objects.Object2CharMaps;
import it.unimi.dsi.fastutil.objects.Object2CharSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharFunctions;
import it.unimi.dsi.fastutil.objects.Reference2CharMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharFunctions;
import it.unimi.dsi.fastutil.shorts.Short2CharMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps;
import org.apache.commons.lang.CharUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharacterUtil{ 
public static java.lang.String unicodeEscaped(java.lang.Character p0){
return CharUtils.unicodeEscaped(p0);
}
public static char toChar(java.lang.Character p0,char p1){
return CharUtils.toChar(p0,p1);
}
public static char toChar(java.lang.Character p0){
return CharUtils.toChar(p0);
}
public static int toIntValue(java.lang.Character p0,int p1){
return CharUtils.toIntValue(p0,p1);
}
public static int toIntValue(java.lang.Character p0){
return CharUtils.toIntValue(p0);
}
public static java.lang.Character toCharacterObject(char p0){
return CharUtils.toCharacterObject(p0);
}
public static java.lang.Character toCharacterObject(java.lang.String p0){
return CharUtils.toCharacterObject(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction singleton(java.lang.Byte p0,java.lang.Character p1){
return Byte2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(java.lang.Byte p0,java.lang.Character p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(java.lang.Character p0,java.lang.Boolean p1){
return Char2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(java.lang.Character p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction singleton(java.lang.Character p0,java.lang.Byte p1){
return Char2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(java.lang.Character p0,java.lang.Byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2CharFunction singleton(java.lang.Character p0,java.lang.Character p1){
return Char2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(java.lang.Character p0,java.lang.Character p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction singleton(java.lang.Character p0,java.lang.Double p1){
return Char2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(java.lang.Character p0,java.lang.Double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction singleton(java.lang.Character p0,java.lang.Float p1){
return Char2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(java.lang.Character p0,java.lang.Float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2IntFunction singleton(java.lang.Character p0,java.lang.Integer p1){
return Char2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(java.lang.Character p0,java.lang.Integer p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2LongFunction singleton(java.lang.Character p0,java.lang.Long p1){
return Char2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(java.lang.Character p0,java.lang.Long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> singleton(java.lang.Character p0,V p1){
return Char2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(java.lang.Character p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction singleton(java.lang.Character p0,java.lang.Short p1){
return Char2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(java.lang.Character p0,java.lang.Short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.CharSet singleton(java.lang.Character p0){
return CharSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction singleton(java.lang.Double p0,java.lang.Character p1){
return Double2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(java.lang.Double p0,java.lang.Character p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2CharFunction singleton(java.lang.Float p0,java.lang.Character p1){
return Float2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(java.lang.Float p0,java.lang.Character p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2CharFunction singleton(java.lang.Integer p0,java.lang.Character p1){
return Int2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(java.lang.Integer p0,java.lang.Character p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2CharFunction singleton(java.lang.Long p0,java.lang.Character p1){
return Long2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(java.lang.Long p0,java.lang.Character p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2CharSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> singleton(K p0,java.lang.Character p1){
return Object2CharFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> singleton(K p0,java.lang.Character p1,java.util.Comparator<? super K> p2){
return Object2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction singleton(java.lang.Short p0,java.lang.Character p1){
return Short2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(java.lang.Short p0,java.lang.Character p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2CharSortedMaps.singleton(p0,p1,p2);
}
}
