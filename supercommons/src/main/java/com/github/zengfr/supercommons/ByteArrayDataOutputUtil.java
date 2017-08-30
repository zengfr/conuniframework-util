package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteArrayDataOutputUtil{ 
/**
*public static com.google.common.io.ByteArrayDataOutput com.google.common.io.ByteStreams.newDataOutput()
*/ 
public static com.google.common.io.ByteArrayDataOutput newDataOutput(){
	return com.google.common.io.ByteStreams.newDataOutput();
}
/**
*public static com.google.common.io.ByteArrayDataOutput com.google.common.io.ByteStreams.newDataOutput(int)
*/ 
public static com.google.common.io.ByteArrayDataOutput newDataOutput(int p0){
	return com.google.common.io.ByteStreams.newDataOutput(p0);
}
/**
*public static com.google.common.io.ByteArrayDataOutput com.google.common.io.ByteStreams.newDataOutput(java.io.ByteArrayOutputStream)
*/ 
public static com.google.common.io.ByteArrayDataOutput newDataOutput(java.io.ByteArrayOutputStream p0){
	return com.google.common.io.ByteStreams.newDataOutput(p0);
}
}
