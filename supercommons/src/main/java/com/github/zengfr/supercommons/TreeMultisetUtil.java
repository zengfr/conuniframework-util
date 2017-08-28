package com.zengfr.supercommons;
import com.google.common.collect.TreeMultiset;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeMultisetUtil{ 
public static <E extends java.lang.Comparable > com.google.common.collect.TreeMultiset<E> create(){
return TreeMultiset.create();
}
public static <E extends java.lang.Comparable > com.google.common.collect.TreeMultiset<E> create(java.lang.Iterable<? extends E> p0){
return TreeMultiset.create(p0);
}
public static <E> com.google.common.collect.TreeMultiset<E> create(java.util.Comparator<? super E> p0){
return TreeMultiset.create(p0);
}
}
