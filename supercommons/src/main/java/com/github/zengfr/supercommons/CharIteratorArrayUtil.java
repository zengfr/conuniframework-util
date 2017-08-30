package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharIteratorArrayUtil{ 
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.concat(it.unimi.dsi.fastutil.chars.CharIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator concat(it.unimi.dsi.fastutil.chars.CharIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.chars.CharIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.concat(it.unimi.dsi.fastutil.chars.CharIterator[])
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator concat(it.unimi.dsi.fastutil.chars.CharIterator... p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.concat(p0);
}
}
