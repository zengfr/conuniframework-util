package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BoundedBufferUtil{ 
/**
*public static org.apache.commons.collections.buffer.BoundedBuffer org.apache.commons.collections.buffer.BoundedBuffer.decorate(org.apache.commons.collections.Buffer,int,long)
*/ 
public static org.apache.commons.collections.buffer.BoundedBuffer decorate(org.apache.commons.collections.Buffer p0,int p1,long p2){
	return org.apache.commons.collections.buffer.BoundedBuffer.decorate(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.buffer.BoundedBuffer org.apache.commons.collections.buffer.BoundedBuffer.decorate(org.apache.commons.collections.Buffer,int)
*/ 
public static org.apache.commons.collections.buffer.BoundedBuffer decorate(org.apache.commons.collections.Buffer p0,int p1){
	return org.apache.commons.collections.buffer.BoundedBuffer.decorate(p0,p1);
}
}
