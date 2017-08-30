package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MUtil{ 
/**
*public static <K,V,M> M com.google.common.collect.Multimaps.invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K>,M)
*/ 
public static <K,V,M extends com.google.common.collect.Multimap<K, V> > M invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K> p0,M p1){
	return com.google.common.collect.Multimaps.invertFrom(p0,p1);
}
/**
*public static <L,M,R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> org.apache.commons.lang3.tuple.ImmutableTriple.of(L,M,R)
*/ 
public static <L,M,R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> of(L p0,M p1,R p2){
	return org.apache.commons.lang3.tuple.ImmutableTriple.of(p0,p1,p2);
}
}
