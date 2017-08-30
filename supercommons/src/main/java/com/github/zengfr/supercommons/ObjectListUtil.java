package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectListUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> it.unimi.dsi.fastutil.objects.ObjectLists.emptyList()
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> emptyList(){
	return it.unimi.dsi.fastutil.objects.ObjectLists.emptyList();
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> it.unimi.dsi.fastutil.objects.ObjectIterators.pour(java.util.Iterator<K>,int)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> pour(java.util.Iterator<K> p0,int p1){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.pour(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> it.unimi.dsi.fastutil.objects.ObjectIterators.pour(java.util.Iterator<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> pour(java.util.Iterator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.pour(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> it.unimi.dsi.fastutil.objects.ObjectLists.shuffle(it.unimi.dsi.fastutil.objects.ObjectList<K>,java.util.Random)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> shuffle(it.unimi.dsi.fastutil.objects.ObjectList<K> p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.objects.ObjectLists.shuffle(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> it.unimi.dsi.fastutil.objects.ObjectLists.singleton(K)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> singleton(K p0){
	return it.unimi.dsi.fastutil.objects.ObjectLists.singleton(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> it.unimi.dsi.fastutil.objects.ObjectLists.synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectLists.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> it.unimi.dsi.fastutil.objects.ObjectLists.synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ObjectLists.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> it.unimi.dsi.fastutil.objects.ObjectLists.unmodifiable(it.unimi.dsi.fastutil.objects.ObjectList<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectList<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectLists.unmodifiable(p0);
}
}
