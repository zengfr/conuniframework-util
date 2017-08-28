package com.github.zengfr.supercommons;
import org.apache.commons.io.IOUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BufferedInputStreamUtil{ 
public static java.io.BufferedInputStream buffer(java.io.InputStream p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.BufferedInputStream buffer(java.io.InputStream p0){
return IOUtils.buffer(p0);
}
}
