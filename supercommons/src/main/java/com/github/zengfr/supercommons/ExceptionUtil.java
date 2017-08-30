package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ExceptionUtil{ 
/**
*public static <T,S> T com.facebook.util.ExceptionUtils.wrap(S,java.lang.Class<T>)
*/ 
public static <T extends java.lang.Exception ,S extends java.lang.Exception > T wrap(S p0,java.lang.Class<T> p1){
	return com.facebook.util.ExceptionUtils.wrap(p0,p1);
}
}
