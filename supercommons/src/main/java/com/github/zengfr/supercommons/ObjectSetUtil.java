package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectSetUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> it.unimi.dsi.fastutil.objects.ObjectSets.emptySet()
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> emptySet(){
	return it.unimi.dsi.fastutil.objects.ObjectSets.emptySet();
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> it.unimi.dsi.fastutil.objects.ObjectSets.singleton(K)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> singleton(K p0){
	return it.unimi.dsi.fastutil.objects.ObjectSets.singleton(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> it.unimi.dsi.fastutil.objects.ObjectSets.synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectSets.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> it.unimi.dsi.fastutil.objects.ObjectSets.synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ObjectSets.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> it.unimi.dsi.fastutil.objects.ObjectSets.unmodifiable(it.unimi.dsi.fastutil.objects.ObjectSet<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectSet<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectSets.unmodifiable(p0);
}
}
