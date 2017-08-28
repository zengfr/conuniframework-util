package com.zengfr.supercommons;
import com.google.common.collect.HashBiMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashBiMapUtil{ 
public static <K,V> com.google.common.collect.HashBiMap<K, V> create(int p0){
return HashBiMap.create(p0);
}
public static <K,V> com.google.common.collect.HashBiMap<K, V> create(java.util.Map<? extends K, ? extends V> p0){
return HashBiMap.create(p0);
}
public static <K,V> com.google.common.collect.HashBiMap<K, V> create(){
return HashBiMap.create();
}
}
