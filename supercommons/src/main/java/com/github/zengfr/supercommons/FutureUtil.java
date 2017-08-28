package com.zengfr.supercommons;
import com.google.common.util.concurrent.Futures;
import org.apache.commons.lang3.concurrent.ConcurrentUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FutureUtil{ 
public static <I,O> java.util.concurrent.Future<O> lazyTransform(java.util.concurrent.Future<I> p0,com.google.common.base.Function<? super I, ? extends O> p1){
return Futures.lazyTransform(p0,p1);
}
public static <T> java.util.concurrent.Future<T> constantFuture(T p0){
return ConcurrentUtils.constantFuture(p0);
}
}
