package com.github.zengfr.supercommons;
import org.apache.commons.io.filefilter.FileFilterUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FilenameFilterUtil{ 
public static org.apache.commons.io.filefilter.IOFileFilter asFileFilter(java.io.FilenameFilter p0){
return FileFilterUtils.asFileFilter(p0);
}
}
