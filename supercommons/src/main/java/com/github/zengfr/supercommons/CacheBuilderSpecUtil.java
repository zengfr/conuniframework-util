package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CacheBuilderSpecUtil{ 
/**
*public static com.google.common.cache.CacheBuilderSpec com.google.common.cache.CacheBuilderSpec.disableCaching()
*/ 
public static com.google.common.cache.CacheBuilderSpec disableCaching(){
	return com.google.common.cache.CacheBuilderSpec.disableCaching();
}
/**
*public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> com.google.common.cache.CacheBuilder.from(com.google.common.cache.CacheBuilderSpec)
*/ 
public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> from(com.google.common.cache.CacheBuilderSpec p0){
	return com.google.common.cache.CacheBuilder.from(p0);
}
/**
*public static com.google.common.cache.CacheBuilderSpec com.google.common.cache.CacheBuilderSpec.parse(java.lang.String)
*/ 
public static com.google.common.cache.CacheBuilderSpec parse(java.lang.String p0){
	return com.google.common.cache.CacheBuilderSpec.parse(p0);
}
}
