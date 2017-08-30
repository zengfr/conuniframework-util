package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeMultisetUtil{ 
/**
*public static <E> com.google.common.collect.TreeMultiset<E> com.google.common.collect.TreeMultiset.create()
*/ 
public static <E extends java.lang.Comparable > com.google.common.collect.TreeMultiset<E> create(){
	return com.google.common.collect.TreeMultiset.create();
}
/**
*public static <E> com.google.common.collect.TreeMultiset<E> com.google.common.collect.TreeMultiset.create(java.lang.Iterable<? extends E>)
*/ 
public static <E extends java.lang.Comparable > com.google.common.collect.TreeMultiset<E> create(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.TreeMultiset.create(p0);
}
/**
*public static <E> com.google.common.collect.TreeMultiset<E> com.google.common.collect.TreeMultiset.create(java.util.Comparator<? super E>)
*/ 
public static <E> com.google.common.collect.TreeMultiset<E> create(java.util.Comparator<? super E> p0){
	return com.google.common.collect.TreeMultiset.create(p0);
}
}
