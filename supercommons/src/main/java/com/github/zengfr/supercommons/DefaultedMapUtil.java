package com.github.zengfr.supercommons;
import org.apache.commons.collections4.map.DefaultedMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DefaultedMapUtil{ 
public static <K,V> org.apache.commons.collections4.map.DefaultedMap<K, V> defaultedMap(java.util.Map<K, V> p0,V p1){
return DefaultedMap.defaultedMap(p0,p1);
}
public static <K,V> org.apache.commons.collections4.map.DefaultedMap<K, V> defaultedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
return DefaultedMap.defaultedMap(p0,p1);
}
}
