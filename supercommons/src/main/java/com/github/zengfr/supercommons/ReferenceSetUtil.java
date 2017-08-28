package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ReferenceSets;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceSetUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> emptySet(){
return ReferenceSets.emptySet();
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> singleton(K p0){
return ReferenceSets.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceSet<K> p0){
return ReferenceSets.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K> p0){
return ReferenceSets.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K> p0,java.lang.Object p1){
return ReferenceSets.synchronize(p0,p1);
}
}
