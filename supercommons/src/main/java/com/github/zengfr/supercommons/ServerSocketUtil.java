package com.zengfr.supercommons;
import org.apache.commons.io.IOUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ServerSocketUtil{ 
public static void closeQuietly(java.net.ServerSocket p0){
 IOUtils.closeQuietly(p0);
}
}
