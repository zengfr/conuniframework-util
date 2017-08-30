package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashBasedTableUtil{ 
/**
*public static <R,C,V> com.google.common.collect.HashBasedTable<R, C, V> com.google.common.collect.HashBasedTable.create(com.google.common.collect.Table<? extends R, ? extends C, ? extends V>)
*/ 
public static <R,C,V> com.google.common.collect.HashBasedTable<R, C, V> create(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> p0){
	return com.google.common.collect.HashBasedTable.create(p0);
}
/**
*public static <R,C,V> com.google.common.collect.HashBasedTable<R, C, V> com.google.common.collect.HashBasedTable.create(int,int)
*/ 
public static <R,C,V> com.google.common.collect.HashBasedTable<R, C, V> create(int p0,int p1){
	return com.google.common.collect.HashBasedTable.create(p0,p1);
}
/**
*public static <R,C,V> com.google.common.collect.HashBasedTable<R, C, V> com.google.common.collect.HashBasedTable.create()
*/ 
public static <R,C,V> com.google.common.collect.HashBasedTable<R, C, V> create(){
	return com.google.common.collect.HashBasedTable.create();
}
}
