package com.github.zengfr.supercommons;
import com.google.common.collect.TreeBasedTable;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeBasedTableUtil{ 
public static <R extends java.lang.Comparable ,C extends java.lang.Comparable ,V> com.google.common.collect.TreeBasedTable<R, C, V> create(){
return TreeBasedTable.create();
}
public static <R,C,V> com.google.common.collect.TreeBasedTable<R, C, V> create(com.google.common.collect.TreeBasedTable<R, C, ? extends V> p0){
return TreeBasedTable.create(p0);
}
public static <R,C,V> com.google.common.collect.TreeBasedTable<R, C, V> create(java.util.Comparator<? super R> p0,java.util.Comparator<? super C> p1){
return TreeBasedTable.create(p0,p1);
}
}
