package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AtomicLongMapUtil{ 
/**
*public static <K> com.google.common.util.concurrent.AtomicLongMap<K> com.google.common.util.concurrent.AtomicLongMap.create()
*/ 
public static <K> com.google.common.util.concurrent.AtomicLongMap<K> create(){
	return com.google.common.util.concurrent.AtomicLongMap.create();
}
/**
*public static <K> com.google.common.util.concurrent.AtomicLongMap<K> com.google.common.util.concurrent.AtomicLongMap.create(java.util.Map<? extends K, ? extends java.lang.Long>)
*/ 
public static <K> com.google.common.util.concurrent.AtomicLongMap<K> create(java.util.Map<? extends K, ? extends java.lang.Long> p0){
	return com.google.common.util.concurrent.AtomicLongMap.create(p0);
}
}
