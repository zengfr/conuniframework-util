package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteSourceUtil{ 
/**
*public static com.google.common.io.ByteSource com.google.common.io.Files.asByteSource(java.io.File)
*/ 
public static com.google.common.io.ByteSource asByteSource(java.io.File p0){
	return com.google.common.io.Files.asByteSource(p0);
}
/**
*public static com.google.common.io.ByteSource com.google.common.io.Resources.asByteSource(java.net.URL)
*/ 
public static com.google.common.io.ByteSource asByteSource(java.net.URL p0){
	return com.google.common.io.Resources.asByteSource(p0);
}
/**
*public static com.google.common.io.ByteSource com.google.common.io.ByteSource.concat(java.util.Iterator<? extends com.google.common.io.ByteSource>)
*/ 
public static com.google.common.io.ByteSource concat(java.util.Iterator<? extends com.google.common.io.ByteSource> p0){
	return com.google.common.io.ByteSource.concat(p0);
}
/**
*public static com.google.common.io.ByteSource com.google.common.io.ByteSource.concat(java.lang.Iterable<? extends com.google.common.io.ByteSource>)
*/ 
public static com.google.common.io.ByteSource concat(java.lang.Iterable<? extends com.google.common.io.ByteSource> p0){
	return com.google.common.io.ByteSource.concat(p0);
}
/**
*public static com.google.common.io.ByteSource com.google.common.io.ByteSource.concat(com.google.common.io.ByteSource...)
*/ 
public static com.google.common.io.ByteSource concat(com.google.common.io.ByteSource... p0){
	return com.google.common.io.ByteSource.concat(p0);
}
/**
*public static com.google.common.io.ByteSource com.google.common.io.ByteSource.empty()
*/ 
public static com.google.common.io.ByteSource empty(){
	return com.google.common.io.ByteSource.empty();
}
/**
*public static com.google.common.io.ByteSource com.google.common.io.ByteSource.wrap(byte[])
*/ 
public static com.google.common.io.ByteSource wrap(byte... p0){
	return com.google.common.io.ByteSource.wrap(p0);
}
}
