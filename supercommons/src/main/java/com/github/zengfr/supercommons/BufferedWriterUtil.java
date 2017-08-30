package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BufferedWriterUtil{ 
/**
*public static java.io.BufferedWriter org.apache.commons.io.IOUtils.buffer(java.io.Writer)
*/ 
public static java.io.BufferedWriter buffer(java.io.Writer p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
/**
*public static java.io.BufferedWriter org.apache.commons.io.IOUtils.buffer(java.io.Writer,int)
*/ 
public static java.io.BufferedWriter buffer(java.io.Writer p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
}
/**
*public static java.io.BufferedWriter com.google.common.io.Files.newWriter(java.io.File,java.nio.charset.Charset) throws java.io.FileNotFoundException
*/ 
public static java.io.BufferedWriter newWriter(java.io.File p0,java.nio.charset.Charset p1) throws java.io.FileNotFoundException{
	return com.google.common.io.Files.newWriter(p0,p1);
}
}
