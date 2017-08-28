package com.github.zengfr.supercommons;
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
public final class CalendarUtil{ 
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3){
return DateFormatUtils.format(p0,p1,p2,p3);
}
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.TimeZone p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1){
return DateFormatUtils.format(p0,p1);
}
public static java.util.Iterator<java.util.Calendar> iterator(java.util.Calendar p0,int p1){
return DateUtils.iterator(p0,p1);
}
public static java.util.Calendar truncate(java.util.Calendar p0,int p1){
return DateUtils.truncate(p0,p1);
}
public static java.util.Calendar round(java.util.Calendar p0,int p1){
return DateUtils.round(p0,p1);
}
public static java.util.Calendar ceiling(java.util.Calendar p0,int p1){
return DateUtils.ceiling(p0,p1);
}
public static boolean isSameLocalTime(java.util.Calendar p0,java.util.Calendar p1){
return DateUtils.isSameLocalTime(p0,p1);
}
public static java.util.Calendar toCalendar(java.util.Date p0){
return DateUtils.toCalendar(p0);
}
public static boolean isSameInstant(java.util.Calendar p0,java.util.Calendar p1){
return DateUtils.isSameInstant(p0,p1);
}
public static boolean isSameDay(java.util.Calendar p0,java.util.Calendar p1){
return DateUtils.isSameDay(p0,p1);
}
public static boolean truncatedEquals(java.util.Calendar p0,java.util.Calendar p1,int p2){
return DateUtils.truncatedEquals(p0,p1,p2);
}
public static long getFragmentInMinutes(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInMinutes(p0,p1);
}
public static int truncatedCompareTo(java.util.Calendar p0,java.util.Calendar p1,int p2){
return DateUtils.truncatedCompareTo(p0,p1,p2);
}
public static long getFragmentInSeconds(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInSeconds(p0,p1);
}
public static long getFragmentInDays(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInDays(p0,p1);
}
public static long getFragmentInMilliseconds(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInMilliseconds(p0,p1);
}
public static long getFragmentInHours(java.util.Calendar p0,int p1){
return DateUtils.getFragmentInHours(p0,p1);
}
}
