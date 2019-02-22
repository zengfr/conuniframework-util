package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class Inet6AddressUtil{ 
/**
*{@link com.google.common.net.InetAddresses#get6to4IPv4Address(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#get6to4IPv4Address(java.net.Inet6Address)
*<code>public static java.net.Inet4Address com.google.common.net.InetAddresses.get6to4IPv4Address(java.net.Inet6Address)
*get6to4IPv4Address(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.Inet4Address get6to4IPv4Address(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.get6to4IPv4Address(p0);
}
/**
*{@link com.google.common.net.InetAddresses#getCompatIPv4Address(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#getCompatIPv4Address(java.net.Inet6Address)
*<code>public static java.net.Inet4Address com.google.common.net.InetAddresses.getCompatIPv4Address(java.net.Inet6Address)
*getCompatIPv4Address(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.Inet4Address getCompatIPv4Address(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.getCompatIPv4Address(p0);
}
/**
*{@link com.google.common.net.InetAddresses#getEmbeddedIPv4ClientAddress(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#getEmbeddedIPv4ClientAddress(java.net.Inet6Address)
*<code>public static java.net.Inet4Address com.google.common.net.InetAddresses.getEmbeddedIPv4ClientAddress(java.net.Inet6Address)
*getEmbeddedIPv4ClientAddress(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.Inet4Address getEmbeddedIPv4ClientAddress(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.getEmbeddedIPv4ClientAddress(p0);
}
/**
*{@link com.google.common.net.InetAddresses#getIsatapIPv4Address(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#getIsatapIPv4Address(java.net.Inet6Address)
*<code>public static java.net.Inet4Address com.google.common.net.InetAddresses.getIsatapIPv4Address(java.net.Inet6Address)
*getIsatapIPv4Address(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.Inet4Address getIsatapIPv4Address(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.getIsatapIPv4Address(p0);
}
/**
*{@link com.google.common.net.InetAddresses#hasEmbeddedIPv4ClientAddress(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#hasEmbeddedIPv4ClientAddress(java.net.Inet6Address)
*<code>public static boolean com.google.common.net.InetAddresses.hasEmbeddedIPv4ClientAddress(java.net.Inet6Address)
*hasEmbeddedIPv4ClientAddress(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean hasEmbeddedIPv4ClientAddress(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.hasEmbeddedIPv4ClientAddress(p0);
}
/**
*{@link com.google.common.net.InetAddresses#is6to4Address(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#is6to4Address(java.net.Inet6Address)
*<code>public static boolean com.google.common.net.InetAddresses.is6to4Address(java.net.Inet6Address)
*is6to4Address(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean is6to4Address(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.is6to4Address(p0);
}
/**
*{@link com.google.common.net.InetAddresses#isCompatIPv4Address(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#isCompatIPv4Address(java.net.Inet6Address)
*<code>public static boolean com.google.common.net.InetAddresses.isCompatIPv4Address(java.net.Inet6Address)
*isCompatIPv4Address(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isCompatIPv4Address(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.isCompatIPv4Address(p0);
}
/**
*{@link com.google.common.net.InetAddresses#isIsatapAddress(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#isIsatapAddress(java.net.Inet6Address)
*<code>public static boolean com.google.common.net.InetAddresses.isIsatapAddress(java.net.Inet6Address)
*isIsatapAddress(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isIsatapAddress(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.isIsatapAddress(p0);
}
/**
*{@link com.google.common.net.InetAddresses#isTeredoAddress(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#isTeredoAddress(java.net.Inet6Address)
*<code>public static boolean com.google.common.net.InetAddresses.isTeredoAddress(java.net.Inet6Address)
*isTeredoAddress(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isTeredoAddress(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.isTeredoAddress(p0);
}
}
