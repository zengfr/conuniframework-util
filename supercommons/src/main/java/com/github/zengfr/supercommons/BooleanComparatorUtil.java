package com.github.zengfr.supercommons;
import org.apache.commons.collections.comparators.BooleanComparator;
import org.apache.commons.collections4.comparators.BooleanComparator;
import it.unimi.dsi.fastutil.booleans.BooleanArrays;
import it.unimi.dsi.fastutil.booleans.BooleanBigArrays;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanComparatorUtil{ 
public static org.apache.commons.collections.comparators.BooleanComparator getBooleanComparator(boolean p0){
return BooleanComparator.getBooleanComparator(p0);
}
public static org.apache.commons.collections.comparators.BooleanComparator getFalseFirstComparator(){
return BooleanComparator.getFalseFirstComparator();
}
public static org.apache.commons.collections.comparators.BooleanComparator getTrueFirstComparator(){
return BooleanComparator.getTrueFirstComparator();
}
public static org.apache.commons.collections4.comparators.BooleanComparator booleanComparator(boolean p0){
return BooleanComparator.booleanComparator(p0);
}
public static void mergeSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanArrays.mergeSort(p0,p1);
}
public static void mergeSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3,boolean[] p4){
 BooleanArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanArrays.mergeSort(p0,p1,p2,p3);
}
public static void quickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanArrays.quickSort(p0,p1);
}
public static void parallelQuickSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void quickSort(boolean[][] p0,long p1,long p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanBigArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(boolean[][] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanBigArrays.quickSort(p0,p1);
}
}
