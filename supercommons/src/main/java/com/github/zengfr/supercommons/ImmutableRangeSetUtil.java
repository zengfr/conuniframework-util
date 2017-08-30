package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableRangeSetUtil{ 
/**
*public static <C> com.google.common.collect.ImmutableRangeSet<C> com.google.common.collect.ImmutableRangeSet.copyOf(com.google.common.collect.RangeSet<C>)
*/ 
public static <C extends java.lang.Comparable > com.google.common.collect.ImmutableRangeSet<C> copyOf(com.google.common.collect.RangeSet<C> p0){
	return com.google.common.collect.ImmutableRangeSet.copyOf(p0);
}
/**
*public static <C> com.google.common.collect.ImmutableRangeSet<C> com.google.common.collect.ImmutableRangeSet.of()
*/ 
public static <C extends java.lang.Comparable > com.google.common.collect.ImmutableRangeSet<C> of(){
	return com.google.common.collect.ImmutableRangeSet.of();
}
/**
*public static <C> com.google.common.collect.ImmutableRangeSet<C> com.google.common.collect.ImmutableRangeSet.of(com.google.common.collect.Range<C>)
*/ 
public static <C extends java.lang.Comparable > com.google.common.collect.ImmutableRangeSet<C> of(com.google.common.collect.Range<C> p0){
	return com.google.common.collect.ImmutableRangeSet.of(p0);
}
}
