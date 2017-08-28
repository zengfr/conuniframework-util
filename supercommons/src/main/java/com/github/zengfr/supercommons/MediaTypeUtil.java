package com.zengfr.supercommons;
import com.google.common.net.MediaType;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MediaTypeUtil{ 
public static com.google.common.net.MediaType create(java.lang.String p0,java.lang.String p1){
return MediaType.create(p0,p1);
}
public static com.google.common.net.MediaType parse(java.lang.String p0){
return MediaType.parse(p0);
}
}
