package com.github.zengfr.supercommons;
import org.apache.commons.io.IOUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class URLConnectionUtil{ 
public static void close(java.net.URLConnection p0){
 IOUtils.close(p0);
}
public static byte[] toByteArray(java.net.URLConnection p0) throws java.io.IOException{
return IOUtils.toByteArray(p0);
}
}
