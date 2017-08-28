package com.github.zengfr.supercommons;
import com.google.common.net.HostSpecifier;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HostSpecifierUtil{ 
public static com.google.common.net.HostSpecifier from(java.lang.String p0) throws java.text.ParseException{
return HostSpecifier.from(p0);
}
public static com.google.common.net.HostSpecifier fromValid(java.lang.String p0){
return HostSpecifier.fromValid(p0);
}
}
