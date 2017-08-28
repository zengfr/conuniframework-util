package com.github.zengfr.supercommons;
import com.google.common.net.InetAddresses;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class InetAddressUtil{ 
public static java.net.InetAddress increment(java.net.InetAddress p0){
return InetAddresses.increment(p0);
}
public static java.net.InetAddress decrement(java.net.InetAddress p0){
return InetAddresses.decrement(p0);
}
public static java.net.InetAddress forString(java.lang.String p0){
return InetAddresses.forString(p0);
}
public static java.lang.String toUriString(java.net.InetAddress p0){
return InetAddresses.toUriString(p0);
}
public static java.net.InetAddress forUriString(java.lang.String p0){
return InetAddresses.forUriString(p0);
}
public static int coerceToInteger(java.net.InetAddress p0){
return InetAddresses.coerceToInteger(p0);
}
public static java.lang.String toAddrString(java.net.InetAddress p0){
return InetAddresses.toAddrString(p0);
}
public static boolean isMaximum(java.net.InetAddress p0){
return InetAddresses.isMaximum(p0);
}
public static java.net.InetAddress fromLittleEndianByteArray(byte[] p0) throws java.net.UnknownHostException{
return InetAddresses.fromLittleEndianByteArray(p0);
}
public static java.net.Inet4Address getCoercedIPv4Address(java.net.InetAddress p0){
return InetAddresses.getCoercedIPv4Address(p0);
}
}
