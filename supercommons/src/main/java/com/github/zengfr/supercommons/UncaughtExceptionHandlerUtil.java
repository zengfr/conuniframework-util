package com.github.zengfr.supercommons;
import com.google.common.util.concurrent.UncaughtExceptionHandlers;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class UncaughtExceptionHandlerUtil{ 
public static java.lang.Thread.UncaughtExceptionHandler systemExit(){
return UncaughtExceptionHandlers.systemExit();
}
}
