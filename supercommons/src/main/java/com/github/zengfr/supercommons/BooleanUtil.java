package com.github.zengfr.supercommons;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.BooleanUtils;
import it.unimi.dsi.fastutil.booleans.BooleanSets;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2BooleanFunctions;
import it.unimi.dsi.fastutil.chars.Char2BooleanMaps;
import it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions;
import it.unimi.dsi.fastutil.doubles.Double2BooleanMaps;
import it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2BooleanFunctions;
import it.unimi.dsi.fastutil.floats.Float2BooleanMaps;
import it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2BooleanFunctions;
import it.unimi.dsi.fastutil.ints.Int2BooleanMaps;
import it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2BooleanFunctions;
import it.unimi.dsi.fastutil.longs.Long2BooleanMaps;
import it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2BooleanFunctions;
import it.unimi.dsi.fastutil.objects.Object2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2BooleanFunctions;
import it.unimi.dsi.fastutil.objects.Reference2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMaps;
import it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps;
import org.apache.commons.lang.BooleanUtils;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import com.google.common.base.Utf8;
import com.google.common.base.Verify;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multisets;
import com.google.common.io.Closeables;
import com.google.common.io.Flushables;
import com.google.common.math.BigIntegerMath;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath;
import com.google.common.net.HostSpecifier;
import com.google.common.net.InetAddresses;
import com.google.common.net.InternetDomainName;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Bytes;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Primitives;
import com.google.common.primitives.Shorts;
import java.lang.reflect.AccessibleObject;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Uninterruptibles;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.TaggedIOException;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.SetUtils;
import org.apache.commons.collections.ComparatorUtils;
import org.apache.commons.collections.comparators.BooleanComparator;
import org.apache.commons.collections.functors.WhileClosure;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.SetUtils;
import org.apache.commons.collections4.ComparatorUtils;
import org.apache.commons.collections4.comparators.BooleanComparator;
import org.apache.commons.collections4.MultiMapUtils;
import org.apache.commons.collections4.functors.WhileClosure;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.lang3.AnnotationUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.CharEncoding;
import org.apache.commons.lang3.CharSetUtils;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
import org.apache.commons.math3.stat.inference.TestUtils;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.primes.Primes;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory;
import org.apache.commons.math3.util.CompositeFormat;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.beanutils.locale.LocaleBeanUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.locale.LocaleConvertUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.text.WordUtils;
import it.unimi.dsi.fastutil.booleans.BooleanArrays;
import it.unimi.dsi.fastutil.booleans.BooleanBigArrays;
import it.unimi.dsi.fastutil.booleans.BooleanBigListIterators;
import it.unimi.dsi.fastutil.booleans.BooleanBigLists;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
import it.unimi.dsi.fastutil.booleans.BooleanLists;
import it.unimi.dsi.fastutil.bytes.ByteArrays;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
import it.unimi.dsi.fastutil.chars.CharArrays;
import it.unimi.dsi.fastutil.chars.CharIterators;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatIterators;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.ints.IntIterators;
import it.unimi.dsi.fastutil.longs.LongArrays;
import it.unimi.dsi.fastutil.longs.LongIterators;
import it.unimi.dsi.fastutil.objects.ObjectIterators;
import it.unimi.dsi.fastutil.shorts.ShortArrays;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
import com.facebook.util.Validations;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.CharEncoding;
import org.apache.commons.lang.CharUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.lang.LocaleUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang.NumberUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.reflect.FieldUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.WordUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanUtil{ 
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1,java.lang.Boolean p2){
return MapUtils.getBoolean(p0,p1,p2);
}
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1){
return MapUtils.getBoolean(p0,p1);
}
public static <K> java.lang.Boolean getBoolean(java.util.Map<? super K, ?> p0,K p1,java.lang.Boolean p2){
return MapUtils.getBoolean(p0,p1,p2);
}
public static <K> java.lang.Boolean getBoolean(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getBoolean(p0,p1);
}
public static java.lang.Boolean and(java.lang.Boolean... p0){
return BooleanUtils.and(p0);
}
public static java.lang.Boolean or(java.lang.Boolean... p0){
return BooleanUtils.or(p0);
}
public static java.lang.Boolean xor(java.lang.Boolean... p0){
return BooleanUtils.xor(p0);
}
public static java.lang.Boolean negate(java.lang.Boolean p0){
return BooleanUtils.negate(p0);
}
public static int toInteger(java.lang.Boolean p0,int p1,int p2,int p3){
return BooleanUtils.toInteger(p0,p1,p2,p3);
}
public static boolean toBoolean(java.lang.Boolean p0){
return BooleanUtils.toBoolean(p0);
}
public static boolean isNotFalse(java.lang.Boolean p0){
return BooleanUtils.isNotFalse(p0);
}
public static java.lang.String toStringOnOff(java.lang.Boolean p0){
return BooleanUtils.toStringOnOff(p0);
}
public static boolean isTrue(java.lang.Boolean p0){
return BooleanUtils.isTrue(p0);
}
public static boolean isFalse(java.lang.Boolean p0){
return BooleanUtils.isFalse(p0);
}
public static java.lang.Boolean toBooleanObject(int p0){
return BooleanUtils.toBooleanObject(p0);
}
public static java.lang.Boolean toBooleanObject(java.lang.Integer p0){
return BooleanUtils.toBooleanObject(p0);
}
public static java.lang.Boolean toBooleanObject(int p0,int p1,int p2,int p3){
return BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
public static java.lang.Boolean toBooleanObject(java.lang.Integer p0,java.lang.Integer p1,java.lang.Integer p2,java.lang.Integer p3){
return BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
public static java.lang.Boolean toBooleanObject(java.lang.String p0,java.lang.String p1,java.lang.String p2,java.lang.String p3){
return BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
public static java.lang.Boolean toBooleanObject(java.lang.String p0){
return BooleanUtils.toBooleanObject(p0);
}
public static java.lang.String toStringYesNo(java.lang.Boolean p0){
return BooleanUtils.toStringYesNo(p0);
}
public static boolean isNotTrue(java.lang.Boolean p0){
return BooleanUtils.isNotTrue(p0);
}
public static java.lang.Integer toIntegerObject(java.lang.Boolean p0,java.lang.Integer p1,java.lang.Integer p2,java.lang.Integer p3){
return BooleanUtils.toIntegerObject(p0,p1,p2,p3);
}
public static java.lang.Integer toIntegerObject(java.lang.Boolean p0){
return BooleanUtils.toIntegerObject(p0);
}
public static boolean toBooleanDefaultIfNull(java.lang.Boolean p0,boolean p1){
return BooleanUtils.toBooleanDefaultIfNull(p0,p1);
}
public static java.lang.String toStringTrueFalse(java.lang.Boolean p0){
return BooleanUtils.toStringTrueFalse(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanSet singleton(java.lang.Boolean p0){
return BooleanSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction singleton(java.lang.Byte p0,java.lang.Boolean p1){
return Byte2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(java.lang.Byte p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(java.lang.Character p0,java.lang.Boolean p1){
return Char2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(java.lang.Character p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction singleton(java.lang.Double p0,java.lang.Boolean p1){
return Double2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(java.lang.Double p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction singleton(java.lang.Float p0,java.lang.Boolean p1){
return Float2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(java.lang.Float p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction singleton(java.lang.Integer p0,java.lang.Boolean p1){
return Int2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(java.lang.Integer p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction singleton(java.lang.Long p0,java.lang.Boolean p1){
return Long2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(java.lang.Long p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> singleton(K p0,java.lang.Boolean p1){
return Object2BooleanFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> singleton(K p0,java.lang.Boolean p1,java.util.Comparator<? super K> p2){
return Object2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction singleton(java.lang.Short p0,java.lang.Boolean p1){
return Short2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(java.lang.Short p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static java.lang.Boolean xor(java.lang.Boolean[] p0){
return BooleanUtils.xor(p0);
}
public static java.lang.Boolean toBooleanObject(boolean p0){
return BooleanUtils.toBooleanObject(p0);
}
public static boolean equalsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return Ascii.equalsIgnoreCase(p0,p1);
}
public static boolean isLowerCase(char p0){
return Ascii.isLowerCase(p0);
}
public static boolean isUpperCase(char p0){
return Ascii.isUpperCase(p0);
}
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Preconditions.checkArgument(p0,p1,p2);
}
public static void checkArgument(boolean p0,java.lang.Object p1){
 Preconditions.checkArgument(p0,p1);
}
public static void checkArgument(boolean p0){
 Preconditions.checkArgument(p0);
}
public static void checkState(boolean p0,java.lang.Object p1){
 Preconditions.checkState(p0,p1);
}
public static void checkState(boolean p0){
 Preconditions.checkState(p0);
}
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Preconditions.checkState(p0,p1,p2);
}
public static boolean isNullOrEmpty(java.lang.String p0){
return Strings.isNullOrEmpty(p0);
}
public static boolean lazyStackTraceIsLazy(){
return Throwables.lazyStackTraceIsLazy();
}
public static boolean isWellFormed(byte[] p0,int p1,int p2){
return Utf8.isWellFormed(p0,p1,p2);
}
public static boolean isWellFormed(byte[] p0){
return Utf8.isWellFormed(p0);
}
public static void verify(boolean p0){
 Verify.verify(p0);
}
public static void verify(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Verify.verify(p0,p1,p2);
}
public static <T> boolean all(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterables.all(p0,p1);
}
public static boolean contains(java.lang.Iterable<?> p0,java.lang.Object p1){
return Iterables.contains(p0,p1);
}
public static boolean isEmpty(java.lang.Iterable<?> p0){
return Iterables.isEmpty(p0);
}
public static <T> boolean addAll(java.util.Collection<T> p0,java.lang.Iterable<? extends T> p1){
return Iterables.addAll(p0,p1);
}
public static boolean removeAll(java.lang.Iterable<?> p0,java.util.Collection<?> p1){
return Iterables.removeAll(p0,p1);
}
public static <T> boolean removeIf(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterables.removeIf(p0,p1);
}
public static boolean retainAll(java.lang.Iterable<?> p0,java.util.Collection<?> p1){
return Iterables.retainAll(p0,p1);
}
public static <T> boolean any(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterables.any(p0,p1);
}
public static boolean elementsEqual(java.lang.Iterable<?> p0,java.lang.Iterable<?> p1){
return Iterables.elementsEqual(p0,p1);
}
public static <T> boolean all(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterators.all(p0,p1);
}
public static boolean contains(java.util.Iterator<?> p0,java.lang.Object p1){
return Iterators.contains(p0,p1);
}
public static <T> boolean addAll(java.util.Collection<T> p0,java.util.Iterator<? extends T> p1){
return Iterators.addAll(p0,p1);
}
public static boolean removeAll(java.util.Iterator<?> p0,java.util.Collection<?> p1){
return Iterators.removeAll(p0,p1);
}
public static <T> boolean removeIf(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterators.removeIf(p0,p1);
}
public static boolean retainAll(java.util.Iterator<?> p0,java.util.Collection<?> p1){
return Iterators.retainAll(p0,p1);
}
public static <T> boolean any(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterators.any(p0,p1);
}
public static boolean elementsEqual(java.util.Iterator<?> p0,java.util.Iterator<?> p1){
return Iterators.elementsEqual(p0,p1);
}
public static boolean retainOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1){
return Multisets.retainOccurrences(p0,p1);
}
public static boolean containsOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1){
return Multisets.containsOccurrences(p0,p1);
}
public static boolean removeOccurrences(com.google.common.collect.Multiset<?> p0,java.lang.Iterable<?> p1){
return Multisets.removeOccurrences(p0,p1);
}
public static boolean removeOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1){
return Multisets.removeOccurrences(p0,p1);
}
public static void close(java.io.Closeable p0,boolean p1) throws java.io.IOException{
 Closeables.close(p0,p1);
}
public static void flush(java.io.Flushable p0,boolean p1) throws java.io.IOException{
 Flushables.flush(p0,p1);
}
public static boolean isPowerOfTwo(java.math.BigInteger p0){
return BigIntegerMath.isPowerOfTwo(p0);
}
public static boolean fuzzyEquals(double p0,double p1,double p2){
return DoubleMath.fuzzyEquals(p0,p1,p2);
}
public static boolean isPowerOfTwo(double p0){
return DoubleMath.isPowerOfTwo(p0);
}
public static boolean isMathematicalInteger(double p0){
return DoubleMath.isMathematicalInteger(p0);
}
public static boolean isPowerOfTwo(int p0){
return IntMath.isPowerOfTwo(p0);
}
public static boolean isPowerOfTwo(long p0){
return LongMath.isPowerOfTwo(p0);
}
public static boolean isValid(java.lang.String p0){
return HostSpecifier.isValid(p0);
}
public static boolean isUriInetAddress(java.lang.String p0){
return InetAddresses.isUriInetAddress(p0);
}
public static boolean is6to4Address(java.net.Inet6Address p0){
return InetAddresses.is6to4Address(p0);
}
public static boolean isTeredoAddress(java.net.Inet6Address p0){
return InetAddresses.isTeredoAddress(p0);
}
public static boolean isIsatapAddress(java.net.Inet6Address p0){
return InetAddresses.isIsatapAddress(p0);
}
public static boolean isMaximum(java.net.InetAddress p0){
return InetAddresses.isMaximum(p0);
}
public static boolean isInetAddress(java.lang.String p0){
return InetAddresses.isInetAddress(p0);
}
public static boolean isMappedIPv4Address(java.lang.String p0){
return InetAddresses.isMappedIPv4Address(p0);
}
public static boolean isCompatIPv4Address(java.net.Inet6Address p0){
return InetAddresses.isCompatIPv4Address(p0);
}
public static boolean hasEmbeddedIPv4ClientAddress(java.net.Inet6Address p0){
return InetAddresses.hasEmbeddedIPv4ClientAddress(p0);
}
public static int indexOf(boolean[] p0,boolean p1){
return Booleans.indexOf(p0,p1);
}
public static int compare(boolean p0,boolean p1){
return Booleans.compare(p0,p1);
}
public static boolean contains(boolean[] p0,boolean p1){
return Booleans.contains(p0,p1);
}
public static int lastIndexOf(boolean[] p0,boolean p1){
return Booleans.lastIndexOf(p0,p1);
}
public static boolean contains(byte[] p0,byte p1){
return Bytes.contains(p0,p1);
}
public static boolean contains(char[] p0,char p1){
return Chars.contains(p0,p1);
}
public static boolean contains(double[] p0,double p1){
return Doubles.contains(p0,p1);
}
public static boolean isFinite(double p0){
return Doubles.isFinite(p0);
}
public static boolean contains(float[] p0,float p1){
return Floats.contains(p0,p1);
}
public static boolean isFinite(float p0){
return Floats.isFinite(p0);
}
public static boolean contains(int[] p0,int p1){
return Ints.contains(p0,p1);
}
public static boolean contains(long[] p0,long p1){
return Longs.contains(p0,p1);
}
public static boolean isWrapperType(java.lang.Class<?> p0){
return Primitives.isWrapperType(p0);
}
public static boolean contains(short[] p0,short p1){
return Shorts.contains(p0,p1);
}
public static void setAccessible(java.lang.reflect.AccessibleObject[] p0,boolean p1) throws java.lang.SecurityException{
 AccessibleObject.setAccessible(p0,p1);
}
public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2){
return MoreExecutors.shutdownAndAwaitTermination(p0,p1,p2);
}
public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch p0,long p1,java.util.concurrent.TimeUnit p2){
return Uninterruptibles.awaitUninterruptibly(p0,p1,p2);
}
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,int p1,long p2,java.util.concurrent.TimeUnit p3){
return Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2,p3);
}
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,long p1,java.util.concurrent.TimeUnit p2){
return Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2);
}
public static boolean contentEquals(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
return IOUtils.contentEquals(p0,p1);
}
public static boolean contentEquals(java.io.InputStream p0,java.io.InputStream p1) throws java.io.IOException{
return IOUtils.contentEquals(p0,p1);
}
public static boolean contentEqualsIgnoreEOL(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
return IOUtils.contentEqualsIgnoreEOL(p0,p1);
}
public static boolean isTaggedWith(java.lang.Throwable p0,java.lang.Object p1){
return TaggedIOException.isTaggedWith(p0,p1);
}
public static java.lang.String normalize(java.lang.String p0,boolean p1){
return FilenameUtils.normalize(p0,p1);
}
public static boolean isExtension(java.lang.String p0,java.lang.String p1){
return FilenameUtils.isExtension(p0,p1);
}
public static boolean isExtension(java.lang.String p0,java.util.Collection<java.lang.String> p1){
return FilenameUtils.isExtension(p0,p1);
}
public static boolean isExtension(java.lang.String p0,java.lang.String[] p1){
return FilenameUtils.isExtension(p0,p1);
}
public static boolean equalsOnSystem(java.lang.String p0,java.lang.String p1){
return FilenameUtils.equalsOnSystem(p0,p1);
}
public static boolean wildcardMatch(java.lang.String p0,java.lang.String p1,org.apache.commons.io.IOCase p2){
return FilenameUtils.wildcardMatch(p0,p1,p2);
}
public static boolean wildcardMatch(java.lang.String p0,java.lang.String p1){
return FilenameUtils.wildcardMatch(p0,p1);
}
public static boolean equalsNormalized(java.lang.String p0,java.lang.String p1){
return FilenameUtils.equalsNormalized(p0,p1);
}
public static java.lang.String normalizeNoEndSeparator(java.lang.String p0,boolean p1){
return FilenameUtils.normalizeNoEndSeparator(p0,p1);
}
public static boolean directoryContains(java.lang.String p0,java.lang.String p1) throws java.io.IOException{
return FilenameUtils.directoryContains(p0,p1);
}
public static boolean equalsNormalizedOnSystem(java.lang.String p0,java.lang.String p1){
return FilenameUtils.equalsNormalizedOnSystem(p0,p1);
}
public static boolean wildcardMatchOnSystem(java.lang.String p0,java.lang.String p1){
return FilenameUtils.wildcardMatchOnSystem(p0,p1);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4){
return Tailer.create(p0,p1,p2,p3,p4);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4,int p5){
return Tailer.create(p0,p1,p2,p3,p4,p5);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,java.nio.charset.Charset p1,org.apache.commons.io.input.TailerListener p2,long p3,boolean p4,boolean p5,int p6){
return Tailer.create(p0,p1,p2,p3,p4,p5,p6);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,int p4){
return Tailer.create(p0,p1,p2,p3,p4);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3){
return Tailer.create(p0,p1,p2,p3);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.util.Date p0,boolean p1){
return FileFilterUtils.ageFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0,boolean p1){
return FileFilterUtils.ageFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(long p0,boolean p1){
return FileFilterUtils.ageFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter sizeFileFilter(long p0,boolean p1){
return FileFilterUtils.sizeFileFilter(p0,p1);
}
public static boolean contentEquals(java.io.File p0,java.io.File p1) throws java.io.IOException{
return FileUtils.contentEquals(p0,p1);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,boolean p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.write(p0,p1,p2,p3);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
 FileUtils.write(p0,p1,p2,p3);
}
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
return FileUtils.listFiles(p0,p1,p2);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,boolean p2) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,boolean p3) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3,boolean p4) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3,p4);
}
public static boolean contentEqualsIgnoreEOL(java.io.File p0,java.io.File p1,java.lang.String p2) throws java.io.IOException{
return FileUtils.contentEqualsIgnoreEOL(p0,p1,p2);
}
public static boolean waitFor(java.io.File p0,int p1){
return FileUtils.waitFor(p0,p1);
}
public static boolean deleteQuietly(java.io.File p0){
return FileUtils.deleteQuietly(p0);
}
public static boolean isFileNewer(java.io.File p0,java.io.File p1){
return FileUtils.isFileNewer(p0,p1);
}
public static boolean isFileNewer(java.io.File p0,java.util.Date p1){
return FileUtils.isFileNewer(p0,p1);
}
public static boolean isFileNewer(java.io.File p0,long p1){
return FileUtils.isFileNewer(p0,p1);
}
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
return FileUtils.iterateFiles(p0,p1,p2);
}
public static void copyFile(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.copyFile(p0,p1,p2);
}
public static void copyDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1,p2);
}
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1,p2,p3);
}
public static java.io.FileOutputStream openOutputStream(java.io.File p0,boolean p1) throws java.io.IOException{
return FileUtils.openOutputStream(p0,p1);
}
public static boolean isFileOlder(java.io.File p0,long p1){
return FileUtils.isFileOlder(p0,p1);
}
public static boolean isFileOlder(java.io.File p0,java.io.File p1){
return FileUtils.isFileOlder(p0,p1);
}
public static boolean isFileOlder(java.io.File p0,java.util.Date p1){
return FileUtils.isFileOlder(p0,p1);
}
public static void moveToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.moveToDirectory(p0,p1,p2);
}
public static boolean isSymlink(java.io.File p0) throws java.io.IOException{
return FileUtils.isSymlink(p0);
}
public static void copyFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.copyFileToDirectory(p0,p1,p2);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,boolean p2) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2,p3);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2,p3);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3,boolean p4) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1,p2,p3,p4);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,boolean p2) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1,p2);
}
public static void moveDirectoryToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.moveDirectoryToDirectory(p0,p1,p2);
}
public static void moveFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.moveFileToDirectory(p0,p1,p2);
}
public static boolean directoryContains(java.io.File p0,java.io.File p1) throws java.io.IOException{
return FileUtils.directoryContains(p0,p1);
}
public static boolean isEmpty(java.util.Collection p0){
return CollectionUtils.isEmpty(p0);
}
public static boolean exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.exists(p0,p1);
}
public static boolean isNotEmpty(java.util.Collection p0){
return CollectionUtils.isNotEmpty(p0);
}
public static boolean containsAny(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.containsAny(p0,p1);
}
public static boolean isFull(java.util.Collection p0){
return CollectionUtils.isFull(p0);
}
public static boolean sizeIsEmpty(java.lang.Object p0){
return CollectionUtils.sizeIsEmpty(p0);
}
public static boolean isSubCollection(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.isSubCollection(p0,p1);
}
public static boolean addIgnoreNull(java.util.Collection p0,java.lang.Object p1){
return CollectionUtils.addIgnoreNull(p0,p1);
}
public static boolean isProperSubCollection(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.isProperSubCollection(p0,p1);
}
public static boolean isEqualCollection(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.isEqualCollection(p0,p1);
}
public static boolean isEmpty(java.util.Map p0){
return MapUtils.isEmpty(p0);
}
public static boolean isNotEmpty(java.util.Map p0){
return MapUtils.isNotEmpty(p0);
}
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1,boolean p2){
return MapUtils.getBooleanValue(p0,p1,p2);
}
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getBooleanValue(p0,p1);
}
public static boolean isEqualSet(java.util.Collection p0,java.util.Collection p1){
return SetUtils.isEqualSet(p0,p1);
}
public static java.util.Comparator booleanComparator(boolean p0){
return ComparatorUtils.booleanComparator(p0);
}
public static org.apache.commons.collections.comparators.BooleanComparator getBooleanComparator(boolean p0){
return BooleanComparator.getBooleanComparator(p0);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,boolean p2){
return WhileClosure.getInstance(p0,p1,p2);
}
public static boolean isEqualList(java.util.Collection p0,java.util.Collection p1){
return ListUtils.isEqualList(p0,p1);
}
public static boolean isEmpty(java.util.Collection<?> p0){
return CollectionUtils.isEmpty(p0);
}
public static <C> boolean addAll(java.util.Collection<C> p0,java.lang.Iterable<? extends C> p1){
return CollectionUtils.addAll(p0,p1);
}
public static <C> boolean addAll(java.util.Collection<C> p0,java.util.Iterator<? extends C> p1){
return CollectionUtils.addAll(p0,p1);
}
public static <C> boolean addAll(java.util.Collection<C> p0,java.util.Enumeration<? extends C> p1){
return CollectionUtils.addAll(p0,p1);
}
public static <C> boolean addAll(java.util.Collection<C> p0,C[] p1){
return CollectionUtils.addAll(p0,p1);
}
public static <C> boolean exists(java.lang.Iterable<C> p0,org.apache.commons.collections4.Predicate<? super C> p1){
return CollectionUtils.exists(p0,p1);
}
public static boolean containsAll(java.util.Collection<?> p0,java.util.Collection<?> p1){
return CollectionUtils.containsAll(p0,p1);
}
public static <T> boolean filter(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
return CollectionUtils.filter(p0,p1);
}
public static boolean isNotEmpty(java.util.Collection<?> p0){
return CollectionUtils.isNotEmpty(p0);
}
public static boolean containsAny(java.util.Collection<?> p0,java.util.Collection<?> p1){
return CollectionUtils.containsAny(p0,p1);
}
public static boolean isFull(java.util.Collection<?> p0){
return CollectionUtils.isFull(p0);
}
public static boolean isSubCollection(java.util.Collection<?> p0,java.util.Collection<?> p1){
return CollectionUtils.isSubCollection(p0,p1);
}
public static <T> boolean addIgnoreNull(java.util.Collection<T> p0,T p1){
return CollectionUtils.addIgnoreNull(p0,p1);
}
public static boolean isProperSubCollection(java.util.Collection<?> p0,java.util.Collection<?> p1){
return CollectionUtils.isProperSubCollection(p0,p1);
}
public static boolean isEqualCollection(java.util.Collection<?> p0,java.util.Collection<?> p1){
return CollectionUtils.isEqualCollection(p0,p1);
}
public static <E> boolean isEqualCollection(java.util.Collection<? extends E> p0,java.util.Collection<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2){
return CollectionUtils.isEqualCollection(p0,p1,p2);
}
public static <O> java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,java.util.Comparator<? super O> p2,boolean p3){
return CollectionUtils.collate(p0,p1,p2,p3);
}
public static <O extends java.lang.Comparable<? super O> > java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,boolean p2){
return CollectionUtils.collate(p0,p1,p2);
}
public static <C> boolean matchesAll(java.lang.Iterable<C> p0,org.apache.commons.collections4.Predicate<? super C> p1){
return CollectionUtils.matchesAll(p0,p1);
}
public static <T> boolean filterInverse(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
return CollectionUtils.filterInverse(p0,p1);
}
public static boolean isEmpty(java.util.Map<?, ?> p0){
return MapUtils.isEmpty(p0);
}
public static boolean isNotEmpty(java.util.Map<?, ?> p0){
return MapUtils.isNotEmpty(p0);
}
public static <K> boolean getBooleanValue(java.util.Map<? super K, ?> p0,K p1,boolean p2){
return MapUtils.getBooleanValue(p0,p1,p2);
}
public static <K> boolean getBooleanValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getBooleanValue(p0,p1);
}
public static <E> boolean contains(java.util.Iterator<E> p0,java.lang.Object p1){
return IteratorUtils.contains(p0,p1);
}
public static boolean isEmpty(java.util.Iterator<?> p0){
return IteratorUtils.isEmpty(p0);
}
public static <E> boolean matchesAny(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IteratorUtils.matchesAny(p0,p1);
}
public static <E> boolean matchesAll(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IteratorUtils.matchesAll(p0,p1);
}
public static boolean isEqualSet(java.util.Collection<?> p0,java.util.Collection<?> p1){
return SetUtils.isEqualSet(p0,p1);
}
public static boolean isEmpty(org.apache.commons.collections4.MultiValuedMap<?, ?> p0){
return MultiMapUtils.isEmpty(p0);
}
public static <E> org.apache.commons.collections4.Closure<E> whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,boolean p2){
return WhileClosure.whileClosure(p0,p1,p2);
}
public static boolean isEqualList(java.util.Collection<?> p0,java.util.Collection<?> p1){
return ListUtils.isEqualList(p0,p1);
}
public static <E> boolean contains(java.lang.Iterable<? extends E> p0,E p1,org.apache.commons.collections4.Equator<? super E> p2){
return IterableUtils.contains(p0,p1,p2);
}
public static <E> boolean contains(java.lang.Iterable<E> p0,java.lang.Object p1){
return IterableUtils.contains(p0,p1);
}
public static <E> boolean matchesAny(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IterableUtils.matchesAny(p0,p1);
}
public static <E> boolean matchesAll(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IterableUtils.matchesAll(p0,p1);
}
public static boolean isValidAnnotationMemberType(java.lang.Class<?> p0){
return AnnotationUtils.isValidAnnotationMemberType(p0);
}
public static boolean[] add(boolean[] p0,int p1,boolean p2){
return ArrayUtils.add(p0,p1,p2);
}
public static boolean[] add(boolean[] p0,boolean p1){
return ArrayUtils.add(p0,p1);
}
public static int indexOf(boolean[] p0,boolean p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static boolean contains(java.lang.Object[] p0,java.lang.Object p1){
return ArrayUtils.contains(p0,p1);
}
public static boolean contains(double[] p0,double p1,double p2){
return ArrayUtils.contains(p0,p1,p2);
}
public static boolean isEmpty(double[] p0){
return ArrayUtils.isEmpty(p0);
}
public static boolean isEmpty(int[] p0){
return ArrayUtils.isEmpty(p0);
}
public static boolean isEmpty(byte[] p0){
return ArrayUtils.isEmpty(p0);
}
public static boolean isEmpty(char[] p0){
return ArrayUtils.isEmpty(p0);
}
public static boolean isEmpty(java.lang.Object[] p0){
return ArrayUtils.isEmpty(p0);
}
public static boolean isEmpty(long[] p0){
return ArrayUtils.isEmpty(p0);
}
public static boolean isEmpty(short[] p0){
return ArrayUtils.isEmpty(p0);
}
public static boolean isEmpty(boolean[] p0){
return ArrayUtils.isEmpty(p0);
}
public static boolean isEmpty(float[] p0){
return ArrayUtils.isEmpty(p0);
}
public static int lastIndexOf(boolean[] p0,boolean p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static boolean[] removeElement(boolean[] p0,boolean p1){
return ArrayUtils.removeElement(p0,p1);
}
public static boolean isNotEmpty(short[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static boolean isNotEmpty(char[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static boolean isNotEmpty(int[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static boolean isNotEmpty(boolean[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static boolean isNotEmpty(float[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static boolean isNotEmpty(double[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static boolean isNotEmpty(byte[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static boolean isNotEmpty(long[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static <T> boolean isNotEmpty(T[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static boolean isSorted(long[] p0){
return ArrayUtils.isSorted(p0);
}
public static boolean isSorted(int[] p0){
return ArrayUtils.isSorted(p0);
}
public static boolean isSorted(byte[] p0){
return ArrayUtils.isSorted(p0);
}
public static <T> boolean isSorted(T[] p0,java.util.Comparator<T> p1){
return ArrayUtils.isSorted(p0,p1);
}
public static boolean isSorted(short[] p0){
return ArrayUtils.isSorted(p0);
}
public static boolean isSorted(float[] p0){
return ArrayUtils.isSorted(p0);
}
public static boolean isSorted(double[] p0){
return ArrayUtils.isSorted(p0);
}
public static boolean isSorted(boolean[] p0){
return ArrayUtils.isSorted(p0);
}
public static <T extends java.lang.Comparable<? super T> > boolean isSorted(T[] p0){
return ArrayUtils.isSorted(p0);
}
public static boolean isSorted(char[] p0){
return ArrayUtils.isSorted(p0);
}
public static boolean isSameLength(short[] p0,short[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static boolean isSameLength(boolean[] p0,boolean[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static boolean isSameLength(int[] p0,int[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static boolean isSameLength(long[] p0,long[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static boolean isSameLength(float[] p0,float[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static boolean isSameLength(java.lang.Object[] p0,java.lang.Object[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static boolean isSameLength(byte[] p0,byte[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static boolean isSameLength(double[] p0,double[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static boolean isSameLength(char[] p0,char[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static boolean isSameType(java.lang.Object p0,java.lang.Object p1){
return ArrayUtils.isSameType(p0,p1);
}
public static boolean isEquals(java.lang.Object p0,java.lang.Object p1){
return ArrayUtils.isEquals(p0,p1);
}
public static boolean[] toPrimitive(java.lang.Boolean[] p0,boolean p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static boolean and(boolean... p0){
return BooleanUtils.and(p0);
}
public static boolean or(boolean... p0){
return BooleanUtils.or(p0);
}
public static boolean xor(boolean... p0){
return BooleanUtils.xor(p0);
}
public static int toInteger(boolean p0){
return BooleanUtils.toInteger(p0);
}
public static int toInteger(boolean p0,int p1,int p2){
return BooleanUtils.toInteger(p0,p1,p2);
}
public static boolean toBoolean(java.lang.String p0,java.lang.String p1,java.lang.String p2){
return BooleanUtils.toBoolean(p0,p1,p2);
}
public static boolean toBoolean(int p0){
return BooleanUtils.toBoolean(p0);
}
public static boolean toBoolean(int p0,int p1,int p2){
return BooleanUtils.toBoolean(p0,p1,p2);
}
public static boolean toBoolean(java.lang.Integer p0,java.lang.Integer p1,java.lang.Integer p2){
return BooleanUtils.toBoolean(p0,p1,p2);
}
public static boolean toBoolean(java.lang.String p0){
return BooleanUtils.toBoolean(p0);
}
public static java.lang.String toStringOnOff(boolean p0){
return BooleanUtils.toStringOnOff(p0);
}
public static java.lang.String toStringYesNo(boolean p0){
return BooleanUtils.toStringYesNo(p0);
}
public static java.lang.Integer toIntegerObject(boolean p0,java.lang.Integer p1,java.lang.Integer p2){
return BooleanUtils.toIntegerObject(p0,p1,p2);
}
public static java.lang.Integer toIntegerObject(boolean p0){
return BooleanUtils.toIntegerObject(p0);
}
public static java.lang.String toStringTrueFalse(boolean p0){
return BooleanUtils.toStringTrueFalse(p0);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
return EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3);
}
public static int reflectionHashCode(java.lang.Object p0,boolean p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static <T> int reflectionHashCode(int p0,int p1,T p2,boolean p3,java.lang.Class<? super T> p4,java.lang.String... p5){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}
public static <T> java.lang.String reflectionToString(T p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2,java.lang.Class<? super T> p3){
return ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2){
return ToStringBuilder.reflectionToString(p0,p1,p2);
}
public static boolean isSupported(java.lang.String p0){
return CharEncoding.isSupported(p0);
}
public static boolean containsAny(java.lang.String p0,java.lang.String... p1){
return CharSetUtils.containsAny(p0,p1);
}
public static boolean isAscii(char p0){
return CharUtils.isAscii(p0);
}
public static boolean isAsciiPrintable(char p0){
return CharUtils.isAsciiPrintable(p0);
}
public static boolean isAsciiControl(char p0){
return CharUtils.isAsciiControl(p0);
}
public static boolean isAsciiNumeric(char p0){
return CharUtils.isAsciiNumeric(p0);
}
public static boolean isAsciiAlpha(char p0){
return CharUtils.isAsciiAlpha(p0);
}
public static boolean isAsciiAlphaUpper(char p0){
return CharUtils.isAsciiAlphaUpper(p0);
}
public static boolean isAsciiAlphaLower(char p0){
return CharUtils.isAsciiAlphaLower(p0);
}
public static boolean isAsciiAlphanumeric(char p0){
return CharUtils.isAsciiAlphanumeric(p0);
}
public static boolean isAssignable(java.lang.Class<?> p0,java.lang.Class<?> p1,boolean p2){
return ClassUtils.isAssignable(p0,p1,p2);
}
public static boolean isAssignable(java.lang.Class<?>[] p0,java.lang.Class<?>[] p1,boolean p2){
return ClassUtils.isAssignable(p0,p1,p2);
}
public static boolean isAssignable(java.lang.Class<?>[] p0,java.lang.Class<?>... p1){
return ClassUtils.isAssignable(p0,p1);
}
public static boolean isAssignable(java.lang.Class<?> p0,java.lang.Class<?> p1){
return ClassUtils.isAssignable(p0,p1);
}
public static boolean isInnerClass(java.lang.Class<?> p0){
return ClassUtils.isInnerClass(p0);
}
public static boolean isPrimitiveWrapper(java.lang.Class<?> p0){
return ClassUtils.isPrimitiveWrapper(p0);
}
public static boolean isPrimitiveOrWrapper(java.lang.Class<?> p0){
return ClassUtils.isPrimitiveOrWrapper(p0);
}
public static <E extends java.lang.Enum<E> > boolean isValidEnum(java.lang.Class<E> p0,java.lang.String p1){
return EnumUtils.isValidEnum(p0,p1);
}
public static boolean isAvailableLocale(java.util.Locale p0){
return LocaleUtils.isAvailableLocale(p0);
}
public static boolean isDigits(java.lang.String p0){
return NumberUtils.isDigits(p0);
}
public static boolean isNumber(java.lang.String p0){
return NumberUtils.isNumber(p0);
}
public static boolean isParsable(java.lang.String p0){
return NumberUtils.isParsable(p0);
}
public static <T extends java.lang.Comparable<? super T> > int compare(T p0,T p1,boolean p2){
return ObjectUtils.compare(p0,p1,p2);
}
public static boolean CONST(boolean p0){
return ObjectUtils.CONST(p0);
}
public static boolean notEqual(java.lang.Object p0,java.lang.Object p1){
return ObjectUtils.notEqual(p0,p1);
}
public static java.lang.String random(int p0,boolean p1,boolean p2){
return RandomStringUtils.random(p0,p1,p2);
}
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char... p5){
return RandomStringUtils.random(p0,p1,p2,p3,p4,p5);
}
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5,java.util.Random p6){
return RandomStringUtils.random(p0,p1,p2,p3,p4,p5,p6);
}
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4){
return RandomStringUtils.random(p0,p1,p2,p3,p4);
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
return FieldUtils.getDeclaredField(p0,p1,p2);
}
public static java.lang.reflect.Field getField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
return FieldUtils.getField(p0,p1,p2);
}
public static java.lang.Object readStaticField(java.lang.reflect.Field p0,boolean p1) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2,p3);
}
public static java.lang.Object readField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readField(p0,p1,p2);
}
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readField(p0,p1,p2);
}
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2,p3);
}
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2,p3);
}
public static java.lang.Object readDeclaredField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredField(p0,p1,p2);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1,p2);
}
public static void removeFinalModifier(java.lang.reflect.Field p0,boolean p1){
 FieldUtils.removeFinalModifier(p0,p1);
}
public static void writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredField(p0,p1,p2,p3);
}
public static void writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
public static boolean isInstance(java.lang.Object p0,java.lang.reflect.Type p1){
return TypeUtils.isInstance(p0,p1);
}
public static boolean isArrayType(java.lang.reflect.Type p0){
return TypeUtils.isArrayType(p0);
}
public static boolean isAssignable(java.lang.reflect.Type p0,java.lang.reflect.Type p1){
return TypeUtils.isAssignable(p0,p1);
}
public static boolean containsTypeVariables(java.lang.reflect.Type p0){
return TypeUtils.containsTypeVariables(p0);
}
public static boolean typesSatisfyVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p0){
return TypeUtils.typesSatisfyVariables(p0);
}
public static boolean contains(java.lang.CharSequence p0,int p1){
return StringUtils.contains(p0,p1);
}
public static boolean contains(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.contains(p0,p1);
}
public static boolean endsWith(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.endsWith(p0,p1);
}
public static boolean isEmpty(java.lang.CharSequence p0){
return StringUtils.isEmpty(p0);
}
public static boolean startsWith(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.startsWith(p0,p1);
}
public static boolean isWhitespace(java.lang.CharSequence p0){
return StringUtils.isWhitespace(p0);
}
public static boolean isAlpha(java.lang.CharSequence p0){
return StringUtils.isAlpha(p0);
}
public static boolean isNumeric(java.lang.CharSequence p0){
return StringUtils.isNumeric(p0);
}
public static boolean containsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.containsIgnoreCase(p0,p1);
}
public static boolean containsWhitespace(java.lang.CharSequence p0){
return StringUtils.containsWhitespace(p0);
}
public static boolean isAlphanumericSpace(java.lang.CharSequence p0){
return StringUtils.isAlphanumericSpace(p0);
}
public static boolean isAnyEmpty(java.lang.CharSequence... p0){
return StringUtils.isAnyEmpty(p0);
}
public static boolean isBlank(java.lang.CharSequence p0){
return StringUtils.isBlank(p0);
}
public static boolean isNotBlank(java.lang.CharSequence p0){
return StringUtils.isNotBlank(p0);
}
public static boolean isNoneEmpty(java.lang.CharSequence... p0){
return StringUtils.isNoneEmpty(p0);
}
public static boolean isAnyBlank(java.lang.CharSequence... p0){
return StringUtils.isAnyBlank(p0);
}
public static boolean isNoneBlank(java.lang.CharSequence... p0){
return StringUtils.isNoneBlank(p0);
}
public static boolean isNotEmpty(java.lang.CharSequence p0){
return StringUtils.isNotEmpty(p0);
}
public static boolean containsOnly(java.lang.CharSequence p0,java.lang.String p1){
return StringUtils.containsOnly(p0,p1);
}
public static boolean containsOnly(java.lang.CharSequence p0,char... p1){
return StringUtils.containsOnly(p0,p1);
}
public static boolean containsNone(java.lang.CharSequence p0,char... p1){
return StringUtils.containsNone(p0,p1);
}
public static boolean containsNone(java.lang.CharSequence p0,java.lang.String p1){
return StringUtils.containsNone(p0,p1);
}
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.containsAny(p0,p1);
}
public static boolean containsAny(java.lang.CharSequence p0,char... p1){
return StringUtils.containsAny(p0,p1);
}
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.containsAny(p0,p1);
}
public static boolean isAlphanumeric(java.lang.CharSequence p0){
return StringUtils.isAlphanumeric(p0);
}
public static boolean isAsciiPrintable(java.lang.CharSequence p0){
return StringUtils.isAsciiPrintable(p0);
}
public static boolean isAlphaSpace(java.lang.CharSequence p0){
return StringUtils.isAlphaSpace(p0);
}
public static boolean isAllUpperCase(java.lang.CharSequence p0){
return StringUtils.isAllUpperCase(p0);
}
public static boolean isAllLowerCase(java.lang.CharSequence p0){
return StringUtils.isAllLowerCase(p0);
}
public static boolean isNumericSpace(java.lang.CharSequence p0){
return StringUtils.isNumericSpace(p0);
}
public static boolean startsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.startsWithAny(p0,p1);
}
public static boolean endsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.endsWithAny(p0,p1);
}
public static boolean endsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.endsWithIgnoreCase(p0,p1);
}
public static boolean startsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.startsWithIgnoreCase(p0,p1);
}
public static boolean isJavaAwtHeadless(){
return SystemUtils.isJavaAwtHeadless();
}
public static boolean isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion p0){
return SystemUtils.isJavaVersionAtLeast(p0);
}
public static java.lang.String wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3){
return WordUtils.wrap(p0,p1,p2,p3);
}
public static boolean isSameLocalTime(java.util.Calendar p0,java.util.Calendar p1){
return DateUtils.isSameLocalTime(p0,p1);
}
public static boolean isSameInstant(java.util.Date p0,java.util.Date p1){
return DateUtils.isSameInstant(p0,p1);
}
public static boolean isSameInstant(java.util.Calendar p0,java.util.Calendar p1){
return DateUtils.isSameInstant(p0,p1);
}
public static boolean isSameDay(java.util.Calendar p0,java.util.Calendar p1){
return DateUtils.isSameDay(p0,p1);
}
public static boolean isSameDay(java.util.Date p0,java.util.Date p1){
return DateUtils.isSameDay(p0,p1);
}
public static boolean truncatedEquals(java.util.Calendar p0,java.util.Calendar p1,int p2){
return DateUtils.truncatedEquals(p0,p1,p2);
}
public static boolean truncatedEquals(java.util.Date p0,java.util.Date p1,int p2){
return DateUtils.truncatedEquals(p0,p1,p2);
}
public static java.lang.String formatDuration(long p0,java.lang.String p1,boolean p2){
return DurationFormatUtils.formatDuration(p0,p1,p2);
}
public static java.lang.String formatPeriod(long p0,long p1,java.lang.String p2,boolean p3,java.util.TimeZone p4){
return DurationFormatUtils.formatPeriod(p0,p1,p2,p3,p4);
}
public static java.lang.String formatDurationWords(long p0,boolean p1,boolean p2){
return DurationFormatUtils.formatDurationWords(p0,p1,p2);
}
public static void validState(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Validate.validState(p0,p1,p2);
}
public static void validState(boolean p0){
 Validate.validState(p0);
}
public static void isTrue(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Validate.isTrue(p0,p1,p2);
}
public static void isTrue(boolean p0,java.lang.String p1,long p2){
 Validate.isTrue(p0,p1,p2);
}
public static void isTrue(boolean p0,java.lang.String p1,double p2){
 Validate.isTrue(p0,p1,p2);
}
public static void isTrue(boolean p0){
 Validate.isTrue(p0);
}
public static boolean verifyInterpolationArray(double[] p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.NonMonotonicSequenceException{
return PolynomialFunctionLagrangeForm.verifyInterpolationArray(p0,p1,p2);
}
public static boolean isSequence(double p0,double p1,double p2){
return UnivariateSolverUtils.isSequence(p0,p1,p2);
}
public static boolean isBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException{
return UnivariateSolverUtils.isBracketing(p0,p1,p2);
}
public static boolean oneWayAnovaTest(java.util.Collection<double[]> p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.ConvergenceException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.oneWayAnovaTest(p0,p1);
}
public static boolean pairedTTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.pairedTTest(p0,p1,p2);
}
public static boolean chiSquareTest(double[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTest(p0,p1,p2);
}
public static boolean chiSquareTest(long[][] p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTest(p0,p1);
}
public static boolean gTest(double[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.gTest(p0,p1,p2);
}
public static double exactP(double p0,int p1,int p2,boolean p3){
return TestUtils.exactP(p0,p1,p2,p3);
}
public static boolean tTest(double p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1,p2);
}
public static boolean tTest(double p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1,p2);
}
public static boolean tTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1,p2);
}
public static boolean tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.tTest(p0,p1,p2);
}
public static double monteCarloP(double p0,int p1,int p2,boolean p3,int p4){
return TestUtils.monteCarloP(p0,p1,p2,p3,p4);
}
public static boolean homoscedasticTTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.homoscedasticTTest(p0,p1,p2);
}
public static boolean chiSquareTestDataSetsComparison(long[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.chiSquareTestDataSetsComparison(p0,p1,p2);
}
public static boolean gTestDataSetsComparison(long[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
return TestUtils.gTestDataSetsComparison(p0,p1,p2);
}
public static double kolmogorovSmirnovTest(double[] p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
public static double kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
public static boolean kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,double p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
public static boolean isSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1){
return MatrixUtils.isSymmetric(p0,p1);
}
public static boolean equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex p0,org.apache.commons.math3.complex.Complex p1,double p2){
return Complex.equalsWithRelativeTolerance(p0,p1,p2);
}
public static boolean isPrime(int p0){
return Primes.isPrime(p0);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p4,int p5,int p6,boolean p7,org.apache.commons.math3.fitting.leastsquares.ParameterValidator p8){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
public static boolean parseFixedstring(java.lang.String p0,java.lang.String p1,java.text.ParsePosition p2){
return CompositeFormat.parseFixedstring(p0,p1,p2);
}
public static boolean verifyValues(double[] p0,double[] p1,int p2,int p3,boolean p4) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return MathArrays.verifyValues(p0,p1,p2,p3,p4);
}
public static boolean verifyValues(double[] p0,double[] p1,int p2,int p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return MathArrays.verifyValues(p0,p1,p2,p3);
}
public static boolean verifyValues(double[] p0,int p1,int p2,boolean p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return MathArrays.verifyValues(p0,p1,p2,p3);
}
public static boolean verifyValues(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return MathArrays.verifyValues(p0,p1,p2);
}
public static boolean checkEqualLength(int[] p0,int[] p1,boolean p2){
return MathArrays.checkEqualLength(p0,p1,p2);
}
public static boolean checkEqualLength(double[] p0,double[] p1,boolean p2){
return MathArrays.checkEqualLength(p0,p1,p2);
}
public static boolean checkOrder(double[] p0,OrderDirection p1,boolean p2,boolean p3) throws org.apache.commons.math3.exception.NonMonotonicSequenceException{
return MathArrays.checkOrder(p0,p1,p2,p3);
}
public static void checkOrder(double[] p0,OrderDirection p1,boolean p2) throws org.apache.commons.math3.exception.NonMonotonicSequenceException{
 MathArrays.checkOrder(p0,p1,p2);
}
public static boolean equalsIncludingNaN(float[] p0,float[] p1){
return MathArrays.equalsIncludingNaN(p0,p1);
}
public static boolean equalsIncludingNaN(double[] p0,double[] p1){
return MathArrays.equalsIncludingNaN(p0,p1);
}
public static <T extends java.lang.Comparable<? super T> > boolean isMonotonic(T[] p0,OrderDirection p1,boolean p2){
return MathArrays.isMonotonic(p0,p1,p2);
}
public static boolean isMonotonic(double[] p0,OrderDirection p1,boolean p2){
return MathArrays.isMonotonic(p0,p1,p2);
}
public static boolean equalsWithRelativeTolerance(double p0,double p1,double p2){
return Precision.equalsWithRelativeTolerance(p0,p1,p2);
}
public static boolean equalsIncludingNaN(double p0,double p1){
return Precision.equalsIncludingNaN(p0,p1);
}
public static boolean equalsIncludingNaN(float p0,float p1,int p2){
return Precision.equalsIncludingNaN(p0,p1,p2);
}
public static boolean equalsIncludingNaN(float p0,float p1,float p2){
return Precision.equalsIncludingNaN(p0,p1,p2);
}
public static boolean equalsIncludingNaN(double p0,double p1,int p2){
return Precision.equalsIncludingNaN(p0,p1,p2);
}
public static boolean equalsIncludingNaN(float p0,float p1){
return Precision.equalsIncludingNaN(p0,p1);
}
public static boolean equalsIncludingNaN(double p0,double p1,double p2){
return Precision.equalsIncludingNaN(p0,p1,p2);
}
public static void setApplyLocalized(boolean p0){
 LocaleBeanUtils.setApplyLocalized(p0);
}
public static boolean getApplyLocalized(){
return LocaleBeanUtils.getApplyLocalized();
}
public static boolean initCause(java.lang.Throwable p0,java.lang.Throwable p1){
return BeanUtils.initCause(p0,p1);
}
public static boolean getCacheFast(java.util.Map<?, ?> p0){
return BeanUtils.getCacheFast(p0);
}
public static void setCacheFast(java.util.Map<?, ?> p0,boolean p1){
 BeanUtils.setCacheFast(p0,p1);
}
public static boolean isWriteable(java.lang.Object p0,java.lang.String p1){
return PropertyUtils.isWriteable(p0,p1);
}
public static boolean isReadable(java.lang.Object p0,java.lang.String p1){
return PropertyUtils.isReadable(p0,p1);
}
public static boolean removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector p0){
return PropertyUtils.removeBeanIntrospector(p0);
}
public static synchronized void setCacheMethods(boolean p0){
 MethodUtils.setCacheMethods(p0);
}
public static final boolean isAssignmentCompatible(java.lang.Class<?> p0,java.lang.Class<?> p1){
return MethodUtils.isAssignmentCompatible(p0,p1);
}
public static boolean getDefaultBoolean(){
return ConvertUtils.getDefaultBoolean();
}
public static void setDefaultBoolean(boolean p0){
 ConvertUtils.setDefaultBoolean(p0);
}
public static boolean isDelimiter(int p0,char[] p1){
return WordUtils.isDelimiter(p0,p1);
}
public static boolean isDelimiter(char p0,char[] p1){
return WordUtils.isDelimiter(p0,p1);
}
public static java.lang.String wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3,java.lang.String p4){
return WordUtils.wrap(p0,p1,p2,p3,p4);
}
public static boolean containsAllWords(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return WordUtils.containsAllWords(p0,p1);
}
public static void fill(boolean[] p0,int p1,int p2,boolean p3){
 BooleanArrays.fill(p0,p1,p2,p3);
}
public static void fill(boolean[] p0,boolean p1){
 BooleanArrays.fill(p0,p1);
}
public static void set(boolean[][] p0,long p1,boolean p2){
 BooleanBigArrays.set(p0,p1,p2);
}
public static void fill(boolean[][] p0,long p1,long p2,boolean p3){
 BooleanBigArrays.fill(p0,p1,p2,p3);
}
public static void fill(boolean[][] p0,boolean p1){
 BooleanBigArrays.fill(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigListIterator singleton(boolean p0){
return BooleanBigListIterators.singleton(p0);
}
public static boolean all(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
return BooleanIterators.all(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
return BooleanIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction singleton(byte p0,boolean p1){
return Byte2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(byte p0,boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,byte[] p1,byte[] p2,int p3,int p4,boolean p5){
 ByteArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,byte[] p1,byte[] p2,boolean p3){
 ByteArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4){
 ByteArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void radixSortIndirect(int[] p0,byte[] p1,boolean p2){
 ByteArrays.radixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4){
 ByteArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSortIndirect(int[] p0,byte[] p1,boolean p2){
 ByteArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static boolean all(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
return ByteIterators.all(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
return ByteIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(char p0,boolean p1){
return Char2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(char p0,boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,int p3,int p4,boolean p5){
 CharArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,boolean p3){
 CharArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
 CharArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void radixSortIndirect(int[] p0,char[] p1,boolean p2){
 CharArrays.radixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
 CharArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSortIndirect(int[] p0,char[] p1,boolean p2){
 CharArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static boolean all(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
return CharIterators.all(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
return CharIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction singleton(double p0,boolean p1){
return Double2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(double p0,boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,double[] p1,double[] p2,boolean p3){
 DoubleArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,double[] p1,boolean p2){
 DoubleArrays.radixSortIndirect(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4){
 DoubleArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void radixSortIndirect(int[] p0,double[] p1,double[] p2,int p3,int p4,boolean p5){
 DoubleArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void parallelRadixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4){
 DoubleArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSortIndirect(int[] p0,double[] p1,boolean p2){
 DoubleArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static boolean all(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
return DoubleIterators.all(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
return DoubleIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction singleton(float p0,boolean p1){
return Float2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(float p0,boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,float[] p1,boolean p2){
 FloatArrays.radixSortIndirect(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,boolean p3){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,int p3,int p4,boolean p5){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void parallelRadixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
 FloatArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSortIndirect(int[] p0,float[] p1,boolean p2){
 FloatArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static boolean all(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
return FloatIterators.all(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
return FloatIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction singleton(int p0,boolean p1){
return Int2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(int p0,boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,int[] p1,int[] p2,int p3,int p4,boolean p5){
 IntArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,int[] p1,int[] p2,boolean p3){
 IntArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4){
 IntArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void radixSortIndirect(int[] p0,int[] p1,boolean p2){
 IntArrays.radixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4){
 IntArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSortIndirect(int[] p0,int[] p1,boolean p2){
 IntArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static boolean all(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
return IntIterators.all(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
return IntIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction singleton(long p0,boolean p1){
return Long2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(long p0,boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,long[] p1,long[] p2,int p3,int p4,boolean p5){
 LongArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,long[] p1,long[] p2,boolean p3){
 LongArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4){
 LongArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void radixSortIndirect(int[] p0,long[] p1,boolean p2){
 LongArrays.radixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4){
 LongArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSortIndirect(int[] p0,long[] p1,boolean p2){
 LongArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static boolean all(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
return LongIterators.all(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
return LongIterators.any(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> singleton(K p0,boolean p1){
return Object2BooleanFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> singleton(K p0,boolean p1,java.util.Comparator<? super K> p2){
return Object2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static <K> boolean all(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0,java.util.function.Predicate<? super K> p1){
return ObjectIterators.all(p0,p1);
}
public static <K> boolean any(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0,java.util.function.Predicate<? super K> p1){
return ObjectIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction singleton(short p0,boolean p1){
return Short2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(short p0,boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,short[] p1,short[] p2,int p3,int p4,boolean p5){
 ShortArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,short[] p1,short[] p2,boolean p3){
 ShortArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4){
 ShortArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void radixSortIndirect(int[] p0,short[] p1,boolean p2){
 ShortArrays.radixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4){
 ShortArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSortIndirect(int[] p0,short[] p1,boolean p2){
 ShortArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static boolean all(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
return ShortIterators.all(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
return ShortIterators.any(p0,p1);
}
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1,java.lang.String p2,java.lang.Object... p3) throws T{
 Validations.checkState(p0,p1,p2,p3);
}
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1,java.lang.String p2) throws T{
 Validations.checkState(p0,p1,p2);
}
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1) throws T{
 Validations.checkState(p0,p1);
}
public static boolean isNotEmpty(java.lang.Object[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static boolean xor(boolean[] p0){
return BooleanUtils.xor(p0);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3,java.lang.String[] p4){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.lang.String[] p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1){
return EqualsBuilder.reflectionEquals(p0,p1);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3){
return EqualsBuilder.reflectionEquals(p0,p1,p2,p3);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3,java.lang.String[] p4){
return EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3,java.lang.Class p4){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3,java.lang.Class p4,java.lang.String[] p5){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2){
return ToStringBuilder.reflectionToString(p0,p1,p2);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2,java.lang.Class p3){
return ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
public static boolean isAssignable(java.lang.Class[] p0,java.lang.Class[] p1,boolean p2){
return ClassUtils.isAssignable(p0,p1,p2);
}
public static boolean isAssignable(java.lang.Class[] p0,java.lang.Class[] p1){
return ClassUtils.isAssignable(p0,p1);
}
public static boolean isAssignable(java.lang.Class p0,java.lang.Class p1,boolean p2){
return ClassUtils.isAssignable(p0,p1,p2);
}
public static boolean isAssignable(java.lang.Class p0,java.lang.Class p1){
return ClassUtils.isAssignable(p0,p1);
}
public static boolean isInnerClass(java.lang.Class p0){
return ClassUtils.isInnerClass(p0);
}
public static boolean setCause(java.lang.Throwable p0,java.lang.Throwable p1){
return ExceptionUtils.setCause(p0,p1);
}
public static boolean isNestedThrowable(java.lang.Throwable p0){
return ExceptionUtils.isNestedThrowable(p0);
}
public static boolean isThrowableNested(){
return ExceptionUtils.isThrowableNested();
}
public static boolean isCauseMethodName(java.lang.String p0){
return ExceptionUtils.isCauseMethodName(p0);
}
public static boolean nextBoolean(){
return RandomUtils.nextBoolean();
}
public static boolean nextBoolean(java.util.Random p0){
return RandomUtils.nextBoolean(p0);
}
public static int compare(java.lang.Comparable p0,java.lang.Comparable p1,boolean p2){
return ObjectUtils.compare(p0,p1,p2);
}
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5){
return RandomStringUtils.random(p0,p1,p2,p3,p4,p5);
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class p0,java.lang.String p1,boolean p2){
return FieldUtils.getDeclaredField(p0,p1,p2);
}
public static java.lang.reflect.Field getField(java.lang.Class p0,java.lang.String p1,boolean p2){
return FieldUtils.getField(p0,p1,p2);
}
public static java.lang.Object readStaticField(java.lang.Class p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2,p3);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1,p2);
}
public static void writeDeclaredStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
public static boolean contains(java.lang.String p0,char p1){
return StringUtils.contains(p0,p1);
}
public static boolean contains(java.lang.String p0,java.lang.String p1){
return StringUtils.contains(p0,p1);
}
public static boolean endsWith(java.lang.String p0,java.lang.String p1){
return StringUtils.endsWith(p0,p1);
}
public static boolean equalsIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.equalsIgnoreCase(p0,p1);
}
public static boolean isEmpty(java.lang.String p0){
return StringUtils.isEmpty(p0);
}
public static boolean startsWith(java.lang.String p0,java.lang.String p1){
return StringUtils.startsWith(p0,p1);
}
public static boolean isWhitespace(java.lang.String p0){
return StringUtils.isWhitespace(p0);
}
public static boolean isAlpha(java.lang.String p0){
return StringUtils.isAlpha(p0);
}
public static boolean isNumeric(java.lang.String p0){
return StringUtils.isNumeric(p0);
}
public static boolean containsIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.containsIgnoreCase(p0,p1);
}
public static boolean isAlphanumericSpace(java.lang.String p0){
return StringUtils.isAlphanumericSpace(p0);
}
public static boolean isBlank(java.lang.String p0){
return StringUtils.isBlank(p0);
}
public static boolean isNotBlank(java.lang.String p0){
return StringUtils.isNotBlank(p0);
}
public static boolean isNotEmpty(java.lang.String p0){
return StringUtils.isNotEmpty(p0);
}
public static boolean containsOnly(java.lang.String p0,char[] p1){
return StringUtils.containsOnly(p0,p1);
}
public static boolean containsOnly(java.lang.String p0,java.lang.String p1){
return StringUtils.containsOnly(p0,p1);
}
public static boolean containsNone(java.lang.String p0,java.lang.String p1){
return StringUtils.containsNone(p0,p1);
}
public static boolean containsNone(java.lang.String p0,char[] p1){
return StringUtils.containsNone(p0,p1);
}
public static boolean containsAny(java.lang.String p0,char[] p1){
return StringUtils.containsAny(p0,p1);
}
public static boolean containsAny(java.lang.String p0,java.lang.String p1){
return StringUtils.containsAny(p0,p1);
}
public static boolean isAlphanumeric(java.lang.String p0){
return StringUtils.isAlphanumeric(p0);
}
public static boolean isAsciiPrintable(java.lang.String p0){
return StringUtils.isAsciiPrintable(p0);
}
public static boolean isAlphaSpace(java.lang.String p0){
return StringUtils.isAlphaSpace(p0);
}
public static boolean isAllUpperCase(java.lang.String p0){
return StringUtils.isAllUpperCase(p0);
}
public static boolean isAllLowerCase(java.lang.String p0){
return StringUtils.isAllLowerCase(p0);
}
public static boolean isNumericSpace(java.lang.String p0){
return StringUtils.isNumericSpace(p0);
}
public static boolean startsWithAny(java.lang.String p0,java.lang.String[] p1){
return StringUtils.startsWithAny(p0,p1);
}
public static boolean endsWithAny(java.lang.String p0,java.lang.String[] p1){
return StringUtils.endsWithAny(p0,p1);
}
public static boolean endsWithIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.endsWithIgnoreCase(p0,p1);
}
public static boolean startsWithIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.startsWithIgnoreCase(p0,p1);
}
public static boolean isJavaVersionAtLeast(float p0){
return SystemUtils.isJavaVersionAtLeast(p0);
}
public static boolean isJavaVersionAtLeast(int p0){
return SystemUtils.isJavaVersionAtLeast(p0);
}
public static void isTrue(boolean p0,java.lang.String p1,java.lang.Object p2){
 Validate.isTrue(p0,p1,p2);
}
public static void isTrue(boolean p0,java.lang.String p1){
 Validate.isTrue(p0,p1);
}
}
