package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TickerUtil{ 
/**
*public static com.google.common.base.Stopwatch com.google.common.base.Stopwatch.createStarted(com.google.common.base.Ticker)
*/ 
public static com.google.common.base.Stopwatch createStarted(com.google.common.base.Ticker p0){
	return com.google.common.base.Stopwatch.createStarted(p0);
}
/**
*public static com.google.common.base.Stopwatch com.google.common.base.Stopwatch.createUnstarted(com.google.common.base.Ticker)
*/ 
public static com.google.common.base.Stopwatch createUnstarted(com.google.common.base.Ticker p0){
	return com.google.common.base.Stopwatch.createUnstarted(p0);
}
/**
*public static com.google.common.base.Ticker com.google.common.base.Ticker.systemTicker()
*/ 
public static com.google.common.base.Ticker systemTicker(){
	return com.google.common.base.Ticker.systemTicker();
}
}
