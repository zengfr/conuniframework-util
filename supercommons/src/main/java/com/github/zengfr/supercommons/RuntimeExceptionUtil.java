package com.github.zengfr.supercommons;
import com.google.common.base.Throwables;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RuntimeExceptionUtil{ 
public static java.lang.RuntimeException propagate(java.lang.Throwable p0){
return Throwables.propagate(p0);
}
}
