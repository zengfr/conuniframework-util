package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComparableUtil{ 
/**
*public static int org.apache.commons.lang.ObjectUtils.compare(java.lang.Comparable,java.lang.Comparable)
*/ 
public static int compare(java.lang.Comparable p0,java.lang.Comparable p1){
	return org.apache.commons.lang.ObjectUtils.compare(p0,p1);
}
/**
*public static int org.apache.commons.lang.ObjectUtils.compare(java.lang.Comparable,java.lang.Comparable,boolean)
*/ 
public static int compare(java.lang.Comparable p0,java.lang.Comparable p1,boolean p2){
	return org.apache.commons.lang.ObjectUtils.compare(p0,p1,p2);
}
/**
*public static <T> T org.apache.commons.lang3.ObjectUtils.max(T...)
*/ 
public static <T extends java.lang.Comparable<? super T> > T max(T... p0){
	return org.apache.commons.lang3.ObjectUtils.max(p0);
}
/**
*public static java.lang.Object org.apache.commons.lang.ObjectUtils.max(java.lang.Comparable,java.lang.Comparable)
*/ 
public static java.lang.Object max(java.lang.Comparable p0,java.lang.Comparable p1){
	return org.apache.commons.lang.ObjectUtils.max(p0,p1);
}
/**
*public static <T> T org.apache.commons.lang3.ObjectUtils.median(T...)
*/ 
public static <T extends java.lang.Comparable<? super T> > T median(T... p0){
	return org.apache.commons.lang3.ObjectUtils.median(p0);
}
/**
*public static <T> T org.apache.commons.lang3.ObjectUtils.min(T...)
*/ 
public static <T extends java.lang.Comparable<? super T> > T min(T... p0){
	return org.apache.commons.lang3.ObjectUtils.min(p0);
}
/**
*public static java.lang.Object org.apache.commons.lang.ObjectUtils.min(java.lang.Comparable,java.lang.Comparable)
*/ 
public static java.lang.Object min(java.lang.Comparable p0,java.lang.Comparable p1){
	return org.apache.commons.lang.ObjectUtils.min(p0,p1);
}
}
