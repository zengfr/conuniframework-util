package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntIterableUtil{ 
/**
*public static it.unimi.dsi.fastutil.ints.IntCollection it.unimi.dsi.fastutil.ints.IntCollections.asCollection(it.unimi.dsi.fastutil.ints.IntIterable)
*/ 
public static it.unimi.dsi.fastutil.ints.IntCollection asCollection(it.unimi.dsi.fastutil.ints.IntIterable p0){
	return it.unimi.dsi.fastutil.ints.IntCollections.asCollection(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterable it.unimi.dsi.fastutil.io.BinIO.asIntIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterable asIntIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterable(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterable it.unimi.dsi.fastutil.io.BinIO.asIntIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterable asIntIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterable(p0);
}
}
