package com.github.zengfr.supercommons;
import com.google.common.io.Flushables;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FlushableUtil{ 
public static void flush(java.io.Flushable p0,boolean p1) throws java.io.IOException{
 Flushables.flush(p0,p1);
}
public static void flushQuietly(java.io.Flushable p0){
 Flushables.flushQuietly(p0);
}
}
