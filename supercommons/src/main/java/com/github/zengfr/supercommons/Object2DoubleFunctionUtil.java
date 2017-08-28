package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2DoubleFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2DoubleFunctionUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> singleton(K p0,double p1){
return Object2DoubleFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> singleton(K p0,java.lang.Double p1){
return Object2DoubleFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Double> p0){
return Object2DoubleFunctions.primitive(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> p0){
return Object2DoubleFunctions.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> p0){
return Object2DoubleFunctions.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> p0,java.lang.Object p1){
return Object2DoubleFunctions.synchronize(p0,p1);
}
}
