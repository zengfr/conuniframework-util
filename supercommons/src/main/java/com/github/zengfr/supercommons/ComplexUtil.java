package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComplexUtil{ 
/**
*public static org.apache.commons.math3.complex.Complex org.apache.commons.math3.complex.ComplexUtils.polar2Complex(double,double) throws org.apache.commons.math3.exception.MathIllegalArgumentException
*/ 
public static org.apache.commons.math3.complex.Complex polar2Complex(double p0,double p1) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.complex.ComplexUtils.polar2Complex(p0,p1);
}
/**
*public static org.apache.commons.math3.complex.Complex org.apache.commons.math3.complex.Complex.valueOf(double)
*/ 
public static org.apache.commons.math3.complex.Complex valueOf(double p0){
	return org.apache.commons.math3.complex.Complex.valueOf(p0);
}
/**
*public static org.apache.commons.math3.complex.Complex org.apache.commons.math3.complex.Complex.valueOf(double,double)
*/ 
public static org.apache.commons.math3.complex.Complex valueOf(double p0,double p1){
	return org.apache.commons.math3.complex.Complex.valueOf(p0,p1);
}
/**
*public static boolean org.apache.commons.math3.complex.Complex.equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex,org.apache.commons.math3.complex.Complex,double)
*/ 
public static boolean equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex p0,org.apache.commons.math3.complex.Complex p1,double p2){
	return org.apache.commons.math3.complex.Complex.equalsWithRelativeTolerance(p0,p1,p2);
}
}
