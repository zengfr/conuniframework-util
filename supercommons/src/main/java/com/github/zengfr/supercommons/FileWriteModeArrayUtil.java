package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileWriteModeArrayUtil{ 
/**
*public static com.google.common.io.FileWriteMode[] com.google.common.io.FileWriteMode.values()
*/ 
public static com.google.common.io.FileWriteMode[] values(){
	return com.google.common.io.FileWriteMode.values();
}
/**
*public static com.google.common.io.CharSink com.google.common.io.Files.asCharSink(java.io.File,java.nio.charset.Charset,com.google.common.io.FileWriteMode...)
*/ 
public static com.google.common.io.CharSink asCharSink(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.FileWriteMode... p2){
	return com.google.common.io.Files.asCharSink(p0,p1,p2);
}
/**
*public static com.google.common.io.ByteSink com.google.common.io.Files.asByteSink(java.io.File,com.google.common.io.FileWriteMode...)
*/ 
public static com.google.common.io.ByteSink asByteSink(java.io.File p0,com.google.common.io.FileWriteMode... p1){
	return com.google.common.io.Files.asByteSink(p0,p1);
}
}
