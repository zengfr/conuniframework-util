package com.zengfr.supercommons;
import com.google.common.collect.Sets;
import org.apache.commons.collections4.set.UnmodifiableNavigableSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NavigableSetUtil{ 
public static <E> java.util.NavigableSet<E> synchronizedNavigableSet(java.util.NavigableSet<E> p0){
return Sets.synchronizedNavigableSet(p0);
}
public static <E> java.util.NavigableSet<E> unmodifiableNavigableSet(java.util.NavigableSet<E> p0){
return Sets.unmodifiableNavigableSet(p0);
}
public static <E> java.util.NavigableSet<E> filter(java.util.NavigableSet<E> p0,com.google.common.base.Predicate<? super E> p1){
return Sets.filter(p0,p1);
}
}
