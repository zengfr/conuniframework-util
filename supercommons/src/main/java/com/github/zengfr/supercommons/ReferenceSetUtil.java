package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceSetUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> it.unimi.dsi.fastutil.objects.ReferenceSets.emptySet()
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> emptySet(){
	return it.unimi.dsi.fastutil.objects.ReferenceSets.emptySet();
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> it.unimi.dsi.fastutil.objects.ReferenceSets.singleton(K)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> singleton(K p0){
	return it.unimi.dsi.fastutil.objects.ReferenceSets.singleton(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> it.unimi.dsi.fastutil.objects.ReferenceSets.synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K> p0){
	return it.unimi.dsi.fastutil.objects.ReferenceSets.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> it.unimi.dsi.fastutil.objects.ReferenceSets.synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ReferenceSets.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> it.unimi.dsi.fastutil.objects.ReferenceSets.unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceSet<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceSet<K> p0){
	return it.unimi.dsi.fastutil.objects.ReferenceSets.unmodifiable(p0);
}
}
