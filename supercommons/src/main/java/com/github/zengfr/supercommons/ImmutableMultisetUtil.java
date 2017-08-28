package com.github.zengfr.supercommons;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multisets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableMultisetUtil{ 
public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.util.Iterator<? extends E> p0){
return ImmutableMultiset.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.lang.Iterable<? extends E> p0){
return ImmutableMultiset.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(E[] p0){
return ImmutableMultiset.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0,E p1,E p2,E p3,E p4){
return ImmutableMultiset.of(p0,p1,p2,p3,p4);
}
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0,E p1,E p2,E p3){
return ImmutableMultiset.of(p0,p1,p2,p3);
}
public static <E> com.google.common.collect.ImmutableMultiset<E> of(){
return ImmutableMultiset.of();
}
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0,E p1){
return ImmutableMultiset.of(p0,p1);
}
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0){
return ImmutableMultiset.of(p0);
}
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0,E p1,E p2){
return ImmutableMultiset.of(p0,p1,p2);
}
public static <E> com.google.common.collect.ImmutableMultiset<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
return ImmutableMultiset.of(p0,p1,p2,p3,p4,p5,p6);
}
public static <E> com.google.common.collect.ImmutableMultiset<E> copyHighestCountFirst(com.google.common.collect.Multiset<E> p0){
return Multisets.copyHighestCountFirst(p0);
}
}
