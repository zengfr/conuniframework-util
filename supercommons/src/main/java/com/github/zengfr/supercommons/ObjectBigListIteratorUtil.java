package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectBigListIteratorUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> it.unimi.dsi.fastutil.objects.ObjectBigListIterators.singleton(K)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> singleton(K p0){
	return it.unimi.dsi.fastutil.objects.ObjectBigListIterators.singleton(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> it.unimi.dsi.fastutil.objects.ObjectBigListIterators.unmodifiable(it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectBigListIterators.unmodifiable(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> it.unimi.dsi.fastutil.objects.ObjectBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.objects.ObjectListIterator<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> asBigListIterator(it.unimi.dsi.fastutil.objects.ObjectListIterator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectBigListIterators.asBigListIterator(p0);
}
}
