package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OrderingUtil{ 
/**
*public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.from(com.google.common.collect.Ordering<T>)
*/ 
public static <T> com.google.common.collect.Ordering<T> from(com.google.common.collect.Ordering<T> p0){
	return com.google.common.collect.Ordering.from(p0);
}
/**
*public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.from(java.util.Comparator<T>)
*/ 
public static <T> com.google.common.collect.Ordering<T> from(java.util.Comparator<T> p0){
	return com.google.common.collect.Ordering.from(p0);
}
/**
*public static <C> com.google.common.collect.Ordering<C> com.google.common.collect.Ordering.natural()
*/ 
public static <C extends java.lang.Comparable > com.google.common.collect.Ordering<C> natural(){
	return com.google.common.collect.Ordering.natural();
}
/**
*public static com.google.common.collect.Ordering<java.lang.Object> com.google.common.collect.Ordering.usingToString()
*/ 
public static com.google.common.collect.Ordering<java.lang.Object> usingToString(){
	return com.google.common.collect.Ordering.usingToString();
}
/**
*public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.compound(java.lang.Iterable<? extends java.util.Comparator<? super T>>)
*/ 
public static <T> com.google.common.collect.Ordering<T> compound(java.lang.Iterable<? extends java.util.Comparator<? super T>> p0){
	return com.google.common.collect.Ordering.compound(p0);
}
/**
*public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.explicit(T,T...)
*/ 
public static <T> com.google.common.collect.Ordering<T> explicit(T p0,T... p1){
	return com.google.common.collect.Ordering.explicit(p0,p1);
}
/**
*public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.explicit(java.util.List<T>)
*/ 
public static <T> com.google.common.collect.Ordering<T> explicit(java.util.List<T> p0){
	return com.google.common.collect.Ordering.explicit(p0);
}
/**
*public static com.google.common.collect.Ordering<java.lang.Object> com.google.common.collect.Ordering.arbitrary()
*/ 
public static com.google.common.collect.Ordering<java.lang.Object> arbitrary(){
	return com.google.common.collect.Ordering.arbitrary();
}
/**
*public static com.google.common.collect.Ordering<java.lang.Object> com.google.common.collect.Ordering.allEqual()
*/ 
public static com.google.common.collect.Ordering<java.lang.Object> allEqual(){
	return com.google.common.collect.Ordering.allEqual();
}
}
