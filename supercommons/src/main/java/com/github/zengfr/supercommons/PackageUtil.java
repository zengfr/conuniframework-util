package com.github.zengfr.supercommons;
import org.apache.commons.lang3.ClassPathUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PackageUtil{ 
public static java.lang.String toFullyQualifiedPath(java.lang.Package p0,java.lang.String p1){
return ClassPathUtils.toFullyQualifiedPath(p0,p1);
}
public static java.lang.String toFullyQualifiedName(java.lang.Package p0,java.lang.String p1){
return ClassPathUtils.toFullyQualifiedName(p0,p1);
}
}
