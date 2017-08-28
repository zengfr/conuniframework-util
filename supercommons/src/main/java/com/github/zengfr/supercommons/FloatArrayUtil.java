package com.github.zengfr.supercommons;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang.ArrayUtils;
import com.google.common.primitives.Floats;
import org.apache.commons.lang3.math.IEEE754rUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.util.MathArrays;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatBigArrays;
import it.unimi.dsi.fastutil.floats.FloatHeaps;
import it.unimi.dsi.fastutil.floats.FloatIndirectHeaps;
import it.unimi.dsi.fastutil.floats.FloatIterators;
import it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import org.apache.commons.lang.math.IEEE754rUtils;
import org.apache.commons.lang.math.NumberUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatArrayUtil{ 
public static java.lang.Float[] nullToEmpty(java.lang.Float[] p0){
return ArrayUtils.nullToEmpty(p0);
}
public static java.lang.Float[] toObject(float[] p0){
return ArrayUtils.toObject(p0);
}
public static float[] toPrimitive(java.lang.Float[] p0,float p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static float[] toPrimitive(java.lang.Float[] p0){
return ArrayUtils.toPrimitive(p0);
}
public static float min(float... p0){
return Floats.min(p0);
}
public static float max(float... p0){
return Floats.max(p0);
}
public static int indexOf(float[] p0,float[] p1){
return Floats.indexOf(p0,p1);
}
public static int indexOf(float[] p0,float p1){
return Floats.indexOf(p0,p1);
}
public static float[] concat(float[]... p0){
return Floats.concat(p0);
}
public static boolean contains(float[] p0,float p1){
return Floats.contains(p0,p1);
}
public static java.lang.String join(java.lang.String p0,float... p1){
return Floats.join(p0,p1);
}
public static int lastIndexOf(float[] p0,float p1){
return Floats.lastIndexOf(p0,p1);
}
public static float[] toArray(java.util.Collection<? extends java.lang.Number> p0){
return Floats.toArray(p0);
}
public static java.util.List<java.lang.Float> asList(float... p0){
return Floats.asList(p0);
}
public static float[] ensureCapacity(float[] p0,int p1,int p2){
return Floats.ensureCapacity(p0,p1,p2);
}
public static float[] add(float[] p0,int p1,float p2){
return ArrayUtils.add(p0,p1,p2);
}
public static float[] add(float[] p0,float p1){
return ArrayUtils.add(p0,p1);
}
public static float[] remove(float[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static float[] clone(float[] p0){
return ArrayUtils.clone(p0);
}
public static int indexOf(float[] p0,float p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static boolean isEmpty(float[] p0){
return ArrayUtils.isEmpty(p0);
}
public static int lastIndexOf(float[] p0,float p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static float[] addAll(float[] p0,float... p1){
return ArrayUtils.addAll(p0,p1);
}
public static void reverse(float[] p0){
 ArrayUtils.reverse(p0);
}
public static void reverse(float[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static float[] removeAll(float[] p0,int... p1){
return ArrayUtils.removeAll(p0,p1);
}
public static float[] removeElement(float[] p0,float p1){
return ArrayUtils.removeElement(p0,p1);
}
public static boolean isNotEmpty(float[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static float[] nullToEmpty(float[] p0){
return ArrayUtils.nullToEmpty(p0);
}
public static boolean isSorted(float[] p0){
return ArrayUtils.isSorted(p0);
}
public static float[] subarray(float[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static boolean isSameLength(float[] p0,float[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static float[] removeElements(float[] p0,float... p1){
return ArrayUtils.removeElements(p0,p1);
}
public static java.lang.String join(float[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(float[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static boolean equalsIncludingNaN(float[] p0,float[] p1){
return MathArrays.equalsIncludingNaN(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatArrayList wrap(float[] p0){
return FloatArrayList.wrap(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatArrayList wrap(float[] p0,int p1){
return FloatArrayList.wrap(p0,p1);
}
public static float[] trim(float[] p0,int p1){
return FloatArrays.trim(p0,p1);
}
public static float[] copy(float[] p0){
return FloatArrays.copy(p0);
}
public static float[] copy(float[] p0,int p1,int p2){
return FloatArrays.copy(p0,p1,p2);
}
public static void fill(float[] p0,int p1,int p2,float p3){
 FloatArrays.fill(p0,p1,p2,p3);
}
public static void fill(float[] p0,float p1){
 FloatArrays.fill(p0,p1);
}
public static float[] ensureCapacity(float[] p0,int p1){
return FloatArrays.ensureCapacity(p0,p1);
}
public static float[] setLength(float[] p0,int p1){
return FloatArrays.setLength(p0,p1);
}
public static float[] grow(float[] p0,int p1){
return FloatArrays.grow(p0,p1);
}
public static float[] grow(float[] p0,int p1,int p2){
return FloatArrays.grow(p0,p1,p2);
}
public static int binarySearch(float[] p0,int p1,int p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static int binarySearch(float[] p0,float p1){
return FloatArrays.binarySearch(p0,p1);
}
public static int binarySearch(float[] p0,int p1,int p2,float p3){
return FloatArrays.binarySearch(p0,p1,p2,p3);
}
public static int binarySearch(float[] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return FloatArrays.binarySearch(p0,p1,p2);
}
public static float[] shuffle(float[] p0,java.util.Random p1){
return FloatArrays.shuffle(p0,p1);
}
public static float[] shuffle(float[] p0,int p1,int p2,java.util.Random p3){
return FloatArrays.shuffle(p0,p1,p2,p3);
}
public static void swap(float[] p0,int p1,int p2,int p3){
 FloatArrays.swap(p0,p1,p2,p3);
}
public static void swap(float[] p0,int p1,int p2){
 FloatArrays.swap(p0,p1,p2);
}
public static void mergeSort(float[] p0,int p1,int p2,float[] p3){
 FloatArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatArrays.mergeSort(p0,p1);
}
public static void mergeSort(float[] p0,int p1,int p2){
 FloatArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(float[] p0){
 FloatArrays.mergeSort(p0);
}
public static void mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3,float[] p4){
 FloatArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void radixSortIndirect(int[] p0,float[] p1,boolean p2){
 FloatArrays.radixSortIndirect(p0,p1,p2);
}
public static void radixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,boolean p3){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,int p3,int p4,boolean p5){
 FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void parallelRadixSort(float[] p0,int p1,int p2){
 FloatArrays.parallelRadixSort(p0,p1,p2);
}
public static void parallelRadixSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(float[] p0,float[] p1){
 FloatArrays.parallelRadixSort(p0,p1);
}
public static void parallelRadixSort(float[] p0){
 FloatArrays.parallelRadixSort(p0);
}
public static void parallelRadixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
 FloatArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSortIndirect(int[] p0,float[] p1,boolean p2){
 FloatArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static void ensureFromTo(float[] p0,int p1,int p2){
 FloatArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatArrays.quickSort(p0,p1);
}
public static void quickSort(float[] p0){
 FloatArrays.quickSort(p0);
}
public static void quickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(float[] p0,float[] p1){
 FloatArrays.quickSort(p0,p1);
}
public static void quickSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(float[] p0,int p1,int p2){
 FloatArrays.quickSort(p0,p1,p2);
}
public static void ensureSameLength(float[] p0,float[] p1){
 FloatArrays.ensureSameLength(p0,p1);
}
public static void stabilize(int[] p0,float[] p1,int p2,int p3){
 FloatArrays.stabilize(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,float[] p1){
 FloatArrays.stabilize(p0,p1);
}
public static void radixSort(float[] p0){
 FloatArrays.radixSort(p0);
}
public static void radixSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.radixSort(p0,p1,p2,p3);
}
public static void radixSort(float[] p0,float[] p1){
 FloatArrays.radixSort(p0,p1);
}
public static void radixSort(float[] p0,int p1,int p2){
 FloatArrays.radixSort(p0,p1,p2);
}
public static void ensureOffsetLength(float[] p0,int p1,int p2){
 FloatArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSort(float[] p0,float[] p1,int p2,int p3){
 FloatArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(float[] p0){
 FloatArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(float[] p0,int p1,int p2){
 FloatArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
 FloatArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(float[] p0,float[] p1){
 FloatArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,float[] p1,int p2,int p3){
 FloatArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,float[] p1){
 FloatArrays.quickSortIndirect(p0,p1);
}
public static void parallelQuickSortIndirect(int[] p0,float[] p1){
 FloatArrays.parallelQuickSortIndirect(p0,p1);
}
public static void parallelQuickSortIndirect(int[] p0,float[] p1,int p2,int p3){
 FloatArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void copyToBig(float[] p0,int p1,float[][] p2,long p3,long p4){
 FloatBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(float[][] p0,long p1,float[] p2,int p3,int p4){
 FloatBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static void makeHeap(float[] p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
 FloatHeaps.makeHeap(p0,p1,p2);
}
public static int downHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
return FloatHeaps.downHeap(p0,p1,p2,p3);
}
public static int upHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
return FloatHeaps.upHeap(p0,p1,p2,p3);
}
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
 FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
public static void makeHeap(float[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
 FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static int downHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
return FloatIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
public static int upHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
return FloatIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
public static it.unimi.dsi.fastutil.floats.FloatListIterator wrap(float[] p0,int p1,int p2){
return FloatIterators.wrap(p0,p1,p2);
}
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1,int p2,int p3){
return FloatIterators.unwrap(p0,p1,p2,p3);
}
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1){
return FloatIterators.unwrap(p0,p1);
}
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
return FloatIterators.unwrap(p0,p1);
}
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0){
return FloatIterators.unwrap(p0);
}
public static int[] makeHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
return FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
 FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
public static void makeHeap(float[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
 FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
public static int downHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
public static int upHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
public static int front(float[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
return FloatSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
public static int front(float[] p0,int[] p1,int p2,int[] p3){
return FloatSemiIndirectHeaps.front(p0,p1,p2,p3);
}
public static int loadFloats(java.io.DataInput p0,float[] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static int loadFloats(java.io.File p0,float[] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static int loadFloats(java.lang.CharSequence p0,float[] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static int loadFloats(java.io.File p0,float[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static float[] loadFloats(java.io.File p0) throws java.io.IOException{
return BinIO.loadFloats(p0);
}
public static float[] loadFloats(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadFloats(p0);
}
public static int loadFloats(java.lang.CharSequence p0,float[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static int loadFloats(java.io.DataInput p0,float[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static int loadFloats(java.io.BufferedReader p0,float[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadFloats(p0,p1,p2,p3);
}
public static int loadFloats(java.io.BufferedReader p0,float[] p1) throws java.io.IOException{
return TextIO.loadFloats(p0,p1);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,java.io.PrintStream p1){
 TextIO.storeFloats(p0,p1);
}
public static float[] addAll(float[] p0,float[] p1){
return ArrayUtils.addAll(p0,p1);
}
public static float min(float[] p0){
return IEEE754rUtils.min(p0);
}
public static float max(float[] p0){
return IEEE754rUtils.max(p0);
}
}
