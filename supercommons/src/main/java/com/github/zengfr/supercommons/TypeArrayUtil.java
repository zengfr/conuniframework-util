package com.github.zengfr.supercommons;
import org.apache.commons.lang3.reflect.TypeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TypeArrayUtil{ 
public static final java.lang.reflect.ParameterizedType parameterize(java.lang.Class<?> p0,java.lang.reflect.Type... p1){
return TypeUtils.parameterize(p0,p1);
}
public static java.lang.reflect.Type[] getImplicitBounds(java.lang.reflect.TypeVariable<?> p0){
return TypeUtils.getImplicitBounds(p0);
}
public static java.lang.reflect.Type[] getImplicitLowerBounds(java.lang.reflect.WildcardType p0){
return TypeUtils.getImplicitLowerBounds(p0);
}
public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(java.lang.reflect.Type p0,java.lang.Class<?> p1,java.lang.reflect.Type... p2){
return TypeUtils.parameterizeWithOwner(p0,p1,p2);
}
public static java.lang.reflect.Type[] getImplicitUpperBounds(java.lang.reflect.WildcardType p0){
return TypeUtils.getImplicitUpperBounds(p0);
}
public static java.lang.reflect.Type[] normalizeUpperBounds(java.lang.reflect.Type[] p0){
return TypeUtils.normalizeUpperBounds(p0);
}
}
