package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class XUtil{ 
/**
*public static <V,X> com.google.common.util.concurrent.CheckedFuture<V, X> com.google.common.util.concurrent.Futures.immediateFailedCheckedFuture(X)
*/ 
public static <V,X extends java.lang.Exception > com.google.common.util.concurrent.CheckedFuture<V, X> immediateFailedCheckedFuture(X p0){
	return com.google.common.util.concurrent.Futures.immediateFailedCheckedFuture(p0);
}
}
