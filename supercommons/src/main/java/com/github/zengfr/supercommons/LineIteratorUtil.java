package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LineIteratorUtil{ 
/**
*public static org.apache.commons.io.LineIterator org.apache.commons.io.IOUtils.lineIterator(java.io.Reader)
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.Reader p0){
	return org.apache.commons.io.IOUtils.lineIterator(p0);
}
/**
*public static org.apache.commons.io.LineIterator org.apache.commons.io.IOUtils.lineIterator(java.io.InputStream,java.lang.String) throws java.io.IOException
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.lineIterator(p0,p1);
}
/**
*public static org.apache.commons.io.LineIterator org.apache.commons.io.IOUtils.lineIterator(java.io.InputStream,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.lineIterator(p0,p1);
}
/**
*public static void org.apache.commons.io.LineIterator.closeQuietly(org.apache.commons.io.LineIterator)
*/ 
public static void closeQuietly(org.apache.commons.io.LineIterator p0){
	 org.apache.commons.io.LineIterator.closeQuietly(p0);
}
/**
*public static org.apache.commons.io.LineIterator org.apache.commons.io.FileUtils.lineIterator(java.io.File) throws java.io.IOException
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.lineIterator(p0);
}
/**
*public static org.apache.commons.io.LineIterator org.apache.commons.io.FileUtils.lineIterator(java.io.File,java.lang.String) throws java.io.IOException
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.lineIterator(p0,p1);
}
}
