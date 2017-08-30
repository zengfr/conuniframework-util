package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MethodArrayUtil{ 
/**
*public static java.lang.reflect.Method[] org.apache.commons.lang3.reflect.MethodUtils.getMethodsWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>)
*/ 
public static java.lang.reflect.Method[] getMethodsWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1){
	return org.apache.commons.lang3.reflect.MethodUtils.getMethodsWithAnnotation(p0,p1);
}
}
