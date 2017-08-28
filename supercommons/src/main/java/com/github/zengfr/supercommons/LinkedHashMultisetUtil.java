package com.zengfr.supercommons;
import com.google.common.collect.LinkedHashMultiset;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedHashMultisetUtil{ 
public static <E> com.google.common.collect.LinkedHashMultiset<E> create(int p0){
return LinkedHashMultiset.create(p0);
}
public static <E> com.google.common.collect.LinkedHashMultiset<E> create(java.lang.Iterable<? extends E> p0){
return LinkedHashMultiset.create(p0);
}
public static <E> com.google.common.collect.LinkedHashMultiset<E> create(){
return LinkedHashMultiset.create();
}
}
