package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConcurrentExceptionUtil{ 
/**
*public static org.apache.commons.lang3.concurrent.ConcurrentException org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCause(java.util.concurrent.ExecutionException)
*/ 
public static org.apache.commons.lang3.concurrent.ConcurrentException extractCause(java.util.concurrent.ExecutionException p0){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCause(p0);
}
}
