package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2ReferenceMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ReferenceMapUtil{ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> emptyMap(){
return Char2ReferenceMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> singleton(char p0,V p1){
return Char2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> singleton(java.lang.Character p0,V p1){
return Char2ReferenceMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> unmodifiable(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> p0){
return Char2ReferenceMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> p0,java.lang.Object p1){
return Char2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> p0){
return Char2ReferenceMaps.synchronize(p0);
}
}
