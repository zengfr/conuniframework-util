package com.zengfr.supercommons;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.base.Utf8;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.MinMaxPriorityQueue;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.Multisets;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.escape.Escapers;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.google.common.math.BigIntegerMath;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath;
import com.google.common.net.HostAndPort;
import com.google.common.net.InetAddresses;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Bytes;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedInts;
import com.google.common.primitives.UnsignedLong;
import com.google.common.primitives.UnsignedLongs;
import com.google.common.util.concurrent.Atomics;
import com.google.common.util.concurrent.Striped;
import com.google.common.util.concurrent.Uninterruptibles;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.FileCleaner;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.EndianUtils;
import org.apache.commons.io.HexDump;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.SetUtils;
import org.apache.commons.collections.BufferUtils;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.functors.ForClosure;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.buffer.BoundedBuffer;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.SetUtils;
import org.apache.commons.collections4.ClosureUtils;
import org.apache.commons.collections4.functors.ForClosure;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.CharSequenceUtils;
import org.apache.commons.lang3.CharSetUtils;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.Conversion;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.reflect.InheritanceUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.FormattableUtils;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.JavaUnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.commons.lang3.Validate;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.differentiation.SparseGradient;
import org.apache.commons.math3.analysis.differentiation.DSCompiler;
import org.apache.commons.math3.analysis.polynomials.PolynomialsUtils;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
import org.apache.commons.math3.stat.interval.IntervalUtils;
import org.apache.commons.math3.stat.inference.TestUtils;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.linear.BlockFieldMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization;
import org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer;
import org.apache.commons.math3.ode.nonstiff.AdamsNordsieckFieldTransformer;
import org.apache.commons.math3.primes.Primes;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory;
import org.apache.commons.math3.fitting.PolynomialCurveFitter;
import org.apache.commons.math3.dfp.DfpMath;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.special.Beta;
import org.apache.commons.math3.special.BesselJ;
import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.util.IntegerSequence;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.genetics.RandomKey;
import org.apache.commons.math3.genetics.BinaryChromosome;
import org.apache.commons.math3.transform.TransformUtils;
import org.apache.commons.beanutils.locale.LocaleBeanUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.text.translate.CharSequenceTranslator;
import org.apache.commons.text.translate.NumericEntityEscaper;
import org.apache.commons.text.translate.UnicodeEscaper;
import org.apache.commons.text.translate.JavaUnicodeEscaper;
import org.apache.commons.text.FormattableUtils;
import org.apache.commons.text.WordUtils;
import org.apache.commons.collections.primitives.IntCollections;
import it.unimi.dsi.fastutil.Arrays;
import it.unimi.dsi.fastutil.BigArrays;
import it.unimi.dsi.fastutil.HashCommon;
import it.unimi.dsi.fastutil.SafeMath;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanArrays;
import it.unimi.dsi.fastutil.booleans.BooleanBigArrays;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
import it.unimi.dsi.fastutil.bytes.Byte2IntFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2IntMaps;
import it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteArrays;
import it.unimi.dsi.fastutil.bytes.ByteBigArrays;
import it.unimi.dsi.fastutil.bytes.ByteHeaps;
import it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
import it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps;
import it.unimi.dsi.fastutil.chars.Char2IntFunctions;
import it.unimi.dsi.fastutil.chars.Char2IntMaps;
import it.unimi.dsi.fastutil.chars.Char2IntSortedMaps;
import it.unimi.dsi.fastutil.chars.CharArrayList;
import it.unimi.dsi.fastutil.chars.CharArrays;
import it.unimi.dsi.fastutil.chars.CharBigArrays;
import it.unimi.dsi.fastutil.chars.CharHeaps;
import it.unimi.dsi.fastutil.chars.CharIndirectHeaps;
import it.unimi.dsi.fastutil.chars.CharIterators;
import it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps;
import it.unimi.dsi.fastutil.doubles.Double2IntFunctions;
import it.unimi.dsi.fastutil.doubles.Double2IntMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.doubles.DoubleBigArrays;
import it.unimi.dsi.fastutil.doubles.DoubleHeaps;
import it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps;
import it.unimi.dsi.fastutil.floats.Float2IntFunctions;
import it.unimi.dsi.fastutil.floats.Float2IntMaps;
import it.unimi.dsi.fastutil.floats.Float2IntSortedMaps;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatBigArrays;
import it.unimi.dsi.fastutil.floats.FloatHeaps;
import it.unimi.dsi.fastutil.floats.FloatIndirectHeaps;
import it.unimi.dsi.fastutil.floats.FloatIterators;
import it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps;
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
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.ints.IntBigArrays;
import it.unimi.dsi.fastutil.ints.IntBigListIterators;
import it.unimi.dsi.fastutil.ints.IntBigLists;
import it.unimi.dsi.fastutil.ints.IntHeaps;
import it.unimi.dsi.fastutil.ints.IntIndirectHeaps;
import it.unimi.dsi.fastutil.ints.IntIterators;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.ints.IntSortedSets;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import it.unimi.dsi.fastutil.longs.Long2IntFunctions;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMaps;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongArrays;
import it.unimi.dsi.fastutil.longs.LongBigArrays;
import it.unimi.dsi.fastutil.longs.LongHeaps;
import it.unimi.dsi.fastutil.longs.LongIndirectHeaps;
import it.unimi.dsi.fastutil.longs.LongIterators;
import it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps;
import it.unimi.dsi.fastutil.objects.Object2IntFunctions;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMaps;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import it.unimi.dsi.fastutil.objects.ObjectBigArrays;
import it.unimi.dsi.fastutil.objects.ObjectHeaps;
import it.unimi.dsi.fastutil.objects.ObjectIndirectHeaps;
import it.unimi.dsi.fastutil.objects.ObjectIterators;
import it.unimi.dsi.fastutil.objects.ObjectSemiIndirectHeaps;
import it.unimi.dsi.fastutil.objects.Reference2IntFunctions;
import it.unimi.dsi.fastutil.objects.Reference2IntMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntSortedMaps;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.shorts.Short2IntFunctions;
import it.unimi.dsi.fastutil.shorts.Short2IntMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortArrays;
import it.unimi.dsi.fastutil.shorts.ShortBigArrays;
import it.unimi.dsi.fastutil.shorts.ShortHeaps;
import it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
import it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps;
import com.facebook.collections.ByteArray;
import com.facebook.collections.PackedByteArray;
import com.facebook.collections.specialized.IntegerHashSetFactory;
import com.facebook.collections.specialized.LongHashSetFactory;
import com.facebook.collectionsbase.Arrays;
import com.facebook.collectionsbase.Lists;
import com.facebook.util.TimeInterval;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.CharSetUtils;
import org.apache.commons.lang.CharUtils;
import org.apache.commons.lang.enum.EnumUtils;
import org.apache.commons.lang.enums.EnumUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.lang.math.Fraction;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang.NumberUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.FastDateFormat;
import org.apache.commons.lang.WordUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntUtil{ 
public static java.lang.String truncate(java.lang.CharSequence p0,int p1,java.lang.String p2){
return Ascii.truncate(p0,p1,p2);
}
public static int checkElementIndex(int p0,int p1,java.lang.String p2){
return Preconditions.checkElementIndex(p0,p1,p2);
}
public static int checkElementIndex(int p0,int p1){
return Preconditions.checkElementIndex(p0,p1);
}
public static int checkPositionIndex(int p0,int p1,java.lang.String p2){
return Preconditions.checkPositionIndex(p0,p1,p2);
}
public static int checkPositionIndex(int p0,int p1){
return Preconditions.checkPositionIndex(p0,p1);
}
public static void checkPositionIndexes(int p0,int p1,int p2){
 Preconditions.checkPositionIndexes(p0,p1,p2);
}
public static com.google.common.base.Splitter fixedLength(int p0){
return Splitter.fixedLength(p0);
}
public static java.lang.String repeat(java.lang.String p0,int p1){
return Strings.repeat(p0,p1);
}
public static java.lang.String padStart(java.lang.String p0,int p1,char p2){
return Strings.padStart(p0,p1,p2);
}
public static java.lang.String padEnd(java.lang.String p0,int p1,char p2){
return Strings.padEnd(p0,p1,p2);
}
public static int encodedLength(java.lang.CharSequence p0){
return Utf8.encodedLength(p0);
}
public static boolean isWellFormed(byte[] p0,int p1,int p2){
return Utf8.isWellFormed(p0,p1,p2);
}
public static <K,V> com.google.common.collect.ArrayListMultimap<K, V> create(int p0,int p1){
return ArrayListMultimap.create(p0,p1);
}
public static <E> com.google.common.collect.EvictingQueue<E> create(int p0){
return EvictingQueue.create(p0);
}
public static <T> java.lang.Iterable<T> limit(java.lang.Iterable<T> p0,int p1){
return Iterables.limit(p0,p1);
}
public static <T> int indexOf(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterables.indexOf(p0,p1);
}
public static int size(java.lang.Iterable<?> p0){
return Iterables.size(p0);
}
public static <T> java.lang.Iterable<T> skip(java.lang.Iterable<T> p0,int p1){
return Iterables.skip(p0,p1);
}
public static int frequency(java.lang.Iterable<?> p0,java.lang.Object p1){
return Iterables.frequency(p0,p1);
}
public static <T> java.lang.Iterable<java.util.List<T>> partition(java.lang.Iterable<T> p0,int p1){
return Iterables.partition(p0,p1);
}
public static <T> java.lang.Iterable<java.util.List<T>> paddedPartition(java.lang.Iterable<T> p0,int p1){
return Iterables.paddedPartition(p0,p1);
}
public static <T> java.util.Iterator<T> limit(java.util.Iterator<T> p0,int p1){
return Iterators.limit(p0,p1);
}
public static <T> int indexOf(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterators.indexOf(p0,p1);
}
public static int size(java.util.Iterator<?> p0){
return Iterators.size(p0);
}
public static int frequency(java.util.Iterator<?> p0,java.lang.Object p1){
return Iterators.frequency(p0,p1);
}
public static int advance(java.util.Iterator<?> p0,int p1){
return Iterators.advance(p0,p1);
}
public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> partition(java.util.Iterator<T> p0,int p1){
return Iterators.partition(p0,p1);
}
public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> paddedPartition(java.util.Iterator<T> p0,int p1){
return Iterators.paddedPartition(p0,p1);
}
public static <E> java.util.ArrayList<E> newArrayListWithCapacity(int p0){
return Lists.newArrayListWithCapacity(p0);
}
public static <E> java.util.ArrayList<E> newArrayListWithExpectedSize(int p0){
return Lists.newArrayListWithExpectedSize(p0);
}
public static <T> java.util.List<java.util.List<T>> partition(java.util.List<T> p0,int p1){
return Lists.partition(p0,p1);
}
public static <K,V> java.util.HashMap<K, V> newHashMapWithExpectedSize(int p0){
return Maps.newHashMapWithExpectedSize(p0);
}
public static <K,V> java.util.LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int p0){
return Maps.newLinkedHashMapWithExpectedSize(p0);
}
public static Builder<java.lang.Comparable> maximumSize(int p0){
return MinMaxPriorityQueue.maximumSize(p0);
}
public static Builder<java.lang.Comparable> expectedSize(int p0){
return MinMaxPriorityQueue.expectedSize(p0);
}
public static MultimapBuilderWithKeys<java.lang.Object> linkedHashKeys(int p0){
return MultimapBuilder.linkedHashKeys(p0);
}
public static MultimapBuilderWithKeys<java.lang.Object> hashKeys(int p0){
return MultimapBuilder.hashKeys(p0);
}
public static <E> com.google.common.collect.Multiset.com.google.common.collect.Multiset.Entry<E> immutableEntry(E p0,int p1){
return Multisets.immutableEntry(p0,p1);
}
public static <T> T[] newArray(java.lang.Class<T> p0,int p1){
return ObjectArrays.newArray(p0,p1);
}
public static <T> T[] newArray(T[] p0,int p1){
return ObjectArrays.newArray(p0,p1);
}
public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(int p0){
return Queues.newLinkedBlockingQueue(p0);
}
public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(int p0){
return Queues.newLinkedBlockingDeque(p0);
}
public static <E> int drainUninterruptibly(java.util.concurrent.BlockingQueue<E> p0,java.util.Collection<? super E> p1,int p2,long p3,java.util.concurrent.TimeUnit p4){
return Queues.drainUninterruptibly(p0,p1,p2,p3,p4);
}
public static <E> java.util.concurrent.ArrayBlockingQueue<E> newArrayBlockingQueue(int p0){
return Queues.newArrayBlockingQueue(p0);
}
public static <E> int drain(java.util.concurrent.BlockingQueue<E> p0,java.util.Collection<? super E> p1,int p2,long p3,java.util.concurrent.TimeUnit p4) throws java.lang.InterruptedException{
return Queues.drain(p0,p1,p2,p3,p4);
}
public static <E> java.util.HashSet<E> newHashSetWithExpectedSize(int p0){
return Sets.newHashSetWithExpectedSize(p0);
}
public static <E> java.util.LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int p0){
return Sets.newLinkedHashSetWithExpectedSize(p0);
}
public static java.lang.String computeReplacement(com.google.common.escape.UnicodeEscaper p0,int p1){
return Escapers.computeReplacement(p0,p1);
}
public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> p0,int p1){
return BloomFilter.create(p0,p1);
}
public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> p0,int p1,double p2){
return BloomFilter.create(p0,p1,p2);
}
public static com.google.common.hash.HashCode fromInt(int p0){
return HashCode.fromInt(p0);
}
public static com.google.common.hash.HashFunction murmur3_128(int p0){
return Hashing.murmur3_128(p0);
}
public static com.google.common.hash.HashFunction murmur3_32(int p0){
return Hashing.murmur3_32(p0);
}
public static com.google.common.hash.HashFunction goodFastHash(int p0){
return Hashing.goodFastHash(p0);
}
public static int consistentHash(com.google.common.hash.HashCode p0,int p1){
return Hashing.consistentHash(p0,p1);
}
public static int consistentHash(long p0,int p1){
return Hashing.consistentHash(p0,p1);
}
public static int read(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return ByteStreams.read(p0,p1,p2,p3);
}
public static void readFully(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
 ByteStreams.readFully(p0,p1,p2,p3);
}
public static com.google.common.io.ByteArrayDataOutput newDataOutput(int p0){
return ByteStreams.newDataOutput(p0);
}
public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] p0,int p1){
return ByteStreams.newDataInput(p0,p1);
}
public static int log10(java.math.BigInteger p0,java.math.RoundingMode p1){
return BigIntegerMath.log10(p0,p1);
}
public static java.math.BigInteger binomial(int p0,int p1){
return BigIntegerMath.binomial(p0,p1);
}
public static java.math.BigInteger factorial(int p0){
return BigIntegerMath.factorial(p0);
}
public static int log2(java.math.BigInteger p0,java.math.RoundingMode p1){
return BigIntegerMath.log2(p0,p1);
}
public static int log2(double p0,java.math.RoundingMode p1){
return DoubleMath.log2(p0,p1);
}
public static int fuzzyCompare(double p0,double p1,double p2){
return DoubleMath.fuzzyCompare(p0,p1,p2);
}
public static int roundToInt(double p0,java.math.RoundingMode p1){
return DoubleMath.roundToInt(p0,p1);
}
public static int sqrt(int p0,java.math.RoundingMode p1){
return IntMath.sqrt(p0,p1);
}
public static int log10(int p0,java.math.RoundingMode p1){
return IntMath.log10(p0,p1);
}
public static int pow(int p0,int p1){
return IntMath.pow(p0,p1);
}
public static int divide(int p0,int p1,java.math.RoundingMode p2){
return IntMath.divide(p0,p1,p2);
}
public static int mod(int p0,int p1){
return IntMath.mod(p0,p1);
}
public static int checkedMultiply(int p0,int p1){
return IntMath.checkedMultiply(p0,p1);
}
public static int checkedAdd(int p0,int p1){
return IntMath.checkedAdd(p0,p1);
}
public static int gcd(int p0,int p1){
return IntMath.gcd(p0,p1);
}
public static int log2(int p0,java.math.RoundingMode p1){
return IntMath.log2(p0,p1);
}
public static boolean isPowerOfTwo(int p0){
return IntMath.isPowerOfTwo(p0);
}
public static int mean(int p0,int p1){
return IntMath.mean(p0,p1);
}
public static int checkedSubtract(int p0,int p1){
return IntMath.checkedSubtract(p0,p1);
}
public static int checkedPow(int p0,int p1){
return IntMath.checkedPow(p0,p1);
}
public static int log10(long p0,java.math.RoundingMode p1){
return LongMath.log10(p0,p1);
}
public static long pow(long p0,int p1){
return LongMath.pow(p0,p1);
}
public static int mod(long p0,int p1){
return LongMath.mod(p0,p1);
}
public static int log2(long p0,java.math.RoundingMode p1){
return LongMath.log2(p0,p1);
}
public static long checkedPow(long p0,int p1){
return LongMath.checkedPow(p0,p1);
}
public static com.google.common.net.HostAndPort fromParts(java.lang.String p0,int p1){
return HostAndPort.fromParts(p0,p1);
}
public static java.net.Inet4Address fromInteger(int p0){
return InetAddresses.fromInteger(p0);
}
public static int coerceToInteger(java.net.InetAddress p0){
return InetAddresses.coerceToInteger(p0);
}
public static int indexOf(boolean[] p0,boolean[] p1){
return Booleans.indexOf(p0,p1);
}
public static int indexOf(boolean[] p0,boolean p1){
return Booleans.indexOf(p0,p1);
}
public static int compare(boolean p0,boolean p1){
return Booleans.compare(p0,p1);
}
public static int lastIndexOf(boolean[] p0,boolean p1){
return Booleans.lastIndexOf(p0,p1);
}
public static boolean[] ensureCapacity(boolean[] p0,int p1,int p2){
return Booleans.ensureCapacity(p0,p1,p2);
}
public static int countTrue(boolean... p0){
return Booleans.countTrue(p0);
}
public static int indexOf(byte[] p0,byte[] p1){
return Bytes.indexOf(p0,p1);
}
public static int indexOf(byte[] p0,byte p1){
return Bytes.indexOf(p0,p1);
}
public static int lastIndexOf(byte[] p0,byte p1){
return Bytes.lastIndexOf(p0,p1);
}
public static byte[] ensureCapacity(byte[] p0,int p1,int p2){
return Bytes.ensureCapacity(p0,p1,p2);
}
public static int indexOf(char[] p0,char[] p1){
return Chars.indexOf(p0,p1);
}
public static int indexOf(char[] p0,char p1){
return Chars.indexOf(p0,p1);
}
public static int compare(char p0,char p1){
return Chars.compare(p0,p1);
}
public static int lastIndexOf(char[] p0,char p1){
return Chars.lastIndexOf(p0,p1);
}
public static char[] ensureCapacity(char[] p0,int p1,int p2){
return Chars.ensureCapacity(p0,p1,p2);
}
public static int indexOf(double[] p0,double[] p1){
return Doubles.indexOf(p0,p1);
}
public static int indexOf(double[] p0,double p1){
return Doubles.indexOf(p0,p1);
}
public static int compare(double p0,double p1){
return Doubles.compare(p0,p1);
}
public static int lastIndexOf(double[] p0,double p1){
return Doubles.lastIndexOf(p0,p1);
}
public static double[] ensureCapacity(double[] p0,int p1,int p2){
return Doubles.ensureCapacity(p0,p1,p2);
}
public static int indexOf(float[] p0,float[] p1){
return Floats.indexOf(p0,p1);
}
public static int indexOf(float[] p0,float p1){
return Floats.indexOf(p0,p1);
}
public static int compare(float p0,float p1){
return Floats.compare(p0,p1);
}
public static int lastIndexOf(float[] p0,float p1){
return Floats.lastIndexOf(p0,p1);
}
public static float[] ensureCapacity(float[] p0,int p1,int p2){
return Floats.ensureCapacity(p0,p1,p2);
}
public static int min(int... p0){
return Ints.min(p0);
}
public static int max(int... p0){
return Ints.max(p0);
}
public static int indexOf(int[] p0,int[] p1){
return Ints.indexOf(p0,p1);
}
public static int indexOf(int[] p0,int p1){
return Ints.indexOf(p0,p1);
}
public static int compare(int p0,int p1){
return Ints.compare(p0,p1);
}
public static boolean contains(int[] p0,int p1){
return Ints.contains(p0,p1);
}
public static int lastIndexOf(int[] p0,int p1){
return Ints.lastIndexOf(p0,p1);
}
public static int[] ensureCapacity(int[] p0,int p1,int p2){
return Ints.ensureCapacity(p0,p1,p2);
}
public static byte[] toByteArray(int p0){
return Ints.toByteArray(p0);
}
public static int saturatedCast(long p0){
return Ints.saturatedCast(p0);
}
public static int fromByteArray(byte[] p0){
return Ints.fromByteArray(p0);
}
public static java.lang.Integer tryParse(java.lang.String p0,int p1){
return Ints.tryParse(p0,p1);
}
public static int fromBytes(byte p0,byte p1,byte p2,byte p3){
return Ints.fromBytes(p0,p1,p2,p3);
}
public static int checkedCast(long p0){
return Ints.checkedCast(p0);
}
public static int indexOf(long[] p0,long[] p1){
return Longs.indexOf(p0,p1);
}
public static int indexOf(long[] p0,long p1){
return Longs.indexOf(p0,p1);
}
public static int compare(long p0,long p1){
return Longs.compare(p0,p1);
}
public static int lastIndexOf(long[] p0,long p1){
return Longs.lastIndexOf(p0,p1);
}
public static long[] ensureCapacity(long[] p0,int p1,int p2){
return Longs.ensureCapacity(p0,p1,p2);
}
public static int indexOf(short[] p0,short[] p1){
return Shorts.indexOf(p0,p1);
}
public static int indexOf(short[] p0,short p1){
return Shorts.indexOf(p0,p1);
}
public static int compare(short p0,short p1){
return Shorts.compare(p0,p1);
}
public static int lastIndexOf(short[] p0,short p1){
return Shorts.lastIndexOf(p0,p1);
}
public static short[] ensureCapacity(short[] p0,int p1,int p2){
return Shorts.ensureCapacity(p0,p1,p2);
}
public static int compare(byte p0,byte p1){
return SignedBytes.compare(p0,p1);
}
public static int toInt(byte p0){
return UnsignedBytes.toInt(p0);
}
public static byte parseUnsignedByte(java.lang.String p0,int p1){
return UnsignedBytes.parseUnsignedByte(p0,p1);
}
public static com.google.common.primitives.UnsignedInteger valueOf(java.lang.String p0,int p1){
return UnsignedInteger.valueOf(p0,p1);
}
public static com.google.common.primitives.UnsignedInteger fromIntBits(int p0){
return UnsignedInteger.fromIntBits(p0);
}
public static int decode(java.lang.String p0){
return UnsignedInts.decode(p0);
}
public static int parseUnsignedInt(java.lang.String p0){
return UnsignedInts.parseUnsignedInt(p0);
}
public static int parseUnsignedInt(java.lang.String p0,int p1){
return UnsignedInts.parseUnsignedInt(p0,p1);
}
public static int divide(int p0,int p1){
return UnsignedInts.divide(p0,p1);
}
public static int remainder(int p0,int p1){
return UnsignedInts.remainder(p0,p1);
}
public static long toLong(int p0){
return UnsignedInts.toLong(p0);
}
public static long parseUnsignedLong(java.lang.String p0,int p1){
return UnsignedLongs.parseUnsignedLong(p0,p1);
}
public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(int p0){
return Atomics.newReferenceArray(p0);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lock(int p0){
return Striped.lock(p0);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> readWriteLock(int p0){
return Striped.readWriteLock(p0);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> semaphore(int p0,int p1){
return Striped.semaphore(p0,p1);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lazyWeakLock(int p0){
return Striped.lazyWeakLock(p0);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> lazyWeakSemaphore(int p0,int p1){
return Striped.lazyWeakSemaphore(p0,p1);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> lazyWeakReadWriteLock(int p0){
return Striped.lazyWeakReadWriteLock(p0);
}
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,int p1,long p2,java.util.concurrent.TimeUnit p3){
return Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2,p3);
}
public static int read(java.nio.channels.ReadableByteChannel p0,java.nio.ByteBuffer p1) throws java.io.IOException{
return IOUtils.read(p0,p1);
}
public static int read(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
return IOUtils.read(p0,p1,p2,p3);
}
public static int read(java.io.Reader p0,char[] p1) throws java.io.IOException{
return IOUtils.read(p0,p1);
}
public static int read(java.io.InputStream p0,byte[] p1) throws java.io.IOException{
return IOUtils.read(p0,p1);
}
public static int copy(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
return IOUtils.copy(p0,p1);
}
public static int copy(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
return IOUtils.copy(p0,p1);
}
public static long copy(java.io.InputStream p0,java.io.OutputStream p1,int p2) throws java.io.IOException{
return IOUtils.copy(p0,p1,p2);
}
public static void readFully(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
 IOUtils.readFully(p0,p1,p2,p3);
}
public static byte[] readFully(java.io.InputStream p0,int p1) throws java.io.IOException{
return IOUtils.readFully(p0,p1);
}
public static byte[] toByteArray(java.io.InputStream p0,int p1) throws java.io.IOException{
return IOUtils.toByteArray(p0,p1);
}
public static java.io.BufferedOutputStream buffer(java.io.OutputStream p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.BufferedReader buffer(java.io.Reader p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.BufferedInputStream buffer(java.io.InputStream p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.BufferedWriter buffer(java.io.Writer p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.InputStream toBufferedInputStream(java.io.InputStream p0,int p1) throws java.io.IOException{
return IOUtils.toBufferedInputStream(p0,p1);
}
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0,int p1){
return IOUtils.toBufferedReader(p0,p1);
}
public static int getTrackCount(){
return FileCleaner.getTrackCount();
}
public static int getPrefixLength(java.lang.String p0){
return FilenameUtils.getPrefixLength(p0);
}
public static int indexOfExtension(java.lang.String p0){
return FilenameUtils.indexOfExtension(p0);
}
public static int indexOfLastSeparator(java.lang.String p0){
return FilenameUtils.indexOfLastSeparator(p0);
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
public static void writeSwappedLong(byte[] p0,int p1,long p2){
 EndianUtils.writeSwappedLong(p0,p1,p2);
}
public static int swapInteger(int p0){
return EndianUtils.swapInteger(p0);
}
public static float readSwappedFloat(byte[] p0,int p1){
return EndianUtils.readSwappedFloat(p0,p1);
}
public static short readSwappedShort(byte[] p0,int p1){
return EndianUtils.readSwappedShort(p0,p1);
}
public static long readSwappedLong(byte[] p0,int p1){
return EndianUtils.readSwappedLong(p0,p1);
}
public static int readSwappedUnsignedShort(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedUnsignedShort(p0);
}
public static int readSwappedUnsignedShort(byte[] p0,int p1){
return EndianUtils.readSwappedUnsignedShort(p0,p1);
}
public static double readSwappedDouble(byte[] p0,int p1){
return EndianUtils.readSwappedDouble(p0,p1);
}
public static int readSwappedInteger(java.io.InputStream p0) throws java.io.IOException{
return EndianUtils.readSwappedInteger(p0);
}
public static int readSwappedInteger(byte[] p0,int p1){
return EndianUtils.readSwappedInteger(p0,p1);
}
public static long readSwappedUnsignedInteger(byte[] p0,int p1){
return EndianUtils.readSwappedUnsignedInteger(p0,p1);
}
public static void writeSwappedInteger(byte[] p0,int p1,int p2){
 EndianUtils.writeSwappedInteger(p0,p1,p2);
}
public static void writeSwappedInteger(java.io.OutputStream p0,int p1) throws java.io.IOException{
 EndianUtils.writeSwappedInteger(p0,p1);
}
public static void writeSwappedDouble(byte[] p0,int p1,double p2){
 EndianUtils.writeSwappedDouble(p0,p1,p2);
}
public static void writeSwappedFloat(byte[] p0,int p1,float p2){
 EndianUtils.writeSwappedFloat(p0,p1,p2);
}
public static void writeSwappedShort(byte[] p0,int p1,short p2){
 EndianUtils.writeSwappedShort(p0,p1,p2);
}
public static void dump(byte[] p0,long p1,java.io.OutputStream p2,int p3) throws java.io.IOException,java.lang.ArrayIndexOutOfBoundsException,java.lang.IllegalArgumentException{
 HexDump.dump(p0,p1,p2,p3);
}
public static boolean waitFor(java.io.File p0,int p1){
return FileUtils.waitFor(p0,p1);
}
public static void copyURLToFile(java.net.URL p0,java.io.File p1,int p2,int p3) throws java.io.IOException{
 FileUtils.copyURLToFile(p0,p1,p2,p3);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3,boolean p4) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1,p2,p3,p4);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1,p2,p3);
}
public static java.lang.Object index(java.lang.Object p0,int p1){
return CollectionUtils.index(p0,p1);
}
public static int size(java.lang.Object p0){
return CollectionUtils.size(p0);
}
public static int cardinality(java.lang.Object p0,java.util.Collection p1){
return CollectionUtils.cardinality(p0,p1);
}
public static int maxSize(java.util.Collection p0){
return CollectionUtils.maxSize(p0);
}
public static int countMatches(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.countMatches(p0,p1);
}
public static int getIntValue(java.util.Map p0,java.lang.Object p1,int p2){
return MapUtils.getIntValue(p0,p1,p2);
}
public static int getIntValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getIntValue(p0,p1);
}
public static java.util.List toList(java.util.Iterator p0,int p1){
return IteratorUtils.toList(p0,p1);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object p0,int p1){
return IteratorUtils.arrayListIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object p0,int p1,int p2){
return IteratorUtils.arrayListIterator(p0,p1,p2);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object[] p0,int p1,int p2){
return IteratorUtils.arrayListIterator(p0,p1,p2);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object[] p0,int p1){
return IteratorUtils.arrayListIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object[] p0,int p1){
return IteratorUtils.arrayIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object p0,int p1){
return IteratorUtils.arrayIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object[] p0,int p1,int p2){
return IteratorUtils.arrayIterator(p0,p1,p2);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object p0,int p1,int p2){
return IteratorUtils.arrayIterator(p0,p1,p2);
}
public static int hashCodeForSet(java.util.Collection p0){
return SetUtils.hashCodeForSet(p0);
}
public static org.apache.commons.collections.Buffer boundedBuffer(org.apache.commons.collections.Buffer p0,int p1,long p2){
return BufferUtils.boundedBuffer(p0,p1,p2);
}
public static org.apache.commons.collections.Buffer boundedBuffer(org.apache.commons.collections.Buffer p0,int p1){
return BufferUtils.boundedBuffer(p0,p1);
}
public static org.apache.commons.collections.Closure forClosure(int p0,org.apache.commons.collections.Closure p1){
return ClosureUtils.forClosure(p0,p1);
}
public static org.apache.commons.collections.Closure getInstance(int p0,org.apache.commons.collections.Closure p1){
return ForClosure.getInstance(p0,p1);
}
public static int hashCodeForList(java.util.Collection p0){
return ListUtils.hashCodeForList(p0);
}
public static org.apache.commons.collections.buffer.BoundedBuffer decorate(org.apache.commons.collections.Buffer p0,int p1,long p2){
return BoundedBuffer.decorate(p0,p1,p2);
}
public static org.apache.commons.collections.buffer.BoundedBuffer decorate(org.apache.commons.collections.Buffer p0,int p1){
return BoundedBuffer.decorate(p0,p1);
}
public static <O> int cardinality(O p0,java.lang.Iterable<? super O> p1){
return CollectionUtils.cardinality(p0,p1);
}
public static int maxSize(java.util.Collection<?> p0){
return CollectionUtils.maxSize(p0);
}
public static <C> int countMatches(java.lang.Iterable<C> p0,org.apache.commons.collections4.Predicate<? super C> p1){
return CollectionUtils.countMatches(p0,p1);
}
public static <K> int getIntValue(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getIntValue(p0,p1);
}
public static <K> int getIntValue(java.util.Map<? super K, ?> p0,K p1,int p2){
return MapUtils.getIntValue(p0,p1,p2);
}
public static org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength resolve(int p0){
return ReferenceStrength.resolve(p0);
}
public static <E> int indexOf(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IteratorUtils.indexOf(p0,p1);
}
public static <E> java.util.List<E> toList(java.util.Iterator<? extends E> p0,int p1){
return IteratorUtils.toList(p0,p1);
}
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E[] p0,int p1,int p2){
return IteratorUtils.arrayListIterator(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.ResettableListIterator<E> arrayListIterator(E[] p0,int p1){
return IteratorUtils.arrayListIterator(p0,p1);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E[] p0,int p1){
return IteratorUtils.arrayIterator(p0,p1);
}
public static <E> org.apache.commons.collections4.ResettableIterator<E> arrayIterator(E[] p0,int p1,int p2){
return IteratorUtils.arrayIterator(p0,p1,p2);
}
public static <T> int hashCodeForSet(java.util.Collection<T> p0){
return SetUtils.hashCodeForSet(p0);
}
public static <E> org.apache.commons.collections4.Closure<E> forClosure(int p0,org.apache.commons.collections4.Closure<? super E> p1){
return ClosureUtils.forClosure(p0,p1);
}
public static <E> int indexOf(java.util.List<E> p0,org.apache.commons.collections4.Predicate<E> p1){
return ListUtils.indexOf(p0,p1);
}
public static int hashCodeForList(java.util.Collection<?> p0){
return ListUtils.hashCodeForList(p0);
}
public static <E> int indexOf(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IterableUtils.indexOf(p0,p1);
}
public static <E,T> int frequency(java.lang.Iterable<E> p0,T p1){
return IterableUtils.frequency(p0,p1);
}
public static float[] add(float[] p0,int p1,float p2){
return ArrayUtils.add(p0,p1,p2);
}
public static double[] add(double[] p0,int p1,double p2){
return ArrayUtils.add(p0,p1,p2);
}
public static <T> T[] add(T[] p0,int p1,T p2){
return ArrayUtils.add(p0,p1,p2);
}
public static boolean[] add(boolean[] p0,int p1,boolean p2){
return ArrayUtils.add(p0,p1,p2);
}
public static char[] add(char[] p0,int p1,char p2){
return ArrayUtils.add(p0,p1,p2);
}
public static byte[] add(byte[] p0,int p1,byte p2){
return ArrayUtils.add(p0,p1,p2);
}
public static short[] add(short[] p0,int p1,short p2){
return ArrayUtils.add(p0,p1,p2);
}
public static int[] add(int[] p0,int p1,int p2){
return ArrayUtils.add(p0,p1,p2);
}
public static long[] add(long[] p0,int p1,long p2){
return ArrayUtils.add(p0,p1,p2);
}
public static int[] add(int[] p0,int p1){
return ArrayUtils.add(p0,p1);
}
public static short[] remove(short[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static long[] remove(long[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static byte[] remove(byte[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static char[] remove(char[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static double[] remove(double[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static int[] remove(int[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static float[] remove(float[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static <T> T[] remove(T[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static boolean[] remove(boolean[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static int getLength(java.lang.Object p0){
return ArrayUtils.getLength(p0);
}
public static int indexOf(short[] p0,short p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int indexOf(char[] p0,char p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int indexOf(java.lang.Object[] p0,java.lang.Object p1){
return ArrayUtils.indexOf(p0,p1);
}
public static int indexOf(byte[] p0,byte p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int indexOf(java.lang.Object[] p0,java.lang.Object p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int indexOf(long[] p0,long p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int indexOf(int[] p0,int p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int indexOf(double[] p0,double p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int indexOf(double[] p0,double p1,int p2,double p3){
return ArrayUtils.indexOf(p0,p1,p2,p3);
}
public static int indexOf(float[] p0,float p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int indexOf(boolean[] p0,boolean p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int indexOf(double[] p0,double p1,double p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int lastIndexOf(char[] p0,char p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
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
public static int lastIndexOf(boolean[] p0,boolean p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(byte[] p0,byte p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(java.lang.Object[] p0,java.lang.Object p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(int[] p0,int p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(long[] p0,long p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(float[] p0,float p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(short[] p0,short p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(java.lang.Object[] p0,java.lang.Object p1){
return ArrayUtils.lastIndexOf(p0,p1);
}
public static void reverse(short[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static void reverse(boolean[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static void reverse(int[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static void reverse(long[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static void reverse(java.lang.Object[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static void reverse(byte[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static void reverse(char[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static void reverse(float[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static void reverse(double[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static int[] removeElement(int[] p0,int p1){
return ArrayUtils.removeElement(p0,p1);
}
public static boolean[] subarray(boolean[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static float[] subarray(float[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static char[] subarray(char[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static short[] subarray(short[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static int[] subarray(int[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static long[] subarray(long[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static <T> T[] subarray(T[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static double[] subarray(double[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static byte[] subarray(byte[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static int[] toPrimitive(java.lang.Integer[] p0,int p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static int toInteger(boolean p0){
return BooleanUtils.toInteger(p0);
}
public static int toInteger(boolean p0,int p1,int p2){
return BooleanUtils.toInteger(p0,p1,p2);
}
public static int toInteger(java.lang.Boolean p0,int p1,int p2,int p3){
return BooleanUtils.toInteger(p0,p1,p2,p3);
}
public static boolean toBoolean(int p0,int p1,int p2){
return BooleanUtils.toBoolean(p0,p1,p2);
}
public static boolean toBoolean(int p0){
return BooleanUtils.toBoolean(p0);
}
public static java.lang.Boolean toBooleanObject(int p0,int p1,int p2,int p3){
return BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
public static java.lang.Boolean toBooleanObject(int p0){
return BooleanUtils.toBooleanObject(p0);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1){
return CompareToBuilder.reflectionCompare(p0,p1);
}
public static int reflectionHashCode(java.lang.Object p0,java.util.Collection<java.lang.String> p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static int reflectionHashCode(java.lang.Object p0,java.lang.String... p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3);
}
public static int reflectionHashCode(java.lang.Object p0,boolean p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2);
}
public static <T> int reflectionHashCode(int p0,int p1,T p2,boolean p3,java.lang.Class<? super T> p4,java.lang.String... p5){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}
public static java.lang.CharSequence subSequence(java.lang.CharSequence p0,int p1){
return CharSequenceUtils.subSequence(p0,p1);
}
public static int count(java.lang.String p0,java.lang.String... p1){
return CharSetUtils.count(p0,p1);
}
public static int toIntValue(java.lang.Character p0){
return CharUtils.toIntValue(p0);
}
public static int toIntValue(java.lang.Character p0,int p1){
return CharUtils.toIntValue(p0,p1);
}
public static int toIntValue(char p0){
return CharUtils.toIntValue(p0);
}
public static int toIntValue(char p0,int p1){
return CharUtils.toIntValue(p0,p1);
}
public static java.lang.String getAbbreviatedName(java.lang.Class<?> p0,int p1){
return ClassUtils.getAbbreviatedName(p0,p1);
}
public static java.lang.String getAbbreviatedName(java.lang.String p0,int p1){
return ClassUtils.getAbbreviatedName(p0,p1);
}
public static char binaryToHexDigit(boolean[] p0,int p1){
return Conversion.binaryToHexDigit(p0,p1);
}
public static int hexDigitToInt(char p0){
return Conversion.hexDigitToInt(p0);
}
public static java.lang.String shortToHex(short p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.shortToHex(p0,p1,p2,p3,p4);
}
public static java.lang.String byteToHex(byte p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.byteToHex(p0,p1,p2,p3,p4);
}
public static short[] longToShortArray(long p0,int p1,short[] p2,int p3,int p4){
return Conversion.longToShortArray(p0,p1,p2,p3,p4);
}
public static short hexToShort(java.lang.String p0,int p1,short p2,int p3,int p4){
return Conversion.hexToShort(p0,p1,p2,p3,p4);
}
public static int binaryToInt(boolean[] p0,int p1,int p2,int p3,int p4){
return Conversion.binaryToInt(p0,p1,p2,p3,p4);
}
public static java.lang.String longToHex(long p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.longToHex(p0,p1,p2,p3,p4);
}
public static boolean[] longToBinary(long p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.longToBinary(p0,p1,p2,p3,p4);
}
public static long shortArrayToLong(short[] p0,int p1,long p2,int p3,int p4){
return Conversion.shortArrayToLong(p0,p1,p2,p3,p4);
}
public static byte hexToByte(java.lang.String p0,int p1,byte p2,int p3,int p4){
return Conversion.hexToByte(p0,p1,p2,p3,p4);
}
public static boolean[] intToBinary(int p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.intToBinary(p0,p1,p2,p3,p4);
}
public static boolean[] shortToBinary(short p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.shortToBinary(p0,p1,p2,p3,p4);
}
public static short[] intToShortArray(int p0,int p1,short[] p2,int p3,int p4){
return Conversion.intToShortArray(p0,p1,p2,p3,p4);
}
public static boolean[] byteToBinary(byte p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.byteToBinary(p0,p1,p2,p3,p4);
}
public static long byteArrayToLong(byte[] p0,int p1,long p2,int p3,int p4){
return Conversion.byteArrayToLong(p0,p1,p2,p3,p4);
}
public static java.lang.String intToHex(int p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.intToHex(p0,p1,p2,p3,p4);
}
public static byte[] shortToByteArray(short p0,int p1,byte[] p2,int p3,int p4){
return Conversion.shortToByteArray(p0,p1,p2,p3,p4);
}
public static byte[] uuidToByteArray(java.util.UUID p0,byte[] p1,int p2,int p3){
return Conversion.uuidToByteArray(p0,p1,p2,p3);
}
public static java.util.UUID byteArrayToUuid(byte[] p0,int p1){
return Conversion.byteArrayToUuid(p0,p1);
}
public static long intArrayToLong(int[] p0,int p1,long p2,int p3,int p4){
return Conversion.intArrayToLong(p0,p1,p2,p3,p4);
}
public static short byteArrayToShort(byte[] p0,int p1,short p2,int p3,int p4){
return Conversion.byteArrayToShort(p0,p1,p2,p3,p4);
}
public static char intToHexDigit(int p0){
return Conversion.intToHexDigit(p0);
}
public static byte[] longToByteArray(long p0,int p1,byte[] p2,int p3,int p4){
return Conversion.longToByteArray(p0,p1,p2,p3,p4);
}
public static long binaryToLong(boolean[] p0,int p1,long p2,int p3,int p4){
return Conversion.binaryToLong(p0,p1,p2,p3,p4);
}
public static short binaryToShort(boolean[] p0,int p1,short p2,int p3,int p4){
return Conversion.binaryToShort(p0,p1,p2,p3,p4);
}
public static byte[] intToByteArray(int p0,int p1,byte[] p2,int p3,int p4){
return Conversion.intToByteArray(p0,p1,p2,p3,p4);
}
public static int hexToInt(java.lang.String p0,int p1,int p2,int p3,int p4){
return Conversion.hexToInt(p0,p1,p2,p3,p4);
}
public static byte binaryToByte(boolean[] p0,int p1,byte p2,int p3,int p4){
return Conversion.binaryToByte(p0,p1,p2,p3,p4);
}
public static int byteArrayToInt(byte[] p0,int p1,int p2,int p3,int p4){
return Conversion.byteArrayToInt(p0,p1,p2,p3,p4);
}
public static long hexToLong(java.lang.String p0,int p1,long p2,int p3,int p4){
return Conversion.hexToLong(p0,p1,p2,p3,p4);
}
public static int shortArrayToInt(short[] p0,int p1,int p2,int p3,int p4){
return Conversion.shortArrayToInt(p0,p1,p2,p3,p4);
}
public static int[] longToIntArray(long p0,int p1,int[] p2,int p3,int p4){
return Conversion.longToIntArray(p0,p1,p2,p3,p4);
}
public static char intToHexDigitMsb0(int p0){
return Conversion.intToHexDigitMsb0(p0);
}
public static char binaryBeMsb0ToHexDigit(boolean[] p0,int p1){
return Conversion.binaryBeMsb0ToHexDigit(p0,p1);
}
public static char binaryToHexDigitMsb0_4bits(boolean[] p0,int p1){
return Conversion.binaryToHexDigitMsb0_4bits(p0,p1);
}
public static int hexDigitMsb0ToInt(char p0){
return Conversion.hexDigitMsb0ToInt(p0);
}
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class<?> p1){
return ExceptionUtils.indexOfThrowable(p0,p1);
}
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class<?> p1,int p2){
return ExceptionUtils.indexOfThrowable(p0,p1,p2);
}
public static int indexOfType(java.lang.Throwable p0,java.lang.Class<?> p1){
return ExceptionUtils.indexOfType(p0,p1);
}
public static int indexOfType(java.lang.Throwable p0,java.lang.Class<?> p1,int p2){
return ExceptionUtils.indexOfType(p0,p1,p2);
}
public static int getThrowableCount(java.lang.Throwable p0){
return ExceptionUtils.getThrowableCount(p0);
}
public static org.apache.commons.lang3.math.Fraction getFraction(int p0,int p1,int p2){
return Fraction.getFraction(p0,p1,p2);
}
public static org.apache.commons.lang3.math.Fraction getFraction(int p0,int p1){
return Fraction.getFraction(p0,p1);
}
public static org.apache.commons.lang3.math.Fraction getReducedFraction(int p0,int p1){
return Fraction.getReducedFraction(p0,p1);
}
public static int min(int p0,int p1,int p2){
return NumberUtils.min(p0,p1,p2);
}
public static int max(int p0,int p1,int p2){
return NumberUtils.max(p0,p1,p2);
}
public static int toInt(java.lang.String p0,int p1){
return NumberUtils.toInt(p0,p1);
}
public static int toInt(java.lang.String p0){
return NumberUtils.toInt(p0);
}
public static <T extends java.lang.Comparable<? super T> > int compare(T p0,T p1,boolean p2){
return ObjectUtils.compare(p0,p1,p2);
}
public static <T extends java.lang.Comparable<? super T> > int compare(T p0,T p1){
return ObjectUtils.compare(p0,p1);
}
public static byte CONST_BYTE(int p0) throws java.lang.IllegalArgumentException{
return ObjectUtils.CONST_BYTE(p0);
}
public static int hashCodeMulti(java.lang.Object... p0){
return ObjectUtils.hashCodeMulti(p0);
}
public static short CONST_SHORT(int p0) throws java.lang.IllegalArgumentException{
return ObjectUtils.CONST_SHORT(p0);
}
public static int CONST(int p0){
return ObjectUtils.CONST(p0);
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
public static java.lang.String random(int p0,java.lang.String p1){
return RandomStringUtils.random(p0,p1);
}
public static java.lang.String random(int p0,char... p1){
return RandomStringUtils.random(p0,p1);
}
public static java.lang.String random(int p0){
return RandomStringUtils.random(p0);
}
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4){
return RandomStringUtils.random(p0,p1,p2,p3,p4);
}
public static java.lang.String randomAlphabetic(int p0){
return RandomStringUtils.randomAlphabetic(p0);
}
public static java.lang.String randomAscii(int p0){
return RandomStringUtils.randomAscii(p0);
}
public static java.lang.String randomNumeric(int p0){
return RandomStringUtils.randomNumeric(p0);
}
public static java.lang.String randomAlphanumeric(int p0){
return RandomStringUtils.randomAlphanumeric(p0);
}
public static int nextInt(int p0,int p1){
return RandomUtils.nextInt(p0,p1);
}
public static byte[] nextBytes(int p0){
return RandomUtils.nextBytes(p0);
}
public static int distance(java.lang.Class<?> p0,java.lang.Class<?> p1){
return InheritanceUtils.distance(p0,p1);
}
public static int indexOf(java.lang.CharSequence p0,int p1){
return StringUtils.indexOf(p0,p1);
}
public static int indexOf(java.lang.CharSequence p0,int p1,int p2){
return StringUtils.indexOf(p0,p1,p2);
}
public static int indexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.indexOf(p0,p1,p2);
}
public static int indexOf(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.indexOf(p0,p1);
}
public static boolean contains(java.lang.CharSequence p0,int p1){
return StringUtils.contains(p0,p1);
}
public static java.lang.String join(long[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(double[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(char[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(short[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(byte[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(float[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(java.lang.Object[] p0,java.lang.String p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(java.lang.Object[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(int[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static int lastIndexOf(java.lang.CharSequence p0,int p1){
return StringUtils.lastIndexOf(p0,p1);
}
public static int lastIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.lastIndexOf(p0,p1);
}
public static int lastIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(java.lang.CharSequence p0,int p1,int p2){
return StringUtils.lastIndexOf(p0,p1,p2);
}
public static int length(java.lang.CharSequence p0){
return StringUtils.length(p0);
}
public static java.lang.String replace(java.lang.String p0,java.lang.String p1,java.lang.String p2,int p3){
return StringUtils.replace(p0,p1,p2,p3);
}
public static java.lang.String[] split(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.split(p0,p1,p2);
}
public static java.lang.String substring(java.lang.String p0,int p1,int p2){
return StringUtils.substring(p0,p1,p2);
}
public static java.lang.String substring(java.lang.String p0,int p1){
return StringUtils.substring(p0,p1);
}
public static java.lang.String left(java.lang.String p0,int p1){
return StringUtils.left(p0,p1);
}
public static java.lang.String right(java.lang.String p0,int p1){
return StringUtils.right(p0,p1);
}
public static java.lang.String rightPad(java.lang.String p0,int p1,java.lang.String p2){
return StringUtils.rightPad(p0,p1,p2);
}
public static java.lang.String rightPad(java.lang.String p0,int p1){
return StringUtils.rightPad(p0,p1);
}
public static java.lang.String rightPad(java.lang.String p0,int p1,char p2){
return StringUtils.rightPad(p0,p1,p2);
}
public static java.lang.String leftPad(java.lang.String p0,int p1,char p2){
return StringUtils.leftPad(p0,p1,p2);
}
public static java.lang.String leftPad(java.lang.String p0,int p1,java.lang.String p2){
return StringUtils.leftPad(p0,p1,p2);
}
public static java.lang.String leftPad(java.lang.String p0,int p1){
return StringUtils.leftPad(p0,p1);
}
public static java.lang.String[] splitPreserveAllTokens(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.splitPreserveAllTokens(p0,p1,p2);
}
public static int indexOfDifference(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.indexOfDifference(p0,p1);
}
public static int indexOfDifference(java.lang.CharSequence... p0){
return StringUtils.indexOfDifference(p0);
}
public static int lastOrdinalIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.lastOrdinalIndexOf(p0,p1,p2);
}
public static int getLevenshteinDistance(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.getLevenshteinDistance(p0,p1);
}
public static int getLevenshteinDistance(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.getLevenshteinDistance(p0,p1,p2);
}
public static java.lang.String[] splitByWholeSeparator(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.splitByWholeSeparator(p0,p1,p2);
}
public static int indexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.indexOfIgnoreCase(p0,p1,p2);
}
public static int indexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.indexOfIgnoreCase(p0,p1);
}
public static int lastIndexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.lastIndexOfIgnoreCase(p0,p1,p2);
}
public static int lastIndexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.lastIndexOfIgnoreCase(p0,p1);
}
public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.splitByWholeSeparatorPreserveAllTokens(p0,p1,p2);
}
public static int ordinalIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.ordinalIndexOf(p0,p1,p2);
}
public static int indexOfAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.indexOfAny(p0,p1);
}
public static int indexOfAny(java.lang.CharSequence p0,java.lang.String p1){
return StringUtils.indexOfAny(p0,p1);
}
public static int indexOfAny(java.lang.CharSequence p0,char... p1){
return StringUtils.indexOfAny(p0,p1);
}
public static java.lang.String repeat(char p0,int p1){
return StringUtils.repeat(p0,p1);
}
public static java.lang.String repeat(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.repeat(p0,p1,p2);
}
public static int indexOfAnyBut(java.lang.CharSequence p0,char... p1){
return StringUtils.indexOfAnyBut(p0,p1);
}
public static int indexOfAnyBut(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.indexOfAnyBut(p0,p1);
}
public static java.lang.String mid(java.lang.String p0,int p1,int p2){
return StringUtils.mid(p0,p1,p2);
}
public static int lastIndexOfAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.lastIndexOfAny(p0,p1);
}
public static java.lang.String abbreviateMiddle(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.abbreviateMiddle(p0,p1,p2);
}
public static java.lang.String overlay(java.lang.String p0,java.lang.String p1,int p2,int p3){
return StringUtils.overlay(p0,p1,p2,p3);
}
public static int countMatches(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.countMatches(p0,p1);
}
public static int countMatches(java.lang.CharSequence p0,char p1){
return StringUtils.countMatches(p0,p1);
}
public static java.lang.String abbreviate(java.lang.String p0,int p1){
return StringUtils.abbreviate(p0,p1);
}
public static java.lang.String abbreviate(java.lang.String p0,int p1,int p2){
return StringUtils.abbreviate(p0,p1,p2);
}
public static java.lang.String center(java.lang.String p0,int p1){
return StringUtils.center(p0,p1);
}
public static java.lang.String center(java.lang.String p0,int p1,char p2){
return StringUtils.center(p0,p1,p2);
}
public static java.lang.String center(java.lang.String p0,int p1,java.lang.String p2){
return StringUtils.center(p0,p1,p2);
}
public static int getFuzzyDistance(java.lang.CharSequence p0,java.lang.CharSequence p1,java.util.Locale p2){
return StringUtils.getFuzzyDistance(p0,p1,p2);
}
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,java.lang.CharSequence p5){
return FormattableUtils.append(p0,p1,p2,p3,p4,p5);
}
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,char p5,java.lang.CharSequence p6){
return FormattableUtils.append(p0,p1,p2,p3,p4,p5,p6);
}
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,char p5){
return FormattableUtils.append(p0,p1,p2,p3,p4,p5);
}
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4){
return FormattableUtils.append(p0,p1,p2,p3,p4);
}
public static java.lang.String hex(int p0){
return CharSequenceTranslator.hex(p0);
}
public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper below(int p0){
return JavaUnicodeEscaper.below(p0);
}
public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper above(int p0){
return JavaUnicodeEscaper.above(p0);
}
public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper between(int p0,int p1){
return JavaUnicodeEscaper.between(p0,p1);
}
public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper outsideOf(int p0,int p1){
return JavaUnicodeEscaper.outsideOf(p0,p1);
}
public static java.lang.String wrap(java.lang.String p0,int p1){
return WordUtils.wrap(p0,p1);
}
public static java.lang.String wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3){
return WordUtils.wrap(p0,p1,p2,p3);
}
public static java.util.Iterator<java.util.Calendar> iterator(java.util.Date p0,int p1){
return DateUtils.iterator(p0,p1);
}
public static java.util.Iterator<java.util.Calendar> iterator(java.util.Calendar p0,int p1){
return DateUtils.iterator(p0,p1);
}
public static java.util.Iterator<?> iterator(java.lang.Object p0,int p1){
return DateUtils.iterator(p0,p1);
}
public static java.util.Calendar truncate(java.util.Calendar p0,int p1){
return DateUtils.truncate(p0,p1);
}
public static java.util.Date truncate(java.lang.Object p0,int p1){
return DateUtils.truncate(p0,p1);
}
public static java.util.Date truncate(java.util.Date p0,int p1){
return DateUtils.truncate(p0,p1);
}
public static java.util.Date round(java.util.Date p0,int p1){
return DateUtils.round(p0,p1);
}
public static java.util.Date round(java.lang.Object p0,int p1){
return DateUtils.round(p0,p1);
}
public static java.util.Calendar round(java.util.Calendar p0,int p1){
return DateUtils.round(p0,p1);
}
public static java.util.Date setHours(java.util.Date p0,int p1){
return DateUtils.setHours(p0,p1);
}
public static java.util.Date setMinutes(java.util.Date p0,int p1){
return DateUtils.setMinutes(p0,p1);
}
public static java.util.Date setSeconds(java.util.Date p0,int p1){
return DateUtils.setSeconds(p0,p1);
}
public static java.util.Date addMinutes(java.util.Date p0,int p1){
return DateUtils.addMinutes(p0,p1);
}
public static java.util.Date addSeconds(java.util.Date p0,int p1){
return DateUtils.addSeconds(p0,p1);
}
public static java.util.Date setMonths(java.util.Date p0,int p1){
return DateUtils.setMonths(p0,p1);
}
public static java.util.Date addHours(java.util.Date p0,int p1){
return DateUtils.addHours(p0,p1);
}
public static java.util.Date ceiling(java.util.Date p0,int p1){
return DateUtils.ceiling(p0,p1);
}
public static java.util.Calendar ceiling(java.util.Calendar p0,int p1){
return DateUtils.ceiling(p0,p1);
}
public static java.util.Date ceiling(java.lang.Object p0,int p1){
return DateUtils.ceiling(p0,p1);
}
public static java.util.Date addDays(java.util.Date p0,int p1){
return DateUtils.addDays(p0,p1);
}
public static java.util.Date addYears(java.util.Date p0,int p1){
return DateUtils.addYears(p0,p1);
}
public static java.util.Date addWeeks(java.util.Date p0,int p1){
return DateUtils.addWeeks(p0,p1);
}
public static java.util.Date addMonths(java.util.Date p0,int p1){
return DateUtils.addMonths(p0,p1);
}
public static java.util.Date setYears(java.util.Date p0,int p1){
return DateUtils.setYears(p0,p1);
}
public static java.util.Date setDays(java.util.Date p0,int p1){
return DateUtils.setDays(p0,p1);
}
public static java.util.Date setMilliseconds(java.util.Date p0,int p1){
return DateUtils.setMilliseconds(p0,p1);
}
public static java.util.Date addMilliseconds(java.util.Date p0,int p1){
return DateUtils.addMilliseconds(p0,p1);
}
public static boolean truncatedEquals(java.util.Date p0,java.util.Date p1,int p2){
return DateUtils.truncatedEquals(p0,p1,p2);
}
public static boolean truncatedEquals(java.util.Calendar p0,java.util.Calendar p1,int p2){
return DateUtils.truncatedEquals(p0,p1,p2);
}
public static int truncatedCompareTo(java.util.Date p0,java.util.Date p1,int p2){
return DateUtils.truncatedCompareTo(p0,p1,p2);
}
public static int truncatedCompareTo(java.util.Calendar p0,java.util.Calendar p1,int p2){
return DateUtils.truncatedCompareTo(p0,p1,p2);
}
public static long getFragmentInSeconds(java.util.Date p0,int p1){
return DateUtils.getFragmentInSeconds(p0,p1);
}
public static long getFragmentInSeconds(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInSeconds(p0,p1);
}
public static long getFragmentInHours(java.util.Date p0,int p1){
return DateUtils.getFragmentInHours(p0,p1);
}
public static long getFragmentInHours(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInHours(p0,p1);
}
public static long getFragmentInDays(java.util.Date p0,int p1){
return DateUtils.getFragmentInDays(p0,p1);
}
public static long getFragmentInDays(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInDays(p0,p1);
}
public static long getFragmentInMinutes(java.util.Date p0,int p1){
return DateUtils.getFragmentInMinutes(p0,p1);
}
public static long getFragmentInMinutes(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInMinutes(p0,p1);
}
public static long getFragmentInMilliseconds(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInMilliseconds(p0,p1);
}
public static long getFragmentInMilliseconds(java.util.Date p0,int p1){
return DateUtils.getFragmentInMilliseconds(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0){
return FastDateFormat.getDateInstance(p0);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0,java.util.Locale p1){
return FastDateFormat.getDateInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0,java.util.TimeZone p1){
return FastDateFormat.getDateInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getDateInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int p0,int p1,java.util.Locale p2){
return FastDateFormat.getDateTimeInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int p0,int p1){
return FastDateFormat.getDateTimeInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int p0,int p1,java.util.TimeZone p2){
return FastDateFormat.getDateTimeInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int p0,int p1,java.util.TimeZone p2,java.util.Locale p3){
return FastDateFormat.getDateTimeInstance(p0,p1,p2,p3);
}
public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getTimeInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int p0,java.util.TimeZone p1){
return FastDateFormat.getTimeInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int p0,java.util.Locale p1){
return FastDateFormat.getTimeInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int p0){
return FastDateFormat.getTimeInstance(p0);
}
public static <T> T[] validIndex(T[] p0,int p1,java.lang.String p2,java.lang.Object... p3){
return Validate.validIndex(p0,p1,p2,p3);
}
public static <T> T[] validIndex(T[] p0,int p1){
return Validate.validIndex(p0,p1);
}
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1){
return Validate.validIndex(p0,p1);
}
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1,java.lang.String p2,java.lang.Object... p3){
return Validate.validIndex(p0,p1,p2,p3);
}
public static double[] sample(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2,int p3) throws org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.NotStrictlyPositiveException{
return FunctionUtils.sample(p0,p1,p2,p3);
}
public static org.apache.commons.math3.analysis.differentiation.SparseGradient createVariable(int p0,double p1){
return SparseGradient.createVariable(p0,p1);
}
public static org.apache.commons.math3.analysis.differentiation.DSCompiler getCompiler(int p0,int p1) throws org.apache.commons.math3.exception.NumberIsTooLargeException{
return DSCompiler.getCompiler(p0,p1);
}
public static org.apache.commons.math3.analysis.polynomials.PolynomialFunction createJacobiPolynomial(int p0,int p1,int p2){
return PolynomialsUtils.createJacobiPolynomial(p0,p1,p2);
}
public static org.apache.commons.math3.analysis.polynomials.PolynomialFunction createHermitePolynomial(int p0){
return PolynomialsUtils.createHermitePolynomial(p0);
}
public static org.apache.commons.math3.analysis.polynomials.PolynomialFunction createLaguerrePolynomial(int p0){
return PolynomialsUtils.createLaguerrePolynomial(p0);
}
public static org.apache.commons.math3.analysis.polynomials.PolynomialFunction createChebyshevPolynomial(int p0){
return PolynomialsUtils.createChebyshevPolynomial(p0);
}
public static org.apache.commons.math3.analysis.polynomials.PolynomialFunction createLegendrePolynomial(int p0){
return PolynomialsUtils.createLegendrePolynomial(p0);
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
public static double exactP(double p0,int p1,int p2,boolean p3){
return TestUtils.exactP(p0,p1,p2,p3);
}
public static double approximateP(double p0,int p1,int p2){
return TestUtils.approximateP(p0,p1,p2);
}
public static double monteCarloP(double p0,int p1,int p2,boolean p3,int p4){
return TestUtils.monteCarloP(p0,p1,p2,p3,p4);
}
public static double min(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.min(p0,p1,p2);
}
public static double max(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.max(p0,p1,p2);
}
public static double sum(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.sum(p0,p1,p2);
}
public static double[] mode(double[] p0,int p1,int p2){
return StatUtils.mode(p0,p1,p2);
}
public static double mean(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.mean(p0,p1,p2);
}
public static double product(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.product(p0,p1,p2);
}
public static double populationVariance(double[] p0,double p1,int p2,int p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.populationVariance(p0,p1,p2,p3);
}
public static double populationVariance(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.populationVariance(p0,p1,p2);
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
public static double geometricMean(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.geometricMean(p0,p1,p2);
}
public static double sumLog(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.sumLog(p0,p1,p2);
}
public static double sumSq(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return StatUtils.sumSq(p0,p1,p2);
}
public static <T extends org.apache.commons.math3.FieldElement<T> > T[][] createBlocksLayout(org.apache.commons.math3.Field<T> p0,int p1,int p2){
return BlockFieldMatrix.createBlocksLayout(p0,p1,p2);
}
public static org.apache.commons.math3.linear.RealMatrix createRealIdentityMatrix(int p0){
return MatrixUtils.createRealIdentityMatrix(p0);
}
public static void checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix p0,int p1,int p2,int p3,int p4) throws org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkSubMatrixIndex(p0,p1,p2,p3,p4);
}
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldIdentityMatrix(org.apache.commons.math3.Field<T> p0,int p1){
return MatrixUtils.createFieldIdentityMatrix(p0,p1);
}
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldMatrix(org.apache.commons.math3.Field<T> p0,int p1,int p2){
return MatrixUtils.createFieldMatrix(p0,p1,p2);
}
public static org.apache.commons.math3.linear.RealMatrix createRealMatrix(int p0,int p1){
return MatrixUtils.createRealMatrix(p0,p1);
}
public static org.apache.commons.math3.linear.RealMatrix blockInverse(org.apache.commons.math3.linear.RealMatrix p0,int p1){
return MatrixUtils.blockInverse(p0,p1);
}
public static void checkMatrixIndex(org.apache.commons.math3.linear.AnyMatrix p0,int p1,int p2) throws org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkMatrixIndex(p0,p1,p2);
}
public static void checkRowIndex(org.apache.commons.math3.linear.AnyMatrix p0,int p1) throws org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkRowIndex(p0,p1);
}
public static void checkColumnIndex(org.apache.commons.math3.linear.AnyMatrix p0,int p1) throws org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkColumnIndex(p0,p1);
}
public static double[][] createBlocksLayout(int p0,int p1){
return BlockRealMatrix.createBlocksLayout(p0,p1);
}
public static org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution estimate(double[][] p0,int p1) throws org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException{
return MultivariateNormalMixtureExpectationMaximization.estimate(p0,p1);
}
public static org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer getInstance(int p0){
return AdamsNordsieckTransformer.getInstance(p0);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.ode.nonstiff.AdamsNordsieckFieldTransformer<T> getInstance(org.apache.commons.math3.Field<T> p0,int p1){
return AdamsNordsieckFieldTransformer.getInstance(p0,p1);
}
public static java.util.List<java.lang.Integer> primeFactors(int p0){
return Primes.primeFactors(p0);
}
public static boolean isPrime(int p0){
return Primes.isPrime(p0);
}
public static int nextPrime(int p0){
return Primes.nextPrime(p0);
}
public static org.apache.commons.math3.optim.SimpleBounds unbounded(int p0){
return SimpleBounds.unbounded(p0);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.analysis.MultivariateVectorFunction p0,org.apache.commons.math3.analysis.MultivariateMatrixFunction p1,double[] p2,double[] p3,org.apache.commons.math3.linear.RealMatrix p4,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p5,int p6,int p7){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p4,int p5,int p6){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p3,int p4,int p5){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p4,int p5,int p6,boolean p7,org.apache.commons.math3.fitting.leastsquares.ParameterValidator p8){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
public static org.apache.commons.math3.dfp.Dfp pow(org.apache.commons.math3.dfp.Dfp p0,int p1){
return DfpMath.pow(p0,p1);
}
public static double regularizedBeta(double p0,double p1,double p2,double p3,int p4){
return Beta.regularizedBeta(p0,p1,p2,p3,p4);
}
public static double regularizedBeta(double p0,double p1,double p2,int p3){
return Beta.regularizedBeta(p0,p1,p2,p3);
}
public static double logBeta(double p0,double p1,double p2,int p3){
return Beta.logBeta(p0,p1,p2,p3);
}
public static BesselJResult rjBesl(double p0,double p1,int p2){
return BesselJ.rjBesl(p0,p1,p2);
}
public static double regularizedGammaQ(double p0,double p1,double p2,int p3){
return Gamma.regularizedGammaQ(p0,p1,p2,p3);
}
public static double regularizedGammaP(double p0,double p1,double p2,int p3){
return Gamma.regularizedGammaP(p0,p1,p2,p3);
}
public static Range range(int p0,int p1){
return IntegerSequence.range(p0,p1);
}
public static Range range(int p0,int p1,int p2){
return IntegerSequence.range(p0,p1,p2);
}
public static int copySign(int p0,int p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return MathUtils.copySign(p0,p1);
}
public static int pow(int p0,long p1) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.pow(p0,p1);
}
public static java.math.BigInteger pow(java.math.BigInteger p0,int p1) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.pow(p0,p1);
}
public static long binomialCoefficient(int p0,int p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.binomialCoefficient(p0,p1);
}
public static double binomialCoefficientDouble(int p0,int p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.binomialCoefficientDouble(p0,p1);
}
public static double binomialCoefficientLog(int p0,int p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.binomialCoefficientLog(p0,p1);
}
public static int mulAndCheck(int p0,int p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.mulAndCheck(p0,p1);
}
public static int subAndCheck(int p0,int p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.subAndCheck(p0,p1);
}
public static int addAndCheck(int p0,int p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.addAndCheck(p0,p1);
}
public static double factorialLog(int p0) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.factorialLog(p0);
}
public static long stirlingS2(int p0,int p1) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.stirlingS2(p0,p1);
}
public static int lcm(int p0,int p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return ArithmeticUtils.lcm(p0,p1);
}
public static double factorialDouble(int p0) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.factorialDouble(p0);
}
public static java.util.Iterator<int[]> combinationsIterator(int p0,int p1){
return CombinatoricsUtils.combinationsIterator(p0,p1);
}
public static void checkBinomial(int p0,int p1) throws org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.NotPositiveException{
 CombinatoricsUtils.checkBinomial(p0,p1);
}
public static int[] copyOf(int[] p0,int p1){
return MathArrays.copyOf(p0,p1);
}
public static double[] copyOf(double[] p0,int p1){
return MathArrays.copyOf(p0,p1);
}
public static double[] copyOfRange(double[] p0,int p1,int p2){
return MathArrays.copyOfRange(p0,p1,p2);
}
public static void shuffle(int[] p0,int p1,Position p2,org.apache.commons.math3.random.RandomGenerator p3){
 MathArrays.shuffle(p0,p1,p2,p3);
}
public static void shuffle(int[] p0,int p1,Position p2){
 MathArrays.shuffle(p0,p1,p2);
}
public static int[] sequence(int p0,int p1,int p2){
return MathArrays.sequence(p0,p1,p2);
}
public static int[] natural(int p0){
return MathArrays.natural(p0);
}
public static int distanceInf(int[] p0,int[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
return MathArrays.distanceInf(p0,p1);
}
public static int distance1(int[] p0,int[] p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
return MathArrays.distance1(p0,p1);
}
public static <T> T[][] buildArray(org.apache.commons.math3.Field<T> p0,int p1,int p2){
return MathArrays.buildArray(p0,p1,p2);
}
public static <T> T[] buildArray(org.apache.commons.math3.Field<T> p0,int p1){
return MathArrays.buildArray(p0,p1);
}
public static boolean verifyValues(double[] p0,int p1,int p2,boolean p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return MathArrays.verifyValues(p0,p1,p2,p3);
}
public static boolean verifyValues(double[] p0,double[] p1,int p2,int p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return MathArrays.verifyValues(p0,p1,p2,p3);
}
public static boolean verifyValues(double[] p0,double[] p1,int p2,int p3,boolean p4) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return MathArrays.verifyValues(p0,p1,p2,p3,p4);
}
public static boolean verifyValues(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return MathArrays.verifyValues(p0,p1,p2);
}
public static int abs(int p0){
return FastMath.abs(p0);
}
public static double pow(double p0,int p1){
return FastMath.pow(p0,p1);
}
public static int min(int p0,int p1){
return FastMath.min(p0,p1);
}
public static int max(int p0,int p1){
return FastMath.max(p0,p1);
}
public static int addExact(int p0,int p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.addExact(p0,p1);
}
public static int decrementExact(int p0) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.decrementExact(p0);
}
public static int incrementExact(int p0) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.incrementExact(p0);
}
public static int multiplyExact(int p0,int p1){
return FastMath.multiplyExact(p0,p1);
}
public static int subtractExact(int p0,int p1){
return FastMath.subtractExact(p0,p1);
}
public static float scalb(float p0,int p1){
return FastMath.scalb(p0,p1);
}
public static double scalb(double p0,int p1){
return FastMath.scalb(p0,p1);
}
public static int getExponent(double p0){
return FastMath.getExponent(p0);
}
public static int getExponent(float p0){
return FastMath.getExponent(p0);
}
public static int floorDiv(int p0,int p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.floorDiv(p0,p1);
}
public static int floorMod(int p0,int p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.floorMod(p0,p1);
}
public static int round(float p0){
return FastMath.round(p0);
}
public static int toIntExact(long p0) throws org.apache.commons.math3.exception.MathArithmeticException{
return FastMath.toIntExact(p0);
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
public static float round(float p0,int p1){
return Precision.round(p0,p1);
}
public static float round(float p0,int p1,int p2) throws org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.exception.MathIllegalArgumentException{
return Precision.round(p0,p1,p2);
}
public static double round(double p0,int p1){
return Precision.round(p0,p1);
}
public static boolean equalsIncludingNaN(float p0,float p1,int p2){
return Precision.equalsIncludingNaN(p0,p1,p2);
}
public static boolean equalsIncludingNaN(double p0,double p1,int p2){
return Precision.equalsIncludingNaN(p0,p1,p2);
}
public static final java.util.List<java.lang.Double> identityPermutation(int p0){
return RandomKey.identityPermutation(p0);
}
public static final java.util.List<java.lang.Double> randomPermutation(int p0){
return RandomKey.randomPermutation(p0);
}
public static java.util.List<java.lang.Integer> randomBinaryRepresentation(int p0){
return BinaryChromosome.randomBinaryRepresentation(p0);
}
public static int exactLog2(int p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return TransformUtils.exactLog2(p0);
}
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getIndexedProperty(p0,p1,p2,p3);
}
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getIndexedProperty(p0,p1,p2);
}
public static int getDebug(){
return BeanUtils.getDebug();
}
public static void setDebug(int p0){
 BeanUtils.setDebug(p0);
}
public static void setIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2,java.lang.Object p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setIndexedProperty(p0,p1,p2,p3);
}
public static synchronized int clearCache(){
return MethodUtils.clearCache();
}
public static void setDefaultInteger(int p0){
 ConvertUtils.setDefaultInteger(p0);
}
public static int getDefaultInteger(){
return ConvertUtils.getDefaultInteger();
}
public static boolean isDelimiter(int p0,char[] p1){
return WordUtils.isDelimiter(p0,p1);
}
public static java.lang.String wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3,java.lang.String p4){
return WordUtils.wrap(p0,p1,p2,p3,p4);
}
public static java.lang.String abbreviate(java.lang.String p0,int p1,int p2,java.lang.String p3){
return WordUtils.abbreviate(p0,p1,p2,p3);
}
public static org.apache.commons.collections.primitives.IntList singletonIntList(int p0){
return IntCollections.singletonIntList(p0);
}
public static org.apache.commons.collections.primitives.IntIterator singletonIntIterator(int p0){
return IntCollections.singletonIntIterator(p0);
}
public static org.apache.commons.collections.primitives.IntListIterator singletonIntListIterator(int p0){
return IntCollections.singletonIntListIterator(p0);
}
public static void mergeSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
 Arrays.mergeSort(p0,p1,p2,p3);
}
public static void ensureFromTo(int p0,int p1,int p2){
 Arrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
 Arrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
 Arrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(int p0,int p1,int p2){
 Arrays.ensureOffsetLength(p0,p1,p2);
}
public static long index(int p0,int p1){
return BigArrays.index(p0,p1);
}
public static long start(int p0){
return BigArrays.start(p0);
}
public static int segment(long p0){
return BigArrays.segment(p0);
}
public static int displacement(long p0){
return BigArrays.displacement(p0);
}
public static int arraySize(int p0,float p1){
return HashCommon.arraySize(p0,p1);
}
public static int nextPowerOfTwo(int p0){
return HashCommon.nextPowerOfTwo(p0);
}
public static int invMix(int p0){
return HashCommon.invMix(p0);
}
public static int maxFill(int p0,float p1){
return HashCommon.maxFill(p0,p1);
}
public static int double2int(double p0){
return HashCommon.double2int(p0);
}
public static int mix(int p0){
return HashCommon.mix(p0);
}
public static int murmurHash3(int p0){
return HashCommon.murmurHash3(p0);
}
public static int float2int(float p0){
return HashCommon.float2int(p0);
}
public static int long2int(long p0){
return HashCommon.long2int(p0);
}
public static byte safeIntToByte(int p0){
return SafeMath.safeIntToByte(p0);
}
public static short safeIntToShort(int p0){
return SafeMath.safeIntToShort(p0);
}
public static int safeLongToInt(long p0){
return SafeMath.safeLongToInt(p0);
}
public static char safeIntToChar(int p0){
return SafeMath.safeIntToChar(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanArrayList wrap(boolean[] p0,int p1){
return BooleanArrayList.wrap(p0,p1);
}
public static boolean[] trim(boolean[] p0,int p1){
return BooleanArrays.trim(p0,p1);
}
public static boolean[] copy(boolean[] p0,int p1,int p2){
return BooleanArrays.copy(p0,p1,p2);
}
public static void fill(boolean[] p0,int p1,int p2,boolean p3){
 BooleanArrays.fill(p0,p1,p2,p3);
}
public static boolean[] ensureCapacity(boolean[] p0,int p1){
return BooleanArrays.ensureCapacity(p0,p1);
}
public static boolean[] setLength(boolean[] p0,int p1){
return BooleanArrays.setLength(p0,p1);
}
public static boolean[] grow(boolean[] p0,int p1){
return BooleanArrays.grow(p0,p1);
}
public static boolean[] grow(boolean[] p0,int p1,int p2){
return BooleanArrays.grow(p0,p1,p2);
}
public static boolean[] shuffle(boolean[] p0,int p1,int p2,java.util.Random p3){
return BooleanArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(boolean[] p0,int p1,int p2,int p3){
 BooleanArrays.swap(p0,p1,p2,p3);
}
public static void swap(boolean[] p0,int p1,int p2){
 BooleanArrays.swap(p0,p1,p2);
}
public static void mergeSort(boolean[] p0,int p1,int p2){
 BooleanArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3,boolean[] p4){
 BooleanArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(boolean[] p0,int p1,int p2,boolean[] p3){
 BooleanArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanArrays.mergeSort(p0,p1,p2,p3);
}
public static void ensureFromTo(boolean[] p0,int p1,int p2){
 BooleanArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(boolean[] p0,int p1,int p2){
 BooleanArrays.quickSort(p0,p1,p2);
}
public static void quickSort(boolean[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(boolean[] p0,int p1,int p2){
 BooleanArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(boolean[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(boolean[] p0,int p1,int p2){
 BooleanArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.stabilize(p0,p1,p2,p3);
}
public static void copyFromBig(boolean[][] p0,long p1,boolean[] p2,int p3,int p4){
 BooleanBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(boolean[] p0,int p1,boolean[][] p2,long p3,long p4){
 BooleanBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static int indexOf(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
return BooleanIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[] p0,int p1,int p2){
return BooleanIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.booleans.BooleanListIterator wrap(boolean[] p0,int p1,int p2){
return BooleanIterators.wrap(p0,p1,p2);
}
public static boolean[] unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
return BooleanIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[] p1){
return BooleanIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[] p1,int p2,int p3){
return BooleanIterators.unwrap(p0,p1,p2,p3);
}
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2){
return BooleanIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2){
return BooleanIterators.pour(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
return BooleanIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1){
return BooleanIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction singleton(byte p0,int p1){
return Byte2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap singleton(byte p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.ByteArrayList wrap(byte[] p0,int p1){
return ByteArrayList.wrap(p0,p1);
}
public static byte[] trim(byte[] p0,int p1){
return ByteArrays.trim(p0,p1);
}
public static byte[] copy(byte[] p0,int p1,int p2){
return ByteArrays.copy(p0,p1,p2);
}
public static void fill(byte[] p0,int p1,int p2,byte p3){
 ByteArrays.fill(p0,p1,p2,p3);
}
public static byte[] ensureCapacity(byte[] p0,int p1){
return ByteArrays.ensureCapacity(p0,p1);
}
public static byte[] setLength(byte[] p0,int p1){
return ByteArrays.setLength(p0,p1);
}
public static byte[] grow(byte[] p0,int p1){
return ByteArrays.grow(p0,p1);
}
public static byte[] grow(byte[] p0,int p1,int p2){
return ByteArrays.grow(p0,p1,p2);
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
public static byte[] shuffle(byte[] p0,int p1,int p2,java.util.Random p3){
return ByteArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(byte[] p0,int p1,int p2){
 ByteArrays.swap(p0,p1,p2);
}
public static void swap(byte[] p0,int p1,int p2,int p3){
 ByteArrays.swap(p0,p1,p2,p3);
}
public static void mergeSort(byte[] p0,int p1,int p2){
 ByteArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(byte[] p0,int p1,int p2,byte[] p3){
 ByteArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3,byte[] p4){
 ByteArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteArrays.mergeSort(p0,p1,p2,p3);
}
public static void ensureFromTo(byte[] p0,int p1,int p2){
 ByteArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(byte[] p0,byte[] p1,int p2,int p3){
 ByteArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(byte[] p0,int p1,int p2){
 ByteArrays.quickSort(p0,p1,p2);
}
public static void quickSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(byte[] p0,byte[] p1,int p2,int p3){
 ByteArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(byte[] p0,int p1,int p2){
 ByteArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(byte[] p0,int p1,int p2){
 ByteArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,byte[] p1,int p2,int p3){
 ByteArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,byte[] p1,int p2,int p3){
 ByteArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void parallelRadixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4){
 ByteArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(byte[] p0,byte[] p1,int p2,int p3){
 ByteArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(byte[] p0,int p1,int p2){
 ByteArrays.parallelRadixSort(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,byte[] p1,byte[] p2,int p3,int p4,boolean p5){
 ByteArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4){
 ByteArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,byte[] p1,int p2,int p3){
 ByteArrays.stabilize(p0,p1,p2,p3);
}
public static void radixSort(byte[] p0,int p1,int p2){
 ByteArrays.radixSort(p0,p1,p2);
}
public static void radixSort(byte[] p0,byte[] p1,int p2,int p3){
 ByteArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(byte[][] p0,int p1,int p2){
 ByteArrays.radixSort(p0,p1,p2);
}
public static void copyFromBig(byte[][] p0,long p1,byte[] p2,int p3,int p4){
 ByteBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(byte[] p0,int p1,byte[][] p2,long p3,long p4){
 ByteBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void makeHeap(byte[] p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
 ByteHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
return ByteHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
return ByteHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(byte[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5){
 ByteIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(byte[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
 ByteIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(byte[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5){
return ByteIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(byte[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5){
return ByteIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
return ByteIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator[] p0,int p1,int p2){
return ByteIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.ByteListIterator wrap(byte[] p0,int p1,int p2){
return ByteIterators.wrap(p0,p1,p2);
}
public static byte[] unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1){
return ByteIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[] p1){
return ByteIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[] p1,int p2,int p3){
return ByteIterators.unwrap(p0,p1,p2,p3);
}
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
return ByteIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
return ByteIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
return ByteIterators.pour(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1){
return ByteIterators.pour(p0,p1);
}
public static int front(byte[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static int front(byte[] p0,int[] p1,int p2,int[] p3){
return ByteSemiIndirectHeaps.front(p0,p1,p2,p3);
}
public static int[] makeHeap(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
return ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(byte[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(byte[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
 ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(byte[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(byte[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
return ByteSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.chars.Char2IntFunction singleton(char p0,int p1){
return Char2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(char p0,int p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.CharArrayList wrap(char[] p0,int p1){
return CharArrayList.wrap(p0,p1);
}
public static char[] trim(char[] p0,int p1){
return CharArrays.trim(p0,p1);
}
public static char[] copy(char[] p0,int p1,int p2){
return CharArrays.copy(p0,p1,p2);
}
public static void fill(char[] p0,int p1,int p2,char p3){
 CharArrays.fill(p0,p1,p2,p3);
}
public static char[] ensureCapacity(char[] p0,int p1){
return CharArrays.ensureCapacity(p0,p1);
}
public static char[] setLength(char[] p0,int p1){
return CharArrays.setLength(p0,p1);
}
public static char[] grow(char[] p0,int p1){
return CharArrays.grow(p0,p1);
}
public static char[] grow(char[] p0,int p1,int p2){
return CharArrays.grow(p0,p1,p2);
}
public static int binarySearch(char[] p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return CharArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(char[] p0,int p1,int p2,char p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static int binarySearch(char[] p0,char p1){
return CharArrays.binarySearch(p0,p1);
}
public static int binarySearch(char[] p0,int p1,int p2,char p3){
return CharArrays.binarySearch(p0,p1,p2,p3);
}
public static char[] shuffle(char[] p0,int p1,int p2,java.util.Random p3){
return CharArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(char[] p0,int p1,int p2){
 CharArrays.swap(p0,p1,p2);
}
public static void swap(char[] p0,int p1,int p2,int p3){
 CharArrays.swap(p0,p1,p2,p3);
}
public static void mergeSort(char[] p0,int p1,int p2){
 CharArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(char[] p0,int p1,int p2,char[] p3){
 CharArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3,char[] p4){
 CharArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharArrays.mergeSort(p0,p1,p2,p3);
}
public static void ensureFromTo(char[] p0,int p1,int p2){
 CharArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(char[] p0,int p1,int p2){
 CharArrays.quickSort(p0,p1,p2);
}
public static void quickSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(char[] p0,int p1,int p2){
 CharArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(char[] p0,int p1,int p2){
 CharArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,char[] p1,int p2,int p3){
 CharArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,char[] p1,int p2,int p3){
 CharArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void parallelRadixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
 CharArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(char[] p0,int p1,int p2){
 CharArrays.parallelRadixSort(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,int p3,int p4,boolean p5){
 CharArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
 CharArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,char[] p1,int p2,int p3){
 CharArrays.stabilize(p0,p1,p2,p3);
}
public static void radixSort(char[] p0,int p1,int p2){
 CharArrays.radixSort(p0,p1,p2);
}
public static void radixSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(char[][] p0,int p1,int p2){
 CharArrays.radixSort(p0,p1,p2);
}
public static void copyFromBig(char[][] p0,long p1,char[] p2,int p3,int p4){
 CharBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(char[] p0,int p1,char[][] p2,long p3,long p4){
 CharBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void makeHeap(char[] p0,int p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
 CharHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
return CharHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
return CharHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(char[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.chars.CharComparator p5){
 CharIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(char[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
 CharIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(char[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.chars.CharComparator p5){
return CharIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(char[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.chars.CharComparator p5){
return CharIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int indexOf(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
return CharIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharIterator concat(it.unimi.dsi.fastutil.chars.CharIterator[] p0,int p1,int p2){
return CharIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.CharListIterator wrap(char[] p0,int p1,int p2){
return CharIterators.wrap(p0,p1,p2);
}
public static char[] unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
return CharIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[] p1){
return CharIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[] p1,int p2,int p3){
return CharIterators.unwrap(p0,p1,p2,p3);
}
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
return CharIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
return CharIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
return CharIterators.pour(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
return CharIterators.pour(p0,p1);
}
public static int front(char[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static int front(char[] p0,int[] p1,int p2,int[] p3){
return CharSemiIndirectHeaps.front(p0,p1,p2,p3);
}
public static int[] makeHeap(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
return CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(char[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(char[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
 CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(char[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(char[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction singleton(double p0,int p1){
return Double2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap singleton(double p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.DoubleArrayList wrap(double[] p0,int p1){
return DoubleArrayList.wrap(p0,p1);
}
public static double[] trim(double[] p0,int p1){
return DoubleArrays.trim(p0,p1);
}
public static double[] copy(double[] p0,int p1,int p2){
return DoubleArrays.copy(p0,p1,p2);
}
public static void fill(double[] p0,int p1,int p2,double p3){
 DoubleArrays.fill(p0,p1,p2,p3);
}
public static double[] ensureCapacity(double[] p0,int p1){
return DoubleArrays.ensureCapacity(p0,p1);
}
public static double[] setLength(double[] p0,int p1){
return DoubleArrays.setLength(p0,p1);
}
public static double[] grow(double[] p0,int p1){
return DoubleArrays.grow(p0,p1);
}
public static double[] grow(double[] p0,int p1,int p2){
return DoubleArrays.grow(p0,p1,p2);
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
public static double[] shuffle(double[] p0,int p1,int p2,java.util.Random p3){
return DoubleArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(double[] p0,int p1,int p2,int p3){
 DoubleArrays.swap(p0,p1,p2,p3);
}
public static void swap(double[] p0,int p1,int p2){
 DoubleArrays.swap(p0,p1,p2);
}
public static void mergeSort(double[] p0,int p1,int p2,double[] p3){
 DoubleArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3,double[] p4){
 DoubleArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(double[] p0,int p1,int p2){
 DoubleArrays.mergeSort(p0,p1,p2);
}
public static void ensureFromTo(double[] p0,int p1,int p2){
 DoubleArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(double[] p0,int p1,int p2){
 DoubleArrays.quickSort(p0,p1,p2);
}
public static void quickSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(double[] p0,double[] p1,int p2,int p3){
 DoubleArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(double[] p0,double[] p1,int p2,int p3){
 DoubleArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(double[] p0,int p1,int p2){
 DoubleArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(double[] p0,int p1,int p2){
 DoubleArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,double[] p1,int p2,int p3){
 DoubleArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,double[] p1,int p2,int p3){
 DoubleArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void parallelRadixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4){
 DoubleArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(double[] p0,double[] p1,int p2,int p3){
 DoubleArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(double[] p0,int p1,int p2){
 DoubleArrays.parallelRadixSort(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,double[] p1,double[] p2,int p3,int p4,boolean p5){
 DoubleArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4){
 DoubleArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,double[] p1,int p2,int p3){
 DoubleArrays.stabilize(p0,p1,p2,p3);
}
public static void radixSort(double[] p0,int p1,int p2){
 DoubleArrays.radixSort(p0,p1,p2);
}
public static void radixSort(double[] p0,double[] p1,int p2,int p3){
 DoubleArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(double[][] p0,int p1,int p2){
 DoubleArrays.radixSort(p0,p1,p2);
}
public static void copyFromBig(double[][] p0,long p1,double[] p2,int p3,int p4){
 DoubleBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(double[] p0,int p1,double[][] p2,long p3,long p4){
 DoubleBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void makeHeap(double[] p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
 DoubleHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
return DoubleHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
return DoubleHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(double[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5){
 DoubleIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(double[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
 DoubleIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(double[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5){
return DoubleIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(double[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5){
return DoubleIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int indexOf(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
return DoubleIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[] p0,int p1,int p2){
return DoubleIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator wrap(double[] p0,int p1,int p2){
return DoubleIterators.wrap(p0,p1,p2);
}
public static double[] unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1){
return DoubleIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[] p1){
return DoubleIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[] p1,int p2,int p3){
return DoubleIterators.unwrap(p0,p1,p2,p3);
}
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
return DoubleIterators.unwrap(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1){
return DoubleIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
return DoubleIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
return DoubleIterators.pour(p0,p1,p2);
}
public static int front(double[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static int front(double[] p0,int[] p1,int p2,int[] p3){
return DoubleSemiIndirectHeaps.front(p0,p1,p2,p3);
}
public static int[] makeHeap(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
return DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(double[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(double[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
 DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(double[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(double[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
return DoubleSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.floats.Float2IntFunction singleton(float p0,int p1){
return Float2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(float p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.FloatArrayList wrap(float[] p0,int p1){
return FloatArrayList.wrap(p0,p1);
}
public static float[] trim(float[] p0,int p1){
return FloatArrays.trim(p0,p1);
}
public static float[] copy(float[] p0,int p1,int p2){
return FloatArrays.copy(p0,p1,p2);
}
public static void fill(float[] p0,int p1,int p2,float p3){
 FloatArrays.fill(p0,p1,p2,p3);
}
public static float[] ensureCapacity(float[] p0,int p1){
return FloatArrays.ensureCapacity(p0,p1);
}
public static float[] setLength(float[] p0,int p1){
return FloatArrays.setLength(p0,p1);
}
public static float[] grow(float[] p0,int p1){
return FloatArrays.grow(p0,p1);
}
public static float[] grow(float[] p0,int p1,int p2){
return FloatArrays.grow(p0,p1,p2);
}
public static int binarySearch(float[] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return FloatArrays.binarySearch(p0,p1,p2);
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
public static float[] shuffle(float[] p0,int p1,int p2,java.util.Random p3){
return FloatArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(float[] p0,int p1,int p2,int p3){
 FloatArrays.swap(p0,p1,p2,p3);
}
public static void swap(float[] p0,int p1,int p2){
 FloatArrays.swap(p0,p1,p2);
}
public static void mergeSort(float[] p0,int p1,int p2,float[] p3){
 FloatArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3,float[] p4){
 FloatArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(float[] p0,int p1,int p2){
 FloatArrays.mergeSort(p0,p1,p2);
}
public static void ensureFromTo(float[] p0,int p1,int p2){
 FloatArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(float[] p0,int p1,int p2){
 FloatArrays.quickSort(p0,p1,p2);
}
public static void quickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(float[] p0,int p1,int p2){
 FloatArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(float[] p0,int p1,int p2){
 FloatArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,float[] p1,int p2,int p3){
 FloatArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,float[] p1,int p2,int p3){
 FloatArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void parallelRadixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
 FloatArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(float[] p0,int p1,int p2){
 FloatArrays.parallelRadixSort(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,int p3,int p4,boolean p5){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,float[] p1,int p2,int p3){
 FloatArrays.stabilize(p0,p1,p2,p3);
}
public static void radixSort(float[] p0,int p1,int p2){
 FloatArrays.radixSort(p0,p1,p2);
}
public static void radixSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(float[][] p0,int p1,int p2){
 FloatArrays.radixSort(p0,p1,p2);
}
public static void copyFromBig(float[][] p0,long p1,float[] p2,int p3,int p4){
 FloatBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(float[] p0,int p1,float[][] p2,long p3,long p4){
 FloatBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void makeHeap(float[] p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
 FloatHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
return FloatHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
return FloatHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
 FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(float[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
 FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
return FloatIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
return FloatIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int indexOf(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
return FloatIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator concat(it.unimi.dsi.fastutil.floats.FloatIterator[] p0,int p1,int p2){
return FloatIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.FloatListIterator wrap(float[] p0,int p1,int p2){
return FloatIterators.wrap(p0,p1,p2);
}
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1,int p2,int p3){
return FloatIterators.unwrap(p0,p1,p2,p3);
}
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1){
return FloatIterators.unwrap(p0,p1);
}
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
return FloatIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
return FloatIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
return FloatIterators.pour(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
return FloatIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
return FloatIterators.pour(p0,p1);
}
public static int front(float[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static int front(float[] p0,int[] p1,int p2,int[] p3){
return FloatSemiIndirectHeaps.front(p0,p1,p2,p3);
}
public static int[] makeHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
return FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(float[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
 FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction singleton(int p0,boolean p1){
return Int2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(int p0,boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction singleton(int p0,byte p1){
return Int2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap singleton(int p0,byte p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2CharFunction singleton(int p0,char p1){
return Int2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(int p0,char p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction singleton(int p0,double p1){
return Int2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap singleton(int p0,double p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction singleton(int p0,float p1){
return Int2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(int p0,float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2IntFunction singleton(int p0,int p1){
return Int2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap singleton(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2LongFunction singleton(int p0,long p1){
return Int2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(int p0,long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> singleton(int p0,V p1){
return Int2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> singleton(int p0,V p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction singleton(int p0,short p1){
return Int2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap singleton(int p0,short p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.IntArrayList wrap(int[] p0,int p1){
return IntArrayList.wrap(p0,p1);
}
public static int[] trim(int[] p0,int p1){
return IntArrays.trim(p0,p1);
}
public static int[] copy(int[] p0,int p1,int p2){
return IntArrays.copy(p0,p1,p2);
}
public static void fill(int[] p0,int p1,int p2,int p3){
 IntArrays.fill(p0,p1,p2,p3);
}
public static void fill(int[] p0,int p1){
 IntArrays.fill(p0,p1);
}
public static int[] ensureCapacity(int[] p0,int p1){
return IntArrays.ensureCapacity(p0,p1);
}
public static int[] setLength(int[] p0,int p1){
return IntArrays.setLength(p0,p1);
}
public static int[] grow(int[] p0,int p1){
return IntArrays.grow(p0,p1);
}
public static int[] grow(int[] p0,int p1,int p2){
return IntArrays.grow(p0,p1,p2);
}
public static int binarySearch(int[] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return IntArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(int[] p0,int p1,int p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static int binarySearch(int[] p0,int p1){
return IntArrays.binarySearch(p0,p1);
}
public static int binarySearch(int[] p0,int p1,int p2,int p3){
return IntArrays.binarySearch(p0,p1,p2,p3);
}
public static int[] shuffle(int[] p0,int p1,int p2,java.util.Random p3){
return IntArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(int[] p0,int p1,int p2){
 IntArrays.swap(p0,p1,p2);
}
public static void swap(int[] p0,int p1,int p2,int p3){
 IntArrays.swap(p0,p1,p2,p3);
}
public static void mergeSort(int[] p0,int p1,int p2){
 IntArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(int[] p0,int p1,int p2,int[] p3){
 IntArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3,int[] p4){
 IntArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntArrays.mergeSort(p0,p1,p2,p3);
}
public static void ensureFromTo(int[] p0,int p1,int p2){
 IntArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(int[] p0,int[] p1,int p2,int p3){
 IntArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(int[] p0,int p1,int p2){
 IntArrays.quickSort(p0,p1,p2);
}
public static void quickSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(int[] p0,int[] p1,int p2,int p3){
 IntArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(int[] p0,int p1,int p2){
 IntArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(int[] p0,int p1,int p2){
 IntArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,int[] p1,int p2,int p3){
 IntArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,int[] p1,int p2,int p3){
 IntArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void parallelRadixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4){
 IntArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(int[] p0,int[] p1,int p2,int p3){
 IntArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(int[] p0,int p1,int p2){
 IntArrays.parallelRadixSort(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,int[] p1,int[] p2,int p3,int p4,boolean p5){
 IntArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4){
 IntArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,int[] p1,int p2,int p3){
 IntArrays.stabilize(p0,p1,p2,p3);
}
public static void radixSort(int[] p0,int p1,int p2){
 IntArrays.radixSort(p0,p1,p2);
}
public static void radixSort(int[] p0,int[] p1,int p2,int p3){
 IntArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(int[][] p0,int p1,int p2){
 IntArrays.radixSort(p0,p1,p2);
}
public static void add(int[][] p0,long p1,int p2){
 IntBigArrays.add(p0,p1,p2);
}
public static void set(int[][] p0,long p1,int p2){
 IntBigArrays.set(p0,p1,p2);
}
public static void fill(int[][] p0,int p1){
 IntBigArrays.fill(p0,p1);
}
public static void fill(int[][] p0,long p1,long p2,int p3){
 IntBigArrays.fill(p0,p1,p2,p3);
}
public static long binarySearch(int[][] p0,long p1,long p2,int p3){
return IntBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(int[][] p0,long p1,long p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(int[][] p0,int p1){
return IntBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(int[][] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return IntBigArrays.binarySearch(p0,p1,p2);
}
public static void mul(int[][] p0,long p1,int p2){
 IntBigArrays.mul(p0,p1,p2);
}
public static void copyFromBig(int[][] p0,long p1,int[] p2,int p3,int p4){
 IntBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(int[] p0,int p1,int[][] p2,long p3,long p4){
 IntBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.ints.IntBigListIterator singleton(int p0){
return IntBigListIterators.singleton(p0);
}
public static void makeHeap(int[] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
 IntHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
return IntHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
return IntHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(int[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.ints.IntComparator p5){
 IntIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(int[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
 IntIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(int[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.ints.IntComparator p5){
return IntIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(int[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.ints.IntComparator p5){
return IntIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int indexOf(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
return IntIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntIterator concat(it.unimi.dsi.fastutil.ints.IntIterator[] p0,int p1,int p2){
return IntIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.IntListIterator wrap(int[] p0,int p1,int p2){
return IntIterators.wrap(p0,p1,p2);
}
public static int[] unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1){
return IntIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[] p1){
return IntIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[] p1,int p2,int p3){
return IntIterators.unwrap(p0,p1,p2,p3);
}
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
return IntIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
return IntIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
return IntIterators.pour(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1){
return IntIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntListIterator fromTo(int p0,int p1){
return IntIterators.fromTo(p0,p1);
}
public static int front(int[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static int front(int[] p0,int[] p1,int p2,int[] p3){
return IntSemiIndirectHeaps.front(p0,p1,p2,p3);
}
public static int[] makeHeap(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
return IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(int[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(int[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
 IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(int[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(int[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
return IntSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(int p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
return IntSortedSets.singleton(p0,p1);
}
public static int loadBytes(java.io.File p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static int loadBytes(java.lang.CharSequence p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static int loadBytes(java.io.File p0,byte[] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static int loadBytes(java.lang.CharSequence p0,byte[] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static int loadBytes(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static int loadBytes(java.io.InputStream p0,byte[] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static int loadBytes(java.io.DataInput p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static int loadBytes(java.io.DataInput p0,byte[] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static void storeShorts(short[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static int loadChars(java.io.File p0,char[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static int loadChars(java.io.DataInput p0,char[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static int loadChars(java.io.DataInput p0,char[] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static int loadChars(java.lang.CharSequence p0,char[] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static int loadChars(java.io.File p0,char[] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static int loadChars(java.lang.CharSequence p0,char[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static int loadShorts(java.io.File p0,short[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static int loadShorts(java.lang.CharSequence p0,short[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static int loadShorts(java.io.File p0,short[] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static int loadShorts(java.lang.CharSequence p0,short[] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static int loadShorts(java.io.DataInput p0,short[] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static int loadShorts(java.io.DataInput p0,short[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static int loadFloats(java.lang.CharSequence p0,float[] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static int loadFloats(java.io.DataInput p0,float[] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static int loadFloats(java.io.File p0,float[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static int loadFloats(java.io.File p0,float[] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static int loadFloats(java.io.DataInput p0,float[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static int loadFloats(java.lang.CharSequence p0,float[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.DataInput p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.lang.CharSequence p0,boolean[] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static int loadBooleans(java.io.File p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.lang.CharSequence p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.File p0,boolean[] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static int loadBooleans(java.io.DataInput p0,boolean[] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.OutputStream p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static int loadInts(java.lang.CharSequence p0,int[] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static int loadInts(java.io.DataInput p0,int[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static int loadInts(java.lang.CharSequence p0,int[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static int loadInts(java.io.File p0,int[] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static int loadInts(java.io.DataInput p0,int[] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static int loadInts(java.io.File p0,int[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static void storeLongs(long[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeInts(int[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static int loadDoubles(java.io.File p0,double[] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static int loadDoubles(java.lang.CharSequence p0,double[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static int loadDoubles(java.io.File p0,double[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static int loadDoubles(java.io.DataInput p0,double[] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static int loadDoubles(java.io.DataInput p0,double[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static int loadDoubles(java.lang.CharSequence p0,double[] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static void storeChars(char[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static int loadLongs(java.lang.CharSequence p0,long[] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static int loadLongs(java.io.File p0,long[] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static int loadLongs(java.io.DataInput p0,long[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static int loadLongs(java.io.DataInput p0,long[] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static int loadLongs(java.io.File p0,long[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static int loadLongs(java.lang.CharSequence p0,long[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static int loadBytes(java.io.BufferedReader p0,byte[] p1) throws java.io.IOException{
return TextIO.loadBytes(p0,p1);
}
public static int loadBytes(java.io.BufferedReader p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadBytes(p0,p1,p2,p3);
}
public static void storeShorts(short[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeShorts(p0,p1,p2,p3);
}
public static int loadShorts(java.io.BufferedReader p0,short[] p1) throws java.io.IOException{
return TextIO.loadShorts(p0,p1);
}
public static int loadShorts(java.io.BufferedReader p0,short[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadShorts(p0,p1,p2,p3);
}
public static int loadFloats(java.io.BufferedReader p0,float[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadFloats(p0,p1,p2,p3);
}
public static int loadFloats(java.io.BufferedReader p0,float[] p1) throws java.io.IOException{
return TextIO.loadFloats(p0,p1);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.BufferedReader p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.BufferedReader p0,boolean[] p1) throws java.io.IOException{
return TextIO.loadBooleans(p0,p1);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeBytes(p0,p1,p2,p3);
}
public static int loadInts(java.io.BufferedReader p0,int[] p1) throws java.io.IOException{
return TextIO.loadInts(p0,p1);
}
public static int loadInts(java.io.BufferedReader p0,int[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadInts(p0,p1,p2,p3);
}
public static void storeLongs(long[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeLongs(p0,p1,p2,p3);
}
public static void storeInts(int[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeInts(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeFloats(p0,p1,p2,p3);
}
public static int loadDoubles(java.io.BufferedReader p0,double[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadDoubles(p0,p1,p2,p3);
}
public static int loadDoubles(java.io.BufferedReader p0,double[] p1) throws java.io.IOException{
return TextIO.loadDoubles(p0,p1);
}
public static int loadLongs(java.io.BufferedReader p0,long[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadLongs(p0,p1,p2,p3);
}
public static int loadLongs(java.io.BufferedReader p0,long[] p1) throws java.io.IOException{
return TextIO.loadLongs(p0,p1);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeDoubles(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.longs.Long2IntFunction singleton(long p0,int p1){
return Long2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap singleton(long p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.LongArrayList wrap(long[] p0,int p1){
return LongArrayList.wrap(p0,p1);
}
public static long[] trim(long[] p0,int p1){
return LongArrays.trim(p0,p1);
}
public static long[] copy(long[] p0,int p1,int p2){
return LongArrays.copy(p0,p1,p2);
}
public static void fill(long[] p0,int p1,int p2,long p3){
 LongArrays.fill(p0,p1,p2,p3);
}
public static long[] ensureCapacity(long[] p0,int p1){
return LongArrays.ensureCapacity(p0,p1);
}
public static long[] setLength(long[] p0,int p1){
return LongArrays.setLength(p0,p1);
}
public static long[] grow(long[] p0,int p1){
return LongArrays.grow(p0,p1);
}
public static long[] grow(long[] p0,int p1,int p2){
return LongArrays.grow(p0,p1,p2);
}
public static int binarySearch(long[] p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return LongArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(long[] p0,int p1,int p2,long p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static int binarySearch(long[] p0,long p1){
return LongArrays.binarySearch(p0,p1);
}
public static int binarySearch(long[] p0,int p1,int p2,long p3){
return LongArrays.binarySearch(p0,p1,p2,p3);
}
public static long[] shuffle(long[] p0,int p1,int p2,java.util.Random p3){
return LongArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(long[] p0,int p1,int p2){
 LongArrays.swap(p0,p1,p2);
}
public static void swap(long[] p0,int p1,int p2,int p3){
 LongArrays.swap(p0,p1,p2,p3);
}
public static void mergeSort(long[] p0,int p1,int p2){
 LongArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(long[] p0,int p1,int p2,long[] p3){
 LongArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3,long[] p4){
 LongArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongArrays.mergeSort(p0,p1,p2,p3);
}
public static void ensureFromTo(long[] p0,int p1,int p2){
 LongArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(long[] p0,long[] p1,int p2,int p3){
 LongArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(long[] p0,int p1,int p2){
 LongArrays.quickSort(p0,p1,p2);
}
public static void quickSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(long[] p0,long[] p1,int p2,int p3){
 LongArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(long[] p0,int p1,int p2){
 LongArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(long[] p0,int p1,int p2){
 LongArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,long[] p1,int p2,int p3){
 LongArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,long[] p1,int p2,int p3){
 LongArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void parallelRadixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4){
 LongArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(long[] p0,long[] p1,int p2,int p3){
 LongArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(long[] p0,int p1,int p2){
 LongArrays.parallelRadixSort(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,long[] p1,long[] p2,int p3,int p4,boolean p5){
 LongArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4){
 LongArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,long[] p1,int p2,int p3){
 LongArrays.stabilize(p0,p1,p2,p3);
}
public static void radixSort(long[] p0,int p1,int p2){
 LongArrays.radixSort(p0,p1,p2);
}
public static void radixSort(long[] p0,long[] p1,int p2,int p3){
 LongArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(long[][] p0,int p1,int p2){
 LongArrays.radixSort(p0,p1,p2);
}
public static void copyFromBig(long[][] p0,long p1,long[] p2,int p3,int p4){
 LongBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(long[] p0,int p1,long[][] p2,long p3,long p4){
 LongBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void makeHeap(long[] p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
 LongHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
return LongHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
return LongHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(long[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.longs.LongComparator p5){
 LongIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(long[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
 LongIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(long[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.longs.LongComparator p5){
return LongIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(long[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.longs.LongComparator p5){
return LongIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int indexOf(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
return LongIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator[] p0,int p1,int p2){
return LongIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.LongListIterator wrap(long[] p0,int p1,int p2){
return LongIterators.wrap(p0,p1,p2);
}
public static long[] unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1){
return LongIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[] p1){
return LongIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[] p1,int p2,int p3){
return LongIterators.unwrap(p0,p1,p2,p3);
}
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
return LongIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
return LongIterators.pour(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
return LongIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1){
return LongIterators.pour(p0,p1);
}
public static int front(long[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static int front(long[] p0,int[] p1,int p2,int[] p3){
return LongSemiIndirectHeaps.front(p0,p1,p2,p3);
}
public static int[] makeHeap(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
return LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(long[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(long[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
 LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(long[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(long[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
return LongSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> singleton(K p0,int p1){
return Object2IntFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> singleton(K p0,int p1,java.util.Comparator<? super K> p2){
return Object2IntSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectArrayList<K> wrap(K[] p0,int p1){
return ObjectArrayList.wrap(p0,p1);
}
public static <K> K[] trim(K[] p0,int p1){
return ObjectArrays.trim(p0,p1);
}
public static <K> K[] copy(K[] p0,int p1,int p2){
return ObjectArrays.copy(p0,p1,p2);
}
public static <K> void fill(K[] p0,int p1,int p2,K p3){
 ObjectArrays.fill(p0,p1,p2,p3);
}
public static <K> K[] ensureCapacity(K[] p0,int p1,int p2){
return ObjectArrays.ensureCapacity(p0,p1,p2);
}
public static <K> K[] ensureCapacity(K[] p0,int p1){
return ObjectArrays.ensureCapacity(p0,p1);
}
public static <K> K[] reverse(K[] p0,int p1,int p2){
return ObjectArrays.reverse(p0,p1,p2);
}
public static <K> K[] setLength(K[] p0,int p1){
return ObjectArrays.setLength(p0,p1);
}
public static <K> K[] grow(K[] p0,int p1,int p2){
return ObjectArrays.grow(p0,p1,p2);
}
public static <K> K[] grow(K[] p0,int p1){
return ObjectArrays.grow(p0,p1);
}
public static <K> int binarySearch(K[] p0,K p1,java.util.Comparator<K> p2){
return ObjectArrays.binarySearch(p0,p1,p2);
}
public static <K> int binarySearch(K[] p0,K p1){
return ObjectArrays.binarySearch(p0,p1);
}
public static <K> int binarySearch(K[] p0,int p1,int p2,K p3){
return ObjectArrays.binarySearch(p0,p1,p2,p3);
}
public static <K> int binarySearch(K[] p0,int p1,int p2,K p3,java.util.Comparator<K> p4){
return ObjectArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static <K> K[] shuffle(K[] p0,int p1,int p2,java.util.Random p3){
return ObjectArrays.shuffle(p0,p1,p2,p3);
}
public static <K> void swap(K[] p0,int p1,int p2,int p3){
 ObjectArrays.swap(p0,p1,p2,p3);
}
public static <K> void swap(K[] p0,int p1,int p2){
 ObjectArrays.swap(p0,p1,p2);
}
public static <K> void mergeSort(K[] p0,int p1,int p2,java.util.Comparator<K> p3,K[] p4){
 ObjectArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static <K> void mergeSort(K[] p0,int p1,int p2,java.util.Comparator<K> p3){
 ObjectArrays.mergeSort(p0,p1,p2,p3);
}
public static <K> void mergeSort(K[] p0,int p1,int p2,K[] p3){
 ObjectArrays.mergeSort(p0,p1,p2,p3);
}
public static <K> void mergeSort(K[] p0,int p1,int p2){
 ObjectArrays.mergeSort(p0,p1,p2);
}
public static <K> void ensureFromTo(K[] p0,int p1,int p2){
 ObjectArrays.ensureFromTo(p0,p1,p2);
}
public static <K> void quickSort(K[] p0,int p1,int p2){
 ObjectArrays.quickSort(p0,p1,p2);
}
public static <K> void quickSort(K[] p0,K[] p1,int p2,int p3){
 ObjectArrays.quickSort(p0,p1,p2,p3);
}
public static <K> void quickSort(K[] p0,int p1,int p2,java.util.Comparator<K> p3){
 ObjectArrays.quickSort(p0,p1,p2,p3);
}
public static <K> void parallelQuickSort(K[] p0,int p1,int p2,java.util.Comparator<K> p3){
 ObjectArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static <K> void parallelQuickSort(K[] p0,K[] p1,int p2,int p3){
 ObjectArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static <K> void parallelQuickSort(K[] p0,int p1,int p2){
 ObjectArrays.parallelQuickSort(p0,p1,p2);
}
public static <K> void ensureOffsetLength(K[] p0,int p1,int p2){
 ObjectArrays.ensureOffsetLength(p0,p1,p2);
}
public static <K> void parallelQuickSortIndirect(int[] p0,K[] p1,int p2,int p3){
 ObjectArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static <K> void quickSortIndirect(int[] p0,K[] p1,int p2,int p3){
 ObjectArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static <K> void stabilize(int[] p0,K[] p1,int p2,int p3){
 ObjectArrays.stabilize(p0,p1,p2,p3);
}
public static <K> void copyFromBig(K[][] p0,long p1,K[] p2,int p3,int p4){
 ObjectBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static <K> void copyToBig(K[] p0,int p1,K[][] p2,long p3,long p4){
 ObjectBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static <K> void makeHeap(K[] p0,int p1,java.util.Comparator<K> p2){
 ObjectHeaps.makeHeap(p0,p1,p2);
}
public static <K> int downHeap(K[] p0,int p1,int p2,java.util.Comparator<? super K> p3){
return ObjectHeaps.downHeap(p0,p1,p2,p3);
}
public static <K> int upHeap(K[] p0,int p1,int p2,java.util.Comparator<K> p3){
return ObjectHeaps.upHeap(p0,p1,p2,p3);
}
public static <K> void makeHeap(K[] p0,int p1,int p2,int[] p3,int[] p4,java.util.Comparator<K> p5){
 ObjectIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static <K> void makeHeap(K[] p0,int[] p1,int[] p2,int p3,java.util.Comparator<K> p4){
 ObjectIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static <K> int downHeap(K[] p0,int[] p1,int[] p2,int p3,int p4,java.util.Comparator<K> p5){
return ObjectIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static <K> int upHeap(K[] p0,int[] p1,int[] p2,int p3,int p4,java.util.Comparator<K> p5){
return ObjectIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static <K> int indexOf(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0,java.util.function.Predicate<? super K> p1){
return ObjectIterators.indexOf(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>[] p0,int p1,int p2){
return ObjectIterators.concat(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> wrap(K[] p0,int p1,int p2){
return ObjectIterators.wrap(p0,p1,p2);
}
public static <K> int unwrap(java.util.Iterator<? extends K> p0,K[] p1){
return ObjectIterators.unwrap(p0,p1);
}
public static <K> int unwrap(java.util.Iterator<? extends K> p0,K[] p1,int p2,int p3){
return ObjectIterators.unwrap(p0,p1,p2,p3);
}
public static <K> int unwrap(java.util.Iterator<K> p0,it.unimi.dsi.fastutil.objects.ObjectCollection<? super K> p1,int p2){
return ObjectIterators.unwrap(p0,p1,p2);
}
public static <K> K[] unwrap(java.util.Iterator<? extends K> p0,int p1){
return ObjectIterators.unwrap(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> pour(java.util.Iterator<K> p0,int p1){
return ObjectIterators.pour(p0,p1);
}
public static <K> int pour(java.util.Iterator<K> p0,it.unimi.dsi.fastutil.objects.ObjectCollection<? super K> p1){
return ObjectIterators.pour(p0,p1);
}
public static <K> int pour(java.util.Iterator<K> p0,it.unimi.dsi.fastutil.objects.ObjectCollection<? super K> p1,int p2){
return ObjectIterators.pour(p0,p1,p2);
}
public static <K> int front(K[] p0,int[] p1,int p2,int[] p3,java.util.Comparator<K> p4){
return ObjectSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static <K> int front(K[] p0,int[] p1,int p2,int[] p3){
return ObjectSemiIndirectHeaps.front(p0,p1,p2,p3);
}
public static <K> int[] makeHeap(K[] p0,int p1,int p2,java.util.Comparator<K> p3){
return ObjectSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static <K> void makeHeap(K[] p0,int[] p1,int p2,java.util.Comparator<K> p3){
 ObjectSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static <K> void makeHeap(K[] p0,int p1,int p2,int[] p3,java.util.Comparator<K> p4){
 ObjectSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static <K> int downHeap(K[] p0,int[] p1,int p2,int p3,java.util.Comparator<K> p4){
return ObjectSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static <K> int upHeap(K[] p0,int[] p1,int p2,int p3,java.util.Comparator<K> p4){
return ObjectSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction singleton(short p0,int p1){
return Short2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap singleton(short p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.ShortArrayList wrap(short[] p0,int p1){
return ShortArrayList.wrap(p0,p1);
}
public static short[] trim(short[] p0,int p1){
return ShortArrays.trim(p0,p1);
}
public static short[] copy(short[] p0,int p1,int p2){
return ShortArrays.copy(p0,p1,p2);
}
public static void fill(short[] p0,int p1,int p2,short p3){
 ShortArrays.fill(p0,p1,p2,p3);
}
public static short[] ensureCapacity(short[] p0,int p1){
return ShortArrays.ensureCapacity(p0,p1);
}
public static short[] setLength(short[] p0,int p1){
return ShortArrays.setLength(p0,p1);
}
public static short[] grow(short[] p0,int p1){
return ShortArrays.grow(p0,p1);
}
public static short[] grow(short[] p0,int p1,int p2){
return ShortArrays.grow(p0,p1,p2);
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
public static short[] shuffle(short[] p0,int p1,int p2,java.util.Random p3){
return ShortArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(short[] p0,int p1,int p2){
 ShortArrays.swap(p0,p1,p2);
}
public static void swap(short[] p0,int p1,int p2,int p3){
 ShortArrays.swap(p0,p1,p2,p3);
}
public static void mergeSort(short[] p0,int p1,int p2){
 ShortArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(short[] p0,int p1,int p2,short[] p3){
 ShortArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3,short[] p4){
 ShortArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortArrays.mergeSort(p0,p1,p2,p3);
}
public static void ensureFromTo(short[] p0,int p1,int p2){
 ShortArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(short[] p0,short[] p1,int p2,int p3){
 ShortArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(short[] p0,int p1,int p2){
 ShortArrays.quickSort(p0,p1,p2);
}
public static void quickSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(short[] p0,short[] p1,int p2,int p3){
 ShortArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(short[] p0,int p1,int p2){
 ShortArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(short[] p0,int p1,int p2){
 ShortArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,short[] p1,int p2,int p3){
 ShortArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,short[] p1,int p2,int p3){
 ShortArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void parallelRadixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4){
 ShortArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(short[] p0,short[] p1,int p2,int p3){
 ShortArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(short[] p0,int p1,int p2){
 ShortArrays.parallelRadixSort(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,short[] p1,short[] p2,int p3,int p4,boolean p5){
 ShortArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4){
 ShortArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,short[] p1,int p2,int p3){
 ShortArrays.stabilize(p0,p1,p2,p3);
}
public static void radixSort(short[] p0,int p1,int p2){
 ShortArrays.radixSort(p0,p1,p2);
}
public static void radixSort(short[] p0,short[] p1,int p2,int p3){
 ShortArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(short[][] p0,int p1,int p2){
 ShortArrays.radixSort(p0,p1,p2);
}
public static void copyFromBig(short[][] p0,long p1,short[] p2,int p3,int p4){
 ShortBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(short[] p0,int p1,short[][] p2,long p3,long p4){
 ShortBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void makeHeap(short[] p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
 ShortHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
return ShortHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
return ShortHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(short[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5){
 ShortIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(short[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
 ShortIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(short[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5){
return ShortIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(short[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5){
return ShortIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
return ShortIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator[] p0,int p1,int p2){
return ShortIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.ShortListIterator wrap(short[] p0,int p1,int p2){
return ShortIterators.wrap(p0,p1,p2);
}
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[] p1){
return ShortIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[] p1,int p2,int p3){
return ShortIterators.unwrap(p0,p1,p2,p3);
}
public static short[] unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1){
return ShortIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2){
return ShortIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1){
return ShortIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2){
return ShortIterators.pour(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1){
return ShortIterators.pour(p0,p1);
}
public static int front(short[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static int front(short[] p0,int[] p1,int p2,int[] p3){
return ShortSemiIndirectHeaps.front(p0,p1,p2,p3);
}
public static int[] makeHeap(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
return ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(short[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(short[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
 ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(short[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(short[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
return ShortSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static int byteToIntAlt(byte[] p0,int p1){
return PackedByteArray.byteToIntAlt(p0,p1);
}
public static int byteToInt(byte[] p0,int p1){
return PackedByteArray.byteToInt(p0,p1);
}
public static byte[] getElement(byte[] p0,int p1){
return PackedByteArray.getElement(p0,p1);
}
public static com.facebook.collections.specialized.IntegerHashSetFactory withInitialSize(int p0){
return IntegerHashSetFactory.withInitialSize(p0);
}
public static com.facebook.collections.specialized.IntegerHashSetFactory withMaxSize(int p0){
return IntegerHashSetFactory.withMaxSize(p0);
}
public static <T> int compareArrays(T[] p0,T[] p1,java.util.Comparator<? super T> p2){
return Arrays.compareArrays(p0,p1,p2);
}
public static <T extends java.lang.Comparable<? super T> > int compareArrays(T[] p0,T[] p1){
return Arrays.compareArrays(p0,p1);
}
public static <T> int comparPrimitiveArrays(T[] p0,T[] p1,java.util.Comparator<? super T[]> p2){
return Arrays.comparPrimitiveArrays(p0,p1,p2);
}
public static <T> int compareLists(java.util.List<? extends T> p0,java.util.List<? extends T> p1,java.util.Comparator<? super T> p2){
return Lists.compareLists(p0,p1,p2);
}
public static <T extends java.lang.Comparable<? super T> > int compareLists(java.util.List<? extends T> p0,java.util.List<? extends T> p1){
return Lists.compareLists(p0,p1);
}
public static int compareArrays(byte[] p0,byte[] p1){
return Lists.compareArrays(p0,p1);
}
public static com.facebook.util.TimeInterval withTypeAndLength(com.facebook.util.TimeIntervalType p0,int p1){
return TimeInterval.withTypeAndLength(p0,p1);
}
public static java.lang.Object[] add(java.lang.Object[] p0,int p1,java.lang.Object p2){
return ArrayUtils.add(p0,p1,p2);
}
public static java.lang.Object[] remove(java.lang.Object[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static java.lang.Object[] subarray(java.lang.Object[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.lang.String[] p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.util.Collection p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3,java.lang.String[] p4){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3,java.lang.Class p4){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4);
}
public static int reflectionHashCode(java.lang.Object p0,java.util.Collection p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static int reflectionHashCode(java.lang.Object p0,java.lang.String[] p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3,java.lang.Class p4,java.lang.String[] p5){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}
public static int reflectionHashCode(java.lang.Object p0){
return HashCodeBuilder.reflectionHashCode(p0);
}
public static int count(java.lang.String p0,java.lang.String[] p1){
return CharSetUtils.count(p0,p1);
}
public static int count(java.lang.String p0,java.lang.String p1){
return CharSetUtils.count(p0,p1);
}
public static org.apache.commons.lang.enum.ValuedEnum getEnum(java.lang.Class p0,int p1){
return EnumUtils.getEnum(p0,p1);
}
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class p1){
return ExceptionUtils.indexOfThrowable(p0,p1);
}
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class p1,int p2){
return ExceptionUtils.indexOfThrowable(p0,p1,p2);
}
public static int indexOfType(java.lang.Throwable p0,java.lang.Class p1){
return ExceptionUtils.indexOfType(p0,p1);
}
public static int indexOfType(java.lang.Throwable p0,java.lang.Class p1,int p2){
return ExceptionUtils.indexOfType(p0,p1,p2);
}
public static int min(int[] p0){
return NumberUtils.min(p0);
}
public static int max(int[] p0){
return NumberUtils.max(p0);
}
public static int stringToInt(java.lang.String p0){
return NumberUtils.stringToInt(p0);
}
public static int stringToInt(java.lang.String p0,int p1){
return NumberUtils.stringToInt(p0,p1);
}
public static int nextInt(){
return RandomUtils.nextInt();
}
public static int nextInt(java.util.Random p0,int p1){
return RandomUtils.nextInt(p0,p1);
}
public static int nextInt(int p0){
return RandomUtils.nextInt(p0);
}
public static int nextInt(java.util.Random p0){
return RandomUtils.nextInt(p0);
}
public static int minimum(int p0,int p1,int p2){
return NumberUtils.minimum(p0,p1,p2);
}
public static int maximum(int p0,int p1,int p2){
return NumberUtils.maximum(p0,p1,p2);
}
public static int compare(java.lang.Comparable p0,java.lang.Comparable p1){
return ObjectUtils.compare(p0,p1);
}
public static int compare(java.lang.Comparable p0,java.lang.Comparable p1,boolean p2){
return ObjectUtils.compare(p0,p1,p2);
}
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5){
return RandomStringUtils.random(p0,p1,p2,p3,p4,p5);
}
public static java.lang.String random(int p0,char[] p1){
return RandomStringUtils.random(p0,p1);
}
public static int indexOf(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.indexOf(p0,p1,p2);
}
public static int indexOf(java.lang.String p0,java.lang.String p1){
return StringUtils.indexOf(p0,p1);
}
public static int indexOf(java.lang.String p0,char p1,int p2){
return StringUtils.indexOf(p0,p1,p2);
}
public static int indexOf(java.lang.String p0,char p1){
return StringUtils.indexOf(p0,p1);
}
public static int lastIndexOf(java.lang.String p0,char p1){
return StringUtils.lastIndexOf(p0,p1);
}
public static int lastIndexOf(java.lang.String p0,char p1,int p2){
return StringUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(java.lang.String p0,java.lang.String p1){
return StringUtils.lastIndexOf(p0,p1);
}
public static int lastIndexOf(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.lastIndexOf(p0,p1,p2);
}
public static int length(java.lang.String p0){
return StringUtils.length(p0);
}
public static int indexOfDifference(java.lang.String p0,java.lang.String p1){
return StringUtils.indexOfDifference(p0,p1);
}
public static int indexOfDifference(java.lang.String[] p0){
return StringUtils.indexOfDifference(p0);
}
public static int lastOrdinalIndexOf(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.lastOrdinalIndexOf(p0,p1,p2);
}
public static int getLevenshteinDistance(java.lang.String p0,java.lang.String p1){
return StringUtils.getLevenshteinDistance(p0,p1);
}
public static int indexOfIgnoreCase(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.indexOfIgnoreCase(p0,p1,p2);
}
public static int indexOfIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.indexOfIgnoreCase(p0,p1);
}
public static int lastIndexOfIgnoreCase(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.lastIndexOfIgnoreCase(p0,p1,p2);
}
public static int lastIndexOfIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.lastIndexOfIgnoreCase(p0,p1);
}
public static int ordinalIndexOf(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.ordinalIndexOf(p0,p1,p2);
}
public static int indexOfAny(java.lang.String p0,java.lang.String p1){
return StringUtils.indexOfAny(p0,p1);
}
public static int indexOfAny(java.lang.String p0,char[] p1){
return StringUtils.indexOfAny(p0,p1);
}
public static int indexOfAny(java.lang.String p0,java.lang.String[] p1){
return StringUtils.indexOfAny(p0,p1);
}
public static int indexOfAnyBut(java.lang.String p0,java.lang.String p1){
return StringUtils.indexOfAnyBut(p0,p1);
}
public static int indexOfAnyBut(java.lang.String p0,char[] p1){
return StringUtils.indexOfAnyBut(p0,p1);
}
public static int lastIndexOfAny(java.lang.String p0,java.lang.String[] p1){
return StringUtils.lastIndexOfAny(p0,p1);
}
public static int countMatches(java.lang.String p0,java.lang.String p1){
return StringUtils.countMatches(p0,p1);
}
public static java.lang.String overlayString(java.lang.String p0,java.lang.String p1,int p2,int p3){
return StringUtils.overlayString(p0,p1,p2,p3);
}
public static boolean isJavaVersionAtLeast(int p0){
return SystemUtils.isJavaVersionAtLeast(p0);
}
public static java.util.Date add(java.util.Date p0,int p1,int p2){
return DateUtils.add(p0,p1,p2);
}
}
