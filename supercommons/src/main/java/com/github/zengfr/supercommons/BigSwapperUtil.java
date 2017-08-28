package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.BigArrays;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BigSwapperUtil{ 
public static void mergeSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3){
 BigArrays.mergeSort(p0,p1,p2,p3);
}
public static void quickSort(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2,it.unimi.dsi.fastutil.BigSwapper p3){
 BigArrays.quickSort(p0,p1,p2,p3);
}
}
