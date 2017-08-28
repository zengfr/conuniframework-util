package com.github.zengfr.supercommons;
import java.text.NumberFormat;
import org.apache.commons.math3.util.CompositeFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NumberFormatUtil{ 
public static java.text.NumberFormat getInstance(java.util.Locale p0){
return NumberFormat.getInstance(p0);
}
public static final java.text.NumberFormat getInstance(){
return NumberFormat.getInstance();
}
public static final java.text.NumberFormat getCurrencyInstance(){
return NumberFormat.getCurrencyInstance();
}
public static java.text.NumberFormat getCurrencyInstance(java.util.Locale p0){
return NumberFormat.getCurrencyInstance(p0);
}
public static final java.text.NumberFormat getNumberInstance(){
return NumberFormat.getNumberInstance();
}
public static java.text.NumberFormat getNumberInstance(java.util.Locale p0){
return NumberFormat.getNumberInstance(p0);
}
public static final java.text.NumberFormat getPercentInstance(){
return NumberFormat.getPercentInstance();
}
public static java.text.NumberFormat getPercentInstance(java.util.Locale p0){
return NumberFormat.getPercentInstance(p0);
}
public static final java.text.NumberFormat getIntegerInstance(){
return NumberFormat.getIntegerInstance();
}
public static java.text.NumberFormat getIntegerInstance(java.util.Locale p0){
return NumberFormat.getIntegerInstance(p0);
}
public static java.lang.Number parseNumber(java.lang.String p0,java.text.NumberFormat p1,java.text.ParsePosition p2){
return CompositeFormat.parseNumber(p0,p1,p2);
}
public static java.lang.StringBuffer formatDouble(double p0,java.text.NumberFormat p1,java.lang.StringBuffer p2,java.text.FieldPosition p3){
return CompositeFormat.formatDouble(p0,p1,p2,p3);
}
public static java.text.NumberFormat getDefaultNumberFormat(){
return CompositeFormat.getDefaultNumberFormat();
}
public static java.text.NumberFormat getDefaultNumberFormat(java.util.Locale p0){
return CompositeFormat.getDefaultNumberFormat(p0);
}
}
