package com.zengfr.supercommons;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileWriteModeArrayUtil{ 
public static com.google.common.io.FileWriteMode[] values(){
return FileWriteMode.values();
}
public static com.google.common.io.CharSink asCharSink(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.FileWriteMode... p2){
return Files.asCharSink(p0,p1,p2);
}
public static com.google.common.io.ByteSink asByteSink(java.io.File p0,com.google.common.io.FileWriteMode... p1){
return Files.asByteSink(p0,p1);
}
}
