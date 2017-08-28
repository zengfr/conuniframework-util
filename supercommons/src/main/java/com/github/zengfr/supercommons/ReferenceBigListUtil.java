package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ReferenceBigLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceBigListUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> emptyList(){
return ReferenceBigLists.emptyList();
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> shuffle(it.unimi.dsi.fastutil.objects.ReferenceBigList<K> p0,java.util.Random p1){
return ReferenceBigLists.shuffle(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> singleton(K p0){
return ReferenceBigLists.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceBigList<K> p0){
return ReferenceBigLists.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceBigList<K> p0){
return ReferenceBigLists.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceBigList<K> p0,java.lang.Object p1){
return ReferenceBigLists.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> asBigList(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0){
return ReferenceBigLists.asBigList(p0);
}
}
