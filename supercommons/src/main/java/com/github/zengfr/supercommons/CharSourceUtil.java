package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharSourceUtil{ 
/**
*public static com.google.common.io.CharSource com.google.common.io.Files.asCharSource(java.io.File,java.nio.charset.Charset)
*/ 
public static com.google.common.io.CharSource asCharSource(java.io.File p0,java.nio.charset.Charset p1){
	return com.google.common.io.Files.asCharSource(p0,p1);
}
/**
*public static com.google.common.io.CharSource com.google.common.io.Resources.asCharSource(java.net.URL,java.nio.charset.Charset)
*/ 
public static com.google.common.io.CharSource asCharSource(java.net.URL p0,java.nio.charset.Charset p1){
	return com.google.common.io.Resources.asCharSource(p0,p1);
}
/**
*public static com.google.common.io.CharSource com.google.common.io.CharSource.concat(com.google.common.io.CharSource...)
*/ 
public static com.google.common.io.CharSource concat(com.google.common.io.CharSource... p0){
	return com.google.common.io.CharSource.concat(p0);
}
/**
*public static com.google.common.io.CharSource com.google.common.io.CharSource.concat(java.util.Iterator<? extends com.google.common.io.CharSource>)
*/ 
public static com.google.common.io.CharSource concat(java.util.Iterator<? extends com.google.common.io.CharSource> p0){
	return com.google.common.io.CharSource.concat(p0);
}
/**
*public static com.google.common.io.CharSource com.google.common.io.CharSource.concat(java.lang.Iterable<? extends com.google.common.io.CharSource>)
*/ 
public static com.google.common.io.CharSource concat(java.lang.Iterable<? extends com.google.common.io.CharSource> p0){
	return com.google.common.io.CharSource.concat(p0);
}
/**
*public static com.google.common.io.CharSource com.google.common.io.CharSource.empty()
*/ 
public static com.google.common.io.CharSource empty(){
	return com.google.common.io.CharSource.empty();
}
/**
*public static com.google.common.io.CharSource com.google.common.io.CharSource.wrap(java.lang.CharSequence)
*/ 
public static com.google.common.io.CharSource wrap(java.lang.CharSequence p0){
	return com.google.common.io.CharSource.wrap(p0);
}
}
