package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CollectionUtil{ 
/**
*public static void org.apache.commons.collections.CollectionUtils.addAll(java.util.Collection,java.lang.Object[])
*/ 
public static void addAll(java.util.Collection p0,java.lang.Object... p1){
	 org.apache.commons.collections.CollectionUtils.addAll(p0,p1);
}
/**
*public static void org.apache.commons.collections.CollectionUtils.addAll(java.util.Collection,java.util.Iterator)
*/ 
public static void addAll(java.util.Collection p0,java.util.Iterator p1){
	 org.apache.commons.collections.CollectionUtils.addAll(p0,p1);
}
/**
*public static void org.apache.commons.collections.CollectionUtils.addAll(java.util.Collection,java.util.Enumeration)
*/ 
public static void addAll(java.util.Collection p0,java.util.Enumeration p1){
	 org.apache.commons.collections.CollectionUtils.addAll(p0,p1);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.addIgnoreNull(java.util.Collection,java.lang.Object)
*/ 
public static boolean addIgnoreNull(java.util.Collection p0,java.lang.Object p1){
	return org.apache.commons.collections.CollectionUtils.addIgnoreNull(p0,p1);
}
/**
*public static void org.apache.commons.lang.Validate.allElementsOfType(java.util.Collection,java.lang.Class)
*/ 
public static void allElementsOfType(java.util.Collection p0,java.lang.Class p1){
	 org.apache.commons.lang.Validate.allElementsOfType(p0,p1);
}
/**
*public static void org.apache.commons.lang.Validate.allElementsOfType(java.util.Collection,java.lang.Class,java.lang.String)
*/ 
public static void allElementsOfType(java.util.Collection p0,java.lang.Class p1,java.lang.String p2){
	 org.apache.commons.lang.Validate.allElementsOfType(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.allPredicate(java.util.Collection)
*/ 
public static org.apache.commons.collections.Predicate allPredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.allPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.anyPredicate(java.util.Collection)
*/ 
public static org.apache.commons.collections.Predicate anyPredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.anyPredicate(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.asIterator(java.util.Enumeration,java.util.Collection)
*/ 
public static java.util.Iterator asIterator(java.util.Enumeration p0,java.util.Collection p1){
	return org.apache.commons.collections.IteratorUtils.asIterator(p0,p1);
}
/**
*public static int org.apache.commons.collections.CollectionUtils.cardinality(java.lang.Object,java.util.Collection)
*/ 
public static int cardinality(java.lang.Object p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.cardinality(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.chainedClosure(java.util.Collection)
*/ 
public static org.apache.commons.collections.Closure chainedClosure(java.util.Collection p0){
	return org.apache.commons.collections.ClosureUtils.chainedClosure(p0);
}
/**
*public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.chainedComparator(java.util.Collection)
*/ 
public static java.util.Comparator chainedComparator(java.util.Collection p0){
	return org.apache.commons.collections.ComparatorUtils.chainedComparator(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.chainedIterator(java.util.Collection)
*/ 
public static java.util.Iterator chainedIterator(java.util.Collection p0){
	return org.apache.commons.collections.IteratorUtils.chainedIterator(p0);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.chainedTransformer(java.util.Collection)
*/ 
public static org.apache.commons.collections.Transformer chainedTransformer(java.util.Collection p0){
	return org.apache.commons.collections.TransformerUtils.chainedTransformer(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Collection)
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Collection p1){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1);
}
/**
*public static <I,O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.collect(java.util.Iterator<I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*/ 
public static <I,O> java.util.Collection<O> collect(java.util.Iterator<I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.collect(p0,p1);
}
/**
*public static <I,O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.collect(java.lang.Iterable<I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*/ 
public static <I,O> java.util.Collection<O> collect(java.lang.Iterable<I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.collect(p0,p1);
}
/**
*public static <I,O,R> R org.apache.commons.collections4.CollectionUtils.collect(java.lang.Iterable<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,R)
*/ 
public static <I,O,R extends java.util.Collection<? super O> > R collect(java.lang.Iterable<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.collect(p0,p1,p2);
}
/**
*public static <I,O,R> R org.apache.commons.collections4.CollectionUtils.collect(java.util.Iterator<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,R)
*/ 
public static <I,O,R extends java.util.Collection<? super O> > R collect(java.util.Iterator<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.collect(p0,p1,p2);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Collection,org.apache.commons.collections.Transformer)
*/ 
public static java.util.Collection collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Iterator,org.apache.commons.collections.Transformer)
*/ 
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Collection,org.apache.commons.collections.Transformer,java.util.Collection)
*/ 
public static java.util.Collection collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1,p2);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)
*/ 
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.containsAny(java.util.Collection,java.util.Collection)
*/ 
public static boolean containsAny(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.containsAny(p0,p1);
}
/**
*public static <T> java.util.Collection<T> com.facebook.collectionsbase.Piles.copyOf(java.util.Iterator<T>,java.util.Collection<T>)
*/ 
public static <T> java.util.Collection<T> copyOf(java.util.Iterator<T> p0,java.util.Collection<T> p1){
	return com.facebook.collectionsbase.Piles.copyOf(p0,p1);
}
/**
*public static int org.apache.commons.collections.CollectionUtils.countMatches(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static int countMatches(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.countMatches(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.collection.SynchronizedCollection.decorate(java.util.Collection)
*/ 
public static java.util.Collection decorate(java.util.Collection p0){
	return org.apache.commons.collections.collection.SynchronizedCollection.decorate(p0);
}
/**
*public static java.util.Collection org.apache.commons.collections.collection.TransformedCollection.decorate(java.util.Collection,org.apache.commons.collections.Transformer)
*/ 
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.collection.TransformedCollection.decorate(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.collection.PredicatedCollection.decorate(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.collection.PredicatedCollection.decorate(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.collection.TypedCollection.decorate(java.util.Collection,java.lang.Class)
*/ 
public static java.util.Collection decorate(java.util.Collection p0,java.lang.Class p1){
	return org.apache.commons.collections.collection.TypedCollection.decorate(p0,p1);
}
/**
*public static org.apache.commons.collections.BoundedCollection org.apache.commons.collections.collection.UnmodifiableBoundedCollection.decorateUsing(java.util.Collection)
*/ 
public static org.apache.commons.collections.BoundedCollection decorateUsing(java.util.Collection p0){
	return org.apache.commons.collections.collection.UnmodifiableBoundedCollection.decorateUsing(p0);
}
/**
*public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.disjunction(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*/ 
public static <O> java.util.Collection<O> disjunction(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.disjunction(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.disjunction(java.util.Collection,java.util.Collection)
*/ 
public static java.util.Collection disjunction(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.disjunction(p0,p1);
}
/**
*public static <T> java.util.Collection<T> org.apache.commons.collections4.CollectionUtils.emptyCollection()
*/ 
public static <T> java.util.Collection<T> emptyCollection(){
	return org.apache.commons.collections4.CollectionUtils.emptyCollection();
}
/**
*public static <T> java.util.Collection<T> org.apache.commons.collections4.CollectionUtils.emptyIfNull(java.util.Collection<T>)
*/ 
public static <T> java.util.Collection<T> emptyIfNull(java.util.Collection<T> p0){
	return org.apache.commons.collections4.CollectionUtils.emptyIfNull(p0);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.exists(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static boolean exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.exists(p0,p1);
}
/**
*public static <E> java.util.Collection<E> com.google.common.collect.Collections2.filter(java.util.Collection<E>,com.google.common.base.Predicate<? super E>)
*/ 
public static <E> java.util.Collection<E> filter(java.util.Collection<E> p0,com.google.common.base.Predicate<? super E> p1){
	return com.google.common.collect.Collections2.filter(p0,p1);
}
/**
*public static void org.apache.commons.collections.CollectionUtils.filter(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static void filter(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	 org.apache.commons.collections.CollectionUtils.filter(p0,p1);
}
/**
*public static <T,C,E> C com.facebook.collectionsbase.Piles.filter(java.util.Collection<T>,C,com.facebook.collectionsbase.Filter<T, E>) throws E
*/ 
public static <T,C extends java.util.Collection<T> ,E extends java.lang.Throwable > C filter(java.util.Collection<T> p0,C p1,com.facebook.collectionsbase.Filter<T, E> p2) throws E{
	return com.facebook.collectionsbase.Piles.filter(p0,p1,p2);
}
/**
*public static java.lang.Object org.apache.commons.collections.CollectionUtils.find(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static java.lang.Object find(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.find(p0,p1);
}
/**
*public static void org.apache.commons.collections.CollectionUtils.forAllDo(java.util.Collection,org.apache.commons.collections.Closure)
*/ 
public static void forAllDo(java.util.Collection p0,org.apache.commons.collections.Closure p1){
	 org.apache.commons.collections.CollectionUtils.forAllDo(p0,p1);
}
/**
*public static java.util.Map org.apache.commons.collections.CollectionUtils.getCardinalityMap(java.util.Collection)
*/ 
public static java.util.Map getCardinalityMap(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.getCardinalityMap(p0);
}
/**
*public static <K,V> java.util.Collection<V> org.apache.commons.collections4.MultiMapUtils.getCollection(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*/ 
public static <K,V> java.util.Collection<V> getCollection(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
	return org.apache.commons.collections4.MultiMapUtils.getCollection(p0,p1);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NonePredicate.getInstance(java.util.Collection)
*/ 
public static org.apache.commons.collections.Predicate getInstance(java.util.Collection p0){
	return org.apache.commons.collections.functors.NonePredicate.getInstance(p0);
}
/**
*public static int org.apache.commons.collections.ListUtils.hashCodeForList(java.util.Collection)
*/ 
public static int hashCodeForList(java.util.Collection p0){
	return org.apache.commons.collections.ListUtils.hashCodeForList(p0);
}
/**
*public static int org.apache.commons.collections.SetUtils.hashCodeForSet(java.util.Collection)
*/ 
public static int hashCodeForSet(java.util.Collection p0){
	return org.apache.commons.collections.SetUtils.hashCodeForSet(p0);
}
/**
*public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.intersection(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*/ 
public static <O> java.util.Collection<O> intersection(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.intersection(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.intersection(java.util.Collection,java.util.Collection)
*/ 
public static java.util.Collection intersection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.intersection(p0,p1);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.isEmpty(java.util.Collection)
*/ 
public static boolean isEmpty(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isEmpty(p0);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.isEqualCollection(java.util.Collection,java.util.Collection)
*/ 
public static boolean isEqualCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isEqualCollection(p0,p1);
}
/**
*public static boolean org.apache.commons.collections.ListUtils.isEqualList(java.util.Collection,java.util.Collection)
*/ 
public static boolean isEqualList(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.ListUtils.isEqualList(p0,p1);
}
/**
*public static boolean org.apache.commons.collections.SetUtils.isEqualSet(java.util.Collection,java.util.Collection)
*/ 
public static boolean isEqualSet(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.SetUtils.isEqualSet(p0,p1);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.isFull(java.util.Collection)
*/ 
public static boolean isFull(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isFull(p0);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.isNotEmpty(java.util.Collection)
*/ 
public static boolean isNotEmpty(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.isProperSubCollection(java.util.Collection,java.util.Collection)
*/ 
public static boolean isProperSubCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isProperSubCollection(p0,p1);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.isSubCollection(java.util.Collection,java.util.Collection)
*/ 
public static boolean isSubCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isSubCollection(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.lang.StringUtils.join(java.util.Collection,java.lang.String)
*/ 
public static java.lang.String join(java.util.Collection p0,java.lang.String p1){
	return org.apache.commons.lang.StringUtils.join(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.lang.StringUtils.join(java.util.Collection,char)
*/ 
public static java.lang.String join(java.util.Collection p0,char p1){
	return org.apache.commons.lang.StringUtils.join(p0,p1);
}
/**
*public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,java.lang.String[],boolean)
*/ 
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Collection<java.io.File> listFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.listFilesAndDirs(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.ResettableIterator org.apache.commons.collections.IteratorUtils.loopingIterator(java.util.Collection)
*/ 
public static org.apache.commons.collections.ResettableIterator loopingIterator(java.util.Collection p0){
	return org.apache.commons.collections.IteratorUtils.loopingIterator(p0);
}
/**
*public static int org.apache.commons.collections.CollectionUtils.maxSize(java.util.Collection)
*/ 
public static int maxSize(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.maxSize(p0);
}
/**
*public static void org.apache.commons.lang.Validate.noNullElements(java.util.Collection,java.lang.String)
*/ 
public static void noNullElements(java.util.Collection p0,java.lang.String p1){
	 org.apache.commons.lang.Validate.noNullElements(p0,p1);
}
/**
*public static void org.apache.commons.lang.Validate.noNullElements(java.util.Collection)
*/ 
public static void noNullElements(java.util.Collection p0){
	 org.apache.commons.lang.Validate.noNullElements(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nonePredicate(java.util.Collection)
*/ 
public static org.apache.commons.collections.Predicate nonePredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.nonePredicate(p0);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notEmpty(T,java.lang.String,java.lang.Object...)
*/ 
public static <T extends java.util.Collection<?> > T notEmpty(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.notEmpty(p0,p1,p2);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notEmpty(T)
*/ 
public static <T extends java.util.Collection<?> > T notEmpty(T p0){
	return org.apache.commons.lang3.Validate.notEmpty(p0);
}
/**
*public static void org.apache.commons.lang.Validate.notEmpty(java.util.Collection)
*/ 
public static void notEmpty(java.util.Collection p0){
	 org.apache.commons.lang.Validate.notEmpty(p0);
}
/**
*public static void org.apache.commons.lang.Validate.notEmpty(java.util.Collection,java.lang.String)
*/ 
public static void notEmpty(java.util.Collection p0,java.lang.String p1){
	 org.apache.commons.lang.Validate.notEmpty(p0,p1);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.onePredicate(java.util.Collection)
*/ 
public static org.apache.commons.collections.Predicate onePredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.onePredicate(p0);
}
/**
*public static <E> java.util.Collection<java.util.List<E>> com.google.common.collect.Collections2.orderedPermutations(java.lang.Iterable<E>,java.util.Comparator<? super E>)
*/ 
public static <E> java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> p0,java.util.Comparator<? super E> p1){
	return com.google.common.collect.Collections2.orderedPermutations(p0,p1);
}
/**
*public static <E> java.util.Collection<java.util.List<E>> com.google.common.collect.Collections2.orderedPermutations(java.lang.Iterable<E>)
*/ 
public static <E extends java.lang.Comparable<? super E> > java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> p0){
	return com.google.common.collect.Collections2.orderedPermutations(p0);
}
/**
*public static <E> java.util.Collection<java.util.List<E>> com.google.common.collect.Collections2.permutations(java.util.Collection<E>)
*/ 
public static <E> java.util.Collection<java.util.List<E>> permutations(java.util.Collection<E> p0){
	return com.google.common.collect.Collections2.permutations(p0);
}
/**
*public static <C> java.util.Collection<C> org.apache.commons.collections4.CollectionUtils.predicatedCollection(java.util.Collection<C>,org.apache.commons.collections4.Predicate<? super C>)
*/ 
public static <C> java.util.Collection<C> predicatedCollection(java.util.Collection<C> p0,org.apache.commons.collections4.Predicate<? super C> p1){
	return org.apache.commons.collections4.CollectionUtils.predicatedCollection(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.predicatedCollection(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Collection predicatedCollection(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.predicatedCollection(p0,p1);
}
/**
*public static java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> org.apache.commons.math3.geometry.euclidean.twod.hull.AklToussaintHeuristic.reducePoints(java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>)
*/ 
public static java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> reducePoints(java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> p0){
	return org.apache.commons.math3.geometry.euclidean.twod.hull.AklToussaintHeuristic.reducePoints(p0);
}
/**
*public static int org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,java.util.Collection)
*/ 
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.util.Collection p2){
	return org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,java.util.Collection)
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection p2){
	return org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object,java.util.Collection)
*/ 
public static int reflectionHashCode(java.lang.Object p0,java.util.Collection p1){
	return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(p0,p1);
}
/**
*public static <E> java.util.Collection<E> org.apache.commons.collections4.CollectionUtils.removeAll(java.util.Collection<E>,java.util.Collection<?>)
*/ 
public static <E> java.util.Collection<E> removeAll(java.util.Collection<E> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.removeAll(p0,p1);
}
/**
*public static <E> java.util.Collection<E> org.apache.commons.collections4.CollectionUtils.removeAll(java.lang.Iterable<E>,java.lang.Iterable<? extends E>,org.apache.commons.collections4.Equator<? super E>)
*/ 
public static <E> java.util.Collection<E> removeAll(java.lang.Iterable<E> p0,java.lang.Iterable<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2){
	return org.apache.commons.collections4.CollectionUtils.removeAll(p0,p1,p2);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.removeAll(java.util.Collection,java.util.Collection)
*/ 
public static java.util.Collection removeAll(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.removeAll(p0,p1);
}
/**
*public static <E> java.util.Collection<E> org.apache.commons.collections4.CollectionUtils.retainAll(java.lang.Iterable<E>,java.lang.Iterable<? extends E>,org.apache.commons.collections4.Equator<? super E>)
*/ 
public static <E> java.util.Collection<E> retainAll(java.lang.Iterable<E> p0,java.lang.Iterable<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2){
	return org.apache.commons.collections4.CollectionUtils.retainAll(p0,p1,p2);
}
/**
*public static <C> java.util.Collection<C> org.apache.commons.collections4.CollectionUtils.retainAll(java.util.Collection<C>,java.util.Collection<?>)
*/ 
public static <C> java.util.Collection<C> retainAll(java.util.Collection<C> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.retainAll(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.retainAll(java.util.Collection,java.util.Collection)
*/ 
public static java.util.Collection retainAll(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.retainAll(p0,p1);
}
/**
*public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)
*/ 
public static <O> java.util.Collection<O> select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1){
	return org.apache.commons.collections4.CollectionUtils.select(p0,p1);
}
/**
*public static <O,R> R org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R,R)
*/ 
public static <O,R extends java.util.Collection<? super O> > R select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2,R p3){
	return org.apache.commons.collections4.CollectionUtils.select(p0,p1,p2,p3);
}
/**
*public static <O,R> R org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R)
*/ 
public static <O,R extends java.util.Collection<? super O> > R select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.select(p0,p1,p2);
}
/**
*public static void org.apache.commons.collections.CollectionUtils.select(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)
*/ 
public static void select(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
	 org.apache.commons.collections.CollectionUtils.select(p0,p1,p2);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.select(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Collection select(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.select(p0,p1);
}
/**
*public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.selectRejected(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)
*/ 
public static <O> java.util.Collection<O> selectRejected(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1){
	return org.apache.commons.collections4.CollectionUtils.selectRejected(p0,p1);
}
/**
*public static <O,R> R org.apache.commons.collections4.CollectionUtils.selectRejected(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R)
*/ 
public static <O,R extends java.util.Collection<? super O> > R selectRejected(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.selectRejected(p0,p1,p2);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.selectRejected(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Collection selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.selectRejected(p0,p1);
}
/**
*public static void org.apache.commons.collections.CollectionUtils.selectRejected(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)
*/ 
public static void selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
	 org.apache.commons.collections.CollectionUtils.selectRejected(p0,p1,p2);
}
/**
*public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.subtract(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<O>)
*/ 
public static <O> java.util.Collection<O> subtract(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,org.apache.commons.collections4.Predicate<O> p2){
	return org.apache.commons.collections4.CollectionUtils.subtract(p0,p1,p2);
}
/**
*public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.subtract(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*/ 
public static <O> java.util.Collection<O> subtract(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.subtract(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.subtract(java.util.Collection,java.util.Collection)
*/ 
public static java.util.Collection subtract(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.subtract(p0,p1);
}
/**
*public static <C> java.util.Collection<C> org.apache.commons.collections4.CollectionUtils.synchronizedCollection(java.util.Collection<C>)
*/ 
public static <C> java.util.Collection<C> synchronizedCollection(java.util.Collection<C> p0){
	return org.apache.commons.collections4.CollectionUtils.synchronizedCollection(p0);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.synchronizedCollection(java.util.Collection)
*/ 
public static java.util.Collection synchronizedCollection(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.synchronizedCollection(p0);
}
/**
*public static java.lang.String org.apache.commons.lang.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object,java.util.Collection)
*/ 
public static java.lang.String toStringExclude(java.lang.Object p0,java.util.Collection p1){
	return org.apache.commons.lang.builder.ReflectionToStringBuilder.toStringExclude(p0,p1);
}
/**
*public static <F,T> java.util.Collection<T> com.google.common.collect.Collections2.transform(java.util.Collection<F>,com.google.common.base.Function<? super F, T>)
*/ 
public static <F,T> java.util.Collection<T> transform(java.util.Collection<F> p0,com.google.common.base.Function<? super F, T> p1){
	return com.google.common.collect.Collections2.transform(p0,p1);
}
/**
*public static void org.apache.commons.collections.CollectionUtils.transform(java.util.Collection,org.apache.commons.collections.Transformer)
*/ 
public static void transform(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	 org.apache.commons.collections.CollectionUtils.transform(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.transformedCollection(java.util.Collection,org.apache.commons.collections.Transformer)
*/ 
public static java.util.Collection transformedCollection(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.transformedCollection(p0,p1);
}
/**
*public static <E> java.util.Collection<E> org.apache.commons.collections4.CollectionUtils.transformingCollection(java.util.Collection<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> java.util.Collection<E> transformingCollection(java.util.Collection<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.CollectionUtils.transformingCollection(p0,p1);
}
/**
*public static <X,Y> java.util.Collection<Y> com.facebook.collectionsbase.Piles.transmogrify(java.util.Iterator<X>,java.util.Collection<Y>,com.google.common.base.Function<X, Y>)
*/ 
public static <X,Y> java.util.Collection<Y> transmogrify(java.util.Iterator<X> p0,java.util.Collection<Y> p1,com.google.common.base.Function<X, Y> p2){
	return com.facebook.collectionsbase.Piles.transmogrify(p0,p1,p2);
}
/**
*public static <X,Y> java.util.Collection<Y> com.facebook.collectionsbase.Piles.transmogrify(java.util.Iterator<X>,java.util.Collection<Y>,com.facebook.collectionsbase.Mapper<X, Y>)
*/ 
public static <X,Y> java.util.Collection<Y> transmogrify(java.util.Iterator<X> p0,java.util.Collection<Y> p1,com.facebook.collectionsbase.Mapper<X, Y> p2){
	return com.facebook.collectionsbase.Piles.transmogrify(p0,p1,p2);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.typedCollection(java.util.Collection,java.lang.Class)
*/ 
public static java.util.Collection typedCollection(java.util.Collection p0,java.lang.Class p1){
	return org.apache.commons.collections.CollectionUtils.typedCollection(p0,p1);
}
/**
*public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.union(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*/ 
public static <O> java.util.Collection<O> union(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.union(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.union(java.util.Collection,java.util.Collection)
*/ 
public static java.util.Collection union(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.union(p0,p1);
}
/**
*public static <C> java.util.Collection<C> org.apache.commons.collections4.CollectionUtils.unmodifiableCollection(java.util.Collection<? extends C>)
*/ 
public static <C> java.util.Collection<C> unmodifiableCollection(java.util.Collection<? extends C> p0){
	return org.apache.commons.collections4.CollectionUtils.unmodifiableCollection(p0);
}
/**
*public static <T> java.util.Collection<T> org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(java.util.Collection<? extends T>)
*/ 
public static <T> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T> p0){
	return org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(p0);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.unmodifiableCollection(java.util.Collection)
*/ 
public static java.util.Collection unmodifiableCollection(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.unmodifiableCollection(p0);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.validIndex(T,int)
*/ 
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1){
	return org.apache.commons.lang3.Validate.validIndex(p0,p1);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.validIndex(T,int,java.lang.String,java.lang.Object...)
*/ 
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1,java.lang.String p2,java.lang.Object... p3){
	return org.apache.commons.lang3.Validate.validIndex(p0,p1,p2,p3);
}
/**
*public static java.util.Collection org.apache.commons.collections.primitives.adapters.ByteCollectionCollection.wrap(org.apache.commons.collections.primitives.ByteCollection)
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.ByteCollection p0){
	return org.apache.commons.collections.primitives.adapters.ByteCollectionCollection.wrap(p0);
}
/**
*public static java.util.Collection org.apache.commons.collections.primitives.adapters.CharCollectionCollection.wrap(org.apache.commons.collections.primitives.CharCollection)
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.CharCollection p0){
	return org.apache.commons.collections.primitives.adapters.CharCollectionCollection.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteCollection org.apache.commons.collections.primitives.adapters.CollectionByteCollection.wrap(java.util.Collection)
*/ 
public static org.apache.commons.collections.primitives.ByteCollection wrap(java.util.Collection p0){
	return org.apache.commons.collections.primitives.adapters.CollectionByteCollection.wrap(p0);
}
/**
*public static java.util.Collection org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection.wrap(org.apache.commons.collections.primitives.DoubleCollection)
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.DoubleCollection p0){
	return org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection.wrap(p0);
}
/**
*public static java.util.Collection org.apache.commons.collections.primitives.adapters.FloatCollectionCollection.wrap(org.apache.commons.collections.primitives.FloatCollection)
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.FloatCollection p0){
	return org.apache.commons.collections.primitives.adapters.FloatCollectionCollection.wrap(p0);
}
/**
*public static java.util.Collection org.apache.commons.collections.primitives.adapters.IntCollectionCollection.wrap(org.apache.commons.collections.primitives.IntCollection)
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.IntCollection p0){
	return org.apache.commons.collections.primitives.adapters.IntCollectionCollection.wrap(p0);
}
/**
*public static java.util.Collection org.apache.commons.collections.primitives.adapters.LongCollectionCollection.wrap(org.apache.commons.collections.primitives.LongCollection)
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.LongCollection p0){
	return org.apache.commons.collections.primitives.adapters.LongCollectionCollection.wrap(p0);
}
/**
*public static java.util.Collection org.apache.commons.collections.primitives.adapters.ShortCollectionCollection.wrap(org.apache.commons.collections.primitives.ShortCollection)
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.ShortCollection p0){
	return org.apache.commons.collections.primitives.adapters.ShortCollectionCollection.wrap(p0);
}
}
