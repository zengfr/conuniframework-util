package com.zengfr.supercommons;
import com.google.common.collect.Iterators;
import org.apache.commons.io.FileUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.collections.primitives.adapters.ByteIteratorIterator;
import org.apache.commons.collections.primitives.adapters.CharIteratorIterator;
import org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator;
import org.apache.commons.collections.primitives.adapters.FloatIteratorIterator;
import org.apache.commons.collections.primitives.adapters.IntIteratorIterator;
import org.apache.commons.collections.primitives.adapters.IteratorByteIterator;
import org.apache.commons.collections.primitives.adapters.IteratorCharIterator;
import org.apache.commons.collections.primitives.adapters.IteratorDoubleIterator;
import org.apache.commons.collections.primitives.adapters.IteratorFloatIterator;
import org.apache.commons.collections.primitives.adapters.IteratorIntIterator;
import org.apache.commons.collections.primitives.adapters.IteratorLongIterator;
import org.apache.commons.collections.primitives.adapters.IteratorShortIterator;
import org.apache.commons.collections.primitives.adapters.LongIteratorIterator;
import org.apache.commons.collections.primitives.adapters.ShortIteratorIterator;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
import it.unimi.dsi.fastutil.chars.CharIterators;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.floats.FloatIterators;
import it.unimi.dsi.fastutil.ints.IntIterators;
import it.unimi.dsi.fastutil.longs.LongIterators;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
import org.apache.commons.lang.enum.EnumUtils;
import org.apache.commons.lang.enums.EnumUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IteratorUtil{ 
public static <T> java.util.Iterator<T> limit(java.util.Iterator<T> p0,int p1){
return Iterators.limit(p0,p1);
}
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1){
return Iterators.concat(p0,p1);
}
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1,java.util.Iterator<? extends T> p2){
return Iterators.concat(p0,p1,p2);
}
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends java.util.Iterator<? extends T>> p0){
return Iterators.concat(p0);
}
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T>... p0){
return Iterators.concat(p0);
}
public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> p0,java.util.Iterator<? extends T> p1,java.util.Iterator<? extends T> p2,java.util.Iterator<? extends T> p3){
return Iterators.concat(p0,p1,p2,p3);
}
public static <F,T> java.util.Iterator<T> transform(java.util.Iterator<F> p0,com.google.common.base.Function<? super F, ? extends T> p1){
return Iterators.transform(p0,p1);
}
public static <T> java.util.Iterator<T> cycle(T... p0){
return Iterators.cycle(p0);
}
public static <T> java.util.Iterator<T> cycle(java.lang.Iterable<T> p0){
return Iterators.cycle(p0);
}
public static <T> java.util.Iterator<T> consumingIterator(java.util.Iterator<T> p0){
return Iterators.consumingIterator(p0);
}
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
return FileUtils.iterateFiles(p0,p1,p2);
}
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.iterateFiles(p0,p1,p2);
}
public static java.util.Iterator<java.io.File> iterateFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.iterateFilesAndDirs(p0,p1,p2);
}
public static void addAll(java.util.Collection p0,java.util.Iterator p1){
 CollectionUtils.addAll(p0,p1);
}
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
return CollectionUtils.collect(p0,p1);
}
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
return CollectionUtils.collect(p0,p1,p2);
}
public static java.lang.Object[] toArray(java.util.Iterator p0){
return IteratorUtils.toArray(p0);
}
public static java.lang.Object[] toArray(java.util.Iterator p0,java.lang.Class p1){
return IteratorUtils.toArray(p0,p1);
}
public static java.util.Iterator getIterator(java.lang.Object p0){
return IteratorUtils.getIterator(p0);
}
public static java.util.List toList(java.util.Iterator p0,int p1){
return IteratorUtils.toList(p0,p1);
}
public static java.util.List toList(java.util.Iterator p0){
return IteratorUtils.toList(p0);
}
public static java.util.Iterator unmodifiableIterator(java.util.Iterator p0){
return IteratorUtils.unmodifiableIterator(p0);
}
public static java.util.Enumeration asEnumeration(java.util.Iterator p0){
return IteratorUtils.asEnumeration(p0);
}
public static java.util.Iterator filteredIterator(java.util.Iterator p0,org.apache.commons.collections.Predicate p1){
return IteratorUtils.filteredIterator(p0,p1);
}
public static java.util.Iterator objectGraphIterator(java.lang.Object p0,org.apache.commons.collections.Transformer p1){
return IteratorUtils.objectGraphIterator(p0,p1);
}
public static java.util.Iterator transformedIterator(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
return IteratorUtils.transformedIterator(p0,p1);
}
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator[] p1){
return IteratorUtils.collatedIterator(p0,p1);
}
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator p1,java.util.Iterator p2){
return IteratorUtils.collatedIterator(p0,p1,p2);
}
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Collection p1){
return IteratorUtils.collatedIterator(p0,p1);
}
public static java.util.ListIterator toListIterator(java.util.Iterator p0){
return IteratorUtils.toListIterator(p0);
}
public static java.util.Iterator asIterator(java.util.Enumeration p0){
return IteratorUtils.asIterator(p0);
}
public static java.util.Iterator asIterator(java.util.Enumeration p0,java.util.Collection p1){
return IteratorUtils.asIterator(p0,p1);
}
public static java.util.Iterator chainedIterator(java.util.Iterator p0,java.util.Iterator p1){
return IteratorUtils.chainedIterator(p0,p1);
}
public static java.util.Iterator chainedIterator(java.util.Collection p0){
return IteratorUtils.chainedIterator(p0);
}
public static java.util.Iterator chainedIterator(java.util.Iterator[] p0){
return IteratorUtils.chainedIterator(p0);
}
public static java.util.Iterator decorate(java.util.Iterator p0){
return UnmodifiableIterator.decorate(p0);
}
public static <E> java.util.Iterator<E> unmodifiableIterator(java.util.Iterator<E> p0){
return IteratorUtils.unmodifiableIterator(p0);
}
public static <E> java.util.Iterator<E> filteredIterator(java.util.Iterator<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IteratorUtils.filteredIterator(p0,p1);
}
public static <E> java.util.Iterator<E> peekingIterator(java.util.Iterator<? extends E> p0){
return IteratorUtils.peekingIterator(p0);
}
public static <E> java.util.Iterator<E> objectGraphIterator(E p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return IteratorUtils.objectGraphIterator(p0,p1);
}
public static <I,O> java.util.Iterator<O> transformedIterator(java.util.Iterator<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
return IteratorUtils.transformedIterator(p0,p1);
}
public static <E> java.util.Iterator<E> pushbackIterator(java.util.Iterator<? extends E> p0){
return IteratorUtils.pushbackIterator(p0);
}
public static <E> java.util.Iterator<E> collatedIterator(java.util.Comparator<? super E> p0,java.util.Collection<java.util.Iterator<? extends E>> p1){
return IteratorUtils.collatedIterator(p0,p1);
}
public static <E> java.util.Iterator<E> collatedIterator(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E>... p1){
return IteratorUtils.collatedIterator(p0,p1);
}
public static <E> java.util.Iterator<E> collatedIterator(java.util.Comparator<? super E> p0,java.util.Iterator<? extends E> p1,java.util.Iterator<? extends E> p2){
return IteratorUtils.collatedIterator(p0,p1,p2);
}
public static <E> java.util.Iterator<E> asIterator(java.util.Enumeration<? extends E> p0,java.util.Collection<? super E> p1){
return IteratorUtils.asIterator(p0,p1);
}
public static <E> java.util.Iterator<E> asIterator(java.util.Enumeration<? extends E> p0){
return IteratorUtils.asIterator(p0);
}
public static <E> java.util.Iterator<E> chainedIterator(java.util.Iterator<? extends E> p0,java.util.Iterator<? extends E> p1){
return IteratorUtils.chainedIterator(p0,p1);
}
public static <E> java.util.Iterator<E> chainedIterator(java.util.Collection<java.util.Iterator<? extends E>> p0){
return IteratorUtils.chainedIterator(p0);
}
public static <E> java.util.Iterator<E> chainedIterator(java.util.Iterator<? extends E>... p0){
return IteratorUtils.chainedIterator(p0);
}
public static <E> java.util.Iterator<E> unmodifiableIterator(java.util.Iterator<? extends E> p0){
return UnmodifiableIterator.unmodifiableIterator(p0);
}
public static <E> java.util.Iterator<E> emptyIterator(){
return EmptyIterator.emptyIterator();
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
public static java.util.Iterator<int[]> combinationsIterator(int p0,int p1){
return CombinatoricsUtils.combinationsIterator(p0,p1);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ByteIterator p0){
return ByteIteratorIterator.wrap(p0);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.CharIterator p0){
return CharIteratorIterator.wrap(p0);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.DoubleIterator p0){
return DoubleIteratorIterator.wrap(p0);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.FloatIterator p0){
return FloatIteratorIterator.wrap(p0);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.IntIterator p0){
return IntIteratorIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteIterator wrap(java.util.Iterator p0){
return IteratorByteIterator.wrap(p0);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.LongIterator p0){
return LongIteratorIterator.wrap(p0);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ShortIterator p0){
return ShortIteratorIterator.wrap(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.util.Iterator p0){
return BooleanIterators.asBooleanIterator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.util.Iterator p0){
return ByteIterators.asByteIterator(p0);
}
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.util.Iterator p0){
return CharIterators.asCharIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.util.Iterator p0){
return DoubleIterators.asDoubleIterator(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.util.Iterator p0){
return FloatIterators.asFloatIterator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.util.Iterator p0){
return IntIterators.asIntIterator(p0);
}
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.util.Iterator p0){
return LongIterators.asLongIterator(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.util.Iterator p0){
return ShortIterators.asShortIterator(p0);
}
public static java.util.Iterator iterator(java.lang.Class p0){
return EnumUtils.iterator(p0);
}
public static java.lang.String join(java.util.Iterator p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.util.Iterator p0,java.lang.String p1){
return StringUtils.join(p0,p1);
}
}
