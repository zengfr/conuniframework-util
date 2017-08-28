package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2CharSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2IntSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2LongSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps;
import it.unimi.dsi.fastutil.chars.CharArrays;
import it.unimi.dsi.fastutil.chars.CharBigArrays;
import it.unimi.dsi.fastutil.chars.CharComparators;
import it.unimi.dsi.fastutil.chars.CharHeaps;
import it.unimi.dsi.fastutil.chars.CharIndirectHeaps;
import it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps;
import it.unimi.dsi.fastutil.chars.CharSortedSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharComparatorUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(java.lang.Character p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(char p0,boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static java.util.Comparator<? super java.util.Map.java.util.Map.Entry<java.lang.Character, ?>> entryComparator(it.unimi.dsi.fastutil.chars.CharComparator p0){
return Char2BooleanSortedMaps.entryComparator(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(java.lang.Character p0,java.lang.Byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(char p0,byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(java.lang.Character p0,java.lang.Character p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(char p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(java.lang.Character p0,java.lang.Double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(char p0,double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(java.lang.Character p0,java.lang.Float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(char p0,float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(java.lang.Character p0,java.lang.Integer p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(char p0,int p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(java.lang.Character p0,java.lang.Long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2LongSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(char p0,long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(java.lang.Character p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(char p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(java.lang.Character p0,java.lang.Short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ShortSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(char p0,short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ShortSortedMaps.singleton(p0,p1,p2);
}
public static int binarySearch(char[] p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return CharArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(char[] p0,int p1,int p2,char p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static void mergeSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
 CharArrays.mergeSort(p0,p1);
}
public static void mergeSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3,char[] p4){
 CharArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void quickSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
 CharArrays.quickSort(p0,p1);
}
public static void quickSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharArrays.quickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
 CharArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static long binarySearch(char[][] p0,long p1,long p2,char p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(char[][] p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return CharBigArrays.binarySearch(p0,p1,p2);
}
public static void quickSort(char[][] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
 CharBigArrays.quickSort(p0,p1);
}
public static void quickSort(char[][] p0,long p1,long p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharBigArrays.quickSort(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.chars.CharComparator oppositeComparator(it.unimi.dsi.fastutil.chars.CharComparator p0){
return CharComparators.oppositeComparator(p0);
}
public static it.unimi.dsi.fastutil.chars.CharComparator asCharComparator(java.util.Comparator<? super java.lang.Character> p0){
return CharComparators.asCharComparator(p0);
}
public static void makeHeap(char[] p0,int p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
 CharHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
return CharHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
return CharHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(char[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.chars.CharComparator p5){
 CharIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(char[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
 CharIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(char[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.chars.CharComparator p5){
return CharIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(char[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.chars.CharComparator p5){
return CharIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static int[] makeHeap(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
return CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(char[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
 CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(char[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static int downHeap(char[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(char[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static int front(char[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
return CharSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(char p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
return CharSortedSets.singleton(p0,p1);
}
}
