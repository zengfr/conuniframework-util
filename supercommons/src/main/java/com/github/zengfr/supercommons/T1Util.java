package com.zengfr.supercommons;
import com.facebook.collections.ComparablePair;
import com.facebook.collections.Pair;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class T1Util{ 
public static <T1 extends java.lang.Comparable<? super T1> ,T2 extends java.lang.Comparable<? super T2> > com.facebook.collections.Pair<T1, T2> of(T1 p0,T2 p1){
return ComparablePair.of(p0,p1);
}
}
