package com.github.zengfr.supercommons;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import com.google.common.primitives.Booleans;
import org.apache.commons.lang3.Conversion;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanArrays;
import it.unimi.dsi.fastutil.booleans.BooleanBigArrays;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanArrayUtil{ 
public static java.lang.Boolean[] nullToEmpty(java.lang.Boolean[] p0){
return ArrayUtils.nullToEmpty(p0);
}
public static java.lang.Boolean[] toObject(boolean[] p0){
return ArrayUtils.toObject(p0);
}
public static boolean[] toPrimitive(java.lang.Boolean[] p0,boolean p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static boolean[] toPrimitive(java.lang.Boolean[] p0){
return ArrayUtils.toPrimitive(p0);
}
public static java.lang.Boolean and(java.lang.Boolean... p0){
return BooleanUtils.and(p0);
}
public static java.lang.Boolean or(java.lang.Boolean... p0){
return BooleanUtils.or(p0);
}
public static java.lang.Boolean xor(java.lang.Boolean... p0){
return BooleanUtils.xor(p0);
}
public static java.lang.Boolean xor(java.lang.Boolean[] p0){
return BooleanUtils.xor(p0);
}
public static int indexOf(boolean[] p0,boolean[] p1){
return Booleans.indexOf(p0,p1);
}
public static int indexOf(boolean[] p0,boolean p1){
return Booleans.indexOf(p0,p1);
}
public static boolean[] concat(boolean[]... p0){
return Booleans.concat(p0);
}
public static boolean contains(boolean[] p0,boolean p1){
return Booleans.contains(p0,p1);
}
public static java.lang.String join(java.lang.String p0,boolean... p1){
return Booleans.join(p0,p1);
}
public static int lastIndexOf(boolean[] p0,boolean p1){
return Booleans.lastIndexOf(p0,p1);
}
public static boolean[] toArray(java.util.Collection<java.lang.Boolean> p0){
return Booleans.toArray(p0);
}
public static java.util.List<java.lang.Boolean> asList(boolean... p0){
return Booleans.asList(p0);
}
public static boolean[] ensureCapacity(boolean[] p0,int p1,int p2){
return Booleans.ensureCapacity(p0,p1,p2);
}
public static int countTrue(boolean... p0){
return Booleans.countTrue(p0);
}
public static boolean[] add(boolean[] p0,int p1,boolean p2){
return ArrayUtils.add(p0,p1,p2);
}
public static boolean[] add(boolean[] p0,boolean p1){
return ArrayUtils.add(p0,p1);
}
public static boolean[] remove(boolean[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static boolean[] clone(boolean[] p0){
return ArrayUtils.clone(p0);
}
public static int indexOf(boolean[] p0,boolean p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static boolean isEmpty(boolean[] p0){
return ArrayUtils.isEmpty(p0);
}
public static int lastIndexOf(boolean[] p0,boolean p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static boolean[] addAll(boolean[] p0,boolean... p1){
return ArrayUtils.addAll(p0,p1);
}
public static void reverse(boolean[] p0){
 ArrayUtils.reverse(p0);
}
public static void reverse(boolean[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static boolean[] removeAll(boolean[] p0,int... p1){
return ArrayUtils.removeAll(p0,p1);
}
public static boolean[] removeElement(boolean[] p0,boolean p1){
return ArrayUtils.removeElement(p0,p1);
}
public static boolean isNotEmpty(boolean[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static boolean[] nullToEmpty(boolean[] p0){
return ArrayUtils.nullToEmpty(p0);
}
public static boolean isSorted(boolean[] p0){
return ArrayUtils.isSorted(p0);
}
public static boolean[] subarray(boolean[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static boolean isSameLength(boolean[] p0,boolean[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static boolean[] removeElements(boolean[] p0,boolean... p1){
return ArrayUtils.removeElements(p0,p1);
}
public static boolean and(boolean... p0){
return BooleanUtils.and(p0);
}
public static boolean or(boolean... p0){
return BooleanUtils.or(p0);
}
public static boolean xor(boolean... p0){
return BooleanUtils.xor(p0);
}
public static boolean[] byteToBinary(byte p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.byteToBinary(p0,p1,p2,p3,p4);
}
public static boolean[] shortToBinary(short p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.shortToBinary(p0,p1,p2,p3,p4);
}
public static char binaryToHexDigit(boolean[] p0,int p1){
return Conversion.binaryToHexDigit(p0,p1);
}
public static char binaryToHexDigit(boolean[] p0){
return Conversion.binaryToHexDigit(p0);
}
public static int binaryToInt(boolean[] p0,int p1,int p2,int p3,int p4){
return Conversion.binaryToInt(p0,p1,p2,p3,p4);
}
public static short binaryToShort(boolean[] p0,int p1,short p2,int p3,int p4){
return Conversion.binaryToShort(p0,p1,p2,p3,p4);
}
public static byte binaryToByte(boolean[] p0,int p1,byte p2,int p3,int p4){
return Conversion.binaryToByte(p0,p1,p2,p3,p4);
}
public static long binaryToLong(boolean[] p0,int p1,long p2,int p3,int p4){
return Conversion.binaryToLong(p0,p1,p2,p3,p4);
}
public static boolean[] hexDigitToBinary(char p0){
return Conversion.hexDigitToBinary(p0);
}
public static boolean[] intToBinary(int p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.intToBinary(p0,p1,p2,p3,p4);
}
public static boolean[] longToBinary(long p0,int p1,boolean[] p2,int p3,int p4){
return Conversion.longToBinary(p0,p1,p2,p3,p4);
}
public static boolean[] hexDigitMsb0ToBinary(char p0){
return Conversion.hexDigitMsb0ToBinary(p0);
}
public static char binaryToHexDigitMsb0_4bits(boolean[] p0){
return Conversion.binaryToHexDigitMsb0_4bits(p0);
}
public static char binaryToHexDigitMsb0_4bits(boolean[] p0,int p1){
return Conversion.binaryToHexDigitMsb0_4bits(p0,p1);
}
public static char binaryBeMsb0ToHexDigit(boolean[] p0){
return Conversion.binaryBeMsb0ToHexDigit(p0);
}
public static char binaryBeMsb0ToHexDigit(boolean[] p0,int p1){
return Conversion.binaryBeMsb0ToHexDigit(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanArrayList wrap(boolean[] p0){
return BooleanArrayList.wrap(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanArrayList wrap(boolean[] p0,int p1){
return BooleanArrayList.wrap(p0,p1);
}
public static boolean[] trim(boolean[] p0,int p1){
return BooleanArrays.trim(p0,p1);
}
public static boolean[] copy(boolean[] p0,int p1,int p2){
return BooleanArrays.copy(p0,p1,p2);
}
public static boolean[] copy(boolean[] p0){
return BooleanArrays.copy(p0);
}
public static void fill(boolean[] p0,int p1,int p2,boolean p3){
 BooleanArrays.fill(p0,p1,p2,p3);
}
public static void fill(boolean[] p0,boolean p1){
 BooleanArrays.fill(p0,p1);
}
public static boolean[] ensureCapacity(boolean[] p0,int p1){
return BooleanArrays.ensureCapacity(p0,p1);
}
public static boolean[] setLength(boolean[] p0,int p1){
return BooleanArrays.setLength(p0,p1);
}
public static boolean[] grow(boolean[] p0,int p1,int p2){
return BooleanArrays.grow(p0,p1,p2);
}
public static boolean[] grow(boolean[] p0,int p1){
return BooleanArrays.grow(p0,p1);
}
public static boolean[] shuffle(boolean[] p0,int p1,int p2,java.util.Random p3){
return BooleanArrays.shuffle(p0,p1,p2,p3);
}
public static boolean[] shuffle(boolean[] p0,java.util.Random p1){
return BooleanArrays.shuffle(p0,p1);
}
public static void swap(boolean[] p0,int p1,int p2,int p3){
 BooleanArrays.swap(p0,p1,p2,p3);
}
public static void swap(boolean[] p0,int p1,int p2){
 BooleanArrays.swap(p0,p1,p2);
}
public static void mergeSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanArrays.mergeSort(p0,p1);
}
public static void mergeSort(boolean[] p0,int p1,int p2,boolean[] p3){
 BooleanArrays.mergeSort(p0,p1,p2,p3);
}
public static void mergeSort(boolean[] p0,int p1,int p2){
 BooleanArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(boolean[] p0){
 BooleanArrays.mergeSort(p0);
}
public static void mergeSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3,boolean[] p4){
 BooleanArrays.mergeSort(p0,p1,p2,p3,p4);
}
public static void mergeSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanArrays.mergeSort(p0,p1,p2,p3);
}
public static void ensureFromTo(boolean[] p0,int p1,int p2){
 BooleanArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(boolean[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(boolean[] p0,boolean[] p1){
 BooleanArrays.quickSort(p0,p1);
}
public static void quickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanArrays.quickSort(p0,p1);
}
public static void quickSort(boolean[] p0,int p1,int p2){
 BooleanArrays.quickSort(p0,p1,p2);
}
public static void quickSort(boolean[] p0){
 BooleanArrays.quickSort(p0);
}
public static void ensureSameLength(boolean[] p0,boolean[] p1){
 BooleanArrays.ensureSameLength(p0,p1);
}
public static void stabilize(int[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.stabilize(p0,p1,p2,p3);
}
public static void stabilize(int[] p0,boolean[] p1){
 BooleanArrays.stabilize(p0,p1);
}
public static void ensureOffsetLength(boolean[] p0,int p1,int p2){
 BooleanArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSort(boolean[] p0,it.unimi.dsi.fastutil.booleans.BooleanComparator p1){
 BooleanArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(boolean[] p0,int p1,int p2,it.unimi.dsi.fastutil.booleans.BooleanComparator p3){
 BooleanArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(boolean[] p0){
 BooleanArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(boolean[] p0,int p1,int p2){
 BooleanArrays.parallelQuickSort(p0,p1,p2);
}
public static void parallelQuickSort(boolean[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(boolean[] p0,boolean[] p1){
 BooleanArrays.parallelQuickSort(p0,p1);
}
public static void quickSortIndirect(int[] p0,boolean[] p1){
 BooleanArrays.quickSortIndirect(p0,p1);
}
public static void quickSortIndirect(int[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void parallelQuickSortIndirect(int[] p0,boolean[] p1,int p2,int p3){
 BooleanArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void parallelQuickSortIndirect(int[] p0,boolean[] p1){
 BooleanArrays.parallelQuickSortIndirect(p0,p1);
}
public static void copyToBig(boolean[] p0,int p1,boolean[][] p2,long p3,long p4){
 BooleanBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(boolean[][] p0,long p1,boolean[] p2,int p3,int p4){
 BooleanBigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
public static it.unimi.dsi.fastutil.booleans.BooleanListIterator wrap(boolean[] p0,int p1,int p2){
return BooleanIterators.wrap(p0,p1,p2);
}
public static boolean[] unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
return BooleanIterators.unwrap(p0);
}
public static boolean[] unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
return BooleanIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[] p1){
return BooleanIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[] p1,int p2,int p3){
return BooleanIterators.unwrap(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.File p0,boolean[] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static boolean[] loadBooleans(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadBooleans(p0);
}
public static int loadBooleans(java.lang.CharSequence p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.lang.CharSequence p0,boolean[] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static int loadBooleans(java.io.File p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.DataInput p0,boolean[] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static int loadBooleans(java.io.DataInput p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static boolean[] loadBooleans(java.io.File p0) throws java.io.IOException{
return BinIO.loadBooleans(p0);
}
public static void storeBooleans(boolean[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.BufferedReader p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return TextIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.BufferedReader p0,boolean[] p1) throws java.io.IOException{
return TextIO.loadBooleans(p0,p1);
}
public static void storeBooleans(boolean[] p0,java.io.PrintStream p1){
 TextIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.PrintStream p3){
 TextIO.storeBooleans(p0,p1,p2,p3);
}
public static boolean[] addAll(boolean[] p0,boolean[] p1){
return ArrayUtils.addAll(p0,p1);
}
public static boolean xor(boolean[] p0){
return BooleanUtils.xor(p0);
}
}
