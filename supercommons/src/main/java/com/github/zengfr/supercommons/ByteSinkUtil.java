package com.github.zengfr.supercommons;
import com.google.common.io.Files;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteSinkUtil{ 
public static com.google.common.io.ByteSink asByteSink(java.io.File p0,com.google.common.io.FileWriteMode... p1){
return Files.asByteSink(p0,p1);
}
}
