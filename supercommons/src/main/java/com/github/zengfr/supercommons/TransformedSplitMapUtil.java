package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedSplitMapUtil{ 
/**
*public static <J,K,U,V> org.apache.commons.collections4.splitmap.TransformedSplitMap<J, K, U, V> org.apache.commons.collections4.splitmap.TransformedSplitMap.transformingMap(java.util.Map<K, V>,org.apache.commons.collections4.Transformer<? super J, ? extends K>,org.apache.commons.collections4.Transformer<? super U, ? extends V>)
*/ 
public static <J,K,U,V> org.apache.commons.collections4.splitmap.TransformedSplitMap<J, K, U, V> transformingMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super J, ? extends K> p1,org.apache.commons.collections4.Transformer<? super U, ? extends V> p2){
	return org.apache.commons.collections4.splitmap.TransformedSplitMap.transformingMap(p0,p1,p2);
}
}
