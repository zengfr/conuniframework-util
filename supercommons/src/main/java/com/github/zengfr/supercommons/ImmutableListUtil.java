package com.zengfr.supercommons;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableListUtil{ 
public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.util.Collection<? extends E> p0){
return ImmutableList.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.lang.Iterable<? extends E> p0){
return ImmutableList.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableList<E> copyOf(E[] p0){
return ImmutableList.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.util.Iterator<? extends E> p0){
return ImmutableList.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4){
return ImmutableList.of(p0,p1,p2,p3,p4);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5){
return ImmutableList.of(p0,p1,p2,p3,p4,p5);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0){
return ImmutableList.of(p0);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1){
return ImmutableList.of(p0,p1);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2){
return ImmutableList.of(p0,p1,p2);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3){
return ImmutableList.of(p0,p1,p2,p3);
}
public static <E> com.google.common.collect.ImmutableList<E> of(){
return ImmutableList.of();
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10,E p11,E... p12){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8){
return ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
public static com.google.common.collect.ImmutableList<java.lang.Character> charactersOf(java.lang.String p0){
return Lists.charactersOf(p0);
}
public static <T> com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<T>> inCompletionOrder(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>> p0){
return Futures.inCompletionOrder(p0);
}
}
