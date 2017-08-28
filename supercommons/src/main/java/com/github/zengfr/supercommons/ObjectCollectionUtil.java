package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ObjectCollections;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectCollectionUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectCollection<K> p0){
return ObjectCollections.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K> p0,java.lang.Object p1){
return ObjectCollections.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K> p0){
return ObjectCollections.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> asCollection(it.unimi.dsi.fastutil.objects.ObjectIterable<K> p0){
return ObjectCollections.asCollection(p0);
}
}
