package com.github.zengfr.supercommons;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheBuilderSpec;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CacheBuilderSpecUtil{ 
public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> from(com.google.common.cache.CacheBuilderSpec p0){
return CacheBuilder.from(p0);
}
public static com.google.common.cache.CacheBuilderSpec parse(java.lang.String p0){
return CacheBuilderSpec.parse(p0);
}
public static com.google.common.cache.CacheBuilderSpec disableCaching(){
return CacheBuilderSpec.disableCaching();
}
}
