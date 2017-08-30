package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatIteratorArrayUtil{ 
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.concat(it.unimi.dsi.fastutil.floats.FloatIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator concat(it.unimi.dsi.fastutil.floats.FloatIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.concat(it.unimi.dsi.fastutil.floats.FloatIterator[])
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator concat(it.unimi.dsi.fastutil.floats.FloatIterator... p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.concat(p0);
}
}
