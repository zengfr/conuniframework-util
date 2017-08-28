package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ObjectSets;
import it.unimi.dsi.fastutil.objects.ObjectSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectSetUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> emptySet(){
return ObjectSets.emptySet();
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> singleton(K p0){
return ObjectSets.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectSet<K> p0){
return ObjectSets.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K> p0){
return ObjectSets.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K> p0,java.lang.Object p1){
return ObjectSets.synchronize(p0,p1);
}
}
