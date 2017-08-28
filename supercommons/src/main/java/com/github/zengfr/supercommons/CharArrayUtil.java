package com.github.zengfr.supercommons;
import com.google.common.primitives.Chars;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.text.StrMatcher;
import org.apache.commons.text.StrTokenizer;
import org.apache.commons.text.WordUtils;
import it.unimi.dsi.fastutil.chars.CharArrayList;
import it.unimi.dsi.fastutil.chars.CharArrays;
import it.unimi.dsi.fastutil.chars.CharBigArrays;
import it.unimi.dsi.fastutil.chars.CharHeaps;
import it.unimi.dsi.fastutil.chars.CharIndirectHeaps;
import it.unimi.dsi.fastutil.chars.CharIterators;
import it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps;
import it.unimi.dsi.fastutil.io.BinIO;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.text.StrMatcher;
import org.apache.commons.lang.text.StrTokenizer;
import org.apache.commons.lang.WordUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharArrayUtil{ 
public static char min(char... p0){
return Chars.min(p0);
}
public static char max(char... p0){
return Chars.max(p0);
}
public static int indexOf(char[] p0,char[] p1){
return Chars.indexOf(p0,p1);
}
public static int indexOf(char[] p0,char p1){
return Chars.indexOf(p0,p1);
}
public static char[] concat(char[]... p0){
return Chars.concat(p0);
}
public static boolean contains(char[] p0,char p1){
return Chars.contains(p0,p1);
}
public static java.lang.String join(java.lang.String p0,char... p1){
return Chars.join(p0,p1);
}
public static int lastIndexOf(char[] p0,char p1){
return Chars.lastIndexOf(p0,p1);
}
public static char[] toArray(java.util.Collection<java.lang.Character> p0){
return Chars.toArray(p0);
}
public static java.util.List<java.lang.Character> asList(char... p0){
return Chars.asList(p0);
}
public static char[] ensureCapacity(char[] p0,int p1,int p2){
return Chars.ensureCapacity(p0,p1,p2);
}
public static char[] toCharArray(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
return IOUtils.toCharArray(p0,p1);
}
public static char[] toCharArray(java.io.InputStream p0) throws java.io.IOException{
return IOUtils.toCharArray(p0);
}
public static char[] toCharArray(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.toCharArray(p0,p1);
}
public static char[] toCharArray(java.io.Reader p0) throws java.io.IOException{
return IOUtils.toCharArray(p0);
}
public static void write(char[] p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(char[] p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(char[] p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(char[] p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static int read(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
return IOUtils.read(p0,p1,p2,p3);
}
public static int read(java.io.Reader p0,char[] p1) throws java.io.IOException{
return IOUtils.read(p0,p1);
}
public static void readFully(java.io.Reader p0,char[] p1) throws java.io.IOException{
 IOUtils.readFully(p0,p1);
}
public static void readFully(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
 IOUtils.readFully(p0,p1,p2,p3);
}
public static void writeChunked(char[] p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.writeChunked(p0,p1);
}
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3,char[] p4) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2,p3,p4);
}
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,char[] p2) throws java.io.IOException{
return IOUtils.copyLarge(p0,p1,p2);
}
public static char[] add(char[] p0,int p1,char p2){
return ArrayUtils.add(p0,p1,p2);
}
public static char[] add(char[] p0,char p1){
return ArrayUtils.add(p0,p1);
}
public static char[] remove(char[] p0,int p1){
return ArrayUtils.remove(p0,p1);
}
public static char[] clone(char[] p0){
return ArrayUtils.clone(p0);
}
public static int indexOf(char[] p0,char p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static boolean isEmpty(char[] p0){
return ArrayUtils.isEmpty(p0);
}
public static int lastIndexOf(char[] p0,char p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static char[] addAll(char[] p0,char... p1){
return ArrayUtils.addAll(p0,p1);
}
public static void reverse(char[] p0){
 ArrayUtils.reverse(p0);
}
public static void reverse(char[] p0,int p1,int p2){
 ArrayUtils.reverse(p0,p1,p2);
}
public static char[] removeAll(char[] p0,int... p1){
return ArrayUtils.removeAll(p0,p1);
}
public static char[] removeElement(char[] p0,char p1){
return ArrayUtils.removeElement(p0,p1);
}
public static boolean isNotEmpty(char[] p0){
return ArrayUtils.isNotEmpty(p0);
}
public static char[] nullToEmpty(char[] p0){
return ArrayUtils.nullToEmpty(p0);
}
public static boolean isSorted(char[] p0){
return ArrayUtils.isSorted(p0);
}
public static char[] subarray(char[] p0,int p1,int p2){
return ArrayUtils.subarray(p0,p1,p2);
}
public static boolean isSameLength(char[] p0,char[] p1){
return ArrayUtils.isSameLength(p0,p1);
}
public static char[] removeElements(char[] p0,char... p1){
return ArrayUtils.removeElements(p0,p1);
}
public static java.lang.Character[] toObject(char[] p0){
return ArrayUtils.toObject(p0);
}
public static char[] toPrimitive(java.lang.Character[] p0){
return ArrayUtils.toPrimitive(p0);
}
public static char[] toPrimitive(java.lang.Character[] p0,char p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char... p5){
return RandomStringUtils.random(p0,p1,p2,p3,p4,p5);
}
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5,java.util.Random p6){
return RandomStringUtils.random(p0,p1,p2,p3,p4,p5,p6);
}
public static java.lang.String random(int p0,char... p1){
return RandomStringUtils.random(p0,p1);
}
public static java.lang.String join(char[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(char[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static int indexOfAny(java.lang.CharSequence p0,char... p1){
return StringUtils.indexOfAny(p0,p1);
}
public static boolean containsOnly(java.lang.CharSequence p0,char... p1){
return StringUtils.containsOnly(p0,p1);
}
public static boolean containsNone(java.lang.CharSequence p0,char... p1){
return StringUtils.containsNone(p0,p1);
}
public static boolean containsAny(java.lang.CharSequence p0,char... p1){
return StringUtils.containsAny(p0,p1);
}
public static int indexOfAnyBut(java.lang.CharSequence p0,char... p1){
return StringUtils.indexOfAnyBut(p0,p1);
}
public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(char... p0){
return StrMatcher.charSetMatcher(p0);
}
public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(char[] p0){
return StrTokenizer.getTSVInstance(p0);
}
public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(char[] p0){
return StrTokenizer.getCSVInstance(p0);
}
public static java.lang.String capitalize(java.lang.String p0,char... p1){
return WordUtils.capitalize(p0,p1);
}
public static java.lang.String uncapitalize(java.lang.String p0,char... p1){
return WordUtils.uncapitalize(p0,p1);
}
public static java.lang.String capitalizeFully(java.lang.String p0,char... p1){
return WordUtils.capitalizeFully(p0,p1);
}
public static java.lang.String initials(java.lang.String p0,char... p1){
return WordUtils.initials(p0,p1);
}
public static boolean isDelimiter(int p0,char[] p1){
return WordUtils.isDelimiter(p0,p1);
}
public static boolean isDelimiter(char p0,char[] p1){
return WordUtils.isDelimiter(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharArrayList wrap(char[] p0){
return CharArrayList.wrap(p0);
}
public static it.unimi.dsi.fastutil.chars.CharArrayList wrap(char[] p0,int p1){
return CharArrayList.wrap(p0,p1);
}
public static char[] trim(char[] p0,int p1){
return CharArrays.trim(p0,p1);
}
public static char[] copy(char[] p0){
return CharArrays.copy(p0);
}
public static char[] copy(char[] p0,int p1,int p2){
return CharArrays.copy(p0,p1,p2);
}
public static void fill(char[] p0,int p1,int p2,char p3){
 CharArrays.fill(p0,p1,p2,p3);
}
public static void fill(char[] p0,char p1){
 CharArrays.fill(p0,p1);
}
public static char[] ensureCapacity(char[] p0,int p1){
return CharArrays.ensureCapacity(p0,p1);
}
public static char[] setLength(char[] p0,int p1){
return CharArrays.setLength(p0,p1);
}
public static char[] grow(char[] p0,int p1,int p2){
return CharArrays.grow(p0,p1,p2);
}
public static char[] grow(char[] p0,int p1){
return CharArrays.grow(p0,p1);
}
public static int binarySearch(char[] p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return CharArrays.binarySearch(p0,p1,p2);
}
public static int binarySearch(char[] p0,int p1,int p2,char p3){
return CharArrays.binarySearch(p0,p1,p2,p3);
}
public static int binarySearch(char[] p0,char p1){
return CharArrays.binarySearch(p0,p1);
}
public static int binarySearch(char[] p0,int p1,int p2,char p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static char[] shuffle(char[] p0,int p1,int p2,java.util.Random p3){
return CharArrays.shuffle(p0,p1,p2,p3);
}
public static char[] shuffle(char[] p0,java.util.Random p1){
return CharArrays.shuffle(p0,p1);
}
public static void swap(char[] p0,int p1,int p2,int p3){
 CharArrays.swap(p0,p1,p2,p3);
}
public static void swap(char[] p0,int p1,int p2){
 CharArrays.swap(p0,p1,p2);
}
public static void mergeSort(char[] p0,int p1,int p2,char[] p3){
 CharArrays.mergeSort(p0,p1,p2,p3);
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
public static void mergeSort(char[] p0,int p1,int p2){
 CharArrays.mergeSort(p0,p1,p2);
}
public static void mergeSort(char[] p0){
 CharArrays.mergeSort(p0);
}
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,int p3,int p4,boolean p5){
 CharArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,boolean p3){
 CharArrays.radixSortIndirect(p0,p1,p2,p3);
}
public static void radixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
 CharArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
public static void radixSortIndirect(int[] p0,char[] p1,boolean p2){
 CharArrays.radixSortIndirect(p0,p1,p2);
}
public static void parallelRadixSort(char[] p0){
 CharArrays.parallelRadixSort(p0);
}
public static void parallelRadixSort(char[] p0,char[] p1){
 CharArrays.parallelRadixSort(p0,p1);
}
public static void parallelRadixSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.parallelRadixSort(p0,p1,p2,p3);
}
public static void parallelRadixSort(char[] p0,int p1,int p2){
 CharArrays.parallelRadixSort(p0,p1,p2);
}
public static void parallelRadixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
 CharArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
public static void parallelRadixSortIndirect(int[] p0,char[] p1,boolean p2){
 CharArrays.parallelRadixSortIndirect(p0,p1,p2);
}
public static void ensureFromTo(char[] p0,int p1,int p2){
 CharArrays.ensureFromTo(p0,p1,p2);
}
public static void quickSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
 CharArrays.quickSort(p0,p1);
}
public static void quickSort(char[] p0){
 CharArrays.quickSort(p0);
}
public static void quickSort(char[] p0,int p1,int p2){
 CharArrays.quickSort(p0,p1,p2);
}
public static void quickSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharArrays.quickSort(p0,p1,p2,p3);
}
public static void quickSort(char[] p0,char[] p1){
 CharArrays.quickSort(p0,p1);
}
public static void quickSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.quickSort(p0,p1,p2,p3);
}
public static void ensureSameLength(char[] p0,char[] p1){
 CharArrays.ensureSameLength(p0,p1);
}
public static void stabilize(int[] p0,char[] p1){
 CharArrays.stabilize(p0,p1);
}
public static void stabilize(int[] p0,char[] p1,int p2,int p3){
 CharArrays.stabilize(p0,p1,p2,p3);
}
public static void radixSort(char[] p0,int p1,int p2){
 CharArrays.radixSort(p0,p1,p2);
}
public static void radixSort(char[] p0,char[] p1){
 CharArrays.radixSort(p0,p1);
}
public static void radixSort(char[] p0){
 CharArrays.radixSort(p0);
}
public static void radixSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.radixSort(p0,p1,p2,p3);
}
public static void ensureOffsetLength(char[] p0,int p1,int p2){
 CharArrays.ensureOffsetLength(p0,p1,p2);
}
public static void parallelQuickSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
 CharArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
 CharArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(char[] p0,char[] p1,int p2,int p3){
 CharArrays.parallelQuickSort(p0,p1,p2,p3);
}
public static void parallelQuickSort(char[] p0,char[] p1){
 CharArrays.parallelQuickSort(p0,p1);
}
public static void parallelQuickSort(char[] p0){
 CharArrays.parallelQuickSort(p0);
}
public static void parallelQuickSort(char[] p0,int p1,int p2){
 CharArrays.parallelQuickSort(p0,p1,p2);
}
public static void quickSortIndirect(int[] p0,char[] p1,int p2,int p3){
 CharArrays.quickSortIndirect(p0,p1,p2,p3);
}
public static void quickSortIndirect(int[] p0,char[] p1){
 CharArrays.quickSortIndirect(p0,p1);
}
public static void parallelQuickSortIndirect(int[] p0,char[] p1){
 CharArrays.parallelQuickSortIndirect(p0,p1);
}
public static void parallelQuickSortIndirect(int[] p0,char[] p1,int p2,int p3){
 CharArrays.parallelQuickSortIndirect(p0,p1,p2,p3);
}
public static void copyToBig(char[] p0,int p1,char[][] p2,long p3,long p4){
 CharBigArrays.copyToBig(p0,p1,p2,p3,p4);
}
public static void copyFromBig(char[][] p0,long p1,char[] p2,int p3,int p4){
 CharBigArrays.copyFromBig(p0,p1,p2,p3,p4);
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
public static it.unimi.dsi.fastutil.chars.CharListIterator wrap(char[] p0,int p1,int p2){
return CharIterators.wrap(p0,p1,p2);
}
public static char[] unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0){
return CharIterators.unwrap(p0);
}
public static char[] unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
return CharIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[] p1){
return CharIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[] p1,int p2,int p3){
return CharIterators.unwrap(p0,p1,p2,p3);
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
public static int front(char[] p0,int[] p1,int p2,int[] p3){
return CharSemiIndirectHeaps.front(p0,p1,p2,p3);
}
public static char[] loadChars(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadChars(p0);
}
public static char[] loadChars(java.io.File p0) throws java.io.IOException{
return BinIO.loadChars(p0);
}
public static int loadChars(java.io.File p0,char[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static int loadChars(java.io.DataInput p0,char[] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static int loadChars(java.io.DataInput p0,char[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static int loadChars(java.lang.CharSequence p0,char[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static int loadChars(java.io.File p0,char[] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static int loadChars(java.lang.CharSequence p0,char[] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static void storeChars(char[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[] p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[] p0,int p1,int p2,java.io.DataOutput p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static char[] addAll(char[] p0,char[] p1){
return ArrayUtils.addAll(p0,p1);
}
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5){
return RandomStringUtils.random(p0,p1,p2,p3,p4,p5);
}
public static java.lang.String random(int p0,char[] p1){
return RandomStringUtils.random(p0,p1);
}
public static int indexOfAny(java.lang.String p0,char[] p1){
return StringUtils.indexOfAny(p0,p1);
}
public static boolean containsOnly(java.lang.String p0,char[] p1){
return StringUtils.containsOnly(p0,p1);
}
public static boolean containsNone(java.lang.String p0,char[] p1){
return StringUtils.containsNone(p0,p1);
}
public static boolean containsAny(java.lang.String p0,char[] p1){
return StringUtils.containsAny(p0,p1);
}
public static int indexOfAnyBut(java.lang.String p0,char[] p1){
return StringUtils.indexOfAnyBut(p0,p1);
}
public static org.apache.commons.lang.text.StrMatcher charSetMatcher(char[] p0){
return StrMatcher.charSetMatcher(p0);
}
public static java.lang.String capitalize(java.lang.String p0,char[] p1){
return WordUtils.capitalize(p0,p1);
}
public static java.lang.String uncapitalize(java.lang.String p0,char[] p1){
return WordUtils.uncapitalize(p0,p1);
}
public static java.lang.String capitalizeFully(java.lang.String p0,char[] p1){
return WordUtils.capitalizeFully(p0,p1);
}
public static java.lang.String initials(java.lang.String p0,char[] p1){
return WordUtils.initials(p0,p1);
}
}
