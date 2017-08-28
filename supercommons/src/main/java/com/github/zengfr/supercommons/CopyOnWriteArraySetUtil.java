package com.zengfr.supercommons;
import com.google.common.collect.Sets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CopyOnWriteArraySetUtil{ 
public static <E> java.util.concurrent.CopyOnWriteArraySet<E> newCopyOnWriteArraySet(java.lang.Iterable<? extends E> p0){
return Sets.newCopyOnWriteArraySet(p0);
}
public static <E> java.util.concurrent.CopyOnWriteArraySet<E> newCopyOnWriteArraySet(){
return Sets.newCopyOnWriteArraySet();
}
}
