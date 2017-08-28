package com.github.zengfr.supercommons;
import org.apache.commons.lang3.reflect.MethodUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MethodArrayUtil{ 
public static java.lang.reflect.Method[] getMethodsWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1){
return MethodUtils.getMethodsWithAnnotation(p0,p1);
}
}
