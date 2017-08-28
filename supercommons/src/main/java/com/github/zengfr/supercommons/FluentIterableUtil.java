package com.zengfr.supercommons;
import com.google.common.collect.FluentIterable;
import org.apache.commons.collections4.FluentIterable;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FluentIterableUtil{ 
public static <E> com.google.common.collect.FluentIterable<E> of(E[] p0){
return FluentIterable.of(p0);
}
public static <E> com.google.common.collect.FluentIterable<E> from(com.google.common.collect.FluentIterable<E> p0){
return FluentIterable.from(p0);
}
public static <E> com.google.common.collect.FluentIterable<E> from(java.lang.Iterable<E> p0){
return FluentIterable.from(p0);
}
public static <T> org.apache.commons.collections4.FluentIterable<T> of(java.lang.Iterable<T> p0){
return FluentIterable.of(p0);
}
public static <T> org.apache.commons.collections4.FluentIterable<T> of(T... p0){
return FluentIterable.of(p0);
}
public static <T> org.apache.commons.collections4.FluentIterable<T> of(T p0){
return FluentIterable.of(p0);
}
public static <T> org.apache.commons.collections4.FluentIterable<T> empty(){
return FluentIterable.empty();
}
}
