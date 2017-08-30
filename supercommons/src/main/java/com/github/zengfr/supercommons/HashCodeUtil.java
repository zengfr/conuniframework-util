package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashCodeUtil{ 
/**
*public static com.google.common.hash.HashCode com.google.common.hash.HashCode.fromBytes(byte[])
*/ 
public static com.google.common.hash.HashCode fromBytes(byte[] p0){
	return com.google.common.hash.HashCode.fromBytes(p0);
}
/**
*public static com.google.common.hash.HashCode com.google.common.hash.HashCode.fromInt(int)
*/ 
public static com.google.common.hash.HashCode fromInt(int p0){
	return com.google.common.hash.HashCode.fromInt(p0);
}
/**
*public static com.google.common.hash.HashCode com.google.common.hash.HashCode.fromString(java.lang.String)
*/ 
public static com.google.common.hash.HashCode fromString(java.lang.String p0){
	return com.google.common.hash.HashCode.fromString(p0);
}
/**
*public static com.google.common.hash.HashCode com.google.common.hash.HashCode.fromLong(long)
*/ 
public static com.google.common.hash.HashCode fromLong(long p0){
	return com.google.common.hash.HashCode.fromLong(p0);
}
/**
*public static int com.google.common.hash.Hashing.consistentHash(com.google.common.hash.HashCode,int)
*/ 
public static int consistentHash(com.google.common.hash.HashCode p0,int p1){
	return com.google.common.hash.Hashing.consistentHash(p0,p1);
}
/**
*public static com.google.common.hash.HashCode com.google.common.hash.Hashing.combineUnordered(java.lang.Iterable<com.google.common.hash.HashCode>)
*/ 
public static com.google.common.hash.HashCode combineUnordered(java.lang.Iterable<com.google.common.hash.HashCode> p0){
	return com.google.common.hash.Hashing.combineUnordered(p0);
}
/**
*public static com.google.common.hash.HashCode com.google.common.hash.Hashing.combineOrdered(java.lang.Iterable<com.google.common.hash.HashCode>)
*/ 
public static com.google.common.hash.HashCode combineOrdered(java.lang.Iterable<com.google.common.hash.HashCode> p0){
	return com.google.common.hash.Hashing.combineOrdered(p0);
}
}
