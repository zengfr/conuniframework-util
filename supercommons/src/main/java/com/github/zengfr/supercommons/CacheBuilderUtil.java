package com.github.zengfr.supercommons;
import com.google.common.cache.CacheBuilder;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CacheBuilderUtil{ 
public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> from(com.google.common.cache.CacheBuilderSpec p0){
return CacheBuilder.from(p0);
}
public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> from(java.lang.String p0){
return CacheBuilder.from(p0);
}
public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> newBuilder(){
return CacheBuilder.newBuilder();
}
}
