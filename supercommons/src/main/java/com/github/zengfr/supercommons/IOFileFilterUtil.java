package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IOFileFilterUtil{ 
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
*public static java.util.List<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterList(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)
*/ 
public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterList(p0,p1);
}
/**
*public static java.util.List<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterList(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)
*/ 
public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterList(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.makeDirectoryOnly(org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter makeDirectoryOnly(org.apache.commons.io.filefilter.IOFileFilter p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.makeDirectoryOnly(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.makeFileOnly(org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter makeFileOnly(org.apache.commons.io.filefilter.IOFileFilter p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.makeFileOnly(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.sizeFileFilter(long,boolean)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter sizeFileFilter(long p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.sizeFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.sizeFileFilter(long)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter sizeFileFilter(long p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.sizeFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter(java.lang.String)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter nameFileFilter(java.lang.String p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter(java.lang.String,org.apache.commons.io.IOCase)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter nameFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.orFileFilter(org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter orFileFilter(org.apache.commons.io.filefilter.IOFileFilter p0,org.apache.commons.io.filefilter.IOFileFilter p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.orFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(long,boolean)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(long p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(long)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(long p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.io.File,boolean)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.util.Date,boolean)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.util.Date p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.util.Date)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.util.Date p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.io.File)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.makeSVNAware(org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter makeSVNAware(org.apache.commons.io.filefilter.IOFileFilter p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.makeSVNAware(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.falseFileFilter()
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter falseFileFilter(){
	return org.apache.commons.io.filefilter.FileFilterUtils.falseFileFilter();
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.suffixFileFilter(java.lang.String,org.apache.commons.io.IOCase)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter suffixFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.suffixFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.suffixFileFilter(java.lang.String)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter suffixFileFilter(java.lang.String p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.suffixFileFilter(p0);
}
/**
*public static java.util.Set<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)
*/ 
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterSet(p0,p1);
}
/**
*public static java.util.Set<java.io.File> org.apache.commons.io.filefilter.FileFilterUtils.filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.io.File...)
*/ 
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.filterSet(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.fileFileFilter()
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter fileFileFilter(){
	return org.apache.commons.io.filefilter.FileFilterUtils.fileFileFilter();
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.notFileFilter(org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter notFileFilter(org.apache.commons.io.filefilter.IOFileFilter p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.notFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.asFileFilter(java.io.FilenameFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter asFileFilter(java.io.FilenameFilter p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.asFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.asFileFilter(java.io.FileFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter asFileFilter(java.io.FileFilter p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.asFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.andFileFilter(org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter andFileFilter(org.apache.commons.io.filefilter.IOFileFilter p0,org.apache.commons.io.filefilter.IOFileFilter p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.andFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter()
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter trueFileFilter(){
	return org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter();
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.makeCVSAware(org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter makeCVSAware(org.apache.commons.io.filefilter.IOFileFilter p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.makeCVSAware(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter(java.lang.String)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter prefixFileFilter(java.lang.String p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter(java.lang.String,org.apache.commons.io.IOCase)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter prefixFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.directoryFileFilter()
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter directoryFileFilter(){
	return org.apache.commons.io.filefilter.FileFilterUtils.directoryFileFilter();
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.sizeRangeFileFilter(long,long)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter sizeRangeFileFilter(long p0,long p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.sizeRangeFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(java.lang.String)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(java.lang.String p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(java.lang.String,long)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(java.lang.String p0,long p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(byte[])
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(byte[] p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(p0);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(byte[],long)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(byte[] p0,long p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(p0,p1);
}
/**
*public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Collection<java.io.File> listFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.listFilesAndDirs(p0,p1,p2);
}
/**
*public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Iterator<java.io.File> iterateFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.iterateFilesAndDirs(p0,p1,p2);
}
}
