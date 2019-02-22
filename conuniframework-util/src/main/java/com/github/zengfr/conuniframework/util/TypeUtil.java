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
public final class TypeUtil{ 
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#containsTypeVariables(java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#containsTypeVariables(java.lang.reflect.Type)
*<code>public static boolean org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(java.lang.reflect.Type)
*containsTypeVariables(java.lang.reflect.Type p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsTypeVariables(java.lang.reflect.Type p0){
	return org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#genericArrayType(java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#genericArrayType(java.lang.reflect.Type)
*<code>public static java.lang.reflect.GenericArrayType org.apache.commons.lang3.reflect.TypeUtils.genericArrayType(java.lang.reflect.Type)
*genericArrayType(java.lang.reflect.Type p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.GenericArrayType genericArrayType(java.lang.reflect.Type p0){
	return org.apache.commons.lang3.reflect.TypeUtils.genericArrayType(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#getArrayComponentType(java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#getArrayComponentType(java.lang.reflect.Type)
*<code>public static java.lang.reflect.Type org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(java.lang.reflect.Type)
*getArrayComponentType(java.lang.reflect.Type p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Type getArrayComponentType(java.lang.reflect.Type p0){
	return org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#getRawType(java.lang.reflect.Type,java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#getRawType(java.lang.reflect.Type,java.lang.reflect.Type)
*<code>public static java.lang.Class<?> org.apache.commons.lang3.reflect.TypeUtils.getRawType(java.lang.reflect.Type,java.lang.reflect.Type)
*getRawType(java.lang.reflect.Type p0,java.lang.reflect.Type p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getRawType(java.lang.reflect.Type p0,java.lang.reflect.Type p1){
	return org.apache.commons.lang3.reflect.TypeUtils.getRawType(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#getTypeArguments(java.lang.reflect.Type,java.lang.Class<?>)}
*@see org.apache.commons.lang3.reflect.TypeUtils#getTypeArguments(java.lang.reflect.Type,java.lang.Class<?>)
*<code>public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.Type,java.lang.Class<?>)
*getTypeArguments(java.lang.reflect.Type p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.Type p0,java.lang.Class<?> p1){
	return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#isArrayType(java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#isArrayType(java.lang.reflect.Type)
*<code>public static boolean org.apache.commons.lang3.reflect.TypeUtils.isArrayType(java.lang.reflect.Type)
*isArrayType(java.lang.reflect.Type p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isArrayType(java.lang.reflect.Type p0){
	return org.apache.commons.lang3.reflect.TypeUtils.isArrayType(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#isAssignable(java.lang.reflect.Type,java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#isAssignable(java.lang.reflect.Type,java.lang.reflect.Type)
*<code>public static boolean org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type,java.lang.reflect.Type)
*isAssignable(java.lang.reflect.Type p0,java.lang.reflect.Type p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAssignable(java.lang.reflect.Type p0,java.lang.reflect.Type p1){
	return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#isInstance(java.lang.Object,java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#isInstance(java.lang.Object,java.lang.reflect.Type)
*<code>public static boolean org.apache.commons.lang3.reflect.TypeUtils.isInstance(java.lang.Object,java.lang.reflect.Type)
*isInstance(java.lang.Object p0,java.lang.reflect.Type p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isInstance(java.lang.Object p0,java.lang.reflect.Type p1){
	return org.apache.commons.lang3.reflect.TypeUtils.isInstance(p0,p1);
}
/**
*{@link com.google.common.reflect.TypeToken#of(java.lang.reflect.Type)}
*@see com.google.common.reflect.TypeToken#of(java.lang.reflect.Type)
*<code>public static com.google.common.reflect.TypeToken<?> com.google.common.reflect.TypeToken.of(java.lang.reflect.Type)
*of(java.lang.reflect.Type p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.reflect.TypeToken<?> of(java.lang.reflect.Type p0){
	return com.google.common.reflect.TypeToken.of(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#parameterizeWithOwner(java.lang.reflect.Type,java.lang.Class<?>,java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>)}
*@see org.apache.commons.lang3.reflect.TypeUtils#parameterizeWithOwner(java.lang.reflect.Type,java.lang.Class<?>,java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>)
*<code>public static final java.lang.reflect.ParameterizedType org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(java.lang.reflect.Type,java.lang.Class<?>,java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>)
*parameterizeWithOwner(java.lang.reflect.Type p0,java.lang.Class<?> p1,java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(java.lang.reflect.Type p0,java.lang.Class<?> p1,java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p2){
	return org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#parameterizeWithOwner(java.lang.reflect.Type,java.lang.Class<?>,java.lang.reflect.Type...)}
*@see org.apache.commons.lang3.reflect.TypeUtils#parameterizeWithOwner(java.lang.reflect.Type,java.lang.Class<?>,java.lang.reflect.Type...)
*<code>public static final java.lang.reflect.ParameterizedType org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(java.lang.reflect.Type,java.lang.Class<?>,java.lang.reflect.Type...)
*parameterizeWithOwner(java.lang.reflect.Type p0,java.lang.Class<?> p1,java.lang.reflect.Type... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(java.lang.reflect.Type p0,java.lang.Class<?> p1,java.lang.reflect.Type... p2){
	return org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#unrollVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>,java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#unrollVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>,java.lang.reflect.Type)
*<code>public static java.lang.reflect.Type org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>,java.lang.reflect.Type)
*unrollVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p0,java.lang.reflect.Type p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Type unrollVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p0,java.lang.reflect.Type p1){
	return org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#wrap(java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#wrap(java.lang.reflect.Type)
*<code>public static <T> org.apache.commons.lang3.reflect.Typed<T> org.apache.commons.lang3.reflect.TypeUtils.wrap(java.lang.reflect.Type)
*wrap(java.lang.reflect.Type p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.lang3.reflect.Typed<T> wrap(java.lang.reflect.Type p0){
	return org.apache.commons.lang3.reflect.TypeUtils.wrap(p0);
}
}
