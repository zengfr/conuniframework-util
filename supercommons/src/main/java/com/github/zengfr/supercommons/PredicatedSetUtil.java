package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedSetUtil{ 
/**
*public static <E> org.apache.commons.collections4.set.PredicatedSet<E> org.apache.commons.collections4.set.PredicatedSet.predicatedSet(java.util.Set<E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> org.apache.commons.collections4.set.PredicatedSet<E> predicatedSet(java.util.Set<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.set.PredicatedSet.predicatedSet(p0,p1);
}
}
