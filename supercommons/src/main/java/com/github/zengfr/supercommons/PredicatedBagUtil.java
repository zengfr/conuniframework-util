package com.zengfr.supercommons;
import org.apache.commons.collections4.bag.PredicatedBag;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedBagUtil{ 
public static <E> org.apache.commons.collections4.bag.PredicatedBag<E> predicatedBag(org.apache.commons.collections4.Bag<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return PredicatedBag.predicatedBag(p0,p1);
}
}