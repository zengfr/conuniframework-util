package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeRangeSetUtil{ 
/**
*public static <C> com.google.common.collect.TreeRangeSet<C> com.google.common.collect.TreeRangeSet.create()
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.TreeRangeSet<C> create(){
	return com.google.common.collect.TreeRangeSet.create();
}
/**
*public static <C> com.google.common.collect.TreeRangeSet<C> com.google.common.collect.TreeRangeSet.create(com.google.common.collect.RangeSet<C>)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.TreeRangeSet<C> create(com.google.common.collect.RangeSet<C> p0){
	return com.google.common.collect.TreeRangeSet.create(p0);
}
}
