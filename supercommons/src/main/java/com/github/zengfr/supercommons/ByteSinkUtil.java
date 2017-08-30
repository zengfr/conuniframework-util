package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteSinkUtil{ 
/**
*public static com.google.common.io.ByteSink com.google.common.io.Files.asByteSink(java.io.File,com.google.common.io.FileWriteMode...)
*/ 
public static com.google.common.io.ByteSink asByteSink(java.io.File p0,com.google.common.io.FileWriteMode... p1){
	return com.google.common.io.Files.asByteSink(p0,p1);
}
}
