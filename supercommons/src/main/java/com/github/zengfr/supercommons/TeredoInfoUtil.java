package com.zengfr.supercommons;
import com.google.common.net.InetAddresses;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TeredoInfoUtil{ 
public static TeredoInfo getTeredoInfo(java.net.Inet6Address p0){
return InetAddresses.getTeredoInfo(p0);
}
}
