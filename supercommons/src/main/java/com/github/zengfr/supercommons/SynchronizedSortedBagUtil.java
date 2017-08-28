package com.zengfr.supercommons;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SynchronizedSortedBagUtil{ 
public static <E> org.apache.commons.collections4.bag.SynchronizedSortedBag<E> synchronizedSortedBag(org.apache.commons.collections4.SortedBag<E> p0){
return SynchronizedSortedBag.synchronizedSortedBag(p0);
}
}
