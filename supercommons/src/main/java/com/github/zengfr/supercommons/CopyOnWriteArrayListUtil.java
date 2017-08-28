package com.zengfr.supercommons;
import com.google.common.collect.Lists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CopyOnWriteArrayListUtil{ 
public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList(java.lang.Iterable<? extends E> p0){
return Lists.newCopyOnWriteArrayList(p0);
}
public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList(){
return Lists.newCopyOnWriteArrayList();
}
}
