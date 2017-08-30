package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteIteratorArrayUtil{ 
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.concat(it.unimi.dsi.fastutil.bytes.ByteIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.concat(it.unimi.dsi.fastutil.bytes.ByteIterator[])
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator... p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.concat(p0);
}
}
