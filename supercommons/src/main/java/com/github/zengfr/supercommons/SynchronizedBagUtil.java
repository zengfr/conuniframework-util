package com.github.zengfr.supercommons;
import org.apache.commons.collections4.bag.SynchronizedBag;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SynchronizedBagUtil{ 
public static <E> org.apache.commons.collections4.bag.SynchronizedBag<E> synchronizedBag(org.apache.commons.collections4.Bag<E> p0){
return SynchronizedBag.synchronizedBag(p0);
}
}
