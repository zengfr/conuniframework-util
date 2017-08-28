package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2IntFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2IntFunctionUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> singleton(K p0,java.lang.Integer p1){
return Object2IntFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> singleton(K p0,int p1){
return Object2IntFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2IntFunction<K> p0){
return Object2IntFunctions.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Integer> p0){
return Object2IntFunctions.primitive(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K> p0,java.lang.Object p1){
return Object2IntFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K> p0){
return Object2IntFunctions.synchronize(p0);
}
}
