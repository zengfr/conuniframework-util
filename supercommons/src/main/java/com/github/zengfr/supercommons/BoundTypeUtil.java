package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BoundTypeUtil{ 
/**
*public static com.google.common.collect.BoundType com.google.common.collect.BoundType.valueOf(java.lang.String)
*/ 
public static com.google.common.collect.BoundType valueOf(java.lang.String p0){
	return com.google.common.collect.BoundType.valueOf(p0);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.range(C,com.google.common.collect.BoundType,C,com.google.common.collect.BoundType)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> range(C p0,com.google.common.collect.BoundType p1,C p2,com.google.common.collect.BoundType p3){
	return com.google.common.collect.Range.range(p0,p1,p2,p3);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.upTo(C,com.google.common.collect.BoundType)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> upTo(C p0,com.google.common.collect.BoundType p1){
	return com.google.common.collect.Range.upTo(p0,p1);
}
/**
*public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.downTo(C,com.google.common.collect.BoundType)
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> downTo(C p0,com.google.common.collect.BoundType p1){
	return com.google.common.collect.Range.downTo(p0,p1);
}
}
