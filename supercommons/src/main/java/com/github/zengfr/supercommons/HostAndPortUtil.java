package com.zengfr.supercommons;
import com.google.common.net.HostAndPort;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HostAndPortUtil{ 
public static com.google.common.net.HostAndPort fromString(java.lang.String p0){
return HostAndPort.fromString(p0);
}
public static com.google.common.net.HostAndPort fromParts(java.lang.String p0,int p1){
return HostAndPort.fromParts(p0,p1);
}
public static com.google.common.net.HostAndPort fromHost(java.lang.String p0){
return HostAndPort.fromHost(p0);
}
}
