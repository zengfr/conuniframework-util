package com.zengfr.supercommons;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections4.MapUtils;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ByteFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ByteMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2CharFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2CharMaps;
import it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2FloatFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2FloatMaps;
import it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2IntFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2IntMaps;
import it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2LongFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2LongMaps;
import it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ShortFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ShortMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps;
import it.unimi.dsi.fastutil.bytes.ByteSets;
import it.unimi.dsi.fastutil.chars.Char2ByteFunctions;
import it.unimi.dsi.fastutil.chars.Char2ByteMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ByteFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ByteMaps;
import it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ByteFunctions;
import it.unimi.dsi.fastutil.floats.Float2ByteMaps;
import it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ByteFunctions;
import it.unimi.dsi.fastutil.ints.Int2ByteMaps;
import it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteFunctions;
import it.unimi.dsi.fastutil.longs.Long2ByteMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ByteFunctions;
import it.unimi.dsi.fastutil.objects.Object2ByteMaps;
import it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ByteFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ByteMaps;
import it.unimi.dsi.fastutil.objects.Reference2ByteSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ByteFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ByteMaps;
import it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps;
import com.google.common.primitives.Bytes;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Conversion;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.collections.primitives.ByteCollections;
import it.unimi.dsi.fastutil.SafeMath;
import it.unimi.dsi.fastutil.bytes.ByteArrays;
import it.unimi.dsi.fastutil.bytes.ByteBigArrays;
import it.unimi.dsi.fastutil.bytes.ByteBigListIterators;
import it.unimi.dsi.fastutil.bytes.ByteBigLists;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
import it.unimi.dsi.fastutil.bytes.ByteLists;
import it.unimi.dsi.fastutil.bytes.ByteSortedSets;
import com.facebook.collections.PackedByteArray;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.math.NumberUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteUtil{ 
public static java.lang.Byte getByte(java.util.Map p0,java.lang.Object p1,java.lang.Byte p2){
return MapUtils.getByte(p0,p1,p2);
}
public static java.lang.Byte getByte(java.util.Map p0,java.lang.Object p1){
return MapUtils.getByte(p0,p1);
}
public static <K> java.lang.Byte getByte(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getByte(p0,p1);
}
public static <K> java.lang.Byte getByte(java.util.Map<? super K, ?> p0,K p1,java.lang.Byte p2){
return MapUtils.getByte(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction singleton(java.lang.Byte p0,java.lang.Boolean p1){
return Byte2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(java.lang.Byte p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction singleton(java.lang.Byte p0,java.lang.Byte p1){
return Byte2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap singleton(java.lang.Byte p0,java.lang.Byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction singleton(java.lang.Byte p0,java.lang.Character p1){
return Byte2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(java.lang.Byte p0,java.lang.Character p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction singleton(java.lang.Byte p0,java.lang.Double p1){
return Byte2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(java.lang.Byte p0,java.lang.Double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction singleton(java.lang.Byte p0,java.lang.Float p1){
return Byte2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(java.lang.Byte p0,java.lang.Float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction singleton(java.lang.Byte p0,java.lang.Integer p1){
return Byte2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(java.lang.Byte p0,java.lang.Integer p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction singleton(java.lang.Byte p0,java.lang.Long p1){
return Byte2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(java.lang.Byte p0,java.lang.Long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> singleton(java.lang.Byte p0,V p1){
return Byte2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(java.lang.Byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction singleton(java.lang.Byte p0,java.lang.Short p1){
return Byte2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(java.lang.Byte p0,java.lang.Short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.ByteSet singleton(java.lang.Byte p0){
return ByteSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction singleton(java.lang.Character p0,java.lang.Byte p1){
return Char2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(java.lang.Character p0,java.lang.Byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction singleton(java.lang.Double p0,java.lang.Byte p1){
return Double2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(java.lang.Double p0,java.lang.Byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction singleton(java.lang.Float p0,java.lang.Byte p1){
return Float2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(java.lang.Float p0,java.lang.Byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction singleton(java.lang.Integer p0,java.lang.Byte p1){
return Int2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(java.lang.Integer p0,java.lang.Byte p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction singleton(java.lang.Long p0,java.lang.Byte p1){
return Long2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(java.lang.Long p0,java.lang.Byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ByteSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> singleton(K p0,java.lang.Byte p1){
return Object2ByteFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> singleton(K p0,java.lang.Byte p1,java.util.Comparator<? super K> p2){
return Object2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction singleton(java.lang.Short p0,java.lang.Byte p1){
return Short2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(java.lang.Short p0,java.lang.Byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ByteSortedMaps.singleton(p0,p1,p2);
}
public static int indexOf(byte[] p0,byte p1){
return Bytes.indexOf(p0,p1);
}
public static boolean contains(byte[] p0,byte p1){
return Bytes.contains(p0,p1);
}
public static int lastIndexOf(byte[] p0,byte p1){
return Bytes.lastIndexOf(p0,p1);
}
public static char fromBytes(byte p0,byte p1){
return Chars.fromBytes(p0,p1);
}
public static int fromBytes(byte p0,byte p1,byte p2,byte p3){
return Ints.fromBytes(p0,p1,p2,p3);
}
public static long fromBytes(byte p0,byte p1,byte p2,byte p3,byte p4,byte p5,byte p6,byte p7){
return Longs.fromBytes(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static byte min(byte... p0){
return SignedBytes.min(p0);
}
public static byte max(byte... p0){
return SignedBytes.max(p0);
}
public static int compare(byte p0,byte p1){
return SignedBytes.compare(p0,p1);
}
public static byte saturatedCast(long p0){
return SignedBytes.saturatedCast(p0);
}
public static byte checkedCast(long p0){
return SignedBytes.checkedCast(p0);
}
public static int toInt(byte p0){
return UnsignedBytes.toInt(p0);
}
public static byte parseUnsignedByte(java.lang.String p0,int p1){
return UnsignedBytes.parseUnsignedByte(p0,p1);
}
public static byte parseUnsignedByte(java.lang.String p0){
return UnsignedBytes.parseUnsignedByte(p0);
}
public static byte getByteValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getByteValue(p0,p1);
}
public static byte getByteValue(java.util.Map p0,java.lang.Object p1,byte p2){
return MapUtils.getByteValue(p0,p1,p2);
}
public static <K> byte getByteValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getByteValue(p0,p1);
}
public static <K> byte getByteValue(java.util.Map<? super K, ?> p0,K p1,byte p2){
return MapUtils.getByteValue(p0,p1,p2);
}
public static byte[] add(byte[] p0,int p1,byte p2){
return ArrayUtils.add(p0,p1,p2);
}
public static byte[] add(byte[] p0,byte p1){
return ArrayUtils.add(p0,p1);
}
public static int indexOf(byte[] p0,byte p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int lastIndexOf(byte[] p0,byte p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static byte[] removeElement(byte[] p0,byte p1){
return ArrayUtils.removeElement(p0,p1);
}
public static byte[] toPrimitive(java.lang.Byte[] p0,byte p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static java.lang.String byteToHex(byte p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.byteToHex(p0,p1,p2,p3,p4);
}
public static byte hexToByte(java.lang.String p0,int p1,byte p2,int p3,int p4){
return Conversion.hexToByte(p0,p1,p2,p3,p4);
}
public static boolean[] byteToBinary(byte p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.byteToBinary(p0,p1,p2,p3,p4);
}
public static byte binaryToByte(boolean[] p0,int p1,byte p2,int p3,int p4){
return Conversion.binaryToByte(p0,p1,p2,p3,p4);
}
public static byte min(byte p0,byte p1,byte p2){
return NumberUtils.min(p0,p1,p2);
}
public static byte max(byte p0,byte p1,byte p2){
return NumberUtils.max(p0,p1,p2);
}
public static byte toByte(java.lang.String p0){
return NumberUtils.toByte(p0);
}
public static byte toByte(java.lang.String p0,byte p1){
return NumberUtils.toByte(p0,p1);
}
public static byte CONST_BYTE(int p0) throws java.lang.IllegalArgumentException{
return ObjectUtils.CONST_BYTE(p0);
}
public static byte CONST(byte p0){
return ObjectUtils.CONST(p0);
}
public static byte copySign(byte p0,byte p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return MathUtils.copySign(p0,p1);
}
public static void setDefaultByte(byte p0){
 ConvertUtils.setDefaultByte(p0);
}
public static byte getDefaultByte(){
return ConvertUtils.getDefaultByte();
}
public static org.apache.commons.collections.primitives.ByteIterator singletonByteIterator(byte p0){
return ByteCollections.singletonByteIterator(p0);
}
public static org.apache.commons.collections.primitives.ByteListIterator singletonByteListIterator(byte p0){
return ByteCollections.singletonByteListIterator(p0);
}
public static org.apache.commons.collections.primitives.ByteList singletonByteList(byte p0){
return ByteCollections.singletonByteList(p0);
}
public static byte safeIntToByte(int p0){
return SafeMath.safeIntToByte(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction singleton(byte p0,boolean p1){
return Byte2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(byte p0,boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction singleton(byte p0,byte p1){
return Byte2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap singleton(byte p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction singleton(byte p0,char p1){
return Byte2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(byte p0,char p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction singleton(byte p0,double p1){
return Byte2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(byte p0,double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction singleton(byte p0,float p1){
return Byte2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(byte p0,float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction singleton(byte p0,int p1){
return Byte2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(byte p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction singleton(byte p0,long p1){
return Byte2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(byte p0,long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> singleton(byte p0,V p1){
return Byte2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> singleton(byte p0,V p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction singleton(byte p0,short p1){
return Byte2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(byte p0,short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ShortSortedMaps.singleton(p0,p1,p2);
}
public static void fill(byte[] p0,int p1,int p2,byte p3){
 ByteArrays.fill(p0,p1,p2,p3);
}
public static void fill(byte[] p0,byte p1){
 ByteArrays.fill(p0,p1);
}
public static int binarySearch(byte[] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return ByteArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(byte[] p0,int p1,int p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static int binarySearch(byte[] p0,byte p1){
return ByteArrays.binarySearch(p0,p1);
}
public static int binarySearch(byte[] p0,int p1,int p2,byte p3){
return ByteArrays.binarySearch(p0,p1,p2,p3);
}
public static void add(byte[][] p0,long p1,byte p2){
 ByteBigArrays.add(p0,p1,p2);
}
public static void set(byte[][] p0,long p1,byte p2){
 ByteBigArrays.set(p0,p1,p2);
}
public static void fill(byte[][] p0,byte p1){
 ByteBigArrays.fill(p0,p1);
}
public static void fill(byte[][] p0,long p1,long p2,byte p3){
 ByteBigArrays.fill(p0,p1,p2,p3);
}
public static long binarySearch(byte[][] p0,long p1,long p2,byte p3){
return ByteBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(byte[][] p0,long p1,long p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(byte[][] p0,byte p1){
return ByteBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(byte[][] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return ByteBigArrays.binarySearch(p0,p1,p2);
}
public static void mul(byte[][] p0,long p1,byte p2){
 ByteBigArrays.mul(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigListIterator singleton(byte p0){
return ByteBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteListIterator fromTo(byte p0,byte p1){
return ByteIterators.fromTo(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet singleton(byte p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
return ByteSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction singleton(char p0,byte p1){
return Char2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(char p0,byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction singleton(double p0,byte p1){
return Double2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(double p0,byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction singleton(float p0,byte p1){
return Float2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(float p0,byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction singleton(int p0,byte p1){
return Int2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(int p0,byte p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction singleton(long p0,byte p1){
return Long2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(long p0,byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ByteSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> singleton(K p0,byte p1){
return Object2ByteFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> singleton(K p0,byte p1,java.util.Comparator<? super K> p2){
return Object2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction singleton(short p0,byte p1){
return Short2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(short p0,byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ByteSortedMaps.singleton(p0,p1,p2);
}
public static java.util.List<byte[]> unpackComparable(byte[] p0,byte p1,byte p2){
return PackedByteArray.unpackComparable(p0,p1,p2);
}
public static byte[] packComparable(java.util.List<byte[]> p0,byte p1,byte p2){
return PackedByteArray.packComparable(p0,p1,p2);
}
public static byte[] readByteArray(java.io.DataInput p0,byte p1) throws java.io.IOException{
return PackedByteArray.readByteArray(p0,p1);
}
public static java.util.List<byte[]> readByteArrayList(java.io.DataInput p0,byte p1,byte p2) throws java.io.IOException{
return PackedByteArray.readByteArrayList(p0,p1,p2);
}
public static byte min(byte[] p0){
return NumberUtils.min(p0);
}
public static byte max(byte[] p0){
return NumberUtils.max(p0);
}
}
