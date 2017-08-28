package com.zengfr.supercommons;
import org.apache.commons.collections4.multiset.SynchronizedMultiSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SynchronizedMultiSetUtil{ 
public static <E> org.apache.commons.collections4.multiset.SynchronizedMultiSet<E> synchronizedMultiSet(org.apache.commons.collections4.MultiSet<E> p0){
return SynchronizedMultiSet.synchronizedMultiSet(p0);
}
}
