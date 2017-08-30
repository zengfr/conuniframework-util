package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class JavaVersionUtil{ 
/**
*public static org.apache.commons.lang3.JavaVersion org.apache.commons.lang3.JavaVersion.valueOf(java.lang.String)
*/ 
public static org.apache.commons.lang3.JavaVersion valueOf(java.lang.String p0){
	return org.apache.commons.lang3.JavaVersion.valueOf(p0);
}
/**
*public static boolean org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion)
*/ 
public static boolean isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion p0){
	return org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(p0);
}
}
