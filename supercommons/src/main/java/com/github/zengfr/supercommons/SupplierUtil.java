package com.github.zengfr.supercommons;
import com.google.common.base.Suppliers;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SupplierUtil{ 
public static <F,T> com.google.common.base.Supplier<T> compose(com.google.common.base.Function<? super F, T> p0,com.google.common.base.Supplier<F> p1){
return Suppliers.compose(p0,p1);
}
public static <T> com.google.common.base.Supplier<T> synchronizedSupplier(com.google.common.base.Supplier<T> p0){
return Suppliers.synchronizedSupplier(p0);
}
public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T> p0,long p1,java.util.concurrent.TimeUnit p2){
return Suppliers.memoizeWithExpiration(p0,p1,p2);
}
public static <T> com.google.common.base.Supplier<T> memoize(com.google.common.base.Supplier<T> p0){
return Suppliers.memoize(p0);
}
public static <T> com.google.common.base.Supplier<T> ofInstance(T p0){
return Suppliers.ofInstance(p0);
}
}
