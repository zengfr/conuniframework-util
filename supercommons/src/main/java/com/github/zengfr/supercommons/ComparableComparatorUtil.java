package com.github.zengfr.supercommons;
import org.apache.commons.collections.comparators.ComparableComparator;
import org.apache.commons.collections4.comparators.ComparableComparator;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComparableComparatorUtil{ 
public static org.apache.commons.collections.comparators.ComparableComparator getInstance(){
return ComparableComparator.getInstance();
}
public static <E extends java.lang.Comparable<? super E> > org.apache.commons.collections4.comparators.ComparableComparator<E> comparableComparator(){
return ComparableComparator.comparableComparator();
}
}
