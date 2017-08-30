package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RemovalListenerUtil{ 
/**
*public static <K,V> com.google.common.cache.RemovalListener<K, V> com.google.common.cache.RemovalListeners.asynchronous(com.google.common.cache.RemovalListener<K, V>,java.util.concurrent.Executor)
*/ 
public static <K,V> com.google.common.cache.RemovalListener<K, V> asynchronous(com.google.common.cache.RemovalListener<K, V> p0,java.util.concurrent.Executor p1){
	return com.google.common.cache.RemovalListeners.asynchronous(p0,p1);
}
}
