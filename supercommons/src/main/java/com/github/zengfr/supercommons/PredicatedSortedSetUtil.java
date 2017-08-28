package com.github.zengfr.supercommons;
import org.apache.commons.collections4.set.PredicatedSortedSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedSortedSetUtil{ 
public static <E> org.apache.commons.collections4.set.PredicatedSortedSet<E> predicatedSortedSet(java.util.SortedSet<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return PredicatedSortedSet.predicatedSortedSet(p0,p1);
}
}
