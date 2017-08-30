package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class URLConnectionUtil{ 
/**
*public static void org.apache.commons.io.IOUtils.close(java.net.URLConnection)
*/ 
public static void close(java.net.URLConnection p0){
	 org.apache.commons.io.IOUtils.close(p0);
}
/**
*public static byte[] org.apache.commons.io.IOUtils.toByteArray(java.net.URLConnection) throws java.io.IOException
*/ 
public static byte[] toByteArray(java.net.URLConnection p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toByteArray(p0);
}
}
