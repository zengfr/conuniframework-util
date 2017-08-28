package com.zengfr.supercommons;
import com.google.common.math.BigIntegerMath;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath;
import org.apache.commons.math3.dfp.DfpField.RoundingMode;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RoundingModeUtil{ 
public static java.math.BigInteger sqrt(java.math.BigInteger p0,java.math.RoundingMode p1){
return BigIntegerMath.sqrt(p0,p1);
}
public static int log10(java.math.BigInteger p0,java.math.RoundingMode p1){
return BigIntegerMath.log10(p0,p1);
}
public static java.math.BigInteger divide(java.math.BigInteger p0,java.math.BigInteger p1,java.math.RoundingMode p2){
return BigIntegerMath.divide(p0,p1,p2);
}
public static int log2(java.math.BigInteger p0,java.math.RoundingMode p1){
return BigIntegerMath.log2(p0,p1);
}
public static java.math.BigInteger roundToBigInteger(double p0,java.math.RoundingMode p1){
return DoubleMath.roundToBigInteger(p0,p1);
}
public static int log2(double p0,java.math.RoundingMode p1){
return DoubleMath.log2(p0,p1);
}
public static long roundToLong(double p0,java.math.RoundingMode p1){
return DoubleMath.roundToLong(p0,p1);
}
public static int roundToInt(double p0,java.math.RoundingMode p1){
return DoubleMath.roundToInt(p0,p1);
}
public static int sqrt(int p0,java.math.RoundingMode p1){
return IntMath.sqrt(p0,p1);
}
public static int log10(int p0,java.math.RoundingMode p1){
return IntMath.log10(p0,p1);
}
public static int divide(int p0,int p1,java.math.RoundingMode p2){
return IntMath.divide(p0,p1,p2);
}
public static int log2(int p0,java.math.RoundingMode p1){
return IntMath.log2(p0,p1);
}
public static long sqrt(long p0,java.math.RoundingMode p1){
return LongMath.sqrt(p0,p1);
}
public static int log10(long p0,java.math.RoundingMode p1){
return LongMath.log10(p0,p1);
}
public static long divide(long p0,long p1,java.math.RoundingMode p2){
return LongMath.divide(p0,p1,p2);
}
public static int log2(long p0,java.math.RoundingMode p1){
return LongMath.log2(p0,p1);
}
public static org.apache.commons.math3.dfp.DfpField.RoundingMode valueOf(java.lang.String p0){
return RoundingMode.valueOf(p0);
}
}
