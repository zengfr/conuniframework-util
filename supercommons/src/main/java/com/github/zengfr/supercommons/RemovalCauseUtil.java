package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RemovalCauseUtil{ 
/**
*public static com.google.common.cache.RemovalCause com.google.common.cache.RemovalCause.valueOf(java.lang.String)
*/ 
public static com.google.common.cache.RemovalCause valueOf(java.lang.String p0){
	return com.google.common.cache.RemovalCause.valueOf(p0);
}
/**
*public static <K,V> com.google.common.cache.RemovalNotification<K, V> com.google.common.cache.RemovalNotification.create(K,V,com.google.common.cache.RemovalCause)
*/ 
public static <K,V> com.google.common.cache.RemovalNotification<K, V> create(K p0,V p1,com.google.common.cache.RemovalCause p2){
	return com.google.common.cache.RemovalNotification.create(p0,p1,p2);
}
}
