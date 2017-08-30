package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RefreshableExtSupplierUtil{ 
/**
*public static <T,E> com.facebook.util.RefreshableExtSupplier<T, E> com.facebook.util.ExtSuppliers.memoizeAllowRefresh(com.facebook.util.ExtSupplier<T, E>)
*/ 
public static <T,E extends java.lang.Throwable > com.facebook.util.RefreshableExtSupplier<T, E> memoizeAllowRefresh(com.facebook.util.ExtSupplier<T, E> p0){
	return com.facebook.util.ExtSuppliers.memoizeAllowRefresh(p0);
}
}
