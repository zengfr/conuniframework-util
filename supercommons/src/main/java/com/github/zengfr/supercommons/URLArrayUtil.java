package com.zengfr.supercommons;
import org.apache.commons.io.FileUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class URLArrayUtil{ 
public static java.net.URL[] toURLs(java.io.File[] p0) throws java.io.IOException{
return FileUtils.toURLs(p0);
}
public static java.io.File[] toFiles(java.net.URL[] p0){
return FileUtils.toFiles(p0);
}
}
