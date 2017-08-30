package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConcurrentMapUtil{ 
/**
*public static <K,V> java.util.concurrent.ConcurrentMap<K, V> com.google.common.collect.Maps.newConcurrentMap()
*/ 
public static <K,V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentMap(){
	return com.google.common.collect.Maps.newConcurrentMap();
}
}
