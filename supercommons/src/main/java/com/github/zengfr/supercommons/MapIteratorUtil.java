package com.zengfr.supercommons;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.iterators.UnmodifiableMapIterator;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MapIteratorUtil{ 
public static org.apache.commons.collections.MapIterator unmodifiableMapIterator(org.apache.commons.collections.MapIterator p0){
return IteratorUtils.unmodifiableMapIterator(p0);
}
public static org.apache.commons.collections.MapIterator emptyMapIterator(){
return IteratorUtils.emptyMapIterator();
}
public static org.apache.commons.collections.MapIterator decorate(org.apache.commons.collections.MapIterator p0){
return UnmodifiableMapIterator.decorate(p0);
}
public static <K,V> org.apache.commons.collections4.MapIterator<K, V> unmodifiableMapIterator(org.apache.commons.collections4.MapIterator<K, V> p0){
return IteratorUtils.unmodifiableMapIterator(p0);
}
public static <K,V> org.apache.commons.collections4.MapIterator<K, V> unmodifiableMapIterator(org.apache.commons.collections4.MapIterator<? extends K, ? extends V> p0){
return UnmodifiableMapIterator.unmodifiableMapIterator(p0);
}
}
