package com.zengfr.supercommons;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.iterators.UnmodifiableOrderedMapIterator;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OrderedMapIteratorUtil{ 
public static org.apache.commons.collections.OrderedMapIterator emptyOrderedMapIterator(){
return IteratorUtils.emptyOrderedMapIterator();
}
public static org.apache.commons.collections.OrderedMapIterator decorate(org.apache.commons.collections.OrderedMapIterator p0){
return UnmodifiableOrderedMapIterator.decorate(p0);
}
public static <K,V> org.apache.commons.collections4.OrderedMapIterator<K, V> unmodifiableOrderedMapIterator(org.apache.commons.collections4.OrderedMapIterator<K, ? extends V> p0){
return UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(p0);
}
}
