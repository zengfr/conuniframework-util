package com.github.zengfr.supercommons;
import org.apache.commons.collections4.splitmap.TransformedSplitMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedSplitMapUtil{ 
public static <J,K,U,V> org.apache.commons.collections4.splitmap.TransformedSplitMap<J, K, U, V> transformingMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super J, ? extends K> p1,org.apache.commons.collections4.Transformer<? super U, ? extends V> p2){
return TransformedSplitMap.transformingMap(p0,p1,p2);
}
}
