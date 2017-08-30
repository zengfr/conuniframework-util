package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceListUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> it.unimi.dsi.fastutil.objects.ReferenceLists.emptyList()
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> emptyList(){
	return it.unimi.dsi.fastutil.objects.ReferenceLists.emptyList();
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> it.unimi.dsi.fastutil.objects.ReferenceLists.shuffle(it.unimi.dsi.fastutil.objects.ReferenceList<K>,java.util.Random)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> shuffle(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.objects.ReferenceLists.shuffle(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> it.unimi.dsi.fastutil.objects.ReferenceLists.singleton(K)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> singleton(K p0){
	return it.unimi.dsi.fastutil.objects.ReferenceLists.singleton(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> it.unimi.dsi.fastutil.objects.ReferenceLists.synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0){
	return it.unimi.dsi.fastutil.objects.ReferenceLists.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> it.unimi.dsi.fastutil.objects.ReferenceLists.synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.ReferenceLists.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> it.unimi.dsi.fastutil.objects.ReferenceLists.unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceList<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0){
	return it.unimi.dsi.fastutil.objects.ReferenceLists.unmodifiable(p0);
}
}
