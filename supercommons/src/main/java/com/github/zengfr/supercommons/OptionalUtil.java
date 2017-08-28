package com.github.zengfr.supercommons;
import com.google.common.base.Enums;
import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OptionalUtil{ 
public static <T extends java.lang.Enum<T> > com.google.common.base.Optional<T> getIfPresent(java.lang.Class<T> p0,java.lang.String p1){
return Enums.getIfPresent(p0,p1);
}
public static <T> com.google.common.base.Optional<T> of(T p0){
return Optional.of(p0);
}
public static <T> com.google.common.base.Optional<T> fromNullable(T p0){
return Optional.fromNullable(p0);
}
public static <T> com.google.common.base.Optional<T> absent(){
return Optional.absent();
}
public static <T> com.google.common.base.Optional<T> tryFind(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterables.tryFind(p0,p1);
}
public static <T> com.google.common.base.Optional<T> tryFind(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterators.tryFind(p0,p1);
}
}
