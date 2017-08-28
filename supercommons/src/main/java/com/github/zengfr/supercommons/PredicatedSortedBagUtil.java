package com.github.zengfr.supercommons;
import org.apache.commons.collections4.bag.PredicatedSortedBag;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedSortedBagUtil{ 
public static <E> org.apache.commons.collections4.bag.PredicatedSortedBag<E> predicatedSortedBag(org.apache.commons.collections4.SortedBag<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return PredicatedSortedBag.predicatedSortedBag(p0,p1);
}
}
