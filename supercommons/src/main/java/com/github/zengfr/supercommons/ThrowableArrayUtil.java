package com.github.zengfr.supercommons;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ThrowableArrayUtil{ 
public static java.lang.Throwable[] getThrowables(java.lang.Throwable p0){
return ExceptionUtils.getThrowables(p0);
}
}
