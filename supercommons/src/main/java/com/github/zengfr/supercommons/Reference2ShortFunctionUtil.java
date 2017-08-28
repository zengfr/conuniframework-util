package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2ShortFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ShortFunctionUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> singleton(K p0,short p1){
return Reference2ShortFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> singleton(K p0,java.lang.Short p1){
return Reference2ShortFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Short> p0){
return Reference2ShortFunctions.primitive(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> p0){
return Reference2ShortFunctions.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> p0){
return Reference2ShortFunctions.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> p0,java.lang.Object p1){
return Reference2ShortFunctions.synchronize(p0,p1);
}
}
