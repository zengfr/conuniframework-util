package com.github.zengfr.supercommons;
import com.google.common.io.Closeables;
import org.apache.commons.io.IOUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CloseableUtil{ 
public static void close(java.io.Closeable p0,boolean p1) throws java.io.IOException{
 Closeables.close(p0,p1);
}
public static void closeQuietly(java.io.Closeable p0){
 IOUtils.closeQuietly(p0);
}
}
