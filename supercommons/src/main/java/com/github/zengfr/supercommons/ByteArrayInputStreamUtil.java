package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteArrayInputStreamUtil{ 
/**
*public static com.google.common.io.ByteArrayDataInput com.google.common.io.ByteStreams.newDataInput(java.io.ByteArrayInputStream)
*/ 
public static com.google.common.io.ByteArrayDataInput newDataInput(java.io.ByteArrayInputStream p0){
	return com.google.common.io.ByteStreams.newDataInput(p0);
}
}
