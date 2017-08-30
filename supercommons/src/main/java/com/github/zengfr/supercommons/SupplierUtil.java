package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SupplierUtil{ 
/**
*public static <F,T> com.google.common.base.Supplier<T> com.google.common.base.Suppliers.compose(com.google.common.base.Function<? super F, T>,com.google.common.base.Supplier<F>)
*/ 
public static <F,T> com.google.common.base.Supplier<T> compose(com.google.common.base.Function<? super F, T> p0,com.google.common.base.Supplier<F> p1){
	return com.google.common.base.Suppliers.compose(p0,p1);
}
/**
*public static <T> com.google.common.base.Supplier<T> com.google.common.base.Suppliers.memoize(com.google.common.base.Supplier<T>)
*/ 
public static <T> com.google.common.base.Supplier<T> memoize(com.google.common.base.Supplier<T> p0){
	return com.google.common.base.Suppliers.memoize(p0);
}
/**
*public static <T> com.google.common.base.Supplier<T> com.google.common.base.Suppliers.memoizeWithExpiration(com.google.common.base.Supplier<T>,long,java.util.concurrent.TimeUnit)
*/ 
public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T> p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.base.Suppliers.memoizeWithExpiration(p0,p1,p2);
}
/**
*public static <T> com.google.common.base.Supplier<T> com.google.common.base.Suppliers.ofInstance(T)
*/ 
public static <T> com.google.common.base.Supplier<T> ofInstance(T p0){
	return com.google.common.base.Suppliers.ofInstance(p0);
}
/**
*public static <T> com.google.common.base.Supplier<T> com.google.common.base.Suppliers.synchronizedSupplier(com.google.common.base.Supplier<T>)
*/ 
public static <T> com.google.common.base.Supplier<T> synchronizedSupplier(com.google.common.base.Supplier<T> p0){
	return com.google.common.base.Suppliers.synchronizedSupplier(p0);
}
}
