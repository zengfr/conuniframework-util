package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedNavigableSetUtil{ 
/**
*public static <E> org.apache.commons.collections4.set.PredicatedNavigableSet<E> org.apache.commons.collections4.set.PredicatedNavigableSet.predicatedNavigableSet(java.util.NavigableSet<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> org.apache.commons.collections4.set.PredicatedNavigableSet<E> predicatedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.set.PredicatedNavigableSet.predicatedNavigableSet(p0,p1);
}
}
