package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedBagUtil{ 
/**
*public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.bag.CollectionSortedBag.collectionSortedBag(org.apache.commons.collections4.SortedBag<E>)
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> collectionSortedBag(org.apache.commons.collections4.SortedBag<E> p0){
	return org.apache.commons.collections4.bag.CollectionSortedBag.collectionSortedBag(p0);
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.TransformedSortedBag.decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.bag.TransformedSortedBag.decorate(p0,p1);
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.SynchronizedSortedBag.decorate(org.apache.commons.collections.SortedBag)
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0){
	return org.apache.commons.collections.bag.SynchronizedSortedBag.decorate(p0);
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.TypedSortedBag.decorate(org.apache.commons.collections.SortedBag,java.lang.Class)
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,java.lang.Class p1){
	return org.apache.commons.collections.bag.TypedSortedBag.decorate(p0,p1);
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.PredicatedSortedBag.decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.bag.PredicatedSortedBag.decorate(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.BagUtils.emptySortedBag()
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> emptySortedBag(){
	return org.apache.commons.collections4.BagUtils.emptySortedBag();
}
/**
*public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.BagUtils.predicatedSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> predicatedSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.BagUtils.predicatedSortedBag(p0,p1);
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.predicatedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Predicate)
*/ 
public static org.apache.commons.collections.SortedBag predicatedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.BagUtils.predicatedSortedBag(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.BagUtils.synchronizedSortedBag(org.apache.commons.collections4.SortedBag<E>)
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> synchronizedSortedBag(org.apache.commons.collections4.SortedBag<E> p0){
	return org.apache.commons.collections4.BagUtils.synchronizedSortedBag(p0);
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.synchronizedSortedBag(org.apache.commons.collections.SortedBag)
*/ 
public static org.apache.commons.collections.SortedBag synchronizedSortedBag(org.apache.commons.collections.SortedBag p0){
	return org.apache.commons.collections.BagUtils.synchronizedSortedBag(p0);
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.transformedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.SortedBag transformedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.BagUtils.transformedSortedBag(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.BagUtils.transformingSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> transformingSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.BagUtils.transformingSortedBag(p0,p1);
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.typedSortedBag(org.apache.commons.collections.SortedBag,java.lang.Class)
*/ 
public static org.apache.commons.collections.SortedBag typedSortedBag(org.apache.commons.collections.SortedBag p0,java.lang.Class p1){
	return org.apache.commons.collections.BagUtils.typedSortedBag(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.SortedBag<E> org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(org.apache.commons.collections4.SortedBag<E>)
*/ 
public static <E> org.apache.commons.collections4.SortedBag<E> unmodifiableSortedBag(org.apache.commons.collections4.SortedBag<E> p0){
	return org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(p0);
}
/**
*public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.unmodifiableSortedBag(org.apache.commons.collections.SortedBag)
*/ 
public static org.apache.commons.collections.SortedBag unmodifiableSortedBag(org.apache.commons.collections.SortedBag p0){
	return org.apache.commons.collections.BagUtils.unmodifiableSortedBag(p0);
}
}
