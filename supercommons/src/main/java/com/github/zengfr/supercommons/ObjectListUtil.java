package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ObjectIterators;
import it.unimi.dsi.fastutil.objects.ObjectLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectListUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> pour(java.util.Iterator<K> p0,int p1){
return ObjectIterators.pour(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> pour(java.util.Iterator<K> p0){
return ObjectIterators.pour(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> emptyList(){
return ObjectLists.emptyList();
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> shuffle(it.unimi.dsi.fastutil.objects.ObjectList<K> p0,java.util.Random p1){
return ObjectLists.shuffle(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> singleton(K p0){
return ObjectLists.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectList<K> p0){
return ObjectLists.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K> p0){
return ObjectLists.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K> p0,java.lang.Object p1){
return ObjectLists.synchronize(p0,p1);
}
}
