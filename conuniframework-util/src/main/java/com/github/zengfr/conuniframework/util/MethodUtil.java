package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class MethodUtil{ 
/**
*{@link com.google.common.reflect.Invokable#from(java.lang.reflect.Method)}
*@see com.google.common.reflect.Invokable#from(java.lang.reflect.Method)
*<code>public static com.google.common.reflect.Invokable<?, java.lang.Object> com.google.common.reflect.Invokable.from(java.lang.reflect.Method)
*from(java.lang.reflect.Method p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.reflect.Invokable<?, java.lang.Object> from(java.lang.reflect.Method p0){
	return com.google.common.reflect.Invokable.from(p0);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#getAccessibleMethod(java.lang.Class<?>,java.lang.reflect.Method)}
*@see org.apache.commons.beanutils.MethodUtils#getAccessibleMethod(java.lang.Class<?>,java.lang.reflect.Method)
*<code>public static java.lang.reflect.Method org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(java.lang.Class<?>,java.lang.reflect.Method)
*getAccessibleMethod(java.lang.Class<?> p0,java.lang.reflect.Method p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.reflect.Method p1){
	return org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#getAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>)}
*@see org.apache.commons.beanutils.MethodUtils#getAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>)
*<code>public static java.lang.reflect.Method org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>)
*getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?> p2){
	return org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#getAccessibleMethod(java.lang.reflect.Method)}
*@see org.apache.commons.beanutils.MethodUtils#getAccessibleMethod(java.lang.reflect.Method)
*<code>public static java.lang.reflect.Method org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(java.lang.reflect.Method)
*getAccessibleMethod(java.lang.reflect.Method p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.reflect.Method p0){
	return org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(p0);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#getAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)}
*@see org.apache.commons.beanutils.MethodUtils#getAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)
*<code>public static java.lang.reflect.Method org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>[])
*getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2){
	return org.apache.commons.beanutils.MethodUtils.getAccessibleMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#getAnnotation(java.lang.reflect.Method,java.lang.Class<A>,boolean,boolean)}
*@see org.apache.commons.lang3.reflect.MethodUtils#getAnnotation(java.lang.reflect.Method,java.lang.Class<A>,boolean,boolean)
*<code>public static <A> A org.apache.commons.lang3.reflect.MethodUtils.getAnnotation(java.lang.reflect.Method,java.lang.Class<A>,boolean,boolean)
*getAnnotation(java.lang.reflect.Method p0,java.lang.Class<A> p1,boolean p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <A extends java.lang.annotation.Annotation > A getAnnotation(java.lang.reflect.Method p0,java.lang.Class<A> p1,boolean p2,boolean p3){
	return org.apache.commons.lang3.reflect.MethodUtils.getAnnotation(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#getMatchingAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)}
*@see org.apache.commons.beanutils.MethodUtils#getMatchingAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)
*<code>public static java.lang.reflect.Method org.apache.commons.beanutils.MethodUtils.getMatchingAccessibleMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>[])
*getMatchingAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2){
	return org.apache.commons.beanutils.MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#getMatchingMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)}
*@see org.apache.commons.lang3.reflect.MethodUtils#getMatchingMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)
*<code>public static java.lang.reflect.Method org.apache.commons.lang3.reflect.MethodUtils.getMatchingMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)
*getMatchingMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getMatchingMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2){
	return org.apache.commons.lang3.reflect.MethodUtils.getMatchingMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#getOverrideHierarchy(java.lang.reflect.Method,org.apache.commons.lang3.ClassUtils$Interfaces)}
*@see org.apache.commons.lang3.reflect.MethodUtils#getOverrideHierarchy(java.lang.reflect.Method,org.apache.commons.lang3.ClassUtils$Interfaces)
*<code>public static java.util.Set<java.lang.reflect.Method> org.apache.commons.lang3.reflect.MethodUtils.getOverrideHierarchy(java.lang.reflect.Method,org.apache.commons.lang3.ClassUtils$Interfaces)
*getOverrideHierarchy(java.lang.reflect.Method p0,org.apache.commons.lang3.ClassUtils$Interfaces p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set<java.lang.reflect.Method> getOverrideHierarchy(java.lang.reflect.Method p0,org.apache.commons.lang3.ClassUtils.Interfaces p1){
	return org.apache.commons.lang3.reflect.MethodUtils.getOverrideHierarchy(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.introspection.ClassMap#getPublicMethod(java.lang.reflect.Method)}
*@see org.codehaus.plexus.util.introspection.ClassMap#getPublicMethod(java.lang.reflect.Method)
*<code>public static java.lang.reflect.Method org.codehaus.plexus.util.introspection.ClassMap.getPublicMethod(java.lang.reflect.Method)
*getPublicMethod(java.lang.reflect.Method p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getPublicMethod(java.lang.reflect.Method p0){
	return org.codehaus.plexus.util.introspection.ClassMap.getPublicMethod(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#getPublicMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)}
*@see org.apache.commons.lang3.ClassUtils#getPublicMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...)
*<code>public static java.lang.reflect.Method org.apache.commons.lang3.ClassUtils.getPublicMethod(java.lang.Class<?>,java.lang.String,java.lang.Class<?>...) throws java.lang.NoSuchMethodException
*getPublicMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getPublicMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Class<?>... p2) throws java.lang.NoSuchMethodException{
	return org.apache.commons.lang3.ClassUtils.getPublicMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#getReadMethod(java.beans.PropertyDescriptor)}
*@see org.apache.commons.beanutils.PropertyUtils#getReadMethod(java.beans.PropertyDescriptor)
*<code>public static java.lang.reflect.Method org.apache.commons.beanutils.PropertyUtils.getReadMethod(java.beans.PropertyDescriptor)
*getReadMethod(java.beans.PropertyDescriptor p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getReadMethod(java.beans.PropertyDescriptor p0){
	return org.apache.commons.beanutils.PropertyUtils.getReadMethod(p0);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#getSetter(java.lang.String,java.lang.Class<?>)}
*@see org.codehaus.plexus.util.ReflectionUtils#getSetter(java.lang.String,java.lang.Class<?>)
*<code>public static java.lang.reflect.Method org.codehaus.plexus.util.ReflectionUtils.getSetter(java.lang.String,java.lang.Class<?>)
*getSetter(java.lang.String p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getSetter(java.lang.String p0,java.lang.Class<?> p1){
	return org.codehaus.plexus.util.ReflectionUtils.getSetter(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#getSetterType(java.lang.reflect.Method)}
*@see org.codehaus.plexus.util.ReflectionUtils#getSetterType(java.lang.reflect.Method)
*<code>public static java.lang.Class<?> org.codehaus.plexus.util.ReflectionUtils.getSetterType(java.lang.reflect.Method)
*getSetterType(java.lang.reflect.Method p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getSetterType(java.lang.reflect.Method p0){
	return org.codehaus.plexus.util.ReflectionUtils.getSetterType(p0);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#getWriteMethod(java.beans.PropertyDescriptor)}
*@see org.apache.commons.beanutils.PropertyUtils#getWriteMethod(java.beans.PropertyDescriptor)
*<code>public static java.lang.reflect.Method org.apache.commons.beanutils.PropertyUtils.getWriteMethod(java.beans.PropertyDescriptor)
*getWriteMethod(java.beans.PropertyDescriptor p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method getWriteMethod(java.beans.PropertyDescriptor p0){
	return org.apache.commons.beanutils.PropertyUtils.getWriteMethod(p0);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#isSetter(java.lang.reflect.Method)}
*@see org.codehaus.plexus.util.ReflectionUtils#isSetter(java.lang.reflect.Method)
*<code>public static boolean org.codehaus.plexus.util.ReflectionUtils.isSetter(java.lang.reflect.Method)
*isSetter(java.lang.reflect.Method p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSetter(java.lang.reflect.Method p0){
	return org.codehaus.plexus.util.ReflectionUtils.isSetter(p0);
}
}
