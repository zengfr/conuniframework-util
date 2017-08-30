package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteArrayDataInputUtil{ 
/**
*public static com.google.common.io.ByteArrayDataInput com.google.common.io.ByteStreams.newDataInput(byte[],int)
*/ 
public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] p0,int p1){
	return com.google.common.io.ByteStreams.newDataInput(p0,p1);
}
/**
*public static com.google.common.io.ByteArrayDataInput com.google.common.io.ByteStreams.newDataInput(byte[])
*/ 
public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] p0){
	return com.google.common.io.ByteStreams.newDataInput(p0);
}
/**
*public static com.google.common.io.ByteArrayDataInput com.google.common.io.ByteStreams.newDataInput(java.io.ByteArrayInputStream)
*/ 
public static com.google.common.io.ByteArrayDataInput newDataInput(java.io.ByteArrayInputStream p0){
	return com.google.common.io.ByteStreams.newDataInput(p0);
}
}
