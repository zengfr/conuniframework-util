package com.zengfr.supercommons;
import com.google.common.collect.Multisets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultisetUtil{ 
public static <E> com.google.common.collect.Multiset<E> sum(com.google.common.collect.Multiset<? extends E> p0,com.google.common.collect.Multiset<? extends E> p1){
return Multisets.sum(p0,p1);
}
public static <E> com.google.common.collect.Multiset<E> filter(com.google.common.collect.Multiset<E> p0,com.google.common.base.Predicate<? super E> p1){
return Multisets.filter(p0,p1);
}
public static <E> com.google.common.collect.Multiset<E> intersection(com.google.common.collect.Multiset<E> p0,com.google.common.collect.Multiset<?> p1){
return Multisets.intersection(p0,p1);
}
public static <E> com.google.common.collect.Multiset<E> union(com.google.common.collect.Multiset<? extends E> p0,com.google.common.collect.Multiset<? extends E> p1){
return Multisets.union(p0,p1);
}
public static <E> com.google.common.collect.Multiset<E> difference(com.google.common.collect.Multiset<E> p0,com.google.common.collect.Multiset<?> p1){
return Multisets.difference(p0,p1);
}
public static <E> com.google.common.collect.Multiset<E> unmodifiableMultiset(com.google.common.collect.ImmutableMultiset<E> p0){
return Multisets.unmodifiableMultiset(p0);
}
public static <E> com.google.common.collect.Multiset<E> unmodifiableMultiset(com.google.common.collect.Multiset<? extends E> p0){
return Multisets.unmodifiableMultiset(p0);
}
}
