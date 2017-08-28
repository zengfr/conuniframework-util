package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.Arrays;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SwapperUtil{ 
public static void mergeSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
 Arrays.mergeSort(p0,p1,p2,p3);
}
public static void quickSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
 Arrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(int p0,int p1,it.unimi.dsi.fastutil.ints.IntComparator p2,it.unimi.dsi.fastutil.Swapper p3){
 Arrays.parallelQuickSort(p0,p1,p2,p3);
}
}
