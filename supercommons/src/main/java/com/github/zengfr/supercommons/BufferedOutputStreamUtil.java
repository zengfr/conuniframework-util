package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BufferedOutputStreamUtil{ 
/**
*public static java.io.BufferedOutputStream org.apache.commons.io.IOUtils.buffer(java.io.OutputStream,int)
*/ 
public static java.io.BufferedOutputStream buffer(java.io.OutputStream p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
}
/**
*public static java.io.BufferedOutputStream org.apache.commons.io.IOUtils.buffer(java.io.OutputStream)
*/ 
public static java.io.BufferedOutputStream buffer(java.io.OutputStream p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
}
