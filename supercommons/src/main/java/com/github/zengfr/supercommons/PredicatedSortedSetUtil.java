package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedSortedSetUtil{ 
/**
*public static <E> org.apache.commons.collections4.set.PredicatedSortedSet<E> org.apache.commons.collections4.set.PredicatedSortedSet.predicatedSortedSet(java.util.SortedSet<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> org.apache.commons.collections4.set.PredicatedSortedSet<E> predicatedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.set.PredicatedSortedSet.predicatedSortedSet(p0,p1);
}
}
