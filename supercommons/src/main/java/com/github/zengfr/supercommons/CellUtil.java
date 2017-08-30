package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CellUtil{ 
/**
*public static <R,C,V> com.google.common.collect.Table.com.google.common.collect.Table$Cell<R, C, V> com.google.common.collect.Tables.immutableCell(R,C,V)
*/ 
public static <R,C,V> Cell<R, C, V> immutableCell(R p0,C p1,V p2){
	return com.google.common.collect.Tables.immutableCell(p0,p1,p2);
}
}
