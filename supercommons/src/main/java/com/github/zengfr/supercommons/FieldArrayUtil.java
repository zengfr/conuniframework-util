package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldArrayUtil{ 
/**
*public static java.lang.reflect.Field[] org.apache.commons.lang3.reflect.FieldUtils.getAllFields(java.lang.Class<?>)
*/ 
public static java.lang.reflect.Field[] getAllFields(java.lang.Class<?> p0){
	return org.apache.commons.lang3.reflect.FieldUtils.getAllFields(p0);
}
/**
*public static java.lang.reflect.Field[] org.apache.commons.lang3.reflect.FieldUtils.getFieldsWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>)
*/ 
public static java.lang.reflect.Field[] getFieldsWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1){
	return org.apache.commons.lang3.reflect.FieldUtils.getFieldsWithAnnotation(p0,p1);
}
}
