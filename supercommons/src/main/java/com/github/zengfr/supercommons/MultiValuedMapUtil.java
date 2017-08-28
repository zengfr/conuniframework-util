package com.zengfr.supercommons;
import org.apache.commons.collections4.MultiMapUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultiValuedMapUtil{ 
public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> unmodifiableMultiValuedMap(org.apache.commons.collections4.MultiValuedMap<? extends K, ? extends V> p0){
return MultiMapUtils.unmodifiableMultiValuedMap(p0);
}
public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> transformedMultiValuedMap(org.apache.commons.collections4.MultiValuedMap<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends K> p1,org.apache.commons.collections4.Transformer<? super V, ? extends V> p2){
return MultiMapUtils.transformedMultiValuedMap(p0,p1,p2);
}
public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> emptyMultiValuedMap(){
return MultiMapUtils.emptyMultiValuedMap();
}
public static <K,V> org.apache.commons.collections4.MultiValuedMap<K, V> emptyIfNull(org.apache.commons.collections4.MultiValuedMap<K, V> p0){
return MultiMapUtils.emptyIfNull(p0);
}
}
