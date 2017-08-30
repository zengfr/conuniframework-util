package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AppendableUtil{ 
/**
*public static java.io.Writer com.google.common.io.CharStreams.asWriter(java.lang.Appendable)
*/ 
public static java.io.Writer asWriter(java.lang.Appendable p0){
	return com.google.common.io.CharStreams.asWriter(p0);
}
/**
*public static long com.google.common.io.CharStreams.copy(java.lang.Readable,java.lang.Appendable) throws java.io.IOException
*/ 
public static long copy(java.lang.Readable p0,java.lang.Appendable p1) throws java.io.IOException{
	return com.google.common.io.CharStreams.copy(p0,p1);
}
/**
*public static void com.google.common.io.Files.copy(java.io.File,java.nio.charset.Charset,java.lang.Appendable) throws java.io.IOException
*/ 
public static void copy(java.io.File p0,java.nio.charset.Charset p1,java.lang.Appendable p2) throws java.io.IOException{
	 com.google.common.io.Files.copy(p0,p1,p2);
}
/**
*public static void org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.Appendable,java.lang.Object) throws java.io.IOException
*/ 
public static void identityToString(java.lang.Appendable p0,java.lang.Object p1) throws java.io.IOException{
	 org.apache.commons.lang3.ObjectUtils.identityToString(p0,p1);
}
}
