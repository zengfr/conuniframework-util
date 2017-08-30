package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConverterUtil{ 
/**
*public static <T> com.google.common.base.Converter<T, T> com.google.common.base.Converter.identity()
*/ 
public static <T> com.google.common.base.Converter<T, T> identity(){
	return com.google.common.base.Converter.identity();
}
/**
*public static <A,B> com.google.common.base.Converter<A, B> com.google.common.base.Converter.from(com.google.common.base.Function<? super A, ? extends B>,com.google.common.base.Function<? super B, ? extends A>)
*/ 
public static <A,B> com.google.common.base.Converter<A, B> from(com.google.common.base.Function<? super A, ? extends B> p0,com.google.common.base.Function<? super B, ? extends A> p1){
	return com.google.common.base.Converter.from(p0,p1);
}
/**
*public static <T> com.google.common.base.Converter<java.lang.String, T> com.google.common.base.Enums.stringConverter(java.lang.Class<T>)
*/ 
public static <T extends java.lang.Enum<T> > com.google.common.base.Converter<java.lang.String, T> stringConverter(java.lang.Class<T> p0){
	return com.google.common.base.Enums.stringConverter(p0);
}
/**
*public static <A,B> com.google.common.base.Converter<A, B> com.google.common.collect.Maps.asConverter(com.google.common.collect.BiMap<A, B>)
*/ 
public static <A,B> com.google.common.base.Converter<A, B> asConverter(com.google.common.collect.BiMap<A, B> p0){
	return com.google.common.collect.Maps.asConverter(p0);
}
/**
*public static com.google.common.base.Converter<java.lang.String, java.lang.Double> com.google.common.primitives.Doubles.stringConverter()
*/ 
public static com.google.common.base.Converter<java.lang.String, java.lang.Double> stringConverter(){
	return com.google.common.primitives.Doubles.stringConverter();
}
/**
*public static void org.apache.commons.beanutils.ConvertUtils.register(org.apache.commons.beanutils.Converter,java.lang.Class<?>)
*/ 
public static void register(org.apache.commons.beanutils.Converter p0,java.lang.Class<?> p1){
	 org.apache.commons.beanutils.ConvertUtils.register(p0,p1);
}
/**
*public static org.apache.commons.beanutils.Converter org.apache.commons.beanutils.ConvertUtils.lookup(java.lang.Class<?>)
*/ 
public static org.apache.commons.beanutils.Converter lookup(java.lang.Class<?> p0){
	return org.apache.commons.beanutils.ConvertUtils.lookup(p0);
}
/**
*public static org.apache.commons.beanutils.Converter org.apache.commons.beanutils.ConvertUtils.lookup(java.lang.Class<?>,java.lang.Class<?>)
*/ 
public static org.apache.commons.beanutils.Converter lookup(java.lang.Class<?> p0,java.lang.Class<?> p1){
	return org.apache.commons.beanutils.ConvertUtils.lookup(p0,p1);
}
}
