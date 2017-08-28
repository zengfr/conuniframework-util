package com.zengfr.supercommons;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.base.Verify;
import com.google.common.base.internal.Finalizer;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import com.google.common.io.Closeables;
import com.google.common.io.Files;
import com.google.common.io.Flushables;
import com.google.common.io.Resources;
import java.lang.reflect.AccessibleObject;
import com.google.common.reflect.Reflection;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Uninterruptibles;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.FileCleaner;
import org.apache.commons.io.TaggedIOException;
import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.EndianUtils;
import org.apache.commons.io.HexDump;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.FileUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.concurrent.ConcurrentUtils;
import org.apache.commons.lang3.event.EventUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
import org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.stat.descriptive.rank.Percentile;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.commons.math3.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.descriptive.moment.SemiVariance;
import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math3.stat.descriptive.moment.FirstMoment;
import org.apache.commons.math3.stat.descriptive.moment.Kurtosis;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.Skewness;
import org.apache.commons.math3.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.util.ResizableDoubleArray;
import org.apache.commons.math3.util.CompositeFormat;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.genetics.GeneticAlgorithm;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.beanutils.locale.LocaleBeanUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.locale.LocaleConvertUtils;
import org.apache.commons.beanutils.locale.LocaleBeanUtilsBean;
import org.apache.commons.beanutils.WrapDynaClass;
import org.apache.commons.beanutils.ConvertUtils;
import it.unimi.dsi.fastutil.Arrays;
import it.unimi.dsi.fastutil.BigArrays;
import it.unimi.dsi.fastutil.booleans.BooleanArrays;
import it.unimi.dsi.fastutil.booleans.BooleanBigArrays;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ByteMaps;
import it.unimi.dsi.fastutil.bytes.Byte2CharMaps;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps;
import it.unimi.dsi.fastutil.bytes.Byte2FloatMaps;
import it.unimi.dsi.fastutil.bytes.Byte2IntMaps;
import it.unimi.dsi.fastutil.bytes.Byte2LongMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ShortMaps;
import it.unimi.dsi.fastutil.bytes.ByteArrays;
import it.unimi.dsi.fastutil.bytes.ByteBigArrays;
import it.unimi.dsi.fastutil.bytes.ByteHeaps;
import it.unimi.dsi.fastutil.bytes.ByteIndirectHeaps;
import it.unimi.dsi.fastutil.bytes.ByteSemiIndirectHeaps;
import it.unimi.dsi.fastutil.chars.Char2BooleanMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteMaps;
import it.unimi.dsi.fastutil.chars.Char2CharMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatMaps;
import it.unimi.dsi.fastutil.chars.Char2IntMaps;
import it.unimi.dsi.fastutil.chars.Char2LongMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortMaps;
import it.unimi.dsi.fastutil.chars.CharArrays;
import it.unimi.dsi.fastutil.chars.CharBigArrays;
import it.unimi.dsi.fastutil.chars.CharHeaps;
import it.unimi.dsi.fastutil.chars.CharIndirectHeaps;
import it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps;
import it.unimi.dsi.fastutil.doubles.Double2BooleanMaps;
import it.unimi.dsi.fastutil.doubles.Double2ByteMaps;
import it.unimi.dsi.fastutil.doubles.Double2CharMaps;
import it.unimi.dsi.fastutil.doubles.Double2DoubleMaps;
import it.unimi.dsi.fastutil.doubles.Double2FloatMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntMaps;
import it.unimi.dsi.fastutil.doubles.Double2LongMaps;
import it.unimi.dsi.fastutil.doubles.Double2ObjectMaps;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps;
import it.unimi.dsi.fastutil.doubles.Double2ShortMaps;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.doubles.DoubleBigArrays;
import it.unimi.dsi.fastutil.doubles.DoubleHeaps;
import it.unimi.dsi.fastutil.doubles.DoubleIndirectHeaps;
import it.unimi.dsi.fastutil.doubles.DoubleSemiIndirectHeaps;
import it.unimi.dsi.fastutil.floats.Float2BooleanMaps;
import it.unimi.dsi.fastutil.floats.Float2ByteMaps;
import it.unimi.dsi.fastutil.floats.Float2CharMaps;
import it.unimi.dsi.fastutil.floats.Float2DoubleMaps;
import it.unimi.dsi.fastutil.floats.Float2FloatMaps;
import it.unimi.dsi.fastutil.floats.Float2IntMaps;
import it.unimi.dsi.fastutil.floats.Float2LongMaps;
import it.unimi.dsi.fastutil.floats.Float2ObjectMaps;
import it.unimi.dsi.fastutil.floats.Float2ReferenceMaps;
import it.unimi.dsi.fastutil.floats.Float2ShortMaps;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatBigArrays;
import it.unimi.dsi.fastutil.floats.FloatHeaps;
import it.unimi.dsi.fastutil.floats.FloatIndirectHeaps;
import it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps;
import it.unimi.dsi.fastutil.ints.Int2BooleanMaps;
import it.unimi.dsi.fastutil.ints.Int2ByteMaps;
import it.unimi.dsi.fastutil.ints.Int2CharMaps;
import it.unimi.dsi.fastutil.ints.Int2DoubleMaps;
import it.unimi.dsi.fastutil.ints.Int2FloatMaps;
import it.unimi.dsi.fastutil.ints.Int2IntMaps;
import it.unimi.dsi.fastutil.ints.Int2LongMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceMaps;
import it.unimi.dsi.fastutil.ints.Int2ShortMaps;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.ints.IntBigArrays;
import it.unimi.dsi.fastutil.ints.IntHeaps;
import it.unimi.dsi.fastutil.ints.IntIndirectHeaps;
import it.unimi.dsi.fastutil.ints.IntSemiIndirectHeaps;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import it.unimi.dsi.fastutil.longs.Long2BooleanMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteMaps;
import it.unimi.dsi.fastutil.longs.Long2CharMaps;
import it.unimi.dsi.fastutil.longs.Long2DoubleMaps;
import it.unimi.dsi.fastutil.longs.Long2FloatMaps;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceMaps;
import it.unimi.dsi.fastutil.longs.Long2ShortMaps;
import it.unimi.dsi.fastutil.longs.LongArrays;
import it.unimi.dsi.fastutil.longs.LongBigArrays;
import it.unimi.dsi.fastutil.longs.LongHeaps;
import it.unimi.dsi.fastutil.longs.LongIndirectHeaps;
import it.unimi.dsi.fastutil.longs.LongSemiIndirectHeaps;
import it.unimi.dsi.fastutil.objects.Object2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Object2ByteMaps;
import it.unimi.dsi.fastutil.objects.Object2CharMaps;
import it.unimi.dsi.fastutil.objects.Object2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Object2ShortMaps;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import it.unimi.dsi.fastutil.objects.ObjectBigArrays;
import it.unimi.dsi.fastutil.objects.ObjectHeaps;
import it.unimi.dsi.fastutil.objects.ObjectIndirectHeaps;
import it.unimi.dsi.fastutil.objects.ObjectSemiIndirectHeaps;
import it.unimi.dsi.fastutil.objects.Reference2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Reference2ByteMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntMaps;
import it.unimi.dsi.fastutil.objects.Reference2LongMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Reference2ShortMaps;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMaps;
import it.unimi.dsi.fastutil.shorts.Short2ByteMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharMaps;
import it.unimi.dsi.fastutil.shorts.Short2DoubleMaps;
import it.unimi.dsi.fastutil.shorts.Short2FloatMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntMaps;
import it.unimi.dsi.fastutil.shorts.Short2LongMaps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMaps;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps;
import it.unimi.dsi.fastutil.shorts.Short2ShortMaps;
import it.unimi.dsi.fastutil.shorts.ShortArrays;
import it.unimi.dsi.fastutil.shorts.ShortBigArrays;
import it.unimi.dsi.fastutil.shorts.ShortHeaps;
import it.unimi.dsi.fastutil.shorts.ShortIndirectHeaps;
import it.unimi.dsi.fastutil.shorts.ShortSemiIndirectHeaps;
import com.facebook.util.TimeUtil;
import com.facebook.util.Validations;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.reflect.FieldUtils;
import org.apache.commons.lang.SerializationUtils;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.Validate;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class VoidUtil{ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Preconditions.checkArgument(p0,p1,p2);
}
public static void checkArgument(boolean p0,java.lang.Object p1){
 Preconditions.checkArgument(p0,p1);
}
public static void checkArgument(boolean p0){
 Preconditions.checkArgument(p0);
}
public static void checkState(boolean p0){
 Preconditions.checkState(p0);
}
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Preconditions.checkState(p0,p1,p2);
}
public static void checkState(boolean p0,java.lang.Object p1){
 Preconditions.checkState(p0,p1);
}
public static void checkPositionIndexes(int p0,int p1,int p2){
 Preconditions.checkPositionIndexes(p0,p1,p2);
}
public static void propagateIfPossible(java.lang.Throwable p0){
 Throwables.propagateIfPossible(p0);
}
public static <X extends java.lang.Throwable > void propagateIfPossible(java.lang.Throwable p0,java.lang.Class<X> p1) throws X{
 Throwables.propagateIfPossible(p0,p1);
}
public static <X1 extends java.lang.Throwable ,X2 extends java.lang.Throwable > void propagateIfPossible(java.lang.Throwable p0,java.lang.Class<X1> p1,java.lang.Class<X2> p2) throws X1,X2{
 Throwables.propagateIfPossible(p0,p1,p2);
}
public static <X extends java.lang.Throwable > void propagateIfInstanceOf(java.lang.Throwable p0,java.lang.Class<X> p1) throws X{
 Throwables.propagateIfInstanceOf(p0,p1);
}
public static void verify(boolean p0){
 Verify.verify(p0);
}
public static void verify(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Verify.verify(p0,p1,p2);
}
public static void startFinalizer(java.lang.Class<?> p0,java.lang.ref.ReferenceQueue<java.lang.Object> p1,java.lang.ref.PhantomReference<java.lang.Object> p2){
 Finalizer.startFinalizer(p0,p1,p2);
}
public static void readFully(java.io.InputStream p0,byte[] p1) throws java.io.IOException{
 ByteStreams.readFully(p0,p1);
}
public static void readFully(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
 ByteStreams.readFully(p0,p1,p2,p3);
}
public static void skipFully(java.io.InputStream p0,long p1) throws java.io.IOException{
 ByteStreams.skipFully(p0,p1);
}
public static void skipFully(java.io.Reader p0,long p1) throws java.io.IOException{
 CharStreams.skipFully(p0,p1);
}
public static void close(java.io.Closeable p0,boolean p1) throws java.io.IOException{
 Closeables.close(p0,p1);
}
public static void closeQuietly(java.io.Reader p0){
 Closeables.closeQuietly(p0);
}
public static void closeQuietly(java.io.InputStream p0){
 Closeables.closeQuietly(p0);
}
public static void append(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
 Files.append(p0,p1,p2);
}
public static void write(byte[] p0,java.io.File p1) throws java.io.IOException{
 Files.write(p0,p1);
}
public static void write(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
 Files.write(p0,p1,p2);
}
public static void copy(java.io.File p0,java.io.File p1) throws java.io.IOException{
 Files.copy(p0,p1);
}
public static void copy(java.io.File p0,java.nio.charset.Charset p1,java.lang.Appendable p2) throws java.io.IOException{
 Files.copy(p0,p1,p2);
}
public static void copy(java.io.File p0,java.io.OutputStream p1) throws java.io.IOException{
 Files.copy(p0,p1);
}
public static void createParentDirs(java.io.File p0) throws java.io.IOException{
 Files.createParentDirs(p0);
}
public static void touch(java.io.File p0) throws java.io.IOException{
 Files.touch(p0);
}
public static void move(java.io.File p0,java.io.File p1) throws java.io.IOException{
 Files.move(p0,p1);
}
public static void flush(java.io.Flushable p0,boolean p1) throws java.io.IOException{
 Flushables.flush(p0,p1);
}
public static void flushQuietly(java.io.Flushable p0){
 Flushables.flushQuietly(p0);
}
public static void copy(java.net.URL p0,java.io.OutputStream p1) throws java.io.IOException{
 Resources.copy(p0,p1);
}
public static void setAccessible(java.lang.reflect.AccessibleObject[] p0,boolean p1) throws java.lang.SecurityException{
 AccessibleObject.setAccessible(p0,p1);
}
public static void initialize(java.lang.Class<?>... p0){
 Reflection.initialize(p0);
}
public static <V> void addCallback(com.google.common.util.concurrent.ListenableFuture<V> p0,com.google.common.util.concurrent.FutureCallback<? super V> p1){
 Futures.addCallback(p0,p1);
}
public static <V> void addCallback(com.google.common.util.concurrent.ListenableFuture<V> p0,com.google.common.util.concurrent.FutureCallback<? super V> p1,java.util.concurrent.Executor p2){
 Futures.addCallback(p0,p1,p2);
}
public static void addDelayedShutdownHook(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2){
 MoreExecutors.addDelayedShutdownHook(p0,p1,p2);
}
public static void awaitUninterruptibly(java.util.concurrent.CountDownLatch p0){
 Uninterruptibles.awaitUninterruptibly(p0);
}
public static void sleepUninterruptibly(long p0,java.util.concurrent.TimeUnit p1){
 Uninterruptibles.sleepUninterruptibly(p0,p1);
}
public static void joinUninterruptibly(java.lang.Thread p0,long p1,java.util.concurrent.TimeUnit p2){
 Uninterruptibles.joinUninterruptibly(p0,p1,p2);
}
public static void joinUninterruptibly(java.lang.Thread p0){
 Uninterruptibles.joinUninterruptibly(p0);
}
public static <E> void putUninterruptibly(java.util.concurrent.BlockingQueue<E> p0,E p1){
 Uninterruptibles.putUninterruptibly(p0,p1);
}
public static void write(java.lang.StringBuffer p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.String p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.String p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.String p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.StringBuffer p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.StringBuffer p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(byte[] p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(byte[] p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(char[] p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(char[] p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(char[] p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(char[] p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.CharSequence p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.String p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(byte[] p0,java.io.Writer p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void close(java.net.URLConnection p0){
 IOUtils.close(p0);
}
public static void copy(java.io.InputStream p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.copy(p0,p1);
}
public static void copy(java.io.Reader p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.copy(p0,p1);
}
public static void copy(java.io.Reader p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static void copy(java.io.Reader p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static void readFully(java.io.Reader p0,char[] p1) throws java.io.IOException{
 IOUtils.readFully(p0,p1);
}
public static void readFully(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
 IOUtils.readFully(p0,p1,p2,p3);
}
public static void readFully(java.nio.channels.ReadableByteChannel p0,java.nio.ByteBuffer p1) throws java.io.IOException{
 IOUtils.readFully(p0,p1);
}
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2,java.nio.charset.Charset p3) throws java.io.IOException{
 IOUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2,java.lang.String p3) throws java.io.IOException{
 IOUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.Writer p2) throws java.io.IOException{
 IOUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2) throws java.io.IOException{
 IOUtils.writeLines(p0,p1,p2);
}
public static void skipFully(java.nio.channels.ReadableByteChannel p0,long p1) throws java.io.IOException{
 IOUtils.skipFully(p0,p1);
}
public static void closeQuietly(java.io.Closeable p0){
 IOUtils.closeQuietly(p0);
}
public static void closeQuietly(java.io.Closeable... p0){
 IOUtils.closeQuietly(p0);
}
public static void closeQuietly(java.net.Socket p0){
 IOUtils.closeQuietly(p0);
}
public static void closeQuietly(java.nio.channels.Selector p0){
 IOUtils.closeQuietly(p0);
}
public static void closeQuietly(java.net.ServerSocket p0){
 IOUtils.closeQuietly(p0);
}
public static void closeQuietly(java.io.Writer p0){
 IOUtils.closeQuietly(p0);
}
public static void closeQuietly(java.io.OutputStream p0){
 IOUtils.closeQuietly(p0);
}
public static void writeChunked(char[] p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.writeChunked(p0,p1);
}
public static void writeChunked(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.writeChunked(p0,p1);
}
public static void track(java.lang.String p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
 FileCleaner.track(p0,p1,p2);
}
public static void track(java.io.File p0,java.lang.Object p1){
 FileCleaner.track(p0,p1);
}
public static void track(java.io.File p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
 FileCleaner.track(p0,p1,p2);
}
public static void track(java.lang.String p0,java.lang.Object p1){
 FileCleaner.track(p0,p1);
}
public static synchronized void exitWhenFinished(){
 FileCleaner.exitWhenFinished();
}
public static void throwCauseIfTaggedWith(java.lang.Throwable p0,java.lang.Object p1) throws java.io.IOException{
 TaggedIOException.throwCauseIfTaggedWith(p0,p1);
}
public static void copy(java.lang.String p0,java.io.OutputStream p1) throws java.io.IOException{
 CopyUtils.copy(p0,p1);
}
public static void copy(java.lang.String p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 CopyUtils.copy(p0,p1,p2);
}
public static void copy(java.lang.String p0,java.io.Writer p1) throws java.io.IOException{
 CopyUtils.copy(p0,p1);
}
public static void copy(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
 CopyUtils.copy(p0,p1);
}
public static void copy(byte[] p0,java.io.Writer p1) throws java.io.IOException{
 CopyUtils.copy(p0,p1);
}
public static void copy(byte[] p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
 CopyUtils.copy(p0,p1,p2);
}
public static void writeSwappedLong(java.io.OutputStream p0,long p1) throws java.io.IOException{
 EndianUtils.writeSwappedLong(p0,p1);
}
public static void writeSwappedLong(byte[] p0,int p1,long p2){
 EndianUtils.writeSwappedLong(p0,p1,p2);
}
public static void writeSwappedInteger(byte[] p0,int p1,int p2){
 EndianUtils.writeSwappedInteger(p0,p1,p2);
}
public static void writeSwappedInteger(java.io.OutputStream p0,int p1) throws java.io.IOException{
 EndianUtils.writeSwappedInteger(p0,p1);
}
public static void writeSwappedDouble(java.io.OutputStream p0,double p1) throws java.io.IOException{
 EndianUtils.writeSwappedDouble(p0,p1);
}
public static void writeSwappedDouble(byte[] p0,int p1,double p2){
 EndianUtils.writeSwappedDouble(p0,p1,p2);
}
public static void writeSwappedFloat(byte[] p0,int p1,float p2){
 EndianUtils.writeSwappedFloat(p0,p1,p2);
}
public static void writeSwappedFloat(java.io.OutputStream p0,float p1) throws java.io.IOException{
 EndianUtils.writeSwappedFloat(p0,p1);
}
public static void writeSwappedShort(java.io.OutputStream p0,short p1) throws java.io.IOException{
 EndianUtils.writeSwappedShort(p0,p1);
}
public static void writeSwappedShort(byte[] p0,int p1,short p2){
 EndianUtils.writeSwappedShort(p0,p1,p2);
}
public static void dump(byte[] p0,long p1,java.io.OutputStream p2,int p3) throws java.io.IOException,java.lang.ArrayIndexOutOfBoundsException,java.lang.IllegalArgumentException{
 HexDump.dump(p0,p1,p2,p3);
}
public static void closeQuietly(org.apache.commons.io.LineIterator p0){
 LineIterator.closeQuietly(p0);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
 FileUtils.write(p0,p1,p2,p3);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.write(p0,p1,p2,p3);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,boolean p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1) throws java.io.IOException{
 FileUtils.write(p0,p1);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,boolean p3) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,boolean p2) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1) throws java.io.IOException{
 FileUtils.writeLines(p0,p1);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3,boolean p4) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3,p4);
}
public static void forceMkdir(java.io.File p0) throws java.io.IOException{
 FileUtils.forceMkdir(p0);
}
public static void deleteDirectory(java.io.File p0) throws java.io.IOException{
 FileUtils.deleteDirectory(p0);
}
public static void copyFile(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.copyFile(p0,p1,p2);
}
public static void copyFile(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyFile(p0,p1);
}
public static void copyDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1);
}
public static void copyDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1,p2);
}
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1,p2);
}
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1,p2,p3);
}
public static void copyURLToFile(java.net.URL p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyURLToFile(p0,p1);
}
public static void copyURLToFile(java.net.URL p0,java.io.File p1,int p2,int p3) throws java.io.IOException{
 FileUtils.copyURLToFile(p0,p1,p2,p3);
}
public static void copyToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyToFile(p0,p1);
}
public static void cleanDirectory(java.io.File p0) throws java.io.IOException{
 FileUtils.cleanDirectory(p0);
}
public static void forceMkdirParent(java.io.File p0) throws java.io.IOException{
 FileUtils.forceMkdirParent(p0);
}
public static void moveDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.moveDirectory(p0,p1);
}
public static void moveFile(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.moveFile(p0,p1);
}
public static void moveToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.moveToDirectory(p0,p1,p2);
}
public static void forceDelete(java.io.File p0) throws java.io.IOException{
 FileUtils.forceDelete(p0);
}
public static void moveFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.moveFileToDirectory(p0,p1,p2);
}
public static void forceDeleteOnExit(java.io.File p0) throws java.io.IOException{
 FileUtils.forceDeleteOnExit(p0);
}
public static void moveDirectoryToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.moveDirectoryToDirectory(p0,p1,p2);
}
public static void copyInputStreamToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyInputStreamToFile(p0,p1);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2,p3);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,boolean p2) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2,p3);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2);
}
public static void copyDirectoryToDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyDirectoryToDirectory(p0,p1);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,boolean p2) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1,p2);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3,boolean p4) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1,p2,p3,p4);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1,p2,p3);
}
public static void copyFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.copyFileToDirectory(p0,p1,p2);
}
public static void copyFileToDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyFileToDirectory(p0,p1);
}
public static void addAll(java.util.Collection p0,java.lang.Object[] p1){
 CollectionUtils.addAll(p0,p1);
}
public static void addAll(java.util.Collection p0,java.util.Iterator p1){
 CollectionUtils.addAll(p0,p1);
}
public static void addAll(java.util.Collection p0,java.util.Enumeration p1){
 CollectionUtils.addAll(p0,p1);
}
public static void filter(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
 CollectionUtils.filter(p0,p1);
}
public static void transform(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
 CollectionUtils.transform(p0,p1);
}
public static void select(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
 CollectionUtils.select(p0,p1,p2);
}
public static void reverseArray(java.lang.Object[] p0){
 CollectionUtils.reverseArray(p0);
}
public static void forAllDo(java.util.Collection p0,org.apache.commons.collections.Closure p1){
 CollectionUtils.forAllDo(p0,p1);
}
public static void selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
 CollectionUtils.selectRejected(p0,p1,p2);
}
public static void verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
 MapUtils.verbosePrint(p0,p1,p2);
}
public static void debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
 MapUtils.debugPrint(p0,p1,p2);
}
public static void safeAddToMap(java.util.Map p0,java.lang.Object p1,java.lang.Object p2) throws java.lang.NullPointerException{
 MapUtils.safeAddToMap(p0,p1,p2);
}
public static <C> void transform(java.util.Collection<C> p0,org.apache.commons.collections4.Transformer<? super C, ? extends C> p1){
 CollectionUtils.transform(p0,p1);
}
public static <K,V> void populateMap(java.util.Map<K, V> p0,java.lang.Iterable<? extends V> p1,org.apache.commons.collections4.Transformer<V, K> p2){
 MapUtils.populateMap(p0,p1,p2);
}
public static <K,V,E> void populateMap(org.apache.commons.collections4.MultiMap<K, V> p0,java.lang.Iterable<? extends E> p1,org.apache.commons.collections4.Transformer<E, K> p2,org.apache.commons.collections4.Transformer<E, V> p3){
 MapUtils.populateMap(p0,p1,p2,p3);
}
public static <K,V> void populateMap(org.apache.commons.collections4.MultiMap<K, V> p0,java.lang.Iterable<? extends V> p1,org.apache.commons.collections4.Transformer<V, K> p2){
 MapUtils.populateMap(p0,p1,p2);
}
public static <K,V,E> void populateMap(java.util.Map<K, V> p0,java.lang.Iterable<? extends E> p1,org.apache.commons.collections4.Transformer<E, K> p2,org.apache.commons.collections4.Transformer<E, V> p3){
 MapUtils.populateMap(p0,p1,p2,p3);
}
public static void verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map<?, ?> p2){
 MapUtils.verbosePrint(p0,p1,p2);
}
public static void debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map<?, ?> p2){
 MapUtils.debugPrint(p0,p1,p2);
}
public static <K> void safeAddToMap(java.util.Map<? super K, java.lang.Object> p0,K p1,java.lang.Object p2) throws java.lang.NullPointerException{
 MapUtils.safeAddToMap(p0,p1,p2);
}
public static <E> void forEach(java.util.Iterator<E> p0,org.apache.commons.collections4.Closure<? super E> p1){
 IteratorUtils.forEach(p0,p1);
}
public static <E> void forEach(java.lang.Iterable<E> p0,org.apache.commons.collections4.Closure<? super E> p1){
 IterableUtils.forEach(p0,p1);
}
public static void reverse(short[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static void reverse(byte[] p0){
 ArrayUtils.reverse(p0);
}
public static void reverse(double[] p0){
 ArrayUtils.reverse(p0);
}
public static void reverse(float[] p0){
 ArrayUtils.reverse(p0);
}
public static void reverse(boolean[] p0){
 ArrayUtils.reverse(p0);
}
public static void reverse(boolean[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static void reverse(java.lang.Object[] p0){
 ArrayUtils.reverse(p0);
}
public static void reverse(long[] p0){
 ArrayUtils.reverse(p0);
}
public static void reverse(short[] p0){
 ArrayUtils.reverse(p0);
}
public static void reverse(char[] p0){
 ArrayUtils.reverse(p0);
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
public static void reverse(int[] p0){
 ArrayUtils.reverse(p0);
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
public static void setDefaultStyle(org.apache.commons.lang3.builder.ToStringStyle p0){
 ToStringBuilder.setDefaultStyle(p0);
}
public static void handleCause(java.util.concurrent.ExecutionException p0) throws org.apache.commons.lang3.concurrent.ConcurrentException{
 ConcurrentUtils.handleCause(p0);
}
public static void handleCauseUnchecked(java.util.concurrent.ExecutionException p0){
 ConcurrentUtils.handleCauseUnchecked(p0);
}
public static <L> void addEventListener(java.lang.Object p0,java.lang.Class<L> p1,L p2){
 EventUtils.addEventListener(p0,p1,p2);
}
public static <L> void bindEventsToMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,java.lang.Class<L> p3,java.lang.String... p4){
 EventUtils.bindEventsToMethod(p0,p1,p2,p3,p4);
}
public static void removeCommonFrames(java.util.List<java.lang.String> p0,java.util.List<java.lang.String> p1){
 ExceptionUtils.removeCommonFrames(p0,p1);
}
public static void printRootCauseStackTrace(java.lang.Throwable p0){
 ExceptionUtils.printRootCauseStackTrace(p0);
}
public static void printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintWriter p1){
 ExceptionUtils.printRootCauseStackTrace(p0,p1);
}
public static void printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintStream p1){
 ExceptionUtils.printRootCauseStackTrace(p0,p1);
}
public static void identityToString(java.lang.StringBuilder p0,java.lang.Object p1){
 ObjectUtils.identityToString(p0,p1);
}
public static void identityToString(java.lang.StringBuffer p0,java.lang.Object p1){
 ObjectUtils.identityToString(p0,p1);
}
public static void identityToString(org.apache.commons.lang3.text.StrBuilder p0,java.lang.Object p1){
 ObjectUtils.identityToString(p0,p1);
}
public static void identityToString(java.lang.Appendable p0,java.lang.Object p1) throws java.io.IOException{
 ObjectUtils.identityToString(p0,p1);
}
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2);
}
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2);
}
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2,p3);
}
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2,p3);
}
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2,p3);
}
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1);
}
public static void removeFinalModifier(java.lang.reflect.Field p0,boolean p1){
 FieldUtils.removeFinalModifier(p0,p1);
}
public static void removeFinalModifier(java.lang.reflect.Field p0){
 FieldUtils.removeFinalModifier(p0);
}
public static void writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
public static void writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2);
}
public static void writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredField(p0,p1,p2);
}
public static void writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredField(p0,p1,p2,p3);
}
public static void serialize(java.io.Serializable p0,java.io.OutputStream p1){
 SerializationUtils.serialize(p0,p1);
}
public static void isAssignableFrom(java.lang.Class<?> p0,java.lang.Class<?> p1){
 Validate.isAssignableFrom(p0,p1);
}
public static void isAssignableFrom(java.lang.Class<?> p0,java.lang.Class<?> p1,java.lang.String p2,java.lang.Object... p3){
 Validate.isAssignableFrom(p0,p1,p2,p3);
}
public static void isInstanceOf(java.lang.Class<?> p0,java.lang.Object p1,java.lang.String p2,java.lang.Object... p3){
 Validate.isInstanceOf(p0,p1,p2,p3);
}
public static void isInstanceOf(java.lang.Class<?> p0,java.lang.Object p1){
 Validate.isInstanceOf(p0,p1);
}
public static <T> void exclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2){
 Validate.exclusiveBetween(p0,p1,p2);
}
public static <T> void exclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2,java.lang.String p3,java.lang.Object... p4){
 Validate.exclusiveBetween(p0,p1,p2,p3,p4);
}
public static void exclusiveBetween(double p0,double p1,double p2,java.lang.String p3){
 Validate.exclusiveBetween(p0,p1,p2,p3);
}
public static void exclusiveBetween(double p0,double p1,double p2){
 Validate.exclusiveBetween(p0,p1,p2);
}
public static void exclusiveBetween(long p0,long p1,long p2,java.lang.String p3){
 Validate.exclusiveBetween(p0,p1,p2,p3);
}
public static void exclusiveBetween(long p0,long p1,long p2){
 Validate.exclusiveBetween(p0,p1,p2);
}
public static void validState(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Validate.validState(p0,p1,p2);
}
public static void validState(boolean p0){
 Validate.validState(p0);
}
public static void matchesPattern(java.lang.CharSequence p0,java.lang.String p1){
 Validate.matchesPattern(p0,p1);
}
public static void matchesPattern(java.lang.CharSequence p0,java.lang.String p1,java.lang.String p2,java.lang.Object... p3){
 Validate.matchesPattern(p0,p1,p2,p3);
}
public static void isTrue(boolean p0,java.lang.String p1,double p2){
 Validate.isTrue(p0,p1,p2);
}
public static void isTrue(boolean p0){
 Validate.isTrue(p0);
}
public static void isTrue(boolean p0,java.lang.String p1,long p2){
 Validate.isTrue(p0,p1,p2);
}
public static void isTrue(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Validate.isTrue(p0,p1,p2);
}
public static <T> void inclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2){
 Validate.inclusiveBetween(p0,p1,p2);
}
public static void inclusiveBetween(long p0,long p1,long p2,java.lang.String p3){
 Validate.inclusiveBetween(p0,p1,p2,p3);
}
public static void inclusiveBetween(long p0,long p1,long p2){
 Validate.inclusiveBetween(p0,p1,p2);
}
public static <T> void inclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2,java.lang.String p3,java.lang.Object... p4){
 Validate.inclusiveBetween(p0,p1,p2,p3,p4);
}
public static void inclusiveBetween(double p0,double p1,double p2,java.lang.String p3){
 Validate.inclusiveBetween(p0,p1,p2,p3);
}
public static void inclusiveBetween(double p0,double p1,double p2){
 Validate.inclusiveBetween(p0,p1,p2);
}
public static void verifyInterval(double p0,double p1) throws org.apache.commons.math3.exception.NumberIsTooLargeException{
 UnivariateSolverUtils.verifyInterval(p0,p1);
}
public static void verifySequence(double p0,double p1,double p2) throws org.apache.commons.math3.exception.NumberIsTooLargeException{
 UnivariateSolverUtils.verifySequence(p0,p1,p2);
}
public static void verifyBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoBracketingException{
 UnivariateSolverUtils.verifyBracketing(p0,p1,p2);
}
public static void copy(org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics p0,org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics p1) throws org.apache.commons.math3.exception.NullArgumentException{
 SynchronizedSummaryStatistics.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.SummaryStatistics p0,org.apache.commons.math3.stat.descriptive.SummaryStatistics p1) throws org.apache.commons.math3.exception.NullArgumentException{
 SummaryStatistics.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.rank.Percentile p0,org.apache.commons.math3.stat.descriptive.rank.Percentile p1) throws org.apache.commons.math3.exception.MathUnsupportedOperationException{
 Percentile.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.rank.Min p0,org.apache.commons.math3.stat.descriptive.rank.Min p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Min.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.rank.Max p0,org.apache.commons.math3.stat.descriptive.rank.Max p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Max.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.summary.SumOfSquares p0,org.apache.commons.math3.stat.descriptive.summary.SumOfSquares p1) throws org.apache.commons.math3.exception.NullArgumentException{
 SumOfSquares.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.summary.Product p0,org.apache.commons.math3.stat.descriptive.summary.Product p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Product.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.summary.SumOfLogs p0,org.apache.commons.math3.stat.descriptive.summary.SumOfLogs p1) throws org.apache.commons.math3.exception.NullArgumentException{
 SumOfLogs.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.summary.Sum p0,org.apache.commons.math3.stat.descriptive.summary.Sum p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Sum.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.moment.Variance p0,org.apache.commons.math3.stat.descriptive.moment.Variance p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Variance.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.moment.SemiVariance p0,org.apache.commons.math3.stat.descriptive.moment.SemiVariance p1) throws org.apache.commons.math3.exception.NullArgumentException{
 SemiVariance.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.moment.SecondMoment p0,org.apache.commons.math3.stat.descriptive.moment.SecondMoment p1) throws org.apache.commons.math3.exception.NullArgumentException{
 SecondMoment.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.moment.FirstMoment p0,org.apache.commons.math3.stat.descriptive.moment.FirstMoment p1) throws org.apache.commons.math3.exception.NullArgumentException{
 FirstMoment.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.moment.Kurtosis p0,org.apache.commons.math3.stat.descriptive.moment.Kurtosis p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Kurtosis.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.moment.StandardDeviation p0,org.apache.commons.math3.stat.descriptive.moment.StandardDeviation p1) throws org.apache.commons.math3.exception.NullArgumentException{
 StandardDeviation.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.moment.Mean p0,org.apache.commons.math3.stat.descriptive.moment.Mean p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Mean.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.moment.Skewness p0,org.apache.commons.math3.stat.descriptive.moment.Skewness p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Skewness.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.moment.GeometricMean p0,org.apache.commons.math3.stat.descriptive.moment.GeometricMean p1) throws org.apache.commons.math3.exception.NullArgumentException{
 GeometricMean.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics p0,org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics p1) throws org.apache.commons.math3.exception.NullArgumentException{
 SynchronizedDescriptiveStatistics.copy(p0,p1);
}
public static void copy(org.apache.commons.math3.stat.descriptive.DescriptiveStatistics p0,org.apache.commons.math3.stat.descriptive.DescriptiveStatistics p1) throws org.apache.commons.math3.exception.NullArgumentException{
 DescriptiveStatistics.copy(p0,p1);
}
public static void checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix p0,int p1,int p2,int p3,int p4) throws org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkSubMatrixIndex(p0,p1,p2,p3,p4);
}
public static void checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix p0,int[] p1,int[] p2) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkSubMatrixIndex(p0,p1,p2);
}
public static void checkMultiplicationCompatible(org.apache.commons.math3.linear.AnyMatrix p0,org.apache.commons.math3.linear.AnyMatrix p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
 MatrixUtils.checkMultiplicationCompatible(p0,p1);
}
public static void checkAdditionCompatible(org.apache.commons.math3.linear.AnyMatrix p0,org.apache.commons.math3.linear.AnyMatrix p1) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException{
 MatrixUtils.checkAdditionCompatible(p0,p1);
}
public static void checkSubtractionCompatible(org.apache.commons.math3.linear.AnyMatrix p0,org.apache.commons.math3.linear.AnyMatrix p1) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException{
 MatrixUtils.checkSubtractionCompatible(p0,p1);
}
public static void deserializeRealVector(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2) throws java.lang.ClassNotFoundException,java.io.IOException{
 MatrixUtils.deserializeRealVector(p0,p1,p2);
}
public static void serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix p0,java.io.ObjectOutputStream p1) throws java.io.IOException{
 MatrixUtils.serializeRealMatrix(p0,p1);
}
public static void deserializeRealMatrix(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2) throws java.lang.ClassNotFoundException,java.io.IOException{
 MatrixUtils.deserializeRealMatrix(p0,p1,p2);
}
public static void solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException{
 MatrixUtils.solveLowerTriangularSystem(p0,p1);
}
public static void solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException{
 MatrixUtils.solveUpperTriangularSystem(p0,p1);
}
public static void serializeRealVector(org.apache.commons.math3.linear.RealVector p0,java.io.ObjectOutputStream p1) throws java.io.IOException{
 MatrixUtils.serializeRealVector(p0,p1);
}
public static void checkSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1){
 MatrixUtils.checkSymmetric(p0,p1);
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
public static void copy(org.apache.commons.math3.util.ResizableDoubleArray p0,org.apache.commons.math3.util.ResizableDoubleArray p1) throws org.apache.commons.math3.exception.NullArgumentException{
 ResizableDoubleArray.copy(p0,p1);
}
public static void parseAndIgnoreWhitespace(java.lang.String p0,java.text.ParsePosition p1){
 CompositeFormat.parseAndIgnoreWhitespace(p0,p1);
}
public static void checkNotNull(java.lang.Object p0) throws org.apache.commons.math3.exception.NullArgumentException{
 MathUtils.checkNotNull(p0);
}
public static void checkNotNull(java.lang.Object p0,org.apache.commons.math3.exception.util.Localizable p1,java.lang.Object... p2) throws org.apache.commons.math3.exception.NullArgumentException{
 MathUtils.checkNotNull(p0,p1,p2);
}
public static void checkFinite(double[] p0) throws org.apache.commons.math3.exception.NotFiniteNumberException{
 MathUtils.checkFinite(p0);
}
public static void checkFinite(double p0) throws org.apache.commons.math3.exception.NotFiniteNumberException{
 MathUtils.checkFinite(p0);
}
public static void checkBinomial(int p0,int p1) throws org.apache.commons.math3.exception.NumberIsTooLargeException,org.apache.commons.math3.exception.NotPositiveException{
 CombinatoricsUtils.checkBinomial(p0,p1);
}
public static void shuffle(int[] p0){
 MathArrays.shuffle(p0);
}
public static void shuffle(int[] p0,int p1,Position p2,org.apache.commons.math3.random.RandomGenerator p3){
 MathArrays.shuffle(p0,p1,p2,p3);
}
public static void shuffle(int[] p0,org.apache.commons.math3.random.RandomGenerator p1){
 MathArrays.shuffle(p0,p1);
}
public static void shuffle(int[] p0,int p1,Position p2){
 MathArrays.shuffle(p0,p1,p2);
}
public static void checkPositive(double[] p0) throws org.apache.commons.math3.exception.NotStrictlyPositiveException{
 MathArrays.checkPositive(p0);
}
public static void checkNonNegative(long[][] p0) throws org.apache.commons.math3.exception.NotPositiveException{
 MathArrays.checkNonNegative(p0);
}
public static void checkNonNegative(long[] p0) throws org.apache.commons.math3.exception.NotPositiveException{
 MathArrays.checkNonNegative(p0);
}
public static void checkOrder(double[] p0,OrderDirection p1,boolean p2) throws org.apache.commons.math3.exception.NonMonotonicSequenceException{
 MathArrays.checkOrder(p0,p1,p2);
}
public static void checkOrder(double[] p0) throws org.apache.commons.math3.exception.NonMonotonicSequenceException{
 MathArrays.checkOrder(p0);
}
public static void scaleInPlace(double p0,double[] p1){
 MathArrays.scaleInPlace(p0,p1);
}
public static void checkEqualLength(double[] p0,double[] p1){
 MathArrays.checkEqualLength(p0,p1);
}
public static void checkEqualLength(int[] p0,int[] p1){
 MathArrays.checkEqualLength(p0,p1);
}
public static void sortInPlace(double[] p0,OrderDirection p1,double[]... p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException{
 MathArrays.sortInPlace(p0,p1,p2);
}
public static void sortInPlace(double[] p0,double[]... p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NullArgumentException{
 MathArrays.sortInPlace(p0,p1);
}
public static void checkNotNaN(double[] p0) throws org.apache.commons.math3.exception.NotANumberException{
 MathArrays.checkNotNaN(p0);
}
public static void checkRectangular(long[][] p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException{
 MathArrays.checkRectangular(p0);
}
public static void main(java.lang.String[] p0){
 FastMath.main(p0);
}
public static synchronized void setRandomGenerator(org.apache.commons.math3.random.RandomGenerator p0){
 GeneticAlgorithm.setRandomGenerator(p0);
}
public static void transformInPlace(double[][] p0,org.apache.commons.math3.transform.DftNormalization p1,org.apache.commons.math3.transform.TransformType p2){
 FastFourierTransformer.transformInPlace(p0,p1,p2);
}
public static void setProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 LocaleBeanUtils.setProperty(p0,p1,p2,p3);
}
public static void setProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 LocaleBeanUtils.setProperty(p0,p1,p2);
}
public static void setDefaultLocale(java.util.Locale p0){
 LocaleBeanUtils.setDefaultLocale(p0);
}
public static void setApplyLocalized(boolean p0){
 LocaleBeanUtils.setApplyLocalized(p0);
}
public static void setDebug(int p0){
 BeanUtils.setDebug(p0);
}
public static void populate(java.lang.Object p0,java.util.Map<java.lang.String, ?> p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 BeanUtils.populate(p0,p1);
}
public static void copyProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 BeanUtils.copyProperty(p0,p1,p2);
}
public static void setCacheFast(java.util.Map<?, ?> p0,boolean p1){
 BeanUtils.setCacheFast(p0,p1);
}
public static void copyProperties(java.lang.Object p0,java.lang.Object p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 BeanUtils.copyProperties(p0,p1);
}
public static void setInstance(org.apache.commons.beanutils.BeanUtilsBean p0){
 BeanUtilsBean.setInstance(p0);
}
public static void clearDescriptors(){
 PropertyUtils.clearDescriptors();
}
public static void setSimpleProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setSimpleProperty(p0,p1,p2);
}
public static void addBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector p0){
 PropertyUtils.addBeanIntrospector(p0);
}
public static void setNestedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setNestedProperty(p0,p1,p2);
}
public static void resetBeanIntrospectors(){
 PropertyUtils.resetBeanIntrospectors();
}
public static void setIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2,java.lang.Object p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setIndexedProperty(p0,p1,p2,p3);
}
public static void setIndexedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setIndexedProperty(p0,p1,p2);
}
public static void setMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2,java.lang.Object p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setMappedProperty(p0,p1,p2,p3);
}
public static void setMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setMappedProperty(p0,p1,p2);
}
public static synchronized void setCacheMethods(boolean p0){
 MethodUtils.setCacheMethods(p0);
}
public static void register(org.apache.commons.beanutils.locale.LocaleConverter p0,java.lang.Class<?> p1,java.util.Locale p2){
 LocaleConvertUtils.register(p0,p1,p2);
}
public static void deregister(java.lang.Class<?> p0,java.util.Locale p1){
 LocaleConvertUtils.deregister(p0,p1);
}
public static void deregister(){
 LocaleConvertUtils.deregister();
}
public static void deregister(java.util.Locale p0){
 LocaleConvertUtils.deregister(p0);
}
public static void setInstance(org.apache.commons.beanutils.locale.LocaleBeanUtilsBean p0){
 LocaleBeanUtilsBean.setInstance(p0);
}
public static void clear(){
 WrapDynaClass.clear();
}
public static void register(org.apache.commons.beanutils.Converter p0,java.lang.Class<?> p1){
 ConvertUtils.register(p0,p1);
}
public static void setDefaultShort(short p0){
 ConvertUtils.setDefaultShort(p0);
}
public static void setDefaultDouble(double p0){
 ConvertUtils.setDefaultDouble(p0);
}
public static void deregister(java.lang.Class<?> p0){
 ConvertUtils.deregister(p0);
}
public static void setDefaultFloat(float p0){
 ConvertUtils.setDefaultFloat(p0);
}
public static void setDefaultByte(byte p0){
 ConvertUtils.setDefaultByte(p0);
}
public static void setDefaultLong(long p0){
 ConvertUtils.setDefaultLong(p0);
}
public static void setDefaultCharacter(char p0){
 ConvertUtils.setDefaultCharacter(p0);
}
public static void setDefaultInteger(int p0){
 ConvertUtils.setDefaultInteger(p0);
}
public static void setDefaultBoolean(boolean p0){
 ConvertUtils.setDefaultBoolean(p0);
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
public static void mergeSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3){
 BigArrays.mergeSort(p0,p1,p2,p3);
}
public static void ensureFromTo(long p0,long p1,long p2){
 BigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3){
 BigArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(long p0,long p1,long p2){
 BigArrays.ensureOffsetLength(p0,p1,p2);
}
public static void ensureLength(long p0){
 BigArrays.ensureLength(p0);
}
public static void fill(boolean[] p0,int p1,int p2,boolean p3){
 BooleanArrays.fill(p0,p1,p2,p3);
}
public static void fill(boolean[] p0,boolean p1){
 BooleanArrays.fill(p0,p1);
}
public static void swap(boolean[] p0,int p1,int p2,int p3){
 BooleanArrays.swap(p0,p1,p2,p3);
}
public static void swap(boolean[] p0,int p1,int p2){
 BooleanArrays.swap(p0,p1,p2);
}
public static void mergeSort(boolean[] p0){
 BooleanArrays.mergeSort(p0);
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
public static void mergeSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanArrays.mergeSort(p0,p1);
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
public static void quickSort(boolean[] p0,boolean[] p1){
 BooleanArrays.quickSort(p0,p1);
}
public static void quickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanArrays.quickSort(p0,p1);
}
public static void quickSort(boolean[] p0){
 BooleanArrays.quickSort(p0);
}
public static void parallelQuickSort(boolean[] p0,boolean[] p1){
 BooleanArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(boolean[] p0,int p1,int p2){
 BooleanArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(boolean[] p0){
 BooleanArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanArrays.parallelQuickSort(p0,p1);
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
public static void parallelQuickSortIndirect(int[] p0,boolean[] p1){
 BooleanArrays.parallelQuickSortIndirect(p0,p1);
}
public static void quickSortIndirect(int[] p0,boolean[] p1){
 BooleanArrays.quickSortIndirect(p0,p1);
}
public static void quickSortIndirect(int[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.stabilize(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,boolean[] p1){
 BooleanArrays.stabilize(p0,p1);
}
public static void ensureSameLength(boolean[] p0,boolean[] p1){
 BooleanArrays.ensureSameLength(p0,p1);
}
public static void copy(boolean[][] p0,long p1,boolean[][] p2,long p3,long p4){
 BooleanBigArrays.copy(p0,p1,p2,p3,p4);
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
public static void swap(boolean[][] p0,long p1,long p2){
 BooleanBigArrays.swap(p0,p1,p2);
}
public static void ensureFromTo(boolean[][] p0,long p1,long p2){
 BooleanBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(boolean[][] p0,long p1,long p2){
 BooleanBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(boolean[][] p0,long p1,long p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(boolean[][] p0){
 BooleanBigArrays.quickSort(p0);
}
public static void quickSort(boolean[][] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanBigArrays.quickSort(p0,p1);
}
public static void ensureOffsetLength(boolean[][] p0,long p1,long p2){
 BooleanBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static void copyFromBig(boolean[][] p0,long p1,boolean[] p2,int p3,int p4){
 BooleanBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(boolean[] p0,int p1,boolean[][] p2,long p3,long p4){
 BooleanBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2BooleanMap.Entry> p1){
 Byte2BooleanMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2ByteMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2ByteMap.Entry> p1){
 Byte2ByteMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2CharMap.Entry> p1){
 Byte2CharMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2DoubleMap.Entry> p1){
 Byte2DoubleMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2FloatMap.Entry> p1){
 Byte2FloatMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2IntMap.Entry> p1){
 Byte2IntMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2LongMap.Entry> p1){
 Byte2LongMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2ObjectMap.it.unimi.dsi.fastutil.bytes.Byte2ObjectMap.Entry<V>> p1){
 Byte2ObjectMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap.it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap.Entry<V>> p1){
 Byte2ReferenceMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.bytes.Byte2ShortMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.bytes.Byte2ShortMap.Entry> p1){
 Byte2ShortMaps.fastForEach(p0,p1);
}
public static void fill(byte[] p0,int p1,int p2,byte p3){
 ByteArrays.fill(p0,p1,p2,p3);
}
public static void fill(byte[] p0,byte p1){
 ByteArrays.fill(p0,p1);
}
public static void swap(byte[] p0,int p1,int p2){
 ByteArrays.swap(p0,p1,p2);
}
public static void swap(byte[] p0,int p1,int p2,int p3){
 ByteArrays.swap(p0,p1,p2,p3);
}
public static void mergeSort(byte[] p0){
 ByteArrays.mergeSort(p0);
}
public static void mergeSort(byte[] p0,int p1,int p2){
 ByteArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(byte[] p0,int p1,int p2,byte[] p3){
 ByteArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
 ByteArrays.mergeSort(p0,p1);
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
public static void quickSort(byte[] p0,byte[] p1){
 ByteArrays.quickSort(p0,p1);
}
public static void quickSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
 ByteArrays.quickSort(p0,p1);
}
public static void quickSort(byte[] p0,int p1,int p2){
 ByteArrays.quickSort(p0,p1,p2);
}
public static void quickSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(byte[] p0){
 ByteArrays.quickSort(p0);
}
public static void parallelQuickSort(byte[] p0){
 ByteArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(byte[] p0,byte[] p1,int p2,int p3){
 ByteArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(byte[] p0,int p1,int p2){
 ByteArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(byte[] p0,byte[] p1){
 ByteArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(byte[] p0,int p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(byte[] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
 ByteArrays.parallelQuickSort(p0,p1);
}
public static void ensureOffsetLength(byte[] p0,int p1,int p2){
 ByteArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,byte[] p1){
 ByteArrays.parallelQuickSortIndirect(p0,p1);
}
public static void parallelQuickSortIndirect(int[] p0,byte[] p1,int p2,int p3){
 ByteArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,byte[] p1,int p2,int p3){
 ByteArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,byte[] p1){
 ByteArrays.quickSortIndirect(p0,p1);
}
public static void parallelRadixSortIndirect(int[] p0,byte[] p1,boolean p2){
 ByteArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4){
 ByteArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(byte[] p0,byte[] p1,int p2,int p3){
 ByteArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(byte[] p0,byte[] p1){
 ByteArrays.parallelRadixSort(p0,p1);
}
public static void parallelRadixSort(byte[] p0,int p1,int p2){
 ByteArrays.parallelRadixSort(p0,p1,p2);
}
public static void parallelRadixSort(byte[] p0){
 ByteArrays.parallelRadixSort(p0);
}
public static void radixSortIndirect(int[] p0,byte[] p1,byte[] p2,int p3,int p4,boolean p5){
 ByteArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,byte[] p1,byte[] p2,boolean p3){
 ByteArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,byte[] p1,boolean p2){
 ByteArrays.radixSortIndirect(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4){
 ByteArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,byte[] p1,int p2,int p3){
 ByteArrays.stabilize(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,byte[] p1){
 ByteArrays.stabilize(p0,p1);
}
public static void ensureSameLength(byte[] p0,byte[] p1){
 ByteArrays.ensureSameLength(p0,p1);
}
public static void radixSort(byte[] p0,int p1,int p2){
 ByteArrays.radixSort(p0,p1,p2);
}
public static void radixSort(byte[] p0,byte[] p1,int p2,int p3){
 ByteArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(byte[] p0){
 ByteArrays.radixSort(p0);
}
public static void radixSort(byte[] p0,byte[] p1){
 ByteArrays.radixSort(p0,p1);
}
public static void radixSort(byte[][] p0,int p1,int p2){
 ByteArrays.radixSort(p0,p1,p2);
}
public static void radixSort(byte[][] p0){
 ByteArrays.radixSort(p0);
}
public static void add(byte[][] p0,long p1,byte p2){
 ByteBigArrays.add(p0,p1,p2);
}
public static void copy(byte[][] p0,long p1,byte[][] p2,long p3,long p4){
 ByteBigArrays.copy(p0,p1,p2,p3,p4);
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
public static void swap(byte[][] p0,long p1,long p2){
 ByteBigArrays.swap(p0,p1,p2);
}
public static void mul(byte[][] p0,long p1,byte p2){
 ByteBigArrays.mul(p0,p1,p2);
}
public static void ensureFromTo(byte[][] p0,long p1,long p2){
 ByteBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(byte[][] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
 ByteBigArrays.quickSort(p0,p1);
}
public static void quickSort(byte[][] p0,long p1,long p2){
 ByteBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(byte[][] p0){
 ByteBigArrays.quickSort(p0);
}
public static void quickSort(byte[][] p0,long p1,long p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteBigArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(byte[][] p0,long p1,long p2){
 ByteBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static void copyFromBig(byte[][] p0,long p1,byte[] p2,int p3,int p4){
 ByteBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(byte[] p0,int p1,byte[][] p2,long p3,long p4){
 ByteBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void incr(byte[][] p0,long p1){
 ByteBigArrays.incr(p0,p1);
}
public static void radixSort(byte[][] p0,long p1,long p2){
 ByteBigArrays.radixSort(p0,p1,p2);
}
public static void radixSort(byte[][] p0,byte[][] p1,long p2,long p3){
 ByteBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(byte[][] p0,byte[][] p1){
 ByteBigArrays.radixSort(p0,p1);
}
public static void decr(byte[][] p0,long p1){
 ByteBigArrays.decr(p0,p1);
}
public static void makeHeap(byte[] p0,int p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
 ByteHeaps.makeHeap(p0,p1,p2);
}
public static void makeHeap(byte[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.bytes.ByteComparator p5){
 ByteIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(byte[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
 ByteIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(byte[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
 ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(byte[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
 ByteSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2BooleanMap.Entry> p1){
 Char2BooleanMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2ByteMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2ByteMap.Entry> p1){
 Char2ByteMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2CharMap.Entry> p1){
 Char2CharMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2DoubleMap.Entry> p1){
 Char2DoubleMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2FloatMap.Entry> p1){
 Char2FloatMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2IntMap.Entry> p1){
 Char2IntMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2LongMap.Entry> p1){
 Char2LongMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2ObjectMap.it.unimi.dsi.fastutil.chars.Char2ObjectMap.Entry<V>> p1){
 Char2ObjectMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2ReferenceMap.it.unimi.dsi.fastutil.chars.Char2ReferenceMap.Entry<V>> p1){
 Char2ReferenceMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2ShortMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2ShortMap.Entry> p1){
 Char2ShortMaps.fastForEach(p0,p1);
}
public static void fill(char[] p0,int p1,int p2,char p3){
 CharArrays.fill(p0,p1,p2,p3);
}
public static void fill(char[] p0,char p1){
 CharArrays.fill(p0,p1);
}
public static void swap(char[] p0,int p1,int p2){
 CharArrays.swap(p0,p1,p2);
}
public static void swap(char[] p0,int p1,int p2,int p3){
 CharArrays.swap(p0,p1,p2,p3);
}
public static void mergeSort(char[] p0){
 CharArrays.mergeSort(p0);
}
public static void mergeSort(char[] p0,int p1,int p2){
 CharArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(char[] p0,int p1,int p2,char[] p3){
 CharArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
 CharArrays.mergeSort(p0,p1);
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
public static void quickSort(char[] p0,char[] p1){
 CharArrays.quickSort(p0,p1);
}
public static void quickSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
 CharArrays.quickSort(p0,p1);
}
public static void quickSort(char[] p0,int p1,int p2){
 CharArrays.quickSort(p0,p1,p2);
}
public static void quickSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(char[] p0){
 CharArrays.quickSort(p0);
}
public static void parallelQuickSort(char[] p0){
 CharArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(char[] p0,int p1,int p2){
 CharArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(char[] p0,char[] p1){
 CharArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
 CharArrays.parallelQuickSort(p0,p1);
}
public static void ensureOffsetLength(char[] p0,int p1,int p2){
 CharArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,char[] p1){
 CharArrays.parallelQuickSortIndirect(p0,p1);
}
public static void parallelQuickSortIndirect(int[] p0,char[] p1,int p2,int p3){
 CharArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,char[] p1,int p2,int p3){
 CharArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,char[] p1){
 CharArrays.quickSortIndirect(p0,p1);
}
public static void parallelRadixSortIndirect(int[] p0,char[] p1,boolean p2){
 CharArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
 CharArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(char[] p0,char[] p1){
 CharArrays.parallelRadixSort(p0,p1);
}
public static void parallelRadixSort(char[] p0,int p1,int p2){
 CharArrays.parallelRadixSort(p0,p1,p2);
}
public static void parallelRadixSort(char[] p0){
 CharArrays.parallelRadixSort(p0);
}
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,int p3,int p4,boolean p5){
 CharArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,boolean p3){
 CharArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,char[] p1,boolean p2){
 CharArrays.radixSortIndirect(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
 CharArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,char[] p1,int p2,int p3){
 CharArrays.stabilize(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,char[] p1){
 CharArrays.stabilize(p0,p1);
}
public static void ensureSameLength(char[] p0,char[] p1){
 CharArrays.ensureSameLength(p0,p1);
}
public static void radixSort(char[] p0,int p1,int p2){
 CharArrays.radixSort(p0,p1,p2);
}
public static void radixSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(char[] p0){
 CharArrays.radixSort(p0);
}
public static void radixSort(char[] p0,char[] p1){
 CharArrays.radixSort(p0,p1);
}
public static void radixSort(char[][] p0,int p1,int p2){
 CharArrays.radixSort(p0,p1,p2);
}
public static void radixSort(char[][] p0){
 CharArrays.radixSort(p0);
}
public static void add(char[][] p0,long p1,char p2){
 CharBigArrays.add(p0,p1,p2);
}
public static void copy(char[][] p0,long p1,char[][] p2,long p3,long p4){
 CharBigArrays.copy(p0,p1,p2,p3,p4);
}
public static void set(char[][] p0,long p1,char p2){
 CharBigArrays.set(p0,p1,p2);
}
public static void fill(char[][] p0,char p1){
 CharBigArrays.fill(p0,p1);
}
public static void fill(char[][] p0,long p1,long p2,char p3){
 CharBigArrays.fill(p0,p1,p2,p3);
}
public static void swap(char[][] p0,long p1,long p2){
 CharBigArrays.swap(p0,p1,p2);
}
public static void mul(char[][] p0,long p1,char p2){
 CharBigArrays.mul(p0,p1,p2);
}
public static void ensureFromTo(char[][] p0,long p1,long p2){
 CharBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(char[][] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
 CharBigArrays.quickSort(p0,p1);
}
public static void quickSort(char[][] p0,long p1,long p2){
 CharBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(char[][] p0){
 CharBigArrays.quickSort(p0);
}
public static void quickSort(char[][] p0,long p1,long p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharBigArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(char[][] p0,long p1,long p2){
 CharBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static void copyFromBig(char[][] p0,long p1,char[] p2,int p3,int p4){
 CharBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(char[] p0,int p1,char[][] p2,long p3,long p4){
 CharBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void incr(char[][] p0,long p1){
 CharBigArrays.incr(p0,p1);
}
public static void radixSort(char[][] p0,long p1,long p2){
 CharBigArrays.radixSort(p0,p1,p2);
}
public static void radixSort(char[][] p0,char[][] p1,long p2,long p3){
 CharBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(char[][] p0,char[][] p1){
 CharBigArrays.radixSort(p0,p1);
}
public static void decr(char[][] p0,long p1){
 CharBigArrays.decr(p0,p1);
}
public static void makeHeap(char[] p0,int p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
 CharHeaps.makeHeap(p0,p1,p2);
}
public static void makeHeap(char[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.chars.CharComparator p5){
 CharIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(char[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
 CharIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(char[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(char[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
 CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2BooleanMap.Entry> p1){
 Double2BooleanMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2ByteMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2ByteMap.Entry> p1){
 Double2ByteMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2CharMap.Entry> p1){
 Double2CharMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2DoubleMap.Entry> p1){
 Double2DoubleMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2FloatMap.Entry> p1){
 Double2FloatMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2IntMap.Entry> p1){
 Double2IntMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2LongMap.Entry> p1){
 Double2LongMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2ObjectMap.it.unimi.dsi.fastutil.doubles.Double2ObjectMap.Entry<V>> p1){
 Double2ObjectMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2ReferenceMap.it.unimi.dsi.fastutil.doubles.Double2ReferenceMap.Entry<V>> p1){
 Double2ReferenceMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.doubles.Double2ShortMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.doubles.Double2ShortMap.Entry> p1){
 Double2ShortMaps.fastForEach(p0,p1);
}
public static void fill(double[] p0,double p1){
 DoubleArrays.fill(p0,p1);
}
public static void fill(double[] p0,int p1,int p2,double p3){
 DoubleArrays.fill(p0,p1,p2,p3);
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
public static void mergeSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
 DoubleArrays.mergeSort(p0,p1);
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
public static void mergeSort(double[] p0){
 DoubleArrays.mergeSort(p0);
}
public static void ensureFromTo(double[] p0,int p1,int p2){
 DoubleArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(double[] p0,double[] p1){
 DoubleArrays.quickSort(p0,p1);
}
public static void quickSort(double[] p0){
 DoubleArrays.quickSort(p0);
}
public static void quickSort(double[] p0,int p1,int p2){
 DoubleArrays.quickSort(p0,p1,p2);
}
public static void quickSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
 DoubleArrays.quickSort(p0,p1);
}
public static void quickSort(double[] p0,double[] p1,int p2,int p3){
 DoubleArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(double[] p0,double[] p1,int p2,int p3){
 DoubleArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(double[] p0){
 DoubleArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(double[] p0,int p1,int p2){
 DoubleArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(double[] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
 DoubleArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(double[] p0,int p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(double[] p0,double[] p1){
 DoubleArrays.parallelQuickSort(p0,p1);
}
public static void ensureOffsetLength(double[] p0,int p1,int p2){
 DoubleArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,double[] p1,int p2,int p3){
 DoubleArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void parallelQuickSortIndirect(int[] p0,double[] p1){
 DoubleArrays.parallelQuickSortIndirect(p0,p1);
}
public static void quickSortIndirect(int[] p0,double[] p1){
 DoubleArrays.quickSortIndirect(p0,p1);
}
public static void quickSortIndirect(int[] p0,double[] p1,int p2,int p3){
 DoubleArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void parallelRadixSortIndirect(int[] p0,double[] p1,boolean p2){
 DoubleArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4){
 DoubleArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(double[] p0,double[] p1){
 DoubleArrays.parallelRadixSort(p0,p1);
}
public static void parallelRadixSort(double[] p0,double[] p1,int p2,int p3){
 DoubleArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(double[] p0){
 DoubleArrays.parallelRadixSort(p0);
}
public static void parallelRadixSort(double[] p0,int p1,int p2){
 DoubleArrays.parallelRadixSort(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,double[] p1,double[] p2,boolean p3){
 DoubleArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,double[] p1,double[] p2,int p3,int p4,boolean p5){
 DoubleArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,double[] p1,boolean p2){
 DoubleArrays.radixSortIndirect(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4){
 DoubleArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,double[] p1,int p2,int p3){
 DoubleArrays.stabilize(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,double[] p1){
 DoubleArrays.stabilize(p0,p1);
}
public static void ensureSameLength(double[] p0,double[] p1){
 DoubleArrays.ensureSameLength(p0,p1);
}
public static void radixSort(double[] p0,double[] p1){
 DoubleArrays.radixSort(p0,p1);
}
public static void radixSort(double[] p0,int p1,int p2){
 DoubleArrays.radixSort(p0,p1,p2);
}
public static void radixSort(double[] p0){
 DoubleArrays.radixSort(p0);
}
public static void radixSort(double[] p0,double[] p1,int p2,int p3){
 DoubleArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(double[][] p0,int p1,int p2){
 DoubleArrays.radixSort(p0,p1,p2);
}
public static void radixSort(double[][] p0){
 DoubleArrays.radixSort(p0);
}
public static void add(double[][] p0,long p1,double p2){
 DoubleBigArrays.add(p0,p1,p2);
}
public static void copy(double[][] p0,long p1,double[][] p2,long p3,long p4){
 DoubleBigArrays.copy(p0,p1,p2,p3,p4);
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
public static void swap(double[][] p0,long p1,long p2){
 DoubleBigArrays.swap(p0,p1,p2);
}
public static void mul(double[][] p0,long p1,double p2){
 DoubleBigArrays.mul(p0,p1,p2);
}
public static void ensureFromTo(double[][] p0,long p1,long p2){
 DoubleBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(double[][] p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
 DoubleBigArrays.quickSort(p0,p1);
}
public static void quickSort(double[][] p0){
 DoubleBigArrays.quickSort(p0);
}
public static void quickSort(double[][] p0,long p1,long p2){
 DoubleBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(double[][] p0,long p1,long p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleBigArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(double[][] p0,long p1,long p2){
 DoubleBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static void copyFromBig(double[][] p0,long p1,double[] p2,int p3,int p4){
 DoubleBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(double[] p0,int p1,double[][] p2,long p3,long p4){
 DoubleBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void incr(double[][] p0,long p1){
 DoubleBigArrays.incr(p0,p1);
}
public static void radixSort(double[][] p0,double[][] p1){
 DoubleBigArrays.radixSort(p0,p1);
}
public static void radixSort(double[][] p0,double[][] p1,long p2,long p3){
 DoubleBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(double[][] p0,long p1,long p2){
 DoubleBigArrays.radixSort(p0,p1,p2);
}
public static void decr(double[][] p0,long p1){
 DoubleBigArrays.decr(p0,p1);
}
public static void makeHeap(double[] p0,int p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
 DoubleHeaps.makeHeap(p0,p1,p2);
}
public static void makeHeap(double[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.doubles.DoubleComparator p5){
 DoubleIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(double[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
 DoubleIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(double[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.doubles.DoubleComparator p3){
 DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(double[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.doubles.DoubleComparator p4){
 DoubleSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2BooleanMap.Entry> p1){
 Float2BooleanMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2ByteMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2ByteMap.Entry> p1){
 Float2ByteMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2CharMap.Entry> p1){
 Float2CharMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2DoubleMap.Entry> p1){
 Float2DoubleMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2FloatMap.Entry> p1){
 Float2FloatMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2IntMap.Entry> p1){
 Float2IntMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2LongMap.Entry> p1){
 Float2LongMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2ObjectMap.it.unimi.dsi.fastutil.floats.Float2ObjectMap.Entry<V>> p1){
 Float2ObjectMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2ReferenceMap.it.unimi.dsi.fastutil.floats.Float2ReferenceMap.Entry<V>> p1){
 Float2ReferenceMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.floats.Float2ShortMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.floats.Float2ShortMap.Entry> p1){
 Float2ShortMaps.fastForEach(p0,p1);
}
public static void fill(float[] p0,float p1){
 FloatArrays.fill(p0,p1);
}
public static void fill(float[] p0,int p1,int p2,float p3){
 FloatArrays.fill(p0,p1,p2,p3);
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
public static void mergeSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatArrays.mergeSort(p0,p1);
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
public static void mergeSort(float[] p0){
 FloatArrays.mergeSort(p0);
}
public static void ensureFromTo(float[] p0,int p1,int p2){
 FloatArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(float[] p0,float[] p1){
 FloatArrays.quickSort(p0,p1);
}
public static void quickSort(float[] p0){
 FloatArrays.quickSort(p0);
}
public static void quickSort(float[] p0,int p1,int p2){
 FloatArrays.quickSort(p0,p1,p2);
}
public static void quickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatArrays.quickSort(p0,p1);
}
public static void quickSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(float[] p0){
 FloatArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(float[] p0,int p1,int p2){
 FloatArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(float[] p0,float[] p1){
 FloatArrays.parallelQuickSort(p0,p1);
}
public static void ensureOffsetLength(float[] p0,int p1,int p2){
 FloatArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,float[] p1,int p2,int p3){
 FloatArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void parallelQuickSortIndirect(int[] p0,float[] p1){
 FloatArrays.parallelQuickSortIndirect(p0,p1);
}
public static void quickSortIndirect(int[] p0,float[] p1){
 FloatArrays.quickSortIndirect(p0,p1);
}
public static void quickSortIndirect(int[] p0,float[] p1,int p2,int p3){
 FloatArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void parallelRadixSortIndirect(int[] p0,float[] p1,boolean p2){
 FloatArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
 FloatArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(float[] p0,float[] p1){
 FloatArrays.parallelRadixSort(p0,p1);
}
public static void parallelRadixSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(float[] p0){
 FloatArrays.parallelRadixSort(p0);
}
public static void parallelRadixSort(float[] p0,int p1,int p2){
 FloatArrays.parallelRadixSort(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,boolean p3){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,int p3,int p4,boolean p5){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,float[] p1,boolean p2){
 FloatArrays.radixSortIndirect(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,float[] p1,int p2,int p3){
 FloatArrays.stabilize(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,float[] p1){
 FloatArrays.stabilize(p0,p1);
}
public static void ensureSameLength(float[] p0,float[] p1){
 FloatArrays.ensureSameLength(p0,p1);
}
public static void radixSort(float[] p0,float[] p1){
 FloatArrays.radixSort(p0,p1);
}
public static void radixSort(float[] p0,int p1,int p2){
 FloatArrays.radixSort(p0,p1,p2);
}
public static void radixSort(float[] p0){
 FloatArrays.radixSort(p0);
}
public static void radixSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(float[][] p0,int p1,int p2){
 FloatArrays.radixSort(p0,p1,p2);
}
public static void radixSort(float[][] p0){
 FloatArrays.radixSort(p0);
}
public static void add(float[][] p0,long p1,float p2){
 FloatBigArrays.add(p0,p1,p2);
}
public static void copy(float[][] p0,long p1,float[][] p2,long p3,long p4){
 FloatBigArrays.copy(p0,p1,p2,p3,p4);
}
public static void set(float[][] p0,long p1,float p2){
 FloatBigArrays.set(p0,p1,p2);
}
public static void fill(float[][] p0,float p1){
 FloatBigArrays.fill(p0,p1);
}
public static void fill(float[][] p0,long p1,long p2,float p3){
 FloatBigArrays.fill(p0,p1,p2,p3);
}
public static void swap(float[][] p0,long p1,long p2){
 FloatBigArrays.swap(p0,p1,p2);
}
public static void mul(float[][] p0,long p1,float p2){
 FloatBigArrays.mul(p0,p1,p2);
}
public static void ensureFromTo(float[][] p0,long p1,long p2){
 FloatBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(float[][] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatBigArrays.quickSort(p0,p1);
}
public static void quickSort(float[][] p0){
 FloatBigArrays.quickSort(p0);
}
public static void quickSort(float[][] p0,long p1,long p2){
 FloatBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(float[][] p0,long p1,long p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatBigArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(float[][] p0,long p1,long p2){
 FloatBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static void copyFromBig(float[][] p0,long p1,float[] p2,int p3,int p4){
 FloatBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(float[] p0,int p1,float[][] p2,long p3,long p4){
 FloatBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void incr(float[][] p0,long p1){
 FloatBigArrays.incr(p0,p1);
}
public static void radixSort(float[][] p0,float[][] p1){
 FloatBigArrays.radixSort(p0,p1);
}
public static void radixSort(float[][] p0,float[][] p1,long p2,long p3){
 FloatBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(float[][] p0,long p1,long p2){
 FloatBigArrays.radixSort(p0,p1,p2);
}
public static void decr(float[][] p0,long p1){
 FloatBigArrays.decr(p0,p1);
}
public static void makeHeap(float[] p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
 FloatHeaps.makeHeap(p0,p1,p2);
}
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
 FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(float[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
 FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(float[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
 FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2BooleanMap.Entry> p1){
 Int2BooleanMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2ByteMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2ByteMap.Entry> p1){
 Int2ByteMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2CharMap.Entry> p1){
 Int2CharMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2DoubleMap.Entry> p1){
 Int2DoubleMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2FloatMap.Entry> p1){
 Int2FloatMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2IntMap.Entry> p1){
 Int2IntMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2LongMap.Entry> p1){
 Int2LongMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2ObjectMap.it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry<V>> p1){
 Int2ObjectMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2ReferenceMap.it.unimi.dsi.fastutil.ints.Int2ReferenceMap.Entry<V>> p1){
 Int2ReferenceMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.ints.Int2ShortMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.ints.Int2ShortMap.Entry> p1){
 Int2ShortMaps.fastForEach(p0,p1);
}
public static void fill(int[] p0,int p1,int p2,int p3){
 IntArrays.fill(p0,p1,p2,p3);
}
public static void fill(int[] p0,int p1){
 IntArrays.fill(p0,p1);
}
public static void swap(int[] p0,int p1,int p2){
 IntArrays.swap(p0,p1,p2);
}
public static void swap(int[] p0,int p1,int p2,int p3){
 IntArrays.swap(p0,p1,p2,p3);
}
public static void mergeSort(int[] p0){
 IntArrays.mergeSort(p0);
}
public static void mergeSort(int[] p0,int p1,int p2){
 IntArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(int[] p0,int p1,int p2,int[] p3){
 IntArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(int[] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
 IntArrays.mergeSort(p0,p1);
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
public static void quickSort(int[] p0,int[] p1){
 IntArrays.quickSort(p0,p1);
}
public static void quickSort(int[] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
 IntArrays.quickSort(p0,p1);
}
public static void quickSort(int[] p0,int p1,int p2){
 IntArrays.quickSort(p0,p1,p2);
}
public static void quickSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(int[] p0){
 IntArrays.quickSort(p0);
}
public static void parallelQuickSort(int[] p0){
 IntArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(int[] p0,int[] p1,int p2,int p3){
 IntArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(int[] p0,int p1,int p2){
 IntArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(int[] p0,int[] p1){
 IntArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(int[] p0,int p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(int[] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
 IntArrays.parallelQuickSort(p0,p1);
}
public static void ensureOffsetLength(int[] p0,int p1,int p2){
 IntArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,int[] p1){
 IntArrays.parallelQuickSortIndirect(p0,p1);
}
public static void parallelQuickSortIndirect(int[] p0,int[] p1,int p2,int p3){
 IntArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,int[] p1,int p2,int p3){
 IntArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,int[] p1){
 IntArrays.quickSortIndirect(p0,p1);
}
public static void parallelRadixSortIndirect(int[] p0,int[] p1,boolean p2){
 IntArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4){
 IntArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(int[] p0,int[] p1,int p2,int p3){
 IntArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(int[] p0,int[] p1){
 IntArrays.parallelRadixSort(p0,p1);
}
public static void parallelRadixSort(int[] p0,int p1,int p2){
 IntArrays.parallelRadixSort(p0,p1,p2);
}
public static void parallelRadixSort(int[] p0){
 IntArrays.parallelRadixSort(p0);
}
public static void radixSortIndirect(int[] p0,int[] p1,int[] p2,int p3,int p4,boolean p5){
 IntArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,int[] p1,int[] p2,boolean p3){
 IntArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,int[] p1,boolean p2){
 IntArrays.radixSortIndirect(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4){
 IntArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,int[] p1,int p2,int p3){
 IntArrays.stabilize(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,int[] p1){
 IntArrays.stabilize(p0,p1);
}
public static void ensureSameLength(int[] p0,int[] p1){
 IntArrays.ensureSameLength(p0,p1);
}
public static void radixSort(int[] p0,int p1,int p2){
 IntArrays.radixSort(p0,p1,p2);
}
public static void radixSort(int[] p0,int[] p1,int p2,int p3){
 IntArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(int[] p0){
 IntArrays.radixSort(p0);
}
public static void radixSort(int[] p0,int[] p1){
 IntArrays.radixSort(p0,p1);
}
public static void radixSort(int[][] p0,int p1,int p2){
 IntArrays.radixSort(p0,p1,p2);
}
public static void radixSort(int[][] p0){
 IntArrays.radixSort(p0);
}
public static void add(int[][] p0,long p1,int p2){
 IntBigArrays.add(p0,p1,p2);
}
public static void copy(int[][] p0,long p1,int[][] p2,long p3,long p4){
 IntBigArrays.copy(p0,p1,p2,p3,p4);
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
public static void swap(int[][] p0,long p1,long p2){
 IntBigArrays.swap(p0,p1,p2);
}
public static void mul(int[][] p0,long p1,int p2){
 IntBigArrays.mul(p0,p1,p2);
}
public static void ensureFromTo(int[][] p0,long p1,long p2){
 IntBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(int[][] p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
 IntBigArrays.quickSort(p0,p1);
}
public static void quickSort(int[][] p0,long p1,long p2){
 IntBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(int[][] p0){
 IntBigArrays.quickSort(p0);
}
public static void quickSort(int[][] p0,long p1,long p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntBigArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(int[][] p0,long p1,long p2){
 IntBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static void copyFromBig(int[][] p0,long p1,int[] p2,int p3,int p4){
 IntBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(int[] p0,int p1,int[][] p2,long p3,long p4){
 IntBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void incr(int[][] p0,long p1){
 IntBigArrays.incr(p0,p1);
}
public static void radixSort(int[][] p0,long p1,long p2){
 IntBigArrays.radixSort(p0,p1,p2);
}
public static void radixSort(int[][] p0,int[][] p1,long p2,long p3){
 IntBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(int[][] p0,int[][] p1){
 IntBigArrays.radixSort(p0,p1);
}
public static void decr(int[][] p0,long p1){
 IntBigArrays.decr(p0,p1);
}
public static void makeHeap(int[] p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
 IntHeaps.makeHeap(p0,p1,p2);
}
public static void makeHeap(int[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.ints.IntComparator p5){
 IntIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(int[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
 IntIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(int[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.ints.IntComparator p3){
 IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(int[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.ints.IntComparator p4){
 IntSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void storeShorts(short[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeObject(java.lang.Object p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeObject(p0,p1);
}
public static void storeObject(java.lang.Object p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeObject(p0,p1);
}
public static void storeObject(java.lang.Object p0,java.io.OutputStream p1) throws java.io.IOException{
 BinIO.storeObject(p0,p1);
}
public static void storeBooleans(boolean[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,java.io.OutputStream p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.OutputStream p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.OutputStream p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeLongs(long[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeInts(int[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeChars(char[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeDoubles(double[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,java.io.PrintStream p1){
 TextIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.PrintStream p1){
 TextIO.storeShorts(p0,p1);
}
public static void storeShorts(short[] p0,java.io.PrintStream p1){
 TextIO.storeShorts(p0,p1);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.PrintStream p1){
 TextIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,java.io.PrintStream p1){
 TextIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[][] p0,java.io.PrintStream p1){
 TextIO.storeBooleans(p0,p1);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,java.io.PrintStream p1){
 TextIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[] p0,java.io.PrintStream p1){
 TextIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.PrintStream p1){
 TextIO.storeBytes(p0,p1);
}
public static void storeLongs(long[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[] p0,java.io.PrintStream p1){
 TextIO.storeLongs(p0,p1);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,java.io.PrintStream p1){
 TextIO.storeLongs(p0,p1);
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.PrintStream p1){
 TextIO.storeLongs(p0,p1);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.PrintStream p1){
 TextIO.storeInts(p0,p1);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,java.io.PrintStream p1){
 TextIO.storeInts(p0,p1);
}
public static void storeInts(int[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[] p0,java.io.PrintStream p1){
 TextIO.storeInts(p0,p1);
}
public static void storeFloats(float[] p0,java.io.PrintStream p1){
 TextIO.storeFloats(p0,p1);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[][] p0,java.io.PrintStream p1){
 TextIO.storeFloats(p0,p1);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.PrintStream p1){
 TextIO.storeFloats(p0,p1);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.PrintStream p1){
 TextIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.PrintStream p3){
 TextIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(double[][] p0,java.io.PrintStream p1){
 TextIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[] p0,java.io.PrintStream p1){
 TextIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeDoubles(p0,p1,p2,p3);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2BooleanMap.Entry> p1){
 Long2BooleanMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2ByteMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry> p1){
 Long2ByteMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2CharMap.Entry> p1){
 Long2CharMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2DoubleMap.Entry> p1){
 Long2DoubleMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2FloatMap.Entry> p1){
 Long2FloatMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2IntMap.Entry> p1){
 Long2IntMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2LongMap.Entry> p1){
 Long2LongMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2ObjectMap.it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry<V>> p1){
 Long2ObjectMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2ReferenceMap.it.unimi.dsi.fastutil.longs.Long2ReferenceMap.Entry<V>> p1){
 Long2ReferenceMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.longs.Long2ShortMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.longs.Long2ShortMap.Entry> p1){
 Long2ShortMaps.fastForEach(p0,p1);
}
public static void fill(long[] p0,int p1,int p2,long p3){
 LongArrays.fill(p0,p1,p2,p3);
}
public static void fill(long[] p0,long p1){
 LongArrays.fill(p0,p1);
}
public static void swap(long[] p0,int p1,int p2){
 LongArrays.swap(p0,p1,p2);
}
public static void swap(long[] p0,int p1,int p2,int p3){
 LongArrays.swap(p0,p1,p2,p3);
}
public static void mergeSort(long[] p0){
 LongArrays.mergeSort(p0);
}
public static void mergeSort(long[] p0,int p1,int p2){
 LongArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(long[] p0,int p1,int p2,long[] p3){
 LongArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
 LongArrays.mergeSort(p0,p1);
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
public static void quickSort(long[] p0,long[] p1){
 LongArrays.quickSort(p0,p1);
}
public static void quickSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
 LongArrays.quickSort(p0,p1);
}
public static void quickSort(long[] p0,int p1,int p2){
 LongArrays.quickSort(p0,p1,p2);
}
public static void quickSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(long[] p0){
 LongArrays.quickSort(p0);
}
public static void parallelQuickSort(long[] p0){
 LongArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(long[] p0,long[] p1,int p2,int p3){
 LongArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(long[] p0,int p1,int p2){
 LongArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(long[] p0,long[] p1){
 LongArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(long[] p0,int p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(long[] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
 LongArrays.parallelQuickSort(p0,p1);
}
public static void ensureOffsetLength(long[] p0,int p1,int p2){
 LongArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,long[] p1){
 LongArrays.parallelQuickSortIndirect(p0,p1);
}
public static void parallelQuickSortIndirect(int[] p0,long[] p1,int p2,int p3){
 LongArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,long[] p1,int p2,int p3){
 LongArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,long[] p1){
 LongArrays.quickSortIndirect(p0,p1);
}
public static void parallelRadixSortIndirect(int[] p0,long[] p1,boolean p2){
 LongArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4){
 LongArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(long[] p0,long[] p1,int p2,int p3){
 LongArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(long[] p0,long[] p1){
 LongArrays.parallelRadixSort(p0,p1);
}
public static void parallelRadixSort(long[] p0,int p1,int p2){
 LongArrays.parallelRadixSort(p0,p1,p2);
}
public static void parallelRadixSort(long[] p0){
 LongArrays.parallelRadixSort(p0);
}
public static void radixSortIndirect(int[] p0,long[] p1,long[] p2,int p3,int p4,boolean p5){
 LongArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,long[] p1,long[] p2,boolean p3){
 LongArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,long[] p1,boolean p2){
 LongArrays.radixSortIndirect(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4){
 LongArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,long[] p1,int p2,int p3){
 LongArrays.stabilize(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,long[] p1){
 LongArrays.stabilize(p0,p1);
}
public static void ensureSameLength(long[] p0,long[] p1){
 LongArrays.ensureSameLength(p0,p1);
}
public static void radixSort(long[] p0,int p1,int p2){
 LongArrays.radixSort(p0,p1,p2);
}
public static void radixSort(long[] p0,long[] p1,int p2,int p3){
 LongArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(long[] p0){
 LongArrays.radixSort(p0);
}
public static void radixSort(long[] p0,long[] p1){
 LongArrays.radixSort(p0,p1);
}
public static void radixSort(long[][] p0,int p1,int p2){
 LongArrays.radixSort(p0,p1,p2);
}
public static void radixSort(long[][] p0){
 LongArrays.radixSort(p0);
}
public static void add(long[][] p0,long p1,long p2){
 LongBigArrays.add(p0,p1,p2);
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
public static void swap(long[][] p0,long p1,long p2){
 LongBigArrays.swap(p0,p1,p2);
}
public static void mul(long[][] p0,long p1,long p2){
 LongBigArrays.mul(p0,p1,p2);
}
public static void ensureFromTo(long[][] p0,long p1,long p2){
 LongBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(long[][] p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
 LongBigArrays.quickSort(p0,p1);
}
public static void quickSort(long[][] p0,long p1,long p2){
 LongBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(long[][] p0){
 LongBigArrays.quickSort(p0);
}
public static void quickSort(long[][] p0,long p1,long p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongBigArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(long[][] p0,long p1,long p2){
 LongBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static void copyFromBig(long[][] p0,long p1,long[] p2,int p3,int p4){
 LongBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(long[] p0,int p1,long[][] p2,long p3,long p4){
 LongBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void incr(long[][] p0,long p1){
 LongBigArrays.incr(p0,p1);
}
public static void radixSort(long[][] p0,long p1,long p2){
 LongBigArrays.radixSort(p0,p1,p2);
}
public static void radixSort(long[][] p0,long[][] p1,long p2,long p3){
 LongBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(long[][] p0,long[][] p1){
 LongBigArrays.radixSort(p0,p1);
}
public static void decr(long[][] p0,long p1){
 LongBigArrays.decr(p0,p1);
}
public static void makeHeap(long[] p0,int p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
 LongHeaps.makeHeap(p0,p1,p2);
}
public static void makeHeap(long[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.longs.LongComparator p5){
 LongIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(long[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
 LongIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(long[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.longs.LongComparator p3){
 LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(long[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.longs.LongComparator p4){
 LongSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Object2BooleanMap.it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry<K>> p1){
 Object2BooleanMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Object2ByteMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Object2ByteMap.it.unimi.dsi.fastutil.objects.Object2ByteMap.Entry<K>> p1){
 Object2ByteMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Object2CharMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Object2CharMap.it.unimi.dsi.fastutil.objects.Object2CharMap.Entry<K>> p1){
 Object2CharMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Object2DoubleMap.it.unimi.dsi.fastutil.objects.Object2DoubleMap.Entry<K>> p1){
 Object2DoubleMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Object2FloatMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Object2FloatMap.it.unimi.dsi.fastutil.objects.Object2FloatMap.Entry<K>> p1){
 Object2FloatMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Object2IntMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Object2IntMap.it.unimi.dsi.fastutil.objects.Object2IntMap.Entry<K>> p1){
 Object2IntMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Object2LongMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Object2LongMap.it.unimi.dsi.fastutil.objects.Object2LongMap.Entry<K>> p1){
 Object2LongMaps.fastForEach(p0,p1);
}
public static <K,V> void fastForEach(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Object2ObjectMap.it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<K, V>> p1){
 Object2ObjectMaps.fastForEach(p0,p1);
}
public static <K,V> void fastForEach(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Object2ReferenceMap.it.unimi.dsi.fastutil.objects.Object2ReferenceMap.Entry<K, V>> p1){
 Object2ReferenceMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Object2ShortMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Object2ShortMap.it.unimi.dsi.fastutil.objects.Object2ShortMap.Entry<K>> p1){
 Object2ShortMaps.fastForEach(p0,p1);
}
public static <K> void fill(K[] p0,K p1){
 ObjectArrays.fill(p0,p1);
}
public static <K> void fill(K[] p0,int p1,int p2,K p3){
 ObjectArrays.fill(p0,p1,p2,p3);
}
public static <K> void swap(K[] p0,int p1,int p2,int p3){
 ObjectArrays.swap(p0,p1,p2,p3);
}
public static <K> void swap(K[] p0,int p1,int p2){
 ObjectArrays.swap(p0,p1,p2);
}
public static <K> void mergeSort(K[] p0){
 ObjectArrays.mergeSort(p0);
}
public static <K> void mergeSort(K[] p0,int p1,int p2,java.util.Comparator<K> p3,K[] p4){
 ObjectArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static <K> void mergeSort(K[] p0,int p1,int p2,java.util.Comparator<K> p3){
 ObjectArrays.mergeSort(p0,p1,p2,p3);
}
public static <K> void mergeSort(K[] p0,java.util.Comparator<K> p1){
 ObjectArrays.mergeSort(p0,p1);
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
public static <K> void quickSort(K[] p0,K[] p1){
 ObjectArrays.quickSort(p0,p1);
}
public static <K> void quickSort(K[] p0,int p1,int p2){
 ObjectArrays.quickSort(p0,p1,p2);
}
public static <K> void quickSort(K[] p0){
 ObjectArrays.quickSort(p0);
}
public static <K> void quickSort(K[] p0,java.util.Comparator<K> p1){
 ObjectArrays.quickSort(p0,p1);
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
public static <K> void parallelQuickSort(K[] p0,java.util.Comparator<K> p1){
 ObjectArrays.parallelQuickSort(p0,p1);
}
public static <K> void parallelQuickSort(K[] p0){
 ObjectArrays.parallelQuickSort(p0);
}
public static <K> void parallelQuickSort(K[] p0,K[] p1,int p2,int p3){
 ObjectArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static <K> void parallelQuickSort(K[] p0,K[] p1){
 ObjectArrays.parallelQuickSort(p0,p1);
}
public static <K> void parallelQuickSort(K[] p0,int p1,int p2){
 ObjectArrays.parallelQuickSort(p0,p1,p2);
}
public static <K> void ensureOffsetLength(K[] p0,int p1,int p2){
 ObjectArrays.ensureOffsetLength(p0,p1,p2);
}
public static <K> void parallelQuickSortIndirect(int[] p0,K[] p1){
 ObjectArrays.parallelQuickSortIndirect(p0,p1);
}
public static <K> void parallelQuickSortIndirect(int[] p0,K[] p1,int p2,int p3){
 ObjectArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static <K> void quickSortIndirect(int[] p0,K[] p1,int p2,int p3){
 ObjectArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static <K> void quickSortIndirect(int[] p0,K[] p1){
 ObjectArrays.quickSortIndirect(p0,p1);
}
public static <K> void stabilize(int[] p0,K[] p1){
 ObjectArrays.stabilize(p0,p1);
}
public static <K> void stabilize(int[] p0,K[] p1,int p2,int p3){
 ObjectArrays.stabilize(p0,p1,p2,p3);
}
public static <K> void ensureSameLength(K[] p0,K[] p1){
 ObjectArrays.ensureSameLength(p0,p1);
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
public static <K> void fill(K[][] p0,K p1){
 ObjectBigArrays.fill(p0,p1);
}
public static <K> void swap(K[][] p0,long p1,long p2){
 ObjectBigArrays.swap(p0,p1,p2);
}
public static <K> void ensureFromTo(K[][] p0,long p1,long p2){
 ObjectBigArrays.ensureFromTo(p0,p1,p2);
}
public static <K> void quickSort(K[][] p0,java.util.Comparator<K> p1){
 ObjectBigArrays.quickSort(p0,p1);
}
public static <K> void quickSort(K[][] p0,long p1,long p2){
 ObjectBigArrays.quickSort(p0,p1,p2);
}
public static <K> void quickSort(K[][] p0,long p1,long p2,java.util.Comparator<K> p3){
 ObjectBigArrays.quickSort(p0,p1,p2,p3);
}
public static <K> void quickSort(K[][] p0){
 ObjectBigArrays.quickSort(p0);
}
public static <K> void ensureOffsetLength(K[][] p0,long p1,long p2){
 ObjectBigArrays.ensureOffsetLength(p0,p1,p2);
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
public static <K> void makeHeap(K[] p0,int p1,int p2,int[] p3,int[] p4,java.util.Comparator<K> p5){
 ObjectIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static <K> void makeHeap(K[] p0,int[] p1,int[] p2,int p3,java.util.Comparator<K> p4){
 ObjectIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static <K> void makeHeap(K[] p0,int[] p1,int p2,java.util.Comparator<K> p3){
 ObjectSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static <K> void makeHeap(K[] p0,int p1,int p2,int[] p3,java.util.Comparator<K> p4){
 ObjectSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Reference2BooleanMap.it.unimi.dsi.fastutil.objects.Reference2BooleanMap.Entry<K>> p1){
 Reference2BooleanMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Reference2ByteMap.it.unimi.dsi.fastutil.objects.Reference2ByteMap.Entry<K>> p1){
 Reference2ByteMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Reference2CharMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Reference2CharMap.it.unimi.dsi.fastutil.objects.Reference2CharMap.Entry<K>> p1){
 Reference2CharMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Reference2DoubleMap.it.unimi.dsi.fastutil.objects.Reference2DoubleMap.Entry<K>> p1){
 Reference2DoubleMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Reference2FloatMap.it.unimi.dsi.fastutil.objects.Reference2FloatMap.Entry<K>> p1){
 Reference2FloatMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Reference2IntMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Reference2IntMap.it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry<K>> p1){
 Reference2IntMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Reference2LongMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Reference2LongMap.it.unimi.dsi.fastutil.objects.Reference2LongMap.Entry<K>> p1){
 Reference2LongMaps.fastForEach(p0,p1);
}
public static <K,V> void fastForEach(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Reference2ObjectMap.it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<K, V>> p1){
 Reference2ObjectMaps.fastForEach(p0,p1);
}
public static <K,V> void fastForEach(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Reference2ReferenceMap.it.unimi.dsi.fastutil.objects.Reference2ReferenceMap.Entry<K, V>> p1){
 Reference2ReferenceMaps.fastForEach(p0,p1);
}
public static <K> void fastForEach(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.objects.Reference2ShortMap.it.unimi.dsi.fastutil.objects.Reference2ShortMap.Entry<K>> p1){
 Reference2ShortMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2BooleanMap.Entry> p1){
 Short2BooleanMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2ByteMap.Entry> p1){
 Short2ByteMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2CharMap.Entry> p1){
 Short2CharMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2DoubleMap.Entry> p1){
 Short2DoubleMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2FloatMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2FloatMap.Entry> p1){
 Short2FloatMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2IntMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2IntMap.Entry> p1){
 Short2IntMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2LongMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2LongMap.Entry> p1){
 Short2LongMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2ObjectMap.it.unimi.dsi.fastutil.shorts.Short2ObjectMap.Entry<V>> p1){
 Short2ObjectMaps.fastForEach(p0,p1);
}
public static <V> void fastForEach(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2ReferenceMap.it.unimi.dsi.fastutil.shorts.Short2ReferenceMap.Entry<V>> p1){
 Short2ReferenceMaps.fastForEach(p0,p1);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2ShortMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2ShortMap.Entry> p1){
 Short2ShortMaps.fastForEach(p0,p1);
}
public static void fill(short[] p0,int p1,int p2,short p3){
 ShortArrays.fill(p0,p1,p2,p3);
}
public static void fill(short[] p0,short p1){
 ShortArrays.fill(p0,p1);
}
public static void swap(short[] p0,int p1,int p2){
 ShortArrays.swap(p0,p1,p2);
}
public static void swap(short[] p0,int p1,int p2,int p3){
 ShortArrays.swap(p0,p1,p2,p3);
}
public static void mergeSort(short[] p0){
 ShortArrays.mergeSort(p0);
}
public static void mergeSort(short[] p0,int p1,int p2){
 ShortArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(short[] p0,int p1,int p2,short[] p3){
 ShortArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
 ShortArrays.mergeSort(p0,p1);
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
public static void quickSort(short[] p0,short[] p1){
 ShortArrays.quickSort(p0,p1);
}
public static void quickSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
 ShortArrays.quickSort(p0,p1);
}
public static void quickSort(short[] p0,int p1,int p2){
 ShortArrays.quickSort(p0,p1,p2);
}
public static void quickSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(short[] p0){
 ShortArrays.quickSort(p0);
}
public static void parallelQuickSort(short[] p0){
 ShortArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(short[] p0,short[] p1,int p2,int p3){
 ShortArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(short[] p0,int p1,int p2){
 ShortArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(short[] p0,short[] p1){
 ShortArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(short[] p0,int p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(short[] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
 ShortArrays.parallelQuickSort(p0,p1);
}
public static void ensureOffsetLength(short[] p0,int p1,int p2){
 ShortArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSortIndirect(int[] p0,short[] p1){
 ShortArrays.parallelQuickSortIndirect(p0,p1);
}
public static void parallelQuickSortIndirect(int[] p0,short[] p1,int p2,int p3){
 ShortArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,short[] p1,int p2,int p3){
 ShortArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,short[] p1){
 ShortArrays.quickSortIndirect(p0,p1);
}
public static void parallelRadixSortIndirect(int[] p0,short[] p1,boolean p2){
 ShortArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4){
 ShortArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSort(short[] p0,short[] p1,int p2,int p3){
 ShortArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(short[] p0,short[] p1){
 ShortArrays.parallelRadixSort(p0,p1);
}
public static void parallelRadixSort(short[] p0,int p1,int p2){
 ShortArrays.parallelRadixSort(p0,p1,p2);
}
public static void parallelRadixSort(short[] p0){
 ShortArrays.parallelRadixSort(p0);
}
public static void radixSortIndirect(int[] p0,short[] p1,short[] p2,int p3,int p4,boolean p5){
 ShortArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,short[] p1,short[] p2,boolean p3){
 ShortArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,short[] p1,boolean p2){
 ShortArrays.radixSortIndirect(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4){
 ShortArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void stabilize(int[] p0,short[] p1,int p2,int p3){
 ShortArrays.stabilize(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,short[] p1){
 ShortArrays.stabilize(p0,p1);
}
public static void ensureSameLength(short[] p0,short[] p1){
 ShortArrays.ensureSameLength(p0,p1);
}
public static void radixSort(short[] p0,int p1,int p2){
 ShortArrays.radixSort(p0,p1,p2);
}
public static void radixSort(short[] p0,short[] p1,int p2,int p3){
 ShortArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(short[] p0){
 ShortArrays.radixSort(p0);
}
public static void radixSort(short[] p0,short[] p1){
 ShortArrays.radixSort(p0,p1);
}
public static void radixSort(short[][] p0,int p1,int p2){
 ShortArrays.radixSort(p0,p1,p2);
}
public static void radixSort(short[][] p0){
 ShortArrays.radixSort(p0);
}
public static void add(short[][] p0,long p1,short p2){
 ShortBigArrays.add(p0,p1,p2);
}
public static void copy(short[][] p0,long p1,short[][] p2,long p3,long p4){
 ShortBigArrays.copy(p0,p1,p2,p3,p4);
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
public static void swap(short[][] p0,long p1,long p2){
 ShortBigArrays.swap(p0,p1,p2);
}
public static void mul(short[][] p0,long p1,short p2){
 ShortBigArrays.mul(p0,p1,p2);
}
public static void ensureFromTo(short[][] p0,long p1,long p2){
 ShortBigArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(short[][] p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
 ShortBigArrays.quickSort(p0,p1);
}
public static void quickSort(short[][] p0,long p1,long p2){
 ShortBigArrays.quickSort(p0,p1,p2);
}
public static void quickSort(short[][] p0){
 ShortBigArrays.quickSort(p0);
}
public static void quickSort(short[][] p0,long p1,long p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortBigArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(short[][] p0,long p1,long p2){
 ShortBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static void copyFromBig(short[][] p0,long p1,short[] p2,int p3,int p4){
 ShortBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void copyToBig(short[] p0,int p1,short[][] p2,long p3,long p4){
 ShortBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void incr(short[][] p0,long p1){
 ShortBigArrays.incr(p0,p1);
}
public static void radixSort(short[][] p0,long p1,long p2){
 ShortBigArrays.radixSort(p0,p1,p2);
}
public static void radixSort(short[][] p0,short[][] p1,long p2,long p3){
 ShortBigArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(short[][] p0,short[][] p1){
 ShortBigArrays.radixSort(p0,p1);
}
public static void decr(short[][] p0,long p1){
 ShortBigArrays.decr(p0,p1);
}
public static void makeHeap(short[] p0,int p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
 ShortHeaps.makeHeap(p0,p1,p2);
}
public static void makeHeap(short[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.shorts.ShortComparator p5){
 ShortIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(short[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
 ShortIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(short[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.shorts.ShortComparator p3){
 ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(short[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.shorts.ShortComparator p4){
 ShortSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static <E extends java.lang.Throwable > void logElapsedTime(java.lang.String p0,com.facebook.util.ExtRunnable<E> p1) throws E{
 TimeUtil.logElapsedTime(p0,p1);
}
public static void advanceNow(org.joda.time.Duration p0){
 TimeUtil.advanceNow(p0);
}
public static void setNow(org.joda.time.DateTime p0){
 TimeUtil.setNow(p0);
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
public static void setDefaultStyle(org.apache.commons.lang.builder.ToStringStyle p0){
 ToStringBuilder.setDefaultStyle(p0);
}
public static void removeCommonFrames(java.util.List p0,java.util.List p1){
 ExceptionUtils.removeCommonFrames(p0,p1);
}
public static void addCauseMethodName(java.lang.String p0){
 ExceptionUtils.addCauseMethodName(p0);
}
public static void removeCauseMethodName(java.lang.String p0){
 ExceptionUtils.removeCauseMethodName(p0);
}
public static void writeStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2,p3);
}
public static void writeDeclaredStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
public static void writeDeclaredStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2);
}
public static void escapeJava(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeJava(p0,p1);
}
public static void unescapeCsv(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeCsv(p0,p1);
}
public static void unescapeXml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeXml(p0,p1);
}
public static void escapeCsv(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeCsv(p0,p1);
}
public static void escapeXml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeXml(p0,p1);
}
public static void unescapeJava(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeJava(p0,p1);
}
public static void unescapeJavaScript(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeJavaScript(p0,p1);
}
public static void escapeHtml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeHtml(p0,p1);
}
public static void unescapeHtml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeHtml(p0,p1);
}
public static void escapeJavaScript(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeJavaScript(p0,p1);
}
public static void notEmpty(java.util.Collection p0){
 Validate.notEmpty(p0);
}
public static void notEmpty(java.util.Collection p0,java.lang.String p1){
 Validate.notEmpty(p0,p1);
}
public static void notEmpty(java.lang.Object[] p0){
 Validate.notEmpty(p0);
}
public static void notEmpty(java.lang.Object[] p0,java.lang.String p1){
 Validate.notEmpty(p0,p1);
}
public static void notEmpty(java.lang.String p0){
 Validate.notEmpty(p0);
}
public static void notEmpty(java.lang.String p0,java.lang.String p1){
 Validate.notEmpty(p0,p1);
}
public static void notEmpty(java.util.Map p0){
 Validate.notEmpty(p0);
}
public static void notEmpty(java.util.Map p0,java.lang.String p1){
 Validate.notEmpty(p0,p1);
}
public static void notNull(java.lang.Object p0,java.lang.String p1){
 Validate.notNull(p0,p1);
}
public static void notNull(java.lang.Object p0){
 Validate.notNull(p0);
}
public static void isTrue(boolean p0,java.lang.String p1,java.lang.Object p2){
 Validate.isTrue(p0,p1,p2);
}
public static void isTrue(boolean p0,java.lang.String p1){
 Validate.isTrue(p0,p1);
}
public static void noNullElements(java.util.Collection p0,java.lang.String p1){
 Validate.noNullElements(p0,p1);
}
public static void noNullElements(java.util.Collection p0){
 Validate.noNullElements(p0);
}
public static void noNullElements(java.lang.Object[] p0){
 Validate.noNullElements(p0);
}
public static void noNullElements(java.lang.Object[] p0,java.lang.String p1){
 Validate.noNullElements(p0,p1);
}
public static void allElementsOfType(java.util.Collection p0,java.lang.Class p1){
 Validate.allElementsOfType(p0,p1);
}
public static void allElementsOfType(java.util.Collection p0,java.lang.Class p1,java.lang.String p2){
 Validate.allElementsOfType(p0,p1,p2);
}
}
