package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LUtil{ 
/**
*public static <L,R> org.apache.commons.lang3.tuple.Pair<L, R> org.apache.commons.lang3.tuple.Pair.of(L,R)
*/ 
public static <L,R> org.apache.commons.lang3.tuple.Pair<L, R> of(L p0,R p1){
	return org.apache.commons.lang3.tuple.Pair.of(p0,p1);
}
/**
*public static <L> void org.apache.commons.lang3.event.EventUtils.addEventListener(java.lang.Object,java.lang.Class<L>,L)
*/ 
public static <L> void addEventListener(java.lang.Object p0,java.lang.Class<L> p1,L p2){
	 org.apache.commons.lang3.event.EventUtils.addEventListener(p0,p1,p2);
}
/**
*public static <L,M,R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> org.apache.commons.lang3.tuple.ImmutableTriple.of(L,M,R)
*/ 
public static <L,M,R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> of(L p0,M p1,R p2){
	return org.apache.commons.lang3.tuple.ImmutableTriple.of(p0,p1,p2);
}
}
