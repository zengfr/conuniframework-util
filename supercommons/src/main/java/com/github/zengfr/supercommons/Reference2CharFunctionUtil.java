package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2CharFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2CharFunctionUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> singleton(K p0,java.lang.Character p1){
return Reference2CharFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> singleton(K p0,char p1){
return Reference2CharFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> p0){
return Reference2CharFunctions.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Character> p0){
return Reference2CharFunctions.primitive(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> p0,java.lang.Object p1){
return Reference2CharFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> p0){
return Reference2CharFunctions.synchronize(p0);
}
}
