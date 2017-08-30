package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongIteratorArrayUtil{ 
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.concat(it.unimi.dsi.fastutil.longs.LongIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.longs.LongIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.concat(it.unimi.dsi.fastutil.longs.LongIterator[])
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator[] p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.concat(p0);
}
}
