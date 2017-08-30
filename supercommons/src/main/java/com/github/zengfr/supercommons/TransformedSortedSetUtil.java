package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedSortedSetUtil{ 
/**
*public static <E> org.apache.commons.collections4.set.TransformedSortedSet<E> org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> org.apache.commons.collections4.set.TransformedSortedSet<E> transformedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.set.TransformedSortedSet<E> org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> org.apache.commons.collections4.set.TransformedSortedSet<E> transformingSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(p0,p1);
}
}
