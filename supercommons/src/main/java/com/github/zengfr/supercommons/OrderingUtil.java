package com.github.zengfr.supercommons;
import com.google.common.collect.Ordering;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OrderingUtil{ 
public static <T> com.google.common.collect.Ordering<T> from(com.google.common.collect.Ordering<T> p0){
return Ordering.from(p0);
}
public static <T> com.google.common.collect.Ordering<T> from(java.util.Comparator<T> p0){
return Ordering.from(p0);
}
public static com.google.common.collect.Ordering<java.lang.Object> usingToString(){
return Ordering.usingToString();
}
public static com.google.common.collect.Ordering<java.lang.Object> allEqual(){
return Ordering.allEqual();
}
public static <T> com.google.common.collect.Ordering<T> compound(java.lang.Iterable<? extends java.util.Comparator<? super T>> p0){
return Ordering.compound(p0);
}
public static <T> com.google.common.collect.Ordering<T> explicit(java.util.List<T> p0){
return Ordering.explicit(p0);
}
public static <T> com.google.common.collect.Ordering<T> explicit(T p0,T... p1){
return Ordering.explicit(p0,p1);
}
public static com.google.common.collect.Ordering<java.lang.Object> arbitrary(){
return Ordering.arbitrary();
}
public static <C extends java.lang.Comparable > com.google.common.collect.Ordering<C> natural(){
return Ordering.natural();
}
}
