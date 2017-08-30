package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ChecksumUtil{ 
/**
*public static java.util.zip.Checksum org.apache.commons.io.FileUtils.checksum(java.io.File,java.util.zip.Checksum) throws java.io.IOException
*/ 
public static java.util.zip.Checksum checksum(java.io.File p0,java.util.zip.Checksum p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.checksum(p0,p1);
}
}
