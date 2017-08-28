package com.github.zengfr.supercommons;
import com.google.common.reflect.Invokable;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.reflect.MethodUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MethodUtil{ 
public static com.google.common.reflect.Invokable<?, java.lang.Object> from(java.lang.reflect.Method p0){
return Invokable.from(p0);
}
public static java.lang.reflect.Method getPublicMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2) throws java.lang.SecurityException,java.lang.NoSuchMethodException{
return ClassUtils.getPublicMethod(p0,p1,p2);
}
public static java.util.Set<java.lang.reflect.Method> getOverrideHierarchy(java.lang.reflect.Method p0,org.apache.commons.lang3.ClassUtils.Interfaces p1){
return MethodUtils.getOverrideHierarchy(p0,p1);
}
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2){
return MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.reflect.Method p0){
return MethodUtils.getAccessibleMethod(p0);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getReadMethod(java.beans.PropertyDescriptor p0){
return PropertyUtils.getReadMethod(p0);
}
public static java.lang.reflect.Method getWriteMethod(java.beans.PropertyDescriptor p0){
return PropertyUtils.getWriteMethod(p0);
}
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>[] p2){
return MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?> p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>[] p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.reflect.Method p1){
return MethodUtils.getAccessibleMethod(p0,p1);
}
public static java.lang.reflect.Method getPublicMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2) throws java.lang.SecurityException,java.lang.NoSuchMethodException{
return ClassUtils.getPublicMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2){
return MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
}
