package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ExecutionExceptionUtil{ 
/**
*public static org.apache.commons.lang3.concurrent.ConcurrentException org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCause(java.util.concurrent.ExecutionException)
*/ 
public static org.apache.commons.lang3.concurrent.ConcurrentException extractCause(java.util.concurrent.ExecutionException p0){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCause(p0);
}
/**
*public static void org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCause(java.util.concurrent.ExecutionException) throws org.apache.commons.lang3.concurrent.ConcurrentException
*/ 
public static void handleCause(java.util.concurrent.ExecutionException p0) throws org.apache.commons.lang3.concurrent.ConcurrentException{
	 org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCause(p0);
}
/**
*public static void org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCauseUnchecked(java.util.concurrent.ExecutionException)
*/ 
public static void handleCauseUnchecked(java.util.concurrent.ExecutionException p0){
	 org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCauseUnchecked(p0);
}
/**
*public static org.apache.commons.lang3.concurrent.ConcurrentRuntimeException org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCauseUnchecked(java.util.concurrent.ExecutionException)
*/ 
public static org.apache.commons.lang3.concurrent.ConcurrentRuntimeException extractCauseUnchecked(java.util.concurrent.ExecutionException p0){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCauseUnchecked(p0);
}
}
