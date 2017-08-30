package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicateUtil{ 
/**
*public static com.google.common.base.Predicate<java.lang.CharSequence> com.google.common.base.Predicates.contains(java.util.regex.Pattern)
*/ 
public static com.google.common.base.Predicate<java.lang.CharSequence> contains(java.util.regex.Pattern p0){
	return com.google.common.base.Predicates.contains(p0);
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.isNull()
*/ 
public static <T> com.google.common.base.Predicate<T> isNull(){
	return com.google.common.base.Predicates.isNull();
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.and(com.google.common.base.Predicate<? super T>,com.google.common.base.Predicate<? super T>)
*/ 
public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.base.Predicates.and(p0,p1);
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.and(com.google.common.base.Predicate<? super T>...)
*/ 
public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T>... p0){
	return com.google.common.base.Predicates.and(p0);
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>)
*/ 
public static <T> com.google.common.base.Predicate<T> and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> p0){
	return com.google.common.base.Predicates.and(p0);
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.or(com.google.common.base.Predicate<? super T>,com.google.common.base.Predicate<? super T>)
*/ 
public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.base.Predicates.or(p0,p1);
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.or(com.google.common.base.Predicate<? super T>...)
*/ 
public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T>... p0){
	return com.google.common.base.Predicates.or(p0);
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>)
*/ 
public static <T> com.google.common.base.Predicate<T> or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> p0){
	return com.google.common.base.Predicates.or(p0);
}
/**
*public static <A,B> com.google.common.base.Predicate<A> com.google.common.base.Predicates.compose(com.google.common.base.Predicate<B>,com.google.common.base.Function<A, ? extends B>)
*/ 
public static <A,B> com.google.common.base.Predicate<A> compose(com.google.common.base.Predicate<B> p0,com.google.common.base.Function<A, ? extends B> p1){
	return com.google.common.base.Predicates.compose(p0,p1);
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.notNull()
*/ 
public static <T> com.google.common.base.Predicate<T> notNull(){
	return com.google.common.base.Predicates.notNull();
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.alwaysTrue()
*/ 
public static <T> com.google.common.base.Predicate<T> alwaysTrue(){
	return com.google.common.base.Predicates.alwaysTrue();
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.alwaysFalse()
*/ 
public static <T> com.google.common.base.Predicate<T> alwaysFalse(){
	return com.google.common.base.Predicates.alwaysFalse();
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.equalTo(T)
*/ 
public static <T> com.google.common.base.Predicate<T> equalTo(T p0){
	return com.google.common.base.Predicates.equalTo(p0);
}
/**
*public static com.google.common.base.Predicate<java.lang.CharSequence> com.google.common.base.Predicates.containsPattern(java.lang.String)
*/ 
public static com.google.common.base.Predicate<java.lang.CharSequence> containsPattern(java.lang.String p0){
	return com.google.common.base.Predicates.containsPattern(p0);
}
/**
*public static com.google.common.base.Predicate<java.lang.Object> com.google.common.base.Predicates.instanceOf(java.lang.Class<?>)
*/ 
public static com.google.common.base.Predicate<java.lang.Object> instanceOf(java.lang.Class<?> p0){
	return com.google.common.base.Predicates.instanceOf(p0);
}
/**
*public static com.google.common.base.Predicate<java.lang.Class<?>> com.google.common.base.Predicates.assignableFrom(java.lang.Class<?>)
*/ 
public static com.google.common.base.Predicate<java.lang.Class<?>> assignableFrom(java.lang.Class<?> p0){
	return com.google.common.base.Predicates.assignableFrom(p0);
}
/**
*public static com.google.common.base.Predicate<java.io.File> com.google.common.io.Files.isDirectory()
*/ 
public static com.google.common.base.Predicate<java.io.File> isDirectory(){
	return com.google.common.io.Files.isDirectory();
}
/**
*public static com.google.common.base.Predicate<java.io.File> com.google.common.io.Files.isFile()
*/ 
public static com.google.common.base.Predicate<java.io.File> isFile(){
	return com.google.common.io.Files.isFile();
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.predicatedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.SortedBag predicatedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.BagUtils.predicatedSortedBag(p0,p1);
}
/**
*public static org.apache.commons.collections.Bag org.apache.commons.collections.BagUtils.predicatedBag(org.apache.commons.collections.Bag,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Bag predicatedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.BagUtils.predicatedBag(p0,p1);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(org.apache.commons.collections.Predicate,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.asTransformer(org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.TransformerUtils.asTransformer(p0);
}
/**
*public static java.lang.Object org.apache.commons.collections.CollectionUtils.find(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static java.lang.Object find(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.find(p0,p1);
}
/**
*public static boolean org.apache.commons.collections.CollectionUtils.exists(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static boolean exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.exists(p0,p1);
}
/**
*public static void org.apache.commons.collections.CollectionUtils.filter(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static void filter(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	 org.apache.commons.collections.CollectionUtils.filter(p0,p1);
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
*public static int org.apache.commons.collections.CollectionUtils.countMatches(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static int countMatches(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.countMatches(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.CollectionUtils.predicatedCollection(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Collection predicatedCollection(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.predicatedCollection(p0,p1);
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
*public static java.util.SortedMap org.apache.commons.collections.MapUtils.predicatedSortedMap(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static java.util.SortedMap predicatedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.MapUtils.predicatedSortedMap(p0,p1,p2);
}
/**
*public static java.util.Map org.apache.commons.collections.MapUtils.predicatedMap(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Map predicatedMap(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.MapUtils.predicatedMap(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Bag org.apache.commons.collections.bag.PredicatedBag.decorate(org.apache.commons.collections.Bag,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.bag.PredicatedBag.decorate(p0,p1);
}
/**
*public static java.util.Collection org.apache.commons.collections.collection.PredicatedCollection.decorate(java.util.Collection,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.collection.PredicatedCollection.decorate(p0,p1);
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.PredicatedSortedBag.decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.bag.PredicatedSortedBag.decorate(p0,p1);
}
/**
*public static java.util.Map org.apache.commons.collections.map.PredicatedMap.decorate(java.util.Map,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.map.PredicatedMap.decorate(p0,p1,p2);
}
/**
*public static java.util.SortedMap org.apache.commons.collections.map.PredicatedSortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
	return org.apache.commons.collections.map.PredicatedSortedMap.decorate(p0,p1,p2);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.filteredIterator(java.util.Iterator,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Iterator filteredIterator(java.util.Iterator p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.IteratorUtils.filteredIterator(p0,p1);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.filteredListIterator(java.util.ListIterator,org.apache.commons.collections.Predicate)
*/ 
public static java.util.ListIterator filteredListIterator(java.util.ListIterator p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.IteratorUtils.filteredListIterator(p0,p1);
}
/**
*public static java.util.Set org.apache.commons.collections.SetUtils.predicatedSet(java.util.Set,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Set predicatedSet(java.util.Set p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.SetUtils.predicatedSet(p0,p1);
}
/**
*public static java.util.SortedSet org.apache.commons.collections.SetUtils.predicatedSortedSet(java.util.SortedSet,org.apache.commons.collections.Predicate)
*/ 
public static java.util.SortedSet predicatedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.SetUtils.predicatedSortedSet(p0,p1);
}
/**
*public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.predicatedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Buffer predicatedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.BufferUtils.predicatedBuffer(p0,p1);
}
/**
*public static java.util.List org.apache.commons.collections.list.PredicatedList.decorate(java.util.List,org.apache.commons.collections.Predicate)
*/ 
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.list.PredicatedList.decorate(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.ifClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.ClosureUtils.ifClosure(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.ifClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.ClosureUtils.ifClosure(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.doWhileClosure(org.apache.commons.collections.Closure,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Closure doWhileClosure(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.ClosureUtils.doWhileClosure(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.whileClosure(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure whileClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.ClosureUtils.whileClosure(p0,p1);
}
/**
*public static java.util.SortedSet org.apache.commons.collections.set.PredicatedSortedSet.decorate(java.util.SortedSet,org.apache.commons.collections.Predicate)
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.set.PredicatedSortedSet.decorate(p0,p1);
}
/**
*public static java.util.Set org.apache.commons.collections.set.PredicatedSet.decorate(java.util.Set,org.apache.commons.collections.Predicate)
*/ 
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.set.PredicatedSet.decorate(p0,p1);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NotNullPredicate.getInstance()
*/ 
public static org.apache.commons.collections.Predicate getInstance(){
	return org.apache.commons.collections.functors.NotNullPredicate.getInstance();
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NullIsExceptionPredicate.getInstance(org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.functors.NullIsExceptionPredicate.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NonePredicate.getInstance(org.apache.commons.collections.Predicate[])
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate[] p0){
	return org.apache.commons.collections.functors.NonePredicate.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NonePredicate.getInstance(java.util.Collection)
*/ 
public static org.apache.commons.collections.Predicate getInstance(java.util.Collection p0){
	return org.apache.commons.collections.functors.NonePredicate.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.WhileClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,boolean)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,boolean p2){
	return org.apache.commons.collections.functors.WhileClosure.getInstance(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.OrPredicate.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.functors.OrPredicate.getInstance(p0,p1);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.TransformerPredicate.getInstance(org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.functors.TransformerPredicate.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.EqualPredicate.getInstance(java.lang.Object)
*/ 
public static org.apache.commons.collections.Predicate getInstance(java.lang.Object p0){
	return org.apache.commons.collections.functors.EqualPredicate.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.InstanceofPredicate.getInstance(java.lang.Class)
*/ 
public static org.apache.commons.collections.Predicate getInstance(java.lang.Class p0){
	return org.apache.commons.collections.functors.InstanceofPredicate.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.TransformedPredicate.getInstance(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.functors.TransformedPredicate.getInstance(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.IfClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
	return org.apache.commons.collections.functors.IfClosure.getInstance(p0,p1);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.IfClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.functors.IfClosure.getInstance(p0,p1,p2);
}
/**
*public static java.util.List org.apache.commons.collections.ListUtils.predicatedList(java.util.List,org.apache.commons.collections.Predicate)
*/ 
public static java.util.List predicatedList(java.util.List p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.ListUtils.predicatedList(p0,p1);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.asPredicate(org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.Predicate asPredicate(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.PredicateUtils.asPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.exceptionPredicate()
*/ 
public static org.apache.commons.collections.Predicate exceptionPredicate(){
	return org.apache.commons.collections.PredicateUtils.exceptionPredicate();
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.transformedPredicate(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate transformedPredicate(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.transformedPredicate(p0,p1);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.instanceofPredicate(java.lang.Class)
*/ 
public static org.apache.commons.collections.Predicate instanceofPredicate(java.lang.Class p0){
	return org.apache.commons.collections.PredicateUtils.instanceofPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nullIsExceptionPredicate(org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate nullIsExceptionPredicate(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.PredicateUtils.nullIsExceptionPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.identityPredicate(java.lang.Object)
*/ 
public static org.apache.commons.collections.Predicate identityPredicate(java.lang.Object p0){
	return org.apache.commons.collections.PredicateUtils.identityPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nullIsFalsePredicate(org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate nullIsFalsePredicate(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.PredicateUtils.nullIsFalsePredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nullIsTruePredicate(org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate nullIsTruePredicate(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.PredicateUtils.nullIsTruePredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nullPredicate()
*/ 
public static org.apache.commons.collections.Predicate nullPredicate(){
	return org.apache.commons.collections.PredicateUtils.nullPredicate();
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.onePredicate(java.util.Collection)
*/ 
public static org.apache.commons.collections.Predicate onePredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.onePredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.onePredicate(org.apache.commons.collections.Predicate[])
*/ 
public static org.apache.commons.collections.Predicate onePredicate(org.apache.commons.collections.Predicate[] p0){
	return org.apache.commons.collections.PredicateUtils.onePredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.falsePredicate()
*/ 
public static org.apache.commons.collections.Predicate falsePredicate(){
	return org.apache.commons.collections.PredicateUtils.falsePredicate();
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.orPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate orPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.orPredicate(p0,p1);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.neitherPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate neitherPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.neitherPredicate(p0,p1);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.anyPredicate(java.util.Collection)
*/ 
public static org.apache.commons.collections.Predicate anyPredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.anyPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.anyPredicate(org.apache.commons.collections.Predicate[])
*/ 
public static org.apache.commons.collections.Predicate anyPredicate(org.apache.commons.collections.Predicate[] p0){
	return org.apache.commons.collections.PredicateUtils.anyPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.notPredicate(org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate notPredicate(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.PredicateUtils.notPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.notNullPredicate()
*/ 
public static org.apache.commons.collections.Predicate notNullPredicate(){
	return org.apache.commons.collections.PredicateUtils.notNullPredicate();
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.uniquePredicate()
*/ 
public static org.apache.commons.collections.Predicate uniquePredicate(){
	return org.apache.commons.collections.PredicateUtils.uniquePredicate();
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.allPredicate(java.util.Collection)
*/ 
public static org.apache.commons.collections.Predicate allPredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.allPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.allPredicate(org.apache.commons.collections.Predicate[])
*/ 
public static org.apache.commons.collections.Predicate allPredicate(org.apache.commons.collections.Predicate[] p0){
	return org.apache.commons.collections.PredicateUtils.allPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.truePredicate()
*/ 
public static org.apache.commons.collections.Predicate truePredicate(){
	return org.apache.commons.collections.PredicateUtils.truePredicate();
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.equalPredicate(java.lang.Object)
*/ 
public static org.apache.commons.collections.Predicate equalPredicate(java.lang.Object p0){
	return org.apache.commons.collections.PredicateUtils.equalPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.andPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate andPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.andPredicate(p0,p1);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nonePredicate(org.apache.commons.collections.Predicate[])
*/ 
public static org.apache.commons.collections.Predicate nonePredicate(org.apache.commons.collections.Predicate[] p0){
	return org.apache.commons.collections.PredicateUtils.nonePredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nonePredicate(java.util.Collection)
*/ 
public static org.apache.commons.collections.Predicate nonePredicate(java.util.Collection p0){
	return org.apache.commons.collections.PredicateUtils.nonePredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.invokerPredicate(java.lang.String)
*/ 
public static org.apache.commons.collections.Predicate invokerPredicate(java.lang.String p0){
	return org.apache.commons.collections.PredicateUtils.invokerPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.invokerPredicate(java.lang.String,java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Predicate invokerPredicate(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
	return org.apache.commons.collections.PredicateUtils.invokerPredicate(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.eitherPredicate(org.apache.commons.collections.Predicate,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Predicate eitherPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.eitherPredicate(p0,p1);
}
/**
*public static org.apache.commons.collections.Buffer org.apache.commons.collections.buffer.PredicatedBuffer.decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.buffer.PredicatedBuffer.decorate(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.NullIsExceptionPredicate.nullIsExceptionPredicate(org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nullIsExceptionPredicate(org.apache.commons.collections4.Predicate<? super T> p0){
	return org.apache.commons.collections4.functors.NullIsExceptionPredicate.nullIsExceptionPredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.NonePredicate.nonePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nonePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
	return org.apache.commons.collections4.functors.NonePredicate.nonePredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.NonePredicate.nonePredicate(org.apache.commons.collections4.Predicate<? super T>...)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nonePredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
	return org.apache.commons.collections4.functors.NonePredicate.nonePredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.OnePredicate.onePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> onePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
	return org.apache.commons.collections4.functors.OnePredicate.onePredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.OnePredicate.onePredicate(org.apache.commons.collections4.Predicate<? super T>...)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> onePredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
	return org.apache.commons.collections4.functors.OnePredicate.onePredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.NotPredicate.notPredicate(org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> notPredicate(org.apache.commons.collections4.Predicate<? super T> p0){
	return org.apache.commons.collections4.functors.NotPredicate.notPredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(T,java.util.Comparator<T>,org.apache.commons.collections4.functors.ComparatorPredicate$Criterion)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> comparatorPredicate(T p0,java.util.Comparator<T> p1,Criterion p2){
	return org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(p0,p1,p2);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(T,java.util.Comparator<T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> comparatorPredicate(T p0,java.util.Comparator<T> p1){
	return org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.NullIsTruePredicate.nullIsTruePredicate(org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nullIsTruePredicate(org.apache.commons.collections4.Predicate<? super T> p0){
	return org.apache.commons.collections4.functors.NullIsTruePredicate.nullIsTruePredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.OrPredicate.orPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> orPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.functors.OrPredicate.orPredicate(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.NullIsFalsePredicate.nullIsFalsePredicate(org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> nullIsFalsePredicate(org.apache.commons.collections4.Predicate<? super T> p0){
	return org.apache.commons.collections4.functors.NullIsFalsePredicate.nullIsFalsePredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.TransformerPredicate.transformerPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> transformerPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean> p0){
	return org.apache.commons.collections4.functors.TransformerPredicate.transformerPredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.AndPredicate.andPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> andPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.functors.AndPredicate.andPredicate(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(T,org.apache.commons.collections4.Equator<T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> equalPredicate(T p0,org.apache.commons.collections4.Equator<T> p1){
	return org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(T)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> equalPredicate(T p0){
	return org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.AnyPredicate.anyPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> anyPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
	return org.apache.commons.collections4.functors.AnyPredicate.anyPredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.AnyPredicate.anyPredicate(org.apache.commons.collections4.Predicate<? super T>...)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> anyPredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
	return org.apache.commons.collections4.functors.AnyPredicate.anyPredicate(p0);
}
/**
*public static org.apache.commons.collections4.Predicate<java.lang.Object> org.apache.commons.collections4.functors.InstanceofPredicate.instanceOfPredicate(java.lang.Class<?>)
*/ 
public static org.apache.commons.collections4.Predicate<java.lang.Object> instanceOfPredicate(java.lang.Class<?> p0){
	return org.apache.commons.collections4.functors.InstanceofPredicate.instanceOfPredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.IdentityPredicate.identityPredicate(T)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> identityPredicate(T p0){
	return org.apache.commons.collections4.functors.IdentityPredicate.identityPredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.TransformedPredicate.transformedPredicate(org.apache.commons.collections4.Transformer<? super T, ? extends T>,org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> transformedPredicate(org.apache.commons.collections4.Transformer<? super T, ? extends T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.functors.TransformedPredicate.transformedPredicate(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.AllPredicate.allPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> allPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
	return org.apache.commons.collections4.functors.AllPredicate.allPredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.AllPredicate.allPredicate(org.apache.commons.collections4.Predicate<? super T>...)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> allPredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
	return org.apache.commons.collections4.functors.AllPredicate.allPredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.asPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> asPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean> p0){
	return org.apache.commons.collections4.PredicateUtils.asPredicate(p0);
}
/**
*public static org.apache.commons.collections4.Predicate<java.lang.Object> org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.Class<?>)
*/ 
public static org.apache.commons.collections4.Predicate<java.lang.Object> instanceofPredicate(java.lang.Class<?> p0){
	return org.apache.commons.collections4.PredicateUtils.instanceofPredicate(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> neitherPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.PredicateUtils.neitherPredicate(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.invokerPredicate(java.lang.String,java.lang.Class<?>[],java.lang.Object[])
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> invokerPredicate(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object[] p2){
	return org.apache.commons.collections4.PredicateUtils.invokerPredicate(p0,p1,p2);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> eitherPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.PredicateUtils.eitherPredicate(p0,p1);
}
}
