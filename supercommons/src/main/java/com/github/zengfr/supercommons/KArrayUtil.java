package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList;
import it.unimi.dsi.fastutil.objects.ObjectBigArrays;
import it.unimi.dsi.fastutil.objects.ReferenceBigArrayBigList;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class KArrayUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList<K> wrap(K[][] p0){
return ObjectBigArrayBigList.wrap(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList<K> wrap(K[][] p0,long p1){
return ObjectBigArrayBigList.wrap(p0,p1);
}
public static <K> long length(K[][] p0){
return ObjectBigArrays.length(p0);
}
public static <K> K[][] trim(K[][] p0,long p1){
return ObjectBigArrays.trim(p0,p1);
}
public static <K> K[][] copy(K[][] p0,long p1,long p2){
return ObjectBigArrays.copy(p0,p1,p2);
}
public static <K> K[][] copy(K[][] p0){
return ObjectBigArrays.copy(p0);
}
public static <K> void copy(K[][] p0,long p1,K[][] p2,long p3,long p4){
 ObjectBigArrays.copy(p0,p1,p2,p3,p4);
}
public static <K> void set(K[][] p0,long p1,K p2){
 ObjectBigArrays.set(p0,p1,p2);
}
public static <K> void fill(K[][] p0,long p1,long p2,K p3){
 ObjectBigArrays.fill(p0,p1,p2,p3);
}
public static <K> void fill(K[][] p0,K p1){
 ObjectBigArrays.fill(p0,p1);
}
public static <K> K[][] ensureCapacity(K[][] p0,long p1){
return ObjectBigArrays.ensureCapacity(p0,p1);
}
public static <K> K[][] ensureCapacity(K[][] p0,long p1,long p2){
return ObjectBigArrays.ensureCapacity(p0,p1,p2);
}
public static <K> K[][] setLength(K[][] p0,long p1){
return ObjectBigArrays.setLength(p0,p1);
}
public static <K> K[][] grow(K[][] p0,long p1,long p2){
return ObjectBigArrays.grow(p0,p1,p2);
}
public static <K> K[][] grow(K[][] p0,long p1){
return ObjectBigArrays.grow(p0,p1);
}
public static <K> long binarySearch(K[][] p0,long p1,long p2,K p3){
return ObjectBigArrays.binarySearch(p0,p1,p2,p3);
}
public static <K> long binarySearch(K[][] p0,long p1,long p2,K p3,java.util.Comparator<K> p4){
return ObjectBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static <K> long binarySearch(K[][] p0,java.lang.Object p1){
return ObjectBigArrays.binarySearch(p0,p1);
}
public static <K> long binarySearch(K[][] p0,K p1,java.util.Comparator<K> p2){
return ObjectBigArrays.binarySearch(p0,p1,p2);
}
public static <K> K[][] shuffle(K[][] p0,long p1,long p2,java.util.Random p3){
return ObjectBigArrays.shuffle(p0,p1,p2,p3);
}
public static <K> K[][] shuffle(K[][] p0,java.util.Random p1){
return ObjectBigArrays.shuffle(p0,p1);
}
public static <K> void swap(K[][] p0,long p1,long p2){
 ObjectBigArrays.swap(p0,p1,p2);
}
public static <K> void ensureFromTo(K[][] p0,long p1,long p2){
 ObjectBigArrays.ensureFromTo(p0,p1,p2);
}
public static <K> void quickSort(K[][] p0,java.util.Comparator<K> p1){
 ObjectBigArrays.quickSort(p0,p1);
}
public static <K> void quickSort(K[][] p0,long p1,long p2){
 ObjectBigArrays.quickSort(p0,p1,p2);
}
public static <K> void quickSort(K[][] p0,long p1,long p2,java.util.Comparator<K> p3){
 ObjectBigArrays.quickSort(p0,p1,p2,p3);
}
public static <K> void quickSort(K[][] p0){
 ObjectBigArrays.quickSort(p0);
}
public static <K> void ensureOffsetLength(K[][] p0,long p1,long p2){
 ObjectBigArrays.ensureOffsetLength(p0,p1,p2);
}
public static <K> void copyFromBig(K[][] p0,long p1,K[] p2,int p3,int p4){
 ObjectBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static <K> void copyToBig(K[] p0,int p1,K[][] p2,long p3,long p4){
 ObjectBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static <K> K[][] newBigArray(K[][] p0,long p1){
return ObjectBigArrays.newBigArray(p0,p1);
}
}
