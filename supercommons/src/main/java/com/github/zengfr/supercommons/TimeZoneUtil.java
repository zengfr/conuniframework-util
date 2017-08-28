package com.zengfr.supercommons;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.commons.lang.time.FastDateFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TimeZoneUtil{ 
public static java.lang.String format(java.util.Date p0,java.lang.String p1,java.util.TimeZone p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(long p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3){
return DateFormatUtils.format(p0,p1,p2,p3);
}
public static java.lang.String format(java.util.Date p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3){
return DateFormatUtils.format(p0,p1,p2,p3);
}
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.TimeZone p2,java.util.Locale p3){
return DateFormatUtils.format(p0,p1,p2,p3);
}
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.TimeZone p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(long p0,java.lang.String p1,java.util.TimeZone p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String formatPeriod(long p0,long p1,java.lang.String p2,boolean p3,java.util.TimeZone p4){
return DurationFormatUtils.formatPeriod(p0,p1,p2,p3,p4);
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0,java.util.TimeZone p1){
return FastDateFormat.getInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0,java.util.TimeZone p1){
return FastDateFormat.getDateInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getDateInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int p0,int p1,java.util.TimeZone p2){
return FastDateFormat.getDateTimeInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int p0,int p1,java.util.TimeZone p2,java.util.Locale p3){
return FastDateFormat.getDateTimeInstance(p0,p1,p2,p3);
}
public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getTimeInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int p0,java.util.TimeZone p1){
return FastDateFormat.getTimeInstance(p0,p1);
}
}
