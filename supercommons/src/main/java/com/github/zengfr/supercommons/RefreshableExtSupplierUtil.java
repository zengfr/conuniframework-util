package com.zengfr.supercommons;
import com.facebook.util.ExtSuppliers;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RefreshableExtSupplierUtil{ 
public static <T,E extends java.lang.Throwable > com.facebook.util.RefreshableExtSupplier<T, E> memoizeAllowRefresh(com.facebook.util.ExtSupplier<T, E> p0){
return ExtSuppliers.memoizeAllowRefresh(p0);
}
}
