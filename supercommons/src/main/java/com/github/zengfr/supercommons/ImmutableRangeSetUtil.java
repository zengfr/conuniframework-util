package com.github.zengfr.supercommons;
import com.google.common.collect.ImmutableRangeSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableRangeSetUtil{ 
public static <C extends java.lang.Comparable > com.google.common.collect.ImmutableRangeSet<C> copyOf(com.google.common.collect.RangeSet<C> p0){
return ImmutableRangeSet.copyOf(p0);
}
public static <C extends java.lang.Comparable > com.google.common.collect.ImmutableRangeSet<C> of(){
return ImmutableRangeSet.of();
}
public static <C extends java.lang.Comparable > com.google.common.collect.ImmutableRangeSet<C> of(com.google.common.collect.Range<C> p0){
return ImmutableRangeSet.of(p0);
}
}
