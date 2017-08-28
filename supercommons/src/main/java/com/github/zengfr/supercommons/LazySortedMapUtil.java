package com.zengfr.supercommons;
import org.apache.commons.collections4.map.LazySortedMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LazySortedMapUtil{ 
public static <K,V> org.apache.commons.collections4.map.LazySortedMap<K, V> lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
return LazySortedMap.lazySortedMap(p0,p1);
}
public static <K,V> org.apache.commons.collections4.map.LazySortedMap<K, V> lazySortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
return LazySortedMap.lazySortedMap(p0,p1);
}
}
