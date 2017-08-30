package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongPredicateUtil{ 
/**
*public static boolean it.unimi.dsi.fastutil.longs.LongIterators.all(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*/ 
public static boolean all(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.longs.LongIterators.any(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*/ 
public static boolean any(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.any(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.longs.LongIterators.indexOf(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*/ 
public static int indexOf(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.indexOf(p0,p1);
}
}
