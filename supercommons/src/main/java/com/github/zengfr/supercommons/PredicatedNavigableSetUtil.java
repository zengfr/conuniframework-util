package com.zengfr.supercommons;
import org.apache.commons.collections4.set.PredicatedNavigableSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedNavigableSetUtil{ 
public static <E> org.apache.commons.collections4.set.PredicatedNavigableSet<E> predicatedNavigableSet(java.util.NavigableSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return PredicatedNavigableSet.predicatedNavigableSet(p0,p1);
}
}
