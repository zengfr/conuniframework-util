package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FilenameFilterUtil{ 
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.asFileFilter(java.io.FilenameFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter asFileFilter(java.io.FilenameFilter p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.asFileFilter(p0);
}
}
