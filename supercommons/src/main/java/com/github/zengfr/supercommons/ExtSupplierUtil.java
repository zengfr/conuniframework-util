package com.github.zengfr.supercommons;
import com.facebook.util.ExtSuppliers;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ExtSupplierUtil{ 
public static <T,E extends java.lang.Throwable > com.facebook.util.ExtSupplier<T, E> memoize(com.facebook.util.ExtSupplier<T, E> p0){
return ExtSuppliers.memoize(p0);
}
public static <T,E extends java.lang.Throwable > com.facebook.util.ExtSupplier<T, E> ofInstance(T p0){
return ExtSuppliers.ofInstance(p0);
}
}
