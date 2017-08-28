package com.github.zengfr.supercommons;
import com.google.common.base.Functions;
import com.google.common.base.Suppliers;
import com.google.common.collect.Interners;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FunctionUtil{ 
public static <E> com.google.common.base.Function<E, E> identity(){
return Functions.identity();
}
public static <E> com.google.common.base.Function<java.lang.Object, E> constant(E p0){
return Functions.constant(p0);
}
public static <A,B,C> com.google.common.base.Function<A, C> compose(com.google.common.base.Function<B, C> p0,com.google.common.base.Function<A, ? extends B> p1){
return Functions.compose(p0,p1);
}
public static <T> com.google.common.base.Function<T, java.lang.Boolean> forPredicate(com.google.common.base.Predicate<T> p0){
return Functions.forPredicate(p0);
}
public static <K,V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, ? extends V> p0,V p1){
return Functions.forMap(p0,p1);
}
public static <K,V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, V> p0){
return Functions.forMap(p0);
}
public static com.google.common.base.Function<java.lang.Object, java.lang.String> toStringFunction(){
return Functions.toStringFunction();
}
public static <T> com.google.common.base.Function<java.lang.Object, T> forSupplier(com.google.common.base.Supplier<T> p0){
return Functions.forSupplier(p0);
}
public static <T> com.google.common.base.Function<com.google.common.base.Supplier<T>, T> supplierFunction(){
return Suppliers.supplierFunction();
}
public static <E> com.google.common.base.Function<E, E> asFunction(com.google.common.collect.Interner<E> p0){
return Interners.asFunction(p0);
}
}
