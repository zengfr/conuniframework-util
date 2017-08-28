package com.zengfr.supercommons;
import com.google.common.collect.Sets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeSetUtil{ 
public static <E extends java.lang.Comparable > java.util.TreeSet<E> newTreeSet(){
return Sets.newTreeSet();
}
public static <E extends java.lang.Comparable > java.util.TreeSet<E> newTreeSet(java.lang.Iterable<? extends E> p0){
return Sets.newTreeSet(p0);
}
public static <E> java.util.TreeSet<E> newTreeSet(java.util.Comparator<? super E> p0){
return Sets.newTreeSet(p0);
}
}
