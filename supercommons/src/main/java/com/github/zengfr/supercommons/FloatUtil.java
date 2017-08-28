package com.github.zengfr.supercommons;
import com.google.common.primitives.Floats;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.math.NumberUtils;
import it.unimi.dsi.fastutil.bytes.Byte2FloatFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2FloatMaps;
import it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatFunctions;
import it.unimi.dsi.fastutil.chars.Char2FloatMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2FloatFunctions;
import it.unimi.dsi.fastutil.doubles.Double2FloatMaps;
import it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2BooleanFunctions;
import it.unimi.dsi.fastutil.floats.Float2BooleanMaps;
import it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ByteFunctions;
import it.unimi.dsi.fastutil.floats.Float2ByteMaps;
import it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2CharFunctions;
import it.unimi.dsi.fastutil.floats.Float2CharMaps;
import it.unimi.dsi.fastutil.floats.Float2CharSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2DoubleFunctions;
import it.unimi.dsi.fastutil.floats.Float2DoubleMaps;
import it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2FloatFunctions;
import it.unimi.dsi.fastutil.floats.Float2FloatMaps;
import it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2IntFunctions;
import it.unimi.dsi.fastutil.floats.Float2IntMaps;
import it.unimi.dsi.fastutil.floats.Float2IntSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2LongFunctions;
import it.unimi.dsi.fastutil.floats.Float2LongMaps;
import it.unimi.dsi.fastutil.floats.Float2LongSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ObjectFunctions;
import it.unimi.dsi.fastutil.floats.Float2ObjectMaps;
import it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions;
import it.unimi.dsi.fastutil.floats.Float2ReferenceMaps;
import it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ShortFunctions;
import it.unimi.dsi.fastutil.floats.Float2ShortMaps;
import it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps;
import it.unimi.dsi.fastutil.floats.FloatSets;
import it.unimi.dsi.fastutil.ints.Int2FloatFunctions;
import it.unimi.dsi.fastutil.ints.Int2FloatMaps;
import it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2FloatFunctions;
import it.unimi.dsi.fastutil.longs.Long2FloatMaps;
import it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatFunctions;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatFunctions;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2FloatFunctions;
import it.unimi.dsi.fastutil.shorts.Short2FloatMaps;
import it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.NumberUtils;
import org.apache.commons.io.EndianUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.IEEE754rUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.collections.primitives.FloatCollections;
import it.unimi.dsi.fastutil.HashCommon;
import it.unimi.dsi.fastutil.SafeMath;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatBigArrays;
import it.unimi.dsi.fastutil.floats.FloatBigListIterators;
import it.unimi.dsi.fastutil.floats.FloatBigLists;
import it.unimi.dsi.fastutil.floats.FloatIterators;
import it.unimi.dsi.fastutil.floats.FloatLists;
import it.unimi.dsi.fastutil.floats.FloatSortedSets;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.math.IEEE754rUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang.SystemUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatUtil{ 
public static java.lang.Float tryParse(java.lang.String p0){
return Floats.tryParse(p0);
}
public static java.lang.Float getFloat(java.util.Map p0,java.lang.Object p1,java.lang.Float p2){
return MapUtils.getFloat(p0,p1,p2);
}
public static java.lang.Float getFloat(java.util.Map p0,java.lang.Object p1){
return MapUtils.getFloat(p0,p1);
}
public static <K> java.lang.Float getFloat(java.util.Map<? super K, ?> p0,K p1,java.lang.Float p2){
return MapUtils.getFloat(p0,p1,p2);
}
public static <K> java.lang.Float getFloat(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getFloat(p0,p1);
}
public static java.lang.Float createFloat(java.lang.String p0){
return NumberUtils.createFloat(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction singleton(java.lang.Byte p0,java.lang.Float p1){
return Byte2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(java.lang.Byte p0,java.lang.Float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction singleton(java.lang.Character p0,java.lang.Float p1){
return Char2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(java.lang.Character p0,java.lang.Float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction singleton(java.lang.Double p0,java.lang.Float p1){
return Double2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(java.lang.Double p0,java.lang.Float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction singleton(java.lang.Float p0,java.lang.Boolean p1){
return Float2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(java.lang.Float p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction singleton(java.lang.Float p0,java.lang.Byte p1){
return Float2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(java.lang.Float p0,java.lang.Byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2CharFunction singleton(java.lang.Float p0,java.lang.Character p1){
return Float2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(java.lang.Float p0,java.lang.Character p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction singleton(java.lang.Float p0,java.lang.Double p1){
return Float2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(java.lang.Float p0,java.lang.Double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatFunction singleton(java.lang.Float p0,java.lang.Float p1){
return Float2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap singleton(java.lang.Float p0,java.lang.Float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2IntFunction singleton(java.lang.Float p0,java.lang.Integer p1){
return Float2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(java.lang.Float p0,java.lang.Integer p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2LongFunction singleton(java.lang.Float p0,java.lang.Long p1){
return Float2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(java.lang.Float p0,java.lang.Long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> singleton(java.lang.Float p0,V p1){
return Float2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(java.lang.Float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction singleton(java.lang.Float p0,java.lang.Short p1){
return Float2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(java.lang.Float p0,java.lang.Short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.FloatSet singleton(java.lang.Float p0){
return FloatSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction singleton(java.lang.Integer p0,java.lang.Float p1){
return Int2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(java.lang.Integer p0,java.lang.Float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction singleton(java.lang.Long p0,java.lang.Float p1){
return Long2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(java.lang.Long p0,java.lang.Float p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2FloatSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> singleton(K p0,java.lang.Float p1){
return Object2FloatFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> singleton(K p0,java.lang.Float p1,java.util.Comparator<? super K> p2){
return Object2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction singleton(java.lang.Short p0,java.lang.Float p1){
return Short2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(java.lang.Short p0,java.lang.Float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2FloatSortedMaps.singleton(p0,p1,p2);
}
public static float min(float... p0){
return Floats.min(p0);
}
public static float max(float... p0){
return Floats.max(p0);
}
public static int indexOf(float[] p0,float p1){
return Floats.indexOf(p0,p1);
}
public static int compare(float p0,float p1){
return Floats.compare(p0,p1);
}
public static boolean contains(float[] p0,float p1){
return Floats.contains(p0,p1);
}
public static int lastIndexOf(float[] p0,float p1){
return Floats.lastIndexOf(p0,p1);
}
public static boolean isFinite(float p0){
return Floats.isFinite(p0);
}
public static float readSwappedFloat(byte[] p0,int p1){
return EndianUtils.readSwappedFloat(p0,p1);
}
public static float readSwappedFloat(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedFloat(p0);
}
public static float swapFloat(float p0){
return EndianUtils.swapFloat(p0);
}
public static void writeSwappedFloat(java.io.OutputStream p0,float p1) throws java.io.IOException{
 EndianUtils.writeSwappedFloat(p0,p1);
}
public static void writeSwappedFloat(byte[] p0,int p1,float p2){
 EndianUtils.writeSwappedFloat(p0,p1,p2);
}
public static float getFloatValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getFloatValue(p0,p1);
}
public static float getFloatValue(java.util.Map p0,java.lang.Object p1,float p2){
return MapUtils.getFloatValue(p0,p1,p2);
}
public static <K> float getFloatValue(java.util.Map<? super K, ?> p0,K p1,float p2){
return MapUtils.getFloatValue(p0,p1,p2);
}
public static <K> float getFloatValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getFloatValue(p0,p1);
}
public static float[] add(float[] p0,int p1,float p2){
return ArrayUtils.add(p0,p1,p2);
}
public static float[] add(float[] p0,float p1){
return ArrayUtils.add(p0,p1);
}
public static int indexOf(float[] p0,float p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int lastIndexOf(float[] p0,float p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static float[] removeElement(float[] p0,float p1){
return ArrayUtils.removeElement(p0,p1);
}
public static float[] toPrimitive(java.lang.Float[] p0,float p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static float min(float p0,float p1,float p2){
return IEEE754rUtils.min(p0,p1,p2);
}
public static float min(float p0,float p1){
return IEEE754rUtils.min(p0,p1);
}
public static float max(float p0,float p1,float p2){
return IEEE754rUtils.max(p0,p1,p2);
}
public static float max(float p0,float p1){
return IEEE754rUtils.max(p0,p1);
}
public static float toFloat(java.lang.String p0,float p1){
return NumberUtils.toFloat(p0,p1);
}
public static float toFloat(java.lang.String p0){
return NumberUtils.toFloat(p0);
}
public static float CONST(float p0){
return ObjectUtils.CONST(p0);
}
public static float nextFloat(float p0,float p1){
return RandomUtils.nextFloat(p0,p1);
}
public static float abs(float p0){
return FastMath.abs(p0);
}
public static float scalb(float p0,int p1){
return FastMath.scalb(p0,p1);
}
public static float copySign(float p0,float p1){
return FastMath.copySign(p0,p1);
}
public static int getExponent(float p0){
return FastMath.getExponent(p0);
}
public static float signum(float p0){
return FastMath.signum(p0);
}
public static float nextAfter(float p0,double p1){
return FastMath.nextAfter(p0,p1);
}
public static float nextDown(float p0){
return FastMath.nextDown(p0);
}
public static float nextUp(float p0){
return FastMath.nextUp(p0);
}
public static int round(float p0){
return FastMath.round(p0);
}
public static float ulp(float p0){
return FastMath.ulp(p0);
}
public static float round(float p0,int p1){
return Precision.round(p0,p1);
}
public static float round(float p0,int p1,int p2) throws org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.exception.MathIllegalArgumentException{
return Precision.round(p0,p1,p2);
}
public static boolean equalsIncludingNaN(float p0,float p1,int p2){
return Precision.equalsIncludingNaN(p0,p1,p2);
}
public static boolean equalsIncludingNaN(float p0,float p1,float p2){
return Precision.equalsIncludingNaN(p0,p1,p2);
}
public static boolean equalsIncludingNaN(float p0,float p1){
return Precision.equalsIncludingNaN(p0,p1);
}
public static float getDefaultFloat(){
return ConvertUtils.getDefaultFloat();
}
public static void setDefaultFloat(float p0){
 ConvertUtils.setDefaultFloat(p0);
}
public static org.apache.commons.collections.primitives.FloatIterator singletonFloatIterator(float p0){
return FloatCollections.singletonFloatIterator(p0);
}
public static org.apache.commons.collections.primitives.FloatList singletonFloatList(float p0){
return FloatCollections.singletonFloatList(p0);
}
public static org.apache.commons.collections.primitives.FloatListIterator singletonFloatListIterator(float p0){
return FloatCollections.singletonFloatListIterator(p0);
}
public static int arraySize(int p0,float p1){
return HashCommon.arraySize(p0,p1);
}
public static long bigArraySize(long p0,float p1){
return HashCommon.bigArraySize(p0,p1);
}
public static int maxFill(int p0,float p1){
return HashCommon.maxFill(p0,p1);
}
public static long maxFill(long p0,float p1){
return HashCommon.maxFill(p0,p1);
}
public static int float2int(float p0){
return HashCommon.float2int(p0);
}
public static float safeDoubleToFloat(double p0){
return SafeMath.safeDoubleToFloat(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction singleton(byte p0,float p1){
return Byte2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap singleton(byte p0,float p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction singleton(char p0,float p1){
return Char2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(char p0,float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction singleton(double p0,float p1){
return Double2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(double p0,float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction singleton(float p0,boolean p1){
return Float2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(float p0,boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction singleton(float p0,byte p1){
return Float2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(float p0,byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2CharFunction singleton(float p0,char p1){
return Float2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(float p0,char p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction singleton(float p0,double p1){
return Float2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(float p0,double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatFunction singleton(float p0,float p1){
return Float2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap singleton(float p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2IntFunction singleton(float p0,int p1){
return Float2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(float p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2LongFunction singleton(float p0,long p1){
return Float2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(float p0,long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> singleton(float p0,V p1){
return Float2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction singleton(float p0,short p1){
return Float2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(float p0,short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2ShortSortedMaps.singleton(p0,p1,p2);
}
public static void fill(float[] p0,int p1,int p2,float p3){
 FloatArrays.fill(p0,p1,p2,p3);
}
public static void fill(float[] p0,float p1){
 FloatArrays.fill(p0,p1);
}
public static int binarySearch(float[] p0,int p1,int p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static int binarySearch(float[] p0,float p1){
return FloatArrays.binarySearch(p0,p1);
}
public static int binarySearch(float[] p0,int p1,int p2,float p3){
return FloatArrays.binarySearch(p0,p1,p2,p3);
}
public static int binarySearch(float[] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return FloatArrays.binarySearch(p0,p1,p2);
}
public static void add(float[][] p0,long p1,float p2){
 FloatBigArrays.add(p0,p1,p2);
}
public static void set(float[][] p0,long p1,float p2){
 FloatBigArrays.set(p0,p1,p2);
}
public static void fill(float[][] p0,long p1,long p2,float p3){
 FloatBigArrays.fill(p0,p1,p2,p3);
}
public static void fill(float[][] p0,float p1){
 FloatBigArrays.fill(p0,p1);
}
public static long binarySearch(float[][] p0,long p1,long p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(float[][] p0,long p1,long p2,float p3){
return FloatBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(float[][] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return FloatBigArrays.binarySearch(p0,p1,p2);
}
public static long binarySearch(float[][] p0,float p1){
return FloatBigArrays.binarySearch(p0,p1);
}
public static void mul(float[][] p0,long p1,float p2){
 FloatBigArrays.mul(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.FloatBigListIterator singleton(float p0){
return FloatBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(float p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
return FloatSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction singleton(int p0,float p1){
return Int2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(int p0,float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction singleton(long p0,float p1){
return Long2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(long p0,float p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2FloatSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> singleton(K p0,float p1){
return Object2FloatFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> singleton(K p0,float p1,java.util.Comparator<? super K> p2){
return Object2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction singleton(short p0,float p1){
return Short2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap singleton(short p0,float p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2FloatSortedMaps.singleton(p0,p1,p2);
}
public static float min(float[] p0){
return IEEE754rUtils.min(p0);
}
public static float max(float[] p0){
return IEEE754rUtils.max(p0);
}
public static float nextFloat(){
return RandomUtils.nextFloat();
}
public static float nextFloat(java.util.Random p0){
return RandomUtils.nextFloat(p0);
}
public static float getJavaVersion(){
return SystemUtils.getJavaVersion();
}
public static boolean isJavaVersionAtLeast(float p0){
return SystemUtils.isJavaVersionAtLeast(p0);
}
}
