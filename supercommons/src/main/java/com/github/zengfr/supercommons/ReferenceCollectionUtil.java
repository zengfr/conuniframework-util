package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceCollectionUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> it.unimi.dsi.fastutil.objects.ReferenceCollections.asCollection(it.unimi.dsi.fastutil.objects.ObjectIterable<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> asCollection(it.unimi.dsi.fastutil.objects.ObjectIterable<K> p0){
	return it.unimi.dsi.fastutil.objects.ReferenceCollections.asCollection(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> it.unimi.dsi.fastutil.objects.ReferenceCollections.synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ReferenceCollections.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> it.unimi.dsi.fastutil.objects.ReferenceCollections.synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K> p0){
	return it.unimi.dsi.fastutil.objects.ReferenceCollections.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> it.unimi.dsi.fastutil.objects.ReferenceCollections.unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceCollection<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceCollection<K> p0){
	return it.unimi.dsi.fastutil.objects.ReferenceCollections.unmodifiable(p0);
}
}
