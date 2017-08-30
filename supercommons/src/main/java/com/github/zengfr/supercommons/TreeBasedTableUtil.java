package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeBasedTableUtil{ 
/**
*public static <R,C,V> com.google.common.collect.TreeBasedTable<R, C, V> com.google.common.collect.TreeBasedTable.create()
*/ 
public static <R extends java.lang.Comparable ,C extends java.lang.Comparable ,V> com.google.common.collect.TreeBasedTable<R, C, V> create(){
	return com.google.common.collect.TreeBasedTable.create();
}
/**
*public static <R,C,V> com.google.common.collect.TreeBasedTable<R, C, V> com.google.common.collect.TreeBasedTable.create(com.google.common.collect.TreeBasedTable<R, C, ? extends V>)
*/ 
public static <R,C,V> com.google.common.collect.TreeBasedTable<R, C, V> create(com.google.common.collect.TreeBasedTable<R, C, ? extends V> p0){
	return com.google.common.collect.TreeBasedTable.create(p0);
}
/**
*public static <R,C,V> com.google.common.collect.TreeBasedTable<R, C, V> com.google.common.collect.TreeBasedTable.create(java.util.Comparator<? super R>,java.util.Comparator<? super C>)
*/ 
public static <R,C,V> com.google.common.collect.TreeBasedTable<R, C, V> create(java.util.Comparator<? super R> p0,java.util.Comparator<? super C> p1){
	return com.google.common.collect.TreeBasedTable.create(p0,p1);
}
}
