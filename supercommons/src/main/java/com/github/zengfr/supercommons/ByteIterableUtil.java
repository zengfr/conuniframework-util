package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteIterableUtil{ 
/**
*public static it.unimi.dsi.fastutil.bytes.ByteCollection it.unimi.dsi.fastutil.bytes.ByteCollections.asCollection(it.unimi.dsi.fastutil.bytes.ByteIterable)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteCollection asCollection(it.unimi.dsi.fastutil.bytes.ByteIterable p0){
	return it.unimi.dsi.fastutil.bytes.ByteCollections.asCollection(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterable it.unimi.dsi.fastutil.io.BinIO.asByteIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterable asByteIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterable(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterable it.unimi.dsi.fastutil.io.BinIO.asByteIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterable asByteIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterable(p0);
}
}
