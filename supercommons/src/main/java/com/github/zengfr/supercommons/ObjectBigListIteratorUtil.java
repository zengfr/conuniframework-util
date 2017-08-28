package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ObjectBigListIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectBigListIteratorUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> singleton(K p0){
return ObjectBigListIterators.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> p0){
return ObjectBigListIterators.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigListIterator<K> asBigListIterator(it.unimi.dsi.fastutil.objects.ObjectListIterator<K> p0){
return ObjectBigListIterators.asBigListIterator(p0);
}
}
