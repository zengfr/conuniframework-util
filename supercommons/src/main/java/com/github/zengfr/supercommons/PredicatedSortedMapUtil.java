package com.github.zengfr.supercommons;
import org.apache.commons.collections4.map.PredicatedSortedMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedSortedMapUtil{ 
public static <K,V> org.apache.commons.collections4.map.PredicatedSortedMap<K, V> predicatedSortedMap(java.util.SortedMap<K, V> p0,org.apache.commons.collections4.Predicate<? super K> p1,org.apache.commons.collections4.Predicate<? super V> p2){
return PredicatedSortedMap.predicatedSortedMap(p0,p1,p2);
}
}
