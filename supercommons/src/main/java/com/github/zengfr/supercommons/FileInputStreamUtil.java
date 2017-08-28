package com.zengfr.supercommons;
import org.apache.commons.io.FileUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileInputStreamUtil{ 
public static java.io.FileInputStream openInputStream(java.io.File p0) throws java.io.IOException{
return FileUtils.openInputStream(p0);
}
}
