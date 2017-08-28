package com.zengfr.supercommons;
import org.apache.commons.collections.bidimap.UnmodifiableOrderedBidiMap;
import org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OrderedBidiMapUtil{ 
public static org.apache.commons.collections.OrderedBidiMap decorate(org.apache.commons.collections.OrderedBidiMap p0){
return UnmodifiableOrderedBidiMap.decorate(p0);
}
public static <K,V> org.apache.commons.collections4.OrderedBidiMap<K, V> unmodifiableOrderedBidiMap(org.apache.commons.collections4.OrderedBidiMap<? extends K, ? extends V> p0){
return UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(p0);
}
}
