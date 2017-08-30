package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AtomicReferenceArrayUtil{ 
/**
*public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> com.google.common.util.concurrent.Atomics.newReferenceArray(int)
*/ 
public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(int p0){
	return com.google.common.util.concurrent.Atomics.newReferenceArray(p0);
}
/**
*public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> com.google.common.util.concurrent.Atomics.newReferenceArray(E[])
*/ 
public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(E[] p0){
	return com.google.common.util.concurrent.Atomics.newReferenceArray(p0);
}
}
