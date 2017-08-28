package com.zengfr.supercommons;
import com.google.common.collect.Collections2;
import org.apache.commons.io.FileUtils;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.collection.SynchronizedCollection;
import org.apache.commons.collections.collection.TransformedCollection;
import org.apache.commons.collections.collection.PredicatedCollection;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.SetUtils;
import org.apache.commons.collections.ComparatorUtils;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.collection.UnmodifiableCollection;
import org.apache.commons.collections.collection.TypedCollection;
import org.apache.commons.collections.collection.UnmodifiableBoundedCollection;
import org.apache.commons.collections.functors.NonePredicate;
import org.apache.commons.collections.functors.OnePredicate;
import org.apache.commons.collections.functors.ChainedClosure;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.functors.AnyPredicate;
import org.apache.commons.collections.functors.AllPredicate;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.PredicateUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MultiMapUtils;
import org.apache.commons.collections4.collection.UnmodifiableCollection;
import org.apache.commons.lang3.Validate;
import org.apache.commons.math3.geometry.euclidean.twod.hull.AklToussaintHeuristic;
import org.apache.commons.collections.primitives.adapters.ByteCollectionCollection;
import org.apache.commons.collections.primitives.adapters.CharCollectionCollection;
import org.apache.commons.collections.primitives.adapters.CollectionByteCollection;
import org.apache.commons.collections.primitives.adapters.CollectionCharCollection;
import org.apache.commons.collections.primitives.adapters.CollectionDoubleCollection;
import org.apache.commons.collections.primitives.adapters.CollectionFloatCollection;
import org.apache.commons.collections.primitives.adapters.CollectionIntCollection;
import org.apache.commons.collections.primitives.adapters.CollectionLongCollection;
import org.apache.commons.collections.primitives.adapters.CollectionShortCollection;
import org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection;
import org.apache.commons.collections.primitives.adapters.FloatCollectionCollection;
import org.apache.commons.collections.primitives.adapters.IntCollectionCollection;
import org.apache.commons.collections.primitives.adapters.LongCollectionCollection;
import org.apache.commons.collections.primitives.adapters.ShortCollectionCollection;
import com.facebook.collectionsbase.Piles;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CollectionUtil{ 
public static <E> java.util.Collection<E> filter(java.util.Collection<E> p0,com.google.common.base.Predicate<? super E> p1){
return Collections2.filter(p0,p1);
}
public static <F,T> java.util.Collection<T> transform(java.util.Collection<F> p0,com.google.common.base.Function<? super F, T> p1){
return Collections2.transform(p0,p1);
}
public static <E extends java.lang.Comparable<? super E> > java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> p0){
return Collections2.orderedPermutations(p0);
}
public static <E> java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> p0,java.util.Comparator<? super E> p1){
return Collections2.orderedPermutations(p0,p1);
}
public static <E> java.util.Collection<java.util.List<E>> permutations(java.util.Collection<E> p0){
return Collections2.permutations(p0);
}
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.listFiles(p0,p1,p2);
}
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
return FileUtils.listFiles(p0,p1,p2);
}
public static java.util.Collection<java.io.File> listFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.listFilesAndDirs(p0,p1,p2);
}
public static org.apache.commons.collections.Transformer chainedTransformer(java.util.Collection p0){
return TransformerUtils.chainedTransformer(p0);
}
public static boolean isEmpty(java.util.Collection p0){
return CollectionUtils.isEmpty(p0);
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
public static java.util.Collection collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
return CollectionUtils.collect(p0,p1);
}
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
return CollectionUtils.collect(p0,p1);
}
public static java.util.Collection collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
return CollectionUtils.collect(p0,p1,p2);
}
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
return CollectionUtils.collect(p0,p1,p2);
}
public static java.lang.Object find(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.find(p0,p1);
}
public static java.util.Collection synchronizedCollection(java.util.Collection p0){
return CollectionUtils.synchronizedCollection(p0);
}
public static boolean exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.exists(p0,p1);
}
public static java.util.Collection removeAll(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.removeAll(p0,p1);
}
public static java.util.Collection retainAll(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.retainAll(p0,p1);
}
public static java.util.Collection unmodifiableCollection(java.util.Collection p0){
return CollectionUtils.unmodifiableCollection(p0);
}
public static void filter(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
 CollectionUtils.filter(p0,p1);
}
public static int cardinality(java.lang.Object p0,java.util.Collection p1){
return CollectionUtils.cardinality(p0,p1);
}
public static java.util.Collection intersection(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.intersection(p0,p1);
}
public static java.util.Collection union(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.union(p0,p1);
}
public static int maxSize(java.util.Collection p0){
return CollectionUtils.maxSize(p0);
}
public static boolean isNotEmpty(java.util.Collection p0){
return CollectionUtils.isNotEmpty(p0);
}
public static boolean containsAny(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.containsAny(p0,p1);
}
public static int countMatches(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.countMatches(p0,p1);
}
public static void transform(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
 CollectionUtils.transform(p0,p1);
}
public static boolean isFull(java.util.Collection p0){
return CollectionUtils.isFull(p0);
}
public static java.util.Collection subtract(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.subtract(p0,p1);
}
public static java.util.Collection transformedCollection(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
return CollectionUtils.transformedCollection(p0,p1);
}
public static boolean isEqualCollection(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.isEqualCollection(p0,p1);
}
public static java.util.Collection predicatedCollection(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.predicatedCollection(p0,p1);
}
public static java.util.Map getCardinalityMap(java.util.Collection p0){
return CollectionUtils.getCardinalityMap(p0);
}
public static boolean isProperSubCollection(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.isProperSubCollection(p0,p1);
}
public static java.util.Collection select(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.select(p0,p1);
}
public static void select(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
 CollectionUtils.select(p0,p1,p2);
}
public static java.util.Collection typedCollection(java.util.Collection p0,java.lang.Class p1){
return CollectionUtils.typedCollection(p0,p1);
}
public static boolean isSubCollection(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.isSubCollection(p0,p1);
}
public static boolean addIgnoreNull(java.util.Collection p0,java.lang.Object p1){
return CollectionUtils.addIgnoreNull(p0,p1);
}
public static void forAllDo(java.util.Collection p0,org.apache.commons.collections.Closure p1){
 CollectionUtils.forAllDo(p0,p1);
}
public static java.util.Collection disjunction(java.util.Collection p0,java.util.Collection p1){
return CollectionUtils.disjunction(p0,p1);
}
public static java.util.Collection selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.selectRejected(p0,p1);
}
public static void selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
 CollectionUtils.selectRejected(p0,p1,p2);
}
public static java.util.Collection decorate(java.util.Collection p0){
return SynchronizedCollection.decorate(p0);
}
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
return TransformedCollection.decorate(p0,p1);
}
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return PredicatedCollection.decorate(p0,p1);
}
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Collection p1){
return IteratorUtils.collatedIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableIterator loopingIterator(java.util.Collection p0){
return IteratorUtils.loopingIterator(p0);
}
public static java.util.Iterator asIterator(java.util.Enumeration p0,java.util.Collection p1){
return IteratorUtils.asIterator(p0,p1);
}
public static java.util.Iterator chainedIterator(java.util.Collection p0){
return IteratorUtils.chainedIterator(p0);
}
public static int hashCodeForSet(java.util.Collection p0){
return SetUtils.hashCodeForSet(p0);
}
public static boolean isEqualSet(java.util.Collection p0,java.util.Collection p1){
return SetUtils.isEqualSet(p0,p1);
}
public static java.util.Comparator chainedComparator(java.util.Collection p0){
return ComparatorUtils.chainedComparator(p0);
}
public static org.apache.commons.collections.Closure chainedClosure(java.util.Collection p0){
return ClosureUtils.chainedClosure(p0);
}
public static java.util.Collection decorate(java.util.Collection p0,java.lang.Class p1){
return TypedCollection.decorate(p0,p1);
}
public static org.apache.commons.collections.BoundedCollection decorateUsing(java.util.Collection p0){
return UnmodifiableBoundedCollection.decorateUsing(p0);
}
public static org.apache.commons.collections.Predicate getInstance(java.util.Collection p0){
return NonePredicate.getInstance(p0);
}
public static boolean isEqualList(java.util.Collection p0,java.util.Collection p1){
return ListUtils.isEqualList(p0,p1);
}
public static int hashCodeForList(java.util.Collection p0){
return ListUtils.hashCodeForList(p0);
}
public static org.apache.commons.collections.Predicate nonePredicate(java.util.Collection p0){
return PredicateUtils.nonePredicate(p0);
}
public static org.apache.commons.collections.Predicate onePredicate(java.util.Collection p0){
return PredicateUtils.onePredicate(p0);
}
public static org.apache.commons.collections.Predicate allPredicate(java.util.Collection p0){
return PredicateUtils.allPredicate(p0);
}
public static org.apache.commons.collections.Predicate anyPredicate(java.util.Collection p0){
return PredicateUtils.anyPredicate(p0);
}
public static <I,O> java.util.Collection<O> collect(java.util.Iterator<I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
return CollectionUtils.collect(p0,p1);
}
public static <I,O> java.util.Collection<O> collect(java.lang.Iterable<I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
return CollectionUtils.collect(p0,p1);
}
public static <I,O,R extends java.util.Collection<? super O> > R collect(java.lang.Iterable<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2){
return CollectionUtils.collect(p0,p1,p2);
}
public static <I,O,R extends java.util.Collection<? super O> > R collect(java.util.Iterator<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2){
return CollectionUtils.collect(p0,p1,p2);
}
public static <C> java.util.Collection<C> synchronizedCollection(java.util.Collection<C> p0){
return CollectionUtils.synchronizedCollection(p0);
}
public static <E> java.util.Collection<E> removeAll(java.lang.Iterable<E> p0,java.lang.Iterable<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2){
return CollectionUtils.removeAll(p0,p1,p2);
}
public static <E> java.util.Collection<E> removeAll(java.util.Collection<E> p0,java.util.Collection<?> p1){
return CollectionUtils.removeAll(p0,p1);
}
public static <E> java.util.Collection<E> retainAll(java.lang.Iterable<E> p0,java.lang.Iterable<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2){
return CollectionUtils.retainAll(p0,p1,p2);
}
public static <C> java.util.Collection<C> retainAll(java.util.Collection<C> p0,java.util.Collection<?> p1){
return CollectionUtils.retainAll(p0,p1);
}
public static <C> java.util.Collection<C> unmodifiableCollection(java.util.Collection<? extends C> p0){
return CollectionUtils.unmodifiableCollection(p0);
}
public static <O> java.util.Collection<O> intersection(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
return CollectionUtils.intersection(p0,p1);
}
public static <O> java.util.Collection<O> union(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
return CollectionUtils.union(p0,p1);
}
public static <E> java.util.Collection<E> transformingCollection(java.util.Collection<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return CollectionUtils.transformingCollection(p0,p1);
}
public static <O> java.util.Collection<O> subtract(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
return CollectionUtils.subtract(p0,p1);
}
public static <O> java.util.Collection<O> subtract(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,org.apache.commons.collections4.Predicate<O> p2){
return CollectionUtils.subtract(p0,p1,p2);
}
public static <C> java.util.Collection<C> predicatedCollection(java.util.Collection<C> p0,org.apache.commons.collections4.Predicate<? super C> p1){
return CollectionUtils.predicatedCollection(p0,p1);
}
public static <O,R extends java.util.Collection<? super O> > R select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2,R p3){
return CollectionUtils.select(p0,p1,p2,p3);
}
public static <O> java.util.Collection<O> select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1){
return CollectionUtils.select(p0,p1);
}
public static <O,R extends java.util.Collection<? super O> > R select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2){
return CollectionUtils.select(p0,p1,p2);
}
public static <T> java.util.Collection<T> emptyCollection(){
return CollectionUtils.emptyCollection();
}
public static <O> java.util.Collection<O> disjunction(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
return CollectionUtils.disjunction(p0,p1);
}
public static <O,R extends java.util.Collection<? super O> > R selectRejected(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2){
return CollectionUtils.selectRejected(p0,p1,p2);
}
public static <O> java.util.Collection<O> selectRejected(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1){
return CollectionUtils.selectRejected(p0,p1);
}
public static <T> java.util.Collection<T> emptyIfNull(java.util.Collection<T> p0){
return CollectionUtils.emptyIfNull(p0);
}
public static <K,V> java.util.Collection<V> getCollection(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
return MultiMapUtils.getCollection(p0,p1);
}
public static <T> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T> p0){
return UnmodifiableCollection.unmodifiableCollection(p0);
}
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1){
return Validate.validIndex(p0,p1);
}
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1,java.lang.String p2,java.lang.Object... p3){
return Validate.validIndex(p0,p1,p2,p3);
}
public static <T extends java.util.Collection<?> > T notEmpty(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notEmpty(p0,p1,p2);
}
public static <T extends java.util.Collection<?> > T notEmpty(T p0){
return Validate.notEmpty(p0);
}
public static java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> reducePoints(java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> p0){
return AklToussaintHeuristic.reducePoints(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.ByteCollection p0){
return ByteCollectionCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.CharCollection p0){
return CharCollectionCollection.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteCollection wrap(java.util.Collection p0){
return CollectionByteCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.DoubleCollection p0){
return DoubleCollectionCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.FloatCollection p0){
return FloatCollectionCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.IntCollection p0){
return IntCollectionCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.LongCollection p0){
return LongCollectionCollection.wrap(p0);
}
public static java.util.Collection wrap(org.apache.commons.collections.primitives.ShortCollection p0){
return ShortCollectionCollection.wrap(p0);
}
public static <T> java.util.Collection<T> copyOf(java.util.Iterator<T> p0,java.util.Collection<T> p1){
return Piles.copyOf(p0,p1);
}
public static <T,C extends java.util.Collection<T> ,E extends java.lang.Throwable > C filter(java.util.Collection<T> p0,C p1,com.facebook.collectionsbase.Filter<T, E> p2) throws E{
return Piles.filter(p0,p1,p2);
}
public static <X,Y> java.util.Collection<Y> transmogrify(java.util.Iterator<X> p0,java.util.Collection<Y> p1,com.google.common.base.Function<X, Y> p2){
return Piles.transmogrify(p0,p1,p2);
}
public static <X,Y> java.util.Collection<Y> transmogrify(java.util.Iterator<X> p0,java.util.Collection<Y> p1,com.facebook.collectionsbase.Mapper<X, Y> p2){
return Piles.transmogrify(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.util.Collection p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static int reflectionHashCode(java.lang.Object p0,java.util.Collection p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.util.Collection p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String join(java.util.Collection p0,java.lang.String p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.util.Collection p0,char p1){
return StringUtils.join(p0,p1);
}
public static void notEmpty(java.util.Collection p0){
 Validate.notEmpty(p0);
}
public static void notEmpty(java.util.Collection p0,java.lang.String p1){
 Validate.notEmpty(p0,p1);
}
public static void noNullElements(java.util.Collection p0,java.lang.String p1){
 Validate.noNullElements(p0,p1);
}
public static void noNullElements(java.util.Collection p0){
 Validate.noNullElements(p0);
}
public static void allElementsOfType(java.util.Collection p0,java.lang.Class p1){
 Validate.allElementsOfType(p0,p1);
}
public static void allElementsOfType(java.util.Collection p0,java.lang.Class p1,java.lang.String p2){
 Validate.allElementsOfType(p0,p1,p2);
}
}
