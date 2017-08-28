package com.github.zengfr.supercommons;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class UnmodifiableMultiValuedMapUtil{ 
public static <K,V> org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap<K, V> unmodifiableMultiValuedMap(org.apache.commons.collections4.MultiValuedMap<? extends K, ? extends V> p0){
return UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(p0);
}
}
