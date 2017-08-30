package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PeekingIteratorUtil{ 
/**
*public static <T> com.google.common.collect.PeekingIterator<T> com.google.common.collect.Iterators.peekingIterator(java.util.Iterator<? extends T>)
*/ 
public static <T> com.google.common.collect.PeekingIterator<T> peekingIterator(java.util.Iterator<? extends T> p0){
	return com.google.common.collect.Iterators.peekingIterator(p0);
}
/**
*public static <T> com.google.common.collect.PeekingIterator<T> com.google.common.collect.Iterators.peekingIterator(com.google.common.collect.PeekingIterator<T>)
*/ 
public static <T> com.google.common.collect.PeekingIterator<T> peekingIterator(com.google.common.collect.PeekingIterator<T> p0){
	return com.google.common.collect.Iterators.peekingIterator(p0);
}
/**
*public static <E> org.apache.commons.collections4.iterators.PeekingIterator<E> org.apache.commons.collections4.iterators.PeekingIterator.peekingIterator(java.util.Iterator<? extends E>)
*/ 
public static <E> org.apache.commons.collections4.iterators.PeekingIterator<E> peekingIterator(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.iterators.PeekingIterator.peekingIterator(p0);
}
}
