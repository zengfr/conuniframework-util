package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2ByteMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2ByteMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> emptyMap(){
return Reference2ByteMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> singleton(K p0,byte p1){
return Reference2ByteMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> singleton(K p0,java.lang.Byte p1){
return Reference2ByteMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> p0){
return Reference2ByteMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> p0,java.lang.Object p1){
return Reference2ByteMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> p0){
return Reference2ByteMaps.synchronize(p0);
}
}
