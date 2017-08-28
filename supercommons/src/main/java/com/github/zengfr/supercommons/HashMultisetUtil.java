package com.github.zengfr.supercommons;
import com.google.common.collect.HashMultiset;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashMultisetUtil{ 
public static <E> com.google.common.collect.HashMultiset<E> create(int p0){
return HashMultiset.create(p0);
}
public static <E> com.google.common.collect.HashMultiset<E> create(java.lang.Iterable<? extends E> p0){
return HashMultiset.create(p0);
}
public static <E> com.google.common.collect.HashMultiset<E> create(){
return HashMultiset.create();
}
}
