package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TypedUtil{ 
/**
*public static <T> org.apache.commons.lang3.reflect.Typed<T> org.apache.commons.lang3.reflect.TypeUtils.wrap(java.lang.Class<T>)
*/ 
public static <T> org.apache.commons.lang3.reflect.Typed<T> wrap(java.lang.Class<T> p0){
	return org.apache.commons.lang3.reflect.TypeUtils.wrap(p0);
}
/**
*public static <T> org.apache.commons.lang3.reflect.Typed<T> org.apache.commons.lang3.reflect.TypeUtils.wrap(java.lang.reflect.Type)
*/ 
public static <T> org.apache.commons.lang3.reflect.Typed<T> wrap(java.lang.reflect.Type p0){
	return org.apache.commons.lang3.reflect.TypeUtils.wrap(p0);
}
}
