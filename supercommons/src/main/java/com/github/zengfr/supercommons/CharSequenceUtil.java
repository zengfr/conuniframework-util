package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharSequenceUtil{ 
/**
*public static boolean com.google.common.base.Ascii.equalsIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static boolean equalsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return com.google.common.base.Ascii.equalsIgnoreCase(p0,p1);
}
/**
*public static java.lang.String com.google.common.base.Ascii.toLowerCase(java.lang.CharSequence)
*/ 
public static java.lang.String toLowerCase(java.lang.CharSequence p0){
	return com.google.common.base.Ascii.toLowerCase(p0);
}
/**
*public static java.lang.String com.google.common.base.Ascii.toUpperCase(java.lang.CharSequence)
*/ 
public static java.lang.String toUpperCase(java.lang.CharSequence p0){
	return com.google.common.base.Ascii.toUpperCase(p0);
}
/**
*public static java.lang.String com.google.common.base.Ascii.truncate(java.lang.CharSequence,int,java.lang.String)
*/ 
public static java.lang.String truncate(java.lang.CharSequence p0,int p1,java.lang.String p2){
	return com.google.common.base.Ascii.truncate(p0,p1,p2);
}
/**
*public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.anyOf(java.lang.CharSequence)
*/ 
public static com.google.common.base.CharMatcher anyOf(java.lang.CharSequence p0){
	return com.google.common.base.CharMatcher.anyOf(p0);
}
/**
*public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.noneOf(java.lang.CharSequence)
*/ 
public static com.google.common.base.CharMatcher noneOf(java.lang.CharSequence p0){
	return com.google.common.base.CharMatcher.noneOf(p0);
}
/**
*public static java.lang.String com.google.common.base.Strings.commonSuffix(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static java.lang.String commonSuffix(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return com.google.common.base.Strings.commonSuffix(p0,p1);
}
/**
*public static java.lang.String com.google.common.base.Strings.commonPrefix(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static java.lang.String commonPrefix(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return com.google.common.base.Strings.commonPrefix(p0,p1);
}
/**
*public static int com.google.common.base.Utf8.encodedLength(java.lang.CharSequence)
*/ 
public static int encodedLength(java.lang.CharSequence p0){
	return com.google.common.base.Utf8.encodedLength(p0);
}
/**
*public static java.util.List<java.lang.Character> com.google.common.collect.Lists.charactersOf(java.lang.CharSequence)
*/ 
public static java.util.List<java.lang.Character> charactersOf(java.lang.CharSequence p0){
	return com.google.common.collect.Lists.charactersOf(p0);
}
/**
*public static com.google.common.io.CharSource com.google.common.io.CharSource.wrap(java.lang.CharSequence)
*/ 
public static com.google.common.io.CharSource wrap(java.lang.CharSequence p0){
	return com.google.common.io.CharSource.wrap(p0);
}
/**
*public static void com.google.common.io.Files.append(java.lang.CharSequence,java.io.File,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void append(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 com.google.common.io.Files.append(p0,p1,p2);
}
/**
*public static void com.google.common.io.Files.write(java.lang.CharSequence,java.io.File,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void write(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 com.google.common.io.Files.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.IOUtils.write(java.lang.CharSequence,java.io.Writer) throws java.io.IOException
*/ 
public static void write(java.lang.CharSequence p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*public static void org.apache.commons.io.IOUtils.write(java.lang.CharSequence,java.io.OutputStream,java.lang.String) throws java.io.IOException
*/ 
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.IOUtils.write(java.lang.CharSequence,java.io.OutputStream,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.IOUtils.write(java.lang.CharSequence,java.io.OutputStream) throws java.io.IOException
*/ 
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.CharSequence,java.lang.String) throws java.io.IOException
*/ 
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toInputStream(p0,p1);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.CharSequence,java.nio.charset.Charset)
*/ 
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.nio.charset.Charset p1){
	return org.apache.commons.io.IOUtils.toInputStream(p0,p1);
}
/**
*public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.CharSequence)
*/ 
public static java.io.InputStream toInputStream(java.lang.CharSequence p0){
	return org.apache.commons.io.IOUtils.toInputStream(p0);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.lang.String) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset,boolean) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.lang.String,boolean) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,boolean) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static java.lang.String longestCommonSubsequence(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.collections4.ListUtils.longestCommonSubsequence(p0,p1);
}
/**
*public static java.lang.CharSequence org.apache.commons.lang3.CharSequenceUtils.subSequence(java.lang.CharSequence,int)
*/ 
public static java.lang.CharSequence subSequence(java.lang.CharSequence p0,int p1){
	return org.apache.commons.lang3.CharSequenceUtils.subSequence(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence,int)
*/ 
public static int indexOf(java.lang.CharSequence p0,int p1){
	return org.apache.commons.lang3.StringUtils.indexOf(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence,int,int)
*/ 
public static int indexOf(java.lang.CharSequence p0,int p1,int p2){
	return org.apache.commons.lang3.StringUtils.indexOf(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence,java.lang.CharSequence,int)
*/ 
public static int indexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
	return org.apache.commons.lang3.StringUtils.indexOf(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static int indexOf(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.indexOf(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence,int)
*/ 
public static boolean contains(java.lang.CharSequence p0,int p1){
	return org.apache.commons.lang3.StringUtils.contains(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static boolean contains(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.contains(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.endsWith(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static boolean endsWith(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.endsWith(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isEmpty(java.lang.CharSequence)
*/ 
public static boolean isEmpty(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isEmpty(p0);
}
/**
*public static int org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence,int)
*/ 
public static int lastIndexOf(java.lang.CharSequence p0,int p1){
	return org.apache.commons.lang3.StringUtils.lastIndexOf(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static int lastIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.lastIndexOf(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence,java.lang.CharSequence,int)
*/ 
public static int lastIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
	return org.apache.commons.lang3.StringUtils.lastIndexOf(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence,int,int)
*/ 
public static int lastIndexOf(java.lang.CharSequence p0,int p1,int p2){
	return org.apache.commons.lang3.StringUtils.lastIndexOf(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.StringUtils.length(java.lang.CharSequence)
*/ 
public static int length(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.length(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.startsWith(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static boolean startsWith(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.startsWith(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isWhitespace(java.lang.CharSequence)
*/ 
public static boolean isWhitespace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isWhitespace(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAlpha(java.lang.CharSequence)
*/ 
public static boolean isAlpha(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlpha(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isNumeric(java.lang.CharSequence)
*/ 
public static boolean isNumeric(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNumeric(p0);
}
/**
*public static double org.apache.commons.lang3.StringUtils.getJaroWinklerDistance(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static double getJaroWinklerDistance(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.getJaroWinklerDistance(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAlphanumericSpace(java.lang.CharSequence)
*/ 
public static boolean isAlphanumericSpace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlphanumericSpace(p0);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static int indexOfDifference(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.indexOfDifference(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(java.lang.CharSequence,java.lang.CharSequence,int)
*/ 
public static int lastOrdinalIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
	return org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static boolean containsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.containsIgnoreCase(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.getLevenshteinDistance(java.lang.CharSequence,java.lang.CharSequence,int)
*/ 
public static int getLevenshteinDistance(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
	return org.apache.commons.lang3.StringUtils.getLevenshteinDistance(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.StringUtils.getLevenshteinDistance(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static int getLevenshteinDistance(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.getLevenshteinDistance(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(java.lang.CharSequence,java.lang.CharSequence,int)
*/ 
public static int indexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
	return org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static int indexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsWhitespace(java.lang.CharSequence)
*/ 
public static boolean containsWhitespace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.containsWhitespace(p0);
}
/**
*public static int org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(java.lang.CharSequence,java.lang.CharSequence,int)
*/ 
public static int lastIndexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
	return org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static int lastIndexOfIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isBlank(java.lang.CharSequence)
*/ 
public static boolean isBlank(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isBlank(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isNotEmpty(java.lang.CharSequence)
*/ 
public static boolean isNotEmpty(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNotEmpty(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isNotBlank(java.lang.CharSequence)
*/ 
public static boolean isNotBlank(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNotBlank(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence,char...)
*/ 
public static boolean containsOnly(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.containsOnly(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence,java.lang.String)
*/ 
public static boolean containsOnly(java.lang.CharSequence p0,java.lang.String p1){
	return org.apache.commons.lang3.StringUtils.containsOnly(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence,java.lang.CharSequence...)
*/ 
public static int indexOfAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.indexOfAny(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence,char...)
*/ 
public static int indexOfAny(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.indexOfAny(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence,java.lang.String)
*/ 
public static int indexOfAny(java.lang.CharSequence p0,java.lang.String p1){
	return org.apache.commons.lang3.StringUtils.indexOfAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence,java.lang.String)
*/ 
public static boolean containsNone(java.lang.CharSequence p0,java.lang.String p1){
	return org.apache.commons.lang3.StringUtils.containsNone(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence,char...)
*/ 
public static boolean containsNone(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.containsNone(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence,java.lang.CharSequence...)
*/ 
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.containsAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.containsAny(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence,char...)
*/ 
public static boolean containsAny(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.containsAny(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static int indexOfAnyBut(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.indexOfAnyBut(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.CharSequence,char...)
*/ 
public static int indexOfAnyBut(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.indexOfAnyBut(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.lastIndexOfAny(java.lang.CharSequence,java.lang.CharSequence...)
*/ 
public static int lastIndexOfAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.lastIndexOfAny(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.ordinalIndexOf(java.lang.CharSequence,java.lang.CharSequence,int)
*/ 
public static int ordinalIndexOf(java.lang.CharSequence p0,java.lang.CharSequence p1,int p2){
	return org.apache.commons.lang3.StringUtils.ordinalIndexOf(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAllLowerCase(java.lang.CharSequence)
*/ 
public static boolean isAllLowerCase(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAllLowerCase(p0);
}
/**
*public static <T> T org.apache.commons.lang3.StringUtils.defaultIfEmpty(T,T)
*/ 
public static <T extends java.lang.CharSequence > T defaultIfEmpty(T p0,T p1){
	return org.apache.commons.lang3.StringUtils.defaultIfEmpty(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAsciiPrintable(java.lang.CharSequence)
*/ 
public static boolean isAsciiPrintable(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAsciiPrintable(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAlphanumeric(java.lang.CharSequence)
*/ 
public static boolean isAlphanumeric(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlphanumeric(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAllUpperCase(java.lang.CharSequence)
*/ 
public static boolean isAllUpperCase(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAllUpperCase(p0);
}
/**
*public static <T> T org.apache.commons.lang3.StringUtils.defaultIfBlank(T,T)
*/ 
public static <T extends java.lang.CharSequence > T defaultIfBlank(T p0,T p1){
	return org.apache.commons.lang3.StringUtils.defaultIfBlank(p0,p1);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isNumericSpace(java.lang.CharSequence)
*/ 
public static boolean isNumericSpace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNumericSpace(p0);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.isAlphaSpace(java.lang.CharSequence)
*/ 
public static boolean isAlphaSpace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlphaSpace(p0);
}
/**
*public static int org.apache.commons.lang3.StringUtils.countMatches(java.lang.CharSequence,char)
*/ 
public static int countMatches(java.lang.CharSequence p0,char p1){
	return org.apache.commons.lang3.StringUtils.countMatches(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.countMatches(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static int countMatches(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.countMatches(p0,p1);
}
/**
*public static int org.apache.commons.lang3.StringUtils.getFuzzyDistance(java.lang.CharSequence,java.lang.CharSequence,java.util.Locale)
*/ 
public static int getFuzzyDistance(java.lang.CharSequence p0,java.lang.CharSequence p1,java.util.Locale p2){
	return org.apache.commons.lang3.StringUtils.getFuzzyDistance(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.startsWithAny(java.lang.CharSequence,java.lang.CharSequence...)
*/ 
public static boolean startsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.startsWithAny(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.lang3.StringUtils.appendIfMissing(java.lang.String,java.lang.CharSequence,java.lang.CharSequence...)
*/ 
public static java.lang.String appendIfMissing(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
	return org.apache.commons.lang3.StringUtils.appendIfMissing(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.endsWithAny(java.lang.CharSequence,java.lang.CharSequence...)
*/ 
public static boolean endsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.endsWithAny(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.lang3.StringUtils.prependIfMissing(java.lang.String,java.lang.CharSequence,java.lang.CharSequence...)
*/ 
public static java.lang.String prependIfMissing(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
	return org.apache.commons.lang3.StringUtils.prependIfMissing(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static boolean startsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase(java.lang.String,java.lang.CharSequence,java.lang.CharSequence...)
*/ 
public static java.lang.String prependIfMissingIgnoreCase(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
	return org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase(p0,p1,p2);
}
/**
*public static java.lang.String org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase(java.lang.String,java.lang.CharSequence,java.lang.CharSequence...)
*/ 
public static java.lang.String appendIfMissingIgnoreCase(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
	return org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*/ 
public static boolean endsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(p0,p1);
}
/**
*public static java.util.Formatter org.apache.commons.lang3.text.FormattableUtils.append(java.lang.CharSequence,java.util.Formatter,int,int,int,java.lang.CharSequence)
*/ 
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,java.lang.CharSequence p5){
	return org.apache.commons.lang3.text.FormattableUtils.append(p0,p1,p2,p3,p4,p5);
}
/**
*public static java.util.Formatter org.apache.commons.lang3.text.FormattableUtils.append(java.lang.CharSequence,java.util.Formatter,int,int,int,char,java.lang.CharSequence)
*/ 
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,char p5,java.lang.CharSequence p6){
	return org.apache.commons.lang3.text.FormattableUtils.append(p0,p1,p2,p3,p4,p5,p6);
}
/**
*public static java.util.Formatter org.apache.commons.lang3.text.FormattableUtils.append(java.lang.CharSequence,java.util.Formatter,int,int,int,char)
*/ 
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4,char p5){
	return org.apache.commons.lang3.text.FormattableUtils.append(p0,p1,p2,p3,p4,p5);
}
/**
*public static java.util.Formatter org.apache.commons.lang3.text.FormattableUtils.append(java.lang.CharSequence,java.util.Formatter,int,int,int)
*/ 
public static java.util.Formatter append(java.lang.CharSequence p0,java.util.Formatter p1,int p2,int p3,int p4){
	return org.apache.commons.lang3.text.FormattableUtils.append(p0,p1,p2,p3,p4);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notEmpty(T)
*/ 
public static <T extends java.lang.CharSequence > T notEmpty(T p0){
	return org.apache.commons.lang3.Validate.notEmpty(p0);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notEmpty(T,java.lang.String,java.lang.Object...)
*/ 
public static <T extends java.lang.CharSequence > T notEmpty(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.notEmpty(p0,p1,p2);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.validIndex(T,int)
*/ 
public static <T extends java.lang.CharSequence > T validIndex(T p0,int p1){
	return org.apache.commons.lang3.Validate.validIndex(p0,p1);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.validIndex(T,int,java.lang.String,java.lang.Object...)
*/ 
public static <T extends java.lang.CharSequence > T validIndex(T p0,int p1,java.lang.String p2,java.lang.Object... p3){
	return org.apache.commons.lang3.Validate.validIndex(p0,p1,p2,p3);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notBlank(T)
*/ 
public static <T extends java.lang.CharSequence > T notBlank(T p0){
	return org.apache.commons.lang3.Validate.notBlank(p0);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notBlank(T,java.lang.String,java.lang.Object...)
*/ 
public static <T extends java.lang.CharSequence > T notBlank(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.notBlank(p0,p1,p2);
}
/**
*public static void org.apache.commons.lang3.Validate.matchesPattern(java.lang.CharSequence,java.lang.String,java.lang.String,java.lang.Object...)
*/ 
public static void matchesPattern(java.lang.CharSequence p0,java.lang.String p1,java.lang.String p2,java.lang.Object... p3){
	 org.apache.commons.lang3.Validate.matchesPattern(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.lang3.Validate.matchesPattern(java.lang.CharSequence,java.lang.String)
*/ 
public static void matchesPattern(java.lang.CharSequence p0,java.lang.String p1){
	 org.apache.commons.lang3.Validate.matchesPattern(p0,p1);
}
/**
*public static boolean org.apache.commons.text.WordUtils.containsAllWords(java.lang.CharSequence,java.lang.CharSequence...)
*/ 
public static boolean containsAllWords(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.text.WordUtils.containsAllWords(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.BinIO.asByteIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterable it.unimi.dsi.fastutil.io.BinIO.asBooleanIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterable asBooleanIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterable(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.BinIO.asIntIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBooleans(boolean[] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[],int,int,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBooleans(boolean[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[][],long,long,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[][],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBooleans(boolean[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[][],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeShorts(short[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[][],long,long,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeShorts(short[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[],int,int,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeShorts(short[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeShorts(short[] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.BinIO.asShortIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterable it.unimi.dsi.fastutil.io.BinIO.asShortIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterable asShortIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterable(p0);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadChars(java.lang.CharSequence,char[],int,int) throws java.io.IOException
*/ 
public static int loadChars(java.lang.CharSequence p0,char[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadChars(java.lang.CharSequence,char[]) throws java.io.IOException
*/ 
public static int loadChars(java.lang.CharSequence p0,char[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadChars(java.lang.CharSequence,char[][],long,long) throws java.io.IOException
*/ 
public static long loadChars(java.lang.CharSequence p0,char[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadChars(java.lang.CharSequence,char[][]) throws java.io.IOException
*/ 
public static long loadChars(java.lang.CharSequence p0,char[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1);
}
/**
*public static char[] it.unimi.dsi.fastutil.io.BinIO.loadChars(java.lang.CharSequence) throws java.io.IOException
*/ 
public static char[] loadChars(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterable it.unimi.dsi.fastutil.io.BinIO.asCharIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterable asCharIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterable(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadInts(java.lang.CharSequence,int[][]) throws java.io.IOException
*/ 
public static long loadInts(java.lang.CharSequence p0,int[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadInts(java.lang.CharSequence,int[][],long,long) throws java.io.IOException
*/ 
public static long loadInts(java.lang.CharSequence p0,int[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadInts(java.lang.CharSequence,int[],int,int) throws java.io.IOException
*/ 
public static int loadInts(java.lang.CharSequence p0,int[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadInts(java.lang.CharSequence,int[]) throws java.io.IOException
*/ 
public static int loadInts(java.lang.CharSequence p0,int[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1);
}
/**
*public static int[] it.unimi.dsi.fastutil.io.BinIO.loadInts(java.lang.CharSequence) throws java.io.IOException
*/ 
public static int[] loadInts(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0);
}
/**
*public static short[][] it.unimi.dsi.fastutil.io.BinIO.loadShortsBig(java.lang.CharSequence) throws java.io.IOException
*/ 
public static short[][] loadShortsBig(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShortsBig(p0);
}
/**
*public static long[][] it.unimi.dsi.fastutil.io.BinIO.loadLongsBig(java.lang.CharSequence) throws java.io.IOException
*/ 
public static long[][] loadLongsBig(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongsBig(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterable it.unimi.dsi.fastutil.io.BinIO.asLongIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterable asLongIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterable(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],int,int,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeFloats(float[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[][],long,long,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeFloats(float[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[][],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeFloats(float[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeFloats(float[] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterable it.unimi.dsi.fastutil.io.BinIO.asFloatIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterable asFloatIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterable(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.lang.CharSequence,double[][],long,long) throws java.io.IOException
*/ 
public static long loadDoubles(java.lang.CharSequence p0,double[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1,p2,p3);
}
/**
*public static double[] it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.lang.CharSequence) throws java.io.IOException
*/ 
public static double[] loadDoubles(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.lang.CharSequence,double[],int,int) throws java.io.IOException
*/ 
public static int loadDoubles(java.lang.CharSequence p0,double[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.lang.CharSequence,double[][]) throws java.io.IOException
*/ 
public static long loadDoubles(java.lang.CharSequence p0,double[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.lang.CharSequence,double[]) throws java.io.IOException
*/ 
public static int loadDoubles(java.lang.CharSequence p0,double[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.lang.CharSequence,long[]) throws java.io.IOException
*/ 
public static int loadLongs(java.lang.CharSequence p0,long[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.lang.CharSequence,long[],int,int) throws java.io.IOException
*/ 
public static int loadLongs(java.lang.CharSequence p0,long[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.lang.CharSequence,long[][],long,long) throws java.io.IOException
*/ 
public static long loadLongs(java.lang.CharSequence p0,long[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.lang.CharSequence,long[][]) throws java.io.IOException
*/ 
public static long loadLongs(java.lang.CharSequence p0,long[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*public static long[] it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.lang.CharSequence) throws java.io.IOException
*/ 
public static long[] loadLongs(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.BinIO.asLongIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[][],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeDoubles(double[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[][],long,long,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeDoubles(double[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeDoubles(double[] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[],int,int,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeDoubles(double[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeObject(java.lang.Object,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeObject(java.lang.Object p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeObject(p0,p1);
}
/**
*public static int[][] it.unimi.dsi.fastutil.io.BinIO.loadIntsBig(java.lang.CharSequence) throws java.io.IOException
*/ 
public static int[][] loadIntsBig(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadIntsBig(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.lang.CharSequence,short[][]) throws java.io.IOException
*/ 
public static long loadShorts(java.lang.CharSequence p0,short[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.lang.CharSequence,short[]) throws java.io.IOException
*/ 
public static int loadShorts(java.lang.CharSequence p0,short[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.lang.CharSequence,short[],int,int) throws java.io.IOException
*/ 
public static int loadShorts(java.lang.CharSequence p0,short[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.lang.CharSequence,short[][],long,long) throws java.io.IOException
*/ 
public static long loadShorts(java.lang.CharSequence p0,short[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1,p2,p3);
}
/**
*public static short[] it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.lang.CharSequence) throws java.io.IOException
*/ 
public static short[] loadShorts(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0);
}
/**
*public static boolean[][] it.unimi.dsi.fastutil.io.BinIO.loadBooleansBig(java.lang.CharSequence) throws java.io.IOException
*/ 
public static boolean[][] loadBooleansBig(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleansBig(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeInts(int[] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[],int,int,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeInts(int[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[][],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeInts(int[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[][],long,long,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeInts(int[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],long,long,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeLongs(long[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeLongs(long[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeLongs(long[] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[],int,int,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeLongs(long[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.lang.CharSequence,boolean[][],long,long) throws java.io.IOException
*/ 
public static long loadBooleans(java.lang.CharSequence p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.lang.CharSequence,boolean[][]) throws java.io.IOException
*/ 
public static long loadBooleans(java.lang.CharSequence p0,boolean[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1);
}
/**
*public static boolean[] it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.lang.CharSequence) throws java.io.IOException
*/ 
public static boolean[] loadBooleans(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.lang.CharSequence,boolean[]) throws java.io.IOException
*/ 
public static int loadBooleans(java.lang.CharSequence p0,boolean[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.lang.CharSequence,boolean[],int,int) throws java.io.IOException
*/ 
public static int loadBooleans(java.lang.CharSequence p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.lang.CharSequence,float[][]) throws java.io.IOException
*/ 
public static long loadFloats(java.lang.CharSequence p0,float[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*public static float[] it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.lang.CharSequence) throws java.io.IOException
*/ 
public static float[] loadFloats(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.lang.CharSequence,float[][],long,long) throws java.io.IOException
*/ 
public static long loadFloats(java.lang.CharSequence p0,float[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.lang.CharSequence,float[],int,int) throws java.io.IOException
*/ 
public static int loadFloats(java.lang.CharSequence p0,float[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.lang.CharSequence,float[]) throws java.io.IOException
*/ 
public static int loadFloats(java.lang.CharSequence p0,float[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterable it.unimi.dsi.fastutil.io.BinIO.asByteIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterable asByteIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterable(p0);
}
/**
*public static float[][] it.unimi.dsi.fastutil.io.BinIO.loadFloatsBig(java.lang.CharSequence) throws java.io.IOException
*/ 
public static float[][] loadFloatsBig(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloatsBig(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterable it.unimi.dsi.fastutil.io.BinIO.asIntIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterable asIntIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterable(p0);
}
/**
*public static java.lang.Object it.unimi.dsi.fastutil.io.BinIO.loadObject(java.lang.CharSequence) throws java.io.IOException,java.lang.ClassNotFoundException
*/ 
public static java.lang.Object loadObject(java.lang.CharSequence p0) throws java.io.IOException,java.lang.ClassNotFoundException{
	return it.unimi.dsi.fastutil.io.BinIO.loadObject(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.lang.CharSequence,byte[][]) throws java.io.IOException
*/ 
public static long loadBytes(java.lang.CharSequence p0,byte[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.lang.CharSequence,byte[][],long,long) throws java.io.IOException
*/ 
public static long loadBytes(java.lang.CharSequence p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.lang.CharSequence,byte[],int,int) throws java.io.IOException
*/ 
public static int loadBytes(java.lang.CharSequence p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.lang.CharSequence,byte[]) throws java.io.IOException
*/ 
public static int loadBytes(java.lang.CharSequence p0,byte[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*public static byte[] it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.lang.CharSequence) throws java.io.IOException
*/ 
public static byte[] loadBytes(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBytes(byte[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],long,long,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBytes(byte[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[],int,int,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBytes(byte[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBytes(byte[] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*public static byte[][] it.unimi.dsi.fastutil.io.BinIO.loadBytesBig(java.lang.CharSequence) throws java.io.IOException
*/ 
public static byte[][] loadBytesBig(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytesBig(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeChars(char[] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[],int,int,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeChars(char[] p0,int p1,int p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[][],long,long,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeChars(char[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[][],java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeChars(char[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*public static char[][] it.unimi.dsi.fastutil.io.BinIO.loadCharsBig(java.lang.CharSequence) throws java.io.IOException
*/ 
public static char[][] loadCharsBig(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadCharsBig(p0);
}
/**
*public static double[][] it.unimi.dsi.fastutil.io.BinIO.loadDoublesBig(java.lang.CharSequence) throws java.io.IOException
*/ 
public static double[][] loadDoublesBig(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoublesBig(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterable it.unimi.dsi.fastutil.io.BinIO.asDoubleIterable(java.lang.CharSequence)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterable asDoubleIterable(java.lang.CharSequence p0){
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterable(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.io.BinIO.asCharIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterator(p0);
}
}
