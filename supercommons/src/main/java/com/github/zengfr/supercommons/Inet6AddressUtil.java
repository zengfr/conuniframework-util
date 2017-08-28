package com.github.zengfr.supercommons;
import com.google.common.net.InetAddresses;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Inet6AddressUtil{ 
public static boolean is6to4Address(java.net.Inet6Address p0){
return InetAddresses.is6to4Address(p0);
}
public static boolean isTeredoAddress(java.net.Inet6Address p0){
return InetAddresses.isTeredoAddress(p0);
}
public static boolean isIsatapAddress(java.net.Inet6Address p0){
return InetAddresses.isIsatapAddress(p0);
}
public static TeredoInfo getTeredoInfo(java.net.Inet6Address p0){
return InetAddresses.getTeredoInfo(p0);
}
public static java.net.Inet4Address getCompatIPv4Address(java.net.Inet6Address p0){
return InetAddresses.getCompatIPv4Address(p0);
}
public static boolean isCompatIPv4Address(java.net.Inet6Address p0){
return InetAddresses.isCompatIPv4Address(p0);
}
public static java.net.Inet4Address getIsatapIPv4Address(java.net.Inet6Address p0){
return InetAddresses.getIsatapIPv4Address(p0);
}
public static java.net.Inet4Address getEmbeddedIPv4ClientAddress(java.net.Inet6Address p0){
return InetAddresses.getEmbeddedIPv4ClientAddress(p0);
}
public static boolean hasEmbeddedIPv4ClientAddress(java.net.Inet6Address p0){
return InetAddresses.hasEmbeddedIPv4ClientAddress(p0);
}
public static java.net.Inet4Address get6to4IPv4Address(java.net.Inet6Address p0){
return InetAddresses.get6to4IPv4Address(p0);
}
}
