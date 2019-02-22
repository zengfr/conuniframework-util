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
public final class ConverterUtil{ 
/**
*{@link com.google.common.collect.Maps#asConverter(com.google.common.collect.BiMap<A, B>)}
*@see com.google.common.collect.Maps#asConverter(com.google.common.collect.BiMap<A, B>)
*<code>public static <A,B> com.google.common.base.Converter<A, B> com.google.common.collect.Maps.asConverter(com.google.common.collect.BiMap<A, B>)
*asConverter(com.google.common.collect.BiMap<A, B> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <A,B> com.google.common.base.Converter<A, B> asConverter(com.google.common.collect.BiMap<A, B> p0){
	return com.google.common.collect.Maps.asConverter(p0);
}
/**
*{@link com.google.common.base.Converter#from(com.google.common.base.Function<? super A, ? extends B>,com.google.common.base.Function<? super B, ? extends A>)}
*@see com.google.common.base.Converter#from(com.google.common.base.Function<? super A, ? extends B>,com.google.common.base.Function<? super B, ? extends A>)
*<code>public static <A,B> com.google.common.base.Converter<A, B> com.google.common.base.Converter.from(com.google.common.base.Function<? super A, ? extends B>,com.google.common.base.Function<? super B, ? extends A>)
*from(com.google.common.base.Function<? super A, ? extends B> p0,com.google.common.base.Function<? super B, ? extends A> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <A,B> com.google.common.base.Converter<A, B> from(com.google.common.base.Function<? super A, ? extends B> p0,com.google.common.base.Function<? super B, ? extends A> p1){
	return com.google.common.base.Converter.from(p0,p1);
}
/**
*{@link com.google.common.base.Converter#identity()}
*@see com.google.common.base.Converter#identity()
*<code>public static <T> com.google.common.base.Converter<T, T> com.google.common.base.Converter.identity()
*identity()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Converter<T, T> identity(){
	return com.google.common.base.Converter.identity();
}
/**
*{@link org.apache.commons.beanutils.ConvertUtils#lookup(java.lang.Class<?>,java.lang.Class<?>)}
*@see org.apache.commons.beanutils.ConvertUtils#lookup(java.lang.Class<?>,java.lang.Class<?>)
*<code>public static org.apache.commons.beanutils.Converter org.apache.commons.beanutils.ConvertUtils.lookup(java.lang.Class<?>,java.lang.Class<?>)
*lookup(java.lang.Class<?> p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.beanutils.Converter lookup(java.lang.Class<?> p0,java.lang.Class<?> p1){
	return org.apache.commons.beanutils.ConvertUtils.lookup(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.ConvertUtils#lookup(java.lang.Class<?>)}
*@see org.apache.commons.beanutils.ConvertUtils#lookup(java.lang.Class<?>)
*<code>public static org.apache.commons.beanutils.Converter org.apache.commons.beanutils.ConvertUtils.lookup(java.lang.Class<?>)
*lookup(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.beanutils.Converter lookup(java.lang.Class<?> p0){
	return org.apache.commons.beanutils.ConvertUtils.lookup(p0);
}
/**
*{@link org.apache.commons.beanutils.ConvertUtils#register(org.apache.commons.beanutils.Converter,java.lang.Class<?>)}
*@see org.apache.commons.beanutils.ConvertUtils#register(org.apache.commons.beanutils.Converter,java.lang.Class<?>)
*<code>public static void org.apache.commons.beanutils.ConvertUtils.register(org.apache.commons.beanutils.Converter,java.lang.Class<?>)
*register(org.apache.commons.beanutils.Converter p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void register(org.apache.commons.beanutils.Converter p0,java.lang.Class<?> p1){
	 org.apache.commons.beanutils.ConvertUtils.register(p0,p1);
}
/**
*{@link com.google.common.base.Enums#stringConverter(java.lang.Class<T>)}
*@see com.google.common.base.Enums#stringConverter(java.lang.Class<T>)
*<code>public static <T> com.google.common.base.Converter<java.lang.String, T> com.google.common.base.Enums.stringConverter(java.lang.Class<T>)
*stringConverter(java.lang.Class<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Enum<T> > com.google.common.base.Converter<java.lang.String, T> stringConverter(java.lang.Class<T> p0){
	return com.google.common.base.Enums.stringConverter(p0);
}
/**
*{@link com.google.common.primitives.Doubles#stringConverter()}
*@see com.google.common.primitives.Doubles#stringConverter()
*<code>public static com.google.common.base.Converter<java.lang.String, java.lang.Double> com.google.common.primitives.Doubles.stringConverter()
*stringConverter()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Converter<java.lang.String, java.lang.Double> stringConverter(){
	return com.google.common.primitives.Doubles.stringConverter();
}
}
