package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ArrayListUtil{ 
/**
*public static <E> java.util.ArrayList<E> com.google.common.collect.Lists.newArrayList(E...)
*/ 
public static <E> java.util.ArrayList<E> newArrayList(E... p0){
	return com.google.common.collect.Lists.newArrayList(p0);
}
/**
*public static <E> java.util.ArrayList<E> com.google.common.collect.Lists.newArrayList()
*/ 
public static <E> java.util.ArrayList<E> newArrayList(){
	return com.google.common.collect.Lists.newArrayList();
}
/**
*public static <E> java.util.ArrayList<E> com.google.common.collect.Lists.newArrayList(java.util.Iterator<? extends E>)
*/ 
public static <E> java.util.ArrayList<E> newArrayList(java.util.Iterator<? extends E> p0){
	return com.google.common.collect.Lists.newArrayList(p0);
}
/**
*public static <E> java.util.ArrayList<E> com.google.common.collect.Lists.newArrayList(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.ArrayList<E> newArrayList(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Lists.newArrayList(p0);
}
/**
*public static <E> java.util.ArrayList<E> com.google.common.collect.Lists.newArrayListWithExpectedSize(int)
*/ 
public static <E> java.util.ArrayList<E> newArrayListWithExpectedSize(int p0){
	return com.google.common.collect.Lists.newArrayListWithExpectedSize(p0);
}
/**
*public static <E> java.util.ArrayList<E> com.google.common.collect.Lists.newArrayListWithCapacity(int)
*/ 
public static <E> java.util.ArrayList<E> newArrayListWithCapacity(int p0){
	return com.google.common.collect.Lists.newArrayListWithCapacity(p0);
}
}
