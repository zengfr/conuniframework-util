package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashSetUtil{ 
/**
*public static <E> java.util.HashSet<E> com.google.common.collect.Sets.newHashSet(java.util.Iterator<? extends E>)
*/ 
public static <E> java.util.HashSet<E> newHashSet(java.util.Iterator<? extends E> p0){
	return com.google.common.collect.Sets.newHashSet(p0);
}
/**
*public static <E> java.util.HashSet<E> com.google.common.collect.Sets.newHashSet(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.HashSet<E> newHashSet(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Sets.newHashSet(p0);
}
/**
*public static <E> java.util.HashSet<E> com.google.common.collect.Sets.newHashSet()
*/ 
public static <E> java.util.HashSet<E> newHashSet(){
	return com.google.common.collect.Sets.newHashSet();
}
/**
*public static <E> java.util.HashSet<E> com.google.common.collect.Sets.newHashSet(E...)
*/ 
public static <E> java.util.HashSet<E> newHashSet(E... p0){
	return com.google.common.collect.Sets.newHashSet(p0);
}
/**
*public static <E> java.util.HashSet<E> com.google.common.collect.Sets.newHashSetWithExpectedSize(int)
*/ 
public static <E> java.util.HashSet<E> newHashSetWithExpectedSize(int p0){
	return com.google.common.collect.Sets.newHashSetWithExpectedSize(p0);
}
}
