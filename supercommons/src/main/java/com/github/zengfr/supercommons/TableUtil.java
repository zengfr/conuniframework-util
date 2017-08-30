package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TableUtil{ 
/**
*public static <R,C,V> com.google.common.collect.Table<R, C, V> com.google.common.collect.Tables.unmodifiableTable(com.google.common.collect.Table<? extends R, ? extends C, ? extends V>)
*/ 
public static <R,C,V> com.google.common.collect.Table<R, C, V> unmodifiableTable(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> p0){
	return com.google.common.collect.Tables.unmodifiableTable(p0);
}
/**
*public static <R,C,V1,V2> com.google.common.collect.Table<R, C, V2> com.google.common.collect.Tables.transformValues(com.google.common.collect.Table<R, C, V1>,com.google.common.base.Function<? super V1, V2>)
*/ 
public static <R,C,V1,V2> com.google.common.collect.Table<R, C, V2> transformValues(com.google.common.collect.Table<R, C, V1> p0,com.google.common.base.Function<? super V1, V2> p1){
	return com.google.common.collect.Tables.transformValues(p0,p1);
}
/**
*public static <R,C,V> com.google.common.collect.Table<C, R, V> com.google.common.collect.Tables.transpose(com.google.common.collect.Table<R, C, V>)
*/ 
public static <R,C,V> com.google.common.collect.Table<C, R, V> transpose(com.google.common.collect.Table<R, C, V> p0){
	return com.google.common.collect.Tables.transpose(p0);
}
/**
*public static <R,C,V> com.google.common.collect.Table<R, C, V> com.google.common.collect.Tables.newCustomTable(java.util.Map<R, java.util.Map<C, V>>,com.google.common.base.Supplier<? extends java.util.Map<C, V>>)
*/ 
public static <R,C,V> com.google.common.collect.Table<R, C, V> newCustomTable(java.util.Map<R, java.util.Map<C, V>> p0,com.google.common.base.Supplier<? extends java.util.Map<C, V>> p1){
	return com.google.common.collect.Tables.newCustomTable(p0,p1);
}
}
