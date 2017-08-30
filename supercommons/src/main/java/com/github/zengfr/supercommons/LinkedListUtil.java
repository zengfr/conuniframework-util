package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedListUtil{ 
/**
*public static <E> java.util.LinkedList<E> com.google.common.collect.Lists.newLinkedList()
*/ 
public static <E> java.util.LinkedList<E> newLinkedList(){
	return com.google.common.collect.Lists.newLinkedList();
}
/**
*public static <E> java.util.LinkedList<E> com.google.common.collect.Lists.newLinkedList(java.lang.Iterable<? extends E>)
*/ 
public static <E> java.util.LinkedList<E> newLinkedList(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.Lists.newLinkedList(p0);
}
}
