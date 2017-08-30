package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ExtSupplierUtil{ 
/**
*public static <T,E> com.facebook.util.ExtSupplier<T, E> com.facebook.util.ExtSuppliers.ofInstance(T)
*/ 
public static <T,E extends java.lang.Throwable > com.facebook.util.ExtSupplier<T, E> ofInstance(T p0){
	return com.facebook.util.ExtSuppliers.ofInstance(p0);
}
/**
*public static <T,E> com.facebook.util.ExtSupplier<T, E> com.facebook.util.ExtSuppliers.memoize(com.facebook.util.ExtSupplier<T, E>)
*/ 
public static <T,E extends java.lang.Throwable > com.facebook.util.ExtSupplier<T, E> memoize(com.facebook.util.ExtSupplier<T, E> p0){
	return com.facebook.util.ExtSuppliers.memoize(p0);
}
}
