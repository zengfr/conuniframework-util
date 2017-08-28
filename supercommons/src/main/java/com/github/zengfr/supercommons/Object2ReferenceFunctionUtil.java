package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ReferenceFunctionUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> singleton(K p0,V p1){
return Object2ReferenceFunctions.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> p0){
return Object2ReferenceFunctions.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> p0,java.lang.Object p1){
return Object2ReferenceFunctions.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> p0){
return Object2ReferenceFunctions.synchronize(p0);
}
}
