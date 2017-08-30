package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MappedByteBufferUtil{ 
/**
*public static java.nio.MappedByteBuffer com.google.common.io.Files.map(java.io.File) throws java.io.IOException
*/ 
public static java.nio.MappedByteBuffer map(java.io.File p0) throws java.io.IOException{
	return com.google.common.io.Files.map(p0);
}
/**
*public static java.nio.MappedByteBuffer com.google.common.io.Files.map(java.io.File,java.nio.channels.FileChannel$MapMode,long) throws java.io.FileNotFoundException,java.io.IOException
*/ 
public static java.nio.MappedByteBuffer map(java.io.File p0,MapMode p1,long p2) throws java.io.FileNotFoundException,java.io.IOException{
	return com.google.common.io.Files.map(p0,p1,p2);
}
/**
*public static java.nio.MappedByteBuffer com.google.common.io.Files.map(java.io.File,java.nio.channels.FileChannel$MapMode) throws java.io.IOException
*/ 
public static java.nio.MappedByteBuffer map(java.io.File p0,MapMode p1) throws java.io.IOException{
	return com.google.common.io.Files.map(p0,p1);
}
}
