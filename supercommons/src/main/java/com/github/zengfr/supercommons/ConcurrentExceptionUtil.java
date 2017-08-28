package com.zengfr.supercommons;
import org.apache.commons.lang3.concurrent.ConcurrentUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConcurrentExceptionUtil{ 
public static org.apache.commons.lang3.concurrent.ConcurrentException extractCause(java.util.concurrent.ExecutionException p0){
return ConcurrentUtils.extractCause(p0);
}
}
