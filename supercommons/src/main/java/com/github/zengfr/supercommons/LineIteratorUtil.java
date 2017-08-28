package com.zengfr.supercommons;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.FileUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LineIteratorUtil{ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
return IOUtils.lineIterator(p0,p1);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.lineIterator(p0,p1);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.Reader p0){
return IOUtils.lineIterator(p0);
}
public static void closeQuietly(org.apache.commons.io.LineIterator p0){
 LineIterator.closeQuietly(p0);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0) throws java.io.IOException{
return FileUtils.lineIterator(p0);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0,java.lang.String p1) throws java.io.IOException{
return FileUtils.lineIterator(p0,p1);
}
}
