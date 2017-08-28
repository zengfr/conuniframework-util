package com.github.zengfr.supercommons;
import org.apache.commons.collections4.IteratorUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ZippingIteratorUtil{ 
public static <E> org.apache.commons.collections4.iterators.ZippingIterator<E> zippingIterator(java.util.Iterator<? extends E> p0,java.util.Iterator<? extends E> p1,java.util.Iterator<? extends E> p2){
return IteratorUtils.zippingIterator(p0,p1,p2);
}
public static <E> org.apache.commons.collections4.iterators.ZippingIterator<E> zippingIterator(java.util.Iterator<? extends E> p0,java.util.Iterator<? extends E> p1){
return IteratorUtils.zippingIterator(p0,p1);
}
public static <E> org.apache.commons.collections4.iterators.ZippingIterator<E> zippingIterator(java.util.Iterator<? extends E>... p0){
return IteratorUtils.zippingIterator(p0);
}
}
