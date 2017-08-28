package com.github.zengfr.supercommons;
import org.apache.commons.collections.BagUtils;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.bag.TransformedSortedBag;
import org.apache.commons.collections.bag.TransformedBag;
import org.apache.commons.collections.collection.TransformedCollection;
import org.apache.commons.collections.map.TransformedSortedMap;
import org.apache.commons.collections.map.TransformedMap;
import org.apache.commons.collections.map.DefaultedMap;
import org.apache.commons.collections.map.LazySortedMap;
import org.apache.commons.collections.map.LazyMap;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.SetUtils;
import org.apache.commons.collections.BufferUtils;
import org.apache.commons.collections.ComparatorUtils;
import org.apache.commons.collections.list.TransformedList;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.set.TransformedSet;
import org.apache.commons.collections.set.TransformedSortedSet;
import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.functors.InstantiateTransformer;
import org.apache.commons.collections.functors.InvokerTransformer;
import org.apache.commons.collections.functors.TransformerClosure;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.functors.MapTransformer;
import org.apache.commons.collections.functors.PredicateTransformer;
import org.apache.commons.collections.functors.ClosureTransformer;
import org.apache.commons.collections.functors.TransformerPredicate;
import org.apache.commons.collections.functors.CloneTransformer;
import org.apache.commons.collections.functors.SwitchTransformer;
import org.apache.commons.collections.functors.TransformedPredicate;
import org.apache.commons.collections.functors.NOPTransformer;
import org.apache.commons.collections.functors.FactoryTransformer;
import org.apache.commons.collections.functors.ExceptionTransformer;
import org.apache.commons.collections.functors.StringValueTransformer;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.PredicateUtils;
import org.apache.commons.collections.buffer.TransformedBuffer;
import org.apache.commons.collections4.TransformerUtils;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.IfTransformer;
import org.apache.commons.collections4.functors.InstantiateTransformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.MapTransformer;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.apache.commons.collections4.functors.CloneTransformer;
import org.apache.commons.collections4.functors.SwitchTransformer;
import org.apache.commons.collections4.functors.NOPTransformer;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.ExceptionTransformer;
import org.apache.commons.collections4.functors.StringValueTransformer;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformerUtil{ 
public static org.apache.commons.collections.Bag transformedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1){
return BagUtils.transformedBag(p0,p1);
}
public static org.apache.commons.collections.SortedBag transformedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1){
return BagUtils.transformedSortedBag(p0,p1);
}
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Closure p0){
return TransformerUtils.asTransformer(p0);
}
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Predicate p0){
return TransformerUtils.asTransformer(p0);
}
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Factory p0){
return TransformerUtils.asTransformer(p0);
}
public static org.apache.commons.collections.Transformer mapTransformer(java.util.Map p0){
return TransformerUtils.mapTransformer(p0);
}
public static org.apache.commons.collections.Transformer nopTransformer(){
return TransformerUtils.nopTransformer();
}
public static org.apache.commons.collections.Transformer cloneTransformer(){
return TransformerUtils.cloneTransformer();
}
public static org.apache.commons.collections.Transformer nullTransformer(){
return TransformerUtils.nullTransformer();
}
public static org.apache.commons.collections.Transformer invokerTransformer(java.lang.String p0){
return TransformerUtils.invokerTransformer(p0);
}
public static org.apache.commons.collections.Transformer invokerTransformer(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return TransformerUtils.invokerTransformer(p0,p1,p2);
}
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1){
return TransformerUtils.switchTransformer(p0,p1);
}
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return TransformerUtils.switchTransformer(p0,p1,p2);
}
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
return TransformerUtils.switchTransformer(p0,p1,p2);
}
public static org.apache.commons.collections.Transformer switchTransformer(java.util.Map p0){
return TransformerUtils.switchTransformer(p0);
}
public static org.apache.commons.collections.Transformer stringValueTransformer(){
return TransformerUtils.stringValueTransformer();
}
public static org.apache.commons.collections.Transformer switchMapTransformer(java.util.Map p0){
return TransformerUtils.switchMapTransformer(p0);
}
public static org.apache.commons.collections.Transformer chainedTransformer(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Transformer p1){
return TransformerUtils.chainedTransformer(p0,p1);
}
public static org.apache.commons.collections.Transformer chainedTransformer(java.util.Collection p0){
return TransformerUtils.chainedTransformer(p0);
}
public static org.apache.commons.collections.Transformer chainedTransformer(org.apache.commons.collections.Transformer[] p0){
return TransformerUtils.chainedTransformer(p0);
}
public static org.apache.commons.collections.Transformer exceptionTransformer(){
return TransformerUtils.exceptionTransformer();
}
public static org.apache.commons.collections.Transformer constantTransformer(java.lang.Object p0){
return TransformerUtils.constantTransformer(p0);
}
public static org.apache.commons.collections.Transformer instantiateTransformer(java.lang.Class[] p0,java.lang.Object[] p1){
return TransformerUtils.instantiateTransformer(p0,p1);
}
public static org.apache.commons.collections.Transformer instantiateTransformer(){
return TransformerUtils.instantiateTransformer();
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
public static void transform(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
 CollectionUtils.transform(p0,p1);
}
public static java.util.Collection transformedCollection(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
return CollectionUtils.transformedCollection(p0,p1);
}
public static java.util.Map transformedMap(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return MapUtils.transformedMap(p0,p1,p2);
}
public static java.util.Map lazyMap(java.util.Map p0,org.apache.commons.collections.Transformer p1){
return MapUtils.lazyMap(p0,p1);
}
public static java.util.SortedMap lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1){
return MapUtils.lazySortedMap(p0,p1);
}
public static java.util.SortedMap transformedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return MapUtils.transformedSortedMap(p0,p1,p2);
}
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1){
return TransformedSortedBag.decorate(p0,p1);
}
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1){
return TransformedBag.decorate(p0,p1);
}
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
return TransformedCollection.decorate(p0,p1);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return TransformedSortedMap.decorate(p0,p1,p2);
}
public static java.util.SortedMap decorateTransform(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return TransformedSortedMap.decorateTransform(p0,p1,p2);
}
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return TransformedMap.decorate(p0,p1,p2);
}
public static java.util.Map decorateTransform(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return TransformedMap.decorateTransform(p0,p1,p2);
}
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1){
return DefaultedMap.decorate(p0,p1);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1){
return LazySortedMap.decorate(p0,p1);
}
public static java.util.Iterator transformedIterator(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
return IteratorUtils.transformedIterator(p0,p1);
}
public static java.util.Iterator objectGraphIterator(java.lang.Object p0,org.apache.commons.collections.Transformer p1){
return IteratorUtils.objectGraphIterator(p0,p1);
}
public static java.util.SortedSet transformedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1){
return SetUtils.transformedSortedSet(p0,p1);
}
public static java.util.Set transformedSet(java.util.Set p0,org.apache.commons.collections.Transformer p1){
return SetUtils.transformedSet(p0,p1);
}
public static org.apache.commons.collections.Buffer transformedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1){
return BufferUtils.transformedBuffer(p0,p1);
}
public static java.util.Comparator transformedComparator(java.util.Comparator p0,org.apache.commons.collections.Transformer p1){
return ComparatorUtils.transformedComparator(p0,p1);
}
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Transformer p1){
return TransformedList.decorate(p0,p1);
}
public static org.apache.commons.collections.Closure asClosure(org.apache.commons.collections.Transformer p0){
return ClosureUtils.asClosure(p0);
}
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Transformer p1){
return TransformedSet.decorate(p0,p1);
}
public static java.util.SortedSet decorate(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1){
return TransformedSortedSet.decorate(p0,p1);
}
public static org.apache.commons.collections.Transformer getInstance(java.lang.Object p0){
return ConstantTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(java.lang.Class[] p0,java.lang.Object[] p1){
return InstantiateTransformer.getInstance(p0,p1);
}
public static org.apache.commons.collections.Transformer getInstance(java.lang.String p0){
return InvokerTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return InvokerTransformer.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Transformer p0){
return TransformerClosure.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Transformer[] p0){
return ChainedTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Transformer p1){
return ChainedTransformer.getInstance(p0,p1);
}
public static org.apache.commons.collections.Transformer getInstance(java.util.Collection p0){
return ChainedTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(java.util.Map p0){
return MapTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Predicate p0){
return PredicateTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Closure p0){
return ClosureTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(){
return CloneTransformer.getInstance();
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
return SwitchTransformer.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1){
return TransformedPredicate.getInstance(p0,p1);
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Factory p0){
return FactoryTransformer.getInstance(p0);
}
public static java.util.List transformedList(java.util.List p0,org.apache.commons.collections.Transformer p1){
return ListUtils.transformedList(p0,p1);
}
public static org.apache.commons.collections.Predicate asPredicate(org.apache.commons.collections.Transformer p0){
return PredicateUtils.asPredicate(p0);
}
public static org.apache.commons.collections.Predicate transformedPredicate(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1){
return PredicateUtils.transformedPredicate(p0,p1);
}
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1){
return TransformedBuffer.decorate(p0,p1);
}
public static <T> org.apache.commons.collections4.Transformer<T, T> asTransformer(org.apache.commons.collections4.Closure<? super T> p0){
return TransformerUtils.asTransformer(p0);
}
public static <T> org.apache.commons.collections4.Transformer<T, java.lang.Boolean> asTransformer(org.apache.commons.collections4.Predicate<? super T> p0){
return TransformerUtils.asTransformer(p0);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> asTransformer(org.apache.commons.collections4.Factory<? extends O> p0){
return TransformerUtils.asTransformer(p0);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> mapTransformer(java.util.Map<? super I, ? extends O> p0){
return TransformerUtils.mapTransformer(p0);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> invokerTransformer(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object[] p2){
return TransformerUtils.invokerTransformer(p0,p1,p2);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchTransformer(org.apache.commons.collections4.Predicate<? super I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,org.apache.commons.collections4.Transformer<? super I, ? extends O> p2){
return TransformerUtils.switchTransformer(p0,p1,p2);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchTransformer(org.apache.commons.collections4.Predicate<? super I>[] p0,org.apache.commons.collections4.Transformer<? super I, ? extends O>[] p1){
return TransformerUtils.switchTransformer(p0,p1);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchTransformer(org.apache.commons.collections4.Predicate<? super I>[] p0,org.apache.commons.collections4.Transformer<? super I, ? extends O>[] p1,org.apache.commons.collections4.Transformer<? super I, ? extends O> p2){
return TransformerUtils.switchTransformer(p0,p1,p2);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchTransformer(java.util.Map<org.apache.commons.collections4.Predicate<I>, org.apache.commons.collections4.Transformer<I, O>> p0){
return TransformerUtils.switchTransformer(p0);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchMapTransformer(java.util.Map<I, org.apache.commons.collections4.Transformer<I, O>> p0){
return TransformerUtils.switchMapTransformer(p0);
}
public static <T> org.apache.commons.collections4.Transformer<T, T> chainedTransformer(org.apache.commons.collections4.Transformer<? super T, ? extends T>... p0){
return TransformerUtils.chainedTransformer(p0);
}
public static <T> org.apache.commons.collections4.Transformer<T, T> chainedTransformer(java.util.Collection<? extends org.apache.commons.collections4.Transformer<? super T, ? extends T>> p0){
return TransformerUtils.chainedTransformer(p0);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> constantTransformer(O p0){
return TransformerUtils.constantTransformer(p0);
}
public static <T> org.apache.commons.collections4.Transformer<java.lang.Class<? extends T>, T> instantiateTransformer(java.lang.Class<?>[] p0,java.lang.Object[] p1){
return TransformerUtils.instantiateTransformer(p0,p1);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> ifTransformer(org.apache.commons.collections4.Predicate<? super I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,org.apache.commons.collections4.Transformer<? super I, ? extends O> p2){
return TransformerUtils.ifTransformer(p0,p1,p2);
}
public static <T> org.apache.commons.collections4.Transformer<T, T> ifTransformer(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Transformer<? super T, ? extends T> p1){
return TransformerUtils.ifTransformer(p0,p1);
}
public static <T> org.apache.commons.collections4.Transformer<T, java.lang.Boolean> predicateTransformer(org.apache.commons.collections4.Predicate<? super T> p0){
return PredicateTransformer.predicateTransformer(p0);
}
public static <T> org.apache.commons.collections4.Transformer<T, T> closureTransformer(org.apache.commons.collections4.Closure<? super T> p0){
return ClosureTransformer.closureTransformer(p0);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchTransformer(java.util.Map<? extends org.apache.commons.collections4.Predicate<? super I>, ? extends org.apache.commons.collections4.Transformer<? super I, ? extends O>> p0){
return SwitchTransformer.switchTransformer(p0);
}
public static <I,O> org.apache.commons.collections4.Transformer<I, O> factoryTransformer(org.apache.commons.collections4.Factory<? extends O> p0){
return FactoryTransformer.factoryTransformer(p0);
}
}
