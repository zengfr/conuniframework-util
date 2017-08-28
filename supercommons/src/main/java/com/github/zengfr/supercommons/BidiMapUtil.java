package com.zengfr.supercommons;
import org.apache.commons.collections.bidimap.UnmodifiableBidiMap;
import org.apache.commons.collections4.bidimap.UnmodifiableBidiMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BidiMapUtil{ 
public static org.apache.commons.collections.BidiMap decorate(org.apache.commons.collections.BidiMap p0){
return UnmodifiableBidiMap.decorate(p0);
}
public static <K,V> org.apache.commons.collections4.BidiMap<K, V> unmodifiableBidiMap(org.apache.commons.collections4.BidiMap<? extends K, ? extends V> p0){
return UnmodifiableBidiMap.unmodifiableBidiMap(p0);
}
}
