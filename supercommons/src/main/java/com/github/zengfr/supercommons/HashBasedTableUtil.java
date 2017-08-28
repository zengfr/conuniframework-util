package com.github.zengfr.supercommons;
import com.google.common.collect.HashBasedTable;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashBasedTableUtil{ 
public static <R,C,V> com.google.common.collect.HashBasedTable<R, C, V> create(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> p0){
return HashBasedTable.create(p0);
}
public static <R,C,V> com.google.common.collect.HashBasedTable<R, C, V> create(int p0,int p1){
return HashBasedTable.create(p0,p1);
}
public static <R,C,V> com.google.common.collect.HashBasedTable<R, C, V> create(){
return HashBasedTable.create();
}
}
