package com.github.zengfr.supercommons;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableSetUtil{ 
public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.lang.Iterable<? extends E> p0){
return ImmutableSet.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.util.Collection<? extends E> p0){
return ImmutableSet.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableSet<E> copyOf(E[] p0){
return ImmutableSet.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.util.Iterator<? extends E> p0){
return ImmutableSet.copyOf(p0);
}
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0,E p1,E p2,E p3,E p4){
return ImmutableSet.of(p0,p1,p2,p3,p4);
}
public static <E> com.google.common.collect.ImmutableSet<E> of(){
return ImmutableSet.of();
}
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0,E p1,E p2){
return ImmutableSet.of(p0,p1,p2);
}
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0,E p1){
return ImmutableSet.of(p0,p1);
}
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0){
return ImmutableSet.of(p0);
}
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E... p6){
return ImmutableSet.of(p0,p1,p2,p3,p4,p5,p6);
}
public static <E> com.google.common.collect.ImmutableSet<E> of(E p0,E p1,E p2,E p3){
return ImmutableSet.of(p0,p1,p2,p3);
}
public static <E extends java.lang.Enum<E> > com.google.common.collect.ImmutableSet<E> immutableEnumSet(E p0,E... p1){
return Sets.immutableEnumSet(p0,p1);
}
public static <E extends java.lang.Enum<E> > com.google.common.collect.ImmutableSet<E> immutableEnumSet(java.lang.Iterable<E> p0){
return Sets.immutableEnumSet(p0);
}
}
