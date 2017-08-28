package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Object2ByteMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ByteMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteMap<K> emptyMap(){
return Object2ByteMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteMap<K> singleton(K p0,byte p1){
return Object2ByteMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteMap<K> singleton(K p0,java.lang.Byte p1){
return Object2ByteMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ByteMap<K> p0){
return Object2ByteMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ByteMap<K> p0,java.lang.Object p1){
return Object2ByteMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ByteMap<K> p0){
return Object2ByteMaps.synchronize(p0);
}
}
