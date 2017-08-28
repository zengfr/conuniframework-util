package com.github.zengfr.supercommons;
import com.google.common.collect.Maps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashMapUtil{ 
public static <K,V> java.util.HashMap<K, V> newHashMap(){
return Maps.newHashMap();
}
public static <K,V> java.util.HashMap<K, V> newHashMap(java.util.Map<? extends K, ? extends V> p0){
return Maps.newHashMap(p0);
}
public static <K,V> java.util.HashMap<K, V> newHashMapWithExpectedSize(int p0){
return Maps.newHashMapWithExpectedSize(p0);
}
}
