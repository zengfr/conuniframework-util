package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ClassArrayUtil{ 
/**
*public static java.lang.reflect.Constructor org.apache.commons.lang.reflect.ConstructorUtils.getAccessibleConstructor(java.lang.Class,java.lang.Class[])
*/ 
public static java.lang.reflect.Constructor getAccessibleConstructor(java.lang.Class p0,java.lang.Class... p1){
	return org.apache.commons.lang.reflect.ConstructorUtils.getAccessibleConstructor(p0,p1);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang.reflect.MethodUtils.getAccessibleMethod(java.lang.Class,java.lang.String,java.lang.Class[])
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class... p2){
	return org.apache.commons.lang.reflect.MethodUtils.getAccessibleMethod(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.InstantiateTransformer.getInstance(java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Transformer getInstance(java.lang.Class[] p0,java.lang.Object... p1){
	return org.apache.commons.collections.functors.InstantiateTransformer.getInstance(p0,p1);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.InvokerTransformer.getInstance(java.lang.String,java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Transformer getInstance(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.functors.InvokerTransformer.getInstance(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Factory org.apache.commons.collections.functors.InstantiateFactory.getInstance(java.lang.Class,java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Factory getInstance(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.functors.InstantiateFactory.getInstance(p0,p1,p2);
}
/**
*public static java.lang.reflect.Constructor org.apache.commons.lang.reflect.ConstructorUtils.getMatchingAccessibleConstructor(java.lang.Class,java.lang.Class[])
*/ 
public static java.lang.reflect.Constructor getMatchingAccessibleConstructor(java.lang.Class p0,java.lang.Class... p1){
	return org.apache.commons.lang.reflect.ConstructorUtils.getMatchingAccessibleConstructor(p0,p1);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang.reflect.MethodUtils.getMatchingAccessibleMethod(java.lang.Class,java.lang.String,java.lang.Class[])
*/ 
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class... p2){
	return org.apache.commons.lang.reflect.MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
/**
*public static java.lang.reflect.Method org.apache.commons.lang.ClassUtils.getPublicMethod(java.lang.Class,java.lang.String,java.lang.Class[]) throws java.lang.SecurityException,java.lang.NoSuchMethodException
*/ 
public static java.lang.reflect.Method getPublicMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class... p2) throws java.lang.SecurityException,java.lang.NoSuchMethodException{
	return org.apache.commons.lang.ClassUtils.getPublicMethod(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.instantiateFactory(java.lang.Class,java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.FactoryUtils.instantiateFactory(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.instantiateTransformer(java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Transformer instantiateTransformer(java.lang.Class[] p0,java.lang.Object... p1){
	return org.apache.commons.collections.TransformerUtils.instantiateTransformer(p0,p1);
}
/**
*public static java.lang.Object org.apache.commons.lang.reflect.ConstructorUtils.invokeConstructor(java.lang.Class,java.lang.Object[],java.lang.Class[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException
*/ 
public static java.lang.Object invokeConstructor(java.lang.Class p0,java.lang.Object[] p1,java.lang.Class... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
	return org.apache.commons.lang.reflect.ConstructorUtils.invokeConstructor(p0,p1,p2);
}
/**
*public static java.lang.Object org.apache.commons.lang.reflect.ConstructorUtils.invokeExactConstructor(java.lang.Class,java.lang.Object[],java.lang.Class[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException
*/ 
public static java.lang.Object invokeExactConstructor(java.lang.Class p0,java.lang.Object[] p1,java.lang.Class... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
	return org.apache.commons.lang.reflect.ConstructorUtils.invokeExactConstructor(p0,p1,p2);
}
/**
*public static java.lang.Object org.apache.commons.lang.reflect.MethodUtils.invokeExactMethod(java.lang.Object,java.lang.String,java.lang.Object[],java.lang.Class[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*/ 
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class... p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang.reflect.MethodUtils.invokeExactMethod(p0,p1,p2,p3);
}
/**
*public static java.lang.Object org.apache.commons.lang.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class,java.lang.String,java.lang.Object[],java.lang.Class[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*/ 
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class... p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang.reflect.MethodUtils.invokeExactStaticMethod(p0,p1,p2,p3);
}
/**
*public static java.lang.Object org.apache.commons.lang.reflect.MethodUtils.invokeMethod(java.lang.Object,java.lang.String,java.lang.Object[],java.lang.Class[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class... p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang.reflect.MethodUtils.invokeMethod(p0,p1,p2,p3);
}
/**
*public static java.lang.Object org.apache.commons.lang.reflect.MethodUtils.invokeStaticMethod(java.lang.Class,java.lang.String,java.lang.Object[],java.lang.Class[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*/ 
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class... p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang.reflect.MethodUtils.invokeStaticMethod(p0,p1,p2,p3);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.invokerClosure(java.lang.String,java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Closure invokerClosure(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.ClosureUtils.invokerClosure(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.invokerPredicate(java.lang.String,java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Predicate invokerPredicate(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.PredicateUtils.invokerPredicate(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.invokerTransformer(java.lang.String,java.lang.Class[],java.lang.Object[])
*/ 
public static org.apache.commons.collections.Transformer invokerTransformer(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.TransformerUtils.invokerTransformer(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class[],java.lang.Class[])
*/ 
public static boolean isAssignable(java.lang.Class[] p0,java.lang.Class... p1){
	return org.apache.commons.lang.ClassUtils.isAssignable(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class[],java.lang.Class[],boolean)
*/ 
public static boolean isAssignable(java.lang.Class[] p0,java.lang.Class[] p1,boolean p2){
	return org.apache.commons.lang.ClassUtils.isAssignable(p0,p1,p2);
}
/**
*public static java.lang.Class<?>[] org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Class<?>[])
*/ 
public static java.lang.Class<?>[] nullToEmpty(java.lang.Class<?>... p0){
	return org.apache.commons.lang3.ArrayUtils.nullToEmpty(p0);
}
/**
*public static java.lang.Class<?>[] org.apache.commons.lang3.ClassUtils.primitivesToWrappers(java.lang.Class<?>...)
*/ 
public static java.lang.Class<?>[] primitivesToWrappers(java.lang.Class<?>... p0){
	return org.apache.commons.lang3.ClassUtils.primitivesToWrappers(p0);
}
/**
*public static java.lang.Class[] org.apache.commons.lang.ClassUtils.primitivesToWrappers(java.lang.Class[])
*/ 
public static java.lang.Class[] primitivesToWrappers(java.lang.Class... p0){
	return org.apache.commons.lang.ClassUtils.primitivesToWrappers(p0);
}
/**
*public static java.lang.Class<?>[] org.apache.commons.lang3.ClassUtils.toClass(java.lang.Object...)
*/ 
public static java.lang.Class<?>[] toClass(java.lang.Object... p0){
	return org.apache.commons.lang3.ClassUtils.toClass(p0);
}
/**
*public static java.lang.Class<?>[] org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(java.lang.Class<?>...)
*/ 
public static java.lang.Class<?>[] wrappersToPrimitives(java.lang.Class<?>... p0){
	return org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(p0);
}
/**
*public static java.lang.Class[] org.apache.commons.lang.ClassUtils.wrappersToPrimitives(java.lang.Class[])
*/ 
public static java.lang.Class[] wrappersToPrimitives(java.lang.Class... p0){
	return org.apache.commons.lang.ClassUtils.wrappersToPrimitives(p0);
}
}
