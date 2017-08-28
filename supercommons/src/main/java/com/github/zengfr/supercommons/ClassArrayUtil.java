package com.github.zengfr.supercommons;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.functors.InstantiateTransformer;
import org.apache.commons.collections.functors.InvokerTransformer;
import org.apache.commons.collections.functors.InstantiateFactory;
import org.apache.commons.collections.PredicateUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.reflect.ConstructorUtils;
import org.apache.commons.lang.reflect.MethodUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ClassArrayUtil{ 
public static org.apache.commons.collections.Transformer invokerTransformer(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return TransformerUtils.invokerTransformer(p0,p1,p2);
}
public static org.apache.commons.collections.Transformer instantiateTransformer(java.lang.Class[] p0,java.lang.Object[] p1){
return TransformerUtils.instantiateTransformer(p0,p1);
}
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object[] p2){
return FactoryUtils.instantiateFactory(p0,p1,p2);
}
public static org.apache.commons.collections.Closure invokerClosure(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return ClosureUtils.invokerClosure(p0,p1,p2);
}
public static org.apache.commons.collections.Transformer getInstance(java.lang.Class[] p0,java.lang.Object[] p1){
return InstantiateTransformer.getInstance(p0,p1);
}
public static org.apache.commons.collections.Transformer getInstance(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return InvokerTransformer.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Factory getInstance(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object[] p2){
return InstantiateFactory.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Predicate invokerPredicate(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return PredicateUtils.invokerPredicate(p0,p1,p2);
}
public static java.lang.Class<?>[] nullToEmpty(java.lang.Class<?>[] p0){
return ArrayUtils.nullToEmpty(p0);
}
public static java.lang.Class<?>[] toClass(java.lang.Object... p0){
return ClassUtils.toClass(p0);
}
public static java.lang.Class<?>[] primitivesToWrappers(java.lang.Class<?>... p0){
return ClassUtils.primitivesToWrappers(p0);
}
public static java.lang.Class<?>[] wrappersToPrimitives(java.lang.Class<?>... p0){
return ClassUtils.wrappersToPrimitives(p0);
}
public static java.lang.Class[] toClass(java.lang.Object[] p0){
return ClassUtils.toClass(p0);
}
public static boolean isAssignable(java.lang.Class[] p0,java.lang.Class[] p1,boolean p2){
return ClassUtils.isAssignable(p0,p1,p2);
}
public static boolean isAssignable(java.lang.Class[] p0,java.lang.Class[] p1){
return ClassUtils.isAssignable(p0,p1);
}
public static java.lang.reflect.Method getPublicMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2) throws java.lang.SecurityException,java.lang.NoSuchMethodException{
return ClassUtils.getPublicMethod(p0,p1,p2);
}
public static java.lang.Class[] primitivesToWrappers(java.lang.Class[] p0){
return ClassUtils.primitivesToWrappers(p0);
}
public static java.lang.Class[] wrappersToPrimitives(java.lang.Class[] p0){
return ClassUtils.wrappersToPrimitives(p0);
}
public static java.lang.reflect.Constructor getAccessibleConstructor(java.lang.Class p0,java.lang.Class[] p1){
return ConstructorUtils.getAccessibleConstructor(p0,p1);
}
public static java.lang.reflect.Constructor getMatchingAccessibleConstructor(java.lang.Class p0,java.lang.Class[] p1){
return ConstructorUtils.getMatchingAccessibleConstructor(p0,p1);
}
public static java.lang.Object invokeExactConstructor(java.lang.Class p0,java.lang.Object[] p1,java.lang.Class[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1,p2);
}
public static java.lang.Object invokeConstructor(java.lang.Class p0,java.lang.Object[] p1,java.lang.Class[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1,p2);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2,p3);
}
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2){
return MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2,p3);
}
}
