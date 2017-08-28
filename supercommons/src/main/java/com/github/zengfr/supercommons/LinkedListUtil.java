package com.github.zengfr.supercommons;
import com.google.common.collect.Lists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LinkedListUtil{ 
public static <E> java.util.LinkedList<E> newLinkedList(java.lang.Iterable<? extends E> p0){
return Lists.newLinkedList(p0);
}
public static <E> java.util.LinkedList<E> newLinkedList(){
return Lists.newLinkedList();
}
}
