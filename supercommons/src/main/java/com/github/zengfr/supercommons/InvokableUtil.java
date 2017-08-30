package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class InvokableUtil{ 
/**
*public static <T> com.google.common.reflect.Invokable<T, T> com.google.common.reflect.Invokable.from(java.lang.reflect.Constructor<T>)
*/ 
public static <T> com.google.common.reflect.Invokable<T, T> from(java.lang.reflect.Constructor<T> p0){
	return com.google.common.reflect.Invokable.from(p0);
}
/**
*public static com.google.common.reflect.Invokable<?, java.lang.Object> com.google.common.reflect.Invokable.from(java.lang.reflect.Method)
*/ 
public static com.google.common.reflect.Invokable<?, java.lang.Object> from(java.lang.reflect.Method p0){
	return com.google.common.reflect.Invokable.from(p0);
}
}
