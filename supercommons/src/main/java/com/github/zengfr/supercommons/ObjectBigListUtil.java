package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ObjectBigLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectBigListUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> emptyList(){
return ObjectBigLists.emptyList();
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> shuffle(it.unimi.dsi.fastutil.objects.ObjectBigList<K> p0,java.util.Random p1){
return ObjectBigLists.shuffle(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> singleton(K p0){
return ObjectBigLists.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectBigList<K> p0){
return ObjectBigLists.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectBigList<K> p0){
return ObjectBigLists.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectBigList<K> p0,java.lang.Object p1){
return ObjectBigLists.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> asBigList(it.unimi.dsi.fastutil.objects.ObjectList<K> p0){
return ObjectBigLists.asBigList(p0);
}
}
