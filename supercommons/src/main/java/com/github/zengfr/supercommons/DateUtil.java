package com.github.zengfr.supercommons;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DateUtil{ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.util.Date p0){
return FileFilterUtils.ageFileFilter(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.util.Date p0,boolean p1){
return FileFilterUtils.ageFileFilter(p0,p1);
}
public static boolean isFileNewer(java.io.File p0,java.util.Date p1){
return FileUtils.isFileNewer(p0,p1);
}
public static boolean isFileOlder(java.io.File p0,java.util.Date p1){
return FileUtils.isFileOlder(p0,p1);
}
public static java.lang.String format(java.util.Date p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(java.util.Date p0,java.lang.String p1,java.util.TimeZone p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(java.util.Date p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3){
return DateFormatUtils.format(p0,p1,p2,p3);
}
public static java.lang.String format(java.util.Date p0,java.lang.String p1){
return DateFormatUtils.format(p0,p1);
}
public static java.lang.String formatUTC(java.util.Date p0,java.lang.String p1){
return DateFormatUtils.formatUTC(p0,p1);
}
public static java.lang.String formatUTC(java.util.Date p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.formatUTC(p0,p1,p2);
}
public static java.util.Iterator<java.util.Calendar> iterator(java.util.Date p0,int p1){
return DateUtils.iterator(p0,p1);
}
public static java.util.Date truncate(java.lang.Object p0,int p1){
return DateUtils.truncate(p0,p1);
}
public static java.util.Date truncate(java.util.Date p0,int p1){
return DateUtils.truncate(p0,p1);
}
public static java.util.Date round(java.util.Date p0,int p1){
return DateUtils.round(p0,p1);
}
public static java.util.Date round(java.lang.Object p0,int p1){
return DateUtils.round(p0,p1);
}
public static java.util.Date addMinutes(java.util.Date p0,int p1){
return DateUtils.addMinutes(p0,p1);
}
public static java.util.Date addSeconds(java.util.Date p0,int p1){
return DateUtils.addSeconds(p0,p1);
}
public static java.util.Date setMonths(java.util.Date p0,int p1){
return DateUtils.setMonths(p0,p1);
}
public static java.util.Date addHours(java.util.Date p0,int p1){
return DateUtils.addHours(p0,p1);
}
public static java.util.Date setHours(java.util.Date p0,int p1){
return DateUtils.setHours(p0,p1);
}
public static java.util.Date setMinutes(java.util.Date p0,int p1){
return DateUtils.setMinutes(p0,p1);
}
public static java.util.Date setSeconds(java.util.Date p0,int p1){
return DateUtils.setSeconds(p0,p1);
}
public static java.util.Date ceiling(java.util.Date p0,int p1){
return DateUtils.ceiling(p0,p1);
}
public static java.util.Date ceiling(java.lang.Object p0,int p1){
return DateUtils.ceiling(p0,p1);
}
public static java.util.Date parseDate(java.lang.String p0,java.lang.String... p1) throws java.text.ParseException{
return DateUtils.parseDate(p0,p1);
}
public static java.util.Date parseDate(java.lang.String p0,java.util.Locale p1,java.lang.String... p2) throws java.text.ParseException{
return DateUtils.parseDate(p0,p1,p2);
}
public static java.util.Calendar toCalendar(java.util.Date p0){
return DateUtils.toCalendar(p0);
}
public static boolean isSameInstant(java.util.Date p0,java.util.Date p1){
return DateUtils.isSameInstant(p0,p1);
}
public static java.util.Date addMilliseconds(java.util.Date p0,int p1){
return DateUtils.addMilliseconds(p0,p1);
}
public static java.util.Date addYears(java.util.Date p0,int p1){
return DateUtils.addYears(p0,p1);
}
public static java.util.Date addMonths(java.util.Date p0,int p1){
return DateUtils.addMonths(p0,p1);
}
public static boolean isSameDay(java.util.Date p0,java.util.Date p1){
return DateUtils.isSameDay(p0,p1);
}
public static java.util.Date setMilliseconds(java.util.Date p0,int p1){
return DateUtils.setMilliseconds(p0,p1);
}
public static java.util.Date setYears(java.util.Date p0,int p1){
return DateUtils.setYears(p0,p1);
}
public static java.util.Date addWeeks(java.util.Date p0,int p1){
return DateUtils.addWeeks(p0,p1);
}
public static boolean truncatedEquals(java.util.Date p0,java.util.Date p1,int p2){
return DateUtils.truncatedEquals(p0,p1,p2);
}
public static java.util.Date setDays(java.util.Date p0,int p1){
return DateUtils.setDays(p0,p1);
}
public static java.util.Date addDays(java.util.Date p0,int p1){
return DateUtils.addDays(p0,p1);
}
public static long getFragmentInMinutes(java.util.Date p0,int p1){
return DateUtils.getFragmentInMinutes(p0,p1);
}
public static java.util.Date parseDateStrictly(java.lang.String p0,java.lang.String... p1) throws java.text.ParseException{
return DateUtils.parseDateStrictly(p0,p1);
}
public static java.util.Date parseDateStrictly(java.lang.String p0,java.util.Locale p1,java.lang.String... p2) throws java.text.ParseException{
return DateUtils.parseDateStrictly(p0,p1,p2);
}
public static int truncatedCompareTo(java.util.Date p0,java.util.Date p1,int p2){
return DateUtils.truncatedCompareTo(p0,p1,p2);
}
public static long getFragmentInSeconds(java.util.Date p0,int p1){
return DateUtils.getFragmentInSeconds(p0,p1);
}
public static long getFragmentInDays(java.util.Date p0,int p1){
return DateUtils.getFragmentInDays(p0,p1);
}
public static long getFragmentInMilliseconds(java.util.Date p0,int p1){
return DateUtils.getFragmentInMilliseconds(p0,p1);
}
public static long getFragmentInHours(java.util.Date p0,int p1){
return DateUtils.getFragmentInHours(p0,p1);
}
public static java.util.Date add(java.util.Date p0,int p1,int p2){
return DateUtils.add(p0,p1,p2);
}
public static java.util.Date parseDate(java.lang.String p0,java.lang.String[] p1) throws java.text.ParseException{
return DateUtils.parseDate(p0,p1);
}
public static java.util.Date parseDateStrictly(java.lang.String p0,java.lang.String[] p1) throws java.text.ParseException{
return DateUtils.parseDateStrictly(p0,p1);
}
}
