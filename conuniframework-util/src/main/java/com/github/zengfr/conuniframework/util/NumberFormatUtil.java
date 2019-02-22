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
public final class NumberFormatUtil{ 
/**
*{@link org.apache.commons.math3.util.CompositeFormat#formatDouble(double,java.text.NumberFormat,java.lang.StringBuffer,java.text.FieldPosition)}
*@see org.apache.commons.math3.util.CompositeFormat#formatDouble(double,java.text.NumberFormat,java.lang.StringBuffer,java.text.FieldPosition)
*<code>public static java.lang.StringBuffer org.apache.commons.math3.util.CompositeFormat.formatDouble(double,java.text.NumberFormat,java.lang.StringBuffer,java.text.FieldPosition)
*formatDouble(double p0,java.text.NumberFormat p1,java.lang.StringBuffer p2,java.text.FieldPosition p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.StringBuffer formatDouble(double p0,java.text.NumberFormat p1,java.lang.StringBuffer p2,java.text.FieldPosition p3){
	return org.apache.commons.math3.util.CompositeFormat.formatDouble(p0,p1,p2,p3);
}
/**
*{@link java.text.NumberFormat#getCurrencyInstance(java.util.Locale)}
*@see java.text.NumberFormat#getCurrencyInstance(java.util.Locale)
*<code>public static java.text.NumberFormat java.text.NumberFormat.getCurrencyInstance(java.util.Locale)
*getCurrencyInstance(java.util.Locale p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.text.NumberFormat getCurrencyInstance(java.util.Locale p0){
	return java.text.NumberFormat.getCurrencyInstance(p0);
}
/**
*{@link java.text.NumberFormat#getCurrencyInstance()}
*@see java.text.NumberFormat#getCurrencyInstance()
*<code>public static final java.text.NumberFormat java.text.NumberFormat.getCurrencyInstance()
*getCurrencyInstance()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static final java.text.NumberFormat getCurrencyInstance(){
	return java.text.NumberFormat.getCurrencyInstance();
}
/**
*{@link org.apache.commons.math3.util.CompositeFormat#getDefaultNumberFormat(java.util.Locale)}
*@see org.apache.commons.math3.util.CompositeFormat#getDefaultNumberFormat(java.util.Locale)
*<code>public static java.text.NumberFormat org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat(java.util.Locale)
*getDefaultNumberFormat(java.util.Locale p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.text.NumberFormat getDefaultNumberFormat(java.util.Locale p0){
	return org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat(p0);
}
/**
*{@link org.apache.commons.math3.util.CompositeFormat#getDefaultNumberFormat()}
*@see org.apache.commons.math3.util.CompositeFormat#getDefaultNumberFormat()
*<code>public static java.text.NumberFormat org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat()
*getDefaultNumberFormat()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.text.NumberFormat getDefaultNumberFormat(){
	return org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat();
}
/**
*{@link java.text.NumberFormat#getInstance()}
*@see java.text.NumberFormat#getInstance()
*<code>public static final java.text.NumberFormat java.text.NumberFormat.getInstance()
*getInstance()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static final java.text.NumberFormat getInstance(){
	return java.text.NumberFormat.getInstance();
}
/**
*{@link java.text.NumberFormat#getInstance(java.util.Locale)}
*@see java.text.NumberFormat#getInstance(java.util.Locale)
*<code>public static java.text.NumberFormat java.text.NumberFormat.getInstance(java.util.Locale)
*getInstance(java.util.Locale p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.text.NumberFormat getInstance(java.util.Locale p0){
	return java.text.NumberFormat.getInstance(p0);
}
/**
*{@link java.text.NumberFormat#getIntegerInstance(java.util.Locale)}
*@see java.text.NumberFormat#getIntegerInstance(java.util.Locale)
*<code>public static java.text.NumberFormat java.text.NumberFormat.getIntegerInstance(java.util.Locale)
*getIntegerInstance(java.util.Locale p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.text.NumberFormat getIntegerInstance(java.util.Locale p0){
	return java.text.NumberFormat.getIntegerInstance(p0);
}
/**
*{@link java.text.NumberFormat#getIntegerInstance()}
*@see java.text.NumberFormat#getIntegerInstance()
*<code>public static final java.text.NumberFormat java.text.NumberFormat.getIntegerInstance()
*getIntegerInstance()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static final java.text.NumberFormat getIntegerInstance(){
	return java.text.NumberFormat.getIntegerInstance();
}
/**
*{@link java.text.NumberFormat#getNumberInstance()}
*@see java.text.NumberFormat#getNumberInstance()
*<code>public static final java.text.NumberFormat java.text.NumberFormat.getNumberInstance()
*getNumberInstance()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static final java.text.NumberFormat getNumberInstance(){
	return java.text.NumberFormat.getNumberInstance();
}
/**
*{@link java.text.NumberFormat#getNumberInstance(java.util.Locale)}
*@see java.text.NumberFormat#getNumberInstance(java.util.Locale)
*<code>public static java.text.NumberFormat java.text.NumberFormat.getNumberInstance(java.util.Locale)
*getNumberInstance(java.util.Locale p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.text.NumberFormat getNumberInstance(java.util.Locale p0){
	return java.text.NumberFormat.getNumberInstance(p0);
}
/**
*{@link java.text.NumberFormat#getPercentInstance(java.util.Locale)}
*@see java.text.NumberFormat#getPercentInstance(java.util.Locale)
*<code>public static java.text.NumberFormat java.text.NumberFormat.getPercentInstance(java.util.Locale)
*getPercentInstance(java.util.Locale p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.text.NumberFormat getPercentInstance(java.util.Locale p0){
	return java.text.NumberFormat.getPercentInstance(p0);
}
/**
*{@link java.text.NumberFormat#getPercentInstance()}
*@see java.text.NumberFormat#getPercentInstance()
*<code>public static final java.text.NumberFormat java.text.NumberFormat.getPercentInstance()
*getPercentInstance()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static final java.text.NumberFormat getPercentInstance(){
	return java.text.NumberFormat.getPercentInstance();
}
/**
*{@link org.apache.commons.math3.util.CompositeFormat#parseNumber(java.lang.String,java.text.NumberFormat,java.text.ParsePosition)}
*@see org.apache.commons.math3.util.CompositeFormat#parseNumber(java.lang.String,java.text.NumberFormat,java.text.ParsePosition)
*<code>public static java.lang.Number org.apache.commons.math3.util.CompositeFormat.parseNumber(java.lang.String,java.text.NumberFormat,java.text.ParsePosition)
*parseNumber(java.lang.String p0,java.text.NumberFormat p1,java.text.ParsePosition p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Number parseNumber(java.lang.String p0,java.text.NumberFormat p1,java.text.ParsePosition p2){
	return org.apache.commons.math3.util.CompositeFormat.parseNumber(p0,p1,p2);
}
}
