package com.github.zengfr.supercommons;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.commons.math3.linear.RealMatrixFormat;
import org.apache.commons.math3.linear.RealVectorFormat;
import org.apache.commons.math3.complex.ComplexFormat;
import org.apache.commons.math3.fraction.BigFractionFormat;
import java.text.NumberFormat;
import org.apache.commons.math3.fraction.FractionFormat;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat;
import org.apache.commons.math3.util.CompositeFormat;
import org.apache.commons.beanutils.locale.LocaleBeanUtils;
import org.apache.commons.beanutils.locale.LocaleConvertUtils;
import org.apache.commons.lang.LocaleUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.FastDateFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LocaleUtil{ 
public static java.util.Locale toLocale(java.lang.String p0){
return LocaleUtils.toLocale(p0);
}
public static java.util.List<java.util.Locale> localeLookupList(java.util.Locale p0,java.util.Locale p1){
return LocaleUtils.localeLookupList(p0,p1);
}
public static java.util.List<java.util.Locale> localeLookupList(java.util.Locale p0){
return LocaleUtils.localeLookupList(p0);
}
public static boolean isAvailableLocale(java.util.Locale p0){
return LocaleUtils.isAvailableLocale(p0);
}
public static java.lang.String upperCase(java.lang.String p0,java.util.Locale p1){
return StringUtils.upperCase(p0,p1);
}
public static java.lang.String lowerCase(java.lang.String p0,java.util.Locale p1){
return StringUtils.lowerCase(p0,p1);
}
public static int getFuzzyDistance(java.lang.CharSequence p0,java.lang.CharSequence p1,java.util.Locale p2){
return StringUtils.getFuzzyDistance(p0,p1,p2);
}
public static java.lang.String format(java.util.Calendar p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(java.util.Date p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.format(p0,p1,p2);
}
public static java.lang.String format(long p0,java.lang.String p1,java.util.Locale p2){
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
public static java.lang.String formatUTC(long p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.formatUTC(p0,p1,p2);
}
public static java.lang.String formatUTC(java.util.Date p0,java.lang.String p1,java.util.Locale p2){
return DateFormatUtils.formatUTC(p0,p1,p2);
}
public static java.util.Date parseDate(java.lang.String p0,java.util.Locale p1,java.lang.String... p2) throws java.text.ParseException{
return DateUtils.parseDate(p0,p1,p2);
}
public static java.util.Date parseDateStrictly(java.lang.String p0,java.util.Locale p1,java.lang.String... p2) throws java.text.ParseException{
return DateUtils.parseDateStrictly(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0,java.util.Locale p1){
return FastDateFormat.getInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getDateInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int p0,java.util.Locale p1){
return FastDateFormat.getDateInstance(p0,p1);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int p0,int p1,java.util.Locale p2){
return FastDateFormat.getDateTimeInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int p0,int p1,java.util.TimeZone p2,java.util.Locale p3){
return FastDateFormat.getDateTimeInstance(p0,p1,p2,p3);
}
public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int p0,java.util.TimeZone p1,java.util.Locale p2){
return FastDateFormat.getTimeInstance(p0,p1,p2);
}
public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int p0,java.util.Locale p1){
return FastDateFormat.getTimeInstance(p0,p1);
}
public static org.apache.commons.math3.linear.RealMatrixFormat getInstance(java.util.Locale p0){
return RealMatrixFormat.getInstance(p0);
}
public static org.apache.commons.math3.fraction.BigFractionFormat getImproperInstance(java.util.Locale p0){
return BigFractionFormat.getImproperInstance(p0);
}
public static org.apache.commons.math3.fraction.BigFractionFormat getProperInstance(java.util.Locale p0){
return BigFractionFormat.getProperInstance(p0);
}
public static java.text.NumberFormat getCurrencyInstance(java.util.Locale p0){
return NumberFormat.getCurrencyInstance(p0);
}
public static java.text.NumberFormat getNumberInstance(java.util.Locale p0){
return NumberFormat.getNumberInstance(p0);
}
public static java.text.NumberFormat getPercentInstance(java.util.Locale p0){
return NumberFormat.getPercentInstance(p0);
}
public static java.text.NumberFormat getIntegerInstance(java.util.Locale p0){
return NumberFormat.getIntegerInstance(p0);
}
public static java.text.NumberFormat getDefaultNumberFormat(java.util.Locale p0){
return CompositeFormat.getDefaultNumberFormat(p0);
}
public static java.util.Locale getDefaultLocale(){
return LocaleBeanUtils.getDefaultLocale();
}
public static void setDefaultLocale(java.util.Locale p0){
 LocaleBeanUtils.setDefaultLocale(p0);
}
public static void register(org.apache.commons.beanutils.locale.LocaleConverter p0,java.lang.Class<?> p1,java.util.Locale p2){
 LocaleConvertUtils.register(p0,p1,p2);
}
public static org.apache.commons.beanutils.locale.LocaleConverter lookup(java.lang.Class<?> p0,java.util.Locale p1){
return LocaleConvertUtils.lookup(p0,p1);
}
public static java.lang.Object convert(java.lang.String p0,java.lang.Class<?> p1,java.util.Locale p2,java.lang.String p3){
return LocaleConvertUtils.convert(p0,p1,p2,p3);
}
public static java.lang.Object convert(java.lang.String[] p0,java.lang.Class<?> p1,java.util.Locale p2,java.lang.String p3){
return LocaleConvertUtils.convert(p0,p1,p2,p3);
}
public static java.lang.String convert(java.lang.Object p0,java.util.Locale p1,java.lang.String p2){
return LocaleConvertUtils.convert(p0,p1,p2);
}
public static void deregister(java.lang.Class<?> p0,java.util.Locale p1){
 LocaleConvertUtils.deregister(p0,p1);
}
public static void deregister(java.util.Locale p0){
 LocaleConvertUtils.deregister(p0);
}
}
