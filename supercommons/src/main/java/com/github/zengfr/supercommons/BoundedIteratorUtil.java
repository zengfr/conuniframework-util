package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BoundedIteratorUtil{ 
/**
*public static <E> org.apache.commons.collections4.iterators.BoundedIterator<E> org.apache.commons.collections4.IteratorUtils.boundedIterator(java.util.Iterator<? extends E>,long)
*/ 
public static <E> org.apache.commons.collections4.iterators.BoundedIterator<E> boundedIterator(java.util.Iterator<? extends E> p0,long p1){
	return org.apache.commons.collections4.IteratorUtils.boundedIterator(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.iterators.BoundedIterator<E> org.apache.commons.collections4.IteratorUtils.boundedIterator(java.util.Iterator<? extends E>,long,long)
*/ 
public static <E> org.apache.commons.collections4.iterators.BoundedIterator<E> boundedIterator(java.util.Iterator<? extends E> p0,long p1,long p2){
	return org.apache.commons.collections4.IteratorUtils.boundedIterator(p0,p1,p2);
}
}
