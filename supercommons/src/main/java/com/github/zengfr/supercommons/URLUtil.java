package com.github.zengfr.supercommons;
import com.google.common.io.Resources;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.FileUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class URLUtil{ 
public static java.net.URL getResource(java.lang.String p0){
return Resources.getResource(p0);
}
public static java.net.URL getResource(java.lang.Class<?> p0,java.lang.String p1){
return Resources.getResource(p0,p1);
}
public static void copy(java.net.URL p0,java.io.OutputStream p1) throws java.io.IOException{
 Resources.copy(p0,p1);
}
public static byte[] toByteArray(java.net.URL p0) throws java.io.IOException{
return Resources.toByteArray(p0);
}
public static com.google.common.io.CharSource asCharSource(java.net.URL p0,java.nio.charset.Charset p1){
return Resources.asCharSource(p0,p1);
}
public static <T> T readLines(java.net.URL p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2) throws java.io.IOException{
return Resources.readLines(p0,p1,p2);
}
public static java.util.List<java.lang.String> readLines(java.net.URL p0,java.nio.charset.Charset p1) throws java.io.IOException{
return Resources.readLines(p0,p1);
}
public static com.google.common.io.ByteSource asByteSource(java.net.URL p0){
return Resources.asByteSource(p0);
}
public static java.io.File toFile(java.net.URL p0){
return FileUtils.toFile(p0);
}
public static void copyURLToFile(java.net.URL p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyURLToFile(p0,p1);
}
public static void copyURLToFile(java.net.URL p0,java.io.File p1,int p2,int p3) throws java.io.IOException{
 FileUtils.copyURLToFile(p0,p1,p2,p3);
}
}
