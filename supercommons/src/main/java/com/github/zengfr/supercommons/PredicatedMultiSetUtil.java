package com.zengfr.supercommons;
import org.apache.commons.collections4.multiset.PredicatedMultiSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedMultiSetUtil{ 
public static <E> org.apache.commons.collections4.multiset.PredicatedMultiSet<E> predicatedMultiSet(org.apache.commons.collections4.MultiSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return PredicatedMultiSet.predicatedMultiSet(p0,p1);
}
}
