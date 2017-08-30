package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileFilterUtil{ 
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.asFileFilter(java.io.FileFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter asFileFilter(java.io.FileFilter p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.asFileFilter(p0);
}
/**
*public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter) throws java.io.IOException
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean) throws java.io.IOException
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2,p3);
}
}
