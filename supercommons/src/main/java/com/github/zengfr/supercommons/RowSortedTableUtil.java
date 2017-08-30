package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RowSortedTableUtil{ 
/**
*public static <R,C,V> com.google.common.collect.RowSortedTable<R, C, V> com.google.common.collect.Tables.unmodifiableRowSortedTable(com.google.common.collect.RowSortedTable<R, ? extends C, ? extends V>)
*/ 
public static <R,C,V> com.google.common.collect.RowSortedTable<R, C, V> unmodifiableRowSortedTable(com.google.common.collect.RowSortedTable<R, ? extends C, ? extends V> p0){
	return com.google.common.collect.Tables.unmodifiableRowSortedTable(p0);
}
}
