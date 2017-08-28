package com.github.zengfr.supercommons;
import com.google.common.collect.Tables;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RowSortedTableUtil{ 
public static <R,C,V> com.google.common.collect.RowSortedTable<R, C, V> unmodifiableRowSortedTable(com.google.common.collect.RowSortedTable<R, ? extends C, ? extends V> p0){
return Tables.unmodifiableRowSortedTable(p0);
}
}
