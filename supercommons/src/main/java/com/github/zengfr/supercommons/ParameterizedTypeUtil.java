package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ParameterizedTypeUtil{ 
/**
*public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(java.lang.Class<?>,java.lang.reflect.ParameterizedType)
*/ 
public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> determineTypeArguments(java.lang.Class<?> p0,java.lang.reflect.ParameterizedType p1){
	return org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(p0,p1);
}
/**
*public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.ParameterizedType)
*/ 
public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.ParameterizedType p0){
	return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(p0);
}
/**
*public static final java.lang.reflect.ParameterizedType org.apache.commons.lang3.reflect.TypeUtils.parameterize(java.lang.Class<?>,java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>)
*/ 
public static final java.lang.reflect.ParameterizedType parameterize(java.lang.Class<?> p0,java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p1){
	return org.apache.commons.lang3.reflect.TypeUtils.parameterize(p0,p1);
}
/**
*public static final java.lang.reflect.ParameterizedType org.apache.commons.lang3.reflect.TypeUtils.parameterize(java.lang.Class<?>,java.lang.reflect.Type...)
*/ 
public static final java.lang.reflect.ParameterizedType parameterize(java.lang.Class<?> p0,java.lang.reflect.Type... p1){
	return org.apache.commons.lang3.reflect.TypeUtils.parameterize(p0,p1);
}
/**
*public static final java.lang.reflect.ParameterizedType org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(java.lang.reflect.Type,java.lang.Class<?>,java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>)
*/ 
public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(java.lang.reflect.Type p0,java.lang.Class<?> p1,java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p2){
	return org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(p0,p1,p2);
}
/**
*public static final java.lang.reflect.ParameterizedType org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(java.lang.reflect.Type,java.lang.Class<?>,java.lang.reflect.Type...)
*/ 
public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(java.lang.reflect.Type p0,java.lang.Class<?> p1,java.lang.reflect.Type... p2){
	return org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(p0,p1,p2);
}
}
