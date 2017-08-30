package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectCollectionUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> it.unimi.dsi.fastutil.objects.ObjectCollections.asCollection(it.unimi.dsi.fastutil.objects.ObjectIterable<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> asCollection(it.unimi.dsi.fastutil.objects.ObjectIterable<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectCollections.asCollection(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> it.unimi.dsi.fastutil.objects.ObjectCollections.synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ObjectCollections.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> it.unimi.dsi.fastutil.objects.ObjectCollections.synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectCollections.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> it.unimi.dsi.fastutil.objects.ObjectCollections.unmodifiable(it.unimi.dsi.fastutil.objects.ObjectCollection<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectCollection<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectCollections.unmodifiable(p0);
}
}
