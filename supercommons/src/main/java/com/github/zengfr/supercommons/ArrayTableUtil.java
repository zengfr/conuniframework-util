package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ArrayTableUtil{ 
/**
*public static <R,C,V> com.google.common.collect.ArrayTable<R, C, V> com.google.common.collect.ArrayTable.create(java.lang.Iterable<? extends R>,java.lang.Iterable<? extends C>)
*/ 
public static <R,C,V> com.google.common.collect.ArrayTable<R, C, V> create(java.lang.Iterable<? extends R> p0,java.lang.Iterable<? extends C> p1){
	return com.google.common.collect.ArrayTable.create(p0,p1);
}
/**
*public static <R,C,V> com.google.common.collect.ArrayTable<R, C, V> com.google.common.collect.ArrayTable.create(com.google.common.collect.Table<R, C, V>)
*/ 
public static <R,C,V> com.google.common.collect.ArrayTable<R, C, V> create(com.google.common.collect.Table<R, C, V> p0){
	return com.google.common.collect.ArrayTable.create(p0);
}
}
