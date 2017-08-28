package com.zengfr.supercommons;
import com.google.common.collect.Maps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedHashMapUtil{ 
public static <K,V> java.util.LinkedHashMap<K, V> newLinkedHashMap(){
return Maps.newLinkedHashMap();
}
public static <K,V> java.util.LinkedHashMap<K, V> newLinkedHashMap(java.util.Map<? extends K, ? extends V> p0){
return Maps.newLinkedHashMap(p0);
}
public static <K,V> java.util.LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int p0){
return Maps.newLinkedHashMapWithExpectedSize(p0);
}
}
