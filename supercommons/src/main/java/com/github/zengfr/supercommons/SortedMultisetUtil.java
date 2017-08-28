package com.github.zengfr.supercommons;
import com.google.common.collect.Multisets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SortedMultisetUtil{ 
public static <E> com.google.common.collect.SortedMultiset<E> unmodifiableSortedMultiset(com.google.common.collect.SortedMultiset<E> p0){
return Multisets.unmodifiableSortedMultiset(p0);
}
}
