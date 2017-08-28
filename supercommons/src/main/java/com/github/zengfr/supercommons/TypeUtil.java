package com.zengfr.supercommons;
import com.google.common.reflect.TypeToken;
import org.apache.commons.lang3.reflect.TypeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TypeUtil{ 
public static com.google.common.reflect.TypeToken<?> of(java.lang.reflect.Type p0){
return TypeToken.of(p0);
}
public static boolean isInstance(java.lang.Object p0,java.lang.reflect.Type p1){
return TypeUtils.isInstance(p0,p1);
}
public static <T> org.apache.commons.lang3.reflect.Typed<T> wrap(java.lang.reflect.Type p0){
return TypeUtils.wrap(p0);
}
public static java.lang.Class<?> getRawType(java.lang.reflect.Type p0,java.lang.reflect.Type p1){
return TypeUtils.getRawType(p0,p1);
}
public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.Type p0,java.lang.Class<?> p1){
return TypeUtils.getTypeArguments(p0,p1);
}
public static boolean isAssignable(java.lang.reflect.Type p0,java.lang.reflect.Type p1){
return TypeUtils.isAssignable(p0,p1);
}
public static java.lang.reflect.Type unrollVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p0,java.lang.reflect.Type p1){
return TypeUtils.unrollVariables(p0,p1);
}
public static java.lang.reflect.GenericArrayType genericArrayType(java.lang.reflect.Type p0){
return TypeUtils.genericArrayType(p0);
}
public static boolean isArrayType(java.lang.reflect.Type p0){
return TypeUtils.isArrayType(p0);
}
public static java.lang.reflect.Type getArrayComponentType(java.lang.reflect.Type p0){
return TypeUtils.getArrayComponentType(p0);
}
public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(java.lang.reflect.Type p0,java.lang.Class<?> p1,java.lang.reflect.Type... p2){
return TypeUtils.parameterizeWithOwner(p0,p1,p2);
}
public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(java.lang.reflect.Type p0,java.lang.Class<?> p1,java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p2){
return TypeUtils.parameterizeWithOwner(p0,p1,p2);
}
public static boolean containsTypeVariables(java.lang.reflect.Type p0){
return TypeUtils.containsTypeVariables(p0);
}
}
