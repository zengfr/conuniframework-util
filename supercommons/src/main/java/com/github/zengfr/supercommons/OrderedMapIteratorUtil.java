package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OrderedMapIteratorUtil{ 
/**
*public static org.apache.commons.collections.OrderedMapIterator org.apache.commons.collections.IteratorUtils.emptyOrderedMapIterator()
*/ 
public static org.apache.commons.collections.OrderedMapIterator emptyOrderedMapIterator(){
	return org.apache.commons.collections.IteratorUtils.emptyOrderedMapIterator();
}
/**
*public static org.apache.commons.collections.OrderedMapIterator org.apache.commons.collections.iterators.UnmodifiableOrderedMapIterator.decorate(org.apache.commons.collections.OrderedMapIterator)
*/ 
public static org.apache.commons.collections.OrderedMapIterator decorate(org.apache.commons.collections.OrderedMapIterator p0){
	return org.apache.commons.collections.iterators.UnmodifiableOrderedMapIterator.decorate(p0);
}
/**
*public static <K,V> org.apache.commons.collections4.OrderedMapIterator<K, V> org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(org.apache.commons.collections4.OrderedMapIterator<K, ? extends V>)
*/ 
public static <K,V> org.apache.commons.collections4.OrderedMapIterator<K, V> unmodifiableOrderedMapIterator(org.apache.commons.collections4.OrderedMapIterator<K, ? extends V> p0){
	return org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(p0);
}
}
