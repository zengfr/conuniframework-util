package com.github.zengfr.supercommons;
import org.apache.commons.collections4.IteratorUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BoundedIteratorUtil{ 
public static <E> org.apache.commons.collections4.iterators.BoundedIterator<E> boundedIterator(java.util.Iterator<? extends E> p0,long p1){
return IteratorUtils.boundedIterator(p0,p1);
}
public static <E> org.apache.commons.collections4.iterators.BoundedIterator<E> boundedIterator(java.util.Iterator<? extends E> p0,long p1,long p2){
return IteratorUtils.boundedIterator(p0,p1,p2);
}
}
