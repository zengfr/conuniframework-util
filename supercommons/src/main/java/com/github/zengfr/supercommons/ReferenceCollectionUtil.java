package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ReferenceCollections;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceCollectionUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceCollection<K> p0){
return ReferenceCollections.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K> p0,java.lang.Object p1){
return ReferenceCollections.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K> p0){
return ReferenceCollections.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> asCollection(it.unimi.dsi.fastutil.objects.ObjectIterable<K> p0){
return ReferenceCollections.asCollection(p0);
}
}
