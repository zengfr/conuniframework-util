package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BufferedInputStreamUtil{ 
/**
*public static java.io.BufferedInputStream org.apache.commons.io.IOUtils.buffer(java.io.InputStream)
*/ 
public static java.io.BufferedInputStream buffer(java.io.InputStream p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
/**
*public static java.io.BufferedInputStream org.apache.commons.io.IOUtils.buffer(java.io.InputStream,int)
*/ 
public static java.io.BufferedInputStream buffer(java.io.InputStream p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
}
}
