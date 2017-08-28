package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2ByteFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ByteFunctionUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> singleton(K p0,java.lang.Byte p1){
return Object2ByteFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> singleton(K p0,byte p1){
return Object2ByteFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> p0){
return Object2ByteFunctions.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Byte> p0){
return Object2ByteFunctions.primitive(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> p0,java.lang.Object p1){
return Object2ByteFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> p0){
return Object2ByteFunctions.synchronize(p0);
}
}
