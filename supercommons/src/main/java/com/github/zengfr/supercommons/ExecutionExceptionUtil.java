package com.github.zengfr.supercommons;
import org.apache.commons.lang3.concurrent.ConcurrentUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ExecutionExceptionUtil{ 
public static org.apache.commons.lang3.concurrent.ConcurrentException extractCause(java.util.concurrent.ExecutionException p0){
return ConcurrentUtils.extractCause(p0);
}
public static void handleCause(java.util.concurrent.ExecutionException p0) throws org.apache.commons.lang3.concurrent.ConcurrentException{
 ConcurrentUtils.handleCause(p0);
}
public static void handleCauseUnchecked(java.util.concurrent.ExecutionException p0){
 ConcurrentUtils.handleCauseUnchecked(p0);
}
public static org.apache.commons.lang3.concurrent.ConcurrentRuntimeException extractCauseUnchecked(java.util.concurrent.ExecutionException p0){
return ConcurrentUtils.extractCauseUnchecked(p0);
}
}
