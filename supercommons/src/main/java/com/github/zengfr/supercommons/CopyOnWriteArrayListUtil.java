package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CopyOnWriteArrayListUtil{ 
/**
*public static <E> java.util.concurrent.CopyOnWriteArrayList<E> com.google.common.collect.Lists.newCopyOnWriteArrayList(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Lists.newCopyOnWriteArrayList(p0);
}
/**
*public static <E> java.util.concurrent.CopyOnWriteArrayList<E> com.google.common.collect.Lists.newCopyOnWriteArrayList()
*/ 
public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList(){
	return com.google.common.collect.Lists.newCopyOnWriteArrayList();
}
}
