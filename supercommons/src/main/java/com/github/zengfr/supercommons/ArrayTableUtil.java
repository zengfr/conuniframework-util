package com.zengfr.supercommons;
import com.google.common.collect.ArrayTable;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ArrayTableUtil{ 
public static <R,C,V> com.google.common.collect.ArrayTable<R, C, V> create(java.lang.Iterable<? extends R> p0,java.lang.Iterable<? extends C> p1){
return ArrayTable.create(p0,p1);
}
public static <R,C,V> com.google.common.collect.ArrayTable<R, C, V> create(com.google.common.collect.Table<R, C, V> p0){
return ArrayTable.create(p0);
}
}
