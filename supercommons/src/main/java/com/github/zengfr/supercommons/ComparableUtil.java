package com.zengfr.supercommons;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang.ObjectUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComparableUtil{ 
public static <T extends java.lang.Comparable<? super T> > T min(T... p0){
return ObjectUtils.min(p0);
}
public static <T extends java.lang.Comparable<? super T> > T max(T... p0){
return ObjectUtils.max(p0);
}
public static <T extends java.lang.Comparable<? super T> > T median(T... p0){
return ObjectUtils.median(p0);
}
public static java.lang.Object min(java.lang.Comparable p0,java.lang.Comparable p1){
return ObjectUtils.min(p0,p1);
}
public static java.lang.Object max(java.lang.Comparable p0,java.lang.Comparable p1){
return ObjectUtils.max(p0,p1);
}
public static int compare(java.lang.Comparable p0,java.lang.Comparable p1){
return ObjectUtils.compare(p0,p1);
}
public static int compare(java.lang.Comparable p0,java.lang.Comparable p1,boolean p2){
return ObjectUtils.compare(p0,p1,p2);
}
}
