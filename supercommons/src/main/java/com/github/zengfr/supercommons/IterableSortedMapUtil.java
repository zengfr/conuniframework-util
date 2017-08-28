package com.zengfr.supercommons;
import org.apache.commons.collections4.MapUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IterableSortedMapUtil{ 
public static <K,V> org.apache.commons.collections4.IterableSortedMap<K, V> iterableSortedMap(java.util.SortedMap<K, V> p0){
return MapUtils.iterableSortedMap(p0);
}
}
