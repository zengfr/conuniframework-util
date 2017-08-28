package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ObjectIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectListIteratorUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> wrap(K[] p0,int p1,int p2){
return ObjectIterators.wrap(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> wrap(K[] p0){
return ObjectIterators.wrap(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> singleton(K p0){
return ObjectIterators.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> asObjectIterator(java.util.ListIterator<K> p0){
return ObjectIterators.asObjectIterator(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectListIterator<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectListIterator<K> p0){
return ObjectIterators.unmodifiable(p0);
}
}
