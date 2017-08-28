package com.zengfr.supercommons;
import com.google.common.collect.Iterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class UnmodifiableIteratorUtil{ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> emptyIterator(){
return Iterators.emptyIterator();
}
public static <T> com.google.common.collect.UnmodifiableIterator<T> singletonIterator(T p0){
return Iterators.singletonIterator(p0);
}
public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterators.filter(p0,p1);
}
public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(java.util.Iterator<?> p0,java.lang.Class<T> p1){
return Iterators.filter(p0,p1);
}
public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> partition(java.util.Iterator<T> p0,int p1){
return Iterators.partition(p0,p1);
}
public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(java.util.Iterator<T> p0){
return Iterators.unmodifiableIterator(p0);
}
public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T> p0){
return Iterators.unmodifiableIterator(p0);
}
public static <T> com.google.common.collect.UnmodifiableIterator<T> mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>> p0,java.util.Comparator<? super T> p1){
return Iterators.mergeSorted(p0,p1);
}
public static <T> com.google.common.collect.UnmodifiableIterator<T> forEnumeration(java.util.Enumeration<T> p0){
return Iterators.forEnumeration(p0);
}
public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> paddedPartition(java.util.Iterator<T> p0,int p1){
return Iterators.paddedPartition(p0,p1);
}
public static <T> com.google.common.collect.UnmodifiableIterator<T> forArray(T... p0){
return Iterators.forArray(p0);
}
}
