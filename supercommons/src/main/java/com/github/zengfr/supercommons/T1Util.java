package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class T1Util{ 
/**
*public static <T1,T2> com.facebook.collections.Pair<T1, T2> com.facebook.collections.ComparablePair.of(T1,T2)
*/ 
public static <T1 extends java.lang.Comparable<? super T1> ,T2 extends java.lang.Comparable<? super T2> > com.facebook.collections.Pair<T1, T2> of(T1 p0,T2 p1){
	return com.facebook.collections.ComparablePair.of(p0,p1);
}
}
