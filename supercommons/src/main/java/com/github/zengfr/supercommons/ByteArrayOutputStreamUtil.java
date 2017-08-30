package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteArrayOutputStreamUtil{ 
/**
*public static com.google.common.io.ByteArrayDataOutput com.google.common.io.ByteStreams.newDataOutput(java.io.ByteArrayOutputStream)
*/ 
public static com.google.common.io.ByteArrayDataOutput newDataOutput(java.io.ByteArrayOutputStream p0){
	return com.google.common.io.ByteStreams.newDataOutput(p0);
}
}
