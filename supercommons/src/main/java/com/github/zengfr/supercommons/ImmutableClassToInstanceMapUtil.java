package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableClassToInstanceMapUtil{ 
/**
*public static <B,S> com.google.common.collect.ImmutableClassToInstanceMap<B> com.google.common.collect.ImmutableClassToInstanceMap.copyOf(java.util.Map<? extends java.lang.Class<? extends S>, ? extends S>)
*/ 
public static <B,S> com.google.common.collect.ImmutableClassToInstanceMap<B> copyOf(java.util.Map<? extends java.lang.Class<? extends S>, ? extends S> p0){
	return com.google.common.collect.ImmutableClassToInstanceMap.copyOf(p0);
}
/**
*public static <B,T> com.google.common.collect.ImmutableClassToInstanceMap<B> com.google.common.collect.ImmutableClassToInstanceMap.of(java.lang.Class<T>,T)
*/ 
public static <B,T> com.google.common.collect.ImmutableClassToInstanceMap<B> of(java.lang.Class<T> p0,T p1){
	return com.google.common.collect.ImmutableClassToInstanceMap.of(p0,p1);
}
/**
*public static <B> com.google.common.collect.ImmutableClassToInstanceMap<B> com.google.common.collect.ImmutableClassToInstanceMap.of()
*/ 
public static <B> com.google.common.collect.ImmutableClassToInstanceMap<B> of(){
	return com.google.common.collect.ImmutableClassToInstanceMap.of();
}
}
