package com.zengfr.supercommons;
import com.google.common.collect.Range;
import org.apache.commons.lang3.Range;
import org.apache.commons.math3.util.IntegerSequence;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RangeUtil{ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> all(){
return Range.all();
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> singleton(C p0){
return Range.singleton(p0);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> range(C p0,com.google.common.collect.BoundType p1,C p2,com.google.common.collect.BoundType p3){
return Range.range(p0,p1,p2,p3);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> closed(C p0,C p1){
return Range.closed(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> open(C p0,C p1){
return Range.open(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> downTo(C p0,com.google.common.collect.BoundType p1){
return Range.downTo(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> lessThan(C p0){
return Range.lessThan(p0);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> encloseAll(java.lang.Iterable<C> p0){
return Range.encloseAll(p0);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> closedOpen(C p0,C p1){
return Range.closedOpen(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> upTo(C p0,com.google.common.collect.BoundType p1){
return Range.upTo(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> openClosed(C p0,C p1){
return Range.openClosed(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> greaterThan(C p0){
return Range.greaterThan(p0);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> atMost(C p0){
return Range.atMost(p0);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> atLeast(C p0){
return Range.atLeast(p0);
}
public static <T extends java.lang.Comparable<T> > org.apache.commons.lang3.Range<T> is(T p0){
return Range.is(p0);
}
public static <T> org.apache.commons.lang3.Range<T> is(T p0,java.util.Comparator<T> p1){
return Range.is(p0,p1);
}
public static <T extends java.lang.Comparable<T> > org.apache.commons.lang3.Range<T> between(T p0,T p1){
return Range.between(p0,p1);
}
public static <T> org.apache.commons.lang3.Range<T> between(T p0,T p1,java.util.Comparator<T> p2){
return Range.between(p0,p1,p2);
}
public static Range range(int p0,int p1){
return IntegerSequence.range(p0,p1);
}
public static Range range(int p0,int p1,int p2){
return IntegerSequence.range(p0,p1,p2);
}
}
