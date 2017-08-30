package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedSortedBagUtil{ 
/**
*public static <E> org.apache.commons.collections4.bag.PredicatedSortedBag<E> org.apache.commons.collections4.bag.PredicatedSortedBag.predicatedSortedBag(org.apache.commons.collections4.SortedBag<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> org.apache.commons.collections4.bag.PredicatedSortedBag<E> predicatedSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.bag.PredicatedSortedBag.predicatedSortedBag(p0,p1);
}
}
