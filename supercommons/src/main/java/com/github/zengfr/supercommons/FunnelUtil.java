package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FunnelUtil{ 
/**
*public static com.google.common.hash.Funnel<byte[]> com.google.common.hash.Funnels.byteArrayFunnel()
*/ 
public static com.google.common.hash.Funnel<byte[]> byteArrayFunnel(){
	return com.google.common.hash.Funnels.byteArrayFunnel();
}
/**
*public static com.google.common.hash.Funnel<java.lang.Integer> com.google.common.hash.Funnels.integerFunnel()
*/ 
public static com.google.common.hash.Funnel<java.lang.Integer> integerFunnel(){
	return com.google.common.hash.Funnels.integerFunnel();
}
/**
*public static com.google.common.hash.Funnel<java.lang.Long> com.google.common.hash.Funnels.longFunnel()
*/ 
public static com.google.common.hash.Funnel<java.lang.Long> longFunnel(){
	return com.google.common.hash.Funnels.longFunnel();
}
/**
*public static <E> com.google.common.hash.Funnel<java.lang.Iterable<? extends E>> com.google.common.hash.Funnels.sequentialFunnel(com.google.common.hash.Funnel<E>)
*/ 
public static <E> com.google.common.hash.Funnel<java.lang.Iterable<? extends E>> sequentialFunnel(com.google.common.hash.Funnel<E> p0){
	return com.google.common.hash.Funnels.sequentialFunnel(p0);
}
/**
*public static com.google.common.hash.Funnel<java.lang.CharSequence> com.google.common.hash.Funnels.stringFunnel(java.nio.charset.Charset)
*/ 
public static com.google.common.hash.Funnel<java.lang.CharSequence> stringFunnel(java.nio.charset.Charset p0){
	return com.google.common.hash.Funnels.stringFunnel(p0);
}
/**
*public static com.google.common.hash.Funnel<java.lang.CharSequence> com.google.common.hash.Funnels.unencodedCharsFunnel()
*/ 
public static com.google.common.hash.Funnel<java.lang.CharSequence> unencodedCharsFunnel(){
	return com.google.common.hash.Funnels.unencodedCharsFunnel();
}
}
