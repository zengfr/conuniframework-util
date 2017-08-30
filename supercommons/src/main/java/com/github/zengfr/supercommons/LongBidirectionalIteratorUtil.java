package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongBidirectionalIteratorUtil{ 
/**
*public static it.unimi.dsi.fastutil.longs.LongBidirectionalIterator it.unimi.dsi.fastutil.longs.LongIterators.fromTo(long,long)
*/ 
public static it.unimi.dsi.fastutil.longs.LongBidirectionalIterator fromTo(long p0,long p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.fromTo(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongBidirectionalIterator it.unimi.dsi.fastutil.longs.LongIterators.unmodifiable(it.unimi.dsi.fastutil.longs.LongBidirectionalIterator)
*/ 
public static it.unimi.dsi.fastutil.longs.LongBidirectionalIterator unmodifiable(it.unimi.dsi.fastutil.longs.LongBidirectionalIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.unmodifiable(p0);
}
}
