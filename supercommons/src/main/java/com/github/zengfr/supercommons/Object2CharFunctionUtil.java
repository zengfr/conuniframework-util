package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2CharFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2CharFunctionUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> singleton(K p0,char p1){
return Object2CharFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> singleton(K p0,java.lang.Character p1){
return Object2CharFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Character> p0){
return Object2CharFunctions.primitive(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2CharFunction<K> p0){
return Object2CharFunctions.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2CharFunction<K> p0){
return Object2CharFunctions.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2CharFunction<K> p0,java.lang.Object p1){
return Object2CharFunctions.synchronize(p0,p1);
}
}
