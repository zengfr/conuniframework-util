package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class CalendarUtil{ 
/**
*{@link org.apache.commons.lang3.time.DateUtils#ceiling(java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#ceiling(java.util.Calendar,int)
*<code>public static java.util.Calendar org.apache.commons.lang3.time.DateUtils.ceiling(java.util.Calendar,int)
*ceiling(java.util.Calendar p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Calendar ceiling(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.ceiling(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateFormatUtils#format(java.util.Calendar,java.lang.String,java.util.Locale)}
*@see org.apache.commons.lang3.time.DateFormatUtils#format(java.util.Calendar,java.lang.String,java.util.Locale)
*<code>public static java.lang.String org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar,java.lang.String,java.util.Locale)
*format(java.util.Calendar p0,java.lang.String p1,java.util.Locale p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.Locale p2){
	return org.apache.commons.lang3.time.DateFormatUtils.format(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.time.DateFormatUtils#format(java.util.Calendar,java.lang.String,java.util.TimeZone,java.util.Locale)}
*@see org.apache.commons.lang3.time.DateFormatUtils#format(java.util.Calendar,java.lang.String,java.util.TimeZone,java.util.Locale)
*<code>public static java.lang.String org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar,java.lang.String,java.util.TimeZone,java.util.Locale)
*format(java.util.Calendar p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3){
	return org.apache.commons.lang3.time.DateFormatUtils.format(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.time.DateFormatUtils#format(java.util.Calendar,java.lang.String,java.util.TimeZone)}
*@see org.apache.commons.lang3.time.DateFormatUtils#format(java.util.Calendar,java.lang.String,java.util.TimeZone)
*<code>public static java.lang.String org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar,java.lang.String,java.util.TimeZone)
*format(java.util.Calendar p0,java.lang.String p1,java.util.TimeZone p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.TimeZone p2){
	return org.apache.commons.lang3.time.DateFormatUtils.format(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.time.DateFormatUtils#format(java.util.Calendar,java.lang.String)}
*@see org.apache.commons.lang3.time.DateFormatUtils#format(java.util.Calendar,java.lang.String)
*<code>public static java.lang.String org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar,java.lang.String)
*format(java.util.Calendar p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1){
	return org.apache.commons.lang3.time.DateFormatUtils.format(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#getFragmentInDays(java.util.Calendar,int)
*<code>public static long org.apache.commons.lang3.time.DateUtils.getFragmentInDays(java.util.Calendar,int)
*getFragmentInDays(java.util.Calendar p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long getFragmentInDays(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.getFragmentInDays(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#getFragmentInHours(java.util.Calendar,int)
*<code>public static long org.apache.commons.lang3.time.DateUtils.getFragmentInHours(java.util.Calendar,int)
*getFragmentInHours(java.util.Calendar p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long getFragmentInHours(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.getFragmentInHours(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#getFragmentInMilliseconds(java.util.Calendar,int)
*<code>public static long org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(java.util.Calendar,int)
*getFragmentInMilliseconds(java.util.Calendar p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long getFragmentInMilliseconds(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#getFragmentInMinutes(java.util.Calendar,int)
*<code>public static long org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(java.util.Calendar,int)
*getFragmentInMinutes(java.util.Calendar p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long getFragmentInMinutes(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#getFragmentInSeconds(java.util.Calendar,int)
*<code>public static long org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(java.util.Calendar,int)
*getFragmentInSeconds(java.util.Calendar p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long getFragmentInSeconds(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Calendar,java.util.Calendar)}
*@see org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Calendar,java.util.Calendar)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Calendar,java.util.Calendar)
*isSameDay(java.util.Calendar p0,java.util.Calendar p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameDay(java.util.Calendar p0,java.util.Calendar p1){
	return org.apache.commons.lang3.time.DateUtils.isSameDay(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
*@see org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Calendar,java.util.Calendar)
*isSameInstant(java.util.Calendar p0,java.util.Calendar p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameInstant(java.util.Calendar p0,java.util.Calendar p1){
	return org.apache.commons.lang3.time.DateUtils.isSameInstant(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#isSameLocalTime(java.util.Calendar,java.util.Calendar)}
*@see org.apache.commons.lang3.time.DateUtils#isSameLocalTime(java.util.Calendar,java.util.Calendar)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.isSameLocalTime(java.util.Calendar,java.util.Calendar)
*isSameLocalTime(java.util.Calendar p0,java.util.Calendar p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLocalTime(java.util.Calendar p0,java.util.Calendar p1){
	return org.apache.commons.lang3.time.DateUtils.isSameLocalTime(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#iterator(java.util.Calendar,int)
*<code>public static java.util.Iterator<java.util.Calendar> org.apache.commons.lang3.time.DateUtils.iterator(java.util.Calendar,int)
*iterator(java.util.Calendar p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<java.util.Calendar> iterator(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.iterator(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#round(java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#round(java.util.Calendar,int)
*<code>public static java.util.Calendar org.apache.commons.lang3.time.DateUtils.round(java.util.Calendar,int)
*round(java.util.Calendar p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Calendar round(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.round(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#toCalendar(java.util.Date)}
*@see org.apache.commons.lang3.time.DateUtils#toCalendar(java.util.Date)
*<code>public static java.util.Calendar org.apache.commons.lang3.time.DateUtils.toCalendar(java.util.Date)
*toCalendar(java.util.Date p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Calendar toCalendar(java.util.Date p0){
	return org.apache.commons.lang3.time.DateUtils.toCalendar(p0);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#toCalendar(java.util.Date,java.util.TimeZone)}
*@see org.apache.commons.lang3.time.DateUtils#toCalendar(java.util.Date,java.util.TimeZone)
*<code>public static java.util.Calendar org.apache.commons.lang3.time.DateUtils.toCalendar(java.util.Date,java.util.TimeZone)
*toCalendar(java.util.Date p0,java.util.TimeZone p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Calendar toCalendar(java.util.Date p0,java.util.TimeZone p1){
	return org.apache.commons.lang3.time.DateUtils.toCalendar(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#truncate(java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#truncate(java.util.Calendar,int)
*<code>public static java.util.Calendar org.apache.commons.lang3.time.DateUtils.truncate(java.util.Calendar,int)
*truncate(java.util.Calendar p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Calendar truncate(java.util.Calendar p0,int p1){
	return org.apache.commons.lang3.time.DateUtils.truncate(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#truncatedCompareTo(java.util.Calendar,java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#truncatedCompareTo(java.util.Calendar,java.util.Calendar,int)
*<code>public static int org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(java.util.Calendar,java.util.Calendar,int)
*truncatedCompareTo(java.util.Calendar p0,java.util.Calendar p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int truncatedCompareTo(java.util.Calendar p0,java.util.Calendar p1,int p2){
	return org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Calendar,java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Calendar,java.util.Calendar,int)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Calendar,java.util.Calendar,int)
*truncatedEquals(java.util.Calendar p0,java.util.Calendar p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean truncatedEquals(java.util.Calendar p0,java.util.Calendar p1,int p2){
	return org.apache.commons.lang3.time.DateUtils.truncatedEquals(p0,p1,p2);
}
}
