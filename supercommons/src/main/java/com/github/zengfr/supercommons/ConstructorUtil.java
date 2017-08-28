package com.github.zengfr.supercommons;
import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.lang.reflect.ConstructorUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConstructorUtil{ 
public static <T> java.lang.reflect.Constructor<T> getAccessibleConstructor(java.lang.reflect.Constructor<T> p0){
return ConstructorUtils.getAccessibleConstructor(p0);
}
public static <T> java.lang.reflect.Constructor<T> getAccessibleConstructor(java.lang.Class<T> p0,java.lang.Class<?>... p1){
return ConstructorUtils.getAccessibleConstructor(p0,p1);
}
public static <T> java.lang.reflect.Constructor<T> getMatchingAccessibleConstructor(java.lang.Class<T> p0,java.lang.Class<?>... p1){
return ConstructorUtils.getMatchingAccessibleConstructor(p0,p1);
}
public static <T> java.lang.reflect.Constructor<T> getAccessibleConstructor(java.lang.Class<T> p0,java.lang.Class<?>[] p1){
return ConstructorUtils.getAccessibleConstructor(p0,p1);
}
public static <T> java.lang.reflect.Constructor<T> getAccessibleConstructor(java.lang.Class<T> p0,java.lang.Class<?> p1){
return ConstructorUtils.getAccessibleConstructor(p0,p1);
}
public static java.lang.reflect.Constructor getAccessibleConstructor(java.lang.Class p0,java.lang.Class p1){
return ConstructorUtils.getAccessibleConstructor(p0,p1);
}
public static java.lang.reflect.Constructor getAccessibleConstructor(java.lang.Class p0,java.lang.Class[] p1){
return ConstructorUtils.getAccessibleConstructor(p0,p1);
}
public static java.lang.reflect.Constructor getAccessibleConstructor(java.lang.reflect.Constructor p0){
return ConstructorUtils.getAccessibleConstructor(p0);
}
public static java.lang.reflect.Constructor getMatchingAccessibleConstructor(java.lang.Class p0,java.lang.Class[] p1){
return ConstructorUtils.getMatchingAccessibleConstructor(p0,p1);
}
}
