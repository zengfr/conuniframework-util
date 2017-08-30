package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileArrayUtil{ 
/**
*public static java.io.File[] org.apache.commons.io.filefilter.FileFilterUtils.filter(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)
*/ 
public static java.io.File[] filter(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filter(p0,p1);
}
/**
*public static java.io.File[] org.apache.commons.io.filefilter.FileFilterUtils.filter(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)
*/ 
public static java.io.File[] filter(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filter(p0,p1);
}
/**
*public static java.util.List<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterList(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)
*/ 
public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterList(p0,p1);
}
/**
*public static java.util.Set<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)
*/ 
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterSet(p0,p1);
}
/**
*public static java.io.File[] org.apache.commons.io.FileUtils.toFiles(java.net.URL[])
*/ 
public static java.io.File[] toFiles(java.net.URL[] p0){
	return org.apache.commons.io.FileUtils.toFiles(p0);
}
/**
*public static java.net.URL[] org.apache.commons.io.FileUtils.toURLs(java.io.File[]) throws java.io.IOException
*/ 
public static java.net.URL[] toURLs(java.io.File[] p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.toURLs(p0);
}
/**
*public static java.io.File[] org.apache.commons.io.FileUtils.convertFileCollectionToFileArray(java.util.Collection<java.io.File>)
*/ 
public static java.io.File[] convertFileCollectionToFileArray(java.util.Collection<java.io.File> p0){
	return org.apache.commons.io.FileUtils.convertFileCollectionToFileArray(p0);
}
}
