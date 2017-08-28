package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2ObjectFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ObjectFunctionUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> singleton(K p0,V p1){
return Object2ObjectFunctions.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> p0){
return Object2ObjectFunctions.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> p0,java.lang.Object p1){
return Object2ObjectFunctions.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> p0){
return Object2ObjectFunctions.synchronize(p0);
}
}
