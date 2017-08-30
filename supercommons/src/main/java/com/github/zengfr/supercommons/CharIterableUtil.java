package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharIterableUtil{ 
/**
*public static it.unimi.dsi.fastutil.chars.CharCollection it.unimi.dsi.fastutil.chars.CharCollections.asCollection(it.unimi.dsi.fastutil.chars.CharIterable)
*/ 
public static it.unimi.dsi.fastutil.chars.CharCollection asCollection(it.unimi.dsi.fastutil.chars.CharIterable p0){
	return it.unimi.dsi.fastutil.chars.CharCollections.asCollection(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterable it.unimi.dsi.fastutil.io.BinIO.asCharIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterable asCharIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterable(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterable it.unimi.dsi.fastutil.io.BinIO.asCharIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterable asCharIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterable(p0);
}
}
