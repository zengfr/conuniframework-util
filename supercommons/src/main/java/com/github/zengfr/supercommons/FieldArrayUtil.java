package com.zengfr.supercommons;
import org.apache.commons.lang3.reflect.FieldUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldArrayUtil{ 
public static java.lang.reflect.Field[] getAllFields(java.lang.Class<?> p0){
return FieldUtils.getAllFields(p0);
}
public static java.lang.reflect.Field[] getFieldsWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1){
return FieldUtils.getFieldsWithAnnotation(p0,p1);
}
}
