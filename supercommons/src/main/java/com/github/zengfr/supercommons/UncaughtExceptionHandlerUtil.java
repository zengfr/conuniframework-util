package com.github.zengfr.supercommons;

import java.lang.Thread.UncaughtExceptionHandler;

/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class UncaughtExceptionHandlerUtil{
/**
*public static java.lang.Thread$UncaughtExceptionHandler com.google.common.util.concurrent.UncaughtExceptionHandlers.systemExit()
*/
public static UncaughtExceptionHandler systemExit(){
	return com.google.common.util.concurrent.UncaughtExceptionHandlers.systemExit();
}
}
