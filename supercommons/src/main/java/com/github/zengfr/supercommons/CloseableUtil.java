package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CloseableUtil{ 
/**
*public static void com.google.common.io.Closeables.close(java.io.Closeable,boolean) throws java.io.IOException
*/ 
public static void close(java.io.Closeable p0,boolean p1) throws java.io.IOException{
	 com.google.common.io.Closeables.close(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.closeQuietly(java.io.Closeable)
*/ 
public static void closeQuietly(java.io.Closeable p0){
	 org.apache.commons.io.IOUtils.closeQuietly(p0);
}
}
