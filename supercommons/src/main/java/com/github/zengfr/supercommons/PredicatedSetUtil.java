package com.zengfr.supercommons;
import org.apache.commons.collections4.set.PredicatedSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedSetUtil{ 
public static <E> org.apache.commons.collections4.set.PredicatedSet<E> predicatedSet(java.util.Set<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return PredicatedSet.predicatedSet(p0,p1);
}
}
