package com.zengfr.supercommons;
import com.google.common.math.BigIntegerMath;
import com.google.common.math.DoubleMath;
import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedLong;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.NumberUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BigIntegerUtil{ 
public static java.math.BigInteger sqrt(java.math.BigInteger p0,java.math.RoundingMode p1){
return BigIntegerMath.sqrt(p0,p1);
}
public static int log10(java.math.BigInteger p0,java.math.RoundingMode p1){
return BigIntegerMath.log10(p0,p1);
}
public static java.math.BigInteger divide(java.math.BigInteger p0,java.math.BigInteger p1,java.math.RoundingMode p2){
return BigIntegerMath.divide(p0,p1,p2);
}
public static java.math.BigInteger binomial(int p0,int p1){
return BigIntegerMath.binomial(p0,p1);
}
public static java.math.BigInteger factorial(int p0){
return BigIntegerMath.factorial(p0);
}
public static int log2(java.math.BigInteger p0,java.math.RoundingMode p1){
return BigIntegerMath.log2(p0,p1);
}
public static boolean isPowerOfTwo(java.math.BigInteger p0){
return BigIntegerMath.isPowerOfTwo(p0);
}
public static java.math.BigInteger roundToBigInteger(double p0,java.math.RoundingMode p1){
return DoubleMath.roundToBigInteger(p0,p1);
}
public static com.google.common.primitives.UnsignedInteger valueOf(java.math.BigInteger p0){
return UnsignedInteger.valueOf(p0);
}
public static java.math.BigInteger sizeOfDirectoryAsBigInteger(java.io.File p0){
return FileUtils.sizeOfDirectoryAsBigInteger(p0);
}
public static java.math.BigInteger sizeOfAsBigInteger(java.io.File p0){
return FileUtils.sizeOfAsBigInteger(p0);
}
public static java.lang.String byteCountToDisplaySize(java.math.BigInteger p0){
return FileUtils.byteCountToDisplaySize(p0);
}
public static java.math.BigInteger createBigInteger(java.lang.String p0){
return NumberUtils.createBigInteger(p0);
}
public static java.math.BigInteger pow(java.math.BigInteger p0,int p1) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.pow(p0,p1);
}
public static java.math.BigInteger pow(java.math.BigInteger p0,long p1) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.pow(p0,p1);
}
public static java.math.BigInteger pow(java.math.BigInteger p0,java.math.BigInteger p1) throws org.apache.commons.math3.exception.NotPositiveException{
return ArithmeticUtils.pow(p0,p1);
}
}
