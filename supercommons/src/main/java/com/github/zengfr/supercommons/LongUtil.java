package com.github.zengfr.supercommons;
import com.google.common.primitives.Longs;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.math.NumberUtils;
import it.unimi.dsi.fastutil.bytes.Byte2LongFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2LongMaps;
import it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2LongFunctions;
import it.unimi.dsi.fastutil.chars.Char2LongMaps;
import it.unimi.dsi.fastutil.chars.Char2LongSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2LongFunctions;
import it.unimi.dsi.fastutil.doubles.Double2LongMaps;
import it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2LongFunctions;
import it.unimi.dsi.fastutil.floats.Float2LongMaps;
import it.unimi.dsi.fastutil.floats.Float2LongSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2LongFunctions;
import it.unimi.dsi.fastutil.ints.Int2LongMaps;
import it.unimi.dsi.fastutil.ints.Int2LongSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2BooleanFunctions;
import it.unimi.dsi.fastutil.longs.Long2BooleanMaps;
import it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteFunctions;
import it.unimi.dsi.fastutil.longs.Long2ByteMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2CharFunctions;
import it.unimi.dsi.fastutil.longs.Long2CharMaps;
import it.unimi.dsi.fastutil.longs.Long2CharSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2DoubleFunctions;
import it.unimi.dsi.fastutil.longs.Long2DoubleMaps;
import it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2FloatFunctions;
import it.unimi.dsi.fastutil.longs.Long2FloatMaps;
import it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2IntFunctions;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2LongFunctions;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
import it.unimi.dsi.fastutil.longs.Long2LongSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunctions;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceFunctions;
import it.unimi.dsi.fastutil.longs.Long2ReferenceMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ShortFunctions;
import it.unimi.dsi.fastutil.longs.Long2ShortMaps;
import it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2LongFunctions;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2LongFunctions;
import it.unimi.dsi.fastutil.objects.Reference2LongMaps;
import it.unimi.dsi.fastutil.objects.Reference2LongSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2LongFunctions;
import it.unimi.dsi.fastutil.shorts.Short2LongMaps;
import it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.NumberUtils;
import com.google.common.base.Suppliers;
import com.google.common.collect.Queues;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedInts;
import com.google.common.primitives.UnsignedLong;
import com.google.common.primitives.UnsignedLongs;
import com.google.common.util.concurrent.AbstractScheduledService.Scheduler;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.RateLimiter;
import com.google.common.util.concurrent.Uninterruptibles;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.EndianUtils;
import org.apache.commons.io.HexDump;
import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.collections.BufferUtils;
import org.apache.commons.collections.buffer.BlockingBuffer;
import org.apache.commons.collections.buffer.BoundedBuffer;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Conversion;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunctionFactory;
import org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunctionFactory;
import org.apache.commons.math3.stat.inference.TestUtils;
import org.apache.commons.math3.random.RandomGeneratorFactory;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.collections.primitives.LongCollections;
import it.unimi.dsi.fastutil.BigArrays;
import it.unimi.dsi.fastutil.HashCommon;
import it.unimi.dsi.fastutil.SafeMath;
import it.unimi.dsi.fastutil.booleans.BooleanBigArrayBigList;
import it.unimi.dsi.fastutil.booleans.BooleanBigArrays;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
import it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList;
import it.unimi.dsi.fastutil.bytes.ByteBigArrays;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
import it.unimi.dsi.fastutil.chars.CharBigArrayBigList;
import it.unimi.dsi.fastutil.chars.CharBigArrays;
import it.unimi.dsi.fastutil.chars.CharIterators;
import it.unimi.dsi.fastutil.doubles.DoubleBigArrayBigList;
import it.unimi.dsi.fastutil.doubles.DoubleBigArrays;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.floats.FloatBigArrayBigList;
import it.unimi.dsi.fastutil.floats.FloatBigArrays;
import it.unimi.dsi.fastutil.floats.FloatIterators;
import it.unimi.dsi.fastutil.ints.IntBigArrayBigList;
import it.unimi.dsi.fastutil.ints.IntBigArrays;
import it.unimi.dsi.fastutil.ints.IntIterators;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import it.unimi.dsi.fastutil.longs.LongArrays;
import it.unimi.dsi.fastutil.longs.LongBigArrayBigList;
import it.unimi.dsi.fastutil.longs.LongBigArrays;
import it.unimi.dsi.fastutil.longs.LongBigListIterators;
import it.unimi.dsi.fastutil.longs.LongBigLists;
import it.unimi.dsi.fastutil.longs.LongIterators;
import it.unimi.dsi.fastutil.longs.LongLists;
import it.unimi.dsi.fastutil.longs.LongSortedSets;
import it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList;
import it.unimi.dsi.fastutil.objects.ObjectBigArrays;
import it.unimi.dsi.fastutil.objects.ObjectIterators;
import it.unimi.dsi.fastutil.objects.ReferenceBigArrayBigList;
import it.unimi.dsi.fastutil.shorts.ShortBigArrayBigList;
import it.unimi.dsi.fastutil.shorts.ShortBigArrays;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
import com.facebook.util.compress.QuickLz;
import com.facebook.util.TimeInterval;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.math.JVMRandom;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.commons.lang.Validate;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongUtil{ 
public static java.lang.Long tryParse(java.lang.String p0,int p1){
return Longs.tryParse(p0,p1);
}
public static java.lang.Long tryParse(java.lang.String p0){
return Longs.tryParse(p0);
}
public static java.lang.Long getLong(java.util.Map p0,java.lang.Object p1,java.lang.Long p2){
return MapUtils.getLong(p0,p1,p2);
}
public static java.lang.Long getLong(java.util.Map p0,java.lang.Object p1){
return MapUtils.getLong(p0,p1);
}
public static <K> java.lang.Long getLong(java.util.Map<? super K, ?> p0,K p1,java.lang.Long p2){
return MapUtils.getLong(p0,p1,p2);
}
public static <K> java.lang.Long getLong(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getLong(p0,p1);
}
public static java.lang.Long createLong(java.lang.String p0){
return NumberUtils.createLong(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction singleton(java.lang.Byte p0,java.lang.Long p1){
return Byte2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(java.lang.Byte p0,java.lang.Long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2LongFunction singleton(java.lang.Character p0,java.lang.Long p1){
return Char2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(java.lang.Character p0,java.lang.Long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction singleton(java.lang.Double p0,java.lang.Long p1){
return Double2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(java.lang.Double p0,java.lang.Long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2LongFunction singleton(java.lang.Float p0,java.lang.Long p1){
return Float2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(java.lang.Float p0,java.lang.Long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2LongFunction singleton(java.lang.Integer p0,java.lang.Long p1){
return Int2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(java.lang.Integer p0,java.lang.Long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction singleton(java.lang.Long p0,java.lang.Boolean p1){
return Long2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(java.lang.Long p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction singleton(java.lang.Long p0,java.lang.Byte p1){
return Long2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(java.lang.Long p0,java.lang.Byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2CharFunction singleton(java.lang.Long p0,java.lang.Character p1){
return Long2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(java.lang.Long p0,java.lang.Character p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction singleton(java.lang.Long p0,java.lang.Double p1){
return Long2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(java.lang.Long p0,java.lang.Double p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction singleton(java.lang.Long p0,java.lang.Float p1){
return Long2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(java.lang.Long p0,java.lang.Float p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2IntFunction singleton(java.lang.Long p0,java.lang.Integer p1){
return Long2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(java.lang.Long p0,java.lang.Integer p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2LongFunction singleton(java.lang.Long p0,java.lang.Long p1){
return Long2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(java.lang.Long p0,java.lang.Long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> singleton(java.lang.Long p0,V p1){
return Long2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(java.lang.Long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction singleton(java.lang.Long p0,java.lang.Short p1){
return Long2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(java.lang.Long p0,java.lang.Short p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.LongSet singleton(java.lang.Long p0){
return LongSets.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> singleton(K p0,java.lang.Long p1){
return Object2LongFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> singleton(K p0,java.lang.Long p1,java.util.Comparator<? super K> p2){
return Object2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction singleton(java.lang.Short p0,java.lang.Long p1){
return Short2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(java.lang.Short p0,java.lang.Long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2LongSortedMaps.singleton(p0,p1,p2);
}
public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T> p0,long p1,java.util.concurrent.TimeUnit p2){
return Suppliers.memoizeWithExpiration(p0,p1,p2);
}
public static <E> int drain(java.util.concurrent.BlockingQueue<E> p0,java.util.Collection<? super E> p1,int p2,long p3,java.util.concurrent.TimeUnit p4) throws java.lang.InterruptedException{
return Queues.drain(p0,p1,p2,p3,p4);
}
public static <E> int drainUninterruptibly(java.util.concurrent.BlockingQueue<E> p0,java.util.Collection<? super E> p1,int p2,long p3,java.util.concurrent.TimeUnit p4){
return Queues.drainUninterruptibly(p0,p1,p2,p3,p4);
}
public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> p0,long p1){
return BloomFilter.create(p0,p1);
}
public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> p0,long p1,double p2){
return BloomFilter.create(p0,p1,p2);
}
public static com.google.common.hash.HashCode fromLong(long p0){
return HashCode.fromLong(p0);
}
public static com.google.common.hash.HashFunction sipHash24(long p0,long p1){
return Hashing.sipHash24(p0,p1);
}
public static int consistentHash(long p0,int p1){
return Hashing.consistentHash(p0,p1);
}
public static java.io.InputStream limit(java.io.InputStream p0,long p1){
return ByteStreams.limit(p0,p1);
}
public static long copy(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
return ByteStreams.copy(p0,p1);
}
public static long copy(java.nio.channels.ReadableByteChannel p0,java.nio.channels.WritableByteChannel p1) throws java.io.IOException{
return ByteStreams.copy(p0,p1);
}
public static void skipFully(java.io.InputStream p0,long p1) throws java.io.IOException{
 ByteStreams.skipFully(p0,p1);
}
public static long copy(java.lang.Readable p0,java.lang.Appendable p1) throws java.io.IOException{
return CharStreams.copy(p0,p1);
}
public static void skipFully(java.io.Reader p0,long p1) throws java.io.IOException{
 CharStreams.skipFully(p0,p1);
}
public static java.nio.MappedByteBuffer map(java.io.File p0,java.nio.channels.FileChannel.MapMode p1,long p2) throws java.io.FileNotFoundException,java.io.IOException{
return Files.map(p0,p1,p2);
}
public static long roundToLong(double p0,java.math.RoundingMode p1){
return DoubleMath.roundToLong(p0,p1);
}
public static long sqrt(long p0,java.math.RoundingMode p1){
return LongMath.sqrt(p0,p1);
}
public static int log10(long p0,java.math.RoundingMode p1){
return LongMath.log10(p0,p1);
}
public static long pow(long p0,int p1){
return LongMath.pow(p0,p1);
}
public static long divide(long p0,long p1,java.math.RoundingMode p2){
return LongMath.divide(p0,p1,p2);
}
public static int mod(long p0,int p1){
return LongMath.mod(p0,p1);
}
public static long mod(long p0,long p1){
return LongMath.mod(p0,p1);
}
public static long factorial(int p0){
return LongMath.factorial(p0);
}
public static long binomial(int p0,int p1){
return LongMath.binomial(p0,p1);
}
public static long checkedMultiply(long p0,long p1){
return LongMath.checkedMultiply(p0,p1);
}
public static long checkedAdd(long p0,long p1){
return LongMath.checkedAdd(p0,p1);
}
public static long mean(long p0,long p1){
return LongMath.mean(p0,p1);
}
public static long checkedPow(long p0,int p1){
return LongMath.checkedPow(p0,p1);
}
public static long checkedSubtract(long p0,long p1){
return LongMath.checkedSubtract(p0,p1);
}
public static long gcd(long p0,long p1){
return LongMath.gcd(p0,p1);
}
public static int log2(long p0,java.math.RoundingMode p1){
return LongMath.log2(p0,p1);
}
public static boolean isPowerOfTwo(long p0){
return LongMath.isPowerOfTwo(p0);
}
public static char saturatedCast(long p0){
return Chars.saturatedCast(p0);
}
public static char checkedCast(long p0){
return Chars.checkedCast(p0);
}
public static long min(long... p0){
return Longs.min(p0);
}
public static long max(long... p0){
return Longs.max(p0);
}
public static int indexOf(long[] p0,long p1){
return Longs.indexOf(p0,p1);
}
public static int compare(long p0,long p1){
return Longs.compare(p0,p1);
}
public static boolean contains(long[] p0,long p1){
return Longs.contains(p0,p1);
}
public static int lastIndexOf(long[] p0,long p1){
return Longs.lastIndexOf(p0,p1);
}
public static byte[] toByteArray(long p0){
return Longs.toByteArray(p0);
}
public static long fromBytes(byte p0,byte p1,byte p2,byte p3,byte p4,byte p5,byte p6,byte p7){
return Longs.fromBytes(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static long fromByteArray(byte[] p0){
return Longs.fromByteArray(p0);
}
public static com.google.common.primitives.UnsignedInteger valueOf(long p0){
return UnsignedInteger.valueOf(p0);
}
public static long toLong(int p0){
return UnsignedInts.toLong(p0);
}
public static com.google.common.primitives.UnsignedLong fromLongBits(long p0){
return UnsignedLong.fromLongBits(p0);
}
public static long decode(java.lang.String p0){
return UnsignedLongs.decode(p0);
}
public static long divide(long p0,long p1){
return UnsignedLongs.divide(p0,p1);
}
public static long parseUnsignedLong(java.lang.String p0,int p1){
return UnsignedLongs.parseUnsignedLong(p0,p1);
}
public static long parseUnsignedLong(java.lang.String p0){
return UnsignedLongs.parseUnsignedLong(p0);
}
public static long remainder(long p0,long p1){
return UnsignedLongs.remainder(p0,p1);
}
public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedDelaySchedule(long p0,long p1,java.util.concurrent.TimeUnit p2){
return Scheduler.newFixedDelaySchedule(p0,p1,p2);
}
public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedRateSchedule(long p0,long p1,java.util.concurrent.TimeUnit p2){
return Scheduler.newFixedRateSchedule(p0,p1,p2);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> p0,long p1,java.util.concurrent.TimeUnit p2,java.util.concurrent.ScheduledExecutorService p3){
return Futures.withTimeout(p0,p1,p2,p3);
}
public static <V,X extends java.lang.Exception > V getChecked(java.util.concurrent.Future<V> p0,java.lang.Class<X> p1,long p2,java.util.concurrent.TimeUnit p3) throws X{
return Futures.getChecked(p0,p1,p2,p3);
}
public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
return MoreExecutors.getExitingScheduledExecutorService(p0,p1,p2);
}
public static void addDelayedShutdownHook(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2){
 MoreExecutors.addDelayedShutdownHook(p0,p1,p2);
}
public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor p0,long p1,java.util.concurrent.TimeUnit p2){
return MoreExecutors.getExitingExecutorService(p0,p1,p2);
}
public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2){
return MoreExecutors.shutdownAndAwaitTermination(p0,p1,p2);
}
public static com.google.common.util.concurrent.RateLimiter create(double p0,long p1,java.util.concurrent.TimeUnit p2){
return RateLimiter.create(p0,p1,p2);
}
public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch p0,long p1,java.util.concurrent.TimeUnit p2){
return Uninterruptibles.awaitUninterruptibly(p0,p1,p2);
}
public static <V> V getUninterruptibly(java.util.concurrent.Future<V> p0,long p1,java.util.concurrent.TimeUnit p2) throws java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException{
return Uninterruptibles.getUninterruptibly(p0,p1,p2);
}
public static void sleepUninterruptibly(long p0,java.util.concurrent.TimeUnit p1){
 Uninterruptibles.sleepUninterruptibly(p0,p1);
}
public static void joinUninterruptibly(java.lang.Thread p0,long p1,java.util.concurrent.TimeUnit p2){
 Uninterruptibles.joinUninterruptibly(p0,p1,p2);
}
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,int p1,long p2,java.util.concurrent.TimeUnit p3){
return Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2,p3);
}
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,long p1,java.util.concurrent.TimeUnit p2){
return Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2);
}
public static long copy(java.io.InputStream p0,java.io.OutputStream p1,int p2) throws java.io.IOException{
return IOUtils.copy(p0,p1,p2);
}
public static long skip(java.nio.channels.ReadableByteChannel p0,long p1) throws java.io.IOException{
return IOUtils.skip(p0,p1);
}
public static long skip(java.io.InputStream p0,long p1) throws java.io.IOException{
return IOUtils.skip(p0,p1);
}
public static long skip(java.io.Reader p0,long p1) throws java.io.IOException{
return IOUtils.skip(p0,p1);
}
public static byte[] toByteArray(java.io.InputStream p0,long p1) throws java.io.IOException{
return IOUtils.toByteArray(p0,p1);
}
public static void skipFully(java.nio.channels.ReadableByteChannel p0,long p1) throws java.io.IOException{
 IOUtils.skipFully(p0,p1);
}
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,byte[] p2) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2);
}
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1);
}
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,long p2,long p3) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2,p3);
}
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,long p2,long p3,byte[] p4) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2,p3,p4);
}
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3,char[] p4) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2,p3,p4);
}
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2,p3);
}
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,char[] p2) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2);
}
public static long copyLarge(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2){
return Tailer.create(p0,p1,p2);
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
public static long readSwappedLong(byte[] p0,int p1){
return EndianUtils.readSwappedLong(p0,p1);
}
public static long readSwappedLong(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedLong(p0);
}
public static long swapLong(long p0){
return EndianUtils.swapLong(p0);
}
public static void writeSwappedLong(byte[] p0,int p1,long p2){
 EndianUtils.writeSwappedLong(p0,p1,p2);
}
public static void writeSwappedLong(java.io.OutputStream p0,long p1) throws java.io.IOException{
 EndianUtils.writeSwappedLong(p0,p1);
}
public static long readSwappedUnsignedInteger(byte[] p0,int p1){
return EndianUtils.readSwappedUnsignedInteger(p0,p1);
}
public static long readSwappedUnsignedInteger(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedUnsignedInteger(p0);
}
public static void dump(byte[] p0,long p1,java.io.OutputStream p2,int p3) throws java.io.IOException,java.lang.ArrayIndexOutOfBoundsException,java.lang.IllegalArgumentException{
 HexDump.dump(p0,p1,p2,p3);
}
public static long freeSpace(java.lang.String p0) throws java.io.IOException{
return FileSystemUtils.freeSpace(p0);
}
public static long freeSpaceKb(long p0) throws java.io.IOException{
return FileSystemUtils.freeSpaceKb(p0);
}
public static long freeSpaceKb(java.lang.String p0) throws java.io.IOException{
return FileSystemUtils.freeSpaceKb(p0);
}
public static long freeSpaceKb(java.lang.String p0,long p1) throws java.io.IOException{
return FileSystemUtils.freeSpaceKb(p0,p1);
}
public static long freeSpaceKb() throws java.io.IOException{
return FileSystemUtils.freeSpaceKb();
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(long p0,boolean p1){
return FileFilterUtils.ageFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(long p0){
return FileFilterUtils.ageFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter sizeFileFilter(long p0,boolean p1){
return FileFilterUtils.sizeFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter sizeFileFilter(long p0){
return FileFilterUtils.sizeFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter sizeRangeFileFilter(long p0,long p1){
return FileFilterUtils.sizeRangeFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(java.lang.String p0,long p1){
return FileFilterUtils.magicNumberFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(byte[] p0,long p1){
return FileFilterUtils.magicNumberFileFilter(p0,p1);
}
public static long sizeOfDirectory(java.io.File p0){
return FileUtils.sizeOfDirectory(p0);
}
public static boolean isFileNewer(java.io.File p0,long p1){
return FileUtils.isFileNewer(p0,p1);
}
public static long copyFile(java.io.File p0,java.io.OutputStream p1) throws java.io.IOException{
return FileUtils.copyFile(p0,p1);
}
public static long checksumCRC32(java.io.File p0) throws java.io.IOException{
return FileUtils.checksumCRC32(p0);
}
public static boolean isFileOlder(java.io.File p0,long p1){
return FileUtils.isFileOlder(p0,p1);
}
public static long sizeOf(java.io.File p0){
return FileUtils.sizeOf(p0);
}
public static java.lang.String byteCountToDisplaySize(long p0){
return FileUtils.byteCountToDisplaySize(p0);
}
public static long getLongValue(java.util.Map p0,java.lang.Object p1,long p2){
return MapUtils.getLongValue(p0,p1,p2);
}
public static long getLongValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getLongValue(p0,p1);
}
public static org.apache.commons.collections.Buffer blockingBuffer(org.apache.commons.collections.Buffer p0,long p1){
return BufferUtils.blockingBuffer(p0,p1);
}
public static org.apache.commons.collections.Buffer boundedBuffer(org.apache.commons.collections.Buffer p0,int p1,long p2){
return BufferUtils.boundedBuffer(p0,p1,p2);
}
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,long p1){
return BlockingBuffer.decorate(p0,p1);
}
public static org.apache.commons.collections.buffer.BoundedBuffer decorate(org.apache.commons.collections.Buffer p0,int p1,long p2){
return BoundedBuffer.decorate(p0,p1,p2);
}
public static <K> long getLongValue(java.util.Map<? super K, ?> p0,K p1,long p2){
return MapUtils.getLongValue(p0,p1,p2);
}
public static <K> long getLongValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getLongValue(p0,p1);
}
public static <E> org.apache.commons.collections4.iterators.SkippingIterator<E> skippingIterator(java.util.Iterator<E> p0,long p1){
return IteratorUtils.skippingIterator(p0,p1);
}
public static <E> org.apache.commons.collections4.iterators.BoundedIterator<E> boundedIterator(java.util.Iterator<? extends E> p0,long p1){
return IteratorUtils.boundedIterator(p0,p1);
}
public static <E> org.apache.commons.collections4.iterators.BoundedIterator<E> boundedIterator(java.util.Iterator<? extends E> p0,long p1,long p2){
return IteratorUtils.boundedIterator(p0,p1,p2);
}
public static <E> long countMatches(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IterableUtils.countMatches(p0,p1);
}
public static <E> java.lang.Iterable<E> boundedIterable(java.lang.Iterable<E> p0,long p1){
return IterableUtils.boundedIterable(p0,p1);
}
public static <E> java.lang.Iterable<E> skippingIterable(java.lang.Iterable<E> p0,long p1){
return IterableUtils.skippingIterable(p0,p1);
}
public static long[] add(long[] p0,long p1){
return ArrayUtils.add(p0,p1);
}
public static long[] add(long[] p0,int p1,long p2){
return ArrayUtils.add(p0,p1,p2);
}
public static int indexOf(long[] p0,long p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int lastIndexOf(long[] p0,long p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static long[] removeElement(long[] p0,long p1){
return ArrayUtils.removeElement(p0,p1);
}
public static long[] toPrimitive(java.lang.Long[] p0,long p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static long intArrayToLong(int[] p0,int p1,long p2,int p3,int p4){
return Conversion.intArrayToLong(p0,p1,p2,p3,p4);
}
public static long byteArrayToLong(byte[] p0,int p1,long p2,int p3,int p4){
return Conversion.byteArrayToLong(p0,p1,p2,p3,p4);
}
public static long shortArrayToLong(short[] p0,int p1,long p2,int p3,int p4){
return Conversion.shortArrayToLong(p0,p1,p2,p3,p4);
}
public static int[] longToIntArray(long p0,int p1,int[] p2,int p3,int p4){
return Conversion.longToIntArray(p0,p1,p2,p3,p4);
}
public static short[] longToShortArray(long p0,int p1,short[] p2,int p3,int p4){
return Conversion.longToShortArray(p0,p1,p2,p3,p4);
}
public static long hexToLong(java.lang.String p0,int p1,long p2,int p3,int p4){
return Conversion.hexToLong(p0,p1,p2,p3,p4);
}
public static byte[] longToByteArray(long p0,int p1,byte[] p2,int p3,int p4){
return Conversion.longToByteArray(p0,p1,p2,p3,p4);
}
public static java.lang.String longToHex(long p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.longToHex(p0,p1,p2,p3,p4);
}
public static long binaryToLong(boolean[] p0,int p1,long p2,int p3,int p4){
return Conversion.binaryToLong(p0,p1,p2,p3,p4);
}
public static boolean[] longToBinary(long p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.longToBinary(p0,p1,p2,p3,p4);
}
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> processBitVector(java.lang.Class<E> p0,long p1){
return EnumUtils.processBitVector(p0,p1);
}
public static <E extends java.lang.Enum<E> > long generateBitVector(java.lang.Class<E> p0,java.lang.Iterable<? extends E> p1){
return EnumUtils.generateBitVector(p0,p1);
}
public static <E extends java.lang.Enum<E> > long generateBitVector(java.lang.Class<E> p0,E... p1){
return EnumUtils.generateBitVector(p0,p1);
}
public static long min(long p0,long p1,long p2){
return NumberUtils.min(p0,p1,p2);
}
public static long max(long p0,long p1,long p2){
return NumberUtils.max(p0,p1,p2);
}
public static long toLong(java.lang.String p0){
return NumberUtils.toLong(p0);
}
public static long toLong(java.lang.String p0,long p1){
return NumberUtils.toLong(p0,p1);
}
public static long CONST(long p0){
return ObjectUtils.CONST(p0);
}
public static long nextLong(long p0,long p1){
return RandomUtils.nextLong(p0,p1);
}
public static java.lang.String format(long p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(long p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3){
return DateFormatUtils.format(p0,p1,p2,p3);
}
public static java.lang.String format(long p0,java.lang.String p1){
return DateFormatUtils.format(p0,p1);
}
public static java.lang.String format(long p0,java.lang.String p1,java.util.TimeZone p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String formatUTC(long p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.formatUTC(p0,p1,p2);
}
public static java.lang.String formatUTC(long p0,java.lang.String p1){
return DateFormatUtils.formatUTC(p0,p1);
}
public static long getFragmentInMinutes(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInMinutes(p0,p1);
}
public static long getFragmentInMinutes(java.util.Date p0,int p1){
return DateUtils.getFragmentInMinutes(p0,p1);
}
public static long getFragmentInSeconds(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInSeconds(p0,p1);
}
public static long getFragmentInSeconds(java.util.Date p0,int p1){
return DateUtils.getFragmentInSeconds(p0,p1);
}
public static long getFragmentInDays(java.util.Date p0,int p1){
return DateUtils.getFragmentInDays(p0,p1);
}
public static long getFragmentInDays(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInDays(p0,p1);
}
public static long getFragmentInMilliseconds(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInMilliseconds(p0,p1);
}
public static long getFragmentInMilliseconds(java.util.Date p0,int p1){
return DateUtils.getFragmentInMilliseconds(p0,p1);
}
public static long getFragmentInHours(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInHours(p0,p1);
}
public static long getFragmentInHours(java.util.Date p0,int p1){
return DateUtils.getFragmentInHours(p0,p1);
}
public static java.lang.String formatPeriodISO(long p0,long p1){
return DurationFormatUtils.formatPeriodISO(p0,p1);
}
public static java.lang.String formatDuration(long p0,java.lang.String p1,boolean p2){
return DurationFormatUtils.formatDuration(p0,p1,p2);
}
public static java.lang.String formatDuration(long p0,java.lang.String p1){
return DurationFormatUtils.formatDuration(p0,p1);
}
public static java.lang.String formatPeriod(long p0,long p1,java.lang.String p2,boolean p3,java.util.TimeZone p4){
return DurationFormatUtils.formatPeriod(p0,p1,p2,p3,p4);
}
public static java.lang.String formatPeriod(long p0,long p1,java.lang.String p2){
return DurationFormatUtils.formatPeriod(p0,p1,p2);
}
public static java.lang.String formatDurationWords(long p0,boolean p1,boolean p2){
return DurationFormatUtils.formatDurationWords(p0,p1,p2);
}
public static java.lang.String formatDurationISO(long p0){
return DurationFormatUtils.formatDurationISO(p0);
}
public static java.lang.String formatDurationHMS(long p0){
return DurationFormatUtils.formatDurationHMS(p0);
}
public static void exclusiveBetween(long p0,long p1,long p2,java.lang.String p3){
 Validate.exclusiveBetween(p0,p1,p2,p3);
}
public static void exclusiveBetween(long p0,long p1,long p2){
 Validate.exclusiveBetween(p0,p1,p2);
}
public static void isTrue(boolean p0,java.lang.String p1,long p2){
 Validate.isTrue(p0,p1,p2);
}
public static void inclusiveBetween(long p0,long p1,long p2){
 Validate.inclusiveBetween(p0,p1,p2);
}
public static void inclusiveBetween(long p0,long p1,long p2,java.lang.String p3){
 Validate.inclusiveBetween(p0,p1,p2,p3);
}
public static org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunction exponentialDecay(double p0,double p1,long p2){
return NeighbourhoodSizeFunctionFactory.exponentialDecay(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunction quasiSigmoidDecay(double p0,double p1,long p2){
return NeighbourhoodSizeFunctionFactory.quasiSigmoidDecay(p0,p1,p2);
}
public static double rootLogLikelihoodRatio(long p0,long p1,long p2,long p3) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException{
return TestUtils.rootLogLikelihoodRatio(p0,p1,p2,p3);
}
public static long convertToLong(int[] p0){
return RandomGeneratorFactory.convertToLong(p0);
}
public static long copySign(long p0,long p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return MathUtils.copySign(p0,p1);
}
public static long pow(long p0,long p1) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.pow(p0,p1);
}
public static int pow(int p0,long p1) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.pow(p0,p1);
}
public static java.math.BigInteger pow(java.math.BigInteger p0,long p1) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.pow(p0,p1);
}
public static long subAndCheck(long p0,long p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.subAndCheck(p0,p1);
}
public static long addAndCheck(long p0,long p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.addAndCheck(p0,p1);
}
public static long mulAndCheck(long p0,long p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.mulAndCheck(p0,p1);
}
public static long binomialCoefficient(int p0,int p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.binomialCoefficient(p0,p1);
}
public static long stirlingS2(int p0,int p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.stirlingS2(p0,p1);
}
public static long lcm(long p0,long p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.lcm(p0,p1);
}
public static long abs(long p0){
return FastMath.abs(p0);
}
public static double pow(double p0,long p1){
return FastMath.pow(p0,p1);
}
public static long min(long p0,long p1){
return FastMath.min(p0,p1);
}
public static long max(long p0,long p1){
return FastMath.max(p0,p1);
}
public static long addExact(long p0,long p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.addExact(p0,p1);
}
public static long decrementExact(long p0) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.decrementExact(p0);
}
public static long incrementExact(long p0) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.incrementExact(p0);
}
public static long multiplyExact(long p0,long p1){
return FastMath.multiplyExact(p0,p1);
}
public static long subtractExact(long p0,long p1){
return FastMath.subtractExact(p0,p1);
}
public static long floorDiv(long p0,long p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.floorDiv(p0,p1);
}
public static long floorMod(long p0,long p1){
return FastMath.floorMod(p0,p1);
}
public static long round(double p0){
return FastMath.round(p0);
}
public static int toIntExact(long p0) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.toIntExact(p0);
}
public static long getDefaultLong(){
return ConvertUtils.getDefaultLong();
}
public static void setDefaultLong(long p0){
 ConvertUtils.setDefaultLong(p0);
}
public static org.apache.commons.collections.primitives.LongListIterator singletonLongListIterator(long p0){
return LongCollections.singletonLongListIterator(p0);
}
public static org.apache.commons.collections.primitives.LongList singletonLongList(long p0){
return LongCollections.singletonLongList(p0);
}
public static org.apache.commons.collections.primitives.LongIterator singletonLongIterator(long p0){
return LongCollections.singletonLongIterator(p0);
}
public static long index(int p0,int p1){
return BigArrays.index(p0,p1);
}
public static long start(int p0){
return BigArrays.start(p0);
}
public static void mergeSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3){
 BigArrays.mergeSort(p0,p1,p2,p3);
}
public static int segment(long p0){
return BigArrays.segment(p0);
}
public static int displacement(long p0){
return BigArrays.displacement(p0);
}
public static void ensureFromTo(long p0,long p1,long p2){
 BigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3){
 BigArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureLength(long p0){
 BigArrays.ensureLength(p0);
}
public static void ensureOffsetLength(long p0,long p1,long p2){
 BigArrays.ensureOffsetLength(p0,p1,p2);
}
public static long nextPowerOfTwo(long p0){
return HashCommon.nextPowerOfTwo(p0);
}
public static long murmurHash3(long p0){
return HashCommon.murmurHash3(p0);
}
public static long invMix(long p0){
return HashCommon.invMix(p0);
}
public static long mix(long p0){
return HashCommon.mix(p0);
}
public static long bigArraySize(long p0,float p1){
return HashCommon.bigArraySize(p0,p1);
}
public static int long2int(long p0){
return HashCommon.long2int(p0);
}
public static long maxFill(long p0,float p1){
return HashCommon.maxFill(p0,p1);
}
public static int safeLongToInt(long p0){
return SafeMath.safeLongToInt(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigArrayBigList wrap(boolean[][] p0,long p1){
return BooleanBigArrayBigList.wrap(p0,p1);
}
public static long length(boolean[][] p0){
return BooleanBigArrays.length(p0);
}
public static boolean[][] trim(boolean[][] p0,long p1){
return BooleanBigArrays.trim(p0,p1);
}
public static void copy(boolean[][] p0,long p1,boolean[][] p2,long p3,long p4){
 BooleanBigArrays.copy(p0,p1,p2,p3,p4);
}
public static boolean[][] copy(boolean[][] p0,long p1,long p2){
return BooleanBigArrays.copy(p0,p1,p2);
}
public static void set(boolean[][] p0,long p1,boolean p2){
 BooleanBigArrays.set(p0,p1,p2);
}
public static void fill(boolean[][] p0,long p1,long p2,boolean p3){
 BooleanBigArrays.fill(p0,p1,p2,p3);
}
public static boolean[][] ensureCapacity(boolean[][] p0,long p1,long p2){
return BooleanBigArrays.ensureCapacity(p0,p1,p2);
}
public static boolean[][] ensureCapacity(boolean[][] p0,long p1){
return BooleanBigArrays.ensureCapacity(p0,p1);
}
public static boolean[][] setLength(boolean[][] p0,long p1){
return BooleanBigArrays.setLength(p0,p1);
}
public static boolean[][] grow(boolean[][] p0,long p1,long p2){
return BooleanBigArrays.grow(p0,p1,p2);
}
public static boolean[][] grow(boolean[][] p0,long p1){
return BooleanBigArrays.grow(p0,p1);
}
public static boolean[][] shuffle(boolean[][] p0,long p1,long p2,java.util.Random p3){
return BooleanBigArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(boolean[][] p0,long p1,long p2){
 BooleanBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(boolean[][] p0,long p1,long p2){
 BooleanBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(boolean[][] p0,long p1,long p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(boolean[][] p0,long p1,long p2){
 BooleanBigArrays.quickSort(p0,p1,p2);
}
public static boolean[][] newBigArray(long p0){
return BooleanBigArrays.newBigArray(p0);
}
public static void copyToBig(boolean[] p0,int p1,boolean[][] p2,long p3,long p4){
 BooleanBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(boolean[][] p0,long p1,boolean[] p2,int p3,int p4){
 BooleanBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void ensureOffsetLength(boolean[][] p0,long p1,long p2){
 BooleanBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static long unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1){
return BooleanIterators.unwrap(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction singleton(byte p0,long p1){
return Byte2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap singleton(byte p0,long p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList wrap(byte[][] p0,long p1){
return ByteBigArrayBigList.wrap(p0,p1);
}
public static void add(byte[][] p0,long p1,byte p2){
 ByteBigArrays.add(p0,p1,p2);
}
public static long length(byte[][] p0){
return ByteBigArrays.length(p0);
}
public static byte[][] trim(byte[][] p0,long p1){
return ByteBigArrays.trim(p0,p1);
}
public static byte[][] copy(byte[][] p0,long p1,long p2){
return ByteBigArrays.copy(p0,p1,p2);
}
public static void copy(byte[][] p0,long p1,byte[][] p2,long p3,long p4){
 ByteBigArrays.copy(p0,p1,p2,p3,p4);
}
public static void set(byte[][] p0,long p1,byte p2){
 ByteBigArrays.set(p0,p1,p2);
}
public static void fill(byte[][] p0,long p1,long p2,byte p3){
 ByteBigArrays.fill(p0,p1,p2,p3);
}
public static byte[][] ensureCapacity(byte[][] p0,long p1,long p2){
return ByteBigArrays.ensureCapacity(p0,p1,p2);
}
public static byte[][] ensureCapacity(byte[][] p0,long p1){
return ByteBigArrays.ensureCapacity(p0,p1);
}
public static byte[][] setLength(byte[][] p0,long p1){
return ByteBigArrays.setLength(p0,p1);
}
public static byte[][] grow(byte[][] p0,long p1,long p2){
return ByteBigArrays.grow(p0,p1,p2);
}
public static byte[][] grow(byte[][] p0,long p1){
return ByteBigArrays.grow(p0,p1);
}
public static long binarySearch(byte[][] p0,long p1,long p2,byte p3){
return ByteBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(byte[][] p0,byte p1){
return ByteBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(byte[][] p0,long p1,long p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(byte[][] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return ByteBigArrays.binarySearch(p0,p1,p2);
}
public static byte[][] shuffle(byte[][] p0,long p1,long p2,java.util.Random p3){
return ByteBigArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(byte[][] p0,long p1,long p2){
 ByteBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(byte[][] p0,long p1,long p2){
 ByteBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(byte[][] p0,long p1,long p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(byte[][] p0,long p1,long p2){
 ByteBigArrays.quickSort(p0,p1,p2);
}
public static void copyToBig(byte[] p0,int p1,byte[][] p2,long p3,long p4){
 ByteBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(byte[][] p0,long p1,byte[] p2,int p3,int p4){
 ByteBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void mul(byte[][] p0,long p1,byte p2){
 ByteBigArrays.mul(p0,p1,p2);
}
public static void decr(byte[][] p0,long p1){
 ByteBigArrays.decr(p0,p1);
}
public static void incr(byte[][] p0,long p1){
 ByteBigArrays.incr(p0,p1);
}
public static void radixSort(byte[][] p0,byte[][] p1,long p2,long p3){
 ByteBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(byte[][] p0,long p1,long p2){
 ByteBigArrays.radixSort(p0,p1,p2);
}
public static void ensureOffsetLength(byte[][] p0,long p1,long p2){
 ByteBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static long unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
return ByteIterators.unwrap(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongFunction singleton(char p0,long p1){
return Char2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(char p0,long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.CharBigArrayBigList wrap(char[][] p0,long p1){
return CharBigArrayBigList.wrap(p0,p1);
}
public static void add(char[][] p0,long p1,char p2){
 CharBigArrays.add(p0,p1,p2);
}
public static long length(char[][] p0){
return CharBigArrays.length(p0);
}
public static char[][] trim(char[][] p0,long p1){
return CharBigArrays.trim(p0,p1);
}
public static char[][] copy(char[][] p0,long p1,long p2){
return CharBigArrays.copy(p0,p1,p2);
}
public static void copy(char[][] p0,long p1,char[][] p2,long p3,long p4){
 CharBigArrays.copy(p0,p1,p2,p3,p4);
}
public static void set(char[][] p0,long p1,char p2){
 CharBigArrays.set(p0,p1,p2);
}
public static void fill(char[][] p0,long p1,long p2,char p3){
 CharBigArrays.fill(p0,p1,p2,p3);
}
public static char[][] ensureCapacity(char[][] p0,long p1,long p2){
return CharBigArrays.ensureCapacity(p0,p1,p2);
}
public static char[][] ensureCapacity(char[][] p0,long p1){
return CharBigArrays.ensureCapacity(p0,p1);
}
public static char[][] setLength(char[][] p0,long p1){
return CharBigArrays.setLength(p0,p1);
}
public static char[][] grow(char[][] p0,long p1,long p2){
return CharBigArrays.grow(p0,p1,p2);
}
public static char[][] grow(char[][] p0,long p1){
return CharBigArrays.grow(p0,p1);
}
public static long binarySearch(char[][] p0,long p1,long p2,char p3){
return CharBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(char[][] p0,char p1){
return CharBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(char[][] p0,long p1,long p2,char p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(char[][] p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return CharBigArrays.binarySearch(p0,p1,p2);
}
public static char[][] shuffle(char[][] p0,long p1,long p2,java.util.Random p3){
return CharBigArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(char[][] p0,long p1,long p2){
 CharBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(char[][] p0,long p1,long p2){
 CharBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(char[][] p0,long p1,long p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(char[][] p0,long p1,long p2){
 CharBigArrays.quickSort(p0,p1,p2);
}
public static void copyToBig(char[] p0,int p1,char[][] p2,long p3,long p4){
 CharBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(char[][] p0,long p1,char[] p2,int p3,int p4){
 CharBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void mul(char[][] p0,long p1,char p2){
 CharBigArrays.mul(p0,p1,p2);
}
public static void decr(char[][] p0,long p1){
 CharBigArrays.decr(p0,p1);
}
public static void incr(char[][] p0,long p1){
 CharBigArrays.incr(p0,p1);
}
public static void radixSort(char[][] p0,char[][] p1,long p2,long p3){
 CharBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(char[][] p0,long p1,long p2){
 CharBigArrays.radixSort(p0,p1,p2);
}
public static void ensureOffsetLength(char[][] p0,long p1,long p2){
 CharBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static long unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
return CharIterators.unwrap(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction singleton(double p0,long p1){
return Double2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap singleton(double p0,long p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigArrayBigList wrap(double[][] p0,long p1){
return DoubleBigArrayBigList.wrap(p0,p1);
}
public static void add(double[][] p0,long p1,double p2){
 DoubleBigArrays.add(p0,p1,p2);
}
public static long length(double[][] p0){
return DoubleBigArrays.length(p0);
}
public static double[][] trim(double[][] p0,long p1){
return DoubleBigArrays.trim(p0,p1);
}
public static void copy(double[][] p0,long p1,double[][] p2,long p3,long p4){
 DoubleBigArrays.copy(p0,p1,p2,p3,p4);
}
public static double[][] copy(double[][] p0,long p1,long p2){
return DoubleBigArrays.copy(p0,p1,p2);
}
public static void set(double[][] p0,long p1,double p2){
 DoubleBigArrays.set(p0,p1,p2);
}
public static void fill(double[][] p0,long p1,long p2,double p3){
 DoubleBigArrays.fill(p0,p1,p2,p3);
}
public static double[][] ensureCapacity(double[][] p0,long p1,long p2){
return DoubleBigArrays.ensureCapacity(p0,p1,p2);
}
public static double[][] ensureCapacity(double[][] p0,long p1){
return DoubleBigArrays.ensureCapacity(p0,p1);
}
public static double[][] setLength(double[][] p0,long p1){
return DoubleBigArrays.setLength(p0,p1);
}
public static double[][] grow(double[][] p0,long p1,long p2){
return DoubleBigArrays.grow(p0,p1,p2);
}
public static double[][] grow(double[][] p0,long p1){
return DoubleBigArrays.grow(p0,p1);
}
public static long binarySearch(double[][] p0,long p1,long p2,double p3){
return DoubleBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(double[][] p0,double p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return DoubleBigArrays.binarySearch(p0,p1,p2);
}
public static long binarySearch(double[][] p0,long p1,long p2,double p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(double[][] p0,double p1){
return DoubleBigArrays.binarySearch(p0,p1);
}
public static double[][] shuffle(double[][] p0,long p1,long p2,java.util.Random p3){
return DoubleBigArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(double[][] p0,long p1,long p2){
 DoubleBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(double[][] p0,long p1,long p2){
 DoubleBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(double[][] p0,long p1,long p2){
 DoubleBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(double[][] p0,long p1,long p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleBigArrays.quickSort(p0,p1,p2,p3);
}
public static void copyToBig(double[] p0,int p1,double[][] p2,long p3,long p4){
 DoubleBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(double[][] p0,long p1,double[] p2,int p3,int p4){
 DoubleBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void mul(double[][] p0,long p1,double p2){
 DoubleBigArrays.mul(p0,p1,p2);
}
public static void decr(double[][] p0,long p1){
 DoubleBigArrays.decr(p0,p1);
}
public static void incr(double[][] p0,long p1){
 DoubleBigArrays.incr(p0,p1);
}
public static void radixSort(double[][] p0,long p1,long p2){
 DoubleBigArrays.radixSort(p0,p1,p2);
}
public static void radixSort(double[][] p0,double[][] p1,long p2,long p3){
 DoubleBigArrays.radixSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(double[][] p0,long p1,long p2){
 DoubleBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static long unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
return DoubleIterators.unwrap(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongFunction singleton(float p0,long p1){
return Float2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(float p0,long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.FloatBigArrayBigList wrap(float[][] p0,long p1){
return FloatBigArrayBigList.wrap(p0,p1);
}
public static void add(float[][] p0,long p1,float p2){
 FloatBigArrays.add(p0,p1,p2);
}
public static long length(float[][] p0){
return FloatBigArrays.length(p0);
}
public static float[][] trim(float[][] p0,long p1){
return FloatBigArrays.trim(p0,p1);
}
public static void copy(float[][] p0,long p1,float[][] p2,long p3,long p4){
 FloatBigArrays.copy(p0,p1,p2,p3,p4);
}
public static float[][] copy(float[][] p0,long p1,long p2){
return FloatBigArrays.copy(p0,p1,p2);
}
public static void set(float[][] p0,long p1,float p2){
 FloatBigArrays.set(p0,p1,p2);
}
public static void fill(float[][] p0,long p1,long p2,float p3){
 FloatBigArrays.fill(p0,p1,p2,p3);
}
public static float[][] ensureCapacity(float[][] p0,long p1,long p2){
return FloatBigArrays.ensureCapacity(p0,p1,p2);
}
public static float[][] ensureCapacity(float[][] p0,long p1){
return FloatBigArrays.ensureCapacity(p0,p1);
}
public static float[][] setLength(float[][] p0,long p1){
return FloatBigArrays.setLength(p0,p1);
}
public static float[][] grow(float[][] p0,long p1){
return FloatBigArrays.grow(p0,p1);
}
public static float[][] grow(float[][] p0,long p1,long p2){
return FloatBigArrays.grow(p0,p1,p2);
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
public static float[][] shuffle(float[][] p0,long p1,long p2,java.util.Random p3){
return FloatBigArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(float[][] p0,long p1,long p2){
 FloatBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(float[][] p0,long p1,long p2){
 FloatBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(float[][] p0,long p1,long p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(float[][] p0,long p1,long p2){
 FloatBigArrays.quickSort(p0,p1,p2);
}
public static void copyToBig(float[] p0,int p1,float[][] p2,long p3,long p4){
 FloatBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(float[][] p0,long p1,float[] p2,int p3,int p4){
 FloatBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void mul(float[][] p0,long p1,float p2){
 FloatBigArrays.mul(p0,p1,p2);
}
public static void decr(float[][] p0,long p1){
 FloatBigArrays.decr(p0,p1);
}
public static void incr(float[][] p0,long p1){
 FloatBigArrays.incr(p0,p1);
}
public static void radixSort(float[][] p0,long p1,long p2){
 FloatBigArrays.radixSort(p0,p1,p2);
}
public static void radixSort(float[][] p0,float[][] p1,long p2,long p3){
 FloatBigArrays.radixSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(float[][] p0,long p1,long p2){
 FloatBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static long unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
return FloatIterators.unwrap(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongFunction singleton(int p0,long p1){
return Int2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(int p0,long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.IntBigArrayBigList wrap(int[][] p0,long p1){
return IntBigArrayBigList.wrap(p0,p1);
}
public static void add(int[][] p0,long p1,int p2){
 IntBigArrays.add(p0,p1,p2);
}
public static long length(int[][] p0){
return IntBigArrays.length(p0);
}
public static int[][] trim(int[][] p0,long p1){
return IntBigArrays.trim(p0,p1);
}
public static int[][] copy(int[][] p0,long p1,long p2){
return IntBigArrays.copy(p0,p1,p2);
}
public static void copy(int[][] p0,long p1,int[][] p2,long p3,long p4){
 IntBigArrays.copy(p0,p1,p2,p3,p4);
}
public static void set(int[][] p0,long p1,int p2){
 IntBigArrays.set(p0,p1,p2);
}
public static void fill(int[][] p0,long p1,long p2,int p3){
 IntBigArrays.fill(p0,p1,p2,p3);
}
public static int[][] ensureCapacity(int[][] p0,long p1,long p2){
return IntBigArrays.ensureCapacity(p0,p1,p2);
}
public static int[][] ensureCapacity(int[][] p0,long p1){
return IntBigArrays.ensureCapacity(p0,p1);
}
public static int[][] setLength(int[][] p0,long p1){
return IntBigArrays.setLength(p0,p1);
}
public static int[][] grow(int[][] p0,long p1,long p2){
return IntBigArrays.grow(p0,p1,p2);
}
public static int[][] grow(int[][] p0,long p1){
return IntBigArrays.grow(p0,p1);
}
public static long binarySearch(int[][] p0,long p1,long p2,int p3){
return IntBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(int[][] p0,int p1){
return IntBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(int[][] p0,long p1,long p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(int[][] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return IntBigArrays.binarySearch(p0,p1,p2);
}
public static int[][] shuffle(int[][] p0,long p1,long p2,java.util.Random p3){
return IntBigArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(int[][] p0,long p1,long p2){
 IntBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(int[][] p0,long p1,long p2){
 IntBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(int[][] p0,long p1,long p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(int[][] p0,long p1,long p2){
 IntBigArrays.quickSort(p0,p1,p2);
}
public static void copyToBig(int[] p0,int p1,int[][] p2,long p3,long p4){
 IntBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(int[][] p0,long p1,int[] p2,int p3,int p4){
 IntBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void mul(int[][] p0,long p1,int p2){
 IntBigArrays.mul(p0,p1,p2);
}
public static void decr(int[][] p0,long p1){
 IntBigArrays.decr(p0,p1);
}
public static void incr(int[][] p0,long p1){
 IntBigArrays.incr(p0,p1);
}
public static void radixSort(int[][] p0,int[][] p1,long p2,long p3){
 IntBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(int[][] p0,long p1,long p2){
 IntBigArrays.radixSort(p0,p1,p2);
}
public static void ensureOffsetLength(int[][] p0,long p1,long p2){
 IntBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static long unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
return IntIterators.unwrap(p0,p1);
}
public static long loadShorts(java.io.DataInput p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static long loadShorts(java.io.File p0,short[][] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static long loadShorts(java.io.File p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static long loadShorts(java.io.DataInput p0,short[][] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static long loadShorts(java.lang.CharSequence p0,short[][] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static long loadShorts(java.lang.CharSequence p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static long loadChars(java.lang.CharSequence p0,char[][] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static long loadChars(java.io.File p0,char[][] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static long loadChars(java.io.DataInput p0,char[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static long loadChars(java.io.DataInput p0,char[][] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static long loadChars(java.io.File p0,char[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static long loadChars(java.lang.CharSequence p0,char[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static void storeChars(char[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static long loadDoubles(java.io.File p0,double[][] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static long loadDoubles(java.io.DataInput p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.io.DataInput p0,double[][] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static long loadDoubles(java.io.File p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.lang.CharSequence p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.lang.CharSequence p0,double[][] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static long loadBooleans(java.lang.CharSequence p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static long loadBooleans(java.io.File p0,boolean[][] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static long loadBooleans(java.lang.CharSequence p0,boolean[][] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static long loadBooleans(java.io.DataInput p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static long loadBooleans(java.io.File p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static long loadBooleans(java.io.DataInput p0,boolean[][] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static long loadInts(java.io.File p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.lang.CharSequence p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.lang.CharSequence p0,int[][] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static long loadInts(java.io.File p0,int[][] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static long loadInts(java.io.DataInput p0,int[][] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static long loadInts(java.io.DataInput p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static long loadBytes(java.lang.CharSequence p0,byte[][] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static long loadBytes(java.io.File p0,byte[][] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static long loadBytes(java.lang.CharSequence p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static long loadBytes(java.io.InputStream p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static long loadBytes(java.io.InputStream p0,byte[][] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static long loadBytes(java.io.DataInput p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static long loadBytes(java.io.DataInput p0,byte[][] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static long loadBytes(java.io.File p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static long loadFloats(java.io.File p0,float[][] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static long loadFloats(java.lang.CharSequence p0,float[][] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static long loadFloats(java.io.DataInput p0,float[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static long loadFloats(java.lang.CharSequence p0,float[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static long loadFloats(java.io.File p0,float[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static long loadFloats(java.io.DataInput p0,float[][] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.OutputStream p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static long loadLongs(java.io.DataInput p0,long[][] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static long loadLongs(java.io.File p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static long loadLongs(java.io.DataInput p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static long loadLongs(java.lang.CharSequence p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static long loadLongs(java.io.File p0,long[][] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static long loadLongs(java.lang.CharSequence p0,long[][] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static long loadShorts(java.io.BufferedReader p0,short[][] p1) throws java.io.IOException{
return TextIO.loadShorts(p0,p1);
}
public static long loadShorts(java.io.BufferedReader p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeShorts(p0,p1,p2,p3);
}
public static long loadDoubles(java.io.BufferedReader p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadDoubles(p0,p1,p2,p3);
}
public static long loadDoubles(java.io.BufferedReader p0,double[][] p1) throws java.io.IOException{
return TextIO.loadDoubles(p0,p1);
}
public static long loadBooleans(java.io.BufferedReader p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadBooleans(p0,p1,p2,p3);
}
public static long loadBooleans(java.io.BufferedReader p0,boolean[][] p1) throws java.io.IOException{
return TextIO.loadBooleans(p0,p1);
}
public static long loadInts(java.io.BufferedReader p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.io.BufferedReader p0,int[][] p1) throws java.io.IOException{
return TextIO.loadInts(p0,p1);
}
public static long loadBytes(java.io.BufferedReader p0,byte[][] p1) throws java.io.IOException{
return TextIO.loadBytes(p0,p1);
}
public static long loadBytes(java.io.BufferedReader p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadBytes(p0,p1,p2,p3);
}
public static long loadFloats(java.io.BufferedReader p0,float[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadFloats(p0,p1,p2,p3);
}
public static long loadFloats(java.io.BufferedReader p0,float[][] p1) throws java.io.IOException{
return TextIO.loadFloats(p0,p1);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeFloats(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeBytes(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeLongs(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeInts(p0,p1,p2,p3);
}
public static long loadLongs(java.io.BufferedReader p0,long[][] p1) throws java.io.IOException{
return TextIO.loadLongs(p0,p1);
}
public static long loadLongs(java.io.BufferedReader p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return TextIO.loadLongs(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeBooleans(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction singleton(long p0,boolean p1){
return Long2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(long p0,boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction singleton(long p0,byte p1){
return Long2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap singleton(long p0,byte p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2CharFunction singleton(long p0,char p1){
return Long2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(long p0,char p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction singleton(long p0,double p1){
return Long2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap singleton(long p0,double p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction singleton(long p0,float p1){
return Long2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap singleton(long p0,float p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2IntFunction singleton(long p0,int p1){
return Long2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(long p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2LongFunction singleton(long p0,long p1){
return Long2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> singleton(long p0,V p1){
return Long2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction singleton(long p0,short p1){
return Long2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap singleton(long p0,short p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ShortSortedMaps.singleton(p0,p1,p2);
}
public static void fill(long[] p0,int p1,int p2,long p3){
 LongArrays.fill(p0,p1,p2,p3);
}
public static void fill(long[] p0,long p1){
 LongArrays.fill(p0,p1);
}
public static int binarySearch(long[] p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return LongArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(long[] p0,int p1,int p2,long p3){
return LongArrays.binarySearch(p0,p1,p2,p3);
}
public static int binarySearch(long[] p0,long p1){
return LongArrays.binarySearch(p0,p1);
}
public static int binarySearch(long[] p0,int p1,int p2,long p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.longs.LongBigArrayBigList wrap(long[][] p0,long p1){
return LongBigArrayBigList.wrap(p0,p1);
}
public static void add(long[][] p0,long p1,long p2){
 LongBigArrays.add(p0,p1,p2);
}
public static long length(long[][] p0){
return LongBigArrays.length(p0);
}
public static long[][] trim(long[][] p0,long p1){
return LongBigArrays.trim(p0,p1);
}
public static long[][] copy(long[][] p0,long p1,long p2){
return LongBigArrays.copy(p0,p1,p2);
}
public static void copy(long[][] p0,long p1,long[][] p2,long p3,long p4){
 LongBigArrays.copy(p0,p1,p2,p3,p4);
}
public static void set(long[][] p0,long p1,long p2){
 LongBigArrays.set(p0,p1,p2);
}
public static void fill(long[][] p0,long p1){
 LongBigArrays.fill(p0,p1);
}
public static void fill(long[][] p0,long p1,long p2,long p3){
 LongBigArrays.fill(p0,p1,p2,p3);
}
public static long[][] ensureCapacity(long[][] p0,long p1,long p2){
return LongBigArrays.ensureCapacity(p0,p1,p2);
}
public static long[][] ensureCapacity(long[][] p0,long p1){
return LongBigArrays.ensureCapacity(p0,p1);
}
public static long[][] setLength(long[][] p0,long p1){
return LongBigArrays.setLength(p0,p1);
}
public static long[][] grow(long[][] p0,long p1,long p2){
return LongBigArrays.grow(p0,p1,p2);
}
public static long[][] grow(long[][] p0,long p1){
return LongBigArrays.grow(p0,p1);
}
public static long binarySearch(long[][] p0,long p1,long p2,long p3){
return LongBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(long[][] p0,long p1){
return LongBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(long[][] p0,long p1,long p2,long p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(long[][] p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return LongBigArrays.binarySearch(p0,p1,p2);
}
public static long[][] shuffle(long[][] p0,long p1,long p2,java.util.Random p3){
return LongBigArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(long[][] p0,long p1,long p2){
 LongBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(long[][] p0,long p1,long p2){
 LongBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(long[][] p0,long p1,long p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(long[][] p0,long p1,long p2){
 LongBigArrays.quickSort(p0,p1,p2);
}
public static void copyToBig(long[] p0,int p1,long[][] p2,long p3,long p4){
 LongBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(long[][] p0,long p1,long[] p2,int p3,int p4){
 LongBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void mul(long[][] p0,long p1,long p2){
 LongBigArrays.mul(p0,p1,p2);
}
public static void decr(long[][] p0,long p1){
 LongBigArrays.decr(p0,p1);
}
public static void incr(long[][] p0,long p1){
 LongBigArrays.incr(p0,p1);
}
public static void radixSort(long[][] p0,long[][] p1,long p2,long p3){
 LongBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(long[][] p0,long p1,long p2){
 LongBigArrays.radixSort(p0,p1,p2);
}
public static void ensureOffsetLength(long[][] p0,long p1,long p2){
 LongBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.LongBigListIterator singleton(long p0){
return LongBigListIterators.singleton(p0);
}
public static long unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
return LongIterators.unwrap(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongBidirectionalIterator fromTo(long p0,long p1){
return LongIterators.fromTo(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet singleton(long p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
return LongSortedSets.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> singleton(K p0,long p1){
return Object2LongFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> singleton(K p0,long p1,java.util.Comparator<? super K> p2){
return Object2LongSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList<K> wrap(K[][] p0,long p1){
return ObjectBigArrayBigList.wrap(p0,p1);
}
public static <K> long length(K[][] p0){
return ObjectBigArrays.length(p0);
}
public static <K> K[][] trim(K[][] p0,long p1){
return ObjectBigArrays.trim(p0,p1);
}
public static <K> K[][] copy(K[][] p0,long p1,long p2){
return ObjectBigArrays.copy(p0,p1,p2);
}
public static <K> void copy(K[][] p0,long p1,K[][] p2,long p3,long p4){
 ObjectBigArrays.copy(p0,p1,p2,p3,p4);
}
public static <K> void set(K[][] p0,long p1,K p2){
 ObjectBigArrays.set(p0,p1,p2);
}
public static <K> void fill(K[][] p0,long p1,long p2,K p3){
 ObjectBigArrays.fill(p0,p1,p2,p3);
}
public static <K> K[][] ensureCapacity(K[][] p0,long p1){
return ObjectBigArrays.ensureCapacity(p0,p1);
}
public static <K> K[][] ensureCapacity(K[][] p0,long p1,long p2){
return ObjectBigArrays.ensureCapacity(p0,p1,p2);
}
public static <K> K[][] setLength(K[][] p0,long p1){
return ObjectBigArrays.setLength(p0,p1);
}
public static <K> K[][] grow(K[][] p0,long p1){
return ObjectBigArrays.grow(p0,p1);
}
public static <K> K[][] grow(K[][] p0,long p1,long p2){
return ObjectBigArrays.grow(p0,p1,p2);
}
public static <K> long binarySearch(K[][] p0,long p1,long p2,K p3,java.util.Comparator<K> p4){
return ObjectBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static <K> long binarySearch(K[][] p0,long p1,long p2,K p3){
return ObjectBigArrays.binarySearch(p0,p1,p2,p3);
}
public static <K> long binarySearch(K[][] p0,java.lang.Object p1){
return ObjectBigArrays.binarySearch(p0,p1);
}
public static <K> long binarySearch(K[][] p0,K p1,java.util.Comparator<K> p2){
return ObjectBigArrays.binarySearch(p0,p1,p2);
}
public static <K> K[][] shuffle(K[][] p0,long p1,long p2,java.util.Random p3){
return ObjectBigArrays.shuffle(p0,p1,p2,p3);
}
public static <K> void swap(K[][] p0,long p1,long p2){
 ObjectBigArrays.swap(p0,p1,p2);
}
public static <K> void ensureFromTo(K[][] p0,long p1,long p2){
 ObjectBigArrays.ensureFromTo(p0,p1,p2);
}
public static <K> void quickSort(K[][] p0,long p1,long p2){
 ObjectBigArrays.quickSort(p0,p1,p2);
}
public static <K> void quickSort(K[][] p0,long p1,long p2,java.util.Comparator<K> p3){
 ObjectBigArrays.quickSort(p0,p1,p2,p3);
}
public static <K> K[][] newBigArray(K[][] p0,long p1){
return ObjectBigArrays.newBigArray(p0,p1);
}
public static <K> void copyToBig(K[] p0,int p1,K[][] p2,long p3,long p4){
 ObjectBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static <K> void copyFromBig(K[][] p0,long p1,K[] p2,int p3,int p4){
 ObjectBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static <K> void ensureOffsetLength(K[][] p0,long p1,long p2){
 ObjectBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static <K> long unwrap(java.util.Iterator<K> p0,it.unimi.dsi.fastutil.objects.ObjectCollection<? super K> p1){
return ObjectIterators.unwrap(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction singleton(short p0,long p1){
return Short2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap singleton(short p0,long p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigArrayBigList wrap(short[][] p0,long p1){
return ShortBigArrayBigList.wrap(p0,p1);
}
public static void add(short[][] p0,long p1,short p2){
 ShortBigArrays.add(p0,p1,p2);
}
public static long length(short[][] p0){
return ShortBigArrays.length(p0);
}
public static short[][] trim(short[][] p0,long p1){
return ShortBigArrays.trim(p0,p1);
}
public static short[][] copy(short[][] p0,long p1,long p2){
return ShortBigArrays.copy(p0,p1,p2);
}
public static void copy(short[][] p0,long p1,short[][] p2,long p3,long p4){
 ShortBigArrays.copy(p0,p1,p2,p3,p4);
}
public static void set(short[][] p0,long p1,short p2){
 ShortBigArrays.set(p0,p1,p2);
}
public static void fill(short[][] p0,long p1,long p2,short p3){
 ShortBigArrays.fill(p0,p1,p2,p3);
}
public static short[][] ensureCapacity(short[][] p0,long p1,long p2){
return ShortBigArrays.ensureCapacity(p0,p1,p2);
}
public static short[][] ensureCapacity(short[][] p0,long p1){
return ShortBigArrays.ensureCapacity(p0,p1);
}
public static short[][] setLength(short[][] p0,long p1){
return ShortBigArrays.setLength(p0,p1);
}
public static short[][] grow(short[][] p0,long p1,long p2){
return ShortBigArrays.grow(p0,p1,p2);
}
public static short[][] grow(short[][] p0,long p1){
return ShortBigArrays.grow(p0,p1);
}
public static long binarySearch(short[][] p0,long p1,long p2,short p3){
return ShortBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(short[][] p0,short p1){
return ShortBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(short[][] p0,long p1,long p2,short p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(short[][] p0,short p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return ShortBigArrays.binarySearch(p0,p1,p2);
}
public static short[][] shuffle(short[][] p0,long p1,long p2,java.util.Random p3){
return ShortBigArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(short[][] p0,long p1,long p2){
 ShortBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(short[][] p0,long p1,long p2){
 ShortBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(short[][] p0,long p1,long p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(short[][] p0,long p1,long p2){
 ShortBigArrays.quickSort(p0,p1,p2);
}
public static void copyToBig(short[] p0,int p1,short[][] p2,long p3,long p4){
 ShortBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(short[][] p0,long p1,short[] p2,int p3,int p4){
 ShortBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void mul(short[][] p0,long p1,short p2){
 ShortBigArrays.mul(p0,p1,p2);
}
public static void decr(short[][] p0,long p1){
 ShortBigArrays.decr(p0,p1);
}
public static void incr(short[][] p0,long p1){
 ShortBigArrays.incr(p0,p1);
}
public static void radixSort(short[][] p0,short[][] p1,long p2,long p3){
 ShortBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(short[][] p0,long p1,long p2){
 ShortBigArrays.radixSort(p0,p1,p2);
}
public static void ensureOffsetLength(short[][] p0,long p1,long p2){
 ShortBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static long unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1){
return ShortIterators.unwrap(p0,p1);
}
public static long sizeDecompressed(byte[] p0){
return QuickLz.sizeDecompressed(p0);
}
public static long sizeCompressed(byte[] p0){
return QuickLz.sizeCompressed(p0);
}
public static com.facebook.util.TimeInterval withMillis(long p0){
return TimeInterval.withMillis(p0);
}
public static long nextLong(long p0){
return JVMRandom.nextLong(p0);
}
public static long min(long[] p0){
return NumberUtils.min(p0);
}
public static long max(long[] p0){
return NumberUtils.max(p0);
}
public static long nextLong(java.util.Random p0){
return RandomUtils.nextLong(p0);
}
public static long nextLong(){
return RandomUtils.nextLong();
}
public static long minimum(long p0,long p1,long p2){
return NumberUtils.minimum(p0,p1,p2);
}
public static long maximum(long p0,long p1,long p2){
return NumberUtils.maximum(p0,p1,p2);
}
}
