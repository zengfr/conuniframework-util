package com.github.zengfr.supercommons;
import org.apache.commons.collections.BagUtils;
import org.apache.commons.collections.bag.TransformedSortedBag;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.commons.collections.bag.UnmodifiableSortedBag;
import org.apache.commons.collections.bag.TypedSortedBag;
import org.apache.commons.collections.bag.PredicatedSortedBag;
import org.apache.commons.collections4.BagUtils;
import org.apache.commons.collections4.bag.CollectionSortedBag;
import org.apache.commons.collections4.bag.UnmodifiableSortedBag;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedBagUtil{ 
public static org.apache.commons.collections.SortedBag typedSortedBag(org.apache.commons.collections.SortedBag p0,java.lang.Class p1){
return BagUtils.typedSortedBag(p0,p1);
}
public static org.apache.commons.collections.SortedBag transformedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1){
return BagUtils.transformedSortedBag(p0,p1);
}
public static org.apache.commons.collections.SortedBag predicatedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1){
return BagUtils.predicatedSortedBag(p0,p1);
}
public static org.apache.commons.collections.SortedBag synchronizedSortedBag(org.apache.commons.collections.SortedBag p0){
return BagUtils.synchronizedSortedBag(p0);
}
public static org.apache.commons.collections.SortedBag unmodifiableSortedBag(org.apache.commons.collections.SortedBag p0){
return BagUtils.unmodifiableSortedBag(p0);
}
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1){
return TransformedSortedBag.decorate(p0,p1);
}
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0){
return SynchronizedSortedBag.decorate(p0);
}
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,java.lang.Class p1){
return TypedSortedBag.decorate(p0,p1);
}
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1){
return PredicatedSortedBag.decorate(p0,p1);
}
public static <E> org.apache.commons.collections4.SortedBag<E> predicatedSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return BagUtils.predicatedSortedBag(p0,p1);
}
public static <E> org.apache.commons.collections4.SortedBag<E> synchronizedSortedBag(org.apache.commons.collections4.SortedBag<E> p0){
return BagUtils.synchronizedSortedBag(p0);
}
public static <E> org.apache.commons.collections4.SortedBag<E> unmodifiableSortedBag(org.apache.commons.collections4.SortedBag<E> p0){
return BagUtils.unmodifiableSortedBag(p0);
}
public static <E> org.apache.commons.collections4.SortedBag<E> emptySortedBag(){
return BagUtils.emptySortedBag();
}
public static <E> org.apache.commons.collections4.SortedBag<E> transformingSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return BagUtils.transformingSortedBag(p0,p1);
}
public static <E> org.apache.commons.collections4.SortedBag<E> collectionSortedBag(org.apache.commons.collections4.SortedBag<E> p0){
return CollectionSortedBag.collectionSortedBag(p0);
}
}
