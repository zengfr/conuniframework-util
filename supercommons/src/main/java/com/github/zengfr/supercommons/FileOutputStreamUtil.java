package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileOutputStreamUtil{ 
/**
*public static java.io.FileOutputStream org.apache.commons.io.FileUtils.openOutputStream(java.io.File,boolean) throws java.io.IOException
*/ 
public static java.io.FileOutputStream openOutputStream(java.io.File p0,boolean p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.openOutputStream(p0,p1);
}
/**
*public static java.io.FileOutputStream org.apache.commons.io.FileUtils.openOutputStream(java.io.File) throws java.io.IOException
*/ 
public static java.io.FileOutputStream openOutputStream(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.openOutputStream(p0);
}
}
