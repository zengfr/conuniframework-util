package com.github.zengfr.supercommons;
import com.google.common.cache.CacheLoader;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CacheLoaderUtil{ 
public static <V> com.google.common.cache.CacheLoader<java.lang.Object, V> from(com.google.common.base.Supplier<V> p0){
return CacheLoader.from(p0);
}
public static <K,V> com.google.common.cache.CacheLoader<K, V> from(com.google.common.base.Function<K, V> p0){
return CacheLoader.from(p0);
}
public static <K,V> com.google.common.cache.CacheLoader<K, V> asyncReloading(com.google.common.cache.CacheLoader<K, V> p0,java.util.concurrent.Executor p1){
return CacheLoader.asyncReloading(p0,p1);
}
}
