package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CopyOnWriteArraySetUtil{ 
/**
*public static <E> java.util.concurrent.CopyOnWriteArraySet<E> com.google.common.collect.Sets.newCopyOnWriteArraySet()
*/ 
public static <E> java.util.concurrent.CopyOnWriteArraySet<E> newCopyOnWriteArraySet(){
	return com.google.common.collect.Sets.newCopyOnWriteArraySet();
}
/**
*public static <E> java.util.concurrent.CopyOnWriteArraySet<E> com.google.common.collect.Sets.newCopyOnWriteArraySet(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.concurrent.CopyOnWriteArraySet<E> newCopyOnWriteArraySet(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Sets.newCopyOnWriteArraySet(p0);
}
}
