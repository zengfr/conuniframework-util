package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IOCaseUtil{ 
/**
*public static boolean org.apache.commons.io.FilenameUtils.wildcardMatch(java.lang.String,java.lang.String,org.apache.commons.io.IOCase)
*/ 
public static boolean wildcardMatch(java.lang.String p0,java.lang.String p1,org.apache.commons.io.IOCase p2){
	return org.apache.commons.io.FilenameUtils.wildcardMatch(p0,p1,p2);
}
/**
*public static org.apache.commons.io.IOCase org.apache.commons.io.IOCase.forName(java.lang.String)
*/ 
public static org.apache.commons.io.IOCase forName(java.lang.String p0){
	return org.apache.commons.io.IOCase.forName(p0);
}
/**
*public static org.apache.commons.io.IOCase org.apache.commons.io.IOCase.valueOf(java.lang.String)
*/ 
public static org.apache.commons.io.IOCase valueOf(java.lang.String p0){
	return org.apache.commons.io.IOCase.valueOf(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter(java.lang.String,org.apache.commons.io.IOCase)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter nameFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.suffixFileFilter(java.lang.String,org.apache.commons.io.IOCase)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter suffixFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.suffixFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter(java.lang.String,org.apache.commons.io.IOCase)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter prefixFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter(p0,p1);
}
}
