package com.zengfr.supercommons;
import com.google.common.collect.Lists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ArrayListUtil{ 
public static <E> java.util.ArrayList<E> newArrayList(E... p0){
return Lists.newArrayList(p0);
}
public static <E> java.util.ArrayList<E> newArrayList(){
return Lists.newArrayList();
}
public static <E> java.util.ArrayList<E> newArrayList(java.util.Iterator<? extends E> p0){
return Lists.newArrayList(p0);
}
public static <E> java.util.ArrayList<E> newArrayList(java.lang.Iterable<? extends E> p0){
return Lists.newArrayList(p0);
}
public static <E> java.util.ArrayList<E> newArrayListWithCapacity(int p0){
return Lists.newArrayListWithCapacity(p0);
}
public static <E> java.util.ArrayList<E> newArrayListWithExpectedSize(int p0){
return Lists.newArrayListWithExpectedSize(p0);
}
}
