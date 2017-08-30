package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComparableComparatorUtil{ 
/**
*public static <E> org.apache.commons.collections4.comparators.ComparableComparator<E> org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator()
*/ 
public static <E extends java.lang.Comparable<? super E> > org.apache.commons.collections4.comparators.ComparableComparator<E> comparableComparator(){
	return org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
}
/**
*public static org.apache.commons.collections.comparators.ComparableComparator org.apache.commons.collections.comparators.ComparableComparator.getInstance()
*/ 
public static org.apache.commons.collections.comparators.ComparableComparator getInstance(){
	return org.apache.commons.collections.comparators.ComparableComparator.getInstance();
}
}
