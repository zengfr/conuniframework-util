package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SetViewUtil{ 
/**
*public static <E> com.google.common.collect.Sets.com.google.common.collect.Sets$SetView<E> com.google.common.collect.Sets.difference(java.util.Set<E>,java.util.Set<?>)
*/ 
public static <E> SetView<E> difference(java.util.Set<E> p0,java.util.Set<?> p1){
	return com.google.common.collect.Sets.difference(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.SetUtils.org.apache.commons.collections4.SetUtils$SetView<E> org.apache.commons.collections4.SetUtils.difference(java.util.Set<? extends E>,java.util.Set<? extends E>)
*/ 
public static <E> SetView<E> difference(java.util.Set<? extends E> p0,java.util.Set<? extends E> p1){
	return org.apache.commons.collections4.SetUtils.difference(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.SetUtils.org.apache.commons.collections4.SetUtils$SetView<E> org.apache.commons.collections4.SetUtils.disjunction(java.util.Set<? extends E>,java.util.Set<? extends E>)
*/ 
public static <E> SetView<E> disjunction(java.util.Set<? extends E> p0,java.util.Set<? extends E> p1){
	return org.apache.commons.collections4.SetUtils.disjunction(p0,p1);
}
/**
*public static <E> com.google.common.collect.Sets.com.google.common.collect.Sets$SetView<E> com.google.common.collect.Sets.intersection(java.util.Set<E>,java.util.Set<?>)
*/ 
public static <E> SetView<E> intersection(java.util.Set<E> p0,java.util.Set<?> p1){
	return com.google.common.collect.Sets.intersection(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.SetUtils.org.apache.commons.collections4.SetUtils$SetView<E> org.apache.commons.collections4.SetUtils.intersection(java.util.Set<? extends E>,java.util.Set<? extends E>)
*/ 
public static <E> SetView<E> intersection(java.util.Set<? extends E> p0,java.util.Set<? extends E> p1){
	return org.apache.commons.collections4.SetUtils.intersection(p0,p1);
}
/**
*public static <E> com.google.common.collect.Sets.com.google.common.collect.Sets$SetView<E> com.google.common.collect.Sets.symmetricDifference(java.util.Set<? extends E>,java.util.Set<? extends E>)
*/ 
public static <E> SetView<E> symmetricDifference(java.util.Set<? extends E> p0,java.util.Set<? extends E> p1){
	return com.google.common.collect.Sets.symmetricDifference(p0,p1);
}
/**
*public static <E> com.google.common.collect.Sets.com.google.common.collect.Sets$SetView<E> com.google.common.collect.Sets.union(java.util.Set<? extends E>,java.util.Set<? extends E>)
*/ 
public static <E> SetView<E> union(java.util.Set<? extends E> p0,java.util.Set<? extends E> p1){
	return com.google.common.collect.Sets.union(p0,p1);
}
}
