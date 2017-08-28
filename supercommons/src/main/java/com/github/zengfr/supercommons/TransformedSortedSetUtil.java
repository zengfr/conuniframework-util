package com.zengfr.supercommons;
import org.apache.commons.collections4.set.TransformedSortedSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedSortedSetUtil{ 
public static <E> org.apache.commons.collections4.set.TransformedSortedSet<E> transformingSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedSortedSet.transformingSortedSet(p0,p1);
}
public static <E> org.apache.commons.collections4.set.TransformedSortedSet<E> transformedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedSortedSet.transformedSortedSet(p0,p1);
}
}
