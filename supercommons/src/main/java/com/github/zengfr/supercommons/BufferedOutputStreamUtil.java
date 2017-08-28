package com.zengfr.supercommons;
import org.apache.commons.io.IOUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BufferedOutputStreamUtil{ 
public static java.io.BufferedOutputStream buffer(java.io.OutputStream p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.BufferedOutputStream buffer(java.io.OutputStream p0){
return IOUtils.buffer(p0);
}
}
