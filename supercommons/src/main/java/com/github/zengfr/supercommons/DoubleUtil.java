package com.zengfr.supercommons;
import com.google.common.primitives.Doubles;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.math.NumberUtils;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleFunctions;
import it.unimi.dsi.fastutil.chars.Char2DoubleMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions;
import it.unimi.dsi.fastutil.doubles.Double2BooleanMaps;
import it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ByteFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ByteMaps;
import it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2CharFunctions;
import it.unimi.dsi.fastutil.doubles.Double2CharMaps;
import it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2DoubleFunctions;
import it.unimi.dsi.fastutil.doubles.Double2DoubleMaps;
import it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2FloatFunctions;
import it.unimi.dsi.fastutil.doubles.Double2FloatMaps;
import it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntFunctions;
import it.unimi.dsi.fastutil.doubles.Double2IntMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2LongFunctions;
import it.unimi.dsi.fastutil.doubles.Double2LongMaps;
import it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ObjectMaps;
import it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ShortFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ShortMaps;
import it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps;
import it.unimi.dsi.fastutil.doubles.DoubleSets;
import it.unimi.dsi.fastutil.floats.Float2DoubleFunctions;
import it.unimi.dsi.fastutil.floats.Float2DoubleMaps;
import it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2DoubleFunctions;
import it.unimi.dsi.fastutil.ints.Int2DoubleMaps;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2DoubleFunctions;
import it.unimi.dsi.fastutil.longs.Long2DoubleMaps;
import it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2DoubleFunctions;
import it.unimi.dsi.fastutil.objects.Object2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleFunctions;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2DoubleFunctions;
import it.unimi.dsi.fastutil.shorts.Short2DoubleMaps;
import it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.NumberUtils;
import com.google.common.hash.BloomFilter;
import com.google.common.math.DoubleMath;
import com.google.common.util.concurrent.RateLimiter;
import org.apache.commons.io.EndianUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.lang3.math.IEEE754rUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.math3.ml.neuralnet.MapUtils;
import org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunctionFactory;
import org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunctionFactory;
import org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.differentiation.SparseGradient;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math3.analysis.polynomials.PolynomialsUtils;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
import org.apache.commons.math3.stat.interval.IntervalUtils;
import org.apache.commons.math3.stat.inference.TestUtils;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.rank.PSquarePercentile;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.complex.ComplexUtils;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.Quaternion;
import org.apache.commons.math3.special.Beta;
import org.apache.commons.math3.special.Erf;
import org.apache.commons.math3.special.BesselJ;
import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.geometry.spherical.twod.S2Point;
import org.apache.commons.math3.geometry.spherical.oned.S1Point;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.util.CompositeFormat;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.transform.TransformUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.collections.primitives.DoubleCollections;
import it.unimi.dsi.fastutil.HashCommon;
import it.unimi.dsi.fastutil.SafeMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.doubles.DoubleBigArrays;
import it.unimi.dsi.fastutil.doubles.DoubleBigListIterators;
import it.unimi.dsi.fastutil.doubles.DoubleBigLists;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.doubles.DoubleLists;
import it.unimi.dsi.fastutil.doubles.DoubleSortedSets;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.math.Fraction;
import org.apache.commons.lang.math.IEEE754rUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang.Validate;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleUtil{ 
public static java.lang.Double tryParse(java.lang.String p0){
return Doubles.tryParse(p0);
}
public static java.lang.Double getDouble(java.util.Map p0,java.lang.Object p1,java.lang.Double p2){
return MapUtils.getDouble(p0,p1,p2);
}
public static java.lang.Double getDouble(java.util.Map p0,java.lang.Object p1){
return MapUtils.getDouble(p0,p1);
}
public static <K> java.lang.Double getDouble(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getDouble(p0,p1);
}
public static <K> java.lang.Double getDouble(java.util.Map<? super K, ?> p0,K p1,java.lang.Double p2){
return MapUtils.getDouble(p0,p1,p2);
}
public static java.lang.Double createDouble(java.lang.String p0){
return NumberUtils.createDouble(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction singleton(java.lang.Byte p0,java.lang.Double p1){
return Byte2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(java.lang.Byte p0,java.lang.Double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction singleton(java.lang.Character p0,java.lang.Double p1){
return Char2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(java.lang.Character p0,java.lang.Double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction singleton(java.lang.Double p0,java.lang.Boolean p1){
return Double2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(java.lang.Double p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction singleton(java.lang.Double p0,java.lang.Byte p1){
return Double2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(java.lang.Double p0,java.lang.Byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction singleton(java.lang.Double p0,java.lang.Character p1){
return Double2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(java.lang.Double p0,java.lang.Character p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction singleton(java.lang.Double p0,java.lang.Double p1){
return Double2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap singleton(java.lang.Double p0,java.lang.Double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction singleton(java.lang.Double p0,java.lang.Float p1){
return Double2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(java.lang.Double p0,java.lang.Float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction singleton(java.lang.Double p0,java.lang.Integer p1){
return Double2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(java.lang.Double p0,java.lang.Integer p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction singleton(java.lang.Double p0,java.lang.Long p1){
return Double2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(java.lang.Double p0,java.lang.Long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> singleton(java.lang.Double p0,V p1){
return Double2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(java.lang.Double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction singleton(java.lang.Double p0,java.lang.Short p1){
return Double2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(java.lang.Double p0,java.lang.Short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSet singleton(java.lang.Double p0){
return DoubleSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction singleton(java.lang.Float p0,java.lang.Double p1){
return Float2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(java.lang.Float p0,java.lang.Double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction singleton(java.lang.Integer p0,java.lang.Double p1){
return Int2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(java.lang.Integer p0,java.lang.Double p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction singleton(java.lang.Long p0,java.lang.Double p1){
return Long2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(java.lang.Long p0,java.lang.Double p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> singleton(K p0,java.lang.Double p1){
return Object2DoubleFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> singleton(K p0,java.lang.Double p1,java.util.Comparator<? super K> p2){
return Object2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction singleton(java.lang.Short p0,java.lang.Double p1){
return Short2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(java.lang.Short p0,java.lang.Double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> p0,long p1,double p2){
return BloomFilter.create(p0,p1,p2);
}
public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> p0,int p1,double p2){
return BloomFilter.create(p0,p1,p2);
}
public static double factorial(int p0){
return DoubleMath.factorial(p0);
}
public static boolean isMathematicalInteger(double p0){
return DoubleMath.isMathematicalInteger(p0);
}
public static java.math.BigInteger roundToBigInteger(double p0,java.math.RoundingMode p1){
return DoubleMath.roundToBigInteger(p0,p1);
}
public static double log2(double p0){
return DoubleMath.log2(p0);
}
public static int log2(double p0,java.math.RoundingMode p1){
return DoubleMath.log2(p0,p1);
}
public static boolean isPowerOfTwo(double p0){
return DoubleMath.isPowerOfTwo(p0);
}
public static long roundToLong(double p0,java.math.RoundingMode p1){
return DoubleMath.roundToLong(p0,p1);
}
public static boolean fuzzyEquals(double p0,double p1,double p2){
return DoubleMath.fuzzyEquals(p0,p1,p2);
}
public static int fuzzyCompare(double p0,double p1,double p2){
return DoubleMath.fuzzyCompare(p0,p1,p2);
}
public static double mean(java.lang.Iterable<? extends java.lang.Number> p0){
return DoubleMath.mean(p0);
}
public static double mean(java.util.Iterator<? extends java.lang.Number> p0){
return DoubleMath.mean(p0);
}
public static double mean(double... p0){
return DoubleMath.mean(p0);
}
public static double mean(int... p0){
return DoubleMath.mean(p0);
}
public static double mean(long... p0){
return DoubleMath.mean(p0);
}
public static int roundToInt(double p0,java.math.RoundingMode p1){
return DoubleMath.roundToInt(p0,p1);
}
public static double min(double... p0){
return Doubles.min(p0);
}
public static double max(double... p0){
return Doubles.max(p0);
}
public static int indexOf(double[] p0,double p1){
return Doubles.indexOf(p0,p1);
}
public static int compare(double p0,double p1){
return Doubles.compare(p0,p1);
}
public static boolean contains(double[] p0,double p1){
return Doubles.contains(p0,p1);
}
public static int lastIndexOf(double[] p0,double p1){
return Doubles.lastIndexOf(p0,p1);
}
public static boolean isFinite(double p0){
return Doubles.isFinite(p0);
}
public static com.google.common.util.concurrent.RateLimiter create(double p0){
return RateLimiter.create(p0);
}
public static com.google.common.util.concurrent.RateLimiter create(double p0,long p1,java.util.concurrent.TimeUnit p2){
return RateLimiter.create(p0,p1,p2);
}
public static double swapDouble(double p0){
return EndianUtils.swapDouble(p0);
}
public static double readSwappedDouble(byte[] p0,int p1){
return EndianUtils.readSwappedDouble(p0,p1);
}
public static double readSwappedDouble(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedDouble(p0);
}
public static void writeSwappedDouble(java.io.OutputStream p0,double p1) throws java.io.IOException{
 EndianUtils.writeSwappedDouble(p0,p1);
}
public static void writeSwappedDouble(byte[] p0,int p1,double p2){
 EndianUtils.writeSwappedDouble(p0,p1,p2);
}
public static double getDoubleValue(java.util.Map p0,java.lang.Object p1,double p2){
return MapUtils.getDoubleValue(p0,p1,p2);
}
public static double getDoubleValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getDoubleValue(p0,p1);
}
public static <K> double getDoubleValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getDoubleValue(p0,p1);
}
public static <K> double getDoubleValue(java.util.Map<? super K, ?> p0,K p1,double p2){
return MapUtils.getDoubleValue(p0,p1,p2);
}
public static double[] add(double[] p0,int p1,double p2){
return ArrayUtils.add(p0,p1,p2);
}
public static double[] add(double[] p0,double p1){
return ArrayUtils.add(p0,p1);
}
public static int indexOf(double[] p0,double p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int indexOf(double[] p0,double p1,int p2,double p3){
return ArrayUtils.indexOf(p0,p1,p2,p3);
}
public static int indexOf(double[] p0,double p1,double p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static boolean contains(double[] p0,double p1,double p2){
return ArrayUtils.contains(p0,p1,p2);
}
public static int lastIndexOf(double[] p0,double p1,double p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(double[] p0,double p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(double[] p0,double p1,int p2,double p3){
return ArrayUtils.lastIndexOf(p0,p1,p2,p3);
}
public static double[] removeElement(double[] p0,double p1){
return ArrayUtils.removeElement(p0,p1);
}
public static double[] toPrimitive(java.lang.Double[] p0,double p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static org.apache.commons.lang3.math.Fraction getFraction(double p0){
return Fraction.getFraction(p0);
}
public static double min(double p0,double p1){
return IEEE754rUtils.min(p0,p1);
}
public static double min(double p0,double p1,double p2){
return IEEE754rUtils.min(p0,p1,p2);
}
public static double max(double p0,double p1){
return IEEE754rUtils.max(p0,p1);
}
public static double max(double p0,double p1,double p2){
return IEEE754rUtils.max(p0,p1,p2);
}
public static double toDouble(java.lang.String p0){
return NumberUtils.toDouble(p0);
}
public static double toDouble(java.lang.String p0,double p1){
return NumberUtils.toDouble(p0,p1);
}
public static double CONST(double p0){
return ObjectUtils.CONST(p0);
}
public static double nextDouble(double p0,double p1){
return RandomUtils.nextDouble(p0,p1);
}
public static double getJaroWinklerDistance(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.getJaroWinklerDistance(p0,p1);
}
public static void exclusiveBetween(double p0,double p1,double p2,java.lang.String p3){
 Validate.exclusiveBetween(p0,p1,p2,p3);
}
public static void exclusiveBetween(double p0,double p1,double p2){
 Validate.exclusiveBetween(p0,p1,p2);
}
public static void isTrue(boolean p0,java.lang.String p1,double p2){
 Validate.isTrue(p0,p1,p2);
}
public static void inclusiveBetween(double p0,double p1,double p2,java.lang.String p3){
 Validate.inclusiveBetween(p0,p1,p2,p3);
}
public static void inclusiveBetween(double p0,double p1,double p2){
 Validate.inclusiveBetween(p0,p1,p2);
}
public static double computeQuantizationError(java.lang.Iterable<double[]> p0,java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron> p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.computeQuantizationError(p0,p1,p2);
}
public static double computeTopographicError(java.lang.Iterable<double[]> p0,org.apache.commons.math3.ml.neuralnet.Network p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.computeTopographicError(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunction exponentialDecay(double p0,double p1,long p2){
return NeighbourhoodSizeFunctionFactory.exponentialDecay(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunction quasiSigmoidDecay(double p0,double p1,long p2){
return NeighbourhoodSizeFunctionFactory.quasiSigmoidDecay(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer function(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2){
return FeatureInitializerFactory.function(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer uniform(org.apache.commons.math3.random.RandomGenerator p0,double p1,double p2){
return FeatureInitializerFactory.uniform(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer uniform(double p0,double p1){
return FeatureInitializerFactory.uniform(p0,p1);
}
public static double[] sample(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,int p3) throws org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.NotStrictlyPositiveException{
return FunctionUtils.sample(p0,p1,p2,p3);
}
public static org.apache.commons.math3.analysis.MultivariateFunction collector(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
return FunctionUtils.collector(p0,p1);
}
public static org.apache.commons.math3.analysis.MultivariateFunction collector(org.apache.commons.math3.analysis.BivariateFunction p0,org.apache.commons.math3.analysis.UnivariateFunction p1,double p2){
return FunctionUtils.collector(p0,p1,p2);
}
public static org.apache.commons.math3.analysis.UnivariateFunction fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
return FunctionUtils.fix2ndArgument(p0,p1);
}
public static org.apache.commons.math3.analysis.UnivariateFunction fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
return FunctionUtils.fix1stArgument(p0,p1);
}
public static org.apache.commons.math3.analysis.differentiation.SparseGradient createConstant(double p0){
return SparseGradient.createConstant(p0);
}
public static org.apache.commons.math3.analysis.differentiation.SparseGradient pow(double p0,org.apache.commons.math3.analysis.differentiation.SparseGradient p1){
return SparseGradient.pow(p0,p1);
}
public static org.apache.commons.math3.analysis.differentiation.SparseGradient createVariable(int p0,double p1){
return SparseGradient.createVariable(p0,p1);
}
public static org.apache.commons.math3.analysis.differentiation.DerivativeStructure pow(double p0,org.apache.commons.math3.analysis.differentiation.DerivativeStructure p1){
return DerivativeStructure.pow(p0,p1);
}
public static double evaluate(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException{
return PolynomialFunctionNewtonForm.evaluate(p0,p1,p2);
}
public static double[] shift(double[] p0,double p1){
return PolynomialsUtils.shift(p0,p1);
}
public static void verifyInterval(double p0,double p1) throws org.apache.commons.math3.exception.NumberIsTooLargeException{
 UnivariateSolverUtils.verifyInterval(p0,p1);
}
public static double forceSide(int p0,org.apache.commons.math3.analysis.UnivariateFunction p1,org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver<org.apache.commons.math3.analysis.UnivariateFunction> p2,double p3,double p4,double p5,org.apache.commons.math3.analysis.solvers.AllowedSolution p6) throws org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.forceSide(p0,p1,p2,p3,p4,p5,p6);
}
public static double[] bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3,int p4) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.bracket(p0,p1,p2,p3,p4);
}
public static double[] bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3,double p4,double p5,int p6) throws org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.bracket(p0,p1,p2,p3,p4,p5,p6);
}
public static double[] bracket(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.bracket(p0,p1,p2,p3);
}
public static boolean isSequence(double p0,double p1,double p2){
return UnivariateSolverUtils.isSequence(p0,p1,p2);
}
public static boolean isBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException{
return UnivariateSolverUtils.isBracketing(p0,p1,p2);
}
public static void verifySequence(double p0,double p1,double p2) throws org.apache.commons.math3.exception.NumberIsTooLargeException{
 UnivariateSolverUtils.verifySequence(p0,p1,p2);
}
public static void verifyBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException{
 UnivariateSolverUtils.verifyBracketing(p0,p1,p2);
}
public static double solve(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.solve(p0,p1,p2);
}
public static double solve(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,double p3) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException{
return UnivariateSolverUtils.solve(p0,p1,p2,p3);
}
public static double midpoint(double p0,double p1){
return UnivariateSolverUtils.midpoint(p0,p1);
}
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getAgrestiCoullInterval(int p0,int p1,double p2){
return IntervalUtils.getAgrestiCoullInterval(p0,p1,p2);
}
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getNormalApproximationInterval(int p0,int p1,double p2){
return IntervalUtils.getNormalApproximationInterval(p0,p1,p2);
}
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getWilsonScoreInterval(int p0,int p1,double p2){
return IntervalUtils.getWilsonScoreInterval(p0,p1,p2);
}
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getClopperPearsonInterval(int p0,int p1,double p2){
return IntervalUtils.getClopperPearsonInterval(p0,p1,p2);
}
public static double kolmogorovSmirnovStatistic(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovStatistic(p0,p1);
}
public static double kolmogorovSmirnovStatistic(double[] p0,double[] p1) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovStatistic(p0,p1);
}
public static double kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
public static boolean kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,double p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
public static double kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1);
}
public static double kolmogorovSmirnovTest(double[] p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
public static double kolmogorovSmirnovTest(double[] p0,double[] p1) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1);
}
public static boolean homoscedasticTTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.homoscedasticTTest(p0,p1,p2);
}
public static double homoscedasticTTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.homoscedasticTTest(p0,p1);
}
public static double homoscedasticTTest(double[] p0,double[] p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.homoscedasticTTest(p0,p1);
}
public static double oneWayAnovaFValue(java.util.Collection<double[]> p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException{
return TestUtils.oneWayAnovaFValue(p0);
}
public static double gDataSetsComparison(long[] p0,long[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException{
return TestUtils.gDataSetsComparison(p0,p1);
}
public static double rootLogLikelihoodRatio(long p0,long p1,long p2,long p3) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException{
return TestUtils.rootLogLikelihoodRatio(p0,p1,p2,p3);
}
public static boolean gTestDataSetsComparison(long[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.gTestDataSetsComparison(p0,p1,p2);
}
public static double gTestDataSetsComparison(long[] p0,long[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.gTestDataSetsComparison(p0,p1);
}
public static double chiSquareDataSetsComparison(long[] p0,long[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException{
return TestUtils.chiSquareDataSetsComparison(p0,p1);
}
public static boolean chiSquareTestDataSetsComparison(long[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTestDataSetsComparison(p0,p1,p2);
}
public static double chiSquareTestDataSetsComparison(long[] p0,long[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTestDataSetsComparison(p0,p1);
}
public static double oneWayAnovaPValue(java.util.Collection<double[]> p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.ConvergenceException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.oneWayAnovaPValue(p0);
}
public static double chiSquareTest(long[][] p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTest(p0);
}
public static double chiSquareTest(double[] p0,long[] p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTest(p0,p1);
}
public static boolean chiSquareTest(long[][] p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTest(p0,p1);
}
public static boolean chiSquareTest(double[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTest(p0,p1,p2);
}
public static double pairedT(double[] p0,double[] p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException{
return TestUtils.pairedT(p0,p1);
}
public static boolean tTest(double p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1,p2);
}
public static double tTest(double p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1);
}
public static double tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1);
}
public static boolean tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1,p2);
}
public static boolean tTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1,p2);
}
public static boolean tTest(double p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1,p2);
}
public static double tTest(double[] p0,double[] p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1);
}
public static double tTest(double p0,double[] p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1);
}
public static boolean oneWayAnovaTest(java.util.Collection<double[]> p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.ConvergenceException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.oneWayAnovaTest(p0,p1);
}
public static boolean pairedTTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.pairedTTest(p0,p1,p2);
}
public static double pairedTTest(double[] p0,double[] p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.pairedTTest(p0,p1);
}
public static double gTest(double[] p0,long[] p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.gTest(p0,p1);
}
public static boolean gTest(double[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.gTest(p0,p1,p2);
}
public static double gTestIntrinsic(double[] p0,long[] p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.gTestIntrinsic(p0,p1);
}
public static double homoscedasticT(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException{
return TestUtils.homoscedasticT(p0,p1);
}
public static double homoscedasticT(double[] p0,double[] p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException{
return TestUtils.homoscedasticT(p0,p1);
}
public static double exactP(double p0,int p1,int p2,boolean p3){
return TestUtils.exactP(p0,p1,p2,p3);
}
public static double approximateP(double p0,int p1,int p2){
return TestUtils.approximateP(p0,p1,p2);
}
public static double monteCarloP(double p0,int p1,int p2,boolean p3,int p4){
return TestUtils.monteCarloP(p0,p1,p2,p3,p4);
}
public static double chiSquare(double[] p0,long[] p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException{
return TestUtils.chiSquare(p0,p1);
}
public static double chiSquare(long[][] p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.DimensionMismatchException{
return TestUtils.chiSquare(p0);
}
public static double min(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.min(p0,p1,p2);
}
public static double min(double[] p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.min(p0);
}
public static double max(double[] p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.max(p0);
}
public static double max(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.max(p0,p1,p2);
}
public static double sum(double[] p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.sum(p0);
}
public static double sum(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.sum(p0,p1,p2);
}
public static double mean(double[] p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.mean(p0);
}
public static double mean(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.mean(p0,p1,p2);
}
public static double product(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.product(p0,p1,p2);
}
public static double product(double[] p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.product(p0);
}
public static double varianceDifference(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException{
return StatUtils.varianceDifference(p0,p1,p2);
}
public static double populationVariance(double[] p0,double p1) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.populationVariance(p0,p1);
}
public static double populationVariance(double[] p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.populationVariance(p0);
}
public static double populationVariance(double[] p0,double p1,int p2,int p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.populationVariance(p0,p1,p2,p3);
}
public static double populationVariance(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.populationVariance(p0,p1,p2);
}
public static double meanDifference(double[] p0,double[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException{
return StatUtils.meanDifference(p0,p1);
}
public static double variance(double[] p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.variance(p0);
}
public static double variance(double[] p0,double p1) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.variance(p0,p1);
}
public static double variance(double[] p0,double p1,int p2,int p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.variance(p0,p1,p2,p3);
}
public static double variance(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.variance(p0,p1,p2);
}
public static double percentile(double[] p0,int p1,int p2,double p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.percentile(p0,p1,p2,p3);
}
public static double percentile(double[] p0,double p1) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.percentile(p0,p1);
}
public static double geometricMean(double[] p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.geometricMean(p0);
}
public static double geometricMean(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.geometricMean(p0,p1,p2);
}
public static double sumLog(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.sumLog(p0,p1,p2);
}
public static double sumLog(double[] p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.sumLog(p0);
}
public static double sumDifference(double[] p0,double[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException{
return StatUtils.sumDifference(p0,p1);
}
public static double sumSq(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.sumSq(p0,p1,p2);
}
public static double sumSq(double[] p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.sumSq(p0);
}
public static PSquareMarkers newMarkers(java.util.List<java.lang.Double> p0,double p1){
return PSquarePercentile.newMarkers(p0,p1);
}
public static org.apache.commons.math3.linear.RealMatrix inverse(org.apache.commons.math3.linear.RealMatrix p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.linear.SingularMatrixException,org.apache.commons.math3.linear.NonSquareMatrixException{
return MatrixUtils.inverse(p0,p1);
}
public static void checkSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1){
 MatrixUtils.checkSymmetric(p0,p1);
}
public static boolean isSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1){
return MatrixUtils.isSymmetric(p0,p1);
}
public static org.apache.commons.math3.complex.Complex polar2Complex(double p0,double p1) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return ComplexUtils.polar2Complex(p0,p1);
}
public static org.apache.commons.math3.complex.Complex valueOf(double p0){
return Complex.valueOf(p0);
}
public static org.apache.commons.math3.complex.Complex valueOf(double p0,double p1){
return Complex.valueOf(p0,p1);
}
public static boolean equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex p0,org.apache.commons.math3.complex.Complex p1,double p2){
return Complex.equalsWithRelativeTolerance(p0,p1,p2);
}
public static double dotProduct(org.apache.commons.math3.complex.Quaternion p0,org.apache.commons.math3.complex.Quaternion p1){
return Quaternion.dotProduct(p0,p1);
}
public static double regularizedBeta(double p0,double p1,double p2,double p3){
return Beta.regularizedBeta(p0,p1,p2,p3);
}
public static double regularizedBeta(double p0,double p1,double p2,double p3,int p4){
return Beta.regularizedBeta(p0,p1,p2,p3,p4);
}
public static double regularizedBeta(double p0,double p1,double p2,int p3){
return Beta.regularizedBeta(p0,p1,p2,p3);
}
public static double regularizedBeta(double p0,double p1,double p2){
return Beta.regularizedBeta(p0,p1,p2);
}
public static double logBeta(double p0,double p1,double p2,int p3){
return Beta.logBeta(p0,p1,p2,p3);
}
public static double logBeta(double p0,double p1){
return Beta.logBeta(p0,p1);
}
public static double erf(double p0,double p1){
return Erf.erf(p0,p1);
}
public static double erf(double p0){
return Erf.erf(p0);
}
public static double erfc(double p0){
return Erf.erfc(p0);
}
public static double erfInv(double p0){
return Erf.erfInv(p0);
}
public static double erfcInv(double p0){
return Erf.erfcInv(p0);
}
public static double value(double p0,double p1) throws org.apache.commons.math3.exception.MathIllegalArgumentException,org.apache.commons.math3.exception.ConvergenceException{
return BesselJ.value(p0,p1);
}
public static BesselJResult rjBesl(double p0,double p1,int p2){
return BesselJ.rjBesl(p0,p1,p2);
}
public static double regularizedGammaQ(double p0,double p1,double p2,int p3){
return Gamma.regularizedGammaQ(p0,p1,p2,p3);
}
public static double regularizedGammaQ(double p0,double p1){
return Gamma.regularizedGammaQ(p0,p1);
}
public static double regularizedGammaP(double p0,double p1){
return Gamma.regularizedGammaP(p0,p1);
}
public static double regularizedGammaP(double p0,double p1,double p2,int p3){
return Gamma.regularizedGammaP(p0,p1,p2,p3);
}
public static double logGamma1p(double p0) throws org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.NumberIsTooLargeException{
return Gamma.logGamma1p(p0);
}
public static double trigamma(double p0){
return Gamma.trigamma(p0);
}
public static double digamma(double p0){
return Gamma.digamma(p0);
}
public static double invGamma1pm1(double p0){
return Gamma.invGamma1pm1(p0);
}
public static double logGamma(double p0){
return Gamma.logGamma(p0);
}
public static double lanczos(double p0){
return Gamma.lanczos(p0);
}
public static double gamma(double p0){
return Gamma.gamma(p0);
}
public static double distance(org.apache.commons.math3.geometry.spherical.twod.S2Point p0,org.apache.commons.math3.geometry.spherical.twod.S2Point p1){
return S2Point.distance(p0,p1);
}
public static double distance(org.apache.commons.math3.geometry.spherical.oned.S1Point p0,org.apache.commons.math3.geometry.spherical.oned.S1Point p1){
return S1Point.distance(p0,p1);
}
public static double distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.distance(p0,p1);
}
public static double distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.distanceSq(p0,p1);
}
public static double dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.dotProduct(p0,p1);
}
public static double distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.distanceInf(p0,p1);
}
public static double distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.distance1(p0,p1);
}
public static double angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return Vector3D.angle(p0,p1);
}
public static double distance(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0,org.apache.commons.math3.geometry.euclidean.threed.Rotation p1){
return Rotation.distance(p0,p1);
}
public static org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> getTransform(double p0,double p1,double p2,double p3,double p4,double p5) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return Line.getTransform(p0,p1,p2,p3,p4,p5);
}
public static double distance(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1){
return Vector2D.distance(p0,p1);
}
public static double distanceSq(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1){
return Vector2D.distanceSq(p0,p1);
}
public static double distanceInf(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1){
return Vector2D.distanceInf(p0,p1);
}
public static double angle(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return Vector2D.angle(p0,p1);
}
public static double distance(org.apache.commons.math3.geometry.euclidean.oned.Vector1D p0,org.apache.commons.math3.geometry.euclidean.oned.Vector1D p1){
return Vector1D.distance(p0,p1);
}
public static double distanceSq(org.apache.commons.math3.geometry.euclidean.oned.Vector1D p0,org.apache.commons.math3.geometry.euclidean.oned.Vector1D p1){
return Vector1D.distanceSq(p0,p1);
}
public static double distanceInf(org.apache.commons.math3.geometry.euclidean.oned.Vector1D p0,org.apache.commons.math3.geometry.euclidean.oned.Vector1D p1){
return Vector1D.distanceInf(p0,p1);
}
public static java.lang.StringBuffer formatDouble(double p0,java.text.NumberFormat p1,java.lang.StringBuffer p2,java.text.FieldPosition p3){
return CompositeFormat.formatDouble(p0,p1,p2,p3);
}
public static double reduce(double p0,double p1,double p2){
return MathUtils.reduce(p0,p1,p2);
}
public static void checkFinite(double p0) throws org.apache.commons.math3.exception.NotFiniteNumberException{
 MathUtils.checkFinite(p0);
}
public static double normalizeAngle(double p0,double p1){
return MathUtils.normalizeAngle(p0,p1);
}
public static double binomialCoefficientDouble(int p0,int p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.binomialCoefficientDouble(p0,p1);
}
public static double binomialCoefficientLog(int p0,int p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.binomialCoefficientLog(p0,p1);
}
public static double factorialLog(int p0) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.factorialLog(p0);
}
public static double factorialDouble(int p0) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.factorialDouble(p0);
}
public static double[] scale(double p0,double[] p1){
return MathArrays.scale(p0,p1);
}
public static double distance(double[] p0,double[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
return MathArrays.distance(p0,p1);
}
public static double distance(int[] p0,int[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
return MathArrays.distance(p0,p1);
}
public static double linearCombination(double p0,double p1,double p2,double p3,double p4,double p5,double p6,double p7){
return MathArrays.linearCombination(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static double linearCombination(double p0,double p1,double p2,double p3){
return MathArrays.linearCombination(p0,p1,p2,p3);
}
public static double linearCombination(double[] p0,double[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
return MathArrays.linearCombination(p0,p1);
}
public static double linearCombination(double p0,double p1,double p2,double p3,double p4,double p5){
return MathArrays.linearCombination(p0,p1,p2,p3,p4,p5);
}
public static void scaleInPlace(double p0,double[] p1){
 MathArrays.scaleInPlace(p0,p1);
}
public static double[] normalizeArray(double[] p0,double p1) throws org.apache.commons.math3.exception.MathIllegalArgumentException,org.apache.commons.math3.exception.MathArithmeticException{
return MathArrays.normalizeArray(p0,p1);
}
public static double distanceInf(double[] p0,double[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
return MathArrays.distanceInf(p0,p1);
}
public static double distance1(double[] p0,double[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
return MathArrays.distance1(p0,p1);
}
public static double safeNorm(double[] p0){
return MathArrays.safeNorm(p0);
}
public static double cosAngle(double[] p0,double[] p1){
return MathArrays.cosAngle(p0,p1);
}
public static double abs(double p0){
return FastMath.abs(p0);
}
public static double sin(double p0){
return FastMath.sin(p0);
}
public static double cos(double p0){
return FastMath.cos(p0);
}
public static double tan(double p0){
return FastMath.tan(p0);
}
public static double atan2(double p0,double p1){
return FastMath.atan2(p0,p1);
}
public static double sqrt(double p0){
return FastMath.sqrt(p0);
}
public static double log(double p0){
return FastMath.log(p0);
}
public static double log(double p0,double p1){
return FastMath.log(p0,p1);
}
public static double log10(double p0){
return FastMath.log10(p0);
}
public static double pow(double p0,long p1){
return FastMath.pow(p0,p1);
}
public static double pow(double p0,int p1){
return FastMath.pow(p0,p1);
}
public static double pow(double p0,double p1){
return FastMath.pow(p0,p1);
}
public static double exp(double p0){
return FastMath.exp(p0);
}
public static double scalb(double p0,int p1){
return FastMath.scalb(p0,p1);
}
public static double copySign(double p0,double p1){
return FastMath.copySign(p0,p1);
}
public static int getExponent(double p0){
return FastMath.getExponent(p0);
}
public static double signum(double p0){
return FastMath.signum(p0);
}
public static double IEEEremainder(double p0,double p1){
return FastMath.IEEEremainder(p0,p1);
}
public static double acos(double p0){
return FastMath.acos(p0);
}
public static double asin(double p0){
return FastMath.asin(p0);
}
public static double atan(double p0){
return FastMath.atan(p0);
}
public static double cbrt(double p0){
return FastMath.cbrt(p0);
}
public static double ceil(double p0){
return FastMath.ceil(p0);
}
public static double cosh(double p0){
return FastMath.cosh(p0);
}
public static double expm1(double p0){
return FastMath.expm1(p0);
}
public static double floor(double p0){
return FastMath.floor(p0);
}
public static double hypot(double p0,double p1){
return FastMath.hypot(p0,p1);
}
public static double log1p(double p0){
return FastMath.log1p(p0);
}
public static float nextAfter(float p0,double p1){
return FastMath.nextAfter(p0,p1);
}
public static double nextAfter(double p0,double p1){
return FastMath.nextAfter(p0,p1);
}
public static double nextDown(double p0){
return FastMath.nextDown(p0);
}
public static double nextUp(double p0){
return FastMath.nextUp(p0);
}
public static double random(){
return FastMath.random();
}
public static double rint(double p0){
return FastMath.rint(p0);
}
public static long round(double p0){
return FastMath.round(p0);
}
public static double sinh(double p0){
return FastMath.sinh(p0);
}
public static double tanh(double p0){
return FastMath.tanh(p0);
}
public static double toDegrees(double p0){
return FastMath.toDegrees(p0);
}
public static double toRadians(double p0){
return FastMath.toRadians(p0);
}
public static double ulp(double p0){
return FastMath.ulp(p0);
}
public static double asinh(double p0){
return FastMath.asinh(p0);
}
public static double atanh(double p0){
return FastMath.atanh(p0);
}
public static double acosh(double p0){
return FastMath.acosh(p0);
}
public static int compareTo(double p0,double p1,double p2){
return Precision.compareTo(p0,p1,p2);
}
public static int compareTo(double p0,double p1,int p2){
return Precision.compareTo(p0,p1,p2);
}
public static double round(double p0,int p1,int p2){
return Precision.round(p0,p1,p2);
}
public static double round(double p0,int p1){
return Precision.round(p0,p1);
}
public static boolean equalsWithRelativeTolerance(double p0,double p1,double p2){
return Precision.equalsWithRelativeTolerance(p0,p1,p2);
}
public static boolean equalsIncludingNaN(double p0,double p1){
return Precision.equalsIncludingNaN(p0,p1);
}
public static boolean equalsIncludingNaN(double p0,double p1,int p2){
return Precision.equalsIncludingNaN(p0,p1,p2);
}
public static boolean equalsIncludingNaN(double p0,double p1,double p2){
return Precision.equalsIncludingNaN(p0,p1,p2);
}
public static double representableDelta(double p0,double p1){
return Precision.representableDelta(p0,p1);
}
public static org.apache.commons.math3.complex.Complex[] scaleArray(org.apache.commons.math3.complex.Complex[] p0,double p1){
return TransformUtils.scaleArray(p0,p1);
}
public static double[] scaleArray(double[] p0,double p1){
return TransformUtils.scaleArray(p0,p1);
}
public static double getDefaultDouble(){
return ConvertUtils.getDefaultDouble();
}
public static void setDefaultDouble(double p0){
 ConvertUtils.setDefaultDouble(p0);
}
public static org.apache.commons.collections.primitives.DoubleList singletonDoubleList(double p0){
return DoubleCollections.singletonDoubleList(p0);
}
public static org.apache.commons.collections.primitives.DoubleIterator singletonDoubleIterator(double p0){
return DoubleCollections.singletonDoubleIterator(p0);
}
public static org.apache.commons.collections.primitives.DoubleListIterator singletonDoubleListIterator(double p0){
return DoubleCollections.singletonDoubleListIterator(p0);
}
public static int double2int(double p0){
return HashCommon.double2int(p0);
}
public static float safeDoubleToFloat(double p0){
return SafeMath.safeDoubleToFloat(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction singleton(byte p0,double p1){
return Byte2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap singleton(byte p0,double p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction singleton(char p0,double p1){
return Char2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(char p0,double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction singleton(double p0,boolean p1){
return Double2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(double p0,boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction singleton(double p0,byte p1){
return Double2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap singleton(double p0,byte p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction singleton(double p0,char p1){
return Double2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(double p0,char p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction singleton(double p0,double p1){
return Double2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap singleton(double p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction singleton(double p0,float p1){
return Double2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap singleton(double p0,float p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction singleton(double p0,int p1){
return Double2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(double p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction singleton(double p0,long p1){
return Double2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(double p0,long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> singleton(double p0,V p1){
return Double2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> singleton(double p0,V p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction singleton(double p0,short p1){
return Double2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap singleton(double p0,short p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2ShortSortedMaps.singleton(p0,p1,p2);
}
public static void fill(double[] p0,double p1){
 DoubleArrays.fill(p0,p1);
}
public static void fill(double[] p0,int p1,int p2,double p3){
 DoubleArrays.fill(p0,p1,p2,p3);
}
public static int binarySearch(double[] p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return DoubleArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(double[] p0,int p1,int p2,double p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static int binarySearch(double[] p0,double p1){
return DoubleArrays.binarySearch(p0,p1);
}
public static int binarySearch(double[] p0,int p1,int p2,double p3){
return DoubleArrays.binarySearch(p0,p1,p2,p3);
}
public static void add(double[][] p0,long p1,double p2){
 DoubleBigArrays.add(p0,p1,p2);
}
public static void set(double[][] p0,long p1,double p2){
 DoubleBigArrays.set(p0,p1,p2);
}
public static void fill(double[][] p0,double p1){
 DoubleBigArrays.fill(p0,p1);
}
public static void fill(double[][] p0,long p1,long p2,double p3){
 DoubleBigArrays.fill(p0,p1,p2,p3);
}
public static long binarySearch(double[][] p0,long p1,long p2,double p3){
return DoubleBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(double[][] p0,long p1,long p2,double p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(double[][] p0,double p1){
return DoubleBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(double[][] p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return DoubleBigArrays.binarySearch(p0,p1,p2);
}
public static void mul(double[][] p0,long p1,double p2){
 DoubleBigArrays.mul(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigListIterator singleton(double p0){
return DoubleBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet singleton(double p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
return DoubleSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction singleton(float p0,double p1){
return Float2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(float p0,double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction singleton(int p0,double p1){
return Int2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(int p0,double p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction singleton(long p0,double p1){
return Long2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(long p0,double p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> singleton(K p0,double p1){
return Object2DoubleFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> singleton(K p0,double p1,java.util.Comparator<? super K> p2){
return Object2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction singleton(short p0,double p1){
return Short2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap singleton(short p0,double p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static double nextDouble(java.util.Random p0){
return RandomUtils.nextDouble(p0);
}
public static double nextDouble(){
return RandomUtils.nextDouble();
}
}
