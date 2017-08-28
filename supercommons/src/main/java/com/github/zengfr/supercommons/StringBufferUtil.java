package com.github.zengfr.supercommons;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.math3.util.CompositeFormat;
import org.apache.commons.lang.ObjectUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StringBufferUtil{ 
public static void write(java.lang.StringBuffer p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.StringBuffer p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.StringBuffer p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void identityToString(java.lang.StringBuffer p0,java.lang.Object p1){
 ObjectUtils.identityToString(p0,p1);
}
public static java.lang.StringBuffer formatDouble(double p0,java.text.NumberFormat p1,java.lang.StringBuffer p2,java.text.FieldPosition p3){
return CompositeFormat.formatDouble(p0,p1,p2,p3);
}
public static java.lang.StringBuffer appendIdentityToString(java.lang.StringBuffer p0,java.lang.Object p1){
return ObjectUtils.appendIdentityToString(p0,p1);
}
}
