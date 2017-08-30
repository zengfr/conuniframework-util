package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class InternerUtil{ 
/**
*public static <E> com.google.common.collect.Interner<E> com.google.common.collect.Interners.newWeakInterner()
*/ 
public static <E> com.google.common.collect.Interner<E> newWeakInterner(){
	return com.google.common.collect.Interners.newWeakInterner();
}
/**
*public static <E> com.google.common.collect.Interner<E> com.google.common.collect.Interners.newStrongInterner()
*/ 
public static <E> com.google.common.collect.Interner<E> newStrongInterner(){
	return com.google.common.collect.Interners.newStrongInterner();
}
}
