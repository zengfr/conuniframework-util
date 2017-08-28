package com.github.zengfr.supercommons;
import org.apache.commons.beanutils.PropertyUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PropertyDescriptorUtil{ 
public static java.lang.reflect.Method getReadMethod(java.beans.PropertyDescriptor p0){
return PropertyUtils.getReadMethod(p0);
}
public static java.lang.reflect.Method getWriteMethod(java.beans.PropertyDescriptor p0){
return PropertyUtils.getWriteMethod(p0);
}
public static java.beans.PropertyDescriptor getPropertyDescriptor(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return PropertyUtils.getPropertyDescriptor(p0,p1);
}
}
