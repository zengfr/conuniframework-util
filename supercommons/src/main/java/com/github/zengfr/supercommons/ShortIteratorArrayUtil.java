package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortIteratorArrayUtil{ 
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.concat(it.unimi.dsi.fastutil.shorts.ShortIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.concat(it.unimi.dsi.fastutil.shorts.ShortIterator[])
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator... p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.concat(p0);
}
}
