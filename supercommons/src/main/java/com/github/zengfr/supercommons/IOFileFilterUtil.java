package com.github.zengfr.supercommons;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.FileUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IOFileFilterUtil{ 
public static java.io.File[] filter(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
return FileFilterUtils.filter(p0,p1);
}
public static java.io.File[] filter(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
return FileFilterUtils.filter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter and(org.apache.commons.io.filefilter.IOFileFilter... p0){
return FileFilterUtils.and(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter or(org.apache.commons.io.filefilter.IOFileFilter... p0){
return FileFilterUtils.or(p0);
}
public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
return FileFilterUtils.filterList(p0,p1);
}
public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
return FileFilterUtils.filterList(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter makeDirectoryOnly(org.apache.commons.io.filefilter.IOFileFilter p0){
return FileFilterUtils.makeDirectoryOnly(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter makeFileOnly(org.apache.commons.io.filefilter.IOFileFilter p0){
return FileFilterUtils.makeFileOnly(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter nameFileFilter(java.lang.String p0){
return FileFilterUtils.nameFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter nameFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
return FileFilterUtils.nameFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter fileFileFilter(){
return FileFilterUtils.fileFileFilter();
}
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
return FileFilterUtils.filterSet(p0,p1);
}
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
return FileFilterUtils.filterSet(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter andFileFilter(org.apache.commons.io.filefilter.IOFileFilter p0,org.apache.commons.io.filefilter.IOFileFilter p1){
return FileFilterUtils.andFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter orFileFilter(org.apache.commons.io.filefilter.IOFileFilter p0,org.apache.commons.io.filefilter.IOFileFilter p1){
return FileFilterUtils.orFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter notFileFilter(org.apache.commons.io.filefilter.IOFileFilter p0){
return FileFilterUtils.notFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter prefixFileFilter(java.lang.String p0){
return FileFilterUtils.prefixFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter prefixFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
return FileFilterUtils.prefixFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter trueFileFilter(){
return FileFilterUtils.trueFileFilter();
}
public static org.apache.commons.io.filefilter.IOFileFilter falseFileFilter(){
return FileFilterUtils.falseFileFilter();
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.util.Date p0){
return FileFilterUtils.ageFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.util.Date p0,boolean p1){
return FileFilterUtils.ageFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0){
return FileFilterUtils.ageFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0,boolean p1){
return FileFilterUtils.ageFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(long p0,boolean p1){
return FileFilterUtils.ageFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(long p0){
return FileFilterUtils.ageFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter asFileFilter(java.io.FileFilter p0){
return FileFilterUtils.asFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter asFileFilter(java.io.FilenameFilter p0){
return FileFilterUtils.asFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter suffixFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
return FileFilterUtils.suffixFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter suffixFileFilter(java.lang.String p0){
return FileFilterUtils.suffixFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter makeSVNAware(org.apache.commons.io.filefilter.IOFileFilter p0){
return FileFilterUtils.makeSVNAware(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter sizeFileFilter(long p0,boolean p1){
return FileFilterUtils.sizeFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter sizeFileFilter(long p0){
return FileFilterUtils.sizeFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter makeCVSAware(org.apache.commons.io.filefilter.IOFileFilter p0){
return FileFilterUtils.makeCVSAware(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter sizeRangeFileFilter(long p0,long p1){
return FileFilterUtils.sizeRangeFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(java.lang.String p0){
return FileFilterUtils.magicNumberFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(java.lang.String p0,long p1){
return FileFilterUtils.magicNumberFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(byte[] p0){
return FileFilterUtils.magicNumberFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter magicNumberFileFilter(byte[] p0,long p1){
return FileFilterUtils.magicNumberFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter directoryFileFilter(){
return FileFilterUtils.directoryFileFilter();
}
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.listFiles(p0,p1,p2);
}
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.iterateFiles(p0,p1,p2);
}
public static java.util.Collection<java.io.File> listFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.listFilesAndDirs(p0,p1,p2);
}
public static java.util.Iterator<java.io.File> iterateFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.iterateFilesAndDirs(p0,p1,p2);
}
}
