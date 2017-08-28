package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2ObjectFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ObjectFunctionUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> singleton(K p0,V p1){
return Reference2ObjectFunctions.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> p0){
return Reference2ObjectFunctions.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> p0,java.lang.Object p1){
return Reference2ObjectFunctions.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> p0){
return Reference2ObjectFunctions.synchronize(p0);
}
}
