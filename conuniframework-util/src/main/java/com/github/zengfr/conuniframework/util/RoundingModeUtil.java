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
public final class RoundingModeUtil{ 
/**
*{@link com.google.common.math.BigIntegerMath#divide(java.math.BigInteger,java.math.BigInteger,java.math.RoundingMode)}
*@see com.google.common.math.BigIntegerMath#divide(java.math.BigInteger,java.math.BigInteger,java.math.RoundingMode)
*<code>public static java.math.BigInteger com.google.common.math.BigIntegerMath.divide(java.math.BigInteger,java.math.BigInteger,java.math.RoundingMode)
*divide(java.math.BigInteger p0,java.math.BigInteger p1,java.math.RoundingMode p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigInteger divide(java.math.BigInteger p0,java.math.BigInteger p1,java.math.RoundingMode p2){
	return com.google.common.math.BigIntegerMath.divide(p0,p1,p2);
}
/**
*{@link com.google.common.math.IntMath#divide(int,int,java.math.RoundingMode)}
*@see com.google.common.math.IntMath#divide(int,int,java.math.RoundingMode)
*<code>public static int com.google.common.math.IntMath.divide(int,int,java.math.RoundingMode)
*divide(int p0,int p1,java.math.RoundingMode p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int divide(int p0,int p1,java.math.RoundingMode p2){
	return com.google.common.math.IntMath.divide(p0,p1,p2);
}
/**
*{@link com.google.common.math.LongMath#divide(long,long,java.math.RoundingMode)}
*@see com.google.common.math.LongMath#divide(long,long,java.math.RoundingMode)
*<code>public static long com.google.common.math.LongMath.divide(long,long,java.math.RoundingMode)
*divide(long p0,long p1,java.math.RoundingMode p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long divide(long p0,long p1,java.math.RoundingMode p2){
	return com.google.common.math.LongMath.divide(p0,p1,p2);
}
/**
*{@link com.google.common.math.BigIntegerMath#log10(java.math.BigInteger,java.math.RoundingMode)}
*@see com.google.common.math.BigIntegerMath#log10(java.math.BigInteger,java.math.RoundingMode)
*<code>public static int com.google.common.math.BigIntegerMath.log10(java.math.BigInteger,java.math.RoundingMode)
*log10(java.math.BigInteger p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int log10(java.math.BigInteger p0,java.math.RoundingMode p1){
	return com.google.common.math.BigIntegerMath.log10(p0,p1);
}
/**
*{@link com.google.common.math.IntMath#log10(int,java.math.RoundingMode)}
*@see com.google.common.math.IntMath#log10(int,java.math.RoundingMode)
*<code>public static int com.google.common.math.IntMath.log10(int,java.math.RoundingMode)
*log10(int p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int log10(int p0,java.math.RoundingMode p1){
	return com.google.common.math.IntMath.log10(p0,p1);
}
/**
*{@link com.google.common.math.LongMath#log10(long,java.math.RoundingMode)}
*@see com.google.common.math.LongMath#log10(long,java.math.RoundingMode)
*<code>public static int com.google.common.math.LongMath.log10(long,java.math.RoundingMode)
*log10(long p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int log10(long p0,java.math.RoundingMode p1){
	return com.google.common.math.LongMath.log10(p0,p1);
}
/**
*{@link com.google.common.math.BigIntegerMath#log2(java.math.BigInteger,java.math.RoundingMode)}
*@see com.google.common.math.BigIntegerMath#log2(java.math.BigInteger,java.math.RoundingMode)
*<code>public static int com.google.common.math.BigIntegerMath.log2(java.math.BigInteger,java.math.RoundingMode)
*log2(java.math.BigInteger p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int log2(java.math.BigInteger p0,java.math.RoundingMode p1){
	return com.google.common.math.BigIntegerMath.log2(p0,p1);
}
/**
*{@link com.google.common.math.DoubleMath#log2(double,java.math.RoundingMode)}
*@see com.google.common.math.DoubleMath#log2(double,java.math.RoundingMode)
*<code>public static int com.google.common.math.DoubleMath.log2(double,java.math.RoundingMode)
*log2(double p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int log2(double p0,java.math.RoundingMode p1){
	return com.google.common.math.DoubleMath.log2(p0,p1);
}
/**
*{@link com.google.common.math.IntMath#log2(int,java.math.RoundingMode)}
*@see com.google.common.math.IntMath#log2(int,java.math.RoundingMode)
*<code>public static int com.google.common.math.IntMath.log2(int,java.math.RoundingMode)
*log2(int p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int log2(int p0,java.math.RoundingMode p1){
	return com.google.common.math.IntMath.log2(p0,p1);
}
/**
*{@link com.google.common.math.LongMath#log2(long,java.math.RoundingMode)}
*@see com.google.common.math.LongMath#log2(long,java.math.RoundingMode)
*<code>public static int com.google.common.math.LongMath.log2(long,java.math.RoundingMode)
*log2(long p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int log2(long p0,java.math.RoundingMode p1){
	return com.google.common.math.LongMath.log2(p0,p1);
}
/**
*{@link com.google.common.math.DoubleMath#roundToBigInteger(double,java.math.RoundingMode)}
*@see com.google.common.math.DoubleMath#roundToBigInteger(double,java.math.RoundingMode)
*<code>public static java.math.BigInteger com.google.common.math.DoubleMath.roundToBigInteger(double,java.math.RoundingMode)
*roundToBigInteger(double p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigInteger roundToBigInteger(double p0,java.math.RoundingMode p1){
	return com.google.common.math.DoubleMath.roundToBigInteger(p0,p1);
}
/**
*{@link com.google.common.math.DoubleMath#roundToInt(double,java.math.RoundingMode)}
*@see com.google.common.math.DoubleMath#roundToInt(double,java.math.RoundingMode)
*<code>public static int com.google.common.math.DoubleMath.roundToInt(double,java.math.RoundingMode)
*roundToInt(double p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int roundToInt(double p0,java.math.RoundingMode p1){
	return com.google.common.math.DoubleMath.roundToInt(p0,p1);
}
/**
*{@link com.google.common.math.DoubleMath#roundToLong(double,java.math.RoundingMode)}
*@see com.google.common.math.DoubleMath#roundToLong(double,java.math.RoundingMode)
*<code>public static long com.google.common.math.DoubleMath.roundToLong(double,java.math.RoundingMode)
*roundToLong(double p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long roundToLong(double p0,java.math.RoundingMode p1){
	return com.google.common.math.DoubleMath.roundToLong(p0,p1);
}
/**
*{@link com.google.common.math.BigIntegerMath#sqrt(java.math.BigInteger,java.math.RoundingMode)}
*@see com.google.common.math.BigIntegerMath#sqrt(java.math.BigInteger,java.math.RoundingMode)
*<code>public static java.math.BigInteger com.google.common.math.BigIntegerMath.sqrt(java.math.BigInteger,java.math.RoundingMode)
*sqrt(java.math.BigInteger p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigInteger sqrt(java.math.BigInteger p0,java.math.RoundingMode p1){
	return com.google.common.math.BigIntegerMath.sqrt(p0,p1);
}
/**
*{@link com.google.common.math.IntMath#sqrt(int,java.math.RoundingMode)}
*@see com.google.common.math.IntMath#sqrt(int,java.math.RoundingMode)
*<code>public static int com.google.common.math.IntMath.sqrt(int,java.math.RoundingMode)
*sqrt(int p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int sqrt(int p0,java.math.RoundingMode p1){
	return com.google.common.math.IntMath.sqrt(p0,p1);
}
/**
*{@link com.google.common.math.LongMath#sqrt(long,java.math.RoundingMode)}
*@see com.google.common.math.LongMath#sqrt(long,java.math.RoundingMode)
*<code>public static long com.google.common.math.LongMath.sqrt(long,java.math.RoundingMode)
*sqrt(long p0,java.math.RoundingMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long sqrt(long p0,java.math.RoundingMode p1){
	return com.google.common.math.LongMath.sqrt(p0,p1);
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
}
