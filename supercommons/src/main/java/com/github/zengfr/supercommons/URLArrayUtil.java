package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class URLArrayUtil{ 
/**
*public static java.io.File[] org.apache.commons.io.FileUtils.toFiles(java.net.URL[])
*/ 
public static java.io.File[] toFiles(java.net.URL[] p0){
	return org.apache.commons.io.FileUtils.toFiles(p0);
}
/**
*public static java.net.URL[] org.apache.commons.io.FileUtils.toURLs(java.io.File[]) throws java.io.IOException
*/ 
public static java.net.URL[] toURLs(java.io.File[] p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.toURLs(p0);
}
}
