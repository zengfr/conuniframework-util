package com.zengfr.supercommons;
import org.apache.commons.collections4.map.FixedSizeSortedMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FixedSizeSortedMapUtil{ 
public static <K,V> org.apache.commons.collections4.map.FixedSizeSortedMap<K, V> fixedSizeSortedMap(java.util.SortedMap<K, V> p0){
return FixedSizeSortedMap.fixedSizeSortedMap(p0);
}
}
