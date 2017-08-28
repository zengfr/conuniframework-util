package com.zengfr.supercommons;
import com.google.common.collect.TreeRangeSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeRangeSetUtil{ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.TreeRangeSet<C> create(){
return TreeRangeSet.create();
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.TreeRangeSet<C> create(com.google.common.collect.RangeSet<C> p0){
return TreeRangeSet.create(p0);
}
}
