package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AtomicReferenceUtil{ 
/**
*public static <V> java.util.concurrent.atomic.AtomicReference<V> com.google.common.util.concurrent.Atomics.newReference()
*/ 
public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference(){
	return com.google.common.util.concurrent.Atomics.newReference();
}
/**
*public static <V> java.util.concurrent.atomic.AtomicReference<V> com.google.common.util.concurrent.Atomics.newReference(V)
*/ 
public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference(V p0){
	return com.google.common.util.concurrent.Atomics.newReference(p0);
}
}
