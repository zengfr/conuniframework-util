package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class CollectionUtil{ 
/**
*{@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.lang.Object...)}
*@see org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.lang.Object...)
*<code>public static void org.apache.commons.collections.CollectionUtils.addAll(java.util.Collection,java.lang.Object[])
*addAll(java.util.Collection p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void addAll(java.util.Collection p0,java.lang.Object... p1){
	 org.apache.commons.collections.CollectionUtils.addAll(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Iterator)}
*@see org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Iterator)
*<code>public static void org.apache.commons.collections.CollectionUtils.addAll(java.util.Collection,java.util.Iterator)
*addAll(java.util.Collection p0,java.util.Iterator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void addAll(java.util.Collection p0,java.util.Iterator p1){
	 org.apache.commons.collections.CollectionUtils.addAll(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Enumeration)}
*@see org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Enumeration)
*<code>public static void org.apache.commons.collections.CollectionUtils.addAll(java.util.Collection,java.util.Enumeration)
*addAll(java.util.Collection p0,java.util.Enumeration p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void addAll(java.util.Collection p0,java.util.Enumeration p1){
	 org.apache.commons.collections.CollectionUtils.addAll(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#addIgnoreNull(java.util.Collection,java.lang.Object)}
*@see org.apache.commons.collections.CollectionUtils#addIgnoreNull(java.util.Collection,java.lang.Object)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.addIgnoreNull(java.util.Collection,java.lang.Object)
*addIgnoreNull(java.util.Collection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean addIgnoreNull(java.util.Collection p0,java.lang.Object p1){
	return org.apache.commons.collections.CollectionUtils.addIgnoreNull(p0,p1);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#allPredicate(java.util.Collection)}
*@see org.apache.commons.collections.PredicateUtils#allPredicate(java.util.Collection)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.allPredicate(java.util.Collection)
*allPredicate(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate allPredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.allPredicate(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#anyPredicate(java.util.Collection)}
*@see org.apache.commons.collections.PredicateUtils#anyPredicate(java.util.Collection)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.anyPredicate(java.util.Collection)
*anyPredicate(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate anyPredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.anyPredicate(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#asIterator(java.util.Enumeration,java.util.Collection)}
*@see org.apache.commons.collections.IteratorUtils#asIterator(java.util.Enumeration,java.util.Collection)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.asIterator(java.util.Enumeration,java.util.Collection)
*asIterator(java.util.Enumeration p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator asIterator(java.util.Enumeration p0,java.util.Collection p1){
	return org.apache.commons.collections.IteratorUtils.asIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#cardinality(java.lang.Object,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#cardinality(java.lang.Object,java.util.Collection)
*<code>public static int org.apache.commons.collections.CollectionUtils.cardinality(java.lang.Object,java.util.Collection)
*cardinality(java.lang.Object p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int cardinality(java.lang.Object p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.cardinality(p0,p1);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#chainedClosure(java.util.Collection)}
*@see org.apache.commons.collections.ClosureUtils#chainedClosure(java.util.Collection)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.chainedClosure(java.util.Collection)
*chainedClosure(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure chainedClosure(java.util.Collection p0){
	return org.apache.commons.collections.ClosureUtils.chainedClosure(p0);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#chainedComparator(java.util.Collection)}
*@see org.apache.commons.collections.ComparatorUtils#chainedComparator(java.util.Collection)
*<code>public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.chainedComparator(java.util.Collection)
*chainedComparator(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator chainedComparator(java.util.Collection p0){
	return org.apache.commons.collections.ComparatorUtils.chainedComparator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#chainedIterator(java.util.Collection)}
*@see org.apache.commons.collections.IteratorUtils#chainedIterator(java.util.Collection)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.chainedIterator(java.util.Collection)
*chainedIterator(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator chainedIterator(java.util.Collection p0){
	return org.apache.commons.collections.IteratorUtils.chainedIterator(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#chainedTransformer(java.util.Collection)}
*@see org.apache.commons.collections.TransformerUtils#chainedTransformer(java.util.Collection)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.chainedTransformer(java.util.Collection)
*chainedTransformer(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer chainedTransformer(java.util.Collection p0){
	return org.apache.commons.collections.TransformerUtils.chainedTransformer(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Collection)}
*@see org.apache.commons.collections.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Collection)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Collection)
*collatedIterator(java.util.Comparator p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Collection p1){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#collect(java.util.Iterator<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,R)}
*@see org.apache.commons.collections4.CollectionUtils#collect(java.util.Iterator<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,R)
*<code>public static <I,O,R> R org.apache.commons.collections4.CollectionUtils.collect(java.util.Iterator<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,R)
*collect(java.util.Iterator<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O,R extends java.util.Collection<? super O> > R collect(java.util.Iterator<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.collect(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#collect(java.lang.Iterable<I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)}
*@see org.apache.commons.collections4.CollectionUtils#collect(java.lang.Iterable<I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*<code>public static <I,O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.collect(java.lang.Iterable<I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*collect(java.lang.Iterable<I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> java.util.Collection<O> collect(java.lang.Iterable<I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.collect(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#collect(java.util.Iterator<I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)}
*@see org.apache.commons.collections4.CollectionUtils#collect(java.util.Iterator<I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*<code>public static <I,O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.collect(java.util.Iterator<I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*collect(java.util.Iterator<I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> java.util.Collection<O> collect(java.util.Iterator<I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.collect(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#collect(java.lang.Iterable<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,R)}
*@see org.apache.commons.collections4.CollectionUtils#collect(java.lang.Iterable<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,R)
*<code>public static <I,O,R> R org.apache.commons.collections4.CollectionUtils.collect(java.lang.Iterable<? extends I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,R)
*collect(java.lang.Iterable<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O,R extends java.util.Collection<? super O> > R collect(java.lang.Iterable<? extends I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.collect(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Collection,org.apache.commons.collections.Transformer)
*collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Iterator,org.apache.commons.collections.Transformer)
*collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Collection,org.apache.commons.collections.Transformer,java.util.Collection)
*collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)
*collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#containsAny(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#containsAny(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.containsAny(java.util.Collection,java.util.Collection)
*containsAny(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsAny(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.containsAny(p0,p1);
}
/**
*{@link com.facebook.collectionsbase.Piles#copyOf(java.util.Iterator<T>,java.util.Collection<T>)}
*@see com.facebook.collectionsbase.Piles#copyOf(java.util.Iterator<T>,java.util.Collection<T>)
*<code>public static <T> java.util.Collection<T> com.facebook.collectionsbase.Piles.copyOf(java.util.Iterator<T>,java.util.Collection<T>)
*copyOf(java.util.Iterator<T> p0,java.util.Collection<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Collection<T> copyOf(java.util.Iterator<T> p0,java.util.Collection<T> p1){
	return com.facebook.collectionsbase.Piles.copyOf(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#countMatches(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#countMatches(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static int org.apache.commons.collections.CollectionUtils.countMatches(java.util.Collection,org.apache.commons.collections.Predicate)
*countMatches(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int countMatches(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.countMatches(p0,p1);
}
/**
*{@link org.apache.commons.collections.collection.SynchronizedCollection#decorate(java.util.Collection)}
*@see org.apache.commons.collections.collection.SynchronizedCollection#decorate(java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.collection.SynchronizedCollection.decorate(java.util.Collection)
*decorate(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection decorate(java.util.Collection p0){
	return org.apache.commons.collections.collection.SynchronizedCollection.decorate(p0);
}
/**
*{@link org.apache.commons.collections.collection.TransformedCollection#decorate(java.util.Collection,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.collection.TransformedCollection#decorate(java.util.Collection,org.apache.commons.collections.Transformer)
*<code>public static java.util.Collection org.apache.commons.collections.collection.TransformedCollection.decorate(java.util.Collection,org.apache.commons.collections.Transformer)
*decorate(java.util.Collection p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.collection.TransformedCollection.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.collection.PredicatedCollection#decorate(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.collection.PredicatedCollection#decorate(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.util.Collection org.apache.commons.collections.collection.PredicatedCollection.decorate(java.util.Collection,org.apache.commons.collections.Predicate)
*decorate(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.collection.PredicatedCollection.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.collection.TypedCollection#decorate(java.util.Collection,java.lang.Class)}
*@see org.apache.commons.collections.collection.TypedCollection#decorate(java.util.Collection,java.lang.Class)
*<code>public static java.util.Collection org.apache.commons.collections.collection.TypedCollection.decorate(java.util.Collection,java.lang.Class)
*decorate(java.util.Collection p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection decorate(java.util.Collection p0,java.lang.Class p1){
	return org.apache.commons.collections.collection.TypedCollection.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.collection.UnmodifiableBoundedCollection#decorateUsing(java.util.Collection)}
*@see org.apache.commons.collections.collection.UnmodifiableBoundedCollection#decorateUsing(java.util.Collection)
*<code>public static org.apache.commons.collections.BoundedCollection org.apache.commons.collections.collection.UnmodifiableBoundedCollection.decorateUsing(java.util.Collection)
*decorateUsing(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.BoundedCollection decorateUsing(java.util.Collection p0){
	return org.apache.commons.collections.collection.UnmodifiableBoundedCollection.decorateUsing(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#disjunction(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)}
*@see org.apache.commons.collections4.CollectionUtils#disjunction(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*<code>public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.disjunction(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*disjunction(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.Collection<O> disjunction(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.disjunction(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#disjunction(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#disjunction(java.util.Collection,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.disjunction(java.util.Collection,java.util.Collection)
*disjunction(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection disjunction(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.disjunction(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#emptyCollection()}
*@see org.apache.commons.collections4.CollectionUtils#emptyCollection()
*<code>public static <T> java.util.Collection<T> org.apache.commons.collections4.CollectionUtils.emptyCollection()
*emptyCollection()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Collection<T> emptyCollection(){
	return org.apache.commons.collections4.CollectionUtils.emptyCollection();
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#emptyIfNull(java.util.Collection<T>)}
*@see org.apache.commons.collections4.CollectionUtils#emptyIfNull(java.util.Collection<T>)
*<code>public static <T> java.util.Collection<T> org.apache.commons.collections4.CollectionUtils.emptyIfNull(java.util.Collection<T>)
*emptyIfNull(java.util.Collection<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Collection<T> emptyIfNull(java.util.Collection<T> p0){
	return org.apache.commons.collections4.CollectionUtils.emptyIfNull(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#exists(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#exists(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.exists(java.util.Collection,org.apache.commons.collections.Predicate)
*exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.exists(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#filter(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#filter(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static void org.apache.commons.collections.CollectionUtils.filter(java.util.Collection,org.apache.commons.collections.Predicate)
*filter(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void filter(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	 org.apache.commons.collections.CollectionUtils.filter(p0,p1);
}
/**
*{@link com.facebook.collectionsbase.Piles#filter(java.util.Collection<T>,C,com.facebook.collectionsbase.Filter<T, E>)}
*@see com.facebook.collectionsbase.Piles#filter(java.util.Collection<T>,C,com.facebook.collectionsbase.Filter<T, E>)
*<code>public static <T,C,E> C com.facebook.collectionsbase.Piles.filter(java.util.Collection<T>,C,com.facebook.collectionsbase.Filter<T, E>) throws E
*filter(java.util.Collection<T> p0,C p1,com.facebook.collectionsbase.Filter<T, E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,C extends java.util.Collection<T> ,E extends java.lang.Throwable > C filter(java.util.Collection<T> p0,C p1,com.facebook.collectionsbase.Filter<T, E> p2) throws E{
	return com.facebook.collectionsbase.Piles.filter(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Collections2#filter(java.util.Collection<E>,com.google.common.base.Predicate<? super E>)}
*@see com.google.common.collect.Collections2#filter(java.util.Collection<E>,com.google.common.base.Predicate<? super E>)
*<code>public static <E> java.util.Collection<E> com.google.common.collect.Collections2.filter(java.util.Collection<E>,com.google.common.base.Predicate<? super E>)
*filter(java.util.Collection<E> p0,com.google.common.base.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Collection<E> filter(java.util.Collection<E> p0,com.google.common.base.Predicate<? super E> p1){
	return com.google.common.collect.Collections2.filter(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#find(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#find(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.lang.Object org.apache.commons.collections.CollectionUtils.find(java.util.Collection,org.apache.commons.collections.Predicate)
*find(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object find(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.find(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#findThreadGroups(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate)}
*@see org.apache.commons.lang3.ThreadUtils#findThreadGroups(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate)
*<code>public static java.util.Collection<java.lang.ThreadGroup> org.apache.commons.lang3.ThreadUtils.findThreadGroups(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate)
*findThreadGroups(java.lang.ThreadGroup p0,boolean p1,org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(java.lang.ThreadGroup p0,boolean p1,org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate p2){
	return org.apache.commons.lang3.ThreadUtils.findThreadGroups(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#findThreadGroups(org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate)}
*@see org.apache.commons.lang3.ThreadUtils#findThreadGroups(org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate)
*<code>public static java.util.Collection<java.lang.ThreadGroup> org.apache.commons.lang3.ThreadUtils.findThreadGroups(org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate)
*findThreadGroups(org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate p0){
	return org.apache.commons.lang3.ThreadUtils.findThreadGroups(p0);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#findThreadGroupsByName(java.lang.String)}
*@see org.apache.commons.lang3.ThreadUtils#findThreadGroupsByName(java.lang.String)
*<code>public static java.util.Collection<java.lang.ThreadGroup> org.apache.commons.lang3.ThreadUtils.findThreadGroupsByName(java.lang.String)
*findThreadGroupsByName(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.ThreadGroup> findThreadGroupsByName(java.lang.String p0){
	return org.apache.commons.lang3.ThreadUtils.findThreadGroupsByName(p0);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#findThreads(org.apache.commons.lang3.ThreadUtils$ThreadPredicate)}
*@see org.apache.commons.lang3.ThreadUtils#findThreads(org.apache.commons.lang3.ThreadUtils$ThreadPredicate)
*<code>public static java.util.Collection<java.lang.Thread> org.apache.commons.lang3.ThreadUtils.findThreads(org.apache.commons.lang3.ThreadUtils$ThreadPredicate)
*findThreads(org.apache.commons.lang3.ThreadUtils$ThreadPredicate p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.Thread> findThreads(org.apache.commons.lang3.ThreadUtils.ThreadPredicate p0){
	return org.apache.commons.lang3.ThreadUtils.findThreads(p0);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#findThreads(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadPredicate)}
*@see org.apache.commons.lang3.ThreadUtils#findThreads(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadPredicate)
*<code>public static java.util.Collection<java.lang.Thread> org.apache.commons.lang3.ThreadUtils.findThreads(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadPredicate)
*findThreads(java.lang.ThreadGroup p0,boolean p1,org.apache.commons.lang3.ThreadUtils$ThreadPredicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.Thread> findThreads(java.lang.ThreadGroup p0,boolean p1,org.apache.commons.lang3.ThreadUtils.ThreadPredicate p2){
	return org.apache.commons.lang3.ThreadUtils.findThreads(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#findThreadsByName(java.lang.String)}
*@see org.apache.commons.lang3.ThreadUtils#findThreadsByName(java.lang.String)
*<code>public static java.util.Collection<java.lang.Thread> org.apache.commons.lang3.ThreadUtils.findThreadsByName(java.lang.String)
*findThreadsByName(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.Thread> findThreadsByName(java.lang.String p0){
	return org.apache.commons.lang3.ThreadUtils.findThreadsByName(p0);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#findThreadsByName(java.lang.String,java.lang.String)}
*@see org.apache.commons.lang3.ThreadUtils#findThreadsByName(java.lang.String,java.lang.String)
*<code>public static java.util.Collection<java.lang.Thread> org.apache.commons.lang3.ThreadUtils.findThreadsByName(java.lang.String,java.lang.String)
*findThreadsByName(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.Thread> findThreadsByName(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.lang3.ThreadUtils.findThreadsByName(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#findThreadsByName(java.lang.String,java.lang.ThreadGroup)}
*@see org.apache.commons.lang3.ThreadUtils#findThreadsByName(java.lang.String,java.lang.ThreadGroup)
*<code>public static java.util.Collection<java.lang.Thread> org.apache.commons.lang3.ThreadUtils.findThreadsByName(java.lang.String,java.lang.ThreadGroup)
*findThreadsByName(java.lang.String p0,java.lang.ThreadGroup p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.Thread> findThreadsByName(java.lang.String p0,java.lang.ThreadGroup p1){
	return org.apache.commons.lang3.ThreadUtils.findThreadsByName(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#forAllDo(java.util.Collection,org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.CollectionUtils#forAllDo(java.util.Collection,org.apache.commons.collections.Closure)
*<code>public static void org.apache.commons.collections.CollectionUtils.forAllDo(java.util.Collection,org.apache.commons.collections.Closure)
*forAllDo(java.util.Collection p0,org.apache.commons.collections.Closure p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void forAllDo(java.util.Collection p0,org.apache.commons.collections.Closure p1){
	 org.apache.commons.collections.CollectionUtils.forAllDo(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#getAllThreadGroups()}
*@see org.apache.commons.lang3.ThreadUtils#getAllThreadGroups()
*<code>public static java.util.Collection<java.lang.ThreadGroup> org.apache.commons.lang3.ThreadUtils.getAllThreadGroups()
*getAllThreadGroups()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.ThreadGroup> getAllThreadGroups(){
	return org.apache.commons.lang3.ThreadUtils.getAllThreadGroups();
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#getAllThreads()}
*@see org.apache.commons.lang3.ThreadUtils#getAllThreads()
*<code>public static java.util.Collection<java.lang.Thread> org.apache.commons.lang3.ThreadUtils.getAllThreads()
*getAllThreads()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.Thread> getAllThreads(){
	return org.apache.commons.lang3.ThreadUtils.getAllThreads();
}
/**
*{@link org.apache.commons.collections.CollectionUtils#getCardinalityMap(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#getCardinalityMap(java.util.Collection)
*<code>public static java.util.Map org.apache.commons.collections.CollectionUtils.getCardinalityMap(java.util.Collection)
*getCardinalityMap(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map getCardinalityMap(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.getCardinalityMap(p0);
}
/**
*{@link org.apache.commons.collections4.MultiMapUtils#getCollection(org.apache.commons.collections4.MultiValuedMap<K, V>,K)}
*@see org.apache.commons.collections4.MultiMapUtils#getCollection(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*<code>public static <K,V> java.util.Collection<V> org.apache.commons.collections4.MultiMapUtils.getCollection(org.apache.commons.collections4.MultiValuedMap<K, V>,K)
*getCollection(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Collection<V> getCollection(org.apache.commons.collections4.MultiValuedMap<K, V> p0,K p1){
	return org.apache.commons.collections4.MultiMapUtils.getCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.NonePredicate#getInstance(java.util.Collection)}
*@see org.apache.commons.collections.functors.NonePredicate#getInstance(java.util.Collection)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NonePredicate.getInstance(java.util.Collection)
*getInstance(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(java.util.Collection p0){
	return org.apache.commons.collections.functors.NonePredicate.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.ListUtils#hashCodeForList(java.util.Collection)}
*@see org.apache.commons.collections.ListUtils#hashCodeForList(java.util.Collection)
*<code>public static int org.apache.commons.collections.ListUtils.hashCodeForList(java.util.Collection)
*hashCodeForList(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int hashCodeForList(java.util.Collection p0){
	return org.apache.commons.collections.ListUtils.hashCodeForList(p0);
}
/**
*{@link org.apache.commons.collections.SetUtils#hashCodeForSet(java.util.Collection)}
*@see org.apache.commons.collections.SetUtils#hashCodeForSet(java.util.Collection)
*<code>public static int org.apache.commons.collections.SetUtils.hashCodeForSet(java.util.Collection)
*hashCodeForSet(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int hashCodeForSet(java.util.Collection p0){
	return org.apache.commons.collections.SetUtils.hashCodeForSet(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#intersection(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)}
*@see org.apache.commons.collections4.CollectionUtils#intersection(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*<code>public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.intersection(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*intersection(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.Collection<O> intersection(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.intersection(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#intersection(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#intersection(java.util.Collection,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.intersection(java.util.Collection,java.util.Collection)
*intersection(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection intersection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.intersection(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.CollectionUtils#intersection(java.util.Collection<E>,java.util.Collection<E>)}
*@see org.codehaus.plexus.util.CollectionUtils#intersection(java.util.Collection<E>,java.util.Collection<E>)
*<code>public static <E> java.util.Collection<E> org.codehaus.plexus.util.CollectionUtils.intersection(java.util.Collection<E>,java.util.Collection<E>)
*intersection(java.util.Collection<E> p0,java.util.Collection<E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Collection<E> intersection(java.util.Collection<E> p0,java.util.Collection<E> p1){
	return org.codehaus.plexus.util.CollectionUtils.intersection(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isEmpty(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isEmpty(java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isEmpty(java.util.Collection)
*isEmpty(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isEqualCollection(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isEqualCollection(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isEqualCollection(java.util.Collection,java.util.Collection)
*isEqualCollection(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEqualCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isEqualCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#isEqualList(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.ListUtils#isEqualList(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.ListUtils.isEqualList(java.util.Collection,java.util.Collection)
*isEqualList(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEqualList(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.ListUtils.isEqualList(p0,p1);
}
/**
*{@link org.apache.commons.collections.SetUtils#isEqualSet(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.SetUtils#isEqualSet(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.SetUtils.isEqualSet(java.util.Collection,java.util.Collection)
*isEqualSet(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEqualSet(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.SetUtils.isEqualSet(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isFull(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isFull(java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isFull(java.util.Collection)
*isFull(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFull(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isFull(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isNotEmpty(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isNotEmpty(java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isNotEmpty(java.util.Collection)
*isNotEmpty(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isProperSubCollection(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isProperSubCollection(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isProperSubCollection(java.util.Collection,java.util.Collection)
*isProperSubCollection(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isProperSubCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isProperSubCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isSubCollection(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isSubCollection(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isSubCollection(java.util.Collection,java.util.Collection)
*isSubCollection(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSubCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isSubCollection(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#listFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)}
*@see org.apache.commons.io.FileUtils#listFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*<code>public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*listFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#listFiles(java.io.File,java.lang.String[],boolean)}
*@see org.apache.commons.io.FileUtils#listFiles(java.io.File,java.lang.String[],boolean)
*<code>public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,java.lang.String[],boolean)
*listFiles(java.io.File p0,java.lang.String[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#listFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)}
*@see org.apache.commons.io.FileUtils#listFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*<code>public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*listFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.io.File> listFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.listFilesAndDirs(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#loopingIterator(java.util.Collection)}
*@see org.apache.commons.collections.IteratorUtils#loopingIterator(java.util.Collection)
*<code>public static org.apache.commons.collections.ResettableIterator org.apache.commons.collections.IteratorUtils.loopingIterator(java.util.Collection)
*loopingIterator(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.ResettableIterator loopingIterator(java.util.Collection p0){
	return org.apache.commons.collections.IteratorUtils.loopingIterator(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#maxSize(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#maxSize(java.util.Collection)
*<code>public static int org.apache.commons.collections.CollectionUtils.maxSize(java.util.Collection)
*maxSize(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int maxSize(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.maxSize(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#nonePredicate(java.util.Collection)}
*@see org.apache.commons.collections.PredicateUtils#nonePredicate(java.util.Collection)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nonePredicate(java.util.Collection)
*nonePredicate(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate nonePredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.nonePredicate(p0);
}
/**
*{@link org.apache.commons.lang3.Validate#notEmpty(T,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.Validate#notEmpty(T,java.lang.String,java.lang.Object...)
*<code>public static <T> T org.apache.commons.lang3.Validate.notEmpty(T,java.lang.String,java.lang.Object...)
*notEmpty(T p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.util.Collection<?> > T notEmpty(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.notEmpty(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.Validate#notEmpty(T)}
*@see org.apache.commons.lang3.Validate#notEmpty(T)
*<code>public static <T> T org.apache.commons.lang3.Validate.notEmpty(T)
*notEmpty(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.util.Collection<?> > T notEmpty(T p0){
	return org.apache.commons.lang3.Validate.notEmpty(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#onePredicate(java.util.Collection)}
*@see org.apache.commons.collections.PredicateUtils#onePredicate(java.util.Collection)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.onePredicate(java.util.Collection)
*onePredicate(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate onePredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.onePredicate(p0);
}
/**
*{@link com.google.common.collect.Collections2#orderedPermutations(java.lang.Iterable<E>,java.util.Comparator<? super E>)}
*@see com.google.common.collect.Collections2#orderedPermutations(java.lang.Iterable<E>,java.util.Comparator<? super E>)
*<code>public static <E> java.util.Collection<java.util.List<E>> com.google.common.collect.Collections2.orderedPermutations(java.lang.Iterable<E>,java.util.Comparator<? super E>)
*orderedPermutations(java.lang.Iterable<E> p0,java.util.Comparator<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> p0,java.util.Comparator<? super E> p1){
	return com.google.common.collect.Collections2.orderedPermutations(p0,p1);
}
/**
*{@link com.google.common.collect.Collections2#orderedPermutations(java.lang.Iterable<E>)}
*@see com.google.common.collect.Collections2#orderedPermutations(java.lang.Iterable<E>)
*<code>public static <E> java.util.Collection<java.util.List<E>> com.google.common.collect.Collections2.orderedPermutations(java.lang.Iterable<E>)
*orderedPermutations(java.lang.Iterable<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> p0){
	return com.google.common.collect.Collections2.orderedPermutations(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#permutations(java.util.Collection<E>)}
*@see org.apache.commons.collections4.CollectionUtils#permutations(java.util.Collection<E>)
*<code>public static <E> java.util.Collection<java.util.List<E>> org.apache.commons.collections4.CollectionUtils.permutations(java.util.Collection<E>)
*permutations(java.util.Collection<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Collection<java.util.List<E>> permutations(java.util.Collection<E> p0){
	return org.apache.commons.collections4.CollectionUtils.permutations(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#predicatedCollection(java.util.Collection<C>,org.apache.commons.collections4.Predicate<? super C>)}
*@see org.apache.commons.collections4.CollectionUtils#predicatedCollection(java.util.Collection<C>,org.apache.commons.collections4.Predicate<? super C>)
*<code>public static <C> java.util.Collection<C> org.apache.commons.collections4.CollectionUtils.predicatedCollection(java.util.Collection<C>,org.apache.commons.collections4.Predicate<? super C>)
*predicatedCollection(java.util.Collection<C> p0,org.apache.commons.collections4.Predicate<? super C> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C> java.util.Collection<C> predicatedCollection(java.util.Collection<C> p0,org.apache.commons.collections4.Predicate<? super C> p1){
	return org.apache.commons.collections4.CollectionUtils.predicatedCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#predicatedCollection(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#predicatedCollection(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.predicatedCollection(java.util.Collection,org.apache.commons.collections.Predicate)
*predicatedCollection(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection predicatedCollection(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.predicatedCollection(p0,p1);
}
/**
*{@link org.apache.commons.math3.geometry.euclidean.twod.hull.AklToussaintHeuristic#reducePoints(java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>)}
*@see org.apache.commons.math3.geometry.euclidean.twod.hull.AklToussaintHeuristic#reducePoints(java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>)
*<code>public static java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> org.apache.commons.math3.geometry.euclidean.twod.hull.AklToussaintHeuristic.reducePoints(java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>)
*reducePoints(java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> reducePoints(java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> p0){
	return org.apache.commons.math3.geometry.euclidean.twod.hull.AklToussaintHeuristic.reducePoints(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#removeAll(java.util.Collection<E>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.CollectionUtils#removeAll(java.util.Collection<E>,java.util.Collection<?>)
*<code>public static <E> java.util.Collection<E> org.apache.commons.collections4.CollectionUtils.removeAll(java.util.Collection<E>,java.util.Collection<?>)
*removeAll(java.util.Collection<E> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Collection<E> removeAll(java.util.Collection<E> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.removeAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#removeAll(java.lang.Iterable<E>,java.lang.Iterable<? extends E>,org.apache.commons.collections4.Equator<? super E>)}
*@see org.apache.commons.collections4.CollectionUtils#removeAll(java.lang.Iterable<E>,java.lang.Iterable<? extends E>,org.apache.commons.collections4.Equator<? super E>)
*<code>public static <E> java.util.Collection<E> org.apache.commons.collections4.CollectionUtils.removeAll(java.lang.Iterable<E>,java.lang.Iterable<? extends E>,org.apache.commons.collections4.Equator<? super E>)
*removeAll(java.lang.Iterable<E> p0,java.lang.Iterable<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Collection<E> removeAll(java.lang.Iterable<E> p0,java.lang.Iterable<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2){
	return org.apache.commons.collections4.CollectionUtils.removeAll(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#removeAll(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#removeAll(java.util.Collection,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.removeAll(java.util.Collection,java.util.Collection)
*removeAll(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection removeAll(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.removeAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#retainAll(java.lang.Iterable<E>,java.lang.Iterable<? extends E>,org.apache.commons.collections4.Equator<? super E>)}
*@see org.apache.commons.collections4.CollectionUtils#retainAll(java.lang.Iterable<E>,java.lang.Iterable<? extends E>,org.apache.commons.collections4.Equator<? super E>)
*<code>public static <E> java.util.Collection<E> org.apache.commons.collections4.CollectionUtils.retainAll(java.lang.Iterable<E>,java.lang.Iterable<? extends E>,org.apache.commons.collections4.Equator<? super E>)
*retainAll(java.lang.Iterable<E> p0,java.lang.Iterable<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Collection<E> retainAll(java.lang.Iterable<E> p0,java.lang.Iterable<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2){
	return org.apache.commons.collections4.CollectionUtils.retainAll(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#retainAll(java.util.Collection<C>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.CollectionUtils#retainAll(java.util.Collection<C>,java.util.Collection<?>)
*<code>public static <C> java.util.Collection<C> org.apache.commons.collections4.CollectionUtils.retainAll(java.util.Collection<C>,java.util.Collection<?>)
*retainAll(java.util.Collection<C> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C> java.util.Collection<C> retainAll(java.util.Collection<C> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.retainAll(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#retainAll(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#retainAll(java.util.Collection,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.retainAll(java.util.Collection,java.util.Collection)
*retainAll(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection retainAll(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.retainAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R,R)}
*@see org.apache.commons.collections4.CollectionUtils#select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R,R)
*<code>public static <O,R> R org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R,R)
*select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2,R p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O,R extends java.util.Collection<? super O> > R select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2,R p3){
	return org.apache.commons.collections4.CollectionUtils.select(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R)}
*@see org.apache.commons.collections4.CollectionUtils#select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R)
*<code>public static <O,R> R org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R)
*select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O,R extends java.util.Collection<? super O> > R select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.select(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)}
*@see org.apache.commons.collections4.CollectionUtils#select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)
*<code>public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)
*select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.Collection<O> select(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1){
	return org.apache.commons.collections4.CollectionUtils.select(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.select(java.util.Collection,org.apache.commons.collections.Predicate)
*select(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection select(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.select(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)
*<code>public static void org.apache.commons.collections.CollectionUtils.select(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)
*select(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void select(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
	 org.apache.commons.collections.CollectionUtils.select(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#selectRejected(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R)}
*@see org.apache.commons.collections4.CollectionUtils#selectRejected(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R)
*<code>public static <O,R> R org.apache.commons.collections4.CollectionUtils.selectRejected(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>,R)
*selectRejected(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O,R extends java.util.Collection<? super O> > R selectRejected(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1,R p2){
	return org.apache.commons.collections4.CollectionUtils.selectRejected(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#selectRejected(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)}
*@see org.apache.commons.collections4.CollectionUtils#selectRejected(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)
*<code>public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.selectRejected(java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<? super O>)
*selectRejected(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.Collection<O> selectRejected(java.lang.Iterable<? extends O> p0,org.apache.commons.collections4.Predicate<? super O> p1){
	return org.apache.commons.collections4.CollectionUtils.selectRejected(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)
*<code>public static void org.apache.commons.collections.CollectionUtils.selectRejected(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)
*selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
	 org.apache.commons.collections.CollectionUtils.selectRejected(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.selectRejected(java.util.Collection,org.apache.commons.collections.Predicate)
*selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.selectRejected(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#subtract(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<O>)}
*@see org.apache.commons.collections4.CollectionUtils#subtract(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<O>)
*<code>public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.subtract(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,org.apache.commons.collections4.Predicate<O>)
*subtract(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,org.apache.commons.collections4.Predicate<O> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.Collection<O> subtract(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,org.apache.commons.collections4.Predicate<O> p2){
	return org.apache.commons.collections4.CollectionUtils.subtract(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#subtract(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)}
*@see org.apache.commons.collections4.CollectionUtils#subtract(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*<code>public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.subtract(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*subtract(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.Collection<O> subtract(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.subtract(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#subtract(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#subtract(java.util.Collection,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.subtract(java.util.Collection,java.util.Collection)
*subtract(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection subtract(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.subtract(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.CollectionUtils#subtract(java.util.Collection<T>,java.util.Collection<T>)}
*@see org.codehaus.plexus.util.CollectionUtils#subtract(java.util.Collection<T>,java.util.Collection<T>)
*<code>public static <T> java.util.Collection<T> org.codehaus.plexus.util.CollectionUtils.subtract(java.util.Collection<T>,java.util.Collection<T>)
*subtract(java.util.Collection<T> p0,java.util.Collection<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Collection<T> subtract(java.util.Collection<T> p0,java.util.Collection<T> p1){
	return org.codehaus.plexus.util.CollectionUtils.subtract(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#synchronizedCollection(java.util.Collection<C>)}
*@see org.apache.commons.collections4.CollectionUtils#synchronizedCollection(java.util.Collection<C>)
*<code>public static <C> java.util.Collection<C> org.apache.commons.collections4.CollectionUtils.synchronizedCollection(java.util.Collection<C>)
*synchronizedCollection(java.util.Collection<C> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C> java.util.Collection<C> synchronizedCollection(java.util.Collection<C> p0){
	return org.apache.commons.collections4.CollectionUtils.synchronizedCollection(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#synchronizedCollection(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#synchronizedCollection(java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.synchronizedCollection(java.util.Collection)
*synchronizedCollection(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection synchronizedCollection(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.synchronizedCollection(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#transform(java.util.Collection,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.CollectionUtils#transform(java.util.Collection,org.apache.commons.collections.Transformer)
*<code>public static void org.apache.commons.collections.CollectionUtils.transform(java.util.Collection,org.apache.commons.collections.Transformer)
*transform(java.util.Collection p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void transform(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	 org.apache.commons.collections.CollectionUtils.transform(p0,p1);
}
/**
*{@link com.google.common.collect.Collections2#transform(java.util.Collection<F>,com.google.common.base.Function<? super F, T>)}
*@see com.google.common.collect.Collections2#transform(java.util.Collection<F>,com.google.common.base.Function<? super F, T>)
*<code>public static <F,T> java.util.Collection<T> com.google.common.collect.Collections2.transform(java.util.Collection<F>,com.google.common.base.Function<? super F, T>)
*transform(java.util.Collection<F> p0,com.google.common.base.Function<? super F, T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <F,T> java.util.Collection<T> transform(java.util.Collection<F> p0,com.google.common.base.Function<? super F, T> p1){
	return com.google.common.collect.Collections2.transform(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#transformedCollection(java.util.Collection,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.CollectionUtils#transformedCollection(java.util.Collection,org.apache.commons.collections.Transformer)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.transformedCollection(java.util.Collection,org.apache.commons.collections.Transformer)
*transformedCollection(java.util.Collection p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection transformedCollection(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.transformedCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#transformingCollection(java.util.Collection<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)}
*@see org.apache.commons.collections4.CollectionUtils#transformingCollection(java.util.Collection<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*<code>public static <E> java.util.Collection<E> org.apache.commons.collections4.CollectionUtils.transformingCollection(java.util.Collection<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*transformingCollection(java.util.Collection<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.Collection<E> transformingCollection(java.util.Collection<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.CollectionUtils.transformingCollection(p0,p1);
}
/**
*{@link com.facebook.collectionsbase.Piles#transmogrify(java.util.Iterator<X>,java.util.Collection<Y>,com.google.common.base.Function<X, Y>)}
*@see com.facebook.collectionsbase.Piles#transmogrify(java.util.Iterator<X>,java.util.Collection<Y>,com.google.common.base.Function<X, Y>)
*<code>public static <X,Y> java.util.Collection<Y> com.facebook.collectionsbase.Piles.transmogrify(java.util.Iterator<X>,java.util.Collection<Y>,com.google.common.base.Function<X, Y>)
*transmogrify(java.util.Iterator<X> p0,java.util.Collection<Y> p1,com.google.common.base.Function<X, Y> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <X,Y> java.util.Collection<Y> transmogrify(java.util.Iterator<X> p0,java.util.Collection<Y> p1,com.google.common.base.Function<X, Y> p2){
	return com.facebook.collectionsbase.Piles.transmogrify(p0,p1,p2);
}
/**
*{@link com.facebook.collectionsbase.Piles#transmogrify(java.util.Iterator<X>,java.util.Collection<Y>,com.facebook.collectionsbase.Mapper<X, Y>)}
*@see com.facebook.collectionsbase.Piles#transmogrify(java.util.Iterator<X>,java.util.Collection<Y>,com.facebook.collectionsbase.Mapper<X, Y>)
*<code>public static <X,Y> java.util.Collection<Y> com.facebook.collectionsbase.Piles.transmogrify(java.util.Iterator<X>,java.util.Collection<Y>,com.facebook.collectionsbase.Mapper<X, Y>)
*transmogrify(java.util.Iterator<X> p0,java.util.Collection<Y> p1,com.facebook.collectionsbase.Mapper<X, Y> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <X,Y> java.util.Collection<Y> transmogrify(java.util.Iterator<X> p0,java.util.Collection<Y> p1,com.facebook.collectionsbase.Mapper<X, Y> p2){
	return com.facebook.collectionsbase.Piles.transmogrify(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#typedCollection(java.util.Collection,java.lang.Class)}
*@see org.apache.commons.collections.CollectionUtils#typedCollection(java.util.Collection,java.lang.Class)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.typedCollection(java.util.Collection,java.lang.Class)
*typedCollection(java.util.Collection p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection typedCollection(java.util.Collection p0,java.lang.Class p1){
	return org.apache.commons.collections.CollectionUtils.typedCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#union(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)}
*@see org.apache.commons.collections4.CollectionUtils#union(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*<code>public static <O> java.util.Collection<O> org.apache.commons.collections4.CollectionUtils.union(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>)
*union(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.Collection<O> union(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1){
	return org.apache.commons.collections4.CollectionUtils.union(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#union(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#union(java.util.Collection,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.union(java.util.Collection,java.util.Collection)
*union(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection union(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.union(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#unmodifiableCollection(java.util.Collection<? extends C>)}
*@see org.apache.commons.collections4.CollectionUtils#unmodifiableCollection(java.util.Collection<? extends C>)
*<code>public static <C> java.util.Collection<C> org.apache.commons.collections4.CollectionUtils.unmodifiableCollection(java.util.Collection<? extends C>)
*unmodifiableCollection(java.util.Collection<? extends C> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C> java.util.Collection<C> unmodifiableCollection(java.util.Collection<? extends C> p0){
	return org.apache.commons.collections4.CollectionUtils.unmodifiableCollection(p0);
}
/**
*{@link org.apache.commons.collections4.collection.UnmodifiableCollection#unmodifiableCollection(java.util.Collection<? extends T>)}
*@see org.apache.commons.collections4.collection.UnmodifiableCollection#unmodifiableCollection(java.util.Collection<? extends T>)
*<code>public static <T> java.util.Collection<T> org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(java.util.Collection<? extends T>)
*unmodifiableCollection(java.util.Collection<? extends T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T> p0){
	return org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#unmodifiableCollection(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#unmodifiableCollection(java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.unmodifiableCollection(java.util.Collection)
*unmodifiableCollection(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection unmodifiableCollection(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.unmodifiableCollection(p0);
}
/**
*{@link org.apache.commons.lang3.Validate#validIndex(T,int)}
*@see org.apache.commons.lang3.Validate#validIndex(T,int)
*<code>public static <T> T org.apache.commons.lang3.Validate.validIndex(T,int)
*validIndex(T p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1){
	return org.apache.commons.lang3.Validate.validIndex(p0,p1);
}
/**
*{@link org.apache.commons.lang3.Validate#validIndex(T,int,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.Validate#validIndex(T,int,java.lang.String,java.lang.Object...)
*<code>public static <T> T org.apache.commons.lang3.Validate.validIndex(T,int,java.lang.String,java.lang.Object...)
*validIndex(T p0,int p1,java.lang.String p2,java.lang.Object... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1,java.lang.String p2,java.lang.Object... p3){
	return org.apache.commons.lang3.Validate.validIndex(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ByteCollectionCollection#wrap(org.apache.commons.collections.primitives.ByteCollection)}
*@see org.apache.commons.collections.primitives.adapters.ByteCollectionCollection#wrap(org.apache.commons.collections.primitives.ByteCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.ByteCollectionCollection.wrap(org.apache.commons.collections.primitives.ByteCollection)
*wrap(org.apache.commons.collections.primitives.ByteCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.ByteCollection p0){
	return org.apache.commons.collections.primitives.adapters.ByteCollectionCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CharCollectionCollection#wrap(org.apache.commons.collections.primitives.CharCollection)}
*@see org.apache.commons.collections.primitives.adapters.CharCollectionCollection#wrap(org.apache.commons.collections.primitives.CharCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.CharCollectionCollection.wrap(org.apache.commons.collections.primitives.CharCollection)
*wrap(org.apache.commons.collections.primitives.CharCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.CharCollection p0){
	return org.apache.commons.collections.primitives.adapters.CharCollectionCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CollectionByteCollection#wrap(java.util.Collection)}
*@see org.apache.commons.collections.primitives.adapters.CollectionByteCollection#wrap(java.util.Collection)
*<code>public static org.apache.commons.collections.primitives.ByteCollection org.apache.commons.collections.primitives.adapters.CollectionByteCollection.wrap(java.util.Collection)
*wrap(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteCollection wrap(java.util.Collection p0){
	return org.apache.commons.collections.primitives.adapters.CollectionByteCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection#wrap(org.apache.commons.collections.primitives.DoubleCollection)}
*@see org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection#wrap(org.apache.commons.collections.primitives.DoubleCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection.wrap(org.apache.commons.collections.primitives.DoubleCollection)
*wrap(org.apache.commons.collections.primitives.DoubleCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.DoubleCollection p0){
	return org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.FloatCollectionCollection#wrap(org.apache.commons.collections.primitives.FloatCollection)}
*@see org.apache.commons.collections.primitives.adapters.FloatCollectionCollection#wrap(org.apache.commons.collections.primitives.FloatCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.FloatCollectionCollection.wrap(org.apache.commons.collections.primitives.FloatCollection)
*wrap(org.apache.commons.collections.primitives.FloatCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.FloatCollection p0){
	return org.apache.commons.collections.primitives.adapters.FloatCollectionCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IntCollectionCollection#wrap(org.apache.commons.collections.primitives.IntCollection)}
*@see org.apache.commons.collections.primitives.adapters.IntCollectionCollection#wrap(org.apache.commons.collections.primitives.IntCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.IntCollectionCollection.wrap(org.apache.commons.collections.primitives.IntCollection)
*wrap(org.apache.commons.collections.primitives.IntCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.IntCollection p0){
	return org.apache.commons.collections.primitives.adapters.IntCollectionCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.LongCollectionCollection#wrap(org.apache.commons.collections.primitives.LongCollection)}
*@see org.apache.commons.collections.primitives.adapters.LongCollectionCollection#wrap(org.apache.commons.collections.primitives.LongCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.LongCollectionCollection.wrap(org.apache.commons.collections.primitives.LongCollection)
*wrap(org.apache.commons.collections.primitives.LongCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.LongCollection p0){
	return org.apache.commons.collections.primitives.adapters.LongCollectionCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ShortCollectionCollection#wrap(org.apache.commons.collections.primitives.ShortCollection)}
*@see org.apache.commons.collections.primitives.adapters.ShortCollectionCollection#wrap(org.apache.commons.collections.primitives.ShortCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.ShortCollectionCollection.wrap(org.apache.commons.collections.primitives.ShortCollection)
*wrap(org.apache.commons.collections.primitives.ShortCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.ShortCollection p0){
	return org.apache.commons.collections.primitives.adapters.ShortCollectionCollection.wrap(p0);
}
}
