package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComplexArrayUtil{ 
/**
*public static org.apache.commons.math3.complex.Complex[] org.apache.commons.math3.complex.ComplexUtils.convertToComplex(double[])
*/ 
public static org.apache.commons.math3.complex.Complex[] convertToComplex(double[] p0){
	return org.apache.commons.math3.complex.ComplexUtils.convertToComplex(p0);
}
/**
*public static double[][] org.apache.commons.math3.transform.TransformUtils.createRealImaginaryArray(org.apache.commons.math3.complex.Complex[])
*/ 
public static double[][] createRealImaginaryArray(org.apache.commons.math3.complex.Complex[] p0){
	return org.apache.commons.math3.transform.TransformUtils.createRealImaginaryArray(p0);
}
/**
*public static org.apache.commons.math3.complex.Complex[] org.apache.commons.math3.transform.TransformUtils.createComplexArray(double[][]) throws org.apache.commons.math3.exception.DimensionMismatchException
*/ 
public static org.apache.commons.math3.complex.Complex[] createComplexArray(double[][] p0) throws org.apache.commons.math3.exception.DimensionMismatchException{
	return org.apache.commons.math3.transform.TransformUtils.createComplexArray(p0);
}
/**
*public static org.apache.commons.math3.complex.Complex[] org.apache.commons.math3.transform.TransformUtils.scaleArray(org.apache.commons.math3.complex.Complex[],double)
*/ 
public static org.apache.commons.math3.complex.Complex[] scaleArray(org.apache.commons.math3.complex.Complex[] p0,double p1){
	return org.apache.commons.math3.transform.TransformUtils.scaleArray(p0,p1);
}
}
