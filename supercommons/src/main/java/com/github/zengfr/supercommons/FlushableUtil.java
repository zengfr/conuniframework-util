package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FlushableUtil{ 
/**
*public static void com.google.common.io.Flushables.flush(java.io.Flushable,boolean) throws java.io.IOException
*/ 
public static void flush(java.io.Flushable p0,boolean p1) throws java.io.IOException{
	 com.google.common.io.Flushables.flush(p0,p1);
}
/**
*public static void com.google.common.io.Flushables.flushQuietly(java.io.Flushable)
*/ 
public static void flushQuietly(java.io.Flushable p0){
	 com.google.common.io.Flushables.flushQuietly(p0);
}
}
