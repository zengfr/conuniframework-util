package com.zengfr.supercommons;
import org.apache.commons.collections4.list.LazyList;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LazyListUtil{ 
public static <E> org.apache.commons.collections4.list.LazyList<E> lazyList(java.util.List<E> p0,org.apache.commons.collections4.Factory<? extends E> p1){
return LazyList.lazyList(p0,p1);
}
}
