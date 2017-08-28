package com.zengfr.supercommons;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PrintWriterUtil{ 
public static void printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintWriter p1){
 ExceptionUtils.printRootCauseStackTrace(p0,p1);
}
}
