package com.zengfr.supercommons;
import com.google.common.io.Files;
import org.apache.commons.io.IOUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BufferedWriterUtil{ 
public static java.io.BufferedWriter newWriter(java.io.File p0,java.nio.charset.Charset p1) throws java.io.FileNotFoundException{
return Files.newWriter(p0,p1);
}
public static java.io.BufferedWriter buffer(java.io.Writer p0,int p1){
return IOUtils.buffer(p0,p1);
}
public static java.io.BufferedWriter buffer(java.io.Writer p0){
return IOUtils.buffer(p0);
}
}
