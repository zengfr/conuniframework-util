package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IOFileFilterArrayUtil{ 
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.and(org.apache.commons.io.filefilter.IOFileFilter...)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter and(org.apache.commons.io.filefilter.IOFileFilter... p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.and(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.or(org.apache.commons.io.filefilter.IOFileFilter...)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter or(org.apache.commons.io.filefilter.IOFileFilter... p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.or(p0);
}
/**
*public static java.util.List<org.apache.commons.io.filefilter.IOFileFilter> org.apache.commons.io.filefilter.FileFilterUtils.toList(org.apache.commons.io.filefilter.IOFileFilter...)
*/ 
public static java.util.List<org.apache.commons.io.filefilter.IOFileFilter> toList(org.apache.commons.io.filefilter.IOFileFilter... p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.toList(p0);
}
}
