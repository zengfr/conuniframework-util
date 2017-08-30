package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumSetUtil{ 
/**
*public static <E> java.util.EnumSet<E> com.google.common.collect.Sets.complementOf(java.util.Collection<E>)
*/ 
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> complementOf(java.util.Collection<E> p0){
	return com.google.common.collect.Sets.complementOf(p0);
}
/**
*public static <E> java.util.EnumSet<E> com.google.common.collect.Sets.complementOf(java.util.Collection<E>,java.lang.Class<E>)
*/ 
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> complementOf(java.util.Collection<E> p0,java.lang.Class<E> p1){
	return com.google.common.collect.Sets.complementOf(p0,p1);
}
/**
*public static <E> java.util.EnumSet<E> com.google.common.collect.Sets.newEnumSet(java.lang.Iterable<E>,java.lang.Class<E>)
*/ 
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> newEnumSet(java.lang.Iterable<E> p0,java.lang.Class<E> p1){
	return com.google.common.collect.Sets.newEnumSet(p0,p1);
}
/**
*public static <E> java.util.EnumSet<E> org.apache.commons.lang3.EnumUtils.processBitVector(java.lang.Class<E>,long)
*/ 
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> processBitVector(java.lang.Class<E> p0,long p1){
	return org.apache.commons.lang3.EnumUtils.processBitVector(p0,p1);
}
/**
*public static <E> java.util.EnumSet<E> org.apache.commons.lang3.EnumUtils.processBitVectors(java.lang.Class<E>,long...)
*/ 
public static <E extends java.lang.Enum<E> > java.util.EnumSet<E> processBitVectors(java.lang.Class<E> p0,long... p1){
	return org.apache.commons.lang3.EnumUtils.processBitVectors(p0,p1);
}
}
