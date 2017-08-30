package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConcurrentRuntimeExceptionUtil{ 
/**
*public static org.apache.commons.lang3.concurrent.ConcurrentRuntimeException org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCauseUnchecked(java.util.concurrent.ExecutionException)
*/ 
public static org.apache.commons.lang3.concurrent.ConcurrentRuntimeException extractCauseUnchecked(java.util.concurrent.ExecutionException p0){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCauseUnchecked(p0);
}
}
