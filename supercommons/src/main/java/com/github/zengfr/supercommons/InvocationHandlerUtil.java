package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class InvocationHandlerUtil{ 
/**
*public static <T> T com.google.common.reflect.Reflection.newProxy(java.lang.Class<T>,java.lang.reflect.InvocationHandler)
*/ 
public static <T> T newProxy(java.lang.Class<T> p0,java.lang.reflect.InvocationHandler p1){
	return com.google.common.reflect.Reflection.newProxy(p0,p1);
}
}
