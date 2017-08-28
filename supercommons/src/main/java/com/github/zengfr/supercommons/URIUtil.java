package com.github.zengfr.supercommons;
import org.apache.commons.io.IOUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class URIUtil{ 
public static byte[] toByteArray(java.net.URI p0) throws java.io.IOException{
return IOUtils.toByteArray(p0);
}
}
