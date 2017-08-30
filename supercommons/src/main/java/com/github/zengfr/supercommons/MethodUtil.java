package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MethodUtil{ 
/**
*public static com.google.common.reflect.Invokable<?, java.lang.Object> com.google.common.reflect.Invokable.from(java.lang.reflect.Method)
*/ 
public static com.google.common.reflect.Invokable<?, java.lang.Object> from(java.lang.reflect.Method p0){
	return com.google.common.reflect.Invokable.from(p0);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang3.ClassUtils.getPublicMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...) throws java.lang.SecurityException,java.lang.NoSuchMethodException
*/ 
public static java.lang.reflect.Method getPublicMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2) throws java.lang.SecurityException,java.lang.NoSuchMethodException{
	return org.apache.commons.lang3.ClassUtils.getPublicMethod(p0,p1,p2);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2){
	return org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(p0,p1,p2);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.reflect.Method)
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.reflect.Method p0){
	return org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(p0);
}
/**
*public static java.util.Set<java.lang.reflect.Method> org.apache.commons.lang3.reflect.MethodUtils.getOverrideHierarchy(java.lang.reflect.Method,org.apache.commons.lang3.ClassUtils$Interfaces)
*/ 
public static java.util.Set<java.lang.reflect.Method> getOverrideHierarchy(java.lang.reflect.Method p0,Interfaces p1){
	return org.apache.commons.lang3.reflect.MethodUtils.getOverrideHierarchy(p0,p1);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)
*/ 
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2){
	return org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
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
/**
*public static java.lang.reflect.Method org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(java.lang.Class<?>,java.lang.reflect.Method)
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.reflect.Method p1){
	return org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(p0,p1);
}
/**
*public static java.lang.reflect.Method org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>)
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?> p2){
	return org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(p0,p1,p2);
}
/**
*public static java.lang.reflect.Method org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>[])
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>[] p2){
	return org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(p0,p1,p2);
}
/**
*public static java.lang.reflect.Method org.apache.commons.beanutils.MethodUtils.getMatchingAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>[])
*/ 
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>[] p2){
	return org.apache.commons.beanutils.MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang.ClassUtils.getPublicMethod(java.lang.Class,java.lang.String,java.lang.Class[]) throws java.lang.SecurityException,java.lang.NoSuchMethodException
*/ 
public static java.lang.reflect.Method getPublicMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2) throws java.lang.SecurityException,java.lang.NoSuchMethodException{
	return org.apache.commons.lang.ClassUtils.getPublicMethod(p0,p1,p2);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang.reflect.MethodUtils.getAccessibleMethod(java.lang.Class,java.lang.String,java.lang.Class)
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class p2){
	return org.apache.commons.lang.reflect.MethodUtils.getAccessibleMethod(p0,p1,p2);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang.reflect.MethodUtils.getAccessibleMethod(java.lang.Class,java.lang.String,java.lang.Class[])
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2){
	return org.apache.commons.lang.reflect.MethodUtils.getAccessibleMethod(p0,p1,p2);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang.reflect.MethodUtils.getMatchingAccessibleMethod(java.lang.Class,java.lang.String,java.lang.Class[])
*/ 
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2){
	return org.apache.commons.lang.reflect.MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
}
