package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanIterableUtil{ 
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterable it.unimi.dsi.fastutil.io.BinIO.asBooleanIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterable asBooleanIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterable(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterable it.unimi.dsi.fastutil.io.BinIO.asBooleanIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterable asBooleanIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterable(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanCollection it.unimi.dsi.fastutil.booleans.BooleanCollections.asCollection(it.unimi.dsi.fastutil.booleans.BooleanIterable)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanCollection asCollection(it.unimi.dsi.fastutil.booleans.BooleanIterable p0){
	return it.unimi.dsi.fastutil.booleans.BooleanCollections.asCollection(p0);
}
}
