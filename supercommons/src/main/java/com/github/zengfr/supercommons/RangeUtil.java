package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RangeUtil{ 
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.all()
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> all(){
	return com.google.common.collect.Range.all();
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.singleton(C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> singleton(C p0){
	return com.google.common.collect.Range.singleton(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.range(C,com.google.common.collect.BoundType,C,com.google.common.collect.BoundType)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> range(C p0,com.google.common.collect.BoundType p1,C p2,com.google.common.collect.BoundType p3){
	return com.google.common.collect.Range.range(p0,p1,p2,p3);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.closed(C,C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> closed(C p0,C p1){
	return com.google.common.collect.Range.closed(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.open(C,C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> open(C p0,C p1){
	return com.google.common.collect.Range.open(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.atLeast(C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> atLeast(C p0){
	return com.google.common.collect.Range.atLeast(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.atMost(C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> atMost(C p0){
	return com.google.common.collect.Range.atMost(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.upTo(C,com.google.common.collect.BoundType)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> upTo(C p0,com.google.common.collect.BoundType p1){
	return com.google.common.collect.Range.upTo(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.greaterThan(C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> greaterThan(C p0){
	return com.google.common.collect.Range.greaterThan(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.lessThan(C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> lessThan(C p0){
	return com.google.common.collect.Range.lessThan(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.downTo(C,com.google.common.collect.BoundType)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> downTo(C p0,com.google.common.collect.BoundType p1){
	return com.google.common.collect.Range.downTo(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.openClosed(C,C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> openClosed(C p0,C p1){
	return com.google.common.collect.Range.openClosed(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.closedOpen(C,C)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> closedOpen(C p0,C p1){
	return com.google.common.collect.Range.closedOpen(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.encloseAll(java.lang.Iterable<C>)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> encloseAll(java.lang.Iterable<C> p0){
	return com.google.common.collect.Range.encloseAll(p0);
}
/**
*public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.is(T)
*/ 
public static <T extends java.lang.Comparable<T> > org.apache.commons.lang3.Range<T> is(T p0){
	return org.apache.commons.lang3.Range.is(p0);
}
/**
*public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.is(T,java.util.Comparator<T>)
*/ 
public static <T> org.apache.commons.lang3.Range<T> is(T p0,java.util.Comparator<T> p1){
	return org.apache.commons.lang3.Range.is(p0,p1);
}
/**
*public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.between(T,T)
*/ 
public static <T extends java.lang.Comparable<T> > org.apache.commons.lang3.Range<T> between(T p0,T p1){
	return org.apache.commons.lang3.Range.between(p0,p1);
}
/**
*public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.between(T,T,java.util.Comparator<T>)
*/ 
public static <T> org.apache.commons.lang3.Range<T> between(T p0,T p1,java.util.Comparator<T> p2){
	return org.apache.commons.lang3.Range.between(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.util.IntegerSequence$Range org.apache.commons.math3.util.IntegerSequence.range(int,int)
*/ 
public static Range range(int p0,int p1){
	return org.apache.commons.math3.util.IntegerSequence.range(p0,p1);
}
/**
*public static org.apache.commons.math3.util.IntegerSequence$Range org.apache.commons.math3.util.IntegerSequence.range(int,int,int)
*/ 
public static Range range(int p0,int p1,int p2){
	return org.apache.commons.math3.util.IntegerSequence.range(p0,p1,p2);
}
}
