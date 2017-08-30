package com.github.zengfr.supercommons;

import com.google.common.net.InetAddresses.TeredoInfo;

/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TeredoInfoUtil{
/**
*public static com.google.common.net.InetAddresses$TeredoInfo com.google.common.net.InetAddresses.getTeredoInfo(java.net.Inet6Address)
*/
public static TeredoInfo getTeredoInfo(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.getTeredoInfo(p0);
}
}
