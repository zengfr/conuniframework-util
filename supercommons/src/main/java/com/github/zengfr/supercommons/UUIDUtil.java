package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class UUIDUtil{ 
/**
*public static java.util.UUID org.apache.commons.lang3.Conversion.byteArrayToUuid(byte[],int)
*/ 
public static java.util.UUID byteArrayToUuid(byte[] p0,int p1){
	return org.apache.commons.lang3.Conversion.byteArrayToUuid(p0,p1);
}
/**
*public static byte[] org.apache.commons.lang3.Conversion.uuidToByteArray(java.util.UUID,byte[],int,int)
*/ 
public static byte[] uuidToByteArray(java.util.UUID p0,byte[] p1,int p2,int p3){
	return org.apache.commons.lang3.Conversion.uuidToByteArray(p0,p1,p2,p3);
}
}
