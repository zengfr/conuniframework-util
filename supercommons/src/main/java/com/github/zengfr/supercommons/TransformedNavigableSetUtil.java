package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedNavigableSetUtil{ 
/**
*public static <E> org.apache.commons.collections4.set.TransformedNavigableSet<E> org.apache.commons.collections4.set.TransformedNavigableSet.transformedNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> org.apache.commons.collections4.set.TransformedNavigableSet<E> transformedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.set.TransformedNavigableSet.transformedNavigableSet(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.set.TransformedNavigableSet<E> org.apache.commons.collections4.set.TransformedNavigableSet.transformingNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> org.apache.commons.collections4.set.TransformedNavigableSet<E> transformingNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.set.TransformedNavigableSet.transformingNavigableSet(p0,p1);
}
}
