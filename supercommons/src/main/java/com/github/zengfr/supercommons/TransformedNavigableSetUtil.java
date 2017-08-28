package com.zengfr.supercommons;
import org.apache.commons.collections4.set.TransformedNavigableSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedNavigableSetUtil{ 
public static <E> org.apache.commons.collections4.set.TransformedNavigableSet<E> transformedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedNavigableSet.transformedNavigableSet(p0,p1);
}
public static <E> org.apache.commons.collections4.set.TransformedNavigableSet<E> transformingNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedNavigableSet.transformingNavigableSet(p0,p1);
}
}
