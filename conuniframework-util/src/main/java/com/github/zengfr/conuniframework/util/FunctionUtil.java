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
public final class FunctionUtil{ 
/**
*{@link com.google.common.collect.Interners#asFunction(com.google.common.collect.Interner<E>)}
*@see com.google.common.collect.Interners#asFunction(com.google.common.collect.Interner<E>)
*<code>public static <E> com.google.common.base.Function<E, E> com.google.common.collect.Interners.asFunction(com.google.common.collect.Interner<E>)
*asFunction(com.google.common.collect.Interner<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.base.Function<E, E> asFunction(com.google.common.collect.Interner<E> p0){
	return com.google.common.collect.Interners.asFunction(p0);
}
/**
*{@link com.google.common.base.Functions#compose(com.google.common.base.Function<B, C>,com.google.common.base.Function<A, ? extends B>)}
*@see com.google.common.base.Functions#compose(com.google.common.base.Function<B, C>,com.google.common.base.Function<A, ? extends B>)
*<code>public static <A,B,C> com.google.common.base.Function<A, C> com.google.common.base.Functions.compose(com.google.common.base.Function<B, C>,com.google.common.base.Function<A, ? extends B>)
*compose(com.google.common.base.Function<B, C> p0,com.google.common.base.Function<A, ? extends B> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <A,B,C> com.google.common.base.Function<A, C> compose(com.google.common.base.Function<B, C> p0,com.google.common.base.Function<A, ? extends B> p1){
	return com.google.common.base.Functions.compose(p0,p1);
}
/**
*{@link com.google.common.base.Functions#constant(E)}
*@see com.google.common.base.Functions#constant(E)
*<code>public static <E> com.google.common.base.Function<java.lang.Object, E> com.google.common.base.Functions.constant(E)
*constant(E p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.base.Function<java.lang.Object, E> constant(E p0){
	return com.google.common.base.Functions.constant(p0);
}
/**
*{@link com.google.common.base.Functions#forMap(java.util.Map<K, ? extends V>,V)}
*@see com.google.common.base.Functions#forMap(java.util.Map<K, ? extends V>,V)
*<code>public static <K,V> com.google.common.base.Function<K, V> com.google.common.base.Functions.forMap(java.util.Map<K, ? extends V>,V)
*forMap(java.util.Map<K, ? extends V> p0,V p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, ? extends V> p0,V p1){
	return com.google.common.base.Functions.forMap(p0,p1);
}
/**
*{@link com.google.common.base.Functions#forMap(java.util.Map<K, V>)}
*@see com.google.common.base.Functions#forMap(java.util.Map<K, V>)
*<code>public static <K,V> com.google.common.base.Function<K, V> com.google.common.base.Functions.forMap(java.util.Map<K, V>)
*forMap(java.util.Map<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, V> p0){
	return com.google.common.base.Functions.forMap(p0);
}
/**
*{@link com.google.common.base.Functions#forPredicate(com.google.common.base.Predicate<T>)}
*@see com.google.common.base.Functions#forPredicate(com.google.common.base.Predicate<T>)
*<code>public static <T> com.google.common.base.Function<T, java.lang.Boolean> com.google.common.base.Functions.forPredicate(com.google.common.base.Predicate<T>)
*forPredicate(com.google.common.base.Predicate<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Function<T, java.lang.Boolean> forPredicate(com.google.common.base.Predicate<T> p0){
	return com.google.common.base.Functions.forPredicate(p0);
}
/**
*{@link com.google.common.base.Functions#forSupplier(com.google.common.base.Supplier<T>)}
*@see com.google.common.base.Functions#forSupplier(com.google.common.base.Supplier<T>)
*<code>public static <T> com.google.common.base.Function<java.lang.Object, T> com.google.common.base.Functions.forSupplier(com.google.common.base.Supplier<T>)
*forSupplier(com.google.common.base.Supplier<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Function<java.lang.Object, T> forSupplier(com.google.common.base.Supplier<T> p0){
	return com.google.common.base.Functions.forSupplier(p0);
}
/**
*{@link com.google.common.base.Functions#identity()}
*@see com.google.common.base.Functions#identity()
*<code>public static <E> com.google.common.base.Function<E, E> com.google.common.base.Functions.identity()
*identity()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.base.Function<E, E> identity(){
	return com.google.common.base.Functions.identity();
}
/**
*{@link com.facebook.util.function.ExtFunction#quiet(com.facebook.util.function.ExtFunction<T, R, ?>)}
*@see com.facebook.util.function.ExtFunction#quiet(com.facebook.util.function.ExtFunction<T, R, ?>)
*<code>public static <T,R> java.util.function.Function<T, R> com.facebook.util.function.ExtFunction.quiet(com.facebook.util.function.ExtFunction<T, R, ?>)
*quiet(com.facebook.util.function.ExtFunction<T, R, ?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,R> java.util.function.Function<T, R> quiet(com.facebook.util.function.ExtFunction<T, R, ?> p0){
	return com.facebook.util.function.ExtFunction.quiet(p0);
}
/**
*{@link com.google.common.base.Suppliers#supplierFunction()}
*@see com.google.common.base.Suppliers#supplierFunction()
*<code>public static <T> com.google.common.base.Function<com.google.common.base.Supplier<T>, T> com.google.common.base.Suppliers.supplierFunction()
*supplierFunction()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.base.Function<com.google.common.base.Supplier<T>, T> supplierFunction(){
	return com.google.common.base.Suppliers.supplierFunction();
}
/**
*{@link com.google.common.base.Functions#toStringFunction()}
*@see com.google.common.base.Functions#toStringFunction()
*<code>public static com.google.common.base.Function<java.lang.Object, java.lang.String> com.google.common.base.Functions.toStringFunction()
*toStringFunction()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Function<java.lang.Object, java.lang.String> toStringFunction(){
	return com.google.common.base.Functions.toStringFunction();
}
}
