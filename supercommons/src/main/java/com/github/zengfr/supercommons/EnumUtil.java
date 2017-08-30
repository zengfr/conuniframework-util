package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumUtil{ 
/**
*public static <E> E org.apache.commons.lang3.EnumUtils.getEnum(java.lang.Class<E>,java.lang.String)
*/ 
public static <E extends java.lang.Enum<E> > E getEnum(java.lang.Class<E> p0,java.lang.String p1){
	return org.apache.commons.lang3.EnumUtils.getEnum(p0,p1);
}
/**
*public static org.apache.commons.lang.enum.Enum org.apache.commons.lang.enum.EnumUtils.getEnum(java.lang.Class,java.lang.String)
*/ 
public static org.apache.commons.lang.enum.Enum getEnum(java.lang.Class p0,java.lang.String p1){
	return org.apache.commons.lang.enum.EnumUtils.getEnum(p0,p1);
}
/**
*public static <T> T java.lang.Enum.valueOf(java.lang.Class<T>,java.lang.String)
*/ 
public static <T extends java.lang.Enum<T> > T valueOf(java.lang.Class<T> p0,java.lang.String p1){
	return java.lang.Enum.valueOf(p0,p1);
}
}
