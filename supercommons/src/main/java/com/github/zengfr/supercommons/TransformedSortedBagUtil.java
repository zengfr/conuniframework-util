package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedSortedBagUtil{ 
/**
*public static <E> org.apache.commons.collections4.bag.TransformedSortedBag<E> org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> org.apache.commons.collections4.bag.TransformedSortedBag<E> transformingSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.bag.TransformedSortedBag<E> org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> org.apache.commons.collections4.bag.TransformedSortedBag<E> transformedSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(p0,p1);
}
}
