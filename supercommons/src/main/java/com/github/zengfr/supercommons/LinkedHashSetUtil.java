package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedHashSetUtil{ 
/**
*public static <E> java.util.LinkedHashSet<E> com.google.common.collect.Sets.newLinkedHashSet(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.LinkedHashSet<E> newLinkedHashSet(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Sets.newLinkedHashSet(p0);
}
/**
*public static <E> java.util.LinkedHashSet<E> com.google.common.collect.Sets.newLinkedHashSet()
*/ 
public static <E> java.util.LinkedHashSet<E> newLinkedHashSet(){
	return com.google.common.collect.Sets.newLinkedHashSet();
}
/**
*public static <E> java.util.LinkedHashSet<E> com.google.common.collect.Sets.newLinkedHashSetWithExpectedSize(int)
*/ 
public static <E> java.util.LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int p0){
	return com.google.common.collect.Sets.newLinkedHashSetWithExpectedSize(p0);
}
}
