package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PropertyDescriptorUtil{ 
/**
*public static java.beans.PropertyDescriptor org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptor(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*/ 
public static java.beans.PropertyDescriptor getPropertyDescriptor(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptor(p0,p1);
}
/**
*public static java.lang.reflect.Method org.apache.commons.beanutils.PropertyUtils.getReadMethod(java.beans.PropertyDescriptor)
*/ 
public static java.lang.reflect.Method getReadMethod(java.beans.PropertyDescriptor p0){
	return org.apache.commons.beanutils.PropertyUtils.getReadMethod(p0);
}
/**
*public static java.lang.reflect.Method org.apache.commons.beanutils.PropertyUtils.getWriteMethod(java.beans.PropertyDescriptor)
*/ 
public static java.lang.reflect.Method getWriteMethod(java.beans.PropertyDescriptor p0){
	return org.apache.commons.beanutils.PropertyUtils.getWriteMethod(p0);
}
}
