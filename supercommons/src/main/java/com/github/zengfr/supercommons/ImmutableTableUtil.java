package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableTableUtil{ 
/**
*public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> com.google.common.collect.ImmutableTable.copyOf(com.google.common.collect.Table<? extends R, ? extends C, ? extends V>)
*/ 
public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> copyOf(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> p0){
	return com.google.common.collect.ImmutableTable.copyOf(p0);
}
/**
*public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> com.google.common.collect.ImmutableTable.of(R,C,V)
*/ 
public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> of(R p0,C p1,V p2){
	return com.google.common.collect.ImmutableTable.of(p0,p1,p2);
}
/**
*public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> com.google.common.collect.ImmutableTable.of()
*/ 
public static <R,C,V> com.google.common.collect.ImmutableTable<R, C, V> of(){
	return com.google.common.collect.ImmutableTable.of();
}
}
