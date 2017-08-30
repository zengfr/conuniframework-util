package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ZippingIteratorUtil{ 
/**
*public static <E> org.apache.commons.collections4.iterators.ZippingIterator<E> org.apache.commons.collections4.IteratorUtils.zippingIterator(java.util.Iterator<? extends E>...)
*/ 
public static <E> org.apache.commons.collections4.iterators.ZippingIterator<E> zippingIterator(java.util.Iterator<? extends E>... p0){
	return org.apache.commons.collections4.IteratorUtils.zippingIterator(p0);
}
/**
*public static <E> org.apache.commons.collections4.iterators.ZippingIterator<E> org.apache.commons.collections4.IteratorUtils.zippingIterator(java.util.Iterator<? extends E>,java.util.Iterator<? extends E>)
*/ 
public static <E> org.apache.commons.collections4.iterators.ZippingIterator<E> zippingIterator(java.util.Iterator<? extends E> p0,java.util.Iterator<? extends E> p1){
	return org.apache.commons.collections4.IteratorUtils.zippingIterator(p0,p1);
}
/**
*public static <E> org.apache.commons.collections4.iterators.ZippingIterator<E> org.apache.commons.collections4.IteratorUtils.zippingIterator(java.util.Iterator<? extends E>,java.util.Iterator<? extends E>,java.util.Iterator<? extends E>)
*/ 
public static <E> org.apache.commons.collections4.iterators.ZippingIterator<E> zippingIterator(java.util.Iterator<? extends E> p0,java.util.Iterator<? extends E> p1,java.util.Iterator<? extends E> p2){
	return org.apache.commons.collections4.IteratorUtils.zippingIterator(p0,p1,p2);
}
}
