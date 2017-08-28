package com.github.zengfr.supercommons;
import com.google.common.util.concurrent.Futures;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CheckedFutureUtil{ 
public static <V,X extends java.lang.Exception > com.google.common.util.concurrent.CheckedFuture<V, X> immediateFailedCheckedFuture(X p0){
return Futures.immediateFailedCheckedFuture(p0);
}
public static <V,X extends java.lang.Exception > com.google.common.util.concurrent.CheckedFuture<V, X> immediateCheckedFuture(V p0){
return Futures.immediateCheckedFuture(p0);
}
public static <V,X extends java.lang.Exception > com.google.common.util.concurrent.CheckedFuture<V, X> makeChecked(com.google.common.util.concurrent.ListenableFuture<V> p0,com.google.common.base.Function<? super java.lang.Exception, X> p1){
return Futures.makeChecked(p0,p1);
}
}
