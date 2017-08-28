package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2BooleanFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2BooleanFunctionUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> singleton(K p0,java.lang.Boolean p1){
return Reference2BooleanFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> singleton(K p0,boolean p1){
return Reference2BooleanFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> p0){
return Reference2BooleanFunctions.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Boolean> p0){
return Reference2BooleanFunctions.primitive(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> p0,java.lang.Object p1){
return Reference2BooleanFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> p0){
return Reference2BooleanFunctions.synchronize(p0);
}
}
