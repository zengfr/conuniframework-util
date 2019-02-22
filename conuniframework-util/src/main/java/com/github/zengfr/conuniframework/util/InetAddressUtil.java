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
public final class InetAddressUtil{ 
/**
*{@link com.google.common.net.InetAddresses#coerceToInteger(java.net.InetAddress)}
*@see com.google.common.net.InetAddresses#coerceToInteger(java.net.InetAddress)
*<code>public static int com.google.common.net.InetAddresses.coerceToInteger(java.net.InetAddress)
*coerceToInteger(java.net.InetAddress p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int coerceToInteger(java.net.InetAddress p0){
	return com.google.common.net.InetAddresses.coerceToInteger(p0);
}
/**
*{@link com.google.common.net.InetAddresses#decrement(java.net.InetAddress)}
*@see com.google.common.net.InetAddresses#decrement(java.net.InetAddress)
*<code>public static java.net.InetAddress com.google.common.net.InetAddresses.decrement(java.net.InetAddress)
*decrement(java.net.InetAddress p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.InetAddress decrement(java.net.InetAddress p0){
	return com.google.common.net.InetAddresses.decrement(p0);
}
/**
*{@link com.google.common.net.InetAddresses#forString(java.lang.String)}
*@see com.google.common.net.InetAddresses#forString(java.lang.String)
*<code>public static java.net.InetAddress com.google.common.net.InetAddresses.forString(java.lang.String)
*forString(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.InetAddress forString(java.lang.String p0){
	return com.google.common.net.InetAddresses.forString(p0);
}
/**
*{@link com.google.common.net.InetAddresses#forUriString(java.lang.String)}
*@see com.google.common.net.InetAddresses#forUriString(java.lang.String)
*<code>public static java.net.InetAddress com.google.common.net.InetAddresses.forUriString(java.lang.String)
*forUriString(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.InetAddress forUriString(java.lang.String p0){
	return com.google.common.net.InetAddresses.forUriString(p0);
}
/**
*{@link com.google.common.net.InetAddresses#fromLittleEndianByteArray(byte...)}
*@see com.google.common.net.InetAddresses#fromLittleEndianByteArray(byte...)
*<code>public static java.net.InetAddress com.google.common.net.InetAddresses.fromLittleEndianByteArray(byte[]) throws java.net.UnknownHostException
*fromLittleEndianByteArray(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.InetAddress fromLittleEndianByteArray(byte... p0) throws java.net.UnknownHostException{
	return com.google.common.net.InetAddresses.fromLittleEndianByteArray(p0);
}
/**
*{@link com.google.common.net.InetAddresses#getCoercedIPv4Address(java.net.InetAddress)}
*@see com.google.common.net.InetAddresses#getCoercedIPv4Address(java.net.InetAddress)
*<code>public static java.net.Inet4Address com.google.common.net.InetAddresses.getCoercedIPv4Address(java.net.InetAddress)
*getCoercedIPv4Address(java.net.InetAddress p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.Inet4Address getCoercedIPv4Address(java.net.InetAddress p0){
	return com.google.common.net.InetAddresses.getCoercedIPv4Address(p0);
}
/**
*{@link com.google.common.net.InetAddresses#increment(java.net.InetAddress)}
*@see com.google.common.net.InetAddresses#increment(java.net.InetAddress)
*<code>public static java.net.InetAddress com.google.common.net.InetAddresses.increment(java.net.InetAddress)
*increment(java.net.InetAddress p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.InetAddress increment(java.net.InetAddress p0){
	return com.google.common.net.InetAddresses.increment(p0);
}
/**
*{@link com.google.common.net.InetAddresses#isMaximum(java.net.InetAddress)}
*@see com.google.common.net.InetAddresses#isMaximum(java.net.InetAddress)
*<code>public static boolean com.google.common.net.InetAddresses.isMaximum(java.net.InetAddress)
*isMaximum(java.net.InetAddress p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isMaximum(java.net.InetAddress p0){
	return com.google.common.net.InetAddresses.isMaximum(p0);
}
/**
*{@link com.google.common.net.InetAddresses#toAddrString(java.net.InetAddress)}
*@see com.google.common.net.InetAddresses#toAddrString(java.net.InetAddress)
*<code>public static java.lang.String com.google.common.net.InetAddresses.toAddrString(java.net.InetAddress)
*toAddrString(java.net.InetAddress p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toAddrString(java.net.InetAddress p0){
	return com.google.common.net.InetAddresses.toAddrString(p0);
}
/**
*{@link com.google.common.net.InetAddresses#toUriString(java.net.InetAddress)}
*@see com.google.common.net.InetAddresses#toUriString(java.net.InetAddress)
*<code>public static java.lang.String com.google.common.net.InetAddresses.toUriString(java.net.InetAddress)
*toUriString(java.net.InetAddress p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toUriString(java.net.InetAddress p0){
	return com.google.common.net.InetAddresses.toUriString(p0);
}
}
