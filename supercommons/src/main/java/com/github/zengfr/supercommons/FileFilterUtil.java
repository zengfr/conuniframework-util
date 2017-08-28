package com.github.zengfr.supercommons;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.FileUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileFilterUtil{ 
public static org.apache.commons.io.filefilter.IOFileFilter asFileFilter(java.io.FileFilter p0){
return FileFilterUtils.asFileFilter(p0);
}
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1,p2);
}
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1,p2,p3);
}
}
