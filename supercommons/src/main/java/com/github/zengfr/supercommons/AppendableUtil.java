package com.zengfr.supercommons;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;
import org.apache.commons.lang3.ObjectUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AppendableUtil{ 
public static long copy(java.lang.Readable p0,java.lang.Appendable p1) throws java.io.IOException{
return CharStreams.copy(p0,p1);
}
public static java.io.Writer asWriter(java.lang.Appendable p0){
return CharStreams.asWriter(p0);
}
public static void copy(java.io.File p0,java.nio.charset.Charset p1,java.lang.Appendable p2) throws java.io.IOException{
 Files.copy(p0,p1,p2);
}
public static void identityToString(java.lang.Appendable p0,java.lang.Object p1) throws java.io.IOException{
 ObjectUtils.identityToString(p0,p1);
}
}
