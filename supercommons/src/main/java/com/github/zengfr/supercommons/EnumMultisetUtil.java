package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumMultisetUtil{ 
/**
*public static <E> com.google.common.collect.EnumMultiset<E> com.google.common.collect.EnumMultiset.create(java.lang.Iterable<E>,java.lang.Class<E>)
*/ 
public static <E extends java.lang.Enum<E> > com.google.common.collect.EnumMultiset<E> create(java.lang.Iterable<E> p0,java.lang.Class<E> p1){
	return com.google.common.collect.EnumMultiset.create(p0,p1);
}
/**
*public static <E> com.google.common.collect.EnumMultiset<E> com.google.common.collect.EnumMultiset.create(java.lang.Iterable<E>)
*/ 
public static <E extends java.lang.Enum<E> > com.google.common.collect.EnumMultiset<E> create(java.lang.Iterable<E> p0){
	return com.google.common.collect.EnumMultiset.create(p0);
}
/**
*public static <E> com.google.common.collect.EnumMultiset<E> com.google.common.collect.EnumMultiset.create(java.lang.Class<E>)
*/ 
public static <E extends java.lang.Enum<E> > com.google.common.collect.EnumMultiset<E> create(java.lang.Class<E> p0){
	return com.google.common.collect.EnumMultiset.create(p0);
}
}
