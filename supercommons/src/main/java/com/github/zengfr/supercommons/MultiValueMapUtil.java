package com.zengfr.supercommons;
import org.apache.commons.collections.map.MultiValueMap;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.map.MultiValueMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultiValueMapUtil{ 
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0,org.apache.commons.collections.Factory p1){
return MultiValueMap.decorate(p0,p1);
}
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0){
return MultiValueMap.decorate(p0);
}
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0,java.lang.Class p1){
return MultiValueMap.decorate(p0,p1);
}
public static <K,V> org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, ? super java.util.Collection<V>> p0){
return MapUtils.multiValueMap(p0);
}
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, C> p0,org.apache.commons.collections4.Factory<C> p1){
return MapUtils.multiValueMap(p0,p1);
}
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, C> p0,java.lang.Class<C> p1){
return MapUtils.multiValueMap(p0,p1);
}
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, ? super C> p0,java.lang.Class<C> p1){
return MultiValueMap.multiValueMap(p0,p1);
}
public static <K,V,C extends java.util.Collection<V> > org.apache.commons.collections4.map.MultiValueMap<K, V> multiValueMap(java.util.Map<K, ? super C> p0,org.apache.commons.collections4.Factory<C> p1){
return MultiValueMap.multiValueMap(p0,p1);
}
}
