package com.zengfr.supercommons;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.commons.lang.time.FastDateFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FastDateFormatUtil{ 
public static org.apache.commons.lang3.time.FastDateFormat getInstance(){
return FastDateFormat.getInstance();
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0,java.util.Locale p1){
return FastDateFormat.getInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0,java.util.TimeZone p1){
return FastDateFormat.getInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0){
return FastDateFormat.getInstance(p0);
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0){
return FastDateFormat.getDateInstance(p0);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0,java.util.Locale p1){
return FastDateFormat.getDateInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0,java.util.TimeZone p1){
return FastDateFormat.getDateInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getDateInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int p0,int p1,java.util.Locale p2){
return FastDateFormat.getDateTimeInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int p0,int p1){
return FastDateFormat.getDateTimeInstance(p0,p1);
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
public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int p0,java.util.Locale p1){
return FastDateFormat.getTimeInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int p0){
return FastDateFormat.getTimeInstance(p0);
}
}
