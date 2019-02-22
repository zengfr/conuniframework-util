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
public final class FieldUtil{ 
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#getDeclaredField(java.lang.Class<?>,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#getDeclaredField(java.lang.Class<?>,java.lang.String,boolean)
*<code>public static java.lang.reflect.Field org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class<?>,java.lang.String,boolean)
*getDeclaredField(java.lang.Class<?> p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#getDeclaredField(java.lang.Class<?>,java.lang.String)}
*@see org.apache.commons.lang3.reflect.FieldUtils#getDeclaredField(java.lang.Class<?>,java.lang.String)
*<code>public static java.lang.reflect.Field org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class<?>,java.lang.String)
*getDeclaredField(java.lang.Class<?> p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> p0,java.lang.String p1){
	return org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(p0,p1);
}
/**
*{@link com.google.common.base.Enums#getField(java.lang.Enum<?>)}
*@see com.google.common.base.Enums#getField(java.lang.Enum<?>)
*<code>public static java.lang.reflect.Field com.google.common.base.Enums.getField(java.lang.Enum<?>)
*getField(java.lang.Enum<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Field getField(java.lang.Enum<?> p0){
	return com.google.common.base.Enums.getField(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#getField(java.lang.Class<?>,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#getField(java.lang.Class<?>,java.lang.String,boolean)
*<code>public static java.lang.reflect.Field org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class<?>,java.lang.String,boolean)
*getField(java.lang.Class<?> p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Field getField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang3.reflect.FieldUtils.getField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#getField(java.lang.Class<?>,java.lang.String)}
*@see org.apache.commons.lang3.reflect.FieldUtils#getField(java.lang.Class<?>,java.lang.String)
*<code>public static java.lang.reflect.Field org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class<?>,java.lang.String)
*getField(java.lang.Class<?> p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Field getField(java.lang.Class<?> p0,java.lang.String p1){
	return org.apache.commons.lang3.reflect.FieldUtils.getField(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#getFieldByNameIncludingSuperclasses(java.lang.String,java.lang.Class<?>)}
*@see org.codehaus.plexus.util.ReflectionUtils#getFieldByNameIncludingSuperclasses(java.lang.String,java.lang.Class<?>)
*<code>public static java.lang.reflect.Field org.codehaus.plexus.util.ReflectionUtils.getFieldByNameIncludingSuperclasses(java.lang.String,java.lang.Class<?>)
*getFieldByNameIncludingSuperclasses(java.lang.String p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Field getFieldByNameIncludingSuperclasses(java.lang.String p0,java.lang.Class<?> p1){
	return org.codehaus.plexus.util.ReflectionUtils.getFieldByNameIncludingSuperclasses(p0,p1);
}
/**
*{@link com.google.common.base.internal.Finalizer#getInheritableThreadLocalsField()}
*@see com.google.common.base.internal.Finalizer#getInheritableThreadLocalsField()
*<code>public static java.lang.reflect.Field com.google.common.base.internal.Finalizer.getInheritableThreadLocalsField()
*getInheritableThreadLocalsField()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Field getInheritableThreadLocalsField(){
	return com.google.common.base.internal.Finalizer.getInheritableThreadLocalsField();
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.reflect.Field,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.reflect.Field,java.lang.Object,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*readField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.reflect.Field,java.lang.Object)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.reflect.Field,java.lang.Object)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field,java.lang.Object) throws java.lang.IllegalAccessException
*readField(java.lang.reflect.Field p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readField(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.reflect.Field,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.reflect.Field,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field,boolean) throws java.lang.IllegalAccessException
*readStaticField(java.lang.reflect.Field p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readStaticField(java.lang.reflect.Field p0,boolean p1) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readStaticField(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.reflect.Field)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.reflect.Field)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field) throws java.lang.IllegalAccessException
*readStaticField(java.lang.reflect.Field p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readStaticField(java.lang.reflect.Field p0) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readStaticField(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#removeFinalModifier(java.lang.reflect.Field,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#removeFinalModifier(java.lang.reflect.Field,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.removeFinalModifier(java.lang.reflect.Field,boolean)
*removeFinalModifier(java.lang.reflect.Field p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void removeFinalModifier(java.lang.reflect.Field p0,boolean p1){
	 org.apache.commons.lang3.reflect.FieldUtils.removeFinalModifier(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#removeFinalModifier(java.lang.reflect.Field)}
*@see org.apache.commons.lang3.reflect.FieldUtils#removeFinalModifier(java.lang.reflect.Field)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.removeFinalModifier(java.lang.reflect.Field)
*removeFinalModifier(java.lang.reflect.Field p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void removeFinalModifier(java.lang.reflect.Field p0){
	 org.apache.commons.lang3.reflect.FieldUtils.removeFinalModifier(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object) throws java.lang.IllegalAccessException
*writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.reflect.Field,java.lang.Object)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.reflect.Field,java.lang.Object)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field,java.lang.Object) throws java.lang.IllegalAccessException
*writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.reflect.Field,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.reflect.Field,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(p0,p1,p2);
}
}
