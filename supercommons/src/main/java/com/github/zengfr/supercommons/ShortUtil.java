package com.zengfr.supercommons;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections4.MapUtils;
import it.unimi.dsi.fastutil.bytes.Byte2ShortFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ShortMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortFunctions;
import it.unimi.dsi.fastutil.chars.Char2ShortMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ShortFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ShortMaps;
import it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ShortFunctions;
import it.unimi.dsi.fastutil.floats.Float2ShortMaps;
import it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ShortFunctions;
import it.unimi.dsi.fastutil.ints.Int2ShortMaps;
import it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ShortFunctions;
import it.unimi.dsi.fastutil.longs.Long2ShortMaps;
import it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ShortFunctions;
import it.unimi.dsi.fastutil.objects.Object2ShortMaps;
import it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ShortFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ShortMaps;
import it.unimi.dsi.fastutil.objects.Reference2ShortSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMaps;
import it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ByteFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ByteMaps;
import it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharFunctions;
import it.unimi.dsi.fastutil.shorts.Short2CharMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2DoubleFunctions;
import it.unimi.dsi.fastutil.shorts.Short2DoubleMaps;
import it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2FloatFunctions;
import it.unimi.dsi.fastutil.shorts.Short2FloatMaps;
import it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntFunctions;
import it.unimi.dsi.fastutil.shorts.Short2IntMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2LongFunctions;
import it.unimi.dsi.fastutil.shorts.Short2LongMaps;
import it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMaps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ShortFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ShortMaps;
import it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps;
import it.unimi.dsi.fastutil.shorts.ShortSets;
import com.google.common.primitives.Shorts;
import org.apache.commons.io.EndianUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Conversion;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.collections.primitives.ShortCollections;
import it.unimi.dsi.fastutil.SafeMath;
import it.unimi.dsi.fastutil.shorts.ShortArrays;
import it.unimi.dsi.fastutil.shorts.ShortBigArrays;
import it.unimi.dsi.fastutil.shorts.ShortBigListIterators;
import it.unimi.dsi.fastutil.shorts.ShortBigLists;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
import it.unimi.dsi.fastutil.shorts.ShortLists;
import it.unimi.dsi.fastutil.shorts.ShortSortedSets;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.math.NumberUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortUtil{ 
public static java.lang.Short getShort(java.util.Map p0,java.lang.Object p1){
return MapUtils.getShort(p0,p1);
}
public static java.lang.Short getShort(java.util.Map p0,java.lang.Object p1,java.lang.Short p2){
return MapUtils.getShort(p0,p1,p2);
}
public static <K> java.lang.Short getShort(java.util.Map<? super K, ?> p0,K p1,java.lang.Short p2){
return MapUtils.getShort(p0,p1,p2);
}
public static <K> java.lang.Short getShort(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getShort(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction singleton(java.lang.Byte p0,java.lang.Short p1){
return Byte2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(java.lang.Byte p0,java.lang.Short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction singleton(java.lang.Character p0,java.lang.Short p1){
return Char2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(java.lang.Character p0,java.lang.Short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction singleton(java.lang.Double p0,java.lang.Short p1){
return Double2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(java.lang.Double p0,java.lang.Short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction singleton(java.lang.Float p0,java.lang.Short p1){
return Float2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(java.lang.Float p0,java.lang.Short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction singleton(java.lang.Integer p0,java.lang.Short p1){
return Int2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(java.lang.Integer p0,java.lang.Short p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction singleton(java.lang.Long p0,java.lang.Short p1){
return Long2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(java.lang.Long p0,java.lang.Short p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ShortSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> singleton(K p0,java.lang.Short p1){
return Object2ShortFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> singleton(K p0,java.lang.Short p1,java.util.Comparator<? super K> p2){
return Object2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction singleton(java.lang.Short p0,java.lang.Boolean p1){
return Short2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(java.lang.Short p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction singleton(java.lang.Short p0,java.lang.Byte p1){
return Short2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(java.lang.Short p0,java.lang.Byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction singleton(java.lang.Short p0,java.lang.Character p1){
return Short2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(java.lang.Short p0,java.lang.Character p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction singleton(java.lang.Short p0,java.lang.Double p1){
return Short2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(java.lang.Short p0,java.lang.Double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction singleton(java.lang.Short p0,java.lang.Float p1){
return Short2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(java.lang.Short p0,java.lang.Float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction singleton(java.lang.Short p0,java.lang.Integer p1){
return Short2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(java.lang.Short p0,java.lang.Integer p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction singleton(java.lang.Short p0,java.lang.Long p1){
return Short2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(java.lang.Short p0,java.lang.Long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> singleton(java.lang.Short p0,V p1){
return Short2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(java.lang.Short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction singleton(java.lang.Short p0,java.lang.Short p1){
return Short2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap singleton(java.lang.Short p0,java.lang.Short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.ShortSet singleton(java.lang.Short p0){
return ShortSets.singleton(p0);
}
public static short min(short... p0){
return Shorts.min(p0);
}
public static short max(short... p0){
return Shorts.max(p0);
}
public static int indexOf(short[] p0,short p1){
return Shorts.indexOf(p0,p1);
}
public static int compare(short p0,short p1){
return Shorts.compare(p0,p1);
}
public static boolean contains(short[] p0,short p1){
return Shorts.contains(p0,p1);
}
public static int lastIndexOf(short[] p0,short p1){
return Shorts.lastIndexOf(p0,p1);
}
public static byte[] toByteArray(short p0){
return Shorts.toByteArray(p0);
}
public static short saturatedCast(long p0){
return Shorts.saturatedCast(p0);
}
public static short fromByteArray(byte[] p0){
return Shorts.fromByteArray(p0);
}
public static short fromBytes(byte p0,byte p1){
return Shorts.fromBytes(p0,p1);
}
public static short checkedCast(long p0){
return Shorts.checkedCast(p0);
}
public static short swapShort(short p0){
return EndianUtils.swapShort(p0);
}
public static short readSwappedShort(byte[] p0,int p1){
return EndianUtils.readSwappedShort(p0,p1);
}
public static short readSwappedShort(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedShort(p0);
}
public static void writeSwappedShort(java.io.OutputStream p0,short p1) throws java.io.IOException{
 EndianUtils.writeSwappedShort(p0,p1);
}
public static void writeSwappedShort(byte[] p0,int p1,short p2){
 EndianUtils.writeSwappedShort(p0,p1,p2);
}
public static short getShortValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getShortValue(p0,p1);
}
public static short getShortValue(java.util.Map p0,java.lang.Object p1,short p2){
return MapUtils.getShortValue(p0,p1,p2);
}
public static <K> short getShortValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getShortValue(p0,p1);
}
public static <K> short getShortValue(java.util.Map<? super K, ?> p0,K p1,short p2){
return MapUtils.getShortValue(p0,p1,p2);
}
public static short[] add(short[] p0,short p1){
return ArrayUtils.add(p0,p1);
}
public static short[] add(short[] p0,int p1,short p2){
return ArrayUtils.add(p0,p1,p2);
}
public static int indexOf(short[] p0,short p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int lastIndexOf(short[] p0,short p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static short[] removeElement(short[] p0,short p1){
return ArrayUtils.removeElement(p0,p1);
}
public static short[] toPrimitive(java.lang.Short[] p0,short p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static java.lang.String shortToHex(short p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.shortToHex(p0,p1,p2,p3,p4);
}
public static short hexToShort(java.lang.String p0,int p1,short p2,int p3,int p4){
return Conversion.hexToShort(p0,p1,p2,p3,p4);
}
public static boolean[] shortToBinary(short p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.shortToBinary(p0,p1,p2,p3,p4);
}
public static byte[] shortToByteArray(short p0,int p1,byte[] p2,int p3,int p4){
return Conversion.shortToByteArray(p0,p1,p2,p3,p4);
}
public static short byteArrayToShort(byte[] p0,int p1,short p2,int p3,int p4){
return Conversion.byteArrayToShort(p0,p1,p2,p3,p4);
}
public static short binaryToShort(boolean[] p0,int p1,short p2,int p3,int p4){
return Conversion.binaryToShort(p0,p1,p2,p3,p4);
}
public static short min(short p0,short p1,short p2){
return NumberUtils.min(p0,p1,p2);
}
public static short max(short p0,short p1,short p2){
return NumberUtils.max(p0,p1,p2);
}
public static short toShort(java.lang.String p0){
return NumberUtils.toShort(p0);
}
public static short toShort(java.lang.String p0,short p1){
return NumberUtils.toShort(p0,p1);
}
public static short CONST_SHORT(int p0) throws java.lang.IllegalArgumentException{
return ObjectUtils.CONST_SHORT(p0);
}
public static short CONST(short p0){
return ObjectUtils.CONST(p0);
}
public static short copySign(short p0,short p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return MathUtils.copySign(p0,p1);
}
public static void setDefaultShort(short p0){
 ConvertUtils.setDefaultShort(p0);
}
public static short getDefaultShort(){
return ConvertUtils.getDefaultShort();
}
public static org.apache.commons.collections.primitives.ShortIterator singletonShortIterator(short p0){
return ShortCollections.singletonShortIterator(p0);
}
public static org.apache.commons.collections.primitives.ShortList singletonShortList(short p0){
return ShortCollections.singletonShortList(p0);
}
public static org.apache.commons.collections.primitives.ShortListIterator singletonShortListIterator(short p0){
return ShortCollections.singletonShortListIterator(p0);
}
public static short safeIntToShort(int p0){
return SafeMath.safeIntToShort(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction singleton(byte p0,short p1){
return Byte2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap singleton(byte p0,short p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction singleton(char p0,short p1){
return Char2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(char p0,short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction singleton(double p0,short p1){
return Double2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(double p0,short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction singleton(float p0,short p1){
return Float2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(float p0,short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction singleton(int p0,short p1){
return Int2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(int p0,short p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction singleton(long p0,short p1){
return Long2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(long p0,short p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ShortSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> singleton(K p0,short p1){
return Object2ShortFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> singleton(K p0,short p1,java.util.Comparator<? super K> p2){
return Object2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction singleton(short p0,boolean p1){
return Short2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(short p0,boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction singleton(short p0,byte p1){
return Short2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap singleton(short p0,byte p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction singleton(short p0,char p1){
return Short2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(short p0,char p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction singleton(short p0,double p1){
return Short2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(short p0,double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction singleton(short p0,float p1){
return Short2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(short p0,float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction singleton(short p0,int p1){
return Short2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(short p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction singleton(short p0,long p1){
return Short2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(short p0,long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> singleton(short p0,V p1){
return Short2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> singleton(short p0,V p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction singleton(short p0,short p1){
return Short2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap singleton(short p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2ShortSortedMaps.singleton(p0,p1,p2);
}
public static void fill(short[] p0,int p1,int p2,short p3){
 ShortArrays.fill(p0,p1,p2,p3);
}
public static void fill(short[] p0,short p1){
 ShortArrays.fill(p0,p1);
}
public static int binarySearch(short[] p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return ShortArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(short[] p0,int p1,int p2,short p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static int binarySearch(short[] p0,short p1){
return ShortArrays.binarySearch(p0,p1);
}
public static int binarySearch(short[] p0,int p1,int p2,short p3){
return ShortArrays.binarySearch(p0,p1,p2,p3);
}
public static void add(short[][] p0,long p1,short p2){
 ShortBigArrays.add(p0,p1,p2);
}
public static void set(short[][] p0,long p1,short p2){
 ShortBigArrays.set(p0,p1,p2);
}
public static void fill(short[][] p0,short p1){
 ShortBigArrays.fill(p0,p1);
}
public static void fill(short[][] p0,long p1,long p2,short p3){
 ShortBigArrays.fill(p0,p1,p2,p3);
}
public static long binarySearch(short[][] p0,long p1,long p2,short p3){
return ShortBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(short[][] p0,long p1,long p2,short p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(short[][] p0,short p1){
return ShortBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(short[][] p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return ShortBigArrays.binarySearch(p0,p1,p2);
}
public static void mul(short[][] p0,long p1,short p2){
 ShortBigArrays.mul(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigListIterator singleton(short p0){
return ShortBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortListIterator fromTo(short p0,short p1){
return ShortIterators.fromTo(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet singleton(short p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
return ShortSortedSets.singleton(p0,p1);
}
public static short min(short[] p0){
return NumberUtils.min(p0);
}
public static short max(short[] p0){
return NumberUtils.max(p0);
}
}
