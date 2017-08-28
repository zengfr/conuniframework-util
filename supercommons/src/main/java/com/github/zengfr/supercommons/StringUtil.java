package com.zengfr.supercommons;
import com.google.common.base.Ascii;
import com.google.common.base.CaseFormat;
import java.lang.Enum;
import com.google.common.base.Enums;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.base.StandardSystemProperty;
import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import com.google.common.base.Verify;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.cache.RemovalCause;
import com.google.common.collect.BoundType;
import com.google.common.collect.Lists;
import com.google.common.collect.SortedLists.KeyAbsentBehavior;
import com.google.common.collect.SortedLists.KeyPresentBehavior;
import com.google.common.escape.Escapers;
import com.google.common.hash.HashCode;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import com.google.common.net.HostAndPort;
import com.google.common.net.HostSpecifier;
import com.google.common.net.InetAddresses;
import com.google.common.net.InternetDomainName;
import com.google.common.net.MediaType;
import com.google.common.primitives.Booleans;
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
import com.google.common.reflect.Reflection;
import com.google.common.util.concurrent.CycleDetectingLockFactory.Policies;
import com.google.common.util.concurrent.Service.State;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.FileCleaner;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.functors.InvokerTransformer;
import org.apache.commons.collections.PredicateUtils;
import org.apache.commons.collections4.TransformerUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior;
import org.apache.commons.collections4.ClosureUtils;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.ComparatorPredicate.Criterion;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.PredicateUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.CharEncoding;
import org.apache.commons.lang3.CharSetUtils;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.ClassPathUtils;
import org.apache.commons.lang3.ClassUtils.Interfaces;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.Conversion;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.event.EventUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import java.text.MessageFormat;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.commons.lang3.Validate;
import org.apache.commons.math3.ml.neuralnet.SquareNeighbourhood;
import org.apache.commons.math3.ml.neuralnet.twod.NeuronSquareMesh2D.HorizontalDirection;
import org.apache.commons.math3.ml.neuralnet.twod.NeuronSquareMesh2D.VerticalDirection;
import org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy;
import org.apache.commons.math3.analysis.solvers.AllowedSolution;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy;
import org.apache.commons.math3.stat.inference.AlternativeHypothesis;
import org.apache.commons.math3.stat.descriptive.rank.Percentile.EstimationType;
import org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.complex.ComplexFormat;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.events.Action;
import org.apache.commons.math3.ode.events.EventHandler.Action;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.apache.commons.math3.optim.linear.PivotSelectionRule;
import org.apache.commons.math3.optim.linear.Relationship;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.Decomposition;
import org.apache.commons.math3.dfp.DfpField.RoundingMode;
import org.apache.commons.math3.fraction.BigFractionFormat;
import org.apache.commons.math3.fraction.FractionFormat;
import org.apache.commons.math3.geometry.euclidean.threed.RotationConvention;
import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.Region.Location;
import org.apache.commons.math3.optimization.linear.Relationship;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.general.ConjugateGradientFormula;
import org.apache.commons.math3.util.MathArrays.OrderDirection;
import org.apache.commons.math3.util.CompositeFormat;
import org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode;
import org.apache.commons.math3.util.MathArrays.Position;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.TransformType;
import org.apache.commons.math3.transform.DctNormalization;
import org.apache.commons.math3.transform.DstNormalization;
import org.apache.commons.beanutils.locale.LocaleBeanUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.locale.LocaleConvertUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.text.translate.CharSequenceTranslator;
import org.apache.commons.text.StrMatcher;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.text.translate.NumericEntityUnescaper.OPTION;
import org.apache.commons.text.StrTokenizer;
import org.apache.commons.text.StrSubstitutor;
import org.apache.commons.text.WordUtils;
import org.apache.commons.text.CharacterPredicates;
import it.unimi.dsi.fastutil.io.FastBufferedInputStream.LineTerminator;
import com.facebook.collections.HostPort;
import com.facebook.collections.specialized.NumberType;
import com.facebook.util.Convert;
import com.facebook.util.FileUtils;
import com.facebook.util.StringUtils;
import com.facebook.util.TimeIntervalType;
import com.facebook.util.TimeUtil;
import com.facebook.util.Validations;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.CharEncoding;
import org.apache.commons.lang.CharSet;
import org.apache.commons.lang.CharSetUtils;
import org.apache.commons.lang.CharUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.enum.EnumUtils;
import org.apache.commons.lang.enums.EnumUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.lang.LocaleUtils;
import org.apache.commons.lang.math.Fraction;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.NumberUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.reflect.FieldUtils;
import org.apache.commons.lang.reflect.MethodUtils;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.text.StrMatcher;
import org.apache.commons.lang.text.StrSubstitutor;
import org.apache.commons.lang.text.StrTokenizer;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.commons.lang.time.FastDateFormat;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.WordUtils;
import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.Priority;
import edu.umd.cs.findbugs.annotations.When;
import javax.annotation.meta.When;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StringUtil{ 
public static java.lang.String toLowerCase(java.lang.CharSequence p0){
return Ascii.toLowerCase(p0);
}
public static java.lang.String toLowerCase(java.lang.String p0){
return Ascii.toLowerCase(p0);
}
public static java.lang.String toUpperCase(java.lang.CharSequence p0){
return Ascii.toUpperCase(p0);
}
public static java.lang.String toUpperCase(java.lang.String p0){
return Ascii.toUpperCase(p0);
}
public static java.lang.String truncate(java.lang.CharSequence p0,int p1,java.lang.String p2){
return Ascii.truncate(p0,p1,p2);
}
public static com.google.common.base.CaseFormat valueOf(java.lang.String p0){
return CaseFormat.valueOf(p0);
}
public static <T extends java.lang.Enum<T> > T valueOf(java.lang.Class<T> p0,java.lang.String p1){
return Enum.valueOf(p0,p1);
}
public static <T extends java.lang.Enum<T> > com.google.common.base.Optional<T> getIfPresent(java.lang.Class<T> p0,java.lang.String p1){
return Enums.getIfPresent(p0,p1);
}
public static com.google.common.base.Joiner on(java.lang.String p0){
return Joiner.on(p0);
}
public static ToStringHelper toStringHelper(java.lang.String p0){
return MoreObjects.toStringHelper(p0);
}
public static int checkElementIndex(int p0,int p1,java.lang.String p2){
return Preconditions.checkElementIndex(p0,p1,p2);
}
public static int checkPositionIndex(int p0,int p1,java.lang.String p2){
return Preconditions.checkPositionIndex(p0,p1,p2);
}
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object... p2){
return Preconditions.checkNotNull(p0,p1,p2);
}
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Preconditions.checkArgument(p0,p1,p2);
}
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Preconditions.checkState(p0,p1,p2);
}
public static com.google.common.base.Predicate<java.lang.CharSequence> containsPattern(java.lang.String p0){
return Predicates.containsPattern(p0);
}
public static com.google.common.base.Splitter onPattern(java.lang.String p0){
return Splitter.onPattern(p0);
}
public static java.lang.String repeat(java.lang.String p0,int p1){
return Strings.repeat(p0,p1);
}
public static java.lang.String commonPrefix(java.lang.CharSequence p0,java.lang.CharSequence p1){
return Strings.commonPrefix(p0,p1);
}
public static java.lang.String emptyToNull(java.lang.String p0){
return Strings.emptyToNull(p0);
}
public static java.lang.String padStart(java.lang.String p0,int p1,char p2){
return Strings.padStart(p0,p1,p2);
}
public static java.lang.String padEnd(java.lang.String p0,int p1,char p2){
return Strings.padEnd(p0,p1,p2);
}
public static java.lang.String nullToEmpty(java.lang.String p0){
return Strings.nullToEmpty(p0);
}
public static java.lang.String commonSuffix(java.lang.CharSequence p0,java.lang.CharSequence p1){
return Strings.commonSuffix(p0,p1);
}
public static boolean isNullOrEmpty(java.lang.String p0){
return Strings.isNullOrEmpty(p0);
}
public static java.lang.String getStackTraceAsString(java.lang.Throwable p0){
return Throwables.getStackTraceAsString(p0);
}
public static void verify(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Verify.verify(p0,p1,p2);
}
public static <T> T verifyNotNull(T p0,java.lang.String p1,java.lang.Object... p2){
return Verify.verifyNotNull(p0,p1,p2);
}
public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> from(java.lang.String p0){
return CacheBuilder.from(p0);
}
public static com.google.common.cache.CacheBuilderSpec parse(java.lang.String p0){
return CacheBuilderSpec.parse(p0);
}
public static com.google.common.collect.ImmutableList<java.lang.Character> charactersOf(java.lang.String p0){
return Lists.charactersOf(p0);
}
public static java.lang.String computeReplacement(com.google.common.escape.CharEscaper p0,char p1){
return Escapers.computeReplacement(p0,p1);
}
public static java.lang.String computeReplacement(com.google.common.escape.UnicodeEscaper p0,int p1){
return Escapers.computeReplacement(p0,p1);
}
public static com.google.common.hash.HashCode fromString(java.lang.String p0){
return HashCode.fromString(p0);
}
public static java.lang.String getNameWithoutExtension(java.lang.String p0){
return Files.getNameWithoutExtension(p0);
}
public static java.lang.String readFirstLine(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
return Files.readFirstLine(p0,p1);
}
public static java.lang.String simplifyPath(java.lang.String p0){
return Files.simplifyPath(p0);
}
public static java.lang.String getFileExtension(java.lang.String p0){
return Files.getFileExtension(p0);
}
public static java.net.URL getResource(java.lang.String p0){
return Resources.getResource(p0);
}
public static java.net.URL getResource(java.lang.Class<?> p0,java.lang.String p1){
return Resources.getResource(p0,p1);
}
public static com.google.common.net.HostAndPort fromParts(java.lang.String p0,int p1){
return HostAndPort.fromParts(p0,p1);
}
public static com.google.common.net.HostAndPort fromHost(java.lang.String p0){
return HostAndPort.fromHost(p0);
}
public static boolean isValid(java.lang.String p0){
return HostSpecifier.isValid(p0);
}
public static com.google.common.net.HostSpecifier fromValid(java.lang.String p0){
return HostSpecifier.fromValid(p0);
}
public static boolean isMappedIPv4Address(java.lang.String p0){
return InetAddresses.isMappedIPv4Address(p0);
}
public static java.lang.String toUriString(java.net.InetAddress p0){
return InetAddresses.toUriString(p0);
}
public static java.net.InetAddress forString(java.lang.String p0){
return InetAddresses.forString(p0);
}
public static java.net.InetAddress forUriString(java.lang.String p0){
return InetAddresses.forUriString(p0);
}
public static boolean isUriInetAddress(java.lang.String p0){
return InetAddresses.isUriInetAddress(p0);
}
public static java.lang.String toAddrString(java.net.InetAddress p0){
return InetAddresses.toAddrString(p0);
}
public static boolean isInetAddress(java.lang.String p0){
return InetAddresses.isInetAddress(p0);
}
public static com.google.common.net.MediaType create(java.lang.String p0,java.lang.String p1){
return MediaType.create(p0,p1);
}
public static java.lang.String join(java.lang.String p0,boolean... p1){
return Booleans.join(p0,p1);
}
public static java.lang.String join(java.lang.String p0,char... p1){
return Chars.join(p0,p1);
}
public static java.lang.String join(java.lang.String p0,double... p1){
return Doubles.join(p0,p1);
}
public static java.lang.Double tryParse(java.lang.String p0){
return Doubles.tryParse(p0);
}
public static java.lang.String join(java.lang.String p0,float... p1){
return Floats.join(p0,p1);
}
public static java.lang.String join(java.lang.String p0,int... p1){
return Ints.join(p0,p1);
}
public static java.lang.Integer tryParse(java.lang.String p0,int p1){
return Ints.tryParse(p0,p1);
}
public static java.lang.String join(java.lang.String p0,long... p1){
return Longs.join(p0,p1);
}
public static java.lang.String join(java.lang.String p0,short... p1){
return Shorts.join(p0,p1);
}
public static java.lang.String join(java.lang.String p0,byte... p1){
return SignedBytes.join(p0,p1);
}
public static byte parseUnsignedByte(java.lang.String p0,int p1){
return UnsignedBytes.parseUnsignedByte(p0,p1);
}
public static byte parseUnsignedByte(java.lang.String p0){
return UnsignedBytes.parseUnsignedByte(p0);
}
public static com.google.common.primitives.UnsignedInteger valueOf(java.lang.String p0,int p1){
return UnsignedInteger.valueOf(p0,p1);
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
public static long parseUnsignedLong(java.lang.String p0,int p1){
return UnsignedLongs.parseUnsignedLong(p0,p1);
}
public static long parseUnsignedLong(java.lang.String p0){
return UnsignedLongs.parseUnsignedLong(p0);
}
public static java.lang.String getPackageName(java.lang.String p0){
return Reflection.getPackageName(p0);
}
public static java.lang.String getPackageName(java.lang.Class<?> p0){
return Reflection.getPackageName(p0);
}
public static char[] toCharArray(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.toCharArray(p0,p1);
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
public static void write(java.lang.StringBuffer p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(byte[] p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(char[] p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.String p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void copy(java.io.Reader p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.copy(p0,p1,p2);
}
public static byte[] toByteArray(java.io.Reader p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.toByteArray(p0,p1);
}
public static byte[] toByteArray(java.lang.String p0) throws java.io.IOException{
return IOUtils.toByteArray(p0);
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
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.readLines(p0,p1);
}
public static java.io.InputStream toInputStream(java.lang.String p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.toInputStream(p0,p1);
}
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.toInputStream(p0,p1);
}
public static java.io.InputStream toInputStream(java.lang.String p0){
return IOUtils.toInputStream(p0);
}
public static java.io.InputStream toInputStream(java.lang.String p0,java.nio.charset.Charset p1){
return IOUtils.toInputStream(p0,p1);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.lineIterator(p0,p1);
}
public static void track(java.lang.String p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
 FileCleaner.track(p0,p1,p2);
}
public static void track(java.lang.String p0,java.lang.Object p1){
 FileCleaner.track(p0,p1);
}
public static java.lang.String getExtension(java.lang.String p0){
return FilenameUtils.getExtension(p0);
}
public static java.lang.String getName(java.lang.String p0){
return FilenameUtils.getName(p0);
}
public static java.lang.String concat(java.lang.String p0,java.lang.String p1){
return FilenameUtils.concat(p0,p1);
}
public static java.lang.String normalize(java.lang.String p0){
return FilenameUtils.normalize(p0);
}
public static java.lang.String normalize(java.lang.String p0,boolean p1){
return FilenameUtils.normalize(p0,p1);
}
public static java.lang.String getPath(java.lang.String p0){
return FilenameUtils.getPath(p0);
}
public static int getPrefixLength(java.lang.String p0){
return FilenameUtils.getPrefixLength(p0);
}
public static boolean equalsOnSystem(java.lang.String p0,java.lang.String p1){
return FilenameUtils.equalsOnSystem(p0,p1);
}
public static java.lang.String getBaseName(java.lang.String p0){
return FilenameUtils.getBaseName(p0);
}
public static boolean equalsNormalized(java.lang.String p0,java.lang.String p1){
return FilenameUtils.equalsNormalized(p0,p1);
}
public static boolean wildcardMatch(java.lang.String p0,java.lang.String p1,org.apache.commons.io.IOCase p2){
return FilenameUtils.wildcardMatch(p0,p1,p2);
}
public static boolean wildcardMatch(java.lang.String p0,java.lang.String p1){
return FilenameUtils.wildcardMatch(p0,p1);
}
public static java.lang.String getFullPath(java.lang.String p0){
return FilenameUtils.getFullPath(p0);
}
public static int indexOfExtension(java.lang.String p0){
return FilenameUtils.indexOfExtension(p0);
}
public static java.lang.String getPrefix(java.lang.String p0){
return FilenameUtils.getPrefix(p0);
}
public static java.lang.String removeExtension(java.lang.String p0){
return FilenameUtils.removeExtension(p0);
}
public static boolean isExtension(java.lang.String p0,java.lang.String[] p1){
return FilenameUtils.isExtension(p0,p1);
}
public static boolean isExtension(java.lang.String p0,java.util.Collection<java.lang.String> p1){
return FilenameUtils.isExtension(p0,p1);
}
public static boolean isExtension(java.lang.String p0,java.lang.String p1){
return FilenameUtils.isExtension(p0,p1);
}
public static java.lang.String separatorsToUnix(java.lang.String p0){
return FilenameUtils.separatorsToUnix(p0);
}
public static java.lang.String getFullPathNoEndSeparator(java.lang.String p0){
return FilenameUtils.getFullPathNoEndSeparator(p0);
}
public static java.lang.String separatorsToSystem(java.lang.String p0){
return FilenameUtils.separatorsToSystem(p0);
}
public static boolean directoryContains(java.lang.String p0,java.lang.String p1) throws java.io.IOException{
return FilenameUtils.directoryContains(p0,p1);
}
public static java.lang.String normalizeNoEndSeparator(java.lang.String p0,boolean p1){
return FilenameUtils.normalizeNoEndSeparator(p0,p1);
}
public static java.lang.String normalizeNoEndSeparator(java.lang.String p0){
return FilenameUtils.normalizeNoEndSeparator(p0);
}
public static java.lang.String separatorsToWindows(java.lang.String p0){
return FilenameUtils.separatorsToWindows(p0);
}
public static int indexOfLastSeparator(java.lang.String p0){
return FilenameUtils.indexOfLastSeparator(p0);
}
public static boolean equalsNormalizedOnSystem(java.lang.String p0,java.lang.String p1){
return FilenameUtils.equalsNormalizedOnSystem(p0,p1);
}
public static boolean wildcardMatchOnSystem(java.lang.String p0,java.lang.String p1){
return FilenameUtils.wildcardMatchOnSystem(p0,p1);
}
public static java.lang.String getPathNoEndSeparator(java.lang.String p0){
return FilenameUtils.getPathNoEndSeparator(p0);
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
public static void copy(byte[] p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
 CopyUtils.copy(p0,p1,p2);
}
public static org.apache.commons.io.IOCase forName(java.lang.String p0){
return IOCase.forName(p0);
}
public static java.nio.charset.Charset toCharset(java.lang.String p0){
return Charsets.toCharset(p0);
}
public static long freeSpace(java.lang.String p0) throws java.io.IOException{
return FileSystemUtils.freeSpace(p0);
}
public static long freeSpaceKb(java.lang.String p0) throws java.io.IOException{
return FileSystemUtils.freeSpaceKb(p0);
}
public static long freeSpaceKb(java.lang.String p0,long p1) throws java.io.IOException{
return FileSystemUtils.freeSpaceKb(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter prefixFileFilter(java.lang.String p0){
return FileFilterUtils.prefixFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter prefixFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
return FileFilterUtils.prefixFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter suffixFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
return FileFilterUtils.suffixFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter suffixFileFilter(java.lang.String p0){
return FileFilterUtils.suffixFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter nameFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
return FileFilterUtils.nameFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter nameFileFilter(java.lang.String p0){
return FileFilterUtils.nameFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(java.lang.String p0){
return FileFilterUtils.magicNumberFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(java.lang.String p0,long p1){
return FileFilterUtils.magicNumberFileFilter(p0,p1);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.write(p0,p1,p2,p3);
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
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3,boolean p4) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3,p4);
}
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.lang.String p1) throws java.io.IOException{
return FileUtils.readLines(p0,p1);
}
public static boolean contentEqualsIgnoreEOL(java.io.File p0,java.io.File p1,java.lang.String p2) throws java.io.IOException{
return FileUtils.contentEqualsIgnoreEOL(p0,p1,p2);
}
public static java.lang.String readFileToString(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
return FileUtils.readFileToString(p0,p1);
}
public static java.lang.String readFileToString(java.io.File p0,java.lang.String p1) throws java.io.IOException{
return FileUtils.readFileToString(p0,p1);
}
public static java.lang.String readFileToString(java.io.File p0) throws java.io.IOException{
return FileUtils.readFileToString(p0);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0,java.lang.String p1) throws java.io.IOException{
return FileUtils.lineIterator(p0,p1);
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
public static java.lang.String getUserDirectoryPath(){
return FileUtils.getUserDirectoryPath();
}
public static java.lang.String getTempDirectoryPath(){
return FileUtils.getTempDirectoryPath();
}
public static java.lang.String byteCountToDisplaySize(long p0){
return FileUtils.byteCountToDisplaySize(p0);
}
public static java.lang.String byteCountToDisplaySize(java.math.BigInteger p0){
return FileUtils.byteCountToDisplaySize(p0);
}
public static org.apache.commons.collections.Transformer invokerTransformer(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return TransformerUtils.invokerTransformer(p0,p1,p2);
}
public static org.apache.commons.collections.Transformer invokerTransformer(java.lang.String p0){
return TransformerUtils.invokerTransformer(p0);
}
public static java.lang.String getString(java.util.Map p0,java.lang.Object p1,java.lang.String p2){
return MapUtils.getString(p0,p1,p2);
}
public static java.lang.String getString(java.util.Map p0,java.lang.Object p1){
return MapUtils.getString(p0,p1);
}
public static org.apache.commons.collections.Closure invokerClosure(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return ClosureUtils.invokerClosure(p0,p1,p2);
}
public static org.apache.commons.collections.Closure invokerClosure(java.lang.String p0){
return ClosureUtils.invokerClosure(p0);
}
public static org.apache.commons.collections.Transformer getInstance(java.lang.String p0){
return InvokerTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return InvokerTransformer.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Predicate invokerPredicate(java.lang.String p0){
return PredicateUtils.invokerPredicate(p0);
}
public static org.apache.commons.collections.Predicate invokerPredicate(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return PredicateUtils.invokerPredicate(p0,p1,p2);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> invokerTransformer(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object[] p2){
return TransformerUtils.invokerTransformer(p0,p1,p2);
}
public static <K> java.lang.String getString(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getString(p0,p1);
}
public static <K> java.lang.String getString(java.util.Map<? super K, ?> p0,K p1,java.lang.String p2){
return MapUtils.getString(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.Closure<E> invokerClosure(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object[] p2){
return ClosureUtils.invokerClosure(p0,p1,p2);
}
public static java.lang.String longestCommonSubsequence(java.lang.CharSequence p0,java.lang.CharSequence p1){
return ListUtils.longestCommonSubsequence(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> invokerPredicate(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object[] p2){
return PredicateUtils.invokerPredicate(p0,p1,p2);
}
public static boolean toBoolean(java.lang.String p0){
return BooleanUtils.toBoolean(p0);
}
public static boolean toBoolean(java.lang.String p0,java.lang.String p1,java.lang.String p2){
return BooleanUtils.toBoolean(p0,p1,p2);
}
public static java.lang.String toStringTrueFalse(boolean p0){
return BooleanUtils.toStringTrueFalse(p0);
}
public static java.lang.String toStringTrueFalse(java.lang.Boolean p0){
return BooleanUtils.toStringTrueFalse(p0);
}
public static java.lang.String toStringYesNo(java.lang.Boolean p0){
return BooleanUtils.toStringYesNo(p0);
}
public static java.lang.String toStringYesNo(boolean p0){
return BooleanUtils.toStringYesNo(p0);
}
public static java.lang.Boolean toBooleanObject(java.lang.String p0){
return BooleanUtils.toBooleanObject(p0);
}
public static java.lang.Boolean toBooleanObject(java.lang.String p0,java.lang.String p1,java.lang.String p2,java.lang.String p3){
return BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
public static java.lang.String toStringOnOff(java.lang.Boolean p0){
return BooleanUtils.toStringOnOff(p0);
}
public static java.lang.String toStringOnOff(boolean p0){
return BooleanUtils.toStringOnOff(p0);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.util.Collection<java.lang.String> p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.lang.String... p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1){
return ToStringBuilder.reflectionToString(p0,p1);
}
public static <T> java.lang.String reflectionToString(T p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2,java.lang.Class<? super T> p3){
return ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2){
return ToStringBuilder.reflectionToString(p0,p1,p2);
}
public static java.lang.String reflectionToString(java.lang.Object p0){
return ToStringBuilder.reflectionToString(p0);
}
public static boolean isSupported(java.lang.String p0){
return CharEncoding.isSupported(p0);
}
public static int count(java.lang.String p0,java.lang.String... p1){
return CharSetUtils.count(p0,p1);
}
public static java.lang.String delete(java.lang.String p0,java.lang.String... p1){
return CharSetUtils.delete(p0,p1);
}
public static boolean containsAny(java.lang.String p0,java.lang.String... p1){
return CharSetUtils.containsAny(p0,p1);
}
public static java.lang.String keep(java.lang.String p0,java.lang.String... p1){
return CharSetUtils.keep(p0,p1);
}
public static java.lang.String squeeze(java.lang.String p0,java.lang.String... p1){
return CharSetUtils.squeeze(p0,p1);
}
public static char toChar(java.lang.String p0,char p1){
return CharUtils.toChar(p0,p1);
}
public static char toChar(java.lang.String p0){
return CharUtils.toChar(p0);
}
public static java.lang.String unicodeEscaped(char p0){
return CharUtils.unicodeEscaped(p0);
}
public static java.lang.String unicodeEscaped(java.lang.Character p0){
return CharUtils.unicodeEscaped(p0);
}
public static java.lang.Character toCharacterObject(java.lang.String p0){
return CharUtils.toCharacterObject(p0);
}
public static java.lang.String toFullyQualifiedPath(java.lang.Class<?> p0,java.lang.String p1){
return ClassPathUtils.toFullyQualifiedPath(p0,p1);
}
public static java.lang.String toFullyQualifiedPath(java.lang.Package p0,java.lang.String p1){
return ClassPathUtils.toFullyQualifiedPath(p0,p1);
}
public static java.lang.String toFullyQualifiedName(java.lang.Class<?> p0,java.lang.String p1){
return ClassPathUtils.toFullyQualifiedName(p0,p1);
}
public static java.lang.String toFullyQualifiedName(java.lang.Package p0,java.lang.String p1){
return ClassPathUtils.toFullyQualifiedName(p0,p1);
}
public static java.lang.String getSimpleName(java.lang.Class<?> p0){
return ClassUtils.getSimpleName(p0);
}
public static java.lang.String getSimpleName(java.lang.Object p0,java.lang.String p1){
return ClassUtils.getSimpleName(p0,p1);
}
public static java.lang.String getShortClassName(java.lang.Class<?> p0){
return ClassUtils.getShortClassName(p0);
}
public static java.lang.String getShortClassName(java.lang.Object p0,java.lang.String p1){
return ClassUtils.getShortClassName(p0,p1);
}
public static java.lang.String getShortClassName(java.lang.String p0){
return ClassUtils.getShortClassName(p0);
}
public static java.lang.String getPackageName(java.lang.Object p0,java.lang.String p1){
return ClassUtils.getPackageName(p0,p1);
}
public static java.lang.reflect.Method getPublicMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2) throws java.lang.SecurityException,java.lang.NoSuchMethodException{
return ClassUtils.getPublicMethod(p0,p1,p2);
}
public static java.lang.String getPackageCanonicalName(java.lang.Object p0,java.lang.String p1){
return ClassUtils.getPackageCanonicalName(p0,p1);
}
public static java.lang.String getPackageCanonicalName(java.lang.Class<?> p0){
return ClassUtils.getPackageCanonicalName(p0);
}
public static java.lang.String getPackageCanonicalName(java.lang.String p0){
return ClassUtils.getPackageCanonicalName(p0);
}
public static java.lang.String getShortCanonicalName(java.lang.Object p0,java.lang.String p1){
return ClassUtils.getShortCanonicalName(p0,p1);
}
public static java.lang.String getShortCanonicalName(java.lang.Class<?> p0){
return ClassUtils.getShortCanonicalName(p0);
}
public static java.lang.String getShortCanonicalName(java.lang.String p0){
return ClassUtils.getShortCanonicalName(p0);
}
public static java.lang.String getAbbreviatedName(java.lang.Class<?> p0,int p1){
return ClassUtils.getAbbreviatedName(p0,p1);
}
public static java.lang.String getAbbreviatedName(java.lang.String p0,int p1){
return ClassUtils.getAbbreviatedName(p0,p1);
}
public static java.lang.String shortToHex(short p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.shortToHex(p0,p1,p2,p3,p4);
}
public static java.lang.String byteToHex(byte p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.byteToHex(p0,p1,p2,p3,p4);
}
public static short hexToShort(java.lang.String p0,int p1,short p2,int p3,int p4){
return Conversion.hexToShort(p0,p1,p2,p3,p4);
}
public static java.lang.String longToHex(long p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.longToHex(p0,p1,p2,p3,p4);
}
public static byte hexToByte(java.lang.String p0,int p1,byte p2,int p3,int p4){
return Conversion.hexToByte(p0,p1,p2,p3,p4);
}
public static java.lang.String intToHex(int p0,int p1,java.lang.String p2,int p3,int p4){
return Conversion.intToHex(p0,p1,p2,p3,p4);
}
public static int hexToInt(java.lang.String p0,int p1,int p2,int p3,int p4){
return Conversion.hexToInt(p0,p1,p2,p3,p4);
}
public static long hexToLong(java.lang.String p0,int p1,long p2,int p3,int p4){
return Conversion.hexToLong(p0,p1,p2,p3,p4);
}
public static <E extends java.lang.Enum<E> > boolean isValidEnum(java.lang.Class<E> p0,java.lang.String p1){
return EnumUtils.isValidEnum(p0,p1);
}
public static <E extends java.lang.Enum<E> > E getEnum(java.lang.Class<E> p0,java.lang.String p1){
return EnumUtils.getEnum(p0,p1);
}
public static <L> void bindEventsToMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,java.lang.Class<L> p3,java.lang.String... p4){
 EventUtils.bindEventsToMethod(p0,p1,p2,p3,p4);
}
public static java.lang.String getMessage(java.lang.Throwable p0){
return ExceptionUtils.getMessage(p0);
}
public static java.lang.String getStackTrace(java.lang.Throwable p0){
return ExceptionUtils.getStackTrace(p0);
}
public static java.lang.String getRootCauseMessage(java.lang.Throwable p0){
return ExceptionUtils.getRootCauseMessage(p0);
}
public static java.util.Locale toLocale(java.lang.String p0){
return LocaleUtils.toLocale(p0);
}
public static java.util.List<java.util.Locale> languagesByCountry(java.lang.String p0){
return LocaleUtils.languagesByCountry(p0);
}
public static java.util.List<java.util.Locale> countriesByLanguage(java.lang.String p0){
return LocaleUtils.countriesByLanguage(p0);
}
public static org.apache.commons.lang3.math.Fraction getFraction(java.lang.String p0){
return Fraction.getFraction(p0);
}
public static java.lang.Long createLong(java.lang.String p0){
return NumberUtils.createLong(p0);
}
public static int toInt(java.lang.String p0,int p1){
return NumberUtils.toInt(p0,p1);
}
public static int toInt(java.lang.String p0){
return NumberUtils.toInt(p0);
}
public static long toLong(java.lang.String p0,long p1){
return NumberUtils.toLong(p0,p1);
}
public static long toLong(java.lang.String p0){
return NumberUtils.toLong(p0);
}
public static short toShort(java.lang.String p0){
return NumberUtils.toShort(p0);
}
public static short toShort(java.lang.String p0,short p1){
return NumberUtils.toShort(p0,p1);
}
public static byte toByte(java.lang.String p0){
return NumberUtils.toByte(p0);
}
public static byte toByte(java.lang.String p0,byte p1){
return NumberUtils.toByte(p0,p1);
}
public static java.lang.Number createNumber(java.lang.String p0) throws java.lang.NumberFormatException{
return NumberUtils.createNumber(p0);
}
public static double toDouble(java.lang.String p0){
return NumberUtils.toDouble(p0);
}
public static double toDouble(java.lang.String p0,double p1){
return NumberUtils.toDouble(p0,p1);
}
public static float toFloat(java.lang.String p0){
return NumberUtils.toFloat(p0);
}
public static float toFloat(java.lang.String p0,float p1){
return NumberUtils.toFloat(p0,p1);
}
public static boolean isNumber(java.lang.String p0){
return NumberUtils.isNumber(p0);
}
public static java.math.BigInteger createBigInteger(java.lang.String p0){
return NumberUtils.createBigInteger(p0);
}
public static java.lang.Float createFloat(java.lang.String p0){
return NumberUtils.createFloat(p0);
}
public static boolean isDigits(java.lang.String p0){
return NumberUtils.isDigits(p0);
}
public static java.math.BigDecimal createBigDecimal(java.lang.String p0){
return NumberUtils.createBigDecimal(p0);
}
public static boolean isParsable(java.lang.String p0){
return NumberUtils.isParsable(p0);
}
public static java.lang.Double createDouble(java.lang.String p0){
return NumberUtils.createDouble(p0);
}
public static java.lang.Integer createInteger(java.lang.String p0){
return NumberUtils.createInteger(p0);
}
public static java.lang.String identityToString(java.lang.Object p0){
return ObjectUtils.identityToString(p0);
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
public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
return FieldUtils.getDeclaredField(p0,p1,p2);
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> p0,java.lang.String p1){
return FieldUtils.getDeclaredField(p0,p1);
}
public static java.lang.reflect.Field getField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
return FieldUtils.getField(p0,p1,p2);
}
public static java.lang.reflect.Field getField(java.lang.Class<?> p0,java.lang.String p1){
return FieldUtils.getField(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.Class<?> p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1,p2);
}
public static java.lang.Object readField(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readField(p0,p1);
}
public static java.lang.Object readField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readField(p0,p1,p2);
}
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2);
}
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2,p3);
}
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2,p3);
}
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static java.lang.Object readDeclaredField(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredField(p0,p1);
}
public static java.lang.Object readDeclaredField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredField(p0,p1,p2);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1,p2);
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
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2){
return MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2,p3);
}
public static java.lang.String toLongString(java.lang.reflect.TypeVariable<?> p0){
return TypeUtils.toLongString(p0);
}
public static final java.lang.String escapeJava(java.lang.String p0){
return StringEscapeUtils.escapeJava(p0);
}
public static final java.lang.String unescapeCsv(java.lang.String p0){
return StringEscapeUtils.unescapeCsv(p0);
}
public static final java.lang.String escapeHtml3(java.lang.String p0){
return StringEscapeUtils.escapeHtml3(p0);
}
public static java.lang.String escapeXml11(java.lang.String p0){
return StringEscapeUtils.escapeXml11(p0);
}
public static final java.lang.String unescapeHtml3(java.lang.String p0){
return StringEscapeUtils.unescapeHtml3(p0);
}
public static final java.lang.String escapeJson(java.lang.String p0){
return StringEscapeUtils.escapeJson(p0);
}
public static final java.lang.String unescapeHtml4(java.lang.String p0){
return StringEscapeUtils.unescapeHtml4(p0);
}
public static java.lang.String escapeXml10(java.lang.String p0){
return StringEscapeUtils.escapeXml10(p0);
}
public static final java.lang.String escapeEcmaScript(java.lang.String p0){
return StringEscapeUtils.escapeEcmaScript(p0);
}
public static final java.lang.String escapeHtml4(java.lang.String p0){
return StringEscapeUtils.escapeHtml4(p0);
}
public static final java.lang.String unescapeXml(java.lang.String p0){
return StringEscapeUtils.unescapeXml(p0);
}
public static final java.lang.String escapeCsv(java.lang.String p0){
return StringEscapeUtils.escapeCsv(p0);
}
public static final java.lang.String unescapeJson(java.lang.String p0){
return StringEscapeUtils.unescapeJson(p0);
}
public static final java.lang.String escapeXml(java.lang.String p0){
return StringEscapeUtils.escapeXml(p0);
}
public static final java.lang.String unescapeJava(java.lang.String p0){
return StringEscapeUtils.unescapeJava(p0);
}
public static final java.lang.String unescapeEcmaScript(java.lang.String p0){
return StringEscapeUtils.unescapeEcmaScript(p0);
}
public static java.lang.String remove(java.lang.String p0,java.lang.String p1){
return StringUtils.remove(p0,p1);
}
public static java.lang.String remove(java.lang.String p0,char p1){
return StringUtils.remove(p0,p1);
}
public static java.lang.String join(char[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(float[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(double[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(long[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static <T> java.lang.String join(T... p0){
return StringUtils.join(p0);
}
public static java.lang.String join(java.lang.Object[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(long[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(int[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(short[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(byte[] p0,char p1){
return StringUtils.join(p0,p1);
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
public static java.lang.String join(java.lang.Object[] p0,java.lang.String p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.lang.Object[] p0,java.lang.String p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(java.lang.Iterable<?> p0,java.lang.String p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.lang.Iterable<?> p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.util.Iterator<?> p0,java.lang.String p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.lang.Object[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(java.util.Iterator<?> p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(int[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String replace(java.lang.String p0,java.lang.String p1,java.lang.String p2){
return StringUtils.replace(p0,p1,p2);
}
public static java.lang.String replace(java.lang.String p0,java.lang.String p1,java.lang.String p2,int p3){
return StringUtils.replace(p0,p1,p2,p3);
}
public static java.lang.String[] split(java.lang.String p0,char p1){
return StringUtils.split(p0,p1);
}
public static java.lang.String[] split(java.lang.String p0){
return StringUtils.split(p0);
}
public static java.lang.String[] split(java.lang.String p0,java.lang.String p1){
return StringUtils.split(p0,p1);
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
public static java.lang.String trim(java.lang.String p0){
return StringUtils.trim(p0);
}
public static java.lang.String wrap(java.lang.String p0,char p1){
return StringUtils.wrap(p0,p1);
}
public static java.lang.String wrap(java.lang.String p0,java.lang.String p1){
return StringUtils.wrap(p0,p1);
}
public static java.lang.String reverse(java.lang.String p0){
return StringUtils.reverse(p0);
}
public static java.lang.String left(java.lang.String p0,int p1){
return StringUtils.left(p0,p1);
}
public static java.lang.String right(java.lang.String p0,int p1){
return StringUtils.right(p0,p1);
}
public static java.lang.String capitalize(java.lang.String p0){
return StringUtils.capitalize(p0);
}
public static java.lang.String uncapitalize(java.lang.String p0){
return StringUtils.uncapitalize(p0);
}
public static java.lang.String removeEnd(java.lang.String p0,java.lang.String p1){
return StringUtils.removeEnd(p0,p1);
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
public static java.lang.String removeEndIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.removeEndIgnoreCase(p0,p1);
}
public static java.lang.String[] splitPreserveAllTokens(java.lang.String p0,char p1){
return StringUtils.splitPreserveAllTokens(p0,p1);
}
public static java.lang.String[] splitPreserveAllTokens(java.lang.String p0){
return StringUtils.splitPreserveAllTokens(p0);
}
public static java.lang.String[] splitPreserveAllTokens(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.splitPreserveAllTokens(p0,p1,p2);
}
public static java.lang.String[] splitPreserveAllTokens(java.lang.String p0,java.lang.String p1){
return StringUtils.splitPreserveAllTokens(p0,p1);
}
public static java.lang.String removeStartIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.removeStartIgnoreCase(p0,p1);
}
public static java.lang.String replaceEachRepeatedly(java.lang.String p0,java.lang.String[] p1,java.lang.String[] p2){
return StringUtils.replaceEachRepeatedly(p0,p1,p2);
}
public static java.lang.String substringBeforeLast(java.lang.String p0,java.lang.String p1){
return StringUtils.substringBeforeLast(p0,p1);
}
public static java.lang.String[] splitByCharacterType(java.lang.String p0){
return StringUtils.splitByCharacterType(p0);
}
public static java.lang.String[] splitByWholeSeparator(java.lang.String p0,java.lang.String p1){
return StringUtils.splitByWholeSeparator(p0,p1);
}
public static java.lang.String[] splitByWholeSeparator(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.splitByWholeSeparator(p0,p1,p2);
}
public static java.lang.String[] splitByCharacterTypeCamelCase(java.lang.String p0){
return StringUtils.splitByCharacterTypeCamelCase(p0);
}
public static java.lang.String[] substringsBetween(java.lang.String p0,java.lang.String p1,java.lang.String p2){
return StringUtils.substringsBetween(p0,p1,p2);
}
public static java.lang.String substringAfterLast(java.lang.String p0,java.lang.String p1){
return StringUtils.substringAfterLast(p0,p1);
}
public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(java.lang.String p0,java.lang.String p1){
return StringUtils.splitByWholeSeparatorPreserveAllTokens(p0,p1);
}
public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.splitByWholeSeparatorPreserveAllTokens(p0,p1,p2);
}
public static java.lang.String appendIfMissingIgnoreCase(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.appendIfMissingIgnoreCase(p0,p1,p2);
}
public static java.lang.String prependIfMissingIgnoreCase(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.prependIfMissingIgnoreCase(p0,p1,p2);
}
public static java.lang.String trimToNull(java.lang.String p0){
return StringUtils.trimToNull(p0);
}
public static java.lang.String stripStart(java.lang.String p0,java.lang.String p1){
return StringUtils.stripStart(p0,p1);
}
public static int indexOfAny(java.lang.CharSequence p0,java.lang.String p1){
return StringUtils.indexOfAny(p0,p1);
}
public static java.lang.String trimToEmpty(java.lang.String p0){
return StringUtils.trimToEmpty(p0);
}
public static java.lang.String strip(java.lang.String p0){
return StringUtils.strip(p0);
}
public static java.lang.String strip(java.lang.String p0,java.lang.String p1){
return StringUtils.strip(p0,p1);
}
public static java.lang.String stripEnd(java.lang.String p0,java.lang.String p1){
return StringUtils.stripEnd(p0,p1);
}
public static java.lang.String stripAccents(java.lang.String p0){
return StringUtils.stripAccents(p0);
}
public static java.lang.String stripToNull(java.lang.String p0){
return StringUtils.stripToNull(p0);
}
public static java.lang.String stripToEmpty(java.lang.String p0){
return StringUtils.stripToEmpty(p0);
}
public static java.lang.String[] stripAll(java.lang.String[] p0,java.lang.String p1){
return StringUtils.stripAll(p0,p1);
}
public static java.lang.String removePattern(java.lang.String p0,java.lang.String p1){
return StringUtils.removePattern(p0,p1);
}
public static java.lang.String repeat(char p0,int p1){
return StringUtils.repeat(p0,p1);
}
public static java.lang.String repeat(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.repeat(p0,p1,p2);
}
public static boolean containsNone(java.lang.CharSequence p0,java.lang.String p1){
return StringUtils.containsNone(p0,p1);
}
public static java.lang.String deleteWhitespace(java.lang.String p0){
return StringUtils.deleteWhitespace(p0);
}
public static java.lang.String substringBetween(java.lang.String p0,java.lang.String p1){
return StringUtils.substringBetween(p0,p1);
}
public static java.lang.String substringBetween(java.lang.String p0,java.lang.String p1,java.lang.String p2){
return StringUtils.substringBetween(p0,p1,p2);
}
public static java.lang.String replaceOnce(java.lang.String p0,java.lang.String p1,java.lang.String p2){
return StringUtils.replaceOnce(p0,p1,p2);
}
public static java.lang.String substringAfter(java.lang.String p0,java.lang.String p1){
return StringUtils.substringAfter(p0,p1);
}
public static java.lang.String replaceChars(java.lang.String p0,char p1,char p2){
return StringUtils.replaceChars(p0,p1,p2);
}
public static java.lang.String replaceChars(java.lang.String p0,java.lang.String p1,java.lang.String p2){
return StringUtils.replaceChars(p0,p1,p2);
}
public static java.lang.String substringBefore(java.lang.String p0,java.lang.String p1){
return StringUtils.substringBefore(p0,p1);
}
public static java.lang.String replacePattern(java.lang.String p0,java.lang.String p1,java.lang.String p2){
return StringUtils.replacePattern(p0,p1,p2);
}
public static java.lang.String mid(java.lang.String p0,int p1,int p2){
return StringUtils.mid(p0,p1,p2);
}
public static java.lang.String removeStart(java.lang.String p0,java.lang.String p1){
return StringUtils.removeStart(p0,p1);
}
public static boolean containsOnly(java.lang.CharSequence p0,java.lang.String p1){
return StringUtils.containsOnly(p0,p1);
}
public static java.lang.String replaceEach(java.lang.String p0,java.lang.String[] p1,java.lang.String[] p2){
return StringUtils.replaceEach(p0,p1,p2);
}
public static java.lang.String swapCase(java.lang.String p0){
return StringUtils.swapCase(p0);
}
public static java.lang.String reverseDelimited(java.lang.String p0,char p1){
return StringUtils.reverseDelimited(p0,p1);
}
public static java.lang.String getCommonPrefix(java.lang.String... p0){
return StringUtils.getCommonPrefix(p0);
}
public static java.lang.String abbreviateMiddle(java.lang.String p0,java.lang.String p1,int p2){
return StringUtils.abbreviateMiddle(p0,p1,p2);
}
public static java.lang.String overlay(java.lang.String p0,java.lang.String p1,int p2,int p3){
return StringUtils.overlay(p0,p1,p2,p3);
}
public static java.lang.String lowerCase(java.lang.String p0,java.util.Locale p1){
return StringUtils.lowerCase(p0,p1);
}
public static java.lang.String lowerCase(java.lang.String p0){
return StringUtils.lowerCase(p0);
}
public static java.lang.String upperCase(java.lang.String p0,java.util.Locale p1){
return StringUtils.upperCase(p0,p1);
}
public static java.lang.String upperCase(java.lang.String p0){
return StringUtils.upperCase(p0);
}
public static java.lang.String difference(java.lang.String p0,java.lang.String p1){
return StringUtils.difference(p0,p1);
}
public static java.lang.String chop(java.lang.String p0){
return StringUtils.chop(p0);
}
public static java.lang.String defaultString(java.lang.String p0){
return StringUtils.defaultString(p0);
}
public static java.lang.String defaultString(java.lang.String p0,java.lang.String p1){
return StringUtils.defaultString(p0,p1);
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
public static java.lang.String chomp(java.lang.String p0){
return StringUtils.chomp(p0);
}
public static java.lang.String chomp(java.lang.String p0,java.lang.String p1){
return StringUtils.chomp(p0,p1);
}
public static java.lang.String appendIfMissing(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.appendIfMissing(p0,p1,p2);
}
public static java.lang.String toEncodedString(byte[] p0,java.nio.charset.Charset p1){
return StringUtils.toEncodedString(p0,p1);
}
public static java.lang.String normalizeSpace(java.lang.String p0){
return StringUtils.normalizeSpace(p0);
}
public static java.lang.String prependIfMissing(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.prependIfMissing(p0,p1,p2);
}
public static java.lang.String format(java.lang.String p0,java.lang.Object... p1){
return MessageFormat.format(p0,p1);
}
public static org.apache.commons.lang3.text.StrMatcher stringMatcher(java.lang.String p0){
return StrMatcher.stringMatcher(p0);
}
public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(java.lang.String p0){
return StrMatcher.charSetMatcher(p0);
}
public static <V> java.lang.String replace(java.lang.Object p0,java.util.Map<java.lang.String, V> p1){
return StrSubstitutor.replace(p0,p1);
}
public static <V> java.lang.String replace(java.lang.Object p0,java.util.Map<java.lang.String, V> p1,java.lang.String p2,java.lang.String p3){
return StrSubstitutor.replace(p0,p1,p2,p3);
}
public static java.lang.String replace(java.lang.Object p0,java.util.Properties p1){
return StrSubstitutor.replace(p0,p1);
}
public static java.lang.String replaceSystemProperties(java.lang.Object p0){
return StrSubstitutor.replaceSystemProperties(p0);
}
public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(java.lang.String p0){
return StrTokenizer.getCSVInstance(p0);
}
public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(java.lang.String p0){
return StrTokenizer.getTSVInstance(p0);
}
public static java.lang.String hex(int p0){
return CharSequenceTranslator.hex(p0);
}
public static java.lang.String wrap(java.lang.String p0,int p1){
return WordUtils.wrap(p0,p1);
}
public static java.lang.String wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3){
return WordUtils.wrap(p0,p1,p2,p3);
}
public static java.lang.String capitalize(java.lang.String p0,char... p1){
return WordUtils.capitalize(p0,p1);
}
public static java.lang.String uncapitalize(java.lang.String p0,char... p1){
return WordUtils.uncapitalize(p0,p1);
}
public static java.lang.String initials(java.lang.String p0,char... p1){
return WordUtils.initials(p0,p1);
}
public static java.lang.String initials(java.lang.String p0){
return WordUtils.initials(p0);
}
public static java.lang.String capitalizeFully(java.lang.String p0,char... p1){
return WordUtils.capitalizeFully(p0,p1);
}
public static java.lang.String capitalizeFully(java.lang.String p0){
return WordUtils.capitalizeFully(p0);
}
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(java.util.Date p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(long p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(java.util.Date p0,java.lang.String p1,java.util.TimeZone p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(long p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3){
return DateFormatUtils.format(p0,p1,p2,p3);
}
public static java.lang.String format(java.util.Date p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3){
return DateFormatUtils.format(p0,p1,p2,p3);
}
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3){
return DateFormatUtils.format(p0,p1,p2,p3);
}
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.TimeZone p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(java.util.Date p0,java.lang.String p1){
return DateFormatUtils.format(p0,p1);
}
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1){
return DateFormatUtils.format(p0,p1);
}
public static java.lang.String format(long p0,java.lang.String p1){
return DateFormatUtils.format(p0,p1);
}
public static java.lang.String format(long p0,java.lang.String p1,java.util.TimeZone p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String formatUTC(java.util.Date p0,java.lang.String p1){
return DateFormatUtils.formatUTC(p0,p1);
}
public static java.lang.String formatUTC(long p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.formatUTC(p0,p1,p2);
}
public static java.lang.String formatUTC(java.util.Date p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.formatUTC(p0,p1,p2);
}
public static java.lang.String formatUTC(long p0,java.lang.String p1){
return DateFormatUtils.formatUTC(p0,p1);
}
public static java.util.Date parseDate(java.lang.String p0,java.lang.String... p1) throws java.text.ParseException{
return DateUtils.parseDate(p0,p1);
}
public static java.util.Date parseDate(java.lang.String p0,java.util.Locale p1,java.lang.String... p2) throws java.text.ParseException{
return DateUtils.parseDate(p0,p1,p2);
}
public static java.util.Date parseDateStrictly(java.lang.String p0,java.lang.String... p1) throws java.text.ParseException{
return DateUtils.parseDateStrictly(p0,p1);
}
public static java.util.Date parseDateStrictly(java.lang.String p0,java.util.Locale p1,java.lang.String... p2) throws java.text.ParseException{
return DateUtils.parseDateStrictly(p0,p1,p2);
}
public static java.lang.String formatPeriod(long p0,long p1,java.lang.String p2,boolean p3,java.util.TimeZone p4){
return DurationFormatUtils.formatPeriod(p0,p1,p2,p3,p4);
}
public static java.lang.String formatPeriod(long p0,long p1,java.lang.String p2){
return DurationFormatUtils.formatPeriod(p0,p1,p2);
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
public static java.lang.String formatDurationISO(long p0){
return DurationFormatUtils.formatDurationISO(p0);
}
public static java.lang.String formatDurationWords(long p0,boolean p1,boolean p2){
return DurationFormatUtils.formatDurationWords(p0,p1,p2);
}
public static java.lang.String formatDurationHMS(long p0){
return DurationFormatUtils.formatDurationHMS(p0);
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0,java.util.Locale p1){
return FastDateFormat.getInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0,java.util.TimeZone p1){
return FastDateFormat.getInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getInstance(p0,p1,p2);
}
public static void isAssignableFrom(java.lang.Class<?> p0,java.lang.Class<?> p1,java.lang.String p2,java.lang.Object... p3){
 Validate.isAssignableFrom(p0,p1,p2,p3);
}
public static <T> T[] validIndex(T[] p0,int p1,java.lang.String p2,java.lang.Object... p3){
return Validate.validIndex(p0,p1,p2,p3);
}
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1,java.lang.String p2,java.lang.Object... p3){
return Validate.validIndex(p0,p1,p2,p3);
}
public static <T extends java.lang.CharSequence > T notEmpty(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notEmpty(p0,p1,p2);
}
public static <T> T[] notEmpty(T[] p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notEmpty(p0,p1,p2);
}
public static <T> T notNull(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notNull(p0,p1,p2);
}
public static void isInstanceOf(java.lang.Class<?> p0,java.lang.Object p1,java.lang.String p2,java.lang.Object... p3){
 Validate.isInstanceOf(p0,p1,p2,p3);
}
public static <T> void exclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2,java.lang.String p3,java.lang.Object... p4){
 Validate.exclusiveBetween(p0,p1,p2,p3,p4);
}
public static void exclusiveBetween(double p0,double p1,double p2,java.lang.String p3){
 Validate.exclusiveBetween(p0,p1,p2,p3);
}
public static void exclusiveBetween(long p0,long p1,long p2,java.lang.String p3){
 Validate.exclusiveBetween(p0,p1,p2,p3);
}
public static void validState(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Validate.validState(p0,p1,p2);
}
public static <T extends java.lang.CharSequence > T notBlank(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notBlank(p0,p1,p2);
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
public static void isTrue(boolean p0,java.lang.String p1,long p2){
 Validate.isTrue(p0,p1,p2);
}
public static void isTrue(boolean p0,java.lang.String p1,java.lang.Object... p2){
 Validate.isTrue(p0,p1,p2);
}
public static void inclusiveBetween(long p0,long p1,long p2,java.lang.String p3){
 Validate.inclusiveBetween(p0,p1,p2,p3);
}
public static <T> void inclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2,java.lang.String p3,java.lang.Object... p4){
 Validate.inclusiveBetween(p0,p1,p2,p3,p4);
}
public static void inclusiveBetween(double p0,double p1,double p2,java.lang.String p3){
 Validate.inclusiveBetween(p0,p1,p2,p3);
}
public static <T> T[] noNullElements(T[] p0,java.lang.String p1,java.lang.Object... p2){
return Validate.noNullElements(p0,p1,p2);
}
public static <T extends java.lang.Iterable<?> > T noNullElements(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.noNullElements(p0,p1,p2);
}
public static void deserializeRealVector(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2) throws java.lang.ClassNotFoundException,java.io.IOException{
 MatrixUtils.deserializeRealVector(p0,p1,p2);
}
public static void deserializeRealMatrix(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2) throws java.lang.ClassNotFoundException,java.io.IOException{
 MatrixUtils.deserializeRealMatrix(p0,p1,p2);
}
public static java.lang.String formatBigFraction(org.apache.commons.math3.fraction.BigFraction p0){
return BigFractionFormat.formatBigFraction(p0);
}
public static java.lang.String formatFraction(org.apache.commons.math3.fraction.Fraction p0){
return FractionFormat.formatFraction(p0);
}
public static void parseAndIgnoreWhitespace(java.lang.String p0,java.text.ParsePosition p1){
 CompositeFormat.parseAndIgnoreWhitespace(p0,p1);
}
public static char parseNextCharacter(java.lang.String p0,java.text.ParsePosition p1){
return CompositeFormat.parseNextCharacter(p0,p1);
}
public static boolean parseFixedstring(java.lang.String p0,java.lang.String p1,java.text.ParsePosition p2){
return CompositeFormat.parseFixedstring(p0,p1,p2);
}
public static java.lang.Number parseNumber(java.lang.String p0,java.text.NumberFormat p1,java.text.ParsePosition p2){
return CompositeFormat.parseNumber(p0,p1,p2);
}
public static void setProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 LocaleBeanUtils.setProperty(p0,p1,p2,p3);
}
public static void setProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 LocaleBeanUtils.setProperty(p0,p1,p2);
}
public static java.lang.String getProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getProperty(p0,p1);
}
public static java.lang.String getProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getProperty(p0,p1,p2);
}
public static java.lang.String getNestedProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getNestedProperty(p0,p1);
}
public static java.lang.String getNestedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getNestedProperty(p0,p1,p2);
}
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getIndexedProperty(p0,p1,p2,p3);
}
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getIndexedProperty(p0,p1,p2);
}
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getIndexedProperty(p0,p1,p2);
}
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getIndexedProperty(p0,p1);
}
public static java.lang.String getMappedPropertyLocale(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getMappedPropertyLocale(p0,p1,p2);
}
public static java.lang.String getSimpleProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getSimpleProperty(p0,p1);
}
public static java.lang.String getSimpleProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getSimpleProperty(p0,p1,p2);
}
public static java.lang.String getMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getMappedProperty(p0,p1,p2,p3);
}
public static java.lang.String getMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getMappedProperty(p0,p1,p2);
}
public static java.lang.String getMappedProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getMappedProperty(p0,p1);
}
public static java.lang.String[] getArrayProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return BeanUtils.getArrayProperty(p0,p1);
}
public static void copyProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 BeanUtils.copyProperty(p0,p1,p2);
}
public static java.lang.Class<?> getPropertyType(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return PropertyUtils.getPropertyType(p0,p1);
}
public static boolean isReadable(java.lang.Object p0,java.lang.String p1){
return PropertyUtils.isReadable(p0,p1);
}
public static boolean isWriteable(java.lang.Object p0,java.lang.String p1){
return PropertyUtils.isWriteable(p0,p1);
}
public static void setSimpleProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setSimpleProperty(p0,p1,p2);
}
public static java.beans.PropertyDescriptor getPropertyDescriptor(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return PropertyUtils.getPropertyDescriptor(p0,p1);
}
public static void setNestedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setNestedProperty(p0,p1,p2);
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
public static java.lang.Class<?> getPropertyEditorClass(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return PropertyUtils.getPropertyEditorClass(p0,p1);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>[] p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?> p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>[] p2){
return MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static java.lang.Object convert(java.lang.String[] p0,java.lang.Class<?> p1,java.lang.String p2){
return LocaleConvertUtils.convert(p0,p1,p2);
}
public static java.lang.Object convert(java.lang.String p0,java.lang.Class<?> p1,java.lang.String p2){
return LocaleConvertUtils.convert(p0,p1,p2);
}
public static java.lang.Object convert(java.lang.String p0,java.lang.Class<?> p1,java.util.Locale p2,java.lang.String p3){
return LocaleConvertUtils.convert(p0,p1,p2,p3);
}
public static java.lang.Object convert(java.lang.String[] p0,java.lang.Class<?> p1,java.util.Locale p2,java.lang.String p3){
return LocaleConvertUtils.convert(p0,p1,p2,p3);
}
public static java.lang.String convert(java.lang.Object p0){
return LocaleConvertUtils.convert(p0);
}
public static java.lang.String convert(java.lang.Object p0,java.lang.String p1){
return LocaleConvertUtils.convert(p0,p1);
}
public static java.lang.String convert(java.lang.Object p0,java.util.Locale p1,java.lang.String p2){
return LocaleConvertUtils.convert(p0,p1,p2);
}
public static java.lang.Object convert(java.lang.String p0,java.lang.Class<?> p1){
return LocaleConvertUtils.convert(p0,p1);
}
public static final java.lang.String escapeXSI(java.lang.String p0){
return StringEscapeUtils.escapeXSI(p0);
}
public static final java.lang.String unescapeXSI(java.lang.String p0){
return StringEscapeUtils.unescapeXSI(p0);
}
public static java.lang.String wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3,java.lang.String p4){
return WordUtils.wrap(p0,p1,p2,p3,p4);
}
public static java.lang.String abbreviate(java.lang.String p0,int p1,int p2,java.lang.String p3){
return WordUtils.abbreviate(p0,p1,p2,p3);
}
public static java.nio.ByteBuffer toByteBuffer(java.lang.String p0){
return Convert.toByteBuffer(p0);
}
public static java.lang.String backtrackToFile(java.lang.String p0,java.lang.String p1){
return FileUtils.backtrackToFile(p0,p1);
}
public static java.lang.String stripQuotes(java.lang.String p0){
return StringUtils.stripQuotes(p0);
}
public static <E extends java.lang.Throwable > void logElapsedTime(java.lang.String p0,com.facebook.util.ExtRunnable<E> p1) throws E{
 TimeUtil.logElapsedTime(p0,p1);
}
public static <V,E extends java.lang.Throwable > V logElapsedTime(java.lang.String p0,com.facebook.util.ExtCallable<V, E> p1) throws E{
return TimeUtil.logElapsedTime(p0,p1);
}
public static org.joda.time.DateTimeZone getDateTimeZone(java.lang.String p0){
return TimeUtil.getDateTimeZone(p0);
}
public static org.joda.time.chrono.ISOChronology getChronology(java.lang.String p0){
return TimeUtil.getChronology(p0);
}
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1,java.lang.String p2,java.lang.Object... p3) throws T{
 Validations.checkState(p0,p1,p2,p3);
}
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1,java.lang.String p2) throws T{
 Validations.checkState(p0,p1,p2);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.lang.String[] p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.lang.String p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.util.Collection p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2){
return ToStringBuilder.reflectionToString(p0,p1,p2);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2,java.lang.Class p3){
return ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1){
return ToStringBuilder.reflectionToString(p0,p1);
}
public static int count(java.lang.String p0,java.lang.String[] p1){
return CharSetUtils.count(p0,p1);
}
public static int count(java.lang.String p0,java.lang.String p1){
return CharSetUtils.count(p0,p1);
}
public static java.lang.String delete(java.lang.String p0,java.lang.String[] p1){
return CharSetUtils.delete(p0,p1);
}
public static java.lang.String delete(java.lang.String p0,java.lang.String p1){
return CharSetUtils.delete(p0,p1);
}
public static java.lang.String keep(java.lang.String p0,java.lang.String[] p1){
return CharSetUtils.keep(p0,p1);
}
public static java.lang.String keep(java.lang.String p0,java.lang.String p1){
return CharSetUtils.keep(p0,p1);
}
public static java.lang.String squeeze(java.lang.String p0,java.lang.String p1){
return CharSetUtils.squeeze(p0,p1);
}
public static java.lang.String squeeze(java.lang.String p0,java.lang.String[] p1){
return CharSetUtils.squeeze(p0,p1);
}
public static java.lang.String translate(java.lang.String p0,java.lang.String p1,java.lang.String p2){
return CharSetUtils.translate(p0,p1,p2);
}
public static java.lang.String getShortClassName(java.lang.Class p0){
return ClassUtils.getShortClassName(p0);
}
public static java.lang.String getPackageName(java.lang.Class p0){
return ClassUtils.getPackageName(p0);
}
public static java.lang.reflect.Method getPublicMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2) throws java.lang.SecurityException,java.lang.NoSuchMethodException{
return ClassUtils.getPublicMethod(p0,p1,p2);
}
public static java.lang.String getPackageCanonicalName(java.lang.Class p0){
return ClassUtils.getPackageCanonicalName(p0);
}
public static java.lang.String getShortCanonicalName(java.lang.Class p0){
return ClassUtils.getShortCanonicalName(p0);
}
public static org.apache.commons.lang.enum.Enum getEnum(java.lang.Class p0,java.lang.String p1){
return EnumUtils.getEnum(p0,p1);
}
public static void addCauseMethodName(java.lang.String p0){
 ExceptionUtils.addCauseMethodName(p0);
}
public static boolean isCauseMethodName(java.lang.String p0){
return ExceptionUtils.isCauseMethodName(p0);
}
public static void removeCauseMethodName(java.lang.String p0){
 ExceptionUtils.removeCauseMethodName(p0);
}
public static java.lang.String getFullStackTrace(java.lang.Throwable p0){
return ExceptionUtils.getFullStackTrace(p0);
}
public static int stringToInt(java.lang.String p0){
return NumberUtils.stringToInt(p0);
}
public static int stringToInt(java.lang.String p0,int p1){
return NumberUtils.stringToInt(p0,p1);
}
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5){
return RandomStringUtils.random(p0,p1,p2,p3,p4,p5);
}
public static java.lang.String random(int p0,char[] p1){
return RandomStringUtils.random(p0,p1);
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class p0,java.lang.String p1,boolean p2){
return FieldUtils.getDeclaredField(p0,p1,p2);
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class p0,java.lang.String p1){
return FieldUtils.getDeclaredField(p0,p1);
}
public static java.lang.reflect.Field getField(java.lang.Class p0,java.lang.String p1,boolean p2){
return FieldUtils.getField(p0,p1,p2);
}
public static java.lang.reflect.Field getField(java.lang.Class p0,java.lang.String p1){
return FieldUtils.getField(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.Class p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.Class p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2,p3);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1,p2);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1);
}
public static void writeDeclaredStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
public static void writeDeclaredStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2,p3);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2){
return MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
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
public static java.lang.String unescapeJavaScript(java.lang.String p0){
return StringEscapeUtils.unescapeJavaScript(p0);
}
public static void unescapeJavaScript(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeJavaScript(p0,p1);
}
public static void escapeHtml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeHtml(p0,p1);
}
public static java.lang.String escapeHtml(java.lang.String p0){
return StringEscapeUtils.escapeHtml(p0);
}
public static java.lang.String escapeSql(java.lang.String p0){
return StringEscapeUtils.escapeSql(p0);
}
public static java.lang.String unescapeHtml(java.lang.String p0){
return StringEscapeUtils.unescapeHtml(p0);
}
public static void unescapeHtml(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.unescapeHtml(p0,p1);
}
public static java.lang.String escapeJavaScript(java.lang.String p0){
return StringEscapeUtils.escapeJavaScript(p0);
}
public static void escapeJavaScript(java.io.Writer p0,java.lang.String p1) throws java.io.IOException{
 StringEscapeUtils.escapeJavaScript(p0,p1);
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
public static java.lang.String join(java.util.Collection p0,java.lang.String p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.util.Collection p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.util.Iterator p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.lang.Object[] p0){
return StringUtils.join(p0);
}
public static java.lang.String join(java.util.Iterator p0,java.lang.String p1){
return StringUtils.join(p0,p1);
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
public static boolean startsWith(java.lang.String p0,java.lang.String p1){
return StringUtils.startsWith(p0,p1);
}
public static java.lang.String clean(java.lang.String p0){
return StringUtils.clean(p0);
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
public static java.lang.String escape(java.lang.String p0){
return StringUtils.escape(p0);
}
public static boolean containsIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.containsIgnoreCase(p0,p1);
}
public static boolean isAlphanumericSpace(java.lang.String p0){
return StringUtils.isAlphanumericSpace(p0);
}
public static int indexOfDifference(java.lang.String p0,java.lang.String p1){
return StringUtils.indexOfDifference(p0,p1);
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
public static boolean startsWithIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.startsWithIgnoreCase(p0,p1);
}
public static boolean endsWithIgnoreCase(java.lang.String p0,java.lang.String p1){
return StringUtils.endsWithIgnoreCase(p0,p1);
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
public static boolean isNotBlank(java.lang.String p0){
return StringUtils.isNotBlank(p0);
}
public static boolean isBlank(java.lang.String p0){
return StringUtils.isBlank(p0);
}
public static boolean isNotEmpty(java.lang.String p0){
return StringUtils.isNotEmpty(p0);
}
public static boolean containsNone(java.lang.String p0,java.lang.String p1){
return StringUtils.containsNone(p0,p1);
}
public static boolean containsNone(java.lang.String p0,char[] p1){
return StringUtils.containsNone(p0,p1);
}
public static int indexOfAnyBut(java.lang.String p0,java.lang.String p1){
return StringUtils.indexOfAnyBut(p0,p1);
}
public static int indexOfAnyBut(java.lang.String p0,char[] p1){
return StringUtils.indexOfAnyBut(p0,p1);
}
public static boolean containsAny(java.lang.String p0,java.lang.String p1){
return StringUtils.containsAny(p0,p1);
}
public static boolean containsAny(java.lang.String p0,char[] p1){
return StringUtils.containsAny(p0,p1);
}
public static boolean containsOnly(java.lang.String p0,char[] p1){
return StringUtils.containsOnly(p0,p1);
}
public static boolean containsOnly(java.lang.String p0,java.lang.String p1){
return StringUtils.containsOnly(p0,p1);
}
public static int lastIndexOfAny(java.lang.String p0,java.lang.String[] p1){
return StringUtils.lastIndexOfAny(p0,p1);
}
public static boolean isAsciiPrintable(java.lang.String p0){
return StringUtils.isAsciiPrintable(p0);
}
public static boolean isAllLowerCase(java.lang.String p0){
return StringUtils.isAllLowerCase(p0);
}
public static java.lang.String defaultIfEmpty(java.lang.String p0,java.lang.String p1){
return StringUtils.defaultIfEmpty(p0,p1);
}
public static java.lang.String getCommonPrefix(java.lang.String[] p0){
return StringUtils.getCommonPrefix(p0);
}
public static java.lang.String defaultIfBlank(java.lang.String p0,java.lang.String p1){
return StringUtils.defaultIfBlank(p0,p1);
}
public static int countMatches(java.lang.String p0,java.lang.String p1){
return StringUtils.countMatches(p0,p1);
}
public static boolean isAlphanumeric(java.lang.String p0){
return StringUtils.isAlphanumeric(p0);
}
public static boolean isAllUpperCase(java.lang.String p0){
return StringUtils.isAllUpperCase(p0);
}
public static boolean isNumericSpace(java.lang.String p0){
return StringUtils.isNumericSpace(p0);
}
public static boolean isAlphaSpace(java.lang.String p0){
return StringUtils.isAlphaSpace(p0);
}
public static boolean endsWithAny(java.lang.String p0,java.lang.String[] p1){
return StringUtils.endsWithAny(p0,p1);
}
public static boolean startsWithAny(java.lang.String p0,java.lang.String[] p1){
return StringUtils.startsWithAny(p0,p1);
}
public static java.lang.String capitaliseAllWords(java.lang.String p0){
return StringUtils.capitaliseAllWords(p0);
}
public static java.lang.String reverseDelimitedString(java.lang.String p0,java.lang.String p1){
return StringUtils.reverseDelimitedString(p0,p1);
}
public static java.lang.String concatenate(java.lang.Object[] p0){
return StringUtils.concatenate(p0);
}
public static java.lang.String getChomp(java.lang.String p0,java.lang.String p1){
return StringUtils.getChomp(p0,p1);
}
public static java.lang.String uncapitalise(java.lang.String p0){
return StringUtils.uncapitalise(p0);
}
public static java.lang.String getPrechomp(java.lang.String p0,java.lang.String p1){
return StringUtils.getPrechomp(p0,p1);
}
public static java.lang.String chopNewline(java.lang.String p0){
return StringUtils.chopNewline(p0);
}
public static java.lang.String getNestedString(java.lang.String p0,java.lang.String p1){
return StringUtils.getNestedString(p0,p1);
}
public static java.lang.String getNestedString(java.lang.String p0,java.lang.String p1,java.lang.String p2){
return StringUtils.getNestedString(p0,p1,p2);
}
public static java.lang.String overlayString(java.lang.String p0,java.lang.String p1,int p2,int p3){
return StringUtils.overlayString(p0,p1,p2,p3);
}
public static java.lang.String prechomp(java.lang.String p0,java.lang.String p1){
return StringUtils.prechomp(p0,p1);
}
public static java.lang.String chompLast(java.lang.String p0){
return StringUtils.chompLast(p0);
}
public static java.lang.String chompLast(java.lang.String p0,java.lang.String p1){
return StringUtils.chompLast(p0,p1);
}
public static java.lang.String capitalise(java.lang.String p0){
return StringUtils.capitalise(p0);
}
public static java.lang.String deleteSpaces(java.lang.String p0){
return StringUtils.deleteSpaces(p0);
}
public static java.lang.String replace(java.lang.Object p0,java.util.Map p1){
return StrSubstitutor.replace(p0,p1);
}
public static java.lang.String replace(java.lang.Object p0,java.util.Map p1,java.lang.String p2,java.lang.String p3){
return StrSubstitutor.replace(p0,p1,p2,p3);
}
public static java.util.Date parseDate(java.lang.String p0,java.lang.String[] p1) throws java.text.ParseException{
return DateUtils.parseDate(p0,p1);
}
public static java.util.Date parseDateStrictly(java.lang.String p0,java.lang.String[] p1) throws java.text.ParseException{
return DateUtils.parseDateStrictly(p0,p1);
}
public static void notEmpty(java.util.Collection p0,java.lang.String p1){
 Validate.notEmpty(p0,p1);
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
public static void notEmpty(java.util.Map p0,java.lang.String p1){
 Validate.notEmpty(p0,p1);
}
public static void notNull(java.lang.Object p0,java.lang.String p1){
 Validate.notNull(p0,p1);
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
public static void noNullElements(java.lang.Object[] p0,java.lang.String p1){
 Validate.noNullElements(p0,p1);
}
public static void allElementsOfType(java.util.Collection p0,java.lang.Class p1,java.lang.String p2){
 Validate.allElementsOfType(p0,p1,p2);
}
public static java.lang.String capitalize(java.lang.String p0,char[] p1){
return WordUtils.capitalize(p0,p1);
}
public static java.lang.String uncapitalize(java.lang.String p0,char[] p1){
return WordUtils.uncapitalize(p0,p1);
}
public static java.lang.String initials(java.lang.String p0,char[] p1){
return WordUtils.initials(p0,p1);
}
public static java.lang.String capitalizeFully(java.lang.String p0,char[] p1){
return WordUtils.capitalizeFully(p0,p1);
}
}
