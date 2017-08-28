package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceSortedSetUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> singleton(K p0){
return ReferenceSortedSets.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> singleton(K p0,java.util.Comparator<? super K> p1){
return ReferenceSortedSets.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> p0){
return ReferenceSortedSets.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> p0){
return ReferenceSortedSets.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> p0,java.lang.Object p1){
return ReferenceSortedSets.synchronize(p0,p1);
}
}
