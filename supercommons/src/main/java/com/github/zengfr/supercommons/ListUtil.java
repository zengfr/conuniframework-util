package com.zengfr.supercommons;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Bytes;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.list.PredicatedList;
import org.apache.commons.collections.list.FixedSizeList;
import org.apache.commons.collections.list.SetUniqueList;
import org.apache.commons.collections.list.SynchronizedList;
import org.apache.commons.collections.list.GrowthList;
import org.apache.commons.collections.list.UnmodifiableList;
import org.apache.commons.collections.list.LazyList;
import org.apache.commons.collections.list.TypedList;
import org.apache.commons.collections.list.TransformedList;
import org.apache.commons.collections.set.ListOrderedSet;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.EnumerationUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.list.UnmodifiableList;
import org.apache.commons.collections4.MultiMapUtils;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.EnumerationUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.math3.primes.Primes;
import org.apache.commons.math3.genetics.RandomKey;
import org.apache.commons.math3.genetics.BinaryChromosome;
import org.apache.commons.collections.primitives.adapters.ByteListList;
import org.apache.commons.collections.primitives.adapters.CharListList;
import org.apache.commons.collections.primitives.adapters.DoubleListList;
import org.apache.commons.collections.primitives.adapters.FloatListList;
import org.apache.commons.collections.primitives.adapters.IntListList;
import org.apache.commons.collections.primitives.adapters.ListByteList;
import org.apache.commons.collections.primitives.adapters.ListCharList;
import org.apache.commons.collections.primitives.adapters.ListDoubleList;
import org.apache.commons.collections.primitives.adapters.ListFloatList;
import org.apache.commons.collections.primitives.adapters.ListIntList;
import org.apache.commons.collections.primitives.adapters.ListLongList;
import org.apache.commons.collections.primitives.adapters.ListShortList;
import org.apache.commons.collections.primitives.adapters.LongListList;
import org.apache.commons.collections.primitives.adapters.ShortListList;
import com.facebook.collections.ListMapper;
import com.facebook.collections.PackedByteArray;
import com.facebook.collectionsbase.Piles;
import com.facebook.util.StreamImporter;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.enum.EnumUtils;
import org.apache.commons.lang.enums.EnumUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.lang.LocaleUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListUtil{ 
public static java.util.List<java.lang.Throwable> getCausalChain(java.lang.Throwable p0){
return Throwables.getCausalChain(p0);
}
public static java.util.List<java.lang.StackTraceElement> lazyStackTrace(java.lang.Throwable p0){
return Throwables.lazyStackTrace(p0);
}
public static <E> java.util.List<E> asList(E p0,E[] p1){
return Lists.asList(p0,p1);
}
public static <E> java.util.List<E> asList(E p0,E p1,E[] p2){
return Lists.asList(p0,p1,p2);
}
public static <T> java.util.List<T> reverse(java.util.List<T> p0){
return Lists.reverse(p0);
}
public static <F,T> java.util.List<T> transform(java.util.List<F> p0,com.google.common.base.Function<? super F, ? extends T> p1){
return Lists.transform(p0,p1);
}
public static <T> java.util.List<java.util.List<T>> partition(java.util.List<T> p0,int p1){
return Lists.partition(p0,p1);
}
public static java.util.List<java.lang.Character> charactersOf(java.lang.CharSequence p0){
return Lists.charactersOf(p0);
}
public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends B>... p0){
return Lists.cartesianProduct(p0);
}
public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.List<? extends B>> p0){
return Lists.cartesianProduct(p0);
}
public static java.util.List<java.lang.String> readLines(java.lang.Readable p0) throws java.io.IOException{
return CharStreams.readLines(p0);
}
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
return Files.readLines(p0,p1);
}
public static java.util.List<java.lang.String> readLines(java.net.URL p0,java.nio.charset.Charset p1) throws java.io.IOException{
return Resources.readLines(p0,p1);
}
public static java.util.List<java.lang.Boolean> asList(boolean... p0){
return Booleans.asList(p0);
}
public static java.util.List<java.lang.Byte> asList(byte... p0){
return Bytes.asList(p0);
}
public static java.util.List<java.lang.Character> asList(char... p0){
return Chars.asList(p0);
}
public static java.util.List<java.lang.Double> asList(double... p0){
return Doubles.asList(p0);
}
public static java.util.List<java.lang.Float> asList(float... p0){
return Floats.asList(p0);
}
public static java.util.List<java.lang.Integer> asList(int... p0){
return Ints.asList(p0);
}
public static java.util.List<java.lang.Long> asList(long... p0){
return Longs.asList(p0);
}
public static java.util.List<java.lang.Short> asList(short... p0){
return Shorts.asList(p0);
}
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.readLines(p0,p1);
}
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
return IOUtils.readLines(p0,p1);
}
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0) throws java.io.IOException{
return IOUtils.readLines(p0);
}
public static java.util.List<java.lang.String> readLines(java.io.Reader p0) throws java.io.IOException{
return IOUtils.readLines(p0);
}
public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
return FileFilterUtils.filterList(p0,p1);
}
public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
return FileFilterUtils.filterList(p0,p1);
}
public static java.util.List<org.apache.commons.io.filefilter.IOFileFilter> toList(org.apache.commons.io.filefilter.IOFileFilter... p0){
return FileFilterUtils.toList(p0);
}
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.lang.String p1) throws java.io.IOException{
return FileUtils.readLines(p0,p1);
}
public static java.util.List<java.lang.String> readLines(java.io.File p0) throws java.io.IOException{
return FileUtils.readLines(p0);
}
public static java.util.List toList(java.util.Iterator p0,int p1){
return IteratorUtils.toList(p0,p1);
}
public static java.util.List toList(java.util.Iterator p0){
return IteratorUtils.toList(p0);
}
public static org.apache.commons.collections.ResettableListIterator loopingListIterator(java.util.List p0){
return IteratorUtils.loopingListIterator(p0);
}
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Predicate p1){
return PredicatedList.decorate(p0,p1);
}
public static java.util.List decorate(java.util.List p0){
return FixedSizeList.decorate(p0);
}
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Factory p1){
return LazyList.decorate(p0,p1);
}
public static java.util.List decorate(java.util.List p0,java.lang.Class p1){
return TypedList.decorate(p0,p1);
}
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Transformer p1){
return TransformedList.decorate(p0,p1);
}
public static org.apache.commons.collections.set.ListOrderedSet decorate(java.util.Set p0,java.util.List p1){
return ListOrderedSet.decorate(p0,p1);
}
public static java.util.List unmodifiableList(java.util.List p0){
return ListUtils.unmodifiableList(p0);
}
public static java.util.List sum(java.util.List p0,java.util.List p1){
return ListUtils.sum(p0,p1);
}
public static java.util.List removeAll(java.util.Collection p0,java.util.Collection p1){
return ListUtils.removeAll(p0,p1);
}
public static java.util.List retainAll(java.util.Collection p0,java.util.Collection p1){
return ListUtils.retainAll(p0,p1);
}
public static java.util.List synchronizedList(java.util.List p0){
return ListUtils.synchronizedList(p0);
}
public static java.util.List intersection(java.util.List p0,java.util.List p1){
return ListUtils.intersection(p0,p1);
}
public static java.util.List union(java.util.List p0,java.util.List p1){
return ListUtils.union(p0,p1);
}
public static java.util.List subtract(java.util.List p0,java.util.List p1){
return ListUtils.subtract(p0,p1);
}
public static java.util.List fixedSizeList(java.util.List p0){
return ListUtils.fixedSizeList(p0);
}
public static java.util.List predicatedList(java.util.List p0,org.apache.commons.collections.Predicate p1){
return ListUtils.predicatedList(p0,p1);
}
public static java.util.List typedList(java.util.List p0,java.lang.Class p1){
return ListUtils.typedList(p0,p1);
}
public static java.util.List transformedList(java.util.List p0,org.apache.commons.collections.Transformer p1){
return ListUtils.transformedList(p0,p1);
}
public static java.util.List lazyList(java.util.List p0,org.apache.commons.collections.Factory p1){
return ListUtils.lazyList(p0,p1);
}
public static java.util.List toList(java.util.Enumeration p0){
return EnumerationUtils.toList(p0);
}
public static <O extends java.lang.Comparable<? super O> > java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
return CollectionUtils.collate(p0,p1);
}
public static <O> java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,java.util.Comparator<? super O> p2){
return CollectionUtils.collate(p0,p1,p2);
}
public static <O> java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,java.util.Comparator<? super O> p2,boolean p3){
return CollectionUtils.collate(p0,p1,p2,p3);
}
public static <O extends java.lang.Comparable<? super O> > java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,boolean p2){
return CollectionUtils.collate(p0,p1,p2);
}
public static <E> java.util.List<E> toList(java.util.Iterator<? extends E> p0,int p1){
return IteratorUtils.toList(p0,p1);
}
public static <E> java.util.List<E> toList(java.util.Iterator<? extends E> p0){
return IteratorUtils.toList(p0);
}
public static <E> java.util.List<E> unmodifiableList(java.util.List<? extends E> p0){
return UnmodifiableList.unmodifiableList(p0);
}
public static <K,V> java.util.List<V> getValuesAsList(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
return MultiMapUtils.getValuesAsList(p0,p1);
}
public static <E> java.util.List<E> sum(java.util.List<? extends E> p0,java.util.List<? extends E> p1){
return ListUtils.sum(p0,p1);
}
public static <E> java.util.List<E> removeAll(java.util.Collection<E> p0,java.util.Collection<?> p1){
return ListUtils.removeAll(p0,p1);
}
public static <E> java.util.List<E> retainAll(java.util.Collection<E> p0,java.util.Collection<?> p1){
return ListUtils.retainAll(p0,p1);
}
public static <E> java.util.List<E> synchronizedList(java.util.List<E> p0){
return ListUtils.synchronizedList(p0);
}
public static <E> java.util.List<E> intersection(java.util.List<? extends E> p0,java.util.List<? extends E> p1){
return ListUtils.intersection(p0,p1);
}
public static <E> java.util.List<E> union(java.util.List<? extends E> p0,java.util.List<? extends E> p1){
return ListUtils.union(p0,p1);
}
public static <E> java.util.List<E> longestCommonSubsequence(java.util.List<E> p0,java.util.List<E> p1){
return ListUtils.longestCommonSubsequence(p0,p1);
}
public static <E> java.util.List<E> longestCommonSubsequence(java.util.List<E> p0,java.util.List<E> p1,org.apache.commons.collections4.Equator<? super E> p2){
return ListUtils.longestCommonSubsequence(p0,p1,p2);
}
public static <E> java.util.List<E> subtract(java.util.List<E> p0,java.util.List<? extends E> p1){
return ListUtils.subtract(p0,p1);
}
public static <E> java.util.List<E> select(java.util.Collection<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return ListUtils.select(p0,p1);
}
public static <E> java.util.List<E> fixedSizeList(java.util.List<E> p0){
return ListUtils.fixedSizeList(p0);
}
public static <E> java.util.List<E> predicatedList(java.util.List<E> p0,org.apache.commons.collections4.Predicate<E> p1){
return ListUtils.predicatedList(p0,p1);
}
public static <E> java.util.List<E> transformedList(java.util.List<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return ListUtils.transformedList(p0,p1);
}
public static <E> java.util.List<E> lazyList(java.util.List<E> p0,org.apache.commons.collections4.Factory<? extends E> p1){
return ListUtils.lazyList(p0,p1);
}
public static <E> java.util.List<E> selectRejected(java.util.Collection<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return ListUtils.selectRejected(p0,p1);
}
public static <T> java.util.List<T> emptyIfNull(java.util.List<T> p0){
return ListUtils.emptyIfNull(p0);
}
public static <T> java.util.List<T> defaultIfNull(java.util.List<T> p0,java.util.List<T> p1){
return ListUtils.defaultIfNull(p0,p1);
}
public static <O> java.util.List<java.util.List<O>> partition(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O>... p1){
return IterableUtils.partition(p0,p1);
}
public static <O,R extends java.util.Collection<O> > java.util.List<R> partition(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Factory<R> p1,org.apache.commons.collections4.Predicate<? super O>... p2){
return IterableUtils.partition(p0,p1,p2);
}
public static <O> java.util.List<java.util.List<O>> partition(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1){
return IterableUtils.partition(p0,p1);
}
public static <E> java.util.List<E> toList(java.lang.Iterable<E> p0){
return IterableUtils.toList(p0);
}
public static java.util.List<java.lang.String> toList(java.util.StringTokenizer p0){
return EnumerationUtils.toList(p0);
}
public static <E> java.util.List<E> toList(java.util.Enumeration<? extends E> p0){
return EnumerationUtils.toList(p0);
}
public static java.util.List<java.lang.Class<?>> getAllInterfaces(java.lang.Class<?> p0){
return ClassUtils.getAllInterfaces(p0);
}
public static java.util.List<java.lang.Class<?>> convertClassNamesToClasses(java.util.List<java.lang.String> p0){
return ClassUtils.convertClassNamesToClasses(p0);
}
public static java.util.List<java.lang.String> convertClassesToClassNames(java.util.List<java.lang.Class<?>> p0){
return ClassUtils.convertClassesToClassNames(p0);
}
public static java.util.List<java.lang.Class<?>> getAllSuperclasses(java.lang.Class<?> p0){
return ClassUtils.getAllSuperclasses(p0);
}
public static <E extends java.lang.Enum<E> > java.util.List<E> getEnumList(java.lang.Class<E> p0){
return EnumUtils.getEnumList(p0);
}
public static java.util.List<java.lang.Throwable> getThrowableList(java.lang.Throwable p0){
return ExceptionUtils.getThrowableList(p0);
}
public static java.util.List<java.util.Locale> localeLookupList(java.util.Locale p0){
return LocaleUtils.localeLookupList(p0);
}
public static java.util.List<java.util.Locale> localeLookupList(java.util.Locale p0,java.util.Locale p1){
return LocaleUtils.localeLookupList(p0,p1);
}
public static java.util.List<java.util.Locale> availableLocaleList(){
return LocaleUtils.availableLocaleList();
}
public static java.util.List<java.util.Locale> languagesByCountry(java.lang.String p0){
return LocaleUtils.languagesByCountry(p0);
}
public static java.util.List<java.util.Locale> countriesByLanguage(java.lang.String p0){
return LocaleUtils.countriesByLanguage(p0);
}
public static java.util.List<java.lang.reflect.Field> getAllFieldsList(java.lang.Class<?> p0){
return FieldUtils.getAllFieldsList(p0);
}
public static java.util.List<java.lang.reflect.Field> getFieldsListWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1){
return FieldUtils.getFieldsListWithAnnotation(p0,p1);
}
public static java.util.List<java.lang.reflect.Method> getMethodsListWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1){
return MethodUtils.getMethodsListWithAnnotation(p0,p1);
}
public static java.util.List<java.lang.Integer> primeFactors(int p0){
return Primes.primeFactors(p0);
}
public static final java.util.List<java.lang.Double> identityPermutation(int p0){
return RandomKey.identityPermutation(p0);
}
public static <S> java.util.List<java.lang.Double> comparatorPermutation(java.util.List<S> p0,java.util.Comparator<S> p1){
return RandomKey.comparatorPermutation(p0,p1);
}
public static <S> java.util.List<java.lang.Double> inducedPermutation(java.util.List<S> p0,java.util.List<S> p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathIllegalArgumentException{
return RandomKey.inducedPermutation(p0,p1);
}
public static final java.util.List<java.lang.Double> randomPermutation(int p0){
return RandomKey.randomPermutation(p0);
}
public static java.util.List<java.lang.Integer> randomBinaryRepresentation(int p0){
return BinaryChromosome.randomBinaryRepresentation(p0);
}
public static java.util.List wrap(org.apache.commons.collections.primitives.ByteList p0){
return ByteListList.wrap(p0);
}
public static java.util.List wrap(org.apache.commons.collections.primitives.CharList p0){
return CharListList.wrap(p0);
}
public static java.util.List wrap(org.apache.commons.collections.primitives.DoubleList p0){
return DoubleListList.wrap(p0);
}
public static java.util.List wrap(org.apache.commons.collections.primitives.FloatList p0){
return FloatListList.wrap(p0);
}
public static java.util.List wrap(org.apache.commons.collections.primitives.IntList p0){
return IntListList.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteList wrap(java.util.List p0){
return ListByteList.wrap(p0);
}
public static java.util.List wrap(org.apache.commons.collections.primitives.LongList p0){
return LongListList.wrap(p0);
}
public static java.util.List wrap(org.apache.commons.collections.primitives.ShortList p0){
return ShortListList.wrap(p0);
}
public static <X,Y> java.util.List<Y> map(java.util.List<X> p0,com.facebook.collectionsbase.Mapper<X, Y> p1){
return ListMapper.map(p0,p1);
}
public static java.util.List<byte[]> unpackComparable(byte[] p0){
return PackedByteArray.unpackComparable(p0);
}
public static java.util.List<byte[]> unpackComparable(byte[] p0,byte p1,byte p2){
return PackedByteArray.unpackComparable(p0,p1,p2);
}
public static java.util.List<byte[]> readByteArrayList(java.io.DataInput p0,byte p1,byte p2) throws java.io.IOException{
return PackedByteArray.readByteArrayList(p0,p1,p2);
}
public static <T> java.util.List<T> copyOf(java.util.Iterator<T> p0){
return Piles.copyOf(p0);
}
public static <X,Y> java.util.List<Y> transmogrify(java.util.Iterator<X> p0,com.google.common.base.Function<X, Y> p1){
return Piles.transmogrify(p0,p1);
}
public static <X,Y> java.util.List<Y> transmogrify(java.util.Iterator<X> p0,com.facebook.collectionsbase.Mapper<X, Y> p1){
return Piles.transmogrify(p0,p1);
}
public static java.util.List<java.lang.String> importLines(java.io.InputStream p0) throws java.io.IOException{
return StreamImporter.importLines(p0);
}
public static java.util.List getAllInterfaces(java.lang.Class p0){
return ClassUtils.getAllInterfaces(p0);
}
public static java.util.List convertClassNamesToClasses(java.util.List p0){
return ClassUtils.convertClassNamesToClasses(p0);
}
public static java.util.List convertClassesToClassNames(java.util.List p0){
return ClassUtils.convertClassesToClassNames(p0);
}
public static java.util.List getAllSuperclasses(java.lang.Class p0){
return ClassUtils.getAllSuperclasses(p0);
}
public static java.util.List getEnumList(java.lang.Class p0){
return EnumUtils.getEnumList(p0);
}
public static void removeCommonFrames(java.util.List p0,java.util.List p1){
 ExceptionUtils.removeCommonFrames(p0,p1);
}
}
