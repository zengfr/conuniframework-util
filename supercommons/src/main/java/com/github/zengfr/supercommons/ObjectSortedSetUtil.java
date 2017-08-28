package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ObjectSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectSortedSetUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> singleton(K p0){
return ObjectSortedSets.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> singleton(K p0,java.util.Comparator<? super K> p1){
return ObjectSortedSets.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> p0){
return ObjectSortedSets.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> p0){
return ObjectSortedSets.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> p0,java.lang.Object p1){
return ObjectSortedSets.synchronize(p0,p1);
}
}
