package com.github.zengfr.supercommons;
import com.google.common.net.InetAddresses;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Inet4AddressUtil{ 
public static java.net.Inet4Address fromInteger(int p0){
return InetAddresses.fromInteger(p0);
}
public static java.net.Inet4Address getCompatIPv4Address(java.net.Inet6Address p0){
return InetAddresses.getCompatIPv4Address(p0);
}
public static java.net.Inet4Address getCoercedIPv4Address(java.net.InetAddress p0){
return InetAddresses.getCoercedIPv4Address(p0);
}
public static java.net.Inet4Address getIsatapIPv4Address(java.net.Inet6Address p0){
return InetAddresses.getIsatapIPv4Address(p0);
}
public static java.net.Inet4Address getEmbeddedIPv4ClientAddress(java.net.Inet6Address p0){
return InetAddresses.getEmbeddedIPv4ClientAddress(p0);
}
public static java.net.Inet4Address get6to4IPv4Address(java.net.Inet6Address p0){
return InetAddresses.get6to4IPv4Address(p0);
}
}
