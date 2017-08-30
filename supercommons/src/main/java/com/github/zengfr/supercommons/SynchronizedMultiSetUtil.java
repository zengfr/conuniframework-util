package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SynchronizedMultiSetUtil{ 
/**
*public static <E> org.apache.commons.collections4.multiset.SynchronizedMultiSet<E> org.apache.commons.collections4.multiset.SynchronizedMultiSet.synchronizedMultiSet(org.apache.commons.collections4.MultiSet<E>)
*/ 
public static <E> org.apache.commons.collections4.multiset.SynchronizedMultiSet<E> synchronizedMultiSet(org.apache.commons.collections4.MultiSet<E> p0){
	return org.apache.commons.collections4.multiset.SynchronizedMultiSet.synchronizedMultiSet(p0);
}
}
