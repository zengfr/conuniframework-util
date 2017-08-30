package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FunctionUtil{ 
/**
*public static <E> com.google.common.base.Function<E, E> com.google.common.collect.Interners.asFunction(com.google.common.collect.Interner<E>)
*/ 
public static <E> com.google.common.base.Function<E, E> asFunction(com.google.common.collect.Interner<E> p0){
	return com.google.common.collect.Interners.asFunction(p0);
}
/**
*public static <A,B,C> com.google.common.base.Function<A, C> com.google.common.base.Functions.compose(com.google.common.base.Function<B, C>,com.google.common.base.Function<A, ? extends B>)
*/ 
public static <A,B,C> com.google.common.base.Function<A, C> compose(com.google.common.base.Function<B, C> p0,com.google.common.base.Function<A, ? extends B> p1){
	return com.google.common.base.Functions.compose(p0,p1);
}
/**
*public static <E> com.google.common.base.Function<java.lang.Object, E> com.google.common.base.Functions.constant(E)
*/ 
public static <E> com.google.common.base.Function<java.lang.Object, E> constant(E p0){
	return com.google.common.base.Functions.constant(p0);
}
/**
*public static <K,V> com.google.common.base.Function<K, V> com.google.common.base.Functions.forMap(java.util.Map<K, V>)
*/ 
public static <K,V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, V> p0){
	return com.google.common.base.Functions.forMap(p0);
}
/**
*public static <K,V> com.google.common.base.Function<K, V> com.google.common.base.Functions.forMap(java.util.Map<K, ? extends V>,V)
*/ 
public static <K,V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, ? extends V> p0,V p1){
	return com.google.common.base.Functions.forMap(p0,p1);
}
/**
*public static <T> com.google.common.base.Function<T, java.lang.Boolean> com.google.common.base.Functions.forPredicate(com.google.common.base.Predicate<T>)
*/ 
public static <T> com.google.common.base.Function<T, java.lang.Boolean> forPredicate(com.google.common.base.Predicate<T> p0){
	return com.google.common.base.Functions.forPredicate(p0);
}
/**
*public static <T> com.google.common.base.Function<java.lang.Object, T> com.google.common.base.Functions.forSupplier(com.google.common.base.Supplier<T>)
*/ 
public static <T> com.google.common.base.Function<java.lang.Object, T> forSupplier(com.google.common.base.Supplier<T> p0){
	return com.google.common.base.Functions.forSupplier(p0);
}
/**
*public static <E> com.google.common.base.Function<E, E> com.google.common.base.Functions.identity()
*/ 
public static <E> com.google.common.base.Function<E, E> identity(){
	return com.google.common.base.Functions.identity();
}
/**
*public static <T> com.google.common.base.Function<com.google.common.base.Supplier<T>, T> com.google.common.base.Suppliers.supplierFunction()
*/ 
public static <T> com.google.common.base.Function<com.google.common.base.Supplier<T>, T> supplierFunction(){
	return com.google.common.base.Suppliers.supplierFunction();
}
/**
*public static com.google.common.base.Function<java.lang.Object, java.lang.String> com.google.common.base.Functions.toStringFunction()
*/ 
public static com.google.common.base.Function<java.lang.Object, java.lang.String> toStringFunction(){
	return com.google.common.base.Functions.toStringFunction();
}
}
