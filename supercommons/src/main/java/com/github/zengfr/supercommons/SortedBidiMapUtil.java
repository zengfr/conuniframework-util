package com.github.zengfr.supercommons;
import org.apache.commons.collections.bidimap.UnmodifiableSortedBidiMap;
import org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedBidiMapUtil{ 
public static org.apache.commons.collections.SortedBidiMap decorate(org.apache.commons.collections.SortedBidiMap p0){
return UnmodifiableSortedBidiMap.decorate(p0);
}
public static <K,V> org.apache.commons.collections4.SortedBidiMap<K, V> unmodifiableSortedBidiMap(org.apache.commons.collections4.SortedBidiMap<K, ? extends V> p0){
return UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(p0);
}
}
