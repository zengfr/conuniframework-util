package com.zengfr.supercommons;
import org.apache.commons.collections4.iterators.PushbackIterator;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PushbackIteratorUtil{ 
public static <E> org.apache.commons.collections4.iterators.PushbackIterator<E> pushbackIterator(java.util.Iterator<? extends E> p0){
return PushbackIterator.pushbackIterator(p0);
}
}
