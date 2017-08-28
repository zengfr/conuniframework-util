package com.zengfr.supercommons;
import com.facebook.util.ExceptionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ExceptionUtil{ 
public static <T extends java.lang.Exception ,S extends java.lang.Exception > T wrap(S p0,java.lang.Class<T> p1){
return ExceptionUtils.wrap(p0,p1);
}
}
