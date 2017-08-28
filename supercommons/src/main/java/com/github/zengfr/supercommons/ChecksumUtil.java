package com.github.zengfr.supercommons;
import org.apache.commons.io.FileUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ChecksumUtil{ 
public static java.util.zip.Checksum checksum(java.io.File p0,java.util.zip.Checksum p1) throws java.io.IOException{
return FileUtils.checksum(p0,p1);
}
}
