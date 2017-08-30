package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectListIteratorUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.asObjectIterator(java.util.ListIterator<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> asObjectIterator(java.util.ListIterator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.asObjectIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.singleton(K)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> singleton(K p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.singleton(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.unmodifiable(it.unimi.dsi.fastutil.objects.ObjectListIterator<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectListIterator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.unmodifiable(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.wrap(K[],int,int)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> wrap(K[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.wrap(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.wrap(K[])
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> wrap(K... p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.wrap(p0);
}
}
