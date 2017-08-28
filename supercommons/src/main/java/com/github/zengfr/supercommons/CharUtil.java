package com.github.zengfr.supercommons;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.escape.Escapers;
import com.google.common.primitives.Chars;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.Conversion;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.FormattableUtils;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.math3.util.CompositeFormat;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.text.StrMatcher;
import org.apache.commons.text.FormattableUtils;
import org.apache.commons.text.WordUtils;
import org.apache.commons.collections.primitives.CharCollections;
import it.unimi.dsi.fastutil.SafeMath;
import it.unimi.dsi.fastutil.bytes.Byte2CharFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2CharMaps;
import it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2BooleanFunctions;
import it.unimi.dsi.fastutil.chars.Char2BooleanMaps;
import it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteFunctions;
import it.unimi.dsi.fastutil.chars.Char2ByteMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2CharFunctions;
import it.unimi.dsi.fastutil.chars.Char2CharMaps;
import it.unimi.dsi.fastutil.chars.Char2CharSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleFunctions;
import it.unimi.dsi.fastutil.chars.Char2DoubleMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatFunctions;
import it.unimi.dsi.fastutil.chars.Char2FloatMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2IntFunctions;
import it.unimi.dsi.fastutil.chars.Char2IntMaps;
import it.unimi.dsi.fastutil.chars.Char2IntSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2LongFunctions;
import it.unimi.dsi.fastutil.chars.Char2LongMaps;
import it.unimi.dsi.fastutil.chars.Char2LongSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectFunctions;
import it.unimi.dsi.fastutil.chars.Char2ObjectMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions;
import it.unimi.dsi.fastutil.chars.Char2ReferenceMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortFunctions;
import it.unimi.dsi.fastutil.chars.Char2ShortMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps;
import it.unimi.dsi.fastutil.chars.CharArrays;
import it.unimi.dsi.fastutil.chars.CharBigArrays;
import it.unimi.dsi.fastutil.chars.CharBigListIterators;
import it.unimi.dsi.fastutil.chars.CharBigLists;
import it.unimi.dsi.fastutil.chars.CharIterators;
import it.unimi.dsi.fastutil.chars.CharLists;
import it.unimi.dsi.fastutil.chars.CharSets;
import it.unimi.dsi.fastutil.chars.CharSortedSets;
import it.unimi.dsi.fastutil.doubles.Double2CharFunctions;
import it.unimi.dsi.fastutil.doubles.Double2CharMaps;
import it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2CharFunctions;
import it.unimi.dsi.fastutil.floats.Float2CharMaps;
import it.unimi.dsi.fastutil.floats.Float2CharSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2CharFunctions;
import it.unimi.dsi.fastutil.ints.Int2CharMaps;
import it.unimi.dsi.fastutil.ints.Int2CharSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2CharFunctions;
import it.unimi.dsi.fastutil.longs.Long2CharMaps;
import it.unimi.dsi.fastutil.longs.Long2CharSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2CharFunctions;
import it.unimi.dsi.fastutil.objects.Object2CharMaps;
import it.unimi.dsi.fastutil.objects.Object2CharSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharFunctions;
import it.unimi.dsi.fastutil.objects.Reference2CharMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharFunctions;
import it.unimi.dsi.fastutil.shorts.Short2CharMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.CharRange;
import org.apache.commons.lang.CharUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.text.StrMatcher;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharUtil{ 
public static char toLowerCase(char p0){
return Ascii.toLowerCase(p0);
}
public static char toUpperCase(char p0){
return Ascii.toUpperCase(p0);
}
public static boolean isLowerCase(char p0){
return Ascii.isLowerCase(p0);
}
public static boolean isUpperCase(char p0){
return Ascii.isUpperCase(p0);
}
public static com.google.common.base.CharMatcher is(char p0){
return CharMatcher.is(p0);
}
public static com.google.common.base.CharMatcher inRange(char p0,char p1){
return CharMatcher.inRange(p0,p1);
}
public static com.google.common.base.CharMatcher isNot(char p0){
return CharMatcher.isNot(p0);
}
public static com.google.common.base.Joiner on(char p0){
return Joiner.on(p0);
}
public static java.lang.String padStart(java.lang.String p0,int p1,char p2){
return Strings.padStart(p0,p1,p2);
}
public static java.lang.String padEnd(java.lang.String p0,int p1,char p2){
return Strings.padEnd(p0,p1,p2);
}
public static java.lang.String computeReplacement(com.google.common.escape.CharEscaper p0,char p1){
return Escapers.computeReplacement(p0,p1);
}
public static char min(char... p0){
return Chars.min(p0);
}
public static char max(char... p0){
return Chars.max(p0);
}
public static int indexOf(char[] p0,char p1){
return Chars.indexOf(p0,p1);
}
public static int compare(char p0,char p1){
return Chars.compare(p0,p1);
}
public static boolean contains(char[] p0,char p1){
return Chars.contains(p0,p1);
}
public static int lastIndexOf(char[] p0,char p1){
return Chars.lastIndexOf(p0,p1);
}
public static byte[] toByteArray(char p0){
return Chars.toByteArray(p0);
}
public static char saturatedCast(long p0){
return Chars.saturatedCast(p0);
}
public static char checkedCast(long p0){
return Chars.checkedCast(p0);
}
public static char fromBytes(byte p0,byte p1){
return Chars.fromBytes(p0,p1);
}
public static char fromByteArray(byte[] p0){
return Chars.fromByteArray(p0);
}
public static char[] add(char[] p0,int p1,char p2){
return ArrayUtils.add(p0,p1,p2);
}
public static char[] add(char[] p0,char p1){
return ArrayUtils.add(p0,p1);
}
public static int indexOf(char[] p0,char p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static int lastIndexOf(char[] p0,char p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static char[] removeElement(char[] p0,char p1){
return ArrayUtils.removeElement(p0,p1);
}
public static char[] toPrimitive(java.lang.Character[] p0,char p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static boolean isAscii(char p0){
return CharUtils.isAscii(p0);
}
public static boolean isAsciiPrintable(char p0){
return CharUtils.isAsciiPrintable(p0);
}
public static boolean isAsciiControl(char p0){
return CharUtils.isAsciiControl(p0);
}
public static java.lang.String unicodeEscaped(char p0){
return CharUtils.unicodeEscaped(p0);
}
public static boolean isAsciiNumeric(char p0){
return CharUtils.isAsciiNumeric(p0);
}
public static boolean isAsciiAlpha(char p0){
return CharUtils.isAsciiAlpha(p0);
}
public static char toChar(java.lang.String p0){
return CharUtils.toChar(p0);
}
public static char toChar(java.lang.String p0,char p1){
return CharUtils.toChar(p0,p1);
}
public static char toChar(java.lang.Character p0,char p1){
return CharUtils.toChar(p0,p1);
}
public static char toChar(java.lang.Character p0){
return CharUtils.toChar(p0);
}
public static int toIntValue(char p0,int p1){
return CharUtils.toIntValue(p0,p1);
}
public static int toIntValue(char p0){
return CharUtils.toIntValue(p0);
}
public static java.lang.Character toCharacterObject(char p0){
return CharUtils.toCharacterObject(p0);
}
public static boolean isAsciiAlphaUpper(char p0){
return CharUtils.isAsciiAlphaUpper(p0);
}
public static boolean isAsciiAlphaLower(char p0){
return CharUtils.isAsciiAlphaLower(p0);
}
public static boolean isAsciiAlphanumeric(char p0){
return CharUtils.isAsciiAlphanumeric(p0);
}
public static char binaryToHexDigit(boolean[] p0,int p1){
return Conversion.binaryToHexDigit(p0,p1);
}
public static char binaryToHexDigit(boolean[] p0){
return Conversion.binaryToHexDigit(p0);
}
public static int hexDigitToInt(char p0){
return Conversion.hexDigitToInt(p0);
}
public static char intToHexDigit(int p0){
return Conversion.intToHexDigit(p0);
}
public static boolean[] hexDigitToBinary(char p0){
return Conversion.hexDigitToBinary(p0);
}
public static int hexDigitMsb0ToInt(char p0){
return Conversion.hexDigitMsb0ToInt(p0);
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
public static char intToHexDigitMsb0(int p0){
return Conversion.intToHexDigitMsb0(p0);
}
public static char CONST(char p0){
return ObjectUtils.CONST(p0);
}
public static java.lang.String remove(java.lang.String p0,char p1){
return StringUtils.remove(p0,p1);
}
public static java.lang.String join(char[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(float[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(double[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(long[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(java.lang.Object[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(long[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(int[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(short[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(byte[] p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(double[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(char[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(short[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(byte[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(float[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(java.lang.Iterable<?> p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.lang.Object[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String join(java.util.Iterator<?> p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(int[] p0,char p1,int p2,int p3){
return StringUtils.join(p0,p1,p2,p3);
}
public static java.lang.String[] split(java.lang.String p0,char p1){
return StringUtils.split(p0,p1);
}
public static java.lang.String wrap(java.lang.String p0,char p1){
return StringUtils.wrap(p0,p1);
}
public static java.lang.String leftPad(java.lang.String p0,int p1,char p2){
return StringUtils.leftPad(p0,p1,p2);
}
public static java.lang.String rightPad(java.lang.String p0,int p1,char p2){
return StringUtils.rightPad(p0,p1,p2);
}
public static java.lang.String[] splitPreserveAllTokens(java.lang.String p0,char p1){
return StringUtils.splitPreserveAllTokens(p0,p1);
}
public static java.lang.String center(java.lang.String p0,int p1,char p2){
return StringUtils.center(p0,p1,p2);
}
public static java.lang.String reverseDelimited(java.lang.String p0,char p1){
return StringUtils.reverseDelimited(p0,p1);
}
public static int countMatches(java.lang.CharSequence p0,char p1){
return StringUtils.countMatches(p0,p1);
}
public static java.lang.String repeat(char p0,int p1){
return StringUtils.repeat(p0,p1);
}
public static java.lang.String replaceChars(java.lang.String p0,char p1,char p2){
return StringUtils.replaceChars(p0,p1,p2);
}
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,char p5,java.lang.CharSequence p6){
return FormattableUtils.append(p0,p1,p2,p3,p4,p5,p6);
}
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,char p5){
return FormattableUtils.append(p0,p1,p2,p3,p4,p5);
}
public static org.apache.commons.lang3.text.StrMatcher charMatcher(char p0){
return StrMatcher.charMatcher(p0);
}
public static char parseNextCharacter(java.lang.String p0,java.text.ParsePosition p1){
return CompositeFormat.parseNextCharacter(p0,p1);
}
public static char getDefaultCharacter(){
return ConvertUtils.getDefaultCharacter();
}
public static void setDefaultCharacter(char p0){
 ConvertUtils.setDefaultCharacter(p0);
}
public static boolean isDelimiter(char p0,char[] p1){
return WordUtils.isDelimiter(p0,p1);
}
public static org.apache.commons.collections.primitives.CharList singletonCharList(char p0){
return CharCollections.singletonCharList(p0);
}
public static org.apache.commons.collections.primitives.CharListIterator singletonCharListIterator(char p0){
return CharCollections.singletonCharListIterator(p0);
}
public static org.apache.commons.collections.primitives.CharIterator singletonCharIterator(char p0){
return CharCollections.singletonCharIterator(p0);
}
public static char safeIntToChar(int p0){
return SafeMath.safeIntToChar(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction singleton(byte p0,char p1){
return Byte2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(byte p0,char p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
return Byte2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(char p0,boolean p1){
return Char2BooleanFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(char p0,boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction singleton(char p0,byte p1){
return Char2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(char p0,byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2CharFunction singleton(char p0,char p1){
return Char2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(char p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction singleton(char p0,double p1){
return Char2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(char p0,double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction singleton(char p0,float p1){
return Char2FloatFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(char p0,float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2IntFunction singleton(char p0,int p1){
return Char2IntFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(char p0,int p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2IntSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2LongFunction singleton(char p0,long p1){
return Char2LongFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(char p0,long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2LongSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> singleton(char p0,V p1){
return Char2ObjectFunctions.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(char p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction singleton(char p0,short p1){
return Char2ShortFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(char p0,short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ShortSortedMaps.singleton(p0,p1,p2);
}
public static void fill(char[] p0,int p1,int p2,char p3){
 CharArrays.fill(p0,p1,p2,p3);
}
public static void fill(char[] p0,char p1){
 CharArrays.fill(p0,p1);
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
public static void add(char[][] p0,long p1,char p2){
 CharBigArrays.add(p0,p1,p2);
}
public static void set(char[][] p0,long p1,char p2){
 CharBigArrays.set(p0,p1,p2);
}
public static void fill(char[][] p0,char p1){
 CharBigArrays.fill(p0,p1);
}
public static void fill(char[][] p0,long p1,long p2,char p3){
 CharBigArrays.fill(p0,p1,p2,p3);
}
public static long binarySearch(char[][] p0,long p1,long p2,char p3){
return CharBigArrays.binarySearch(p0,p1,p2,p3);
}
public static long binarySearch(char[][] p0,char p1){
return CharBigArrays.binarySearch(p0,p1);
}
public static long binarySearch(char[][] p0,long p1,long p2,char p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
return CharBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
public static long binarySearch(char[][] p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return CharBigArrays.binarySearch(p0,p1,p2);
}
public static void mul(char[][] p0,long p1,char p2){
 CharBigArrays.mul(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.CharBigListIterator singleton(char p0){
return CharBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharListIterator fromTo(char p0,char p1){
return CharIterators.fromTo(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(char p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
return CharSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction singleton(double p0,char p1){
return Double2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(double p0,char p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
return Double2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2CharFunction singleton(float p0,char p1){
return Float2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(float p0,char p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.Int2CharFunction singleton(int p0,char p1){
return Int2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(int p0,char p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
return Int2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.Long2CharFunction singleton(long p0,char p1){
return Long2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(long p0,char p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2CharSortedMaps.singleton(p0,p1,p2);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> singleton(K p0,char p1){
return Object2CharFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> singleton(K p0,char p1,java.util.Comparator<? super K> p2){
return Object2CharSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction singleton(short p0,char p1){
return Short2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(short p0,char p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
return Short2CharSortedMaps.singleton(p0,p1,p2);
}
public static org.apache.commons.lang.CharRange isNotIn(char p0,char p1){
return CharRange.isNotIn(p0,p1);
}
public static org.apache.commons.lang.CharRange isIn(char p0,char p1){
return CharRange.isIn(p0,p1);
}
public static int indexOf(java.lang.String p0,char p1,int p2){
return StringUtils.indexOf(p0,p1,p2);
}
public static int indexOf(java.lang.String p0,char p1){
return StringUtils.indexOf(p0,p1);
}
public static boolean contains(java.lang.String p0,char p1){
return StringUtils.contains(p0,p1);
}
public static java.lang.String join(java.util.Collection p0,char p1){
return StringUtils.join(p0,p1);
}
public static java.lang.String join(java.util.Iterator p0,char p1){
return StringUtils.join(p0,p1);
}
public static int lastIndexOf(java.lang.String p0,char p1){
return StringUtils.lastIndexOf(p0,p1);
}
public static int lastIndexOf(java.lang.String p0,char p1,int p2){
return StringUtils.lastIndexOf(p0,p1,p2);
}
}
