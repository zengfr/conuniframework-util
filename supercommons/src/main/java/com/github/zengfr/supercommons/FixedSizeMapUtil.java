package com.zengfr.supercommons;
import org.apache.commons.collections4.map.FixedSizeMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FixedSizeMapUtil{ 
public static <K,V> org.apache.commons.collections4.map.FixedSizeMap<K, V> fixedSizeMap(java.util.Map<K, V> p0){
return FixedSizeMap.fixedSizeMap(p0);
}
}
