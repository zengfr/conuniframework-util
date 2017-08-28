package com.github.zengfr.supercommons;
import org.apache.commons.io.FileUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileOutputStreamUtil{ 
public static java.io.FileOutputStream openOutputStream(java.io.File p0,boolean p1) throws java.io.IOException{
return FileUtils.openOutputStream(p0,p1);
}
public static java.io.FileOutputStream openOutputStream(java.io.File p0) throws java.io.IOException{
return FileUtils.openOutputStream(p0);
}
}
