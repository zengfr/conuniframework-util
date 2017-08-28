package com.zengfr.supercommons;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.FileUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileArrayUtil{ 
public static java.io.File[] filter(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
return FileFilterUtils.filter(p0,p1);
}
public static java.io.File[] filter(org.apache.commons.io.filefilter.IOFileFilter p0,java.lang.Iterable<java.io.File> p1){
return FileFilterUtils.filter(p0,p1);
}
public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
return FileFilterUtils.filterList(p0,p1);
}
public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter p0,java.io.File... p1){
return FileFilterUtils.filterSet(p0,p1);
}
public static java.net.URL[] toURLs(java.io.File[] p0) throws java.io.IOException{
return FileUtils.toURLs(p0);
}
public static java.io.File[] toFiles(java.net.URL[] p0){
return FileUtils.toFiles(p0);
}
public static java.io.File[] convertFileCollectionToFileArray(java.util.Collection<java.io.File> p0){
return FileUtils.convertFileCollectionToFileArray(p0);
}
}
