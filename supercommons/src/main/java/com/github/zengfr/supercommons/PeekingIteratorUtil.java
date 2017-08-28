package com.github.zengfr.supercommons;
import com.google.common.collect.Iterators;
import org.apache.commons.collections4.iterators.PeekingIterator;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PeekingIteratorUtil{ 
public static <T> com.google.common.collect.PeekingIterator<T> peekingIterator(java.util.Iterator<? extends T> p0){
return Iterators.peekingIterator(p0);
}
public static <T> com.google.common.collect.PeekingIterator<T> peekingIterator(com.google.common.collect.PeekingIterator<T> p0){
return Iterators.peekingIterator(p0);
}
public static <E> org.apache.commons.collections4.iterators.PeekingIterator<E> peekingIterator(java.util.Iterator<? extends E> p0){
return PeekingIterator.peekingIterator(p0);
}
}
