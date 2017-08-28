package com.github.zengfr.supercommons;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;
import com.google.common.base.Utf8;
import com.google.common.collect.Lists;
import com.google.common.io.CharSource;
import com.google.common.io.Files;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.CharSequenceUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.FormattableUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.text.FormattableUtils;
import org.apache.commons.text.WordUtils;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharSequenceUtil{ 
public static boolean equalsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return Ascii.equalsIgnoreCase(p0,p1);
}
public static java.lang.String toLowerCase(java.lang.CharSequence p0){
return Ascii.toLowerCase(p0);
}
public static java.lang.String toUpperCase(java.lang.CharSequence p0){
return Ascii.toUpperCase(p0);
}
public static java.lang.String truncate(java.lang.CharSequence p0,int p1,java.lang.String p2){
return Ascii.truncate(p0,p1,p2);
}
public static com.google.common.base.CharMatcher anyOf(java.lang.CharSequence p0){
return CharMatcher.anyOf(p0);
}
public static com.google.common.base.CharMatcher noneOf(java.lang.CharSequence p0){
return CharMatcher.noneOf(p0);
}
public static java.lang.String commonPrefix(java.lang.CharSequence p0,java.lang.CharSequence p1){
return Strings.commonPrefix(p0,p1);
}
public static java.lang.String commonSuffix(java.lang.CharSequence p0,java.lang.CharSequence p1){
return Strings.commonSuffix(p0,p1);
}
public static int encodedLength(java.lang.CharSequence p0){
return Utf8.encodedLength(p0);
}
public static java.util.List<java.lang.Character> charactersOf(java.lang.CharSequence p0){
return Lists.charactersOf(p0);
}
public static com.google.common.io.CharSource wrap(java.lang.CharSequence p0){
return CharSource.wrap(p0);
}
public static void append(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
 Files.append(p0,p1,p2);
}
public static void write(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
 Files.write(p0,p1,p2);
}
public static void write(java.lang.CharSequence p0,java.io.Writer p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
 IOUtils.write(p0,p1,p2);
}
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1) throws java.io.IOException{
 IOUtils.write(p0,p1);
}
public static java.io.InputStream toInputStream(java.lang.CharSequence p0){
return IOUtils.toInputStream(p0);
}
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.lang.String p1) throws java.io.IOException{
return IOUtils.toInputStream(p0,p1);
}
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.nio.charset.Charset p1){
return IOUtils.toInputStream(p0,p1);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1) throws java.io.IOException{
 FileUtils.write(p0,p1);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,boolean p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.write(p0,p1,p2,p3);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
 FileUtils.write(p0,p1,p2,p3);
}
public static java.lang.String longestCommonSubsequence(java.lang.CharSequence p0,java.lang.CharSequence p1){
return ListUtils.longestCommonSubsequence(p0,p1);
}
public static java.lang.CharSequence subSequence(java.lang.CharSequence p0,int p1){
return CharSequenceUtils.subSequence(p0,p1);
}
public static int indexOf(java.lang.CharSequence p0,int p1){
return StringUtils.indexOf(p0,p1);
}
public static int indexOf(java.lang.CharSequence p0,int p1,int p2){
return StringUtils.indexOf(p0,p1,p2);
}
public static int indexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.indexOf(p0,p1,p2);
}
public static int indexOf(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.indexOf(p0,p1);
}
public static boolean contains(java.lang.CharSequence p0,int p1){
return StringUtils.contains(p0,p1);
}
public static boolean contains(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.contains(p0,p1);
}
public static boolean endsWith(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.endsWith(p0,p1);
}
public static boolean isEmpty(java.lang.CharSequence p0){
return StringUtils.isEmpty(p0);
}
public static int lastIndexOf(java.lang.CharSequence p0,int p1){
return StringUtils.lastIndexOf(p0,p1);
}
public static int lastIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.lastIndexOf(p0,p1);
}
public static int lastIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(java.lang.CharSequence p0,int p1,int p2){
return StringUtils.lastIndexOf(p0,p1,p2);
}
public static int length(java.lang.CharSequence p0){
return StringUtils.length(p0);
}
public static boolean startsWith(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.startsWith(p0,p1);
}
public static boolean isWhitespace(java.lang.CharSequence p0){
return StringUtils.isWhitespace(p0);
}
public static boolean isAlpha(java.lang.CharSequence p0){
return StringUtils.isAlpha(p0);
}
public static boolean isNumeric(java.lang.CharSequence p0){
return StringUtils.isNumeric(p0);
}
public static int indexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.indexOfIgnoreCase(p0,p1,p2);
}
public static int indexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.indexOfIgnoreCase(p0,p1);
}
public static int lastIndexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.lastIndexOfIgnoreCase(p0,p1,p2);
}
public static int lastIndexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.lastIndexOfIgnoreCase(p0,p1);
}
public static boolean containsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.containsIgnoreCase(p0,p1);
}
public static boolean containsWhitespace(java.lang.CharSequence p0){
return StringUtils.containsWhitespace(p0);
}
public static int lastOrdinalIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.lastOrdinalIndexOf(p0,p1,p2);
}
public static int indexOfDifference(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.indexOfDifference(p0,p1);
}
public static int getLevenshteinDistance(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.getLevenshteinDistance(p0,p1,p2);
}
public static int getLevenshteinDistance(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.getLevenshteinDistance(p0,p1);
}
public static double getJaroWinklerDistance(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.getJaroWinklerDistance(p0,p1);
}
public static boolean isAlphanumericSpace(java.lang.CharSequence p0){
return StringUtils.isAlphanumericSpace(p0);
}
public static boolean isBlank(java.lang.CharSequence p0){
return StringUtils.isBlank(p0);
}
public static boolean isNotBlank(java.lang.CharSequence p0){
return StringUtils.isNotBlank(p0);
}
public static boolean isNotEmpty(java.lang.CharSequence p0){
return StringUtils.isNotEmpty(p0);
}
public static int indexOfAny(java.lang.CharSequence p0,char... p1){
return StringUtils.indexOfAny(p0,p1);
}
public static int indexOfAny(java.lang.CharSequence p0,java.lang.String p1){
return StringUtils.indexOfAny(p0,p1);
}
public static int indexOfAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.indexOfAny(p0,p1);
}
public static boolean containsOnly(java.lang.CharSequence p0,java.lang.String p1){
return StringUtils.containsOnly(p0,p1);
}
public static boolean containsOnly(java.lang.CharSequence p0,char... p1){
return StringUtils.containsOnly(p0,p1);
}
public static int ordinalIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
return StringUtils.ordinalIndexOf(p0,p1,p2);
}
public static boolean containsNone(java.lang.CharSequence p0,char... p1){
return StringUtils.containsNone(p0,p1);
}
public static boolean containsNone(java.lang.CharSequence p0,java.lang.String p1){
return StringUtils.containsNone(p0,p1);
}
public static int lastIndexOfAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.lastIndexOfAny(p0,p1);
}
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.containsAny(p0,p1);
}
public static boolean containsAny(java.lang.CharSequence p0,char... p1){
return StringUtils.containsAny(p0,p1);
}
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.containsAny(p0,p1);
}
public static int indexOfAnyBut(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.indexOfAnyBut(p0,p1);
}
public static int indexOfAnyBut(java.lang.CharSequence p0,char... p1){
return StringUtils.indexOfAnyBut(p0,p1);
}
public static boolean isAlphanumeric(java.lang.CharSequence p0){
return StringUtils.isAlphanumeric(p0);
}
public static boolean isAsciiPrintable(java.lang.CharSequence p0){
return StringUtils.isAsciiPrintable(p0);
}
public static int countMatches(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.countMatches(p0,p1);
}
public static int countMatches(java.lang.CharSequence p0,char p1){
return StringUtils.countMatches(p0,p1);
}
public static boolean isAlphaSpace(java.lang.CharSequence p0){
return StringUtils.isAlphaSpace(p0);
}
public static boolean isAllUpperCase(java.lang.CharSequence p0){
return StringUtils.isAllUpperCase(p0);
}
public static <T extends java.lang.CharSequence > T defaultIfEmpty(T p0,T p1){
return StringUtils.defaultIfEmpty(p0,p1);
}
public static <T extends java.lang.CharSequence > T defaultIfBlank(T p0,T p1){
return StringUtils.defaultIfBlank(p0,p1);
}
public static boolean isAllLowerCase(java.lang.CharSequence p0){
return StringUtils.isAllLowerCase(p0);
}
public static boolean isNumericSpace(java.lang.CharSequence p0){
return StringUtils.isNumericSpace(p0);
}
public static java.lang.String appendIfMissing(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.appendIfMissing(p0,p1,p2);
}
public static java.lang.String prependIfMissing(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.prependIfMissing(p0,p1,p2);
}
public static boolean startsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.startsWithAny(p0,p1);
}
public static boolean endsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.endsWithAny(p0,p1);
}
public static int getFuzzyDistance(java.lang.CharSequence p0,java.lang.CharSequence p1,java.util.Locale p2){
return StringUtils.getFuzzyDistance(p0,p1,p2);
}
public static java.lang.String appendIfMissingIgnoreCase(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.appendIfMissingIgnoreCase(p0,p1,p2);
}
public static boolean endsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.endsWithIgnoreCase(p0,p1);
}
public static boolean startsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
return StringUtils.startsWithIgnoreCase(p0,p1);
}
public static java.lang.String prependIfMissingIgnoreCase(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.prependIfMissingIgnoreCase(p0,p1,p2);
}
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,java.lang.CharSequence p5){
return FormattableUtils.append(p0,p1,p2,p3,p4,p5);
}
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,char p5,java.lang.CharSequence p6){
return FormattableUtils.append(p0,p1,p2,p3,p4,p5,p6);
}
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,char p5){
return FormattableUtils.append(p0,p1,p2,p3,p4,p5);
}
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4){
return FormattableUtils.append(p0,p1,p2,p3,p4);
}
public static <T extends java.lang.CharSequence > T validIndex(T p0,int p1){
return Validate.validIndex(p0,p1);
}
public static <T extends java.lang.CharSequence > T validIndex(T p0,int p1,java.lang.String p2,java.lang.Object... p3){
return Validate.validIndex(p0,p1,p2,p3);
}
public static <T extends java.lang.CharSequence > T notEmpty(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notEmpty(p0,p1,p2);
}
public static <T extends java.lang.CharSequence > T notEmpty(T p0){
return Validate.notEmpty(p0);
}
public static <T extends java.lang.CharSequence > T notBlank(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notBlank(p0,p1,p2);
}
public static <T extends java.lang.CharSequence > T notBlank(T p0){
return Validate.notBlank(p0);
}
public static void matchesPattern(java.lang.CharSequence p0,java.lang.String p1,java.lang.String p2,java.lang.Object... p3){
 Validate.matchesPattern(p0,p1,p2,p3);
}
public static void matchesPattern(java.lang.CharSequence p0,java.lang.String p1){
 Validate.matchesPattern(p0,p1);
}
public static boolean containsAllWords(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return WordUtils.containsAllWords(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asIntIterator(p0);
}
public static short[] loadShorts(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadShorts(p0);
}
public static int loadShorts(java.lang.CharSequence p0,short[] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static int loadShorts(java.lang.CharSequence p0,short[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static long loadShorts(java.lang.CharSequence p0,short[][] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static long loadShorts(java.lang.CharSequence p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static long loadChars(java.lang.CharSequence p0,char[][] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static char[] loadChars(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadChars(p0);
}
public static long loadChars(java.lang.CharSequence p0,char[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static int loadChars(java.lang.CharSequence p0,char[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static int loadChars(java.lang.CharSequence p0,char[] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static void storeChars(char[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeShorts(short[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.ints.IntIterable asIntIterable(java.lang.CharSequence p0){
return BinIO.asIntIterable(p0);
}
public static long[][] loadLongsBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadLongsBig(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterable asFloatIterable(java.lang.CharSequence p0){
return BinIO.asFloatIterable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asShortIterator(p0);
}
public static long loadDoubles(java.lang.CharSequence p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static double[] loadDoubles(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadDoubles(p0);
}
public static int loadDoubles(java.lang.CharSequence p0,double[] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static long loadDoubles(java.lang.CharSequence p0,double[][] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static int loadDoubles(java.lang.CharSequence p0,double[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static float[][] loadFloatsBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadFloatsBig(p0);
}
public static boolean[][] loadBooleansBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadBooleansBig(p0);
}
public static double[][] loadDoublesBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadDoublesBig(p0);
}
public static it.unimi.dsi.fastutil.longs.LongIterable asLongIterable(java.lang.CharSequence p0){
return BinIO.asLongIterable(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterable asByteIterable(java.lang.CharSequence p0){
return BinIO.asByteIterable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterable asShortIterable(java.lang.CharSequence p0){
return BinIO.asShortIterable(p0);
}
public static void storeObject(java.lang.Object p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeObject(p0,p1);
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
public static long loadBooleans(java.lang.CharSequence p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static long loadBooleans(java.lang.CharSequence p0,boolean[][] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static int loadInts(java.lang.CharSequence p0,int[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static int loadInts(java.lang.CharSequence p0,int[] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static long loadInts(java.lang.CharSequence p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.lang.CharSequence p0,int[][] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static int[] loadInts(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadInts(p0);
}
public static int loadBytes(java.lang.CharSequence p0,byte[] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static long loadBytes(java.lang.CharSequence p0,byte[][] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static long loadBytes(java.lang.CharSequence p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static byte[] loadBytes(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadBytes(p0);
}
public static int loadBytes(java.lang.CharSequence p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static long loadFloats(java.lang.CharSequence p0,float[][] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static int loadFloats(java.lang.CharSequence p0,float[] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static float[] loadFloats(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadFloats(p0);
}
public static int loadFloats(java.lang.CharSequence p0,float[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static long loadFloats(java.lang.CharSequence p0,float[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static char[][] loadCharsBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadCharsBig(p0);
}
public static java.lang.Object loadObject(java.lang.CharSequence p0) throws java.io.IOException,java.lang.ClassNotFoundException{
return BinIO.loadObject(p0);
}
public static int[][] loadIntsBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadIntsBig(p0);
}
public static void storeFloats(float[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static byte[][] loadBytesBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadBytesBig(p0);
}
public static void storeBytes(byte[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asLongIterator(p0);
}
public static void storeDoubles(double[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterable asDoubleIterable(java.lang.CharSequence p0){
return BinIO.asDoubleIterable(p0);
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static short[][] loadShortsBig(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadShortsBig(p0);
}
public static long loadLongs(java.lang.CharSequence p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static long loadLongs(java.lang.CharSequence p0,long[][] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static int loadLongs(java.lang.CharSequence p0,long[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static int loadLongs(java.lang.CharSequence p0,long[] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static long[] loadLongs(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.loadLongs(p0);
}
public static void storeBooleans(boolean[] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharIterable asCharIterable(java.lang.CharSequence p0){
return BinIO.asCharIterable(p0);
}
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asCharIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asDoubleIterator(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asFloatIterator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asByteIterator(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterable asBooleanIterable(java.lang.CharSequence p0){
return BinIO.asBooleanIterable(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asBooleanIterator(p0);
}
}
