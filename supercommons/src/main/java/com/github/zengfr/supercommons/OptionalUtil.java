package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OptionalUtil{ 
/**
*public static <T> com.google.common.base.Optional<T> com.google.common.base.Enums.getIfPresent(java.lang.Class<T>,java.lang.String)
*/ 
public static <T extends java.lang.Enum<T> > com.google.common.base.Optional<T> getIfPresent(java.lang.Class<T> p0,java.lang.String p1){
	return com.google.common.base.Enums.getIfPresent(p0,p1);
}
/**
*public static <T> com.google.common.base.Optional<T> com.google.common.base.Optional.of(T)
*/ 
public static <T> com.google.common.base.Optional<T> of(T p0){
	return com.google.common.base.Optional.of(p0);
}
/**
*public static <T> com.google.common.base.Optional<T> com.google.common.base.Optional.fromNullable(T)
*/ 
public static <T> com.google.common.base.Optional<T> fromNullable(T p0){
	return com.google.common.base.Optional.fromNullable(p0);
}
/**
*public static <T> com.google.common.base.Optional<T> com.google.common.base.Optional.absent()
*/ 
public static <T> com.google.common.base.Optional<T> absent(){
	return com.google.common.base.Optional.absent();
}
/**
*public static <T> com.google.common.base.Optional<T> com.google.common.collect.Iterables.tryFind(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*/ 
public static <T> com.google.common.base.Optional<T> tryFind(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterables.tryFind(p0,p1);
}
/**
*public static <T> com.google.common.base.Optional<T> com.google.common.collect.Iterators.tryFind(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*/ 
public static <T> com.google.common.base.Optional<T> tryFind(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.tryFind(p0,p1);
}
}
