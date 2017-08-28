package com.github.zengfr.supercommons;
import org.apache.commons.collections4.map.TransformedMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedMapUtil{ 
public static <K,V> org.apache.commons.collections4.map.TransformedMap<K, V> transformedMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
return TransformedMap.transformedMap(p0,p1,p2);
}
public static <K,V> org.apache.commons.collections4.map.TransformedMap<K, V> transformingMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
return TransformedMap.transformingMap(p0,p1,p2);
}
}
