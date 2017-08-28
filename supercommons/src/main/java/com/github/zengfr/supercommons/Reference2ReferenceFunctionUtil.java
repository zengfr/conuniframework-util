package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ReferenceFunctionUtil{ 
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> singleton(K p0,V p1){
return Reference2ReferenceFunctions.singleton(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> p0){
return Reference2ReferenceFunctions.unmodifiable(p0);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> p0,java.lang.Object p1){
return Reference2ReferenceFunctions.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> p0){
return Reference2ReferenceFunctions.synchronize(p0);
}
}
