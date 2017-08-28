package com.zengfr.supercommons;
import com.google.common.collect.Sets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashSetUtil{ 
public static <E> java.util.HashSet<E> newHashSetWithExpectedSize(int p0){
return Sets.newHashSetWithExpectedSize(p0);
}
public static <E> java.util.HashSet<E> newHashSet(){
return Sets.newHashSet();
}
public static <E> java.util.HashSet<E> newHashSet(E... p0){
return Sets.newHashSet(p0);
}
public static <E> java.util.HashSet<E> newHashSet(java.lang.Iterable<? extends E> p0){
return Sets.newHashSet(p0);
}
public static <E> java.util.HashSet<E> newHashSet(java.util.Iterator<? extends E> p0){
return Sets.newHashSet(p0);
}
}
