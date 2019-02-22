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
public final class BigDecimalUtil{ 
/**
*{@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
*@see org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)
*<code>public static java.math.BigDecimal org.apache.commons.lang3.math.NumberUtils.createBigDecimal(java.lang.String)
*createBigDecimal(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigDecimal createBigDecimal(java.lang.String p0){
	return org.apache.commons.lang3.math.NumberUtils.createBigDecimal(p0);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.math.BigDecimal,double)}
*@see org.apache.commons.lang3.math.NumberUtils#toDouble(java.math.BigDecimal,double)
*<code>public static double org.apache.commons.lang3.math.NumberUtils.toDouble(java.math.BigDecimal,double)
*toDouble(java.math.BigDecimal p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double toDouble(java.math.BigDecimal p0,double p1){
	return org.apache.commons.lang3.math.NumberUtils.toDouble(p0,p1);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.math.BigDecimal)}
*@see org.apache.commons.lang3.math.NumberUtils#toDouble(java.math.BigDecimal)
*<code>public static double org.apache.commons.lang3.math.NumberUtils.toDouble(java.math.BigDecimal)
*toDouble(java.math.BigDecimal p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double toDouble(java.math.BigDecimal p0){
	return org.apache.commons.lang3.math.NumberUtils.toDouble(p0);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.Double,int,java.math.RoundingMode)}
*@see org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.Double,int,java.math.RoundingMode)
*<code>public static java.math.BigDecimal org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(java.lang.Double,int,java.math.RoundingMode)
*toScaledBigDecimal(java.lang.Double p0,int p1,java.math.RoundingMode p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigDecimal toScaledBigDecimal(java.lang.Double p0,int p1,java.math.RoundingMode p2){
	return org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.String)}
*@see org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.String)
*<code>public static java.math.BigDecimal org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(java.lang.String)
*toScaledBigDecimal(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigDecimal toScaledBigDecimal(java.lang.String p0){
	return org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(p0);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.math.BigDecimal)}
*@see org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.math.BigDecimal)
*<code>public static java.math.BigDecimal org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(java.math.BigDecimal)
*toScaledBigDecimal(java.math.BigDecimal p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigDecimal toScaledBigDecimal(java.math.BigDecimal p0){
	return org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(p0);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.String,int,java.math.RoundingMode)}
*@see org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.String,int,java.math.RoundingMode)
*<code>public static java.math.BigDecimal org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(java.lang.String,int,java.math.RoundingMode)
*toScaledBigDecimal(java.lang.String p0,int p1,java.math.RoundingMode p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigDecimal toScaledBigDecimal(java.lang.String p0,int p1,java.math.RoundingMode p2){
	return org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.Float,int,java.math.RoundingMode)}
*@see org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.Float,int,java.math.RoundingMode)
*<code>public static java.math.BigDecimal org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(java.lang.Float,int,java.math.RoundingMode)
*toScaledBigDecimal(java.lang.Float p0,int p1,java.math.RoundingMode p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigDecimal toScaledBigDecimal(java.lang.Float p0,int p1,java.math.RoundingMode p2){
	return org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.math.BigDecimal,int,java.math.RoundingMode)}
*@see org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.math.BigDecimal,int,java.math.RoundingMode)
*<code>public static java.math.BigDecimal org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(java.math.BigDecimal,int,java.math.RoundingMode)
*toScaledBigDecimal(java.math.BigDecimal p0,int p1,java.math.RoundingMode p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigDecimal toScaledBigDecimal(java.math.BigDecimal p0,int p1,java.math.RoundingMode p2){
	return org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.Double)}
*@see org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.Double)
*<code>public static java.math.BigDecimal org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(java.lang.Double)
*toScaledBigDecimal(java.lang.Double p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigDecimal toScaledBigDecimal(java.lang.Double p0){
	return org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(p0);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.Float)}
*@see org.apache.commons.lang3.math.NumberUtils#toScaledBigDecimal(java.lang.Float)
*<code>public static java.math.BigDecimal org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(java.lang.Float)
*toScaledBigDecimal(java.lang.Float p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigDecimal toScaledBigDecimal(java.lang.Float p0){
	return org.apache.commons.lang3.math.NumberUtils.toScaledBigDecimal(p0);
}
}
