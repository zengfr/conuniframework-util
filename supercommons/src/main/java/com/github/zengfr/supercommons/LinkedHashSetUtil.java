package com.zengfr.supercommons;
import com.google.common.collect.Sets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedHashSetUtil{ 
public static <E> java.util.LinkedHashSet<E> newLinkedHashSet(){
return Sets.newLinkedHashSet();
}
public static <E> java.util.LinkedHashSet<E> newLinkedHashSet(java.lang.Iterable<? extends E> p0){
return Sets.newLinkedHashSet(p0);
}
public static <E> java.util.LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int p0){
return Sets.newLinkedHashSetWithExpectedSize(p0);
}
}
