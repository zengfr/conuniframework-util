package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ByteFunctionUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.primitive(java.util.function.Function<? super K, ? extends java.lang.Byte>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Byte> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.primitive(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.singleton(K,java.lang.Byte)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> singleton(K p0,java.lang.Byte p1){
	return it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.singleton(K,byte)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> singleton(K p0,byte p1){
	return it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.singleton(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K>,java.lang.Object)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.synchronize(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.synchronize(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ByteFunctions.unmodifiable(p0);
}
}
