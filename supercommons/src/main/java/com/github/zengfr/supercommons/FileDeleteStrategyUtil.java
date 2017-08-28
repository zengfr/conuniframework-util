package com.zengfr.supercommons;
import org.apache.commons.io.FileCleaner;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileDeleteStrategyUtil{ 
public static void track(java.lang.String p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
 FileCleaner.track(p0,p1,p2);
}
public static void track(java.io.File p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
 FileCleaner.track(p0,p1,p2);
}
}
